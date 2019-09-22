/*
 * Copyright (c) 2016-2019 ÉTS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */ 

package ca.ets.sofeess.breesse.engine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import com.mathworks.engine.MatlabEngine;

import ca.ets.sofeess.breesse.engine.types.Stateflow;

/**
 * @author Andrés Paz
 *
 */
public class CommandResultRetreiver {

	private MatlabEngineManager commandEvaluator;

	public CommandResultRetreiver(MatlabEngineManager commandEvaluator) {
		this.commandEvaluator = commandEvaluator;
	}

	public Map<String, Object> retrieveResult(String resultVariable) {
		return retrieveResult(resultVariable, 0, false);
	}

	public Map<String, Object> retrieveResultAtIndex(String resultVariable, int index) {
		return retrieveResult(resultVariable, index, false);
	}

	public Map<String, Object> retrieveStructResult(String resultVariable) {
		return retrieveResult(resultVariable, 0, true);
	}

	public Map<String, Object> retrieveStructResultAtIndex(String resultVariable, int index) {
		return retrieveResult(resultVariable, index, true);
	}

	private Map<String, Object> retrieveResult(String resultVariable, int index, boolean isStructResult) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (!resultVariable.equals("")) {
				File tmpOutputFile = File.createTempFile("output", null);

				Writer output = new PrintWriter(tmpOutputFile);
				String resultCommand = "disp(";
				if (isStructResult) {
					resultCommand += "struct(";
				}
				resultCommand += resultVariable;
				if (index > 0) {
					resultCommand += "(" + index + ")";
				}
				if (isStructResult) {
					resultCommand += ")";
				}
				resultCommand += ");";
				commandEvaluator.evaluateCommand(resultCommand, output, MatlabEngine.NULL_WRITER);
				output.flush();
				output.close();

				BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
				String line;
				int j = 0;
				while ((line = resultReader.readLine()) != null) {
					if (!line.contains(
							"Warning: The value of this parameter is only valid when the model is in a compiled state and is a top model.")) {
						if (!line.equals("")) {
							String[] entry = line.split(":", 2);
							if (entry.length == 2) {
								String specifier = entry[0].trim();
								if (specifier.startsWith("'")) {
									specifier = specifier.substring(1);
								}
								Object value;
								entry[1] = entry[1].trim();
								if (entry[1].startsWith("'") && entry[1].endsWith("'")) {
									value = entry[1].substring(1, entry[1].length() - 1);
								} else {
									if (entry[1].startsWith("[") && entry[1].endsWith("]") && !entry[1].contains("×")) {
										entry[1] = entry[1].substring(1, entry[1].length() - 1);
										if (!entry[1].equals("")) {
											String[] array = entry[1].split("\\s+");
											Double[] numberArray = new Double[array.length];
											for (int i = 0; i < array.length; i++) {
												numberArray[i] = Double.parseDouble(array[i]);
											}
											value = numberArray;
										} else {
											value = null;
										}
									} else {
										if (entry[1].startsWith("[") && entry[1].endsWith("]")
												&& entry[1].contains("×")) {
											value = entry[1].substring(1, entry[1].length() - 1);
										} else {
											if (entry[1].startsWith("{") && entry[1].endsWith("}")) {
												value = entry[1].substring(1, entry[1].length() - 1);
											} else {
												if (entry[1].contains("-by-")) {
													specifier = "Size";
													String[] dimensions = entry[1].split("-by-");
													if (dimensions[0].matches("-?\\d+(\\.\\d+)?")) {
														value = Double.valueOf(dimensions[0]);
													} else {
														value = dimensions;
													}
												} else {
													if (entry[1].endsWith("'")) {
														entry[1] = entry[1].substring(0, entry[1].lastIndexOf("'"));
													}
													if (entry[1].matches("-?\\d+(\\.\\d+)?")) {
														value = Double.valueOf(entry[1]);
													} else {
														value = entry[1];
													}
												}
											}
										}
									}
								}
								result.put(specifier, value);
							} else {
								entry[0] = entry[0].trim();
								if (entry[0].matches("[A-Za-z]+(\\s[A-Za-z]+)+")) {
									if (result.containsKey("1")) {
										result.put("1", result.get("1") + " " + entry[0]);
									} else {
										result.put("1", entry[0]);
									}
								} else {
									if (entry[0].matches("[A-Za-z]+")) {
										if (result.containsKey("1")) {
											result.put("1", result.get("1") + " " + entry[0]);
										} else {
											result.put("1", entry[0]);
										}
									} else {
										String[] values = entry[0].split("\\s+");
										int i = 0;
										String tempValue;
										for (; i < values.length; i++) {
											if (values[i].startsWith("[") && values[i].endsWith("]")) {
												tempValue = values[i].substring(1, values[i].length() - 1);
											} else {
												tempValue = values[i];
											}
											if (tempValue.matches("-?\\d+(\\.\\d+)?")) {
												result.put(j + (i + 1) + "", Double.parseDouble(tempValue));
											} else {
												String[] exponentValues = tempValue.split("e\\+", 2);
												if (exponentValues.length == 2) {
													double multiplier = Math.pow(10, Double.parseDouble(exponentValues[1]));
													double number = Double.parseDouble(exponentValues[0]);
													number *= multiplier;
													result.put(j + (i + 1) + "", number);
												} else {
													result.put(j + (i + 1) + "", tempValue);
												}
											}
										}
										j += i;
									}
								}
							}
						}
					}
				}
				resultReader.close();
				tmpOutputFile.delete();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, Object> retrieveStateLabelString(String resultVariable) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (!resultVariable.equals("")) {
				File tmpOutputFile = File.createTempFile("output", null);

				Writer output = new PrintWriter(tmpOutputFile);
				String resultCommand = "disp(" + resultVariable + ");";
				commandEvaluator.evaluateCommand(resultCommand, output, MatlabEngine.NULL_WRITER);
				output.flush();
				output.close();

				BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
				String line = resultReader.readLine();
				String specifier = null;
				while ((line = resultReader.readLine()) != null) {
					if (!line.equals("")) {
						String[] entry = line.split(":", 2);
						if (entry.length == 2) {
							specifier = entry[0].trim();
							if (specifier.contains("en")) {
								specifier = Stateflow.Action.ENTRY;
							} else {
								if (specifier.contains("du")) {
									specifier = Stateflow.Action.DURING;
								} else {
									if (specifier.contains("ex")) {
										specifier = Stateflow.Action.EXIT;
									}
								}
							}
							entry[1] = entry[1].trim();
							String[] values = entry[1].split(";");
							String[] statements = new String[values.length];
							for (int i = 0; i < values.length; i++) {
								statements[i] = values[i] + ";";
							}
							result.put(specifier, statements);
						} else {
							if (entry.length == 1) {
								entry[0] = entry[0].trim();
								String[] values = entry[0].split(";");
								String[] statements = (String[]) result.get(specifier);
								String[] newStatements = new String[statements.length + values.length];
								for (int i = 0; i < statements.length; i++) {
									newStatements[i] = statements[i];
								}
								for (int i = statements.length, j = 0; i < newStatements.length && j < values.length; i++, j++) {
									newStatements[i] = values[j] + ";";
								}
								result.put(specifier, newStatements);
							}
						}
					}
				}
				resultReader.close();
				tmpOutputFile.delete();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, Object> retrieveTransitionLabelString(String resultVariable) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (!resultVariable.equals("")) {
				File tmpOutputFile = File.createTempFile("output", null);

				Writer output = new PrintWriter(tmpOutputFile);
				String resultCommand = "disp(" + resultVariable + ");";
				commandEvaluator.evaluateCommand(resultCommand, output, MatlabEngine.NULL_WRITER);
				output.flush();
				output.close();

				BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
				String line = null;
				String guard = null;
				String trigger = null;
				boolean isFirstLineRead = true;
				boolean statementsContinue = false;
				boolean guardContinues = false;
				List<String> statements = new LinkedList<String>();
				while ((line = resultReader.readLine()) != null) {
					if (!line.equals("")) {
						line = line.trim();
						if (!line.startsWith("/*") && !line.endsWith("*/")) {
							String[] entry = line.split("/", 2);
							if (entry.length == 2) {
								if (!entry[0].isEmpty()) {
									if (entry[0].startsWith("[")) {
										guard = entry[0];
									} else {
										trigger = entry[0];
									}
								}
								if (entry[1].endsWith("...")) {
									entry[1] = entry[1].substring(0, entry[1].length() - 3);
									statementsContinue = true;
								}
								if (!entry[1].isEmpty()) {
									String[] stmts = entry[1].split(";");
									for (int i = 0; i < stmts.length; i++) {
										statements.add(stmts[i] + ";");
									}
								}
							} else {
								if (statementsContinue) {
									if (line.endsWith("...")) {
										String tmpStatement = entry[0].substring(0, entry[0].length() - 3);
										String[] stmts = tmpStatement.split(";");
										for (int i = 0; i < stmts.length; i++) {
											statements.add(stmts[i] + ";");
										}
									} else {
										if (line.endsWith("}")) {
											entry[0] = entry[0].substring(0, entry[0].length() - 1);
										}
										String[] stmts = entry[0].split(";");
										for (int i = 0; i < stmts.length; i++) {
											statements.add(stmts[i] + ";");
										}
										statementsContinue = false;
									}
								} else {
									if (line.startsWith("[") && line.endsWith("]") && isFirstLineRead) {
										guard = line;
									} else {
										if (line.startsWith("[") && line.endsWith("...")) {
											guard = line.substring(0, line.length() - 3);
											guardContinues = true;
										} else {
											if (guardContinues) {
												if (line.endsWith("...")) {
													guard += line.substring(0, line.length() - 3);
												} else {
													guard += line;
													guardContinues = false;
												}
											} else {
												if (!line.startsWith("{") && !line.endsWith(";") && isFirstLineRead) {
													trigger = line;
												} else {
													if (line.startsWith("{") && line.endsWith("}")) {
														line = line.substring(1, line.lastIndexOf("}"));
														String[] tmpStatements = line.split(";");
														for (int i = 0; i < tmpStatements.length; i++) {
															statements.add(tmpStatements[i] += ";");
														}
													} else {
														if (line.startsWith("{") && line.length() == 1 && isFirstLineRead) {
															statementsContinue = true;
														} else {
															if (line.startsWith("{") && (line.endsWith(";") || line.endsWith("..."))) {
																if (line.endsWith("...")) {
																	line = line.substring(0, line.length() - 3);
																}
																String tmpStatement = line.substring(1, line.length());
																String[] tmpStatements = tmpStatement.split(";");
																for (int i = 0; i < tmpStatements.length; i++) {
																	statements.add(tmpStatements[i] += ";");
																}
																statementsContinue = true;
															}
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					isFirstLineRead = false;
				}
				result.put(Stateflow.Action.TRIGGER, trigger);
				result.put(Stateflow.Action.GUARD, guard);
				result.put(Stateflow.Action.TRIGGERED, statements);
				resultReader.close();
				tmpOutputFile.delete();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, Object> retrieveCellValue(String cellArrayVariable, int row, int column) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (!cellArrayVariable.equals("")) {
				File tmpOutputFile = File.createTempFile("output", null);

				Writer output = new PrintWriter(tmpOutputFile);
				String resultCommand = "disp(" + cellArrayVariable + "(" + row + "," + column + ")" + ");";
				commandEvaluator.evaluateCommand(resultCommand, output, MatlabEngine.NULL_WRITER);
				output.flush();
				output.close();

				BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
				String line = resultReader.readLine();
				line = line.trim();
				if (!line.equals("")) {
					String specifier = "1";
					if (line.startsWith("'") && line.endsWith("'")) {
						line = line.substring(1, line.lastIndexOf("'"));
					}
					result.put(specifier, line);
				}
				resultReader.close();
				tmpOutputFile.delete();
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

	public Map<String, Object> retrieveCellArray(String cellArrayVariable, int numel) {
		Map<String, Object> result = new HashMap<String, Object>();
		try {
			if (!cellArrayVariable.equals("")) {
				String cellDataCommand = "[";

				for (int i = 1; i <= numel; i++) {
					cellDataCommand += "r" + i + ",";
				}
				cellDataCommand = cellDataCommand.substring(0, cellDataCommand.length() - 1);
				cellDataCommand += "]=" + cellArrayVariable + "{:};";
				commandEvaluator.evaluateCommand(cellDataCommand, MatlabEngine.NULL_WRITER, MatlabEngine.NULL_WRITER);

				for (int i = 1; i <= numel; i++) {
					File tmpOutputFile = File.createTempFile("output", null);

					Writer output = new PrintWriter(tmpOutputFile);
					String resultCommand = "disp(r" + i + ");";
					commandEvaluator.evaluateCommand(resultCommand, output, MatlabEngine.NULL_WRITER);
					output.flush();
					output.close();

					BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
					String line;
					String cellValue = "";
					while ((line = resultReader.readLine()) != null) {
						line = line.trim();
						if (!line.equals("")) {
							cellValue += line + "\n";
						}
					}
					cellValue = cellValue.trim();
					resultReader.close();
					tmpOutputFile.delete();
					result.put(i + "", cellValue);
				}
			}
		} catch (NumberFormatException | IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return result;
	}

}
