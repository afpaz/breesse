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

package ca.ets.sofeess.breesse.engine.types;

/**
 * @author Andrés Paz
 *
 */
public final class Stateflow {

	private Stateflow() {
		
	}
	
	public static final String CHART = "Stateflow.Chart";
	public static final String SUB_CHART = "Stateflow.AtomicSubchart";
	public static final String STATE = "Stateflow.State";
	public static final String JUNCTION = "Stateflow.Junction";
	public static final String TRANSITION = "Stateflow.Transition";
	public static final String FUNCTION = "Stateflow.Function";
	public static final String TRUTH_TABLE = "Stateflow.TruthTable";
	public static final String TRUTH_TABLE_CHART = "Stateflow.TruthTableChart";
	public static final String DATA = "Stateflow.Data";

	public class Action {
		
		public static final String ENTRY = "entry";
		public static final String DURING = "during";
		public static final String EXIT = "exit";
		public static final String TRIGGER = "trigger";
		public static final String GUARD = "guard";
		public static final String TRIGGERED = "triggered";
		
	}
	
	public class Attribute {
		
		public static final String PATH = "Path";
		public static final String ID = "Id";
		public static final String NAME = "Name";
		public static final String DECOMPOSITION = "Decomposition";
		public static final String EXECUTION_ORDER = "ExecutionOrder";
		public static final String LABEL_STRING = "LabelString";

		public class Transition {
			
			public static final String DESTINATION = "Destination";
			public static final String SOURCE = "Source";
			
		}
		
		public class TruthTable {
			
			public static final String CONDITION_TABLE = "ConditionTable";
			public static final String ACTION_TABLE = "ActionTable";
			
		}
		
		public class Data {
			
			public static final String SCOPE = "Scope";
			public static final String PORT = "Port";
			public static final String DATA_TYPE = "DataType";
			
			public class Scope {
				
				public static final String INPUT = "Input";
				public static final String OUTPUT = "Output";
				public static final String LOCAL = "Local";
				
			}
			
		}
				
	}

}
