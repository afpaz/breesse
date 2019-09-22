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
 * A representation of the model object '<em><b>Sub System</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.SubSystem#getSubBlocks <em>Sub Blocks</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.SubSystem#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSubSystem()
 * @model
 * @generated
 */
public interface SubSystem extends Block {
	/**
	 * Returns the value of the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Block}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.Block#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Sub Blocks</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Sub Blocks</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSubSystem_SubBlocks()
	 * @see ca.ets.sofeess.breesse.simulink.Block#getParent
	 * @model opposite="parent" containment="true"
	 * @generated
	 */
	EList<Block> getSubBlocks();

	/**
	 * Returns the value of the '<em><b>Connections</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Connection}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSubSystem_Connections()
	 * @model containment="true"
	 * @generated
	 */
	EList<Connection> getConnections();

} // SubSystem
