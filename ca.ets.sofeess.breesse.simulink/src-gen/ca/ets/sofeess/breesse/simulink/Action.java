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

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Action#getStatement <em>Statement</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Action#getTransition <em>Transition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Action#getStateEntry <em>State Entry</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Action#getStateDuring <em>State During</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Action#getStateExit <em>State Exit</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction()
 * @model
 * @generated
 */
public interface Action extends EObject {
	/**
	 * Returns the value of the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Statement</em>' attribute.
	 * @see #setStatement(String)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction_Statement()
	 * @model required="true"
	 * @generated
	 */
	String getStatement();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Action#getStatement <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Statement</em>' attribute.
	 * @see #getStatement()
	 * @generated
	 */
	void setStatement(String value);

	/**
	 * Returns the value of the '<em><b>Transition</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Transition#getTriggeredActions <em>Triggered Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Transition</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Transition</em>' container reference.
	 * @see #setTransition(Transition)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction_Transition()
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getTriggeredActions
	 * @model opposite="triggeredActions" transient="false"
	 * @generated
	 */
	Transition getTransition();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Action#getTransition <em>Transition</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Transition</em>' container reference.
	 * @see #getTransition()
	 * @generated
	 */
	void setTransition(Transition value);

	/**
	 * Returns the value of the '<em><b>State Entry</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.State#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Entry</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Entry</em>' container reference.
	 * @see #setStateEntry(State)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction_StateEntry()
	 * @see ca.ets.sofeess.breesse.simulink.State#getEntryActions
	 * @model opposite="entryActions" transient="false"
	 * @generated
	 */
	State getStateEntry();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Action#getStateEntry <em>State Entry</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Entry</em>' container reference.
	 * @see #getStateEntry()
	 * @generated
	 */
	void setStateEntry(State value);

	/**
	 * Returns the value of the '<em><b>State During</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.State#getDuringActions <em>During Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State During</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State During</em>' container reference.
	 * @see #setStateDuring(State)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction_StateDuring()
	 * @see ca.ets.sofeess.breesse.simulink.State#getDuringActions
	 * @model opposite="duringActions" transient="false"
	 * @generated
	 */
	State getStateDuring();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Action#getStateDuring <em>State During</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State During</em>' container reference.
	 * @see #getStateDuring()
	 * @generated
	 */
	void setStateDuring(State value);

	/**
	 * Returns the value of the '<em><b>State Exit</b></em>' container reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.State#getExitActions <em>Exit Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>State Exit</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>State Exit</em>' container reference.
	 * @see #setStateExit(State)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getAction_StateExit()
	 * @see ca.ets.sofeess.breesse.simulink.State#getExitActions
	 * @model opposite="exitActions" transient="false"
	 * @generated
	 */
	State getStateExit();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Action#getStateExit <em>State Exit</em>}' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>State Exit</em>' container reference.
	 * @see #getStateExit()
	 * @generated
	 */
	void setStateExit(State value);

} // Action
