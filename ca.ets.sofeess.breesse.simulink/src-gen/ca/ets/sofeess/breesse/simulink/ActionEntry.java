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
 * A representation of the model object '<em><b>Action Entry</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionReference <em>Action Reference</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getActionEntry()
 * @model
 * @generated
 */
public interface ActionEntry extends EObject {
	/**
	 * Returns the value of the '<em><b>Action Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Reference</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Reference</em>' attribute.
	 * @see #setActionReference(String)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getActionEntry_ActionReference()
	 * @model
	 * @generated
	 */
	String getActionReference();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionReference <em>Action Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Reference</em>' attribute.
	 * @see #getActionReference()
	 * @generated
	 */
	void setActionReference(String value);

	/**
	 * Returns the value of the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Description</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Description</em>' attribute.
	 * @see #setDescription(String)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getActionEntry_Description()
	 * @model
	 * @generated
	 */
	String getDescription();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getDescription <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Description</em>' attribute.
	 * @see #getDescription()
	 * @generated
	 */
	void setDescription(String value);

	/**
	 * Returns the value of the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Statement</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Statement</em>' attribute.
	 * @see #setActionStatement(String)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getActionEntry_ActionStatement()
	 * @model
	 * @generated
	 */
	String getActionStatement();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionStatement <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Statement</em>' attribute.
	 * @see #getActionStatement()
	 * @generated
	 */
	void setActionStatement(String value);

} // ActionEntry
