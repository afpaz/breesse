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

import java.io.Writer;
import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

import com.mathworks.engine.EngineException;
import com.mathworks.engine.MatlabEngine;

/**
 * @author Andrés Paz
 *
 */
public class MatlabEngineManager {

	private MatlabEngine engine;
	
	public MatlabEngineManager() {
		
	}
	
	public void startMatlab() {
		try {
			String[] options = { "-desktop" };
			engine = MatlabEngine.startMatlab(options);
//			engine = MatlabEngine.connectMatlab();
		} catch (EngineException | InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void evaluateCommand(String command, Writer output, Writer errorOutput) {
		try {
			engine.eval(command, output, errorOutput);
		} catch (CancellationException | InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public <T> T getVariable(String variableName) {
		T variable = null;
		try {
			variable = engine.getVariable(variableName);
		} catch (IllegalStateException | InterruptedException | ExecutionException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return variable;
	}

	public void quitMatlab() {
		try {
			engine.close();
		} catch (EngineException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
}
