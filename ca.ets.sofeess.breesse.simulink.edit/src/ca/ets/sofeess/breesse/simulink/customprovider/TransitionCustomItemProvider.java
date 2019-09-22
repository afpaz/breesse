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
import ca.ets.sofeess.breesse.simulink.Vertex;
import ca.ets.sofeess.breesse.simulink.provider.TransitionItemProvider;

/**
 * @author Andrés Paz
 *
 */
public class TransitionCustomItemProvider extends TransitionItemProvider {

	public TransitionCustomItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	@Override
	public String getText(Object object) {
		Transition transition = (Transition)object;
        Vertex source = transition.getSource();
        Vertex destination = transition.getDestination();
        String sourceText = "";
        String destinationText = "";
        if (source != null) {
            if (source instanceof State) {
                sourceText = ((State) source).getName();
            } else {
                sourceText = getString("_UI_Junction_type") + " " + source.getId();
            }
        } else {
            sourceText = "•";
        }
        if (destination != null) {
        		if (destination instanceof State) {
                destinationText = ((State) destination).getName();
            } else {
                destinationText = getString("_UI_Junction_type") + " " + destination.getId();
            }
		} else {
			destinationText = "•";
		}
        return getString("_UI_Transition_type") + " " + transition.getId() + ": " + sourceText + " -> " + destinationText;
	}

}
