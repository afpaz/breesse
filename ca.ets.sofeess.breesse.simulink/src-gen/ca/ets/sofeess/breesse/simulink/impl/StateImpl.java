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
import org.eclipse.emf.ecore.util.EObjectContainmentWithInverseEList;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ets.sofeess.breesse.simulink.Action;
import ca.ets.sofeess.breesse.simulink.CompositeStateflowElement;
import ca.ets.sofeess.breesse.simulink.ContainableStateflowElement;
import ca.ets.sofeess.breesse.simulink.DecompositionType;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.State;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>State</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getChildren <em>Children</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getDecomposition <em>Decomposition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getEntryActions <em>Entry Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getDuringActions <em>During Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl#getExitActions <em>Exit Actions</em>}</li>
 * </ul>
 *
 * @generated
 */
public class StateImpl extends VertexImpl implements State {
	/**
	 * The cached value of the '{@link #getChildren() <em>Children</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChildren()
	 * @generated
	 * @ordered
	 */
	protected EList<ContainableStateflowElement> children;

	/**
	 * The default value of the '{@link #getDecomposition() <em>Decomposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposition()
	 * @generated
	 * @ordered
	 */
	protected static final DecompositionType DECOMPOSITION_EDEFAULT = DecompositionType.EXCLUSIVE_OR;

	/**
	 * The cached value of the '{@link #getDecomposition() <em>Decomposition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDecomposition()
	 * @generated
	 * @ordered
	 */
	protected DecompositionType decomposition = DECOMPOSITION_EDEFAULT;

	/**
	 * The default value of the '{@link #getExecutionOrder() <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected static final int EXECUTION_ORDER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getExecutionOrder() <em>Execution Order</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExecutionOrder()
	 * @generated
	 * @ordered
	 */
	protected int executionOrder = EXECUTION_ORDER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getEntryActions() <em>Entry Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEntryActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> entryActions;

	/**
	 * The cached value of the '{@link #getDuringActions() <em>During Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDuringActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> duringActions;

	/**
	 * The cached value of the '{@link #getExitActions() <em>Exit Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getExitActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> exitActions;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected StateImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.STATE;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<ContainableStateflowElement> getChildren() {
		if (children == null) {
			children = new EObjectContainmentWithInverseEList<ContainableStateflowElement>(ContainableStateflowElement.class, this, SimulinkPackage.STATE__CHILDREN, SimulinkPackage.CONTAINABLE_STATEFLOW_ELEMENT__PARENT);
		}
		return children;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType getDecomposition() {
		return decomposition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDecomposition(DecompositionType newDecomposition) {
		DecompositionType oldDecomposition = decomposition;
		decomposition = newDecomposition == null ? DECOMPOSITION_EDEFAULT : newDecomposition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.STATE__DECOMPOSITION, oldDecomposition, decomposition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getExecutionOrder() {
		return executionOrder;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setExecutionOrder(int newExecutionOrder) {
		int oldExecutionOrder = executionOrder;
		executionOrder = newExecutionOrder;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.STATE__EXECUTION_ORDER, oldExecutionOrder, executionOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getEntryActions() {
		if (entryActions == null) {
			entryActions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, SimulinkPackage.STATE__ENTRY_ACTIONS, SimulinkPackage.ACTION__STATE_ENTRY);
		}
		return entryActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getDuringActions() {
		if (duringActions == null) {
			duringActions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, SimulinkPackage.STATE__DURING_ACTIONS, SimulinkPackage.ACTION__STATE_DURING);
		}
		return duringActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getExitActions() {
		if (exitActions == null) {
			exitActions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, SimulinkPackage.STATE__EXIT_ACTIONS, SimulinkPackage.ACTION__STATE_EXIT);
		}
		return exitActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.STATE__CHILDREN:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getChildren()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getEntryActions()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.STATE__DURING_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getDuringActions()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getExitActions()).basicAdd(otherEnd, msgs);
		}
		return super.eInverseAdd(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.STATE__CHILDREN:
				return ((InternalEList<?>)getChildren()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				return ((InternalEList<?>)getEntryActions()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.STATE__DURING_ACTIONS:
				return ((InternalEList<?>)getDuringActions()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				return ((InternalEList<?>)getExitActions()).basicRemove(otherEnd, msgs);
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
			case SimulinkPackage.STATE__CHILDREN:
				return getChildren();
			case SimulinkPackage.STATE__DECOMPOSITION:
				return getDecomposition();
			case SimulinkPackage.STATE__EXECUTION_ORDER:
				return getExecutionOrder();
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				return getEntryActions();
			case SimulinkPackage.STATE__DURING_ACTIONS:
				return getDuringActions();
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				return getExitActions();
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
			case SimulinkPackage.STATE__CHILDREN:
				getChildren().clear();
				getChildren().addAll((Collection<? extends ContainableStateflowElement>)newValue);
				return;
			case SimulinkPackage.STATE__DECOMPOSITION:
				setDecomposition((DecompositionType)newValue);
				return;
			case SimulinkPackage.STATE__EXECUTION_ORDER:
				setExecutionOrder((Integer)newValue);
				return;
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				getEntryActions().clear();
				getEntryActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SimulinkPackage.STATE__DURING_ACTIONS:
				getDuringActions().clear();
				getDuringActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				getExitActions().clear();
				getExitActions().addAll((Collection<? extends Action>)newValue);
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
			case SimulinkPackage.STATE__CHILDREN:
				getChildren().clear();
				return;
			case SimulinkPackage.STATE__DECOMPOSITION:
				setDecomposition(DECOMPOSITION_EDEFAULT);
				return;
			case SimulinkPackage.STATE__EXECUTION_ORDER:
				setExecutionOrder(EXECUTION_ORDER_EDEFAULT);
				return;
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				getEntryActions().clear();
				return;
			case SimulinkPackage.STATE__DURING_ACTIONS:
				getDuringActions().clear();
				return;
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				getExitActions().clear();
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
			case SimulinkPackage.STATE__CHILDREN:
				return children != null && !children.isEmpty();
			case SimulinkPackage.STATE__DECOMPOSITION:
				return decomposition != DECOMPOSITION_EDEFAULT;
			case SimulinkPackage.STATE__EXECUTION_ORDER:
				return executionOrder != EXECUTION_ORDER_EDEFAULT;
			case SimulinkPackage.STATE__ENTRY_ACTIONS:
				return entryActions != null && !entryActions.isEmpty();
			case SimulinkPackage.STATE__DURING_ACTIONS:
				return duringActions != null && !duringActions.isEmpty();
			case SimulinkPackage.STATE__EXIT_ACTIONS:
				return exitActions != null && !exitActions.isEmpty();
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == CompositeStateflowElement.class) {
			switch (derivedFeatureID) {
				case SimulinkPackage.STATE__CHILDREN: return SimulinkPackage.COMPOSITE_STATEFLOW_ELEMENT__CHILDREN;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == CompositeStateflowElement.class) {
			switch (baseFeatureID) {
				case SimulinkPackage.COMPOSITE_STATEFLOW_ELEMENT__CHILDREN: return SimulinkPackage.STATE__CHILDREN;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
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
		result.append(" (decomposition: ");
		result.append(decomposition);
		result.append(", executionOrder: ");
		result.append(executionOrder);
		result.append(')');
		return result.toString();
	}

} //StateImpl
