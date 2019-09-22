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
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import ca.ets.sofeess.breesse.simulink.Condition;
import ca.ets.sofeess.breesse.simulink.DecisionEntry;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Decision Entry</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl#getCondition <em>Condition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl#getConditionOutcome <em>Condition Outcome</em>}</li>
 * </ul>
 *
 * @generated
 */
public class DecisionEntryImpl extends MinimalEObjectImpl.Container implements DecisionEntry {
	/**
	 * The cached value of the '{@link #getCondition() <em>Condition</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCondition()
	 * @generated
	 * @ordered
	 */
	protected Condition condition;

	/**
	 * The default value of the '{@link #getConditionOutcome() <em>Condition Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionOutcome()
	 * @generated
	 * @ordered
	 */
	protected static final String CONDITION_OUTCOME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getConditionOutcome() <em>Condition Outcome</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionOutcome()
	 * @generated
	 * @ordered
	 */
	protected String conditionOutcome = CONDITION_OUTCOME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected DecisionEntryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.DECISION_ENTRY;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition getCondition() {
		if (condition != null && condition.eIsProxy()) {
			InternalEObject oldCondition = (InternalEObject)condition;
			condition = (Condition)eResolveProxy(oldCondition);
			if (condition != oldCondition) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.DECISION_ENTRY__CONDITION, oldCondition, condition));
			}
		}
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition basicGetCondition() {
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCondition(Condition newCondition) {
		Condition oldCondition = condition;
		condition = newCondition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.DECISION_ENTRY__CONDITION, oldCondition, condition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getConditionOutcome() {
		return conditionOutcome;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionOutcome(String newConditionOutcome) {
		String oldConditionOutcome = conditionOutcome;
		conditionOutcome = newConditionOutcome;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.DECISION_ENTRY__CONDITION_OUTCOME, oldConditionOutcome, conditionOutcome));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.DECISION_ENTRY__CONDITION:
				if (resolve) return getCondition();
				return basicGetCondition();
			case SimulinkPackage.DECISION_ENTRY__CONDITION_OUTCOME:
				return getConditionOutcome();
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
			case SimulinkPackage.DECISION_ENTRY__CONDITION:
				setCondition((Condition)newValue);
				return;
			case SimulinkPackage.DECISION_ENTRY__CONDITION_OUTCOME:
				setConditionOutcome((String)newValue);
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
			case SimulinkPackage.DECISION_ENTRY__CONDITION:
				setCondition((Condition)null);
				return;
			case SimulinkPackage.DECISION_ENTRY__CONDITION_OUTCOME:
				setConditionOutcome(CONDITION_OUTCOME_EDEFAULT);
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
			case SimulinkPackage.DECISION_ENTRY__CONDITION:
				return condition != null;
			case SimulinkPackage.DECISION_ENTRY__CONDITION_OUTCOME:
				return CONDITION_OUTCOME_EDEFAULT == null ? conditionOutcome != null : !CONDITION_OUTCOME_EDEFAULT.equals(conditionOutcome);
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
		result.append(" (conditionOutcome: ");
		result.append(conditionOutcome);
		result.append(')');
		return result.toString();
	}

} //DecisionEntryImpl
