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

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ets.sofeess.breesse.simulink.Decision;
import ca.ets.sofeess.breesse.simulink.DecisionEntry;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.DecisionImpl#getDecisionEntries <em>Decision Entries</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.DecisionImpl#getActionReference <em>Action Reference</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.DecisionImpl#getId <em>Id</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionImpl extends MinimalEObjectImpl.Container implements Decision {
	/**
	 * The cached value of the '{@link #getDecisionEntries() <em>Decision Entries</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecisionEntries()
	 * @generated
	 * @ordered
	 */
	protected EList<DecisionEntry> decisionEntries;

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
	 * The default value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected static final int ID_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getId() <em>Id</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getId()
	 * @generated
	 * @ordered
	 */
	protected int id = ID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.DECISION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<DecisionEntry> getDecisionEntries() {
		if (decisionEntries == null) {
			decisionEntries = new EObjectContainmentEList<DecisionEntry>(DecisionEntry.class, this, SimulinkPackage.DECISION__DECISION_ENTRIES);
		}
		return decisionEntries;
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.DECISION__ACTION_REFERENCE, oldActionReference, actionReference));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getId() {
		return id;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setId(int newId) {
		int oldId = id;
		id = newId;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.DECISION__ID, oldId, id));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.DECISION__DECISION_ENTRIES:
				return ((InternalEList<?>)getDecisionEntries()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.DECISION__DECISION_ENTRIES:
				return getDecisionEntries();
			case SimulinkPackage.DECISION__ACTION_REFERENCE:
				return getActionReference();
			case SimulinkPackage.DECISION__ID:
				return getId();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case SimulinkPackage.DECISION__DECISION_ENTRIES:
				getDecisionEntries().clear();
				getDecisionEntries().addAll((Collection<? extends DecisionEntry>)newValue);
				return;
			case SimulinkPackage.DECISION__ACTION_REFERENCE:
				setActionReference((String)newValue);
				return;
			case SimulinkPackage.DECISION__ID:
				setId((Integer)newValue);
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
			case SimulinkPackage.DECISION__DECISION_ENTRIES:
				getDecisionEntries().clear();
				return;
			case SimulinkPackage.DECISION__ACTION_REFERENCE:
				setActionReference(ACTION_REFERENCE_EDEFAULT);
				return;
			case SimulinkPackage.DECISION__ID:
				setId(ID_EDEFAULT);
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
			case SimulinkPackage.DECISION__DECISION_ENTRIES:
				return decisionEntries != null && !decisionEntries.isEmpty();
			case SimulinkPackage.DECISION__ACTION_REFERENCE:
				return ACTION_REFERENCE_EDEFAULT == null ? actionReference != null : !ACTION_REFERENCE_EDEFAULT.equals(actionReference);
			case SimulinkPackage.DECISION__ID:
				return id != ID_EDEFAULT;
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
		result.append(", id: ");
		result.append(id);
		result.append(')');
		return result.toString();
	}

} //DecisionImpl
