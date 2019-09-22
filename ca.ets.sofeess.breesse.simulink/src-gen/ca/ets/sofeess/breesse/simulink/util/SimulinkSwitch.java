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

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.util.Switch;

import ca.ets.sofeess.breesse.simulink.*;

/**
 * <!-- begin-user-doc -->
 * The <b>Switch</b> for the model's inheritance hierarchy.
 * It supports the call {@link #doSwitch(EObject) doSwitch(object)}
 * to invoke the <code>caseXXX</code> method for each class of the model,
 * starting with the actual class of the object
 * and proceeding up the inheritance hierarchy
 * until a non-null result is returned,
 * which is the result of the switch.
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage
 * @generated
 */
public class SimulinkSwitch<T> extends Switch<T> {
	/**
	 * The cached model package
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected static SimulinkPackage modelPackage;

	/**
	 * Creates an instance of the switch.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkSwitch() {
		if (modelPackage == null) {
			modelPackage = SimulinkPackage.eINSTANCE;
		}
	}

	/**
	 * Checks whether this is a switch for the given package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param ePackage the package in question.
	 * @return whether this is a switch for the given package.
	 * @generated
	 */
	@Override
	protected boolean isSwitchFor(EPackage ePackage) {
		return ePackage == modelPackage;
	}

