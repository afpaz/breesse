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

import org.eclipse.emf.common.notify.NotificationChain;
import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.InternalEObject;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;
import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.ets.sofeess.breesse.simulink.Action;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.State;
import ca.ets.sofeess.breesse.simulink.Transition;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Action</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl#getStatement <em>Statement</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl#getTransition <em>Transition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl#getStateEntry <em>State Entry</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl#getStateDuring <em>State During</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl#getStateExit <em>State Exit</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ActionImpl extends MinimalEObjectImpl.Container implements Action {
	/**
	 * The default value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected static final String STATEMENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStatement() <em>Statement</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStatement()
	 * @generated
	 * @ordered
	 */
	protected String statement = STATEMENT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ActionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.ACTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getStatement() {
		return statement;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStatement(String newStatement) {
		String oldStatement = statement;
		statement = newStatement;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION__STATEMENT, oldStatement, statement));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition getTransition() {
		if (eContainerFeatureID() != SimulinkPackage.ACTION__TRANSITION) return null;
		return (Transition)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTransition(Transition newTransition, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newTransition, SimulinkPackage.ACTION__TRANSITION, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTransition(Transition newTransition) {
		if (newTransition != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.ACTION__TRANSITION && newTransition != null)) {
			if (EcoreUtil.isAncestor(this, newTransition))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newTransition != null)
				msgs = ((InternalEObject)newTransition).eInverseAdd(this, SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS, Transition.class, msgs);
			msgs = basicSetTransition(newTransition, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION__TRANSITION, newTransition, newTransition));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateEntry() {
		if (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_ENTRY) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateEntry(State newStateEntry, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateEntry, SimulinkPackage.ACTION__STATE_ENTRY, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateEntry(State newStateEntry) {
		if (newStateEntry != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_ENTRY && newStateEntry != null)) {
			if (EcoreUtil.isAncestor(this, newStateEntry))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateEntry != null)
				msgs = ((InternalEObject)newStateEntry).eInverseAdd(this, SimulinkPackage.STATE__ENTRY_ACTIONS, State.class, msgs);
			msgs = basicSetStateEntry(newStateEntry, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION__STATE_ENTRY, newStateEntry, newStateEntry));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateDuring() {
		if (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_DURING) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateDuring(State newStateDuring, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateDuring, SimulinkPackage.ACTION__STATE_DURING, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateDuring(State newStateDuring) {
		if (newStateDuring != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_DURING && newStateDuring != null)) {
			if (EcoreUtil.isAncestor(this, newStateDuring))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateDuring != null)
				msgs = ((InternalEObject)newStateDuring).eInverseAdd(this, SimulinkPackage.STATE__DURING_ACTIONS, State.class, msgs);
			msgs = basicSetStateDuring(newStateDuring, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION__STATE_DURING, newStateDuring, newStateDuring));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State getStateExit() {
		if (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_EXIT) return null;
		return (State)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetStateExit(State newStateExit, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newStateExit, SimulinkPackage.ACTION__STATE_EXIT, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStateExit(State newStateExit) {
		if (newStateExit != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.ACTION__STATE_EXIT && newStateExit != null)) {
			if (EcoreUtil.isAncestor(this, newStateExit))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newStateExit != null)
				msgs = ((InternalEObject)newStateExit).eInverseAdd(this, SimulinkPackage.STATE__EXIT_ACTIONS, State.class, msgs);
			msgs = basicSetStateExit(newStateExit, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.ACTION__STATE_EXIT, newStateExit, newStateExit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.ACTION__TRANSITION:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetTransition((Transition)otherEnd, msgs);
			case SimulinkPackage.ACTION__STATE_ENTRY:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateEntry((State)otherEnd, msgs);
			case SimulinkPackage.ACTION__STATE_DURING:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateDuring((State)otherEnd, msgs);
			case SimulinkPackage.ACTION__STATE_EXIT:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetStateExit((State)otherEnd, msgs);
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
			case SimulinkPackage.ACTION__TRANSITION:
				return basicSetTransition(null, msgs);
			case SimulinkPackage.ACTION__STATE_ENTRY:
				return basicSetStateEntry(null, msgs);
			case SimulinkPackage.ACTION__STATE_DURING:
				return basicSetStateDuring(null, msgs);
			case SimulinkPackage.ACTION__STATE_EXIT:
				return basicSetStateExit(null, msgs);
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
			case SimulinkPackage.ACTION__TRANSITION:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS, Transition.class, msgs);
			case SimulinkPackage.ACTION__STATE_ENTRY:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.STATE__ENTRY_ACTIONS, State.class, msgs);
			case SimulinkPackage.ACTION__STATE_DURING:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.STATE__DURING_ACTIONS, State.class, msgs);
			case SimulinkPackage.ACTION__STATE_EXIT:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.STATE__EXIT_ACTIONS, State.class, msgs);
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
			case SimulinkPackage.ACTION__STATEMENT:
				return getStatement();
			case SimulinkPackage.ACTION__TRANSITION:
				return getTransition();
			case SimulinkPackage.ACTION__STATE_ENTRY:
				return getStateEntry();
			case SimulinkPackage.ACTION__STATE_DURING:
				return getStateDuring();
			case SimulinkPackage.ACTION__STATE_EXIT:
				return getStateExit();
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
			case SimulinkPackage.ACTION__STATEMENT:
				setStatement((String)newValue);
				return;
			case SimulinkPackage.ACTION__TRANSITION:
				setTransition((Transition)newValue);
				return;
			case SimulinkPackage.ACTION__STATE_ENTRY:
				setStateEntry((State)newValue);
				return;
			case SimulinkPackage.ACTION__STATE_DURING:
				setStateDuring((State)newValue);
				return;
			case SimulinkPackage.ACTION__STATE_EXIT:
				setStateExit((State)newValue);
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
			case SimulinkPackage.ACTION__STATEMENT:
				setStatement(STATEMENT_EDEFAULT);
				return;
			case SimulinkPackage.ACTION__TRANSITION:
				setTransition((Transition)null);
				return;
			case SimulinkPackage.ACTION__STATE_ENTRY:
				setStateEntry((State)null);
				return;
			case SimulinkPackage.ACTION__STATE_DURING:
				setStateDuring((State)null);
				return;
			case SimulinkPackage.ACTION__STATE_EXIT:
				setStateExit((State)null);
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
			case SimulinkPackage.ACTION__STATEMENT:
				return STATEMENT_EDEFAULT == null ? statement != null : !STATEMENT_EDEFAULT.equals(statement);
			case SimulinkPackage.ACTION__TRANSITION:
				return getTransition() != null;
			case SimulinkPackage.ACTION__STATE_ENTRY:
				return getStateEntry() != null;
			case SimulinkPackage.ACTION__STATE_DURING:
				return getStateDuring() != null;
			case SimulinkPackage.ACTION__STATE_EXIT:
				return getStateExit() != null;
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
		result.append(" (statement: ");
		result.append(statement);
		result.append(')');
		return result.toString();
	}

} //ActionImpl
