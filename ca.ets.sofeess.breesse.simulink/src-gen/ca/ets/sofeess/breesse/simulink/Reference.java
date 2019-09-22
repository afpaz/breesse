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
 * A representation of the model object '<em><b>Reference</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.Reference#getSourceBlock <em>Source Block</em>}</li>
 * </ul>
 *
 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getReference()
 * @model abstract="true"
 * @generated
 */
public interface Reference extends SubSystem {

	/**
	 * Returns the value of the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Source Block</em>' reference isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @return the value of the '<em>Source Block</em>' reference.
	 * @see #setSourceBlock(Block)
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkPackage#getReference_SourceBlock()
	 * @model
	 * @generated
	 */
	Block getSourceBlock();

	/**
	 * Sets the value of the '{@link ca.ets.sofeess.breesse.simulink.Reference#getSourceBlock <em>Source Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Source Block</em>' reference.
	 * @see #getSourceBlock()
	 * @generated
	 */
	void setSourceBlock(Block value);

} // Reference
