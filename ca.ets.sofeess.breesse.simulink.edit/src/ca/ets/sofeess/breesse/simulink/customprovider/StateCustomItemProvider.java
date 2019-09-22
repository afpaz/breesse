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

package ca.ets.sofeess.breesse.simulink.customprovider;

import org.eclipse.emf.common.notify.AdapterFactory;

import ca.ets.sofeess.breesse.simulink.State;
import ca.ets.sofeess.breesse.simulink.Transition;
import ca.ets.sofeess.breesse.simulink.provider.StateItemProvider;

/**
 * @author Andrés Paz
 *
 */
public class StateCustomItemProvider extends StateItemProvider {

	public StateCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		State state = (State) object;
        String initialVertexText = "";
        for (Transition incomingTransition : state.getIncomingTransitions()) {
            if (incomingTransition.getSource() == null) {
                initialVertexText = "•";
            }
        }
        String label = state.getName();
        return label == null || label.length() == 0 ?
            getString("_UI_State_type") :
            getString("_UI_State_type") + " " + label + " " + initialVertexText;
	}

}
