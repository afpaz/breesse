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

/**
 * @author: Andrés Paz
 */

package ca.ets.sofeess.breesse.importer.api;

import java.io.File;
import java.io.IOException;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.eclipse.emf.ecore.xmi.XMIResource;
import org.eclipse.emf.ecore.xmi.impl.XMIResourceFactoryImpl;

import ca.ets.sofeess.breesse.engine.CommandResultRetreiver;
import ca.ets.sofeess.breesse.engine.MatlabEngineCommandFactory;
import ca.ets.sofeess.breesse.engine.MatlabEngineManager;
import ca.ets.sofeess.breesse.engine.commands.MatlabCommand;
import ca.ets.sofeess.breesse.engine.types.Simulink;
import ca.ets.sofeess.breesse.engine.types.Stateflow;
import ca.ets.sofeess.breesse.simulink.Action;
import ca.ets.sofeess.breesse.simulink.ActionEntry;
import ca.ets.sofeess.breesse.simulink.ActionTable;
import ca.ets.sofeess.breesse.simulink.Block;
import ca.ets.sofeess.breesse.simulink.BlockReference;
import ca.ets.sofeess.breesse.simulink.Chart;
import ca.ets.sofeess.breesse.simulink.CompositeStateflowElement;
import ca.ets.sofeess.breesse.simulink.Condition;
import ca.ets.sofeess.breesse.simulink.ConditionTable;
import ca.ets.sofeess.breesse.simulink.Connection;
import ca.ets.sofeess.breesse.simulink.ContainableTruthTable;
import ca.ets.sofeess.breesse.simulink.Data;
import ca.ets.sofeess.breesse.simulink.Decision;
import ca.ets.sofeess.breesse.simulink.DecisionEntry;
import ca.ets.sofeess.breesse.simulink.DecompositionType;
import ca.ets.sofeess.breesse.simulink.Function;
import ca.ets.sofeess.breesse.simulink.InPort;
import ca.ets.sofeess.breesse.simulink.InPortBlock;
import ca.ets.sofeess.breesse.simulink.InputData;
import ca.ets.sofeess.breesse.simulink.Junction;
import ca.ets.sofeess.breesse.simulink.LocalData;
import ca.ets.sofeess.breesse.simulink.ModelReference;
import ca.ets.sofeess.breesse.simulink.OutPort;
import ca.ets.sofeess.breesse.simulink.OutPortBlock;
import ca.ets.sofeess.breesse.simulink.OutputData;
import ca.ets.sofeess.breesse.simulink.Port;
import ca.ets.sofeess.breesse.simulink.PortBlock;
import ca.ets.sofeess.breesse.simulink.SFWTrigger;
import ca.ets.sofeess.breesse.simulink.SimulinkFactory;
import ca.ets.sofeess.breesse.simulink.SimulinkModel;
import ca.ets.sofeess.breesse.simulink.State;
import ca.ets.sofeess.breesse.simulink.SubSystem;
import ca.ets.sofeess.breesse.simulink.Transition;
import ca.ets.sofeess.breesse.simulink.TruthTable;
import ca.ets.sofeess.breesse.simulink.TruthTableChart;
import ca.ets.sofeess.breesse.simulink.Vertex;

public class BreesseImporter {

	private MatlabEngineManager matlabEngineManager;
	private MatlabEngineCommandFactory commandFactory;
	private CommandResultRetreiver resultRetreiver;
	
	public BreesseImporter() {
		this.matlabEngineManager = new MatlabEngineManager();
		this.commandFactory = new MatlabEngineCommandFactory(matlabEngineManager);
		this.resultRetreiver = new CommandResultRetreiver(matlabEngineManager);
	}

	public Object[] importModel(String pathToSimulinkModel) throws IOException {
		this.matlabEngineManager.startMatlab();
		
		MatlabCommand clear = commandFactory.clear();
		clear.execute();
		
		MatlabCommand loadSystem = commandFactory.loadSystem(pathToSimulinkModel).saveInto("system");
		loadSystem.execute();
		
		String loadSystemOutput = loadSystem.getOutput();
		
		String libraryModelName = null;
		if (loadSystemOutput.contains("Warning: Unable to load block diagram")) {
			int firstIndex = loadSystemOutput.indexOf("'") + 1;
			int nextIndex = loadSystemOutput.indexOf("'", firstIndex);
			libraryModelName = loadSystemOutput.substring(firstIndex, nextIndex);
		}
		
		MatlabCommand systemNameParam = commandFactory.getParam().addParam(loadSystem.getResultVariable()).addStringParam("Name").saveInto("systemName");
		systemNameParam.execute();
		String systemName = (String) resultRetreiver.retrieveResult(systemNameParam.getResultVariable()).get("1");
		
		SimulinkModel model = SimulinkFactory.eINSTANCE.createSimulinkModel();
		model.setFile(pathToSimulinkModel);
		model.setName(systemName);
		
		MatlabCommand sfroot = commandFactory.sfroot().saveInto("rt");
		sfroot.execute();
		
		MatlabCommand simulinkModel = commandFactory.find().in(sfroot.getResultVariable()).a(Simulink.BLOCK_DIAGRAM).and().byName(model.getName()).saveInto("simulinkModel");
		simulinkModel.execute();
		
		Collection<Block> stateflowCharts = createStateflowCharts(simulinkModel.getResultVariable(), "charts", "chartsSize");
		
		MatlabCommand allTruthTableChartsInModel = commandFactory.find().in(simulinkModel.getResultVariable()).a(Stateflow.TRUTH_TABLE_CHART).saveInto("truthTableCharts");
		allTruthTableChartsInModel.execute();
		
		MatlabCommand truthTableChartsNumel = commandFactory.numel(allTruthTableChartsInModel.getResultVariable());
		truthTableChartsNumel.execute();
		int truthTableChartsNumelValue = ((Double) resultRetreiver.retrieveResult(truthTableChartsNumel.getResultVariable()).get("1")).intValue();
		
		for (int truthTableChartIndex = 1; truthTableChartIndex <= truthTableChartsNumelValue; truthTableChartIndex++) {
			TruthTableChart truthTableChart = createTruthTableChart(allTruthTableChartsInModel.getResultVariable(), truthTableChartIndex);
			stateflowCharts.add(truthTableChart);
		}
		
		LinkedList<BlockReference> blockReferenceQueue = new LinkedList<BlockReference>();
		LinkedList<ModelReference> modelReferenceQueue = new LinkedList<ModelReference>();

		MatlabCommand allBlocksInModel = commandFactory.findBlocks().in(loadSystem.getResultVariable()).saveInto("blocks");
		allBlocksInModel.execute();
		
		Collection<Block> blocksInModel = createSimulinkBlocks(systemName, stateflowCharts, allBlocksInModel.getResultVariable(), model, blockReferenceQueue, modelReferenceQueue);
		model.getSubBlocks().addAll(blocksInModel);
		
		String folderPath = pathToSimulinkModel.substring(0, pathToSimulinkModel.lastIndexOf("/") + 1);
		
		Collection<Block> blocks1 = new LinkedList<Block>();
		Collection<Block> blocks2 = new LinkedList<Block>();
		for (TreeIterator<EObject> iterator = model.eAllContents(); iterator.hasNext();) {
			EObject element = iterator.next();
			if (element instanceof Block) {
				Block block = (Block) element;
				blocks1.add(block);
				blocks2.add(block);
			}
		}
		connectSimulinkBlocks(blocks1, blocks2);

		Boolean allReferenceModelsImported = importReferencedModels(folderPath, modelReferenceQueue);
//		Boolean allReferenceBlocksImported = importReferencedBlocks(folderPath, blockReferenceQueue);
		
		Object[] result = new Object[] { model, libraryModelName, allReferenceModelsImported/*, allReferenceBlocksImported*/ };
		
		return result;
	}

	private Collection<Block> createSimulinkBlocks(String modelName, Collection<Block> stateflowCharts, String allBlocksInModel, SubSystem parentSubsystem, LinkedList<BlockReference> blockReferenceQueue, LinkedList<ModelReference> modelReferenceQueue) {
		MatlabCommand allBlocksInModelSize = commandFactory.size(allBlocksInModel).saveInto(allBlocksInModel + "Size");
		allBlocksInModelSize.execute();
		int blocksSizeValue = ((Double) resultRetreiver.retrieveResult(allBlocksInModelSize.getResultVariable()).get("1")).intValue();
		
		Collection<Block> blocksInModel = new LinkedList<Block>();
		Map<String, Block> blocks = new HashMap<String, Block>();
		
		for (int blockIndex = 1; blockIndex <= blocksSizeValue; blockIndex++) {
			Block block = createBlock(allBlocksInModel, blockIndex, stateflowCharts);
			if (block instanceof BlockReference) {
				blockReferenceQueue.add((BlockReference) block);
			}
			if (block instanceof ModelReference) {
				modelReferenceQueue.add((ModelReference) block);
			}
			blocks.put(blockIndex + "", block);
		}
		
		for (Entry<String, Block> blockEntry : blocks.entrySet()) {
			String parentName = findBlockParent(allBlocksInModel, Integer.parseInt(blockEntry.getKey()));
			
			if (!parentName.equals(modelName)) {
				setBlockParent(blockEntry.getValue(), parentName, blocks.values());
			} else {
				Block block = blockEntry.getValue();
				blocksInModel.add(block);
				
				if (block instanceof PortBlock) {
					parentSubsystem.getOwnedPorts().add(((PortBlock) block).getPort());
				}
			}
		}
		
		return blocksInModel;
	}
	