	/**
	 * Calls <code>caseXXX</code> for each class of the model until one returns a non null result; it yields that result.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the first non-null result returned by a <code>caseXXX</code> call.
	 * @generated
	 */
	@Override
	protected T doSwitch(int classifierID, EObject theEObject) {
		switch (classifierID) {
			case SimulinkPackage.SIMULINK_MODEL: {
				SimulinkModel simulinkModel = (SimulinkModel)theEObject;
				T result = caseSimulinkModel(simulinkModel);
				if (result == null) result = caseSubSystem(simulinkModel);
				if (result == null) result = caseBlock(simulinkModel);
				if (result == null) result = caseSimulinkElement(simulinkModel);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SIMULINK_ELEMENT: {
				SimulinkElement simulinkElement = (SimulinkElement)theEObject;
				T result = caseSimulinkElement(simulinkElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BLOCK: {
				Block block = (Block)theEObject;
				T result = caseBlock(block);
				if (result == null) result = caseSimulinkElement(block);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.PORT: {
				Port port = (Port)theEObject;
				T result = casePort(port);
				if (result == null) result = caseSimulinkElement(port);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.IN_PORT: {
				InPort inPort = (InPort)theEObject;
				T result = caseInPort(inPort);
				if (result == null) result = casePort(inPort);
				if (result == null) result = caseSimulinkElement(inPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.OUT_PORT: {
				OutPort outPort = (OutPort)theEObject;
				T result = caseOutPort(outPort);
				if (result == null) result = casePort(outPort);
				if (result == null) result = caseSimulinkElement(outPort);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SUB_SYSTEM: {
				SubSystem subSystem = (SubSystem)theEObject;
				T result = caseSubSystem(subSystem);
				if (result == null) result = caseBlock(subSystem);
				if (result == null) result = caseSimulinkElement(subSystem);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.PORT_BLOCK: {
				PortBlock portBlock = (PortBlock)theEObject;
				T result = casePortBlock(portBlock);
				if (result == null) result = caseBlock(portBlock);
				if (result == null) result = caseSimulinkElement(portBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.IN_PORT_BLOCK: {
				InPortBlock inPortBlock = (InPortBlock)theEObject;
				T result = caseInPortBlock(inPortBlock);
				if (result == null) result = casePortBlock(inPortBlock);
				if (result == null) result = caseBlock(inPortBlock);
				if (result == null) result = caseSimulinkElement(inPortBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.OUT_PORT_BLOCK: {
				OutPortBlock outPortBlock = (OutPortBlock)theEObject;
				T result = caseOutPortBlock(outPortBlock);
				if (result == null) result = casePortBlock(outPortBlock);
				if (result == null) result = caseBlock(outPortBlock);
				if (result == null) result = caseSimulinkElement(outPortBlock);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONNECTION: {
				Connection connection = (Connection)theEObject;
				T result = caseConnection(connection);
				if (result == null) result = caseSimulinkElement(connection);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CHART: {
				Chart chart = (Chart)theEObject;
				T result = caseChart(chart);
				if (result == null) result = caseCompositeStateflowElement(chart);
				if (result == null) result = caseBlock(chart);
				if (result == null) result = caseStateflowElement(chart);
				if (result == null) result = caseSimulinkElement(chart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.VERTEX: {
				Vertex vertex = (Vertex)theEObject;
				T result = caseVertex(vertex);
				if (result == null) result = caseContainableStateflowElement(vertex);
				if (result == null) result = caseStateflowElement(vertex);
				if (result == null) result = caseSimulinkElement(vertex);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.STATE: {
				State state = (State)theEObject;
				T result = caseState(state);
				if (result == null) result = caseVertex(state);
				if (result == null) result = caseCompositeStateflowElement(state);
				if (result == null) result = caseContainableStateflowElement(state);
				if (result == null) result = caseStateflowElement(state);
				if (result == null) result = caseSimulinkElement(state);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.JUNCTION: {
				Junction junction = (Junction)theEObject;
				T result = caseJunction(junction);
				if (result == null) result = caseVertex(junction);
				if (result == null) result = caseContainableStateflowElement(junction);
				if (result == null) result = caseStateflowElement(junction);
				if (result == null) result = caseSimulinkElement(junction);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.TRANSITION: {
				Transition transition = (Transition)theEObject;
				T result = caseTransition(transition);
				if (result == null) result = caseContainableStateflowElement(transition);
				if (result == null) result = caseStateflowElement(transition);
				if (result == null) result = caseSimulinkElement(transition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SFW_GUARD: {
				SFWGuard sfwGuard = (SFWGuard)theEObject;
				T result = caseSFWGuard(sfwGuard);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ACTION: {
				Action action = (Action)theEObject;
				T result = caseAction(action);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.STATEFLOW_ELEMENT: {
				StateflowElement stateflowElement = (StateflowElement)theEObject;
				T result = caseStateflowElement(stateflowElement);
				if (result == null) result = caseSimulinkElement(stateflowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.FUNCTION: {
				Function function = (Function)theEObject;
				T result = caseFunction(function);
				if (result == null) result = caseCompositeStateflowElement(function);
				if (result == null) result = caseContainableStateflowElement(function);
				if (result == null) result = caseStateflowElement(function);
				if (result == null) result = caseSimulinkElement(function);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.COMPOSITE_STATEFLOW_ELEMENT: {
				CompositeStateflowElement compositeStateflowElement = (CompositeStateflowElement)theEObject;
				T result = caseCompositeStateflowElement(compositeStateflowElement);
				if (result == null) result = caseStateflowElement(compositeStateflowElement);
				if (result == null) result = caseSimulinkElement(compositeStateflowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONTAINABLE_STATEFLOW_ELEMENT: {
				ContainableStateflowElement containableStateflowElement = (ContainableStateflowElement)theEObject;
				T result = caseContainableStateflowElement(containableStateflowElement);
				if (result == null) result = caseStateflowElement(containableStateflowElement);
				if (result == null) result = caseSimulinkElement(containableStateflowElement);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.TRUTH_TABLE: {
				TruthTable truthTable = (TruthTable)theEObject;
				T result = caseTruthTable(truthTable);
				if (result == null) result = caseStateflowElement(truthTable);
				if (result == null) result = caseSimulinkElement(truthTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONDITION_TABLE: {
				ConditionTable conditionTable = (ConditionTable)theEObject;
				T result = caseConditionTable(conditionTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ACTION_TABLE: {
				ActionTable actionTable = (ActionTable)theEObject;
				T result = caseActionTable(actionTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONDITION: {
				Condition condition = (Condition)theEObject;
				T result = caseCondition(condition);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.DECISION: {
				Decision decision = (Decision)theEObject;
				T result = caseDecision(decision);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.DECISION_ENTRY: {
				DecisionEntry decisionEntry = (DecisionEntry)theEObject;
				T result = caseDecisionEntry(decisionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.CONTAINABLE_TRUTH_TABLE: {
				ContainableTruthTable containableTruthTable = (ContainableTruthTable)theEObject;
				T result = caseContainableTruthTable(containableTruthTable);
				if (result == null) result = caseTruthTable(containableTruthTable);
				if (result == null) result = caseContainableStateflowElement(containableTruthTable);
				if (result == null) result = caseStateflowElement(containableTruthTable);
				if (result == null) result = caseSimulinkElement(containableTruthTable);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.TRUTH_TABLE_CHART: {
				TruthTableChart truthTableChart = (TruthTableChart)theEObject;
				T result = caseTruthTableChart(truthTableChart);
				if (result == null) result = caseTruthTable(truthTableChart);
				if (result == null) result = caseBlock(truthTableChart);
				if (result == null) result = caseStateflowElement(truthTableChart);
				if (result == null) result = caseSimulinkElement(truthTableChart);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.ACTION_ENTRY: {
				ActionEntry actionEntry = (ActionEntry)theEObject;
				T result = caseActionEntry(actionEntry);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.DATA: {
				Data data = (Data)theEObject;
				T result = caseData(data);
				if (result == null) result = caseContainableStateflowElement(data);
				if (result == null) result = caseStateflowElement(data);
				if (result == null) result = caseSimulinkElement(data);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.INPUT_DATA: {
				InputData inputData = (InputData)theEObject;
				T result = caseInputData(inputData);
				if (result == null) result = caseData(inputData);
				if (result == null) result = caseInPort(inputData);
				if (result == null) result = caseContainableStateflowElement(inputData);
				if (result == null) result = casePort(inputData);
				if (result == null) result = caseStateflowElement(inputData);
				if (result == null) result = caseSimulinkElement(inputData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.OUTPUT_DATA: {
				OutputData outputData = (OutputData)theEObject;
				T result = caseOutputData(outputData);
				if (result == null) result = caseData(outputData);
				if (result == null) result = caseOutPort(outputData);
				if (result == null) result = caseContainableStateflowElement(outputData);
				if (result == null) result = casePort(outputData);
				if (result == null) result = caseStateflowElement(outputData);
				if (result == null) result = caseSimulinkElement(outputData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.LOCAL_DATA: {
				LocalData localData = (LocalData)theEObject;
				T result = caseLocalData(localData);
				if (result == null) result = caseData(localData);
				if (result == null) result = caseContainableStateflowElement(localData);
				if (result == null) result = caseStateflowElement(localData);
				if (result == null) result = caseSimulinkElement(localData);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.BLOCK_REFERENCE: {
				BlockReference blockReference = (BlockReference)theEObject;
				T result = caseBlockReference(blockReference);
				if (result == null) result = caseReference(blockReference);
				if (result == null) result = caseSubSystem(blockReference);
				if (result == null) result = caseBlock(blockReference);
				if (result == null) result = caseSimulinkElement(blockReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.SFW_TRIGGER: {
				SFWTrigger sfwTrigger = (SFWTrigger)theEObject;
				T result = caseSFWTrigger(sfwTrigger);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.MODEL_REFERENCE: {
				ModelReference modelReference = (ModelReference)theEObject;
				T result = caseModelReference(modelReference);
				if (result == null) result = caseReference(modelReference);
				if (result == null) result = caseSubSystem(modelReference);
				if (result == null) result = caseBlock(modelReference);
				if (result == null) result = caseSimulinkElement(modelReference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			case SimulinkPackage.REFERENCE: {
				Reference reference = (Reference)theEObject;
				T result = caseReference(reference);
				if (result == null) result = caseSubSystem(reference);
				if (result == null) result = caseBlock(reference);
				if (result == null) result = caseSimulinkElement(reference);
				if (result == null) result = defaultCase(theEObject);
				return result;
			}
			default: return defaultCase(theEObject);
		}
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkModel(SimulinkModel object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSimulinkElement(SimulinkElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlock(Block object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePort(Port object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPort(InPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPort(OutPort object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Sub System</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSubSystem(SubSystem object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T casePortBlock(PortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>In Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>In Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInPortBlock(InPortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Out Port Block</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Out Port Block</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutPortBlock(OutPortBlock object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Connection</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConnection(Connection object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseChart(Chart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Vertex</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseVertex(Vertex object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>State</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>State</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseState(State object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Junction</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseJunction(Junction object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Transition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTransition(Transition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFW Guard</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFW Guard</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFWGuard(SFWGuard object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseAction(Action object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Stateflow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Stateflow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseStateflowElement(StateflowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Function</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Function</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseFunction(Function object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Composite Stateflow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Composite Stateflow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCompositeStateflowElement(CompositeStateflowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Stateflow Element</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Stateflow Element</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableStateflowElement(ContainableStateflowElement object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truth Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truth Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruthTable(TruthTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseConditionTable(ConditionTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionTable(ActionTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Condition</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseCondition(Condition object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecision(Decision object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Decision Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Decision Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseDecisionEntry(DecisionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Containable Truth Table</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Containable Truth Table</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseContainableTruthTable(ContainableTruthTable object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Truth Table Chart</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Truth Table Chart</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseTruthTableChart(TruthTableChart object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Action Entry</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Action Entry</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseActionEntry(ActionEntry object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseData(Data object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Input Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Input Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseInputData(InputData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Output Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Output Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseOutputData(OutputData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Local Data</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Local Data</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseLocalData(LocalData object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Block Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Block Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseBlockReference(BlockReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseReference(Reference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>SFW Trigger</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>SFW Trigger</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseSFWTrigger(SFWTrigger object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>Model Reference</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject) doSwitch(EObject)
	 * @generated
	 */
	public T caseModelReference(ModelReference object) {
		return null;
	}

	/**
	 * Returns the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * <!-- begin-user-doc -->
	 * This implementation returns null;
	 * returning a non-null result will terminate the switch, but this is the last case anyway.
	 * <!-- end-user-doc -->
	 * @param object the target of the switch.
	 * @return the result of interpreting the object as an instance of '<em>EObject</em>'.
	 * @see #doSwitch(org.eclipse.emf.ecore.EObject)
	 * @generated
	 */
	@Override
	public T defaultCase(EObject object) {
		return null;
	}

} //SimulinkSwitch
