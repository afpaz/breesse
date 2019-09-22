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

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ets.sofeess.breesse.simulink.ActionTable;
import ca.ets.sofeess.breesse.simulink.ConditionTable;
import ca.ets.sofeess.breesse.simulink.Data;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.TruthTable;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Truth Table</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl#getConditionTable <em>Condition Table</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl#getActionTable <em>Action Table</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl#getData <em>Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public abstract class TruthTableImpl extends StateflowElementImpl implements TruthTable {
	/**
	 * The cached value of the '{@link #getConditionTable() <em>Condition Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConditionTable()
	 * @generated
	 * @ordered
	 */
	protected ConditionTable conditionTable;

	/**
	 * The cached value of the '{@link #getActionTable() <em>Action Table</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getActionTable()
	 * @generated
	 * @ordered
	 */
	protected ActionTable actionTable;

	/**
	 * The cached value of the '{@link #getData() <em>Data</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getData()
	 * @generated
	 * @ordered
	 */
	protected EList<Data> data;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TruthTableImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.TRUTH_TABLE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionTable getConditionTable() {
		return conditionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConditionTable(ConditionTable newConditionTable, NotificationChain msgs) {
		ConditionTable oldConditionTable = conditionTable;
		conditionTable = newConditionTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE, oldConditionTable, newConditionTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConditionTable(ConditionTable newConditionTable) {
		if (newConditionTable != conditionTable) {
			NotificationChain msgs = null;
			if (conditionTable != null)
				msgs = ((InternalEObject)conditionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE, null, msgs);
			if (newConditionTable != null)
				msgs = ((InternalEObject)newConditionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE, null, msgs);
			msgs = basicSetConditionTable(newConditionTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE, newConditionTable, newConditionTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTable getActionTable() {
		return actionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetActionTable(ActionTable newActionTable, NotificationChain msgs) {
		ActionTable oldActionTable = actionTable;
		actionTable = newActionTable;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRUTH_TABLE__ACTION_TABLE, oldActionTable, newActionTable);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setActionTable(ActionTable newActionTable) {
		if (newActionTable != actionTable) {
			NotificationChain msgs = null;
			if (actionTable != null)
				msgs = ((InternalEObject)actionTable).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRUTH_TABLE__ACTION_TABLE, null, msgs);
			if (newActionTable != null)
				msgs = ((InternalEObject)newActionTable).eInverseAdd(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRUTH_TABLE__ACTION_TABLE, null, msgs);
			msgs = basicSetActionTable(newActionTable, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRUTH_TABLE__ACTION_TABLE, newActionTable, newActionTable));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Data> getData() {
		if (data == null) {
			data = new EObjectContainmentEList<Data>(Data.class, this, SimulinkPackage.TRUTH_TABLE__DATA);
		}
		return data;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE:
				return basicSetConditionTable(null, msgs);
			case SimulinkPackage.TRUTH_TABLE__ACTION_TABLE:
				return basicSetActionTable(null, msgs);
			case SimulinkPackage.TRUTH_TABLE__DATA:
				return ((InternalEList<?>)getData()).basicRemove(otherEnd, msgs);
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
			case SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE:
				return getConditionTable();
			case SimulinkPackage.TRUTH_TABLE__ACTION_TABLE:
				return getActionTable();
			case SimulinkPackage.TRUTH_TABLE__DATA:
				return getData();
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
			case SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE:
				setConditionTable((ConditionTable)newValue);
				return;
			case SimulinkPackage.TRUTH_TABLE__ACTION_TABLE:
				setActionTable((ActionTable)newValue);
				return;
			case SimulinkPackage.TRUTH_TABLE__DATA:
				getData().clear();
				getData().addAll((Collection<? extends Data>)newValue);
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
			case SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE:
				setConditionTable((ConditionTable)null);
				return;
			case SimulinkPackage.TRUTH_TABLE__ACTION_TABLE:
				setActionTable((ActionTable)null);
				return;
			case SimulinkPackage.TRUTH_TABLE__DATA:
				getData().clear();
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
			case SimulinkPackage.TRUTH_TABLE__CONDITION_TABLE:
				return conditionTable != null;
			case SimulinkPackage.TRUTH_TABLE__ACTION_TABLE:
				return actionTable != null;
			case SimulinkPackage.TRUTH_TABLE__DATA:
				return data != null && !data.isEmpty();
		}
		return super.eIsSet(featureID);
	}

} //TruthTableImpl