	private Block createBlock(String blocks, int blockIndex, Collection<Block> stateflowCharts) {
		MatlabCommand blockTypeParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("BlockType").saveInto("blockType");
		blockTypeParam.execute();
		String blockType = (String) resultRetreiver.retrieveResult(blockTypeParam.getResultVariable()).get("1");
		
		MatlabCommand nameParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("Name").saveInto("blockName");
		nameParam.execute();
		String blockName = (String) resultRetreiver.retrieveResult(nameParam.getResultVariable()).get("1");
		
		Block block = null;
		
		boolean isStateflowChart = false;
		if (stateflowCharts != null) {
			for (Iterator<Block> iterator = stateflowCharts.iterator(); iterator.hasNext() && !isStateflowChart;) {
				Block stateflowChart = (Block) iterator.next();
				if (stateflowChart.getName().equals(blockName)) {
					isStateflowChart = true;
					block = stateflowChart;
				}
			}
		}
		if (!isStateflowChart) {
			switch (blockType) {
			case "SubSystem":
				block = SimulinkFactory.eINSTANCE.createSubSystem();
				break;
			
			case "Inport":
				MatlabCommand portNumberParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("Port").saveInto("portNumber");
				portNumberParam.execute();
				int portNumber = ((Double) resultRetreiver.retrieveResult(portNumberParam.getResultVariable()).get("1")).intValue();

				MatlabCommand dataTypeParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("OutDataTypeStr").saveInto("dataType");
				dataTypeParam.execute();
				Map<String, Object> dataTypeParamResult = resultRetreiver.retrieveResult(dataTypeParam.getResultVariable());
				String dataType = (String) dataTypeParamResult.get(dataTypeParamResult.keySet().toArray()[0]);
				
				block = SimulinkFactory.eINSTANCE.createInPortBlock();
				((InPortBlock) block).setPortNumber(portNumber);
				
				InPort inPort = SimulinkFactory.eINSTANCE.createInPort();
				inPort.setName(blockName);
				inPort.setPortNumber(portNumber);
				inPort.setDataType(dataType);
				inPort.setPortBlock((InPortBlock) block);
				
				OutPort inPortBlockOutput = SimulinkFactory.eINSTANCE.createOutPort();
				inPortBlockOutput.setName(blockName);
				inPortBlockOutput.setPortNumber(1);
				inPortBlockOutput.setDataType(dataType);
				inPortBlockOutput.setBlock(block);
				block.getOwnedPorts().add(inPortBlockOutput);
				
				break;
				
			case "Outport":
				portNumberParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("Port").saveInto("portNumber");
				portNumberParam.execute();
				portNumber = ((Double) resultRetreiver.retrieveResult(portNumberParam.getResultVariable()).get("1")).intValue();

				dataTypeParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("OutDataTypeStr").saveInto("dataType");
				dataTypeParam.execute();
				dataTypeParamResult = resultRetreiver.retrieveResult(dataTypeParam.getResultVariable());
				dataType = (String) dataTypeParamResult.get(dataTypeParamResult.keySet().toArray()[0]);
				
				block = SimulinkFactory.eINSTANCE.createOutPortBlock();
				((OutPortBlock) block).setPortNumber(portNumber);
				
				OutPort outPort = SimulinkFactory.eINSTANCE.createOutPort();
				outPort.setName(blockName);
				outPort.setPortNumber(portNumber);
				outPort.setDataType(dataType);
				outPort.setPortBlock((OutPortBlock) block);
				
				InPort outPortBlockInput = SimulinkFactory.eINSTANCE.createInPort();
				outPortBlockInput.setName(blockName);
				outPortBlockInput.setPortNumber(1);
				outPortBlockInput.setDataType(dataType);
				outPortBlockInput.setBlock(block);
				block.getOwnedPorts().add(outPortBlockInput);
				
				break;
				
			case "Reference":
				block = SimulinkFactory.eINSTANCE.createBlockReference();
				
				createBlockPorts(blocks, blockIndex, block);
				break;
				
			case "ModelReference":
				MatlabCommand modelNameParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("ModelName").saveInto("modelName");
				modelNameParam.execute();
				Map<String, Object> modelNameParamResult = resultRetreiver.retrieveResult(modelNameParam.getResultVariable());
				String modelName = (String) modelNameParamResult.get(modelNameParamResult.keySet().toArray()[0]);

				block = SimulinkFactory.eINSTANCE.createModelReference();
				ModelReference modelReference = (ModelReference) block;
				modelReference.setModelName(modelName);

				createBlockPorts(blocks, blockIndex, block);
				break;

			default:
				block = SimulinkFactory.eINSTANCE.createBlock();
				createBlockPorts(blocks, blockIndex, block);
				break;
			}
			
			block.setName(blockName);
		}
		block.setHandle(blocks + "(" + blockIndex + ")");
		
		// TODO Handle library references in Stateflow
		return block;
	}

	private void createBlockPorts(String blocks, int blockIndex, Block block) {
		MatlabCommand blockPorts = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("PortHandles").saveInto("blockPorts");
		blockPorts.execute();

		MatlabCommand inportHandles = commandFactory.getField().addParam(blockPorts.getResultVariable()).addStringParam("Inport").saveInto("blockInportHandles");
		inportHandles.execute();

		MatlabCommand inportHandlesSizeCommand = commandFactory.size(inportHandles.getResultVariable()).saveInto("inportHandlesSize");
		inportHandlesSizeCommand.execute();
		int inportHandlesSize = ((Double) resultRetreiver.retrieveResult(inportHandlesSizeCommand.getResultVariable()).get("2")).intValue();

		for (int inportIndex = 1; inportIndex <= inportHandlesSize; inportIndex++) {
			String inportHandleVariable = (inportHandlesSize > 1) ? inportHandles.getResultVariable() + "(" + inportIndex + ")" : inportHandles.getResultVariable();
			
			double inportHandle = ((Double) resultRetreiver.retrieveResult(inportHandleVariable).get("1")).doubleValue();

			MatlabCommand portNumberCommand = commandFactory.getParam().addParam(inportHandleVariable).addStringParam("PortNumber").saveInto("portNumber" + inportIndex);
			portNumberCommand.execute();
			int inportNumber = ((Double) resultRetreiver.retrieveResult(portNumberCommand.getResultVariable()).get("1")).intValue();
			
			InPort blockInport = SimulinkFactory.eINSTANCE.createInPort();
			blockInport.setHandle(inportHandle + "");
			blockInport.setName(inportNumber + "");
			blockInport.setPortNumber(inportNumber);
			blockInport.setDataType("Inherit");
			blockInport.setBlock(block);
			block.getOwnedPorts().add(blockInport);
		}
		
		MatlabCommand outportHandles = commandFactory.getField().addParam(blockPorts.getResultVariable()).addStringParam("Outport").saveInto("blockOutportHandles");
		outportHandles.execute();

		MatlabCommand outportHandlesSizeCommand = commandFactory.size(outportHandles.getResultVariable()).saveInto("outportHandlesSize");
		outportHandlesSizeCommand.execute();
		int outportHandlesSize = ((Double) resultRetreiver.retrieveResult(outportHandlesSizeCommand.getResultVariable()).get("2")).intValue();
		
		for (int outportIndex = 1; outportIndex <= outportHandlesSize; outportIndex++) {
			String outportHandleVariable = (outportHandlesSize > 1) ? outportHandles.getResultVariable() + "(" + outportIndex + ")" : outportHandles.getResultVariable();
			
			double outportHandle = ((Double) resultRetreiver.retrieveResult(outportHandleVariable).get("1")).doubleValue();
			
			MatlabCommand outportNumberCommand = commandFactory.getParam().addParam(outportHandleVariable).addStringParam("PortNumber").saveInto("outportNumber" + outportIndex);
			outportNumberCommand.execute();
			int outportNumber = ((Double) resultRetreiver.retrieveResult(outportNumberCommand.getResultVariable()).get("1")).intValue();
			
			OutPort blockOutport = SimulinkFactory.eINSTANCE.createOutPort();
			blockOutport.setHandle(outportHandle + "");
			blockOutport.setName(outportNumber + "");
			blockOutport.setPortNumber(outportNumber);
			blockOutport.setDataType("auto");
			blockOutport.setBlock(block);
			block.getOwnedPorts().add(blockOutport);
		}
	}
	
	private String findBlockParent(String blocks, int blockIndex) {
		MatlabCommand parentParam = commandFactory.getParam().addParam(blocks + "(" + blockIndex + ")").addStringParam("Parent").saveInto("blockParent");
		parentParam.execute();
		String parentFQN = (String) resultRetreiver.retrieveResult(parentParam.getResultVariable()).get("1");
		return parentFQN.substring(parentFQN.lastIndexOf("/") + 1);
	}
	
	private void setBlockParent(Block block, String parentName, Collection<Block> blocks) {
		boolean parentFound = false;
		for (Iterator<Block> iterator = blocks.iterator(); iterator.hasNext() && !parentFound;) {
			Block b = (Block) iterator.next();
			if (!b.equals(block)) {
				if (b instanceof SubSystem) {
					SubSystem parentBlock = (SubSystem) b;
					if (parentName.equals(parentBlock.getName())) {
						block.setParent(parentBlock);
						parentBlock.getSubBlocks().add(block);
						parentFound = true;
						
						if (block instanceof PortBlock) {
							parentBlock.getOwnedPorts().add(((PortBlock) block).getPort());
							((PortBlock) block).getPort().setBlock(parentBlock);
						}
					}
				}
			}
		}
	}

