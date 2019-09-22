/**
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
package ca.ets.sofeess.breesse.simulink.util;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

import ca.ets.sofeess.breesse.simulink.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage
 * @generated
 */
public class SimulinkAdapterFactory extends AdapterFactoryImpl {
	/**
	 * The cached model package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulinkPackage modelPackage;

	/**
	 * Creates an instance of the adapter factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkAdapterFactory() {
		if (modelPackage == null) {
			modelPackage = SimulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Returns whether this factory is applicable for the type of the object.
	 * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
	 * @return whether this factory is applicable for the type of the object.
	 * @generated
	 */
	@Override
	public boolean isFactoryForType(Object object) {
		if (object == modelPackage) {
			return true;
		}
		if (object instanceof EObject) {
			return ((EObject)object).eClass().getEPackage() == modelPackage;
		}
		return false;
	}

	/**
	 * The switch that delegates to the <code>createXXX</code> methods.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SimulinkSwitch<Adapter> modelSwitch =
		new SimulinkSwitch<Adapter>() {
			@Override
			public Adapter caseSimulinkModel(SimulinkModel object) {
				return createSimulinkModelAdapter();
			}
			@Override
			public Adapter caseSimulinkElement(SimulinkElement object) {
				return createSimulinkElementAdapter();
			}
			@Override
			public Adapter caseBlock(Block object) {
				return createBlockAdapter();
			}
			@Override
			public Adapter casePort(Port object) {
				return createPortAdapter();
			}
			@Override
			public Adapter caseInPort(InPort object) {
				return createInPortAdapter();
			}
			@Override
			public Adapter caseOutPort(OutPort object) {
				return createOutPortAdapter();
			}
			@Override
			public Adapter caseSubSystem(SubSystem object) {
				return createSubSystemAdapter();
			}
			@Override
			public Adapter casePortBlock(PortBlock object) {
				return createPortBlockAdapter();
			}
			@Override
			public Adapter caseInPortBlock(InPortBlock object) {
				return createInPortBlockAdapter();
			}
			@Override
			public Adapter caseOutPortBlock(OutPortBlock object) {
				return createOutPortBlockAdapter();
			}
			@Override
			public Adapter caseConnection(Connection object) {
				return createConnectionAdapter();
			}
			@Override
			public Adapter caseChart(Chart object) {
				return createChartAdapter();
			}
			@Override
			public Adapter caseVertex(Vertex object) {
				return createVertexAdapter();
			}
			@Override
			public Adapter caseState(State object) {
				return createStateAdapter();
			}
			@Override
			public Adapter caseJunction(Junction object) {
				return createJunctionAdapter();
			}
			@Override
			public Adapter caseTransition(Transition object) {
				return createTransitionAdapter();
			}
			@Override
			public Adapter caseSFWGuard(SFWGuard object) {
				return createSFWGuardAdapter();
			}
			@Override
			public Adapter caseAction(Action object) {
				return createActionAdapter();
			}
			@Override
			public Adapter caseStateflowElement(StateflowElement object) {
				return createStateflowElementAdapter();
			}
			@Override
			public Adapter caseFunction(Function object) {
				return createFunctionAdapter();
			}
			@Override
			public Adapter caseCompositeStateflowElement(CompositeStateflowElement object) {
				return createCompositeStateflowElementAdapter();
			}
			@Override
			public Adapter caseContainableStateflowElement(ContainableStateflowElement object) {
				return createContainableStateflowElementAdapter();
			}
			@Override
			public Adapter caseTruthTable(TruthTable object) {
				return createTruthTableAdapter();
			}
			@Override
			public Adapter caseConditionTable(ConditionTable object) {
				return createConditionTableAdapter();
			}
			@Override
			public Adapter caseActionTable(ActionTable object) {
				return createActionTableAdapter();
			}
			@Override
			public Adapter caseCondition(Condition object) {
				return createConditionAdapter();
			}
			@Override
			public Adapter caseDecision(Decision object) {
				return createDecisionAdapter();
			}
			@Override
			public Adapter caseDecisionEntry(DecisionEntry object) {
				return createDecisionEntryAdapter();
			}
			@Override
			public Adapter caseContainableTruthTable(ContainableTruthTable object) {
				return createContainableTruthTableAdapter();
			}
			@Override
			public Adapter caseTruthTableChart(TruthTableChart object) {
				return createTruthTableChartAdapter();
			}
			@Override
			public Adapter caseActionEntry(ActionEntry object) {
				return createActionEntryAdapter();
			}
			@Override
			public Adapter caseData(Data object) {
				return createDataAdapter();
			}
			@Override
			public Adapter caseInputData(InputData object) {
				return createInputDataAdapter();
			}
			@Override
			public Adapter caseOutputData(OutputData object) {
				return createOutputDataAdapter();
			}
			@Override
			public Adapter caseLocalData(LocalData object) {
				return createLocalDataAdapter();
			}
			@Override
			public Adapter caseBlockReference(BlockReference object) {
				return createBlockReferenceAdapter();
			}
			@Override
			public Adapter caseSFWTrigger(SFWTrigger object) {
				return createSFWTriggerAdapter();
			}
			@Override
			public Adapter caseModelReference(ModelReference object) {
				return createModelReferenceAdapter();
			}
			@Override
			public Adapter caseReference(Reference object) {
				return createReferenceAdapter();
			}
			@Override
			public Adapter defaultCase(EObject object) {
				return createEObjectAdapter();
			}
		};

	/**
	 * Creates an adapter for the <code>target</code>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param target the object to adapt.
	 * @return the adapter for the <code>target</code>.
	 * @generated
	 */
	@Override
	public Adapter createAdapter(Notifier target) {
		return modelSwitch.doSwitch((EObject)target);
	}


	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.SimulinkModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkModel
	 * @generated
	 */
	public Adapter createSimulinkModelAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.SimulinkElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkElement
	 * @generated
	 */
	public Adapter createSimulinkElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Block
	 * @generated
	 */
	public Adapter createBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Port
	 * @generated
	 */
	public Adapter createPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.InPort
	 * @generated
	 */
	public Adapter createInPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.OutPort
	 * @generated
	 */
	public Adapter createOutPortAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.SubSystem
	 * @generated
	 */
	public Adapter createSubSystemAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.PortBlock <em>Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.PortBlock
	 * @generated
	 */
	public Adapter createPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.InPortBlock <em>In Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.InPortBlock
	 * @generated
	 */
	public Adapter createInPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.OutPortBlock <em>Out Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.OutPortBlock
	 * @generated
	 */
	public Adapter createOutPortBlockAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Connection
	 * @generated
	 */
	public Adapter createConnectionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Chart
	 * @generated
	 */
	public Adapter createChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Vertex
	 * @generated
	 */
	public Adapter createVertexAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.State
	 * @generated
	 */
	public Adapter createStateAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Junction
	 * @generated
	 */
	public Adapter createJunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Transition
	 * @generated
	 */
	public Adapter createTransitionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.SFWGuard <em>SFW Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.SFWGuard
	 * @generated
	 */
	public Adapter createSFWGuardAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Action
	 * @generated
	 */
	public Adapter createActionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.StateflowElement <em>Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.StateflowElement
	 * @generated
	 */
	public Adapter createStateflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Function
	 * @generated
	 */
	public Adapter createFunctionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.CompositeStateflowElement <em>Composite Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.CompositeStateflowElement
	 * @generated
	 */
	public Adapter createCompositeStateflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ContainableStateflowElement <em>Containable Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ContainableStateflowElement
	 * @generated
	 */
	public Adapter createContainableStateflowElementAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.TruthTable <em>Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTable
	 * @generated
	 */
	public Adapter createTruthTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ConditionTable <em>Condition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ConditionTable
	 * @generated
	 */
	public Adapter createConditionTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ActionTable <em>Action Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ActionTable
	 * @generated
	 */
	public Adapter createActionTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Condition
	 * @generated
	 */
	public Adapter createConditionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Decision
	 * @generated
	 */
	public Adapter createDecisionAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.DecisionEntry <em>Decision Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.DecisionEntry
	 * @generated
	 */
	public Adapter createDecisionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ContainableTruthTable <em>Containable Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ContainableTruthTable
	 * @generated
	 */
	public Adapter createContainableTruthTableAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.TruthTableChart <em>Truth Table Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTableChart
	 * @generated
	 */
	public Adapter createTruthTableChartAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ActionEntry <em>Action Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ActionEntry
	 * @generated
	 */
	public Adapter createActionEntryAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Data
	 * @generated
	 */
	public Adapter createDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.InputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.InputData
	 * @generated
	 */
	public Adapter createInputDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.OutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.OutputData
	 * @generated
	 */
	public Adapter createOutputDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.LocalData <em>Local Data</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.LocalData
	 * @generated
	 */
	public Adapter createLocalDataAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.BlockReference <em>Block Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.BlockReference
	 * @generated
	 */
	public Adapter createBlockReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.Reference
	 * @generated
	 */
	public Adapter createReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.SFWTrigger <em>SFW Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.SFWTrigger
	 * @generated
	 */
	public Adapter createSFWTriggerAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for an object of class '{@link ca.ets.sofeess.breesse.simulink.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @see ca.ets.sofeess.breesse.simulink.ModelReference
	 * @generated
	 */
	public Adapter createModelReferenceAdapter() {
		return null;
	}

	/**
	 * Creates a new adapter for the default case.
	 * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
	 * @return the new adapter.
	 * @generated
	 */
	public Adapter createEObjectAdapter() {
		return null;
	}

} //SimulinkAdapterFactory
