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
package ca.ets.sofeess.breesse.simulink;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.State#getDecomposition <em>Decomposition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.State#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.State#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.State#getDuringActions <em>During Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.State#getExitActions <em>Exit Actions</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState()
 * @model
 * @generated
 */
public interface State extends Vertex, CompositeStateflowElement {
	/**
	 * Returns the value of the '<em><b>Decomposition</b></em>' attribute.
	 * The literals are from the enumeration {@link ca.ets.sofeess.breesse.simulink.DecompositionType}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Decomposition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Decomposition</em>' attribute.
	 * @see ca.ets.sofeess.breesse.simulink.DecompositionType
	 * @see #setDecomposition(DecompositionType)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState_Decomposition()
	 * @model required="true"
	 * @generated
	 */
	DecompositionType getDecomposition();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.State#getDecomposition <em>Decomposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Decomposition</em>' attribute.
	 * @see ca.ets.sofeess.breesse.simulink.DecompositionType
	 * @see #getDecomposition()
	 * @generated
	 */
	void setDecomposition(DecompositionType value);

	/**
	 * Returns the value of the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Execution Order</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Execution Order</em>' attribute.
	 * @see #setExecutionOrder(int)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState_ExecutionOrder()
	 * @model
	 * @generated
	 */
	int getExecutionOrder();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.State#getExecutionOrder <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Order</em>' attribute.
	 * @see #getExecutionOrder()
	 * @generated
	 */
	void setExecutionOrder(int value);

	/**
	 * Returns the value of the '<em><b>Entry Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Action}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Action#getStateEntry <em>State Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Entry Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Entry Actions</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState_EntryActions()
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateEntry
	 * @model opposite="stateEntry" containment="true"
	 * @generated
	 */
	EList<Action> getEntryActions();

	/**
	 * Returns the value of the '<em><b>During Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Action}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Action#getStateDuring <em>State During</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>During Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>During Actions</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState_DuringActions()
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateDuring
	 * @model opposite="stateDuring" containment="true"
	 * @generated
	 */
	EList<Action> getDuringActions();

	/**
	 * Returns the value of the '<em><b>Exit Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Action}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Action#getStateExit <em>State Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exit Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Exit Actions</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getState_ExitActions()
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateExit
	 * @model opposite="stateExit" containment="true"
	 * @generated
	 */
	EList<Action> getExitActions();

} // State