	private boolean importReferencedModels(String folderPath, LinkedList<ModelReference> modelReferenceQueue) {
		List<ModelReference> imported = new LinkedList<ModelReference>();
		List<SimulinkModel> importedModelReferences = new LinkedList<SimulinkModel>();
		int i = 1;
		for (ModelReference modelReferenceBlock : modelReferenceQueue) {
			String modelFilePath = folderPath + modelReferenceBlock.getModelName() + ".slx";
			File f = new File(modelFilePath);
			if(f.exists() && !f.isDirectory()) {
				boolean modelReferenceAlreadyImported = false;
				SimulinkModel modelReference = null;
				if (!importedModelReferences.isEmpty()) {
					for (Iterator<SimulinkModel> iterator = importedModelReferences.iterator(); iterator.hasNext() && !modelReferenceAlreadyImported;) {
						SimulinkModel simulinkModel = iterator.next();
						if (simulinkModel.getName().equals(modelReferenceBlock.getModelName())) {
							modelReference = simulinkModel;
							modelReferenceAlreadyImported = true;
						}
					}
				} 
				if (importedModelReferences.isEmpty() || !modelReferenceAlreadyImported) {
					modelReference = SimulinkFactory.eINSTANCE.createSimulinkModel();
					modelReference.setFile(modelFilePath);
					modelReference.setName(modelReferenceBlock.getModelName());

					MatlabCommand loadModelReference = commandFactory.loadSystem(modelFilePath).saveInto("modelReference" + i);
					loadModelReference.execute();

					LinkedList<BlockReference> blockReferenceQueue2 = new LinkedList<BlockReference>();
					LinkedList<ModelReference> modelReferenceQueue2 = new LinkedList<ModelReference>();

					MatlabCommand allBlocksInModelReference = commandFactory.findBlocks().in(loadModelReference.getResultVariable()).saveInto("modelReferenceBlocks" + i);
					allBlocksInModelReference.execute();
					
					Collection<Block> blocksInModelReference = createSimulinkBlocks(modelReference.getName(), null, allBlocksInModelReference.getResultVariable(), modelReference, blockReferenceQueue2, modelReferenceQueue2);
					modelReference.getSubBlocks().addAll(blocksInModelReference);
					
					findReferenceSourceBlocks(blocksInModelReference, blockReferenceQueue2);
					
					Collection<Block> blocksInModelReference2 = new LinkedList<Block>();
					blocksInModelReference2.addAll(blocksInModelReference);
					
					connectSimulinkBlocks(blocksInModelReference, blocksInModelReference2);
					
					modelReferenceBlock.getParent().getSubBlocks().add(modelReference);
					
					importedModelReferences.add(modelReference);
					
					importReferencedModels(folderPath, modelReferenceQueue2);
//					importReferencedBlocks(folderPath, blockReferenceQueue2);
				}
				modelReferenceBlock.setSourceBlock(modelReference);
				
				imported.add(modelReferenceBlock);
				
				i++;
			}
		}
		modelReferenceQueue.removeAll(imported);
		
		return modelReferenceQueue.isEmpty();
	}

	// TODO Review: Handle blocks with masks 
	private boolean importReferencedBlocks(String folderPath, LinkedList<BlockReference> blockReferenceQueue) {
		List<BlockReference> imported = new LinkedList<BlockReference>();
		List<SimulinkModel> importedBlockReferences = new LinkedList<SimulinkModel>();
		int i = 1;
		for (BlockReference blockReference : blockReferenceQueue) {
			MatlabCommand sourceBlockCommand = commandFactory.getParam().addParam(blockReference.getHandle()).addStringParam("SourceBlock").saveInto("sourceBlock" + i);
			sourceBlockCommand.execute();
			// TODO Change
			String modelName = (String) resultRetreiver.retrieveResult(sourceBlockCommand.getResultVariable()).get("1");
			
			String modelFilePath = folderPath + modelName + ".slx";
			File f = new File(modelFilePath);
			if(f.exists() && !f.isDirectory()) {
				boolean modelReferenceAlreadyImported = false;
				SimulinkModel modelReference = null;
				if (!importedBlockReferences.isEmpty()) {
					for (Iterator<SimulinkModel> iterator = importedBlockReferences.iterator(); iterator.hasNext() && !modelReferenceAlreadyImported;) {
						SimulinkModel simulinkModel = iterator.next();
						if (simulinkModel.getName().equals(modelName)) {
							modelReference = simulinkModel;
							modelReferenceAlreadyImported = true;
						}
					}
				} 
				if (importedBlockReferences.isEmpty() || !modelReferenceAlreadyImported) {
					modelReference = SimulinkFactory.eINSTANCE.createSimulinkModel();
					modelReference.setFile(modelFilePath);
					modelReference.setName(modelName);

					MatlabCommand loadModelReference = commandFactory.loadSystem(modelFilePath).saveInto("blockReference" + i);
					loadModelReference.execute();

					LinkedList<BlockReference> blockReferenceQueue2 = new LinkedList<BlockReference>();
					LinkedList<ModelReference> modelReferenceQueue2 = new LinkedList<ModelReference>();

					MatlabCommand allBlocksInModelReference = commandFactory.findBlocks().in(loadModelReference.getResultVariable()).saveInto("blockReferenceBlocks" + i);
					allBlocksInModelReference.execute();
					
					Collection<Block> blocksInModelReference = createSimulinkBlocks(modelReference.getName(), null, allBlocksInModelReference.getResultVariable(), modelReference, blockReferenceQueue2, modelReferenceQueue2);
					modelReference.getSubBlocks().addAll(blocksInModelReference);
					
					findReferenceSourceBlocks(blocksInModelReference, blockReferenceQueue2);
					
					Collection<Block> blocksInModelReference2 = new LinkedList<Block>();
					blocksInModelReference2.addAll(blocksInModelReference);
					
					connectSimulinkBlocks(blocksInModelReference, blocksInModelReference2);
					
					blockReference.getParent().getSubBlocks().add(modelReference);
					
					importedBlockReferences.add(modelReference);
					
					importReferencedModels(folderPath, modelReferenceQueue2);
					importReferencedBlocks(folderPath, blockReferenceQueue2);
				}
				// TODO Change
				String sourceBlockName = (String) resultRetreiver.retrieveResult(sourceBlockCommand.getResultVariable()).get("2");
				
				Block sourceBlock = null;
				boolean sourceBlockFound = false;
				for (TreeIterator<EObject> iterator = modelReference.eAllContents(); iterator.hasNext() && !sourceBlockFound;) {
					EObject element = iterator.next();
					if (element instanceof Block) {
						Block block = (Block) element;
						if (block.getName().equals(sourceBlockName)) {
							sourceBlock = block;
							sourceBlockFound = true;
						}
					}
				}
				
				blockReference.setSourceBlock(sourceBlock);
				
				imported.add(blockReference);
				
				i++;
			}
		}
		blockReferenceQueue.removeAll(imported);
		
		return blockReferenceQueue.isEmpty();
	}

