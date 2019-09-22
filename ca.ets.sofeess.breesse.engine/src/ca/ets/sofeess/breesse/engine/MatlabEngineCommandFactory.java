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

import ca.ets.sofeess.breesse.engine.commands.ClearCommand;
import ca.ets.sofeess.breesse.engine.commands.FindBlocksCommand;
import ca.ets.sofeess.breesse.engine.commands.FindCommand;
import ca.ets.sofeess.breesse.engine.commands.FindSystem;
import ca.ets.sofeess.breesse.engine.commands.GetFieldCommand;
import ca.ets.sofeess.breesse.engine.commands.GetParamCommand;
import ca.ets.sofeess.breesse.engine.commands.GetParentCommand;
import ca.ets.sofeess.breesse.engine.commands.GetPropertyCommand;
import ca.ets.sofeess.breesse.engine.commands.LengthCommand;
import ca.ets.sofeess.breesse.engine.commands.LoadSystemCommand;
import ca.ets.sofeess.breesse.engine.commands.NumberOfElementsCommand;
import ca.ets.sofeess.breesse.engine.commands.SFRootCommand;
import ca.ets.sofeess.breesse.engine.commands.SizeCommand;

/**
 * @author Andrés Paz
 *
 */
public class MatlabEngineCommandFactory {

	private MatlabEngineManager commandEvaluator;
	
	public MatlabEngineCommandFactory(MatlabEngineManager commandEvaluator) {
		this.commandEvaluator = commandEvaluator;
	}

	public ClearCommand clear() {
		return new ClearCommand(this.commandEvaluator);
	}
	
	public LoadSystemCommand loadSystem(String simulinkModel) {
		return new LoadSystemCommand(this.commandEvaluator).addStringParam(simulinkModel);
	}
	
	public FindBlocksCommand findBlocks() {
		return new FindBlocksCommand(this.commandEvaluator);
	}
	
	public GetParamCommand getParam() {
		return new GetParamCommand(this.commandEvaluator);
	}
	
	public FindSystem findSystem() {
		return new FindSystem(this.commandEvaluator);
	}
	
	public GetFieldCommand getField() {
		return new GetFieldCommand(this.commandEvaluator);
	}
	
	public SFRootCommand sfroot() {
		return new SFRootCommand(this.commandEvaluator);
	}
	
	public FindCommand find() {
		return new FindCommand(this.commandEvaluator);
	}
	
	public SizeCommand size(String variableName) {
		return new SizeCommand(this.commandEvaluator).addParam(variableName);
	}
	
	public NumberOfElementsCommand numel(String variableName) {
		return new NumberOfElementsCommand(this.commandEvaluator).addParam(variableName).saveInto("n");
	}
	
	public LengthCommand length(String variableName) {
		return new LengthCommand(this.commandEvaluator).addParam(variableName).saveInto("l");
	}

	public GetParentCommand getParent(String stateflowObjectVariableName) {
		return new GetParentCommand(this.commandEvaluator).setInvocationTarget(stateflowObjectVariableName);
	}

	public GetParentCommand getParent(String stateflowObjectVariableName, int index) {
		return new GetParentCommand(this.commandEvaluator).setInvocationTarget(stateflowObjectVariableName).setInvocationTargetIndex(index).saveInto("parent");
	}
	
	public GetPropertyCommand getProperty(String structVariableName, int index, String property) {
		return new GetPropertyCommand(this.commandEvaluator).setInvocationTarget(structVariableName).setInvocationTargetIndex(index).addStringParam(property).saveInto(property);
	}
	
}
