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

/**
 * @author Andrés Paz
 *
 */
public class FindSystem extends MatlabCommand {

	private final static String COMMAND_NAME = "find_system";

	public FindSystem(MatlabEngineManager commandEvaluator) {
		super(COMMAND_NAME, commandEvaluator);
	}

}
