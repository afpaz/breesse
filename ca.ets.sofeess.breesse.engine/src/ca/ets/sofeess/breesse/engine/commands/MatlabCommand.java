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

package ca.ets.sofeess.breesse.engine.commands;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.Writer;
import java.util.LinkedList;
import java.util.List;
import com.mathworks.engine.MatlabEngine;

import ca.ets.sofeess.breesse.engine.MatlabEngineManager;

/**
 * @author Andrés Paz
 *
 */
public abstract class MatlabCommand {

	private String invocationTarget;
	private String command;
	private List<String> params;
	private String resultVariable;
	private MatlabEngineManager commandEvaluator;
	
	private String output;
	
	protected MatlabCommand(String command, MatlabEngineManager commandEvaluator) {
		this.invocationTarget = "";
		this.command = command;
		this.params = new LinkedList<String>();
		this.resultVariable = "";
		this.commandEvaluator = commandEvaluator;
		this.output = "";
	}

	@SuppressWarnings("unchecked")
	public <T extends MatlabCommand> T setInvocationTarget(String objectName) {
		this.invocationTarget = objectName;
		return (T) this;
	}
	
	@SuppressWarnings("unchecked")
	public <T extends MatlabCommand> T setInvocationTargetIndex(int index) {
		this.invocationTarget += "(" + index + ")";
		return (T) this;
	}

	public String getResultVariable() {
		return this.resultVariable;
	}

	@SuppressWarnings("unchecked")
	public <T extends MatlabCommand> T saveInto(String resultVariable) {
		this.resultVariable = resultVariable;
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public <T extends MatlabCommand> T addParam(String param) {
		this.params.add(param);
		return (T) this;
	}

	@SuppressWarnings("unchecked")
	public <T extends MatlabCommand> T addStringParam(String param) {
		this.params.add("'" + param + "'");
		return (T) this;
	}

	protected MatlabEngineManager getCommandEvaluator() {
		return this.commandEvaluator;
	}
	
	public String getOutput() {
		return this.output;
	}

	public void execute() {
		String executableCommand = "";
		if (!resultVariable.equals("")) {
			executableCommand += resultVariable + "=";
		}
		if (!invocationTarget.equals("")) {
			executableCommand += invocationTarget + ".";
		}
		executableCommand += command;
		if (!params.isEmpty()) {
			executableCommand += "(";
			for (String param : params) {
				executableCommand += param + ",";
			}
			executableCommand = executableCommand.replaceAll(",$", "");
			executableCommand += ")";
		}
		executableCommand += ";";
		
		try {
			File tmpOutputFile = File.createTempFile(command + "_output", null);
			Writer outputWriter = new PrintWriter(tmpOutputFile);
			
			commandEvaluator.evaluateCommand(executableCommand, outputWriter, MatlabEngine.NULL_WRITER);
			
			outputWriter.flush();
			outputWriter.close();
			
			BufferedReader resultReader = new BufferedReader(new FileReader(tmpOutputFile));
			
			String line;
			while ((line = resultReader.readLine()) != null) {
				output += line;
			}
			
			resultReader.close();
			
			tmpOutputFile.delete();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
	
}
