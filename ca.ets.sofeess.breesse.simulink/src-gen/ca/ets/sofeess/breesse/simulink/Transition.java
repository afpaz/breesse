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
 * A representation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getDestination <em>Destination</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getGuard <em>Guard</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getTriggeredActions <em>Triggered Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#isIsDefaultTransition <em>Is Default Transition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Transition#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition()
 * @model
 * @generated
 */
public interface Transition extends ContainableStateflowElement {
	/**
	 * Returns the value of the '<em><b>Source</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source</em>' reference.
	 * @see #setSource(Vertex)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_Source()
	 * @see ca.ets.sofeess.breesse.simulink.Vertex#getOutgoingTransitions
	 * @model opposite="outgoingTransitions"
	 * @generated
	 */
	Vertex getSource();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#getSource <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source</em>' reference.
	 * @see #getSource()
	 * @generated
	 */
	void setSource(Vertex value);

	/**
	 * Returns the value of the '<em><b>Destination</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Destination</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Destination</em>' reference.
	 * @see #setDestination(Vertex)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_Destination()
	 * @see ca.ets.sofeess.breesse.simulink.Vertex#getIncomingTransitions
	 * @model opposite="incomingTransitions" required="true"
	 * @generated
	 */
	Vertex getDestination();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#getDestination <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Destination</em>' reference.
	 * @see #getDestination()
	 * @generated
	 */
	void setDestination(Vertex value);

	/**
	 * Returns the value of the '<em><b>Guard</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.SFWGuard#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Guard</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Guard</em>' containment reference.
	 * @see #setGuard(SFWGuard)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_Guard()
	 * @see ca.ets.sofeess.breesse.simulink.SFWGuard#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	SFWGuard getGuard();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#getGuard <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Guard</em>' containment reference.
	 * @see #getGuard()
	 * @generated
	 */
	void setGuard(SFWGuard value);

	/**
	 * Returns the value of the '<em><b>Triggered Actions</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Action}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Triggered Actions</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Triggered Actions</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_TriggeredActions()
	 * @see ca.ets.sofeess.breesse.simulink.Action#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	EList<Action> getTriggeredActions();

	/**
	 * Returns the value of the '<em><b>Is Default Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Is Default Transition</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Is Default Transition</em>' attribute.
	 * @see #setIsDefaultTransition(boolean)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_IsDefaultTransition()
	 * @model derived="true"
	 * @generated
	 */
	boolean isIsDefaultTransition();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#isIsDefaultTransition <em>Is Default Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Is Default Transition</em>' attribute.
	 * @see #isIsDefaultTransition()
	 * @generated
	 */
	void setIsDefaultTransition(boolean value);

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
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_ExecutionOrder()
	 * @model
	 * @generated
	 */
	int getExecutionOrder();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#getExecutionOrder <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Execution Order</em>' attribute.
	 * @see #getExecutionOrder()
	 * @generated
	 */
	void setExecutionOrder(int value);

	/**
	 * Returns the value of the '<em><b>Trigger</b></em>' containment reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.SFWTrigger#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Trigger</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Trigger</em>' containment reference.
	 * @see #setTrigger(SFWTrigger)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTransition_Trigger()
	 * @see ca.ets.sofeess.breesse.simulink.SFWTrigger#getTransition
	 * @model opposite="transition" containment="true"
	 * @generated
	 */
	SFWTrigger getTrigger();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Transition#getTrigger <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Trigger</em>' containment reference.
	 * @see #getTrigger()
	 * @generated
	 */
	void setTrigger(SFWTrigger value);

} // Transition
