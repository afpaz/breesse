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

import org.eclipse.emf.common.notify.Adapter;

import ca.ets.sofeess.breesse.simulink.provider.SimulinkItemProviderAdapterFactory;

/**
 * @author Andrés Paz
 *
 */
public class SimulinkCustomItemProviderAdapterFactory extends SimulinkItemProviderAdapterFactory {
	
	public SimulinkCustomItemProviderAdapterFactory() {
		super();
	}
	
	@Override
	public Adapter createActionAdapter() {
		if (actionItemProvider == null) {
			actionItemProvider = new ActionCustomItemProvider(this);
		}
		
		return actionItemProvider;
	}

	@Override
	public Adapter createStateAdapter() {
		if (stateItemProvider == null) {
			stateItemProvider = new StateCustomItemProvider(this);
		}

		return stateItemProvider;
	}

	@Override
	public Adapter createJunctionAdapter() {
		if (junctionItemProvider == null) {
			junctionItemProvider = new JunctionCustomItemProvider(this);
		}

		return junctionItemProvider;
	}

	@Override
	public Adapter createTransitionAdapter() {
		if (transitionItemProvider == null) {
			transitionItemProvider = new TransitionCustomItemProvider(this);
		}

		return transitionItemProvider;
	}

}
