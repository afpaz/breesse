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
 * A representation of the model object '<em><b>Connection</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Connection#getFrom <em>From</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Connection#getTo <em>To</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getConnection()
 * @model
 * @generated
 */
public interface Connection extends SimulinkElement {
	/**
	 * Returns the value of the '<em><b>From</b></em>' reference.
	 * It is bidirectional and its opposite is '{@link ca.ets.sofeess.breesse.simulink.OutPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>From</em>' container reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>From</em>' reference.
	 * @see #setFrom(OutPort)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getConnection_From()
	 * @see ca.ets.sofeess.breesse.simulink.OutPort#getConnection
	 * @model opposite="connection"
	 * @generated
	 */
	OutPort getFrom();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Connection#getFrom <em>From</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>From</em>' reference.
	 * @see #getFrom()
	 * @generated
	 */
	void setFrom(OutPort value);

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
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getConnection_To()
	 * @see ca.ets.sofeess.breesse.simulink.InPort#getConnection
	 * @model opposite="connection"
	 * @generated
	 */
	InPort getTo();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Connection#getTo <em>To</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>To</em>' reference.
	 * @see #getTo()
	 * @generated
	 */
	void setTo(InPort value);

} // Connection