	private void connectSimulinkBlocks(Collection<Block> sourceBlocks, Collection<Block> destinationBlocks) {
		int i = 1;
		for (Iterator<Block> sourceBlocksIterator = sourceBlocks.iterator(); sourceBlocksIterator.hasNext();) {
			Block sourceBlock = (Block) sourceBlocksIterator.next();
			
			SubSystem parentBlock = sourceBlock.getParent();
			
			String sourceBlockHandle = sourceBlock.getHandle();

			MatlabCommand sourceBlockLineHandles = commandFactory.getParam().addParam(sourceBlockHandle).addStringParam("LineHandles").saveInto("sourceBlockLineHandles" + i);
			sourceBlockLineHandles.execute();
			
			MatlabCommand outportLineHandles = commandFactory.getField().addParam(sourceBlockLineHandles.getResultVariable()).addStringParam("Outport").saveInto("outportLineHandles" + i);
			outportLineHandles.execute();

			MatlabCommand outportLineHandlesSizeCommand = commandFactory.size(outportLineHandles.getResultVariable()).saveInto("outportLineHandlesSize" + i);
			outportLineHandlesSizeCommand.execute();
			int outportLineHandlesSize = ((Double) resultRetreiver.retrieveResult(outportLineHandlesSizeCommand.getResultVariable()).get("2")).intValue();
			
			for (int outportLineHandleIndex = 1; outportLineHandleIndex <= outportLineHandlesSize; outportLineHandleIndex++) {
				String outportLineHandlesVariable = (outportLineHandlesSize > 1) ? outportLineHandles.getResultVariable() + "(" + outportLineHandleIndex + ")" : outportLineHandles.getResultVariable();
				
				double outportLineHandle = ((Double) resultRetreiver.retrieveResult(outportLineHandlesVariable).get("1")).doubleValue();
				
				if (outportLineHandle > 0) {
					MatlabCommand sourcePortHandleCommand = commandFactory.getParam().addParam(outportLineHandlesVariable).addStringParam("SrcPortHandle").saveInto("sourcePort" + i + outportLineHandleIndex);
					sourcePortHandleCommand.execute();
					double sourcePortHandle = ((Double) resultRetreiver.retrieveResult(sourcePortHandleCommand.getResultVariable()).get("1")).doubleValue();

					OutPort sourcePort = null;
					boolean sourcePortFound = false;
					if (sourcePortHandle > 0) {
						MatlabCommand sourcePortNumberCommand = commandFactory.getParam().addParam(sourcePortHandleCommand.getResultVariable()).addStringParam("PortNumber").saveInto("sourcePortNumber" + i + outportLineHandleIndex);
						sourcePortNumberCommand.execute();
						int sourcePortNumber = ((Double) resultRetreiver.retrieveResult(sourcePortNumberCommand.getResultVariable()).get("1")).intValue();
						
						for (Iterator<Port> portsIterator = sourceBlock.getOwnedPorts().iterator(); portsIterator.hasNext() && !sourcePortFound;) {
							Port port = (Port) portsIterator.next();
							if (port instanceof OutPort) {
								if (port.getHandle() != null) {
									if (sourcePortHandle == Double.parseDouble(port.getHandle())) {
										sourcePort = (OutPort) port;
										sourcePortFound = true;
									}
								} else {
									if (sourcePortNumber == port.getPortNumber()) {
										sourcePort = (OutPort) port;
										sourcePortFound = true;
									}
								}
							}
						}
					}
					
					MatlabCommand destinationBlockHandles = commandFactory.getParam().addParam(outportLineHandlesVariable).addStringParam("DstBlockHandle").saveInto("destinationBlocks" + i + outportLineHandleIndex);
					destinationBlockHandles.execute();
					
					MatlabCommand destinationPortHandles = commandFactory.getParam().addParam(outportLineHandlesVariable).addStringParam("DstPortHandle").saveInto("destinationPorts" + i + outportLineHandleIndex);
					destinationPortHandles.execute();
					
					MatlabCommand destinationPortNumbers = commandFactory.getParam().addParam(destinationPortHandles.getResultVariable()).addStringParam("PortNumber").saveInto("destinationPortNumbers" + i + outportLineHandleIndex);
					destinationPortNumbers.execute();

					MatlabCommand destinationBlockHandlesSizeCommand = commandFactory.size(destinationBlockHandles.getResultVariable()).saveInto("destinationBlockHandlesSize" + i + outportLineHandleIndex);
					destinationBlockHandlesSizeCommand.execute();
					int destinationBlockHandlesSize = ((Double) resultRetreiver.retrieveResult(destinationBlockHandlesSizeCommand.getResultVariable()).get("1")).intValue();

					for (int destinationBlockIndex = 1; destinationBlockIndex <= destinationBlockHandlesSize; destinationBlockIndex++) {
						String destinationBlockHandlesVariable = (destinationBlockHandlesSize > 1) ? destinationBlockHandles.getResultVariable() + "(" + destinationBlockIndex + ")" : destinationBlockHandles.getResultVariable();
						double destinationBlockHandle = ((Double) resultRetreiver.retrieveResult(destinationBlockHandlesVariable).get("1")).doubleValue();
						
						String destinationPortNumbersVariable = (destinationBlockHandlesSize > 1) ? destinationPortNumbers.getResultVariable() + "(" + destinationBlockIndex + ")" : destinationPortNumbers.getResultVariable();
						int destinationPortNumber = ((Double) resultRetreiver.retrieveResult(destinationPortNumbersVariable).get("1")).intValue();
						
						String destinationPortHandleVariable = (destinationBlockHandlesSize > 1) ? destinationPortHandles.getResultVariable() + "(" + destinationBlockIndex + ")" : destinationPortHandles.getResultVariable();
						double destinationPortHandle = ((Double) resultRetreiver.retrieveResult(destinationPortHandleVariable).get("1")).doubleValue();
						
						Block destinationBlock = null;
						InPort destinationPort = null;
						boolean destinationBlockFound = false;
						boolean destinationPortFound = false;
						
						for (Iterator<Block> destinationBlocksIterator = destinationBlocks.iterator(); destinationBlocksIterator.hasNext();) {
							destinationBlock = (Block) destinationBlocksIterator.next();
							double blockHandle = ((Double) resultRetreiver.retrieveResult(destinationBlock.getHandle()).get("1")).doubleValue();
							
							if (destinationBlockHandle == blockHandle) {
								destinationPortFound = false;
								for (Iterator<Port> portsIterator = destinationBlock.getOwnedPorts().iterator(); portsIterator.hasNext() && !destinationPortFound;) {
									Port port = (Port) portsIterator.next();
									if (port instanceof InPort) {
										if (port.getHandle() != null) {
											if (destinationPortHandle == Double.parseDouble(port.getHandle())) {
												destinationPort = (InPort) port;
												destinationPortFound = true;
											}
										} else {
											if (destinationPortNumber == port.getPortNumber()) {
												destinationPort = (InPort) port;
												destinationPortFound = true;
											}
										}
									}
								}
								destinationBlockFound = true;
							}
						}
						
						if (sourcePortFound && destinationBlockFound && destinationPortFound) {
							Connection connection = SimulinkFactory.eINSTANCE.createConnection();
							connection.setName("[" + sourcePort.getBlock().getName() + "] " + sourcePort.getName() + " -> [" + destinationPort.getBlock().getName() + "] " + destinationPort.getName());
							connection.setFrom(sourcePort);
							connection.setTo(destinationPort);
							
							parentBlock.getConnections().add(connection);
						}
					}
				}
			}
			i++;
		}
	}
	
	public Object[] importLibraryIntoExistingEMFSimulinkModel(EObject existingEMFSimulinkModel, String pathToSimulinkLibraryModel) throws IOException {
//		MatlabCommand clear = commandFactory.clear();
//		clear.execute();
		
		MatlabCommand loadLibrary = commandFactory.loadSystem(pathToSimulinkLibraryModel).saveInto("library");
		loadLibrary.execute();

		MatlabCommand libraryNameParam = commandFactory.getParam().addParam(loadLibrary.getResultVariable()).addStringParam("Name").saveInto("libraryName");
		libraryNameParam.execute();
		String libraryName = (String) resultRetreiver.retrieveResult(libraryNameParam.getResultVariable()).get("1");
		
		SimulinkModel model = (SimulinkModel) existingEMFSimulinkModel;

		MatlabCommand sfroot = commandFactory.sfroot().saveInto("lrt");
		sfroot.execute();
		
		MatlabCommand libraryModel = commandFactory.find().in(sfroot.getResultVariable()).a(Simulink.BLOCK_DIAGRAM).and().byName(libraryName).saveInto("libraryModel");
		libraryModel.execute();
		
		Collection<Block> stateflowCharts = createStateflowCharts(libraryModel.getResultVariable(), "libraryCharts", "libraryChartsSize");
		
		MatlabCommand allTruthTableChartsInLibrary = commandFactory.find().in(libraryModel.getResultVariable()).a(Stateflow.TRUTH_TABLE_CHART).saveInto("libraryTruthTableCharts");
		allTruthTableChartsInLibrary.execute();
		
		MatlabCommand truthTableChartsNumel = commandFactory.numel(allTruthTableChartsInLibrary.getResultVariable());
		truthTableChartsNumel.execute();
		int truthTableChartsNumelValue = ((Double) resultRetreiver.retrieveResult(truthTableChartsNumel.getResultVariable()).get("1")).intValue();
		
		for (int truthTableChartIndex = 1; truthTableChartIndex <= truthTableChartsNumelValue; truthTableChartIndex++) {
			TruthTableChart truthTableChart = createTruthTableChart(allTruthTableChartsInLibrary.getResultVariable(), truthTableChartIndex);
			stateflowCharts.add(truthTableChart);
		}

		LinkedList<BlockReference> blockReferenceQueue = new LinkedList<BlockReference>();
		LinkedList<ModelReference> modelReferenceQueue = new LinkedList<ModelReference>();

		MatlabCommand allBlocksInLibrary = commandFactory.findBlocks().in(loadLibrary.getResultVariable()).saveInto("libraryBlocks");
		allBlocksInLibrary.execute();
		
		Collection<Block> blocksInLibrary = createSimulinkBlocks(libraryName, stateflowCharts, allBlocksInLibrary.getResultVariable(), model, blockReferenceQueue, modelReferenceQueue);
		model.getSubBlocks().addAll(blocksInLibrary);
		
		findReferenceSourceBlocks(blocksInLibrary, blockReferenceQueue);
		
		Collection<Block> blocks2 = new LinkedList<Block>();
		blocks2.addAll(blocksInLibrary);
		
		connectSimulinkBlocks(blocksInLibrary, blocks2);

		Object[] result = new Object[] { model };
		
		return result;
	}

	private void findReferenceSourceBlocks(Collection<Block> blocksInLibrary, LinkedList<BlockReference> blockReferenceQueue) {
		List<BlockReference> found = new LinkedList<BlockReference>();
		for (BlockReference blockReference : blockReferenceQueue) {
			String blockHandle = blockReference.getHandle();

			MatlabCommand referenceBlockParam = commandFactory.getParam().addParam(blockHandle).addStringParam("ReferenceBlock").saveInto("referenceBlock");
			referenceBlockParam.execute();
			String referenceBlockName = (String) resultRetreiver.retrieveResult(referenceBlockParam.getResultVariable()).get("1");
			
			if (referenceBlockName != null) {
				referenceBlockName = referenceBlockName.substring(referenceBlockName.lastIndexOf("/") + 1);
				
				boolean sourceBlockFound = false;
				for (Iterator<Block> libraryBlocksIterator = blocksInLibrary.iterator(); libraryBlocksIterator.hasNext() && !sourceBlockFound;) {
					Block sourceBlock = libraryBlocksIterator.next();
					if (referenceBlockName.equals(sourceBlock.getName())) {
						blockReference.setSourceBlock(sourceBlock);
						sourceBlockFound = true;
						found.add(blockReference);
					}
				}
			}
		}
		blockReferenceQueue.removeAll(found);
	}

