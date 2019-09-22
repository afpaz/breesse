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

import ca.ets.sofeess.breesse.engine.MatlabEngineManager;
import ca.ets.sofeess.breesse.engine.types.Stateflow;

/**
 * @author Andrés Paz
 *
 */
public class FindCommand extends MatlabCommand {

	private final static String COMMAND_NAME = "find";

	public FindCommand(MatlabEngineManager commandEvaluator) {
		super(COMMAND_NAME, commandEvaluator);
	}

	public FindCommand in(String object) {
		this.setInvocationTarget(object);
		return this;
	}
	
	public FindCommand at(int index) {
		this.setInvocationTargetIndex(index);
		return this;
	}

	public FindCommand a(String elementType) {
		this.addStringParam("-isa");
		this.addStringParam(elementType);
		return this;
	}

	public FindCommand and() {
		this.addStringParam("-and");
		return this;
	}

	public FindCommand byName(String name) {
		this.addStringParam(Stateflow.Attribute.NAME);
		this.addStringParam(name);
		return this;
	}
	
	public FindCommand by(String propertyName, String propertyValue) {
		this.addStringParam(propertyName);
		this.addStringParam(propertyValue);
		return this;
	}
	
}
