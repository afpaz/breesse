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
package ca.ets.sofeess.breesse.simulink.impl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.ets.sofeess.breesse.simulink.ActionEntry;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl#getActionReference <em>Action Reference</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl#getDescription <em>Description</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl#getActionStatement <em>Action Statement</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionEntryImpl extends MinimalEObjectImpl.Container implements ActionEntry {
	/**
	 * The default value of the '{@link #getActionReference() <em>Action Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReference()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_REFERENCE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionReference() <em>Action Reference</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionReference()
	 * @generated
	 * @ordered
	 */
	protected String actionReference = ACTION_REFERENCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected static final String DESCRIPTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescription() <em>Description</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescription()
	 * @generated
	 * @ordered
	 */
	protected String description = DESCRIPTION_EDEFAULT;

	/**
	 * The default value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String ACTION_STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getActionStatement() <em>Action Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionStatement()
	 * @generated
	 * @ordered
	 */
	protected String actionStatement = ACTION_STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.ACTION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionReference() {
		return actionReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionReference(String newActionReference) {
		String oldActionReference = actionReference;
		actionReference = newActionReference;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION_ENTRY__ACTION_REFERENCE, oldActionReference, actionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDescription() {
		return description;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescription(String newDescription) {
		String oldDescription = description;
		description = newDescription;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION_ENTRY__DESCRIPTION, oldDescription, description));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getActionStatement() {
		return actionStatement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionStatement(String newActionStatement) {
		String oldActionStatement = actionStatement;
		actionStatement = newActionStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION_ENTRY__ACTION_STATEMENT, oldActionStatement, actionStatement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.ACTION_ENTRY__ACTION_REFERENCE:
				return getActionReference();
			case SimulinkPackage.ACTION_ENTRY__DESCRIPTION:
				return getDescription();
			case SimulinkPackage.ACTION_ENTRY__ACTION_STATEMENT:
				return getActionStatement();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulinkPackage.ACTION_ENTRY__ACTION_REFERENCE:
				setActionReference((String)newValue);
				return;
			case SimulinkPackage.ACTION_ENTRY__DESCRIPTION:
				setDescription((String)newValue);
				return;
			case SimulinkPackage.ACTION_ENTRY__ACTION_STATEMENT:
				setActionStatement((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case SimulinkPackage.ACTION_ENTRY__ACTION_REFERENCE:
				setActionReference(ACTION_REFERENCE_EDEFAULT);
				return;
			case SimulinkPackage.ACTION_ENTRY__DESCRIPTION:
				setDescription(DESCRIPTION_EDEFAULT);
				return;
			case SimulinkPackage.ACTION_ENTRY__ACTION_STATEMENT:
				setActionStatement(ACTION_STATEMENT_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case SimulinkPackage.ACTION_ENTRY__ACTION_REFERENCE:
				return ACTION_REFERENCE_EDEFAULT == null ? actionReference != null : !ACTION_REFERENCE_EDEFAULT.equals(actionReference);
			case SimulinkPackage.ACTION_ENTRY__DESCRIPTION:
				return DESCRIPTION_EDEFAULT == null ? description != null : !DESCRIPTION_EDEFAULT.equals(description);
			case SimulinkPackage.ACTION_ENTRY__ACTION_STATEMENT:
				return ACTION_STATEMENT_EDEFAULT == null ? actionStatement != null : !ACTION_STATEMENT_EDEFAULT.equals(actionStatement);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (actionReference: ");
		result.append(actionReference);
		result.append(", description: ");
		result.append(description);
		result.append(", actionStatement: ");
		result.append(actionStatement);
		result.append(')');
		return result.toString();
	}

} //ActionEntryImpl