	private Collection<Block> createStateflowCharts(String modelVariable, String allChartsInModelVariable, String allChartsInModelSizeVariable) throws IOException {
		Collection<Block> stateflowCharts = new LinkedList<Block>();
		
		MatlabCommand allChartsInModel = commandFactory.find().in(modelVariable).a(Stateflow.CHART).saveInto(allChartsInModelVariable);
		allChartsInModel.execute();
		
		MatlabCommand chartsSize = commandFactory.size(allChartsInModel.getResultVariable()).saveInto(allChartsInModelSizeVariable);
		chartsSize.execute();
		int chartsSizeValue = ((Double) resultRetreiver.retrieveResult(chartsSize.getResultVariable()).get("1")).intValue();

		for (int chartIndex = 1; chartIndex <= chartsSizeValue; chartIndex++) {
			Chart chart = createStateflowChart(allChartsInModel.getResultVariable(), chartIndex);
			stateflowCharts.add(chart);
		}
		
		return stateflowCharts;
	}
	
	private Chart createStateflowChart(String charts, int chartIndex) throws IOException {
		Chart chart = createChart(charts, chartIndex);
		
		Collection<State	> statesInChart = createStates(charts, chartIndex, chart);
		
		Collection<Function> functionsInChart = createFunctions(charts, chartIndex, chart, statesInChart);
		
		Collection<ContainableTruthTable> truthTablesInChart = createTruthTables(charts, chartIndex, chart, statesInChart);
		
		createData(charts, chartIndex, chart, functionsInChart, truthTablesInChart);
		
		Collection<Junction> junctionsInChart = createJunctions(charts, chartIndex, chart, statesInChart, functionsInChart);

		// TODO Fix truth tables being imported as charts -> requires modification of the Stateflow metamodel 
		
		createTransitions(charts, chartIndex, chart, statesInChart, functionsInChart, junctionsInChart);
		
		return chart;
	}

	private Chart createChart(String charts, int chartIndex) {
		Map<String, Object> chartData = resultRetreiver.retrieveStructResultAtIndex(charts, chartIndex);
		
		Chart chart = SimulinkFactory.eINSTANCE.createChart();
		chart.setPath((String) chartData.get(Stateflow.Attribute.PATH));
		chart.setId(((Double) chartData.get(Stateflow.Attribute.ID)).intValue());
		chart.setName((String) chartData.get(Stateflow.Attribute.NAME));
		chart.setDecomposition(DecompositionType.getByName((String) chartData.get(Stateflow.Attribute.DECOMPOSITION)));
		
		return chart;
	}

	private Collection<State	> createStates(String charts, int chartIndex, Chart chart) {
		MatlabCommand findAllStatesInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.STATE).saveInto("chartStates");
		findAllStatesInChart.execute();
		
