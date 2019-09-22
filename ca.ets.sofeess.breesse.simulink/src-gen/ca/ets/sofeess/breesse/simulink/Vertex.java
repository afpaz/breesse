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
 * A representation of the model object '<em><b>Vertex</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getVertex()
 * @model abstract="true"
 * @generated
 */
public interface Vertex extends ContainableStateflowElement {
	/**
	 * Returns the value of the '<em><b>Incoming Transitions</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Incoming Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Incoming Transitions</em>' reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getVertex_IncomingTransitions()
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getDestination
	 * @model opposite="destination" required="true"
	 * @generated
	 */
	EList<Transition> getIncomingTransitions();

	/**
	 * Returns the value of the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Transition}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Outgoing Transitions</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Outgoing Transitions</em>' reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getVertex_OutgoingTransitions()
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getSource
	 * @model opposite="source"
	 * @generated
	 */
	EList<Transition> getOutgoingTransitions();

} // Vertex
