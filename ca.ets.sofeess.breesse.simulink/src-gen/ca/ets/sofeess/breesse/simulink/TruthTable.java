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
 * A representation of the model object '<em><b>Truth Table</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.TruthTable#getConditionTable <em>Condition Table</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.TruthTable#getActionTable <em>Action Table</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.TruthTable#getData <em>Data</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTruthTable()
 * @model abstract="true"
 * @generated
 */
public interface TruthTable extends StateflowElement {
	/**
	 * Returns the value of the '<em><b>Condition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Condition Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Condition Table</em>' containment reference.
	 * @see #setConditionTable(ConditionTable)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTruthTable_ConditionTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ConditionTable getConditionTable();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.TruthTable#getConditionTable <em>Condition Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Condition Table</em>' containment reference.
	 * @see #getConditionTable()
	 * @generated
	 */
	void setConditionTable(ConditionTable value);

	/**
	 * Returns the value of the '<em><b>Action Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Action Table</em>' containment reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Action Table</em>' containment reference.
	 * @see #setActionTable(ActionTable)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTruthTable_ActionTable()
	 * @model containment="true" required="true"
	 * @generated
	 */
	ActionTable getActionTable();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.TruthTable#getActionTable <em>Action Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Action Table</em>' containment reference.
	 * @see #getActionTable()
	 * @generated
	 */
	void setActionTable(ActionTable value);

	/**
	 * Returns the value of the '<em><b>Data</b></em>' containment reference list.
	 * The list contents are of type {@link ca.ets.sofeess.breesse.simulink.Data}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Data</em>' containment reference list isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Data</em>' containment reference list.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getTruthTable_Data()
	 * @model containment="true"
	 * @generated
	 */
	EList<Data> getData();

} // TruthTable