		Collection<State	> statesInChart = new LinkedList<State>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findAllStatesInChart.getResultVariable());
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			int stateIndex = 1;
			
			for (; stateIndex <= sizeValue; stateIndex++) {
				statesInChart.add(createState(findAllStatesInChart.getResultVariable(), stateIndex));
			}
			
			findStatesParents(chart, findAllStatesInChart.getResultVariable(), statesInChart);
		} else {
			if (!size.isEmpty()) {
				statesInChart.add(createState(findAllStatesInChart.getResultVariable(), 0));
				
				findStatesParents(chart, findAllStatesInChart.getResultVariable(), statesInChart);
			}
		}

		MatlabCommand findAllAtomicSubchartsInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.SUB_CHART).saveInto("chartSubCharts");
		findAllAtomicSubchartsInChart.execute();
		
		Collection<State> subchartsInChart = new LinkedList<State>();
		
		size = resultRetreiver.retrieveResult(findAllAtomicSubchartsInChart.getResultVariable());
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			int subchartIndex = 1;
			
			for (; subchartIndex <= sizeValue; subchartIndex++) {
				subchartsInChart.add(createState(findAllAtomicSubchartsInChart.getResultVariable(), subchartIndex));
			}
			
			findSubchartsParents(chart, findAllAtomicSubchartsInChart.getResultVariable(), subchartsInChart, statesInChart);
		} else {
			if (!size.isEmpty()) {
				subchartsInChart.add(createState(findAllAtomicSubchartsInChart.getResultVariable(), 0));
				
				findSubchartsParents(chart, findAllAtomicSubchartsInChart.getResultVariable(), subchartsInChart, statesInChart);
			}
		}
		
		statesInChart.addAll(subchartsInChart);
		
		for (State state : statesInChart) {
			if (state.getParent() == null) {
				chart.getChildren().add(state);
			}
		}
		
		return statesInChart;
	}

	private State createState(String chartStates, int index) {
		Map<String, Object> stateData;
		
		if (index > 0) {
			stateData = resultRetreiver.retrieveStructResultAtIndex(chartStates, index);
		} else {
			stateData = resultRetreiver.retrieveStructResult(chartStates);
		}
		
		State state = SimulinkFactory.eINSTANCE.createState();
		state.setPath((String) stateData.get(Stateflow.Attribute.PATH));
		state.setId(((Double) stateData.get(Stateflow.Attribute.ID)).intValue());
		state.setName((String) stateData.get(Stateflow.Attribute.NAME));
		state.setDecomposition(DecompositionType.getByName((String) stateData.get(Stateflow.Attribute.DECOMPOSITION)));
		state.setExecutionOrder(((Double) stateData.get(Stateflow.Attribute.EXECUTION_ORDER)).intValue());
		
		setStateActions(state, chartStates, index);
		
		return state;
	}

	private void setStateActions(State state, String chartStates, int index) {
		MatlabCommand getActions = commandFactory.getProperty(chartStates, index, Stateflow.Attribute.LABEL_STRING);
		getActions.execute();
		
		Map<String, Object> actionsData = resultRetreiver.retrieveStateLabelString(getActions.getResultVariable());
		if (!actionsData.isEmpty()) {
			Action action = null;
			String[] entryActions = (String[]) actionsData.get(Stateflow.Action.ENTRY);
			if (entryActions != null) {
				for (int i = 0; i < entryActions.length; i++) {
					action = SimulinkFactory.eINSTANCE.createAction();
					action.setStatement(entryActions[i]);
					state.getEntryActions().add(action);
				}
			}
			
			String[] duringActions = (String[]) actionsData.get(Stateflow.Action.DURING);
			if (duringActions != null) {
				for (int i = 0; i < duringActions.length; i++) {
					action = SimulinkFactory.eINSTANCE.createAction();
					action.setStatement(duringActions[i]);
					state.getDuringActions().add(action);
				}
			}
			
			String[] exitActions = (String[]) actionsData.get(Stateflow.Action.EXIT);
			if (exitActions != null) {
				for (int i = 0; i < exitActions.length; i++) {
					action = SimulinkFactory.eINSTANCE.createAction();
					action.setStatement(exitActions[i]);
					state.getExitActions().add(action);
				}
			}
		}
	}

	private void findStatesParents(Chart chart, String findAllStatesInChart, Collection<State> statesInChart) {
		int stateIndex = 1;
		for (State state : statesInChart) {
			setParent(state, findAllStatesInChart, stateIndex, statesInChart);
			stateIndex++;
		}
	}

	private void findSubchartsParents(Chart chart, String findAllStatesInChart, Collection<State> subchartsInChart, Collection<State> statesInChart) {
		int subchartIndex = 1;
		for (State subchart : subchartsInChart) {
			setParent(subchart, findAllStatesInChart, subchartIndex, statesInChart);
			subchartIndex++;
		}
	}
	
	private void setParent(State childState, String chartStates, int index, Collection<State> statesInChart) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartStates, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		State parentState = null;
		for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !parentFound;) {
			State state = iterator.next();
			if (state.getId() == parentID) {
				parentState = state;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			childState.setParent(parentState);
			parentState.getChildren().add(childState);
		}
	}

	private Collection<Function> createFunctions(String charts, int chartIndex, Chart chart, Collection<State> statesInChart) {
		MatlabCommand findAllFunctionsInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.FUNCTION).saveInto("chartFunctions");
		findAllFunctionsInChart.execute();
		
		Collection<Function> functionsInChart = new LinkedList<Function>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findAllFunctionsInChart.getResultVariable());
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			int functionIndex = 1;
			
			for (; functionIndex <= sizeValue; functionIndex++) {
				functionsInChart.add(createFunction(findAllFunctionsInChart.getResultVariable(), functionIndex));
			}
			
			findFunctionsParents(chart, findAllFunctionsInChart, functionsInChart, statesInChart);
		} else {
			if (!size.isEmpty()) {
				functionsInChart.add(createFunction(findAllFunctionsInChart.getResultVariable(), 0));
				
				findFunctionsParents(chart, findAllFunctionsInChart, functionsInChart, statesInChart);
			}
		}

		for (Function function : functionsInChart) {
			if (function.getParent() == null) {
				chart.getChildren().add(function);
			}
		}
		
		return functionsInChart;
	}

	private Function createFunction(String chartFunctions, int index) {
		Map<String, Object> functionData;
		
		if (index > 0) {
			functionData = resultRetreiver.retrieveStructResultAtIndex(chartFunctions, index);
		} else {
			functionData = resultRetreiver.retrieveStructResult(chartFunctions);
		}
		
		Function function = SimulinkFactory.eINSTANCE.createFunction();
		function.setPath((String) functionData.get(Stateflow.Attribute.PATH));
		function.setId(((Double) functionData.get(Stateflow.Attribute.ID)).intValue());
		function.setName((String) functionData.get(Stateflow.Attribute.NAME));
		function.setSignature((String) functionData.get(Stateflow.Attribute.LABEL_STRING));
		
		return function;
	}
	
	private void findFunctionsParents(Chart chart, MatlabCommand findAllFunctionsInChart, Collection<Function> functionsInChart, Collection<State> statesInChart) {
		int functionIndex = 1;
		for (Function function : functionsInChart) {
			setParent(function, findAllFunctionsInChart.getResultVariable(), functionIndex, statesInChart);
			functionIndex++;
		}
	}

	private void setParent(Function childFunction, String chartFunctions, int index, Collection<State> statesInChart) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartFunctions, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		State parentState = null;
		for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !parentFound;) {
			State state = iterator.next();
			if (state.getId() == parentID) {
				parentState = state;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			childFunction.setParent(parentState);
			parentState.getChildren().add(childFunction);
		}
	}

	private Collection<ContainableTruthTable> createTruthTables(String charts, int chartIndex, Chart chart, Collection<State> statesInChart) {
		MatlabCommand findAllTruthTablesInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.TRUTH_TABLE).saveInto("chartTruthTables");
		findAllTruthTablesInChart.execute();
		
		Collection<ContainableTruthTable> truthTablesInChart = new LinkedList<ContainableTruthTable>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findAllTruthTablesInChart.getResultVariable());
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			int truthTableIndex = 1;
			
			for (; truthTableIndex <= sizeValue; truthTableIndex++) {
				truthTablesInChart.add(createTruthTable(findAllTruthTablesInChart.getResultVariable(), truthTableIndex));
			}
			
			findTruthTablesParents(chart, findAllTruthTablesInChart, truthTablesInChart, statesInChart);
		} else {
			if (!size.isEmpty()) {
				truthTablesInChart.add(createTruthTable(findAllTruthTablesInChart.getResultVariable(), 0));
				
				findTruthTablesParents(chart, findAllTruthTablesInChart, truthTablesInChart, statesInChart);
			}
		}

		for (TruthTable truthTable : truthTablesInChart) {
			if (truthTable instanceof ContainableTruthTable) {
				chart.getChildren().add((ContainableTruthTable) truthTable);
			}
		}
		
		return truthTablesInChart;
	}

	private ContainableTruthTable createTruthTable(String chartTruthTables, int index) {
		Map<String, Object> truthTableData;
		
		if (index > 0) {
			truthTableData = resultRetreiver.retrieveStructResultAtIndex(chartTruthTables, index);
		} else {
			truthTableData = resultRetreiver.retrieveStructResult(chartTruthTables);
		}
		
		ContainableTruthTable truthTable = SimulinkFactory.eINSTANCE.createContainableTruthTable();
		truthTable.setPath((String) truthTableData.get(Stateflow.Attribute.PATH));
		truthTable.setId(((Double) truthTableData.get(Stateflow.Attribute.ID)).intValue());
		truthTable.setName((String) truthTableData.get(Stateflow.Attribute.NAME));
		
		truthTable.setConditionTable(createConditionTable(chartTruthTables, index));
		truthTable.setActionTable(createActionTable(chartTruthTables, index));
		
		return truthTable;
	}
	
	private ConditionTable createConditionTable(String truthTables, int index) {
		MatlabCommand getConditionTable = commandFactory.getProperty(truthTables, index, Stateflow.Attribute.TruthTable.CONDITION_TABLE);
		getConditionTable.execute();
		
		String conditionTableVariable = getConditionTable.getResultVariable();
		
		MatlabCommand numel = commandFactory.numel(getConditionTable.getResultVariable());
		numel.execute();
		int n = ((Double) resultRetreiver.retrieveResult(numel.getResultVariable()).get("1")).intValue();
		
		MatlabCommand length = commandFactory.length(getConditionTable.getResultVariable());
		length.execute();
		int numColumns = ((Double) resultRetreiver.retrieveResult(length.getResultVariable()).get("1")).intValue();
		
		int numRows = n / numColumns;
		
		ConditionTable conditionTable = SimulinkFactory.eINSTANCE.createConditionTable();
		
		for (int i = 1; i < numRows; i++) {
			Map<String, Object> cellData = resultRetreiver.retrieveCellValue(conditionTableVariable, i, 1);
			String conditionDescription = (String) cellData.get("1");
			
			cellData = resultRetreiver.retrieveCellValue(conditionTableVariable, i, 2);
			String conditionStatement = (String) cellData.get("1");
			
			Condition condition = SimulinkFactory.eINSTANCE.createCondition();
			condition.setDescription(conditionDescription);
			condition.setStatement(conditionStatement);
			
			conditionTable.getConditions().add(condition);
		}
		
		Collection<Condition> conditions = conditionTable.getConditions();
		
		for (int j = 3; j <= numColumns; j++) {
			Decision decision = SimulinkFactory.eINSTANCE.createDecision();
			decision.setId(j - 2);
			
			Iterator<Condition> iterator = conditions.iterator();
			
			for (int i = 1; (i < numRows) && iterator.hasNext(); i++) {
				Condition condition = iterator.next();
				
				Map<String, Object> cellData = resultRetreiver.retrieveCellValue(conditionTableVariable, i, j);
				String conditionOutcome = (String) cellData.get("1");
				
				DecisionEntry decisionEntry = SimulinkFactory.eINSTANCE.createDecisionEntry();
				
				decisionEntry.setCondition(condition);
				decisionEntry.setConditionOutcome(conditionOutcome);
				
				decision.getDecisionEntries().add(decisionEntry);
			}
			
			Map<String, Object> cellData = resultRetreiver.retrieveCellValue(conditionTableVariable, numRows, j);
			String actionReference = (String) cellData.get("1");
			
			decision.setActionReference(actionReference);
			
			conditionTable.getDecisions().add(decision);
		}
		
		return conditionTable;
	}
	
	private ActionTable createActionTable(String truthTables, int index) {
		MatlabCommand getActionTable = commandFactory.getProperty(truthTables, index, Stateflow.Attribute.TruthTable.ACTION_TABLE);
		getActionTable.execute();
		
		String actionTableVariable = getActionTable.getResultVariable();
		
		MatlabCommand numel = commandFactory.numel(actionTableVariable);
		numel.execute();
		int n = ((Double) resultRetreiver.retrieveResult(numel.getResultVariable()).get("1")).intValue();
		
		Map<String, Object> cellArray = resultRetreiver.retrieveCellArray(actionTableVariable, n);
		
		MatlabCommand length = commandFactory.length(actionTableVariable);
		length.execute();
		int numRows = ((Double) resultRetreiver.retrieveResult(length.getResultVariable()).get("1")).intValue();
		
		ActionTable actionTable = SimulinkFactory.eINSTANCE.createActionTable();
		
		for (int i = 1; i <= numRows; i++) {
			ActionEntry actionEntry = SimulinkFactory.eINSTANCE.createActionEntry();
			actionEntry.setActionReference(i + "");
			actionEntry.setDescription((String) cellArray.get(i + ""));
			actionEntry.setActionStatement((String) cellArray.get((i + numRows) + ""));
			
			actionTable.getActionEntries().add(actionEntry);
		}
		
		return actionTable;
	}
	
	private void findTruthTablesParents(Chart chart, MatlabCommand findAllTruthTablesInChart, Collection<ContainableTruthTable> truthTablesInChart, Collection<State> statesInChart) {
		int truthTableIndex = 1;
		for (ContainableTruthTable truthTable : truthTablesInChart) {
			setParent((ContainableTruthTable) truthTable, findAllTruthTablesInChart.getResultVariable(), truthTableIndex, statesInChart);
			truthTableIndex++;
		}
	}

	private void setParent(ContainableTruthTable childTruthTable, String chartTruthTables, int index, Collection<State> statesInChart) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartTruthTables, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		State parentState = null;
		for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !parentFound;) {
			State state = iterator.next();
			if (state.getId() == parentID) {
				parentState = state;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			childTruthTable.setParent(parentState);
			parentState.getChildren().add(childTruthTable);
		}
	}
	
	private void createData(String charts, int chartIndex, Chart chart, Collection<Function> functionsInChart, Collection<ContainableTruthTable> truthTablesInChart) {
		MatlabCommand findInputDataInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.INPUT).saveInto("inputs");
		findInputDataInChart.execute();
		
		MatlabCommand findOutputDataInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.OUTPUT).saveInto("outputs");
		findOutputDataInChart.execute();
		
		MatlabCommand findLocalDataInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.LOCAL).saveInto("localData");
		findLocalDataInChart.execute();
		
		Collection<Data> dataInChart = new LinkedList<Data>();
		Collection<Data> inDataInChart = new LinkedList<Data>();
		Collection<Data> outDataInChart = new LinkedList<Data>();
		Collection<Data> localDataInChart = new LinkedList<Data>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findInputDataInChart.getResultVariable());
		int sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		int dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			inDataInChart.add(createInputData(findInputDataInChart.getResultVariable(), dataIndex));
		}
		findDataParents(chart, inDataInChart, findInputDataInChart.getResultVariable(), functionsInChart, truthTablesInChart);
		
		size = resultRetreiver.retrieveResult(findOutputDataInChart.getResultVariable());
		sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			outDataInChart.add(createOutputData(findOutputDataInChart.getResultVariable(), dataIndex));
		}
		findDataParents(chart, outDataInChart, findOutputDataInChart.getResultVariable(), functionsInChart, truthTablesInChart);
		
		size = resultRetreiver.retrieveResult(findLocalDataInChart.getResultVariable());
		sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			localDataInChart.add(createLocalData(findLocalDataInChart.getResultVariable(), dataIndex));
		}
		findDataParents(chart, localDataInChart, findLocalDataInChart.getResultVariable(), functionsInChart, truthTablesInChart);
		
		dataInChart.addAll(inDataInChart);
		dataInChart.addAll(outDataInChart);
		dataInChart.addAll(localDataInChart);
	}
	
	private InputData createInputData(String chartData, int index) {
		Map<String, Object> dataData = resultRetreiver.retrieveStructResultAtIndex(chartData, index);
		
		InputData data = SimulinkFactory.eINSTANCE.createInputData();
		data.setPath((String) dataData.get(Stateflow.Attribute.PATH));
		data.setId(((Double) dataData.get(Stateflow.Attribute.ID)).intValue());
		data.setName((String) dataData.get(Stateflow.Attribute.NAME));
		Object port = dataData.get(Stateflow.Attribute.Data.PORT);
		data.setPortNumber(port instanceof Double ? ((Double) port).intValue() : -1);
		
		String dataType = (String) dataData.get(Stateflow.Attribute.Data.DATA_TYPE);
		if (dataType.contains(":") && !dataType.startsWith("Inherit")) {
			dataType = dataType.split(":", 2)[1];
		}
		data.setDataType(dataType);
		
		return data;
	}
	
	private OutputData createOutputData(String chartData, int index) {
		Map<String, Object> dataData = resultRetreiver.retrieveStructResultAtIndex(chartData, index);
		
		OutputData data = SimulinkFactory.eINSTANCE.createOutputData();
		data.setPath((String) dataData.get(Stateflow.Attribute.PATH));
		data.setId(((Double) dataData.get(Stateflow.Attribute.ID)).intValue());
		data.setName((String) dataData.get(Stateflow.Attribute.NAME));
		Object port = dataData.get(Stateflow.Attribute.Data.PORT);
		data.setPortNumber(port instanceof Double ? ((Double) port).intValue() : -1);

		String dataType = (String) dataData.get(Stateflow.Attribute.Data.DATA_TYPE);
		if (dataType.contains(":") && !dataType.startsWith("Inherit")) {
			dataType = dataType.split(":", 2)[1];
		}
		data.setDataType(dataType);
		
		return data;
	}
	
	private Data createLocalData(String chartData, int index) {
		Map<String, Object> dataData = resultRetreiver.retrieveStructResultAtIndex(chartData, index);
		
		LocalData data = SimulinkFactory.eINSTANCE.createLocalData();
		data.setPath((String) dataData.get(Stateflow.Attribute.PATH));
		data.setId(((Double) dataData.get(Stateflow.Attribute.ID)).intValue());
		data.setName((String) dataData.get(Stateflow.Attribute.NAME));
//		Object port = dataData.get(Stateflow.Attribute.Data.PORT);
//		data.setPort(port instanceof Double ? ((Double) port).intValue() : -1);

		String dataType = (String) dataData.get(Stateflow.Attribute.Data.DATA_TYPE);
		if (dataType.contains(":") && !dataType.startsWith("Inherit")) {
			dataType = dataType.split(":", 2)[1];
		}
		data.setDataType(dataType);
		
		return data;
	}
	
	private void findDataParents(Chart chart, Collection<Data> dataInChart, String chartData, Collection<Function> functionsInChart,
			Collection<ContainableTruthTable> truthTablesInChart) {
		int dataIndex;
		dataIndex = 1;
		for (Data data : dataInChart) {
			setParent(data, chartData, dataIndex, functionsInChart, truthTablesInChart);
			dataIndex++;
		}
		
		for (Data data : dataInChart) {
			if (data.getParent() == null) {
				chart.getChildren().add(data);
			}
		}
	}

	private void setParent(Data data, String chartData, int index, Collection<Function> functionsInChart, Collection<ContainableTruthTable> truthTablesInChart) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartData, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		Function parentFunction = null;
		for (Iterator<Function> iterator = functionsInChart.iterator(); iterator.hasNext() && !parentFound;) {
			Function function = iterator.next();
			if (function.getId() == parentID) {
				parentFunction = function;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			data.setParent(parentFunction);
			parentFunction.getChildren().add(data);
		} else {
			TruthTable parentTruthTable = null;
			for (Iterator<ContainableTruthTable> iterator = truthTablesInChart.iterator(); iterator.hasNext() && !parentFound;) {
				ContainableTruthTable truthTable = iterator.next();
				if (truthTable.getId() == parentID) {
					parentTruthTable = truthTable;
					parentFound = true;
				}
			}
			
			if (parentFound) {
				parentTruthTable.getData().add(data);
			}
		}
	}
	
	private Collection<Junction> createJunctions(String charts, int chartIndex, Chart chart, Collection<State> statesInChart, Collection<Function> functionsInChart) {
		MatlabCommand findAllJunctionsInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.JUNCTION).saveInto("chartJunctions");
		findAllJunctionsInChart.execute();

		Collection<Junction> junctionsInChart = new LinkedList<Junction>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findAllJunctionsInChart.getResultVariable());
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			int junctionIndex = 1;
			
			for (; junctionIndex <= sizeValue; junctionIndex++) {
				junctionsInChart.add(createJunction(findAllJunctionsInChart.getResultVariable(), junctionIndex));
			}
			
			findJunctionsParents(chart, statesInChart, functionsInChart, findAllJunctionsInChart, junctionsInChart);
		} else {
			if (!size.isEmpty()) {
				junctionsInChart.add(createJunction(findAllJunctionsInChart.getResultVariable(), 0));
				
				findJunctionsParents(chart, statesInChart, functionsInChart, findAllJunctionsInChart, junctionsInChart);
			}
		}
		
		return junctionsInChart;
	}

	private Junction createJunction(String chartJunctions, int index) {
		Map<String, Object> junctionData;
		
		if (index > 0) {
			junctionData = resultRetreiver.retrieveStructResultAtIndex(chartJunctions, index);
		} else {
			junctionData = resultRetreiver.retrieveStructResult(chartJunctions);
		}

		Junction junction = SimulinkFactory.eINSTANCE.createJunction();
		junction.setPath((String) junctionData.get(Stateflow.Attribute.PATH));
		
		int id = ((Double) junctionData.get(Stateflow.Attribute.ID)).intValue();
		
		junction.setId(id);
		junction.setName("Junction " + id);
		
		return junction;
	}

	private void findJunctionsParents(Chart chart, Collection<State> statesInChart, Collection<Function> functionsInChart, MatlabCommand findAllJunctionsInChart,
			Collection<Junction> junctionsInChart) {
		int junctionIndex;
		junctionIndex = 1;
		for (Junction junction : junctionsInChart) {
			setParent(junction, findAllJunctionsInChart.getResultVariable(), junctionIndex, statesInChart, functionsInChart);
			junctionIndex++;
		}
		
		for (Junction junction : junctionsInChart) {
			if (junction.getParent() == null) {
				chart.getChildren().add(junction);
			}
		}
	}

	private void setParent(Junction junction, String chartJunctions, int index, Collection<State> statesInChart, Collection<Function> functionsInChart) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartJunctions, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		State parentState = null;
		for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !parentFound;) {
			State state = iterator.next();
			if (state.getId() == parentID) {
				parentState = state;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			junction.setParent(parentState);
			parentState.getChildren().add(junction);
		} else {
			Function parentFunction = null;
			for (Iterator<Function> iterator = functionsInChart.iterator(); iterator.hasNext() && !parentFound;) {
				Function function = iterator.next();
				if (function.getId() == parentID) {
					parentFunction = function;
					parentFound = true;
				}
			}
			
			if (parentFound) {
				junction.setParent(parentFunction);
				parentFunction.getChildren().add(junction);
			}
		}
	}
	
	private Collection<Transition> createTransitions(String charts, int chartIndex, Chart chart, Collection<State> statesInChart, Collection<Function> functionsInChart, Collection<Junction> junctionsInChart) {
		MatlabCommand findAllTransitionsInChart = commandFactory.find().in(charts).at(chartIndex).a(Stateflow.TRANSITION).saveInto("chartTransitions");
		findAllTransitionsInChart.execute();
		
		Collection<Transition> transitionsInChart = new LinkedList<Transition>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findAllTransitionsInChart.getResultVariable());
		int transitionIndex = 1;
		if (size.size() == 1) {
			int sizeValue = ((Double) size.get("Size")).intValue();
			
			for (; transitionIndex <= sizeValue; transitionIndex++) {
				transitionsInChart.add(createTransition(findAllTransitionsInChart.getResultVariable(), transitionIndex, chart, statesInChart, functionsInChart, junctionsInChart));
			}
			
		} else {
			if (!size.isEmpty()) {
				transitionsInChart.add(createTransition(findAllTransitionsInChart.getResultVariable(), transitionIndex, chart, statesInChart, functionsInChart, junctionsInChart));
			}
		}
		
		return transitionsInChart;
	}
	
	private Transition createTransition(String chartTransitions, int index, Chart chart, Collection<State> statesInChart, Collection<Function> functionsInChart, Collection<Junction> junctionsInChart) {
		Map<String, Object> transitionData = resultRetreiver.retrieveResultAtIndex(chartTransitions, index);
		
		Transition transition = SimulinkFactory.eINSTANCE.createTransition();
		transition.setPath((String) transitionData.get(Stateflow.Attribute.PATH));
		transition.setId(((Double) transitionData.get(Stateflow.Attribute.ID)).intValue());
		transition.setExecutionOrder(((Double) transitionData.get(Stateflow.Attribute.EXECUTION_ORDER)).intValue());

		setTransitionDestination(transition, chartTransitions, index, statesInChart, junctionsInChart);
		
		setTransitionSource(transition, chartTransitions, index, statesInChart, junctionsInChart);
		
		setTransitionTriggerGuardAndActions(transition, chartTransitions, index);
		
		String source = transition.getSource() != null ? transition.getSource().getName().replaceAll("\\s","") : "Default";
		String destination = transition.getDestination().getName() != null ? transition.getDestination().getName().replaceAll("\\s","") : "";
		
		transition.setName(source + "To" + destination);
		
		Collection<CompositeStateflowElement> compositeStateflowElements = new LinkedList<CompositeStateflowElement>();
		compositeStateflowElements.addAll(statesInChart);
		compositeStateflowElements.addAll(functionsInChart);
		compositeStateflowElements.add(chart);
		setParent(transition, chartTransitions, index, compositeStateflowElements);
		
		return transition;
	}

	private void setTransitionDestination(Transition transition, String chartTransitions, int index, Collection<State> statesInChart, Collection<Junction> junctionsInChart) {
		MatlabCommand getDestination = commandFactory.getProperty(chartTransitions, index, Stateflow.Attribute.Transition.DESTINATION);
		getDestination.execute();
		
		Map<String, Object> destinationData = resultRetreiver.retrieveStructResult(getDestination.getResultVariable());
		Object id = destinationData.get(Stateflow.Attribute.ID);
		if (id != null) {
			int destinationID = ((Double) id).intValue();
			
			boolean destinationFound = false;
			Vertex destination = null;
			for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !destinationFound;) {
				State state = iterator.next();
				if (state.getId() == destinationID) {
					destination = state;
					destinationFound = true;
				}
			}
			if (!destinationFound) {
				for (Iterator<Junction> iterator = junctionsInChart.iterator(); iterator.hasNext() && !destinationFound;) {
					Junction junction = iterator.next();
					if (junction.getId() == destinationID) {
						destination = junction;
						destinationFound = true;
					}
				}
			}
			
			if (destinationFound) {
				destination.getIncomingTransitions().add(transition);
				transition.setDestination(destination);
			}
		}
	}

	private void setTransitionSource(Transition transition, String chartTransitions, int index, Collection<State> statesInChart, Collection<Junction> junctionsInChart) {
		MatlabCommand getSource = commandFactory.getProperty(chartTransitions, index, Stateflow.Attribute.Transition.SOURCE);
		getSource.execute();
		
		Vertex source = null;
		
		Map<String, Object> sourceData = resultRetreiver.retrieveStructResult(getSource.getResultVariable());
		Object id = sourceData.get(Stateflow.Attribute.ID);
		if (id != null) {
			int sourceID = ((Double) id).intValue();
			
			boolean sourceFound = false;
			
			for (Iterator<State> iterator = statesInChart.iterator(); iterator.hasNext() && !sourceFound;) {
				State state = iterator.next();
				if (state.getId() == sourceID) {
					source = state;
					sourceFound = true;
				}
			}
			if (!sourceFound) {
				for (Iterator<Junction> iterator = junctionsInChart.iterator(); iterator.hasNext() && !sourceFound;) {
					Junction junction = iterator.next();
					if (junction.getId() == sourceID) {
						source = junction;
						sourceFound = true;
					}
				}
			}
			if (sourceFound) {
				source.getOutgoingTransitions().add(transition);
				transition.setSource(source);
			}
		}
	}
	
	private void setTransitionTriggerGuardAndActions(Transition transition, String chartTransitions, int index) {
		MatlabCommand getGuardAndActions = commandFactory.getProperty(chartTransitions, index, Stateflow.Attribute.LABEL_STRING);
		getGuardAndActions.execute();
		
		Map<String, Object> triggerGuardAndActionsData = resultRetreiver.retrieveTransitionLabelString(getGuardAndActions.getResultVariable());
		
		if (!triggerGuardAndActionsData.isEmpty()) {
			String triggerStatement = (String) triggerGuardAndActionsData.get(Stateflow.Action.TRIGGER);
			if (triggerStatement != null) {
				SFWTrigger trigger = SimulinkFactory.eINSTANCE.createSFWTrigger();
				trigger.setStatement(triggerStatement);
				transition.setTrigger(trigger);
			}
			
			String guardStatement = (String) triggerGuardAndActionsData.get(Stateflow.Action.GUARD);
			if (guardStatement != null) {
//				SFWGuard guard = SimulinkFactory.eINSTANCE.createSFWGuard();
//				guard.setStatement(guardStatement);
//				transition.setGuard(guard);
				SFWTrigger guard = SimulinkFactory.eINSTANCE.createSFWTrigger();
				guard.setStatement(guardStatement);
				transition.setTrigger(guard);
			}
			
			@SuppressWarnings("unchecked")
			List<String> triggeredActions = (List<String>) triggerGuardAndActionsData.get(Stateflow.Action.TRIGGERED);
			if (!triggeredActions.isEmpty()) {
				for (String statement : triggeredActions) {
					Action action = SimulinkFactory.eINSTANCE.createAction();
					action.setStatement(statement);
					transition.getTriggeredActions().add(action);
				}
			}
		}
	}

	private void setParent(Transition transition, String chartTransitions, int index, Collection<CompositeStateflowElement> compositeStateflowElements) {
		MatlabCommand getParentCommand = commandFactory.getParent(chartTransitions, index);
		getParentCommand.execute();
		
		Map<String, Object> parentData = resultRetreiver.retrieveStructResult(getParentCommand.getResultVariable());
		int parentID = ((Double) parentData.get(Stateflow.Attribute.ID)).intValue();
		
		boolean parentFound = false;
		CompositeStateflowElement parent = null;
		for (Iterator<CompositeStateflowElement> iterator = compositeStateflowElements.iterator(); iterator.hasNext() && !parentFound;) {
			CompositeStateflowElement stateflowElement = iterator.next();
			if (stateflowElement.getId() == parentID) {
				parent = stateflowElement;
				parentFound = true;
			}
		}
		
		if (parentFound) {
			transition.setParent(parent);
			parent.getChildren().add(transition);
		}
	}
	
	public void saveSimulinkModel(EObject existingModel) throws IOException {
		saveSimulinkStateflowModelAsEMFModel((SimulinkModel) existingModel);
	}

	private void saveSimulinkStateflowModelAsEMFModel(SimulinkModel model) throws IOException {
		Resource.Factory.Registry reg = Resource.Factory.Registry.INSTANCE;
        Map<String, Object> m = reg.getExtensionToFactoryMap();
        m.put("simulink", new XMIResourceFactoryImpl());

        ResourceSet rs = new ResourceSetImpl();
        
        String emfModelPath = model.getFile().substring(0, model.getFile().lastIndexOf(".")) + ".simulink";

        Resource saveResource = rs.createResource(URI.createFileURI(emfModelPath));
        
        final Map<String, String> options = new HashMap<String, String>();
        options.put(XMIResource.OPTION_PROCESS_DANGLING_HREF, XMIResource.OPTION_PROCESS_DANGLING_HREF_DISCARD);
        
        saveResource.getContents().add(model);
        
        saveResource.save(options);
	}
	
	private TruthTableChart createTruthTableChart(String truthTableCharts, int truthTableChartIndex) throws IOException {
		Map<String, Object> truthTableData = resultRetreiver.retrieveStructResultAtIndex(truthTableCharts, truthTableChartIndex);
		
		TruthTableChart truthTable = SimulinkFactory.eINSTANCE.createTruthTableChart();
		truthTable.setPath((String) truthTableData.get(Stateflow.Attribute.PATH));
		truthTable.setId(((Double) truthTableData.get(Stateflow.Attribute.ID)).intValue());
		truthTable.setName((String) truthTableData.get(Stateflow.Attribute.NAME));
		
		truthTable.setConditionTable(createConditionTable(truthTableCharts, truthTableChartIndex));
		truthTable.setActionTable(createActionTable(truthTableCharts, truthTableChartIndex));
		
		createData(truthTableCharts, truthTableChartIndex, truthTable);
		
		return truthTable;
	}

	private void createData(String truthTableCharts, int truthTableChartIndex, TruthTableChart truthTableChart) {
		MatlabCommand findInputDataInChart = commandFactory.find().in(truthTableCharts).at(truthTableChartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.INPUT).saveInto("inputs");
		findInputDataInChart.execute();
		
		MatlabCommand findOutputDataInChart = commandFactory.find().in(truthTableCharts).at(truthTableChartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.OUTPUT).saveInto("outputs");
		findOutputDataInChart.execute();
		
		MatlabCommand findLocalDataInChart = commandFactory.find().in(truthTableCharts).at(truthTableChartIndex).a(Stateflow.DATA).and().by(Stateflow.Attribute.Data.SCOPE, Stateflow.Attribute.Data.Scope.LOCAL).saveInto("localData");
		findLocalDataInChart.execute();
		
		Collection<Data> dataInChart = new LinkedList<Data>();
		
		Map<String, Object> size = resultRetreiver.retrieveResult(findInputDataInChart.getResultVariable());
		int sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		int dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			dataInChart.add(createInputData(findInputDataInChart.getResultVariable(), dataIndex));
		}
		
		size = resultRetreiver.retrieveResult(findOutputDataInChart.getResultVariable());
		sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			dataInChart.add(createOutputData(findOutputDataInChart.getResultVariable(), dataIndex));
		}
		
		size = resultRetreiver.retrieveResult(findLocalDataInChart.getResultVariable());
		sizeValue = size.get("Size") != null ? ((Double) size.get("Size")).intValue() : 0;
		dataIndex = 1;
		for (; dataIndex <= sizeValue; dataIndex++) {
			dataInChart.add(createLocalData(findLocalDataInChart.getResultVariable(), dataIndex));
		}
		
		for (Data data : dataInChart) {
			truthTableChart.getData().add(data);
		}
	}

	public void closeMatlabSession() {
		matlabEngineManager.quitMatlab();
	}

}
