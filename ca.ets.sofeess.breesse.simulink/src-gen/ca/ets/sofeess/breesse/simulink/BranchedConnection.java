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
 * A representation of the model object '<em><b>Branched Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.BranchedConnection#getConnections <em>Connections</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getBranchedConnection()
 * @model
 * @generated
 */
public interface BranchedConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>Connections</b></em>' reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.SingleConnection}.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.SingleConnection#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Connections</em>' reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Connections</em>' reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getBranchedConnection_Connections()
	 * @see ca.ets.sofeess.breesse.simulink.SingleConnection#getParent
	 * @model opposite="parent"
	 * @generated
	 */
	EList<SingleConnection> getConnections();

} // BranchedConnection
