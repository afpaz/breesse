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
 * A representation of the model object '<em><b>Composite Stateflow Element</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.CompositeStateflowElement#getChildren <em>Children</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getCompositeStateflowElement()
 * @model abstract="true"
 * @generated
 */
public interface CompositeStateflowElement extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Children</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.ContainableStateflowElement}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.ContainableStateflowElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Children</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Children</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getCompositeStateflowElement_Children()
	 * @see ca.ets.sofeess.breesse.simulink.ContainableStateflowElement#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<ContainableStateflowElement> getChildren();

} // CompositeStateflowElement
