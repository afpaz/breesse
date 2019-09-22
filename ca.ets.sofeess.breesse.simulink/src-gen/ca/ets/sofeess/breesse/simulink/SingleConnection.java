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


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Single Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.SingleConnection#getTo <em>To</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.SingleConnection#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSingleConnection()
 * @model
 * @generated
 */
public interface SingleConnection extends Connection {
	/**
	 * Returns the value of the '<em><b>To</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.InPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>To</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>To</em>' reference.
	 * @see #setTo(InPort)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSingleConnection_To()
	 * @see ca.ets.sofeess.breesse.simulink.InPort#getConnection
	 * @model opposite="connection"
	 * @generated
	 */
	InPort getTo();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.SingleConnection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(InPort value);

	/**
	 * Returns the value of the '<em><b>Parent</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.BranchedConnection#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Parent</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Parent</em>' reference.
	 * @see #setParent(BranchedConnection)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getSingleConnection_Parent()
	 * @see ca.ets.sofeess.breesse.simulink.BranchedConnection#getConnections
	 * @model opposite="connections"
	 * @generated
	 */
	BranchedConnection getParent();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.SingleConnection#getParent <em>Parent</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Parent</em>' reference.
	 * @see #getParent()
	 * @generated
	 */
	void setParent(BranchedConnection value);

} // SingleConnection
