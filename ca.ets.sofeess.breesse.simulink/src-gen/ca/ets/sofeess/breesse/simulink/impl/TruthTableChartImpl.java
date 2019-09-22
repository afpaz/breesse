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
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecore.util.InternalEList;

import ca.ets.sofeess.breesse.simulink.Block;
import ca.ets.sofeess.breesse.simulink.Port;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.SubSystem;
import ca.ets.sofeess.breesse.simulink.TruthTableChart;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Truth Table Chart</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl#getOwnedPorts <em>Owned Ports</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl#getParent <em>Parent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TruthTableChartImpl extends TruthTableImpl implements TruthTableChart {
	/**
	 * The cached value of the '{@link #getOwnedPorts() <em>Owned Ports</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOwnedPorts()
	 * @generated
	 * @ordered
	 */
	protected EList<Port> ownedPorts;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TruthTableChartImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.TRUTH_TABLE_CHART;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Port> getOwnedPorts() {
		if (ownedPorts == null) {
			ownedPorts = new EObjectContainmentWithInverseEList<Port>(Port.class, this, SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS, SimulinkPackage.PORT__BLOCK);
		}
		return ownedPorts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem getParent() {
		if (eContainerFeatureID() != SimulinkPackage.TRUTH_TABLE_CHART__PARENT) return null;
		return (SubSystem)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetParent(SubSystem newParent, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newParent, SimulinkPackage.TRUTH_TABLE_CHART__PARENT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setParent(SubSystem newParent) {
		if (newParent != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.TRUTH_TABLE_CHART__PARENT && newParent != null)) {
			if (EcoreUtil.isAncestor(this, newParent))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newParent != null)
				msgs = ((InternalEObject)newParent).eInverseAdd(this, SimulinkPackage.SUB_SYSTEM__SUB_BLOCKS, SubSystem.class, msgs);
			msgs = basicSetParent(newParent, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRUTH_TABLE_CHART__PARENT, newParent, newParent));
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
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getOwnedPorts()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetParent((SubSystem)otherEnd, msgs);
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
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				return ((InternalEList<?>)getOwnedPorts()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				return basicSetParent(null, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eBasicRemoveFromContainerFeature(NotificationChain msgs) {
		switch (eContainerFeatureID()) {
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.SUB_SYSTEM__SUB_BLOCKS, SubSystem.class, msgs);
		}
		return super.eBasicRemoveFromContainerFeature(msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				return getOwnedPorts();
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				return getParent();
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
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				getOwnedPorts().clear();
				getOwnedPorts().addAll((Collection<? extends Port>)newValue);
				return;
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				setParent((SubSystem)newValue);
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
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				getOwnedPorts().clear();
				return;
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				setParent((SubSystem)null);
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
			case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS:
				return ownedPorts != null && !ownedPorts.isEmpty();
			case SimulinkPackage.TRUTH_TABLE_CHART__PARENT:
				return getParent() != null;
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
		if (baseClass == Block.class) {
			switch (derivedFeatureID) {
				case SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS: return SimulinkPackage.BLOCK__OWNED_PORTS;
				case SimulinkPackage.TRUTH_TABLE_CHART__PARENT: return SimulinkPackage.BLOCK__PARENT;
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
		if (baseClass == Block.class) {
			switch (baseFeatureID) {
				case SimulinkPackage.BLOCK__OWNED_PORTS: return SimulinkPackage.TRUTH_TABLE_CHART__OWNED_PORTS;
				case SimulinkPackage.BLOCK__PARENT: return SimulinkPackage.TRUTH_TABLE_CHART__PARENT;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

} //TruthTableChartImpl
