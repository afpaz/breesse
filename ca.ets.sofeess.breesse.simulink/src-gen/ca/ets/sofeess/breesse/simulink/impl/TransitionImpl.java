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
import ca.ets.sofeess.breesse.simulink.SFWGuard;
import ca.ets.sofeess.breesse.simulink.SFWTrigger;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.Transition;
import ca.ets.sofeess.breesse.simulink.Vertex;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Transition</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getDestination <em>Destination</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getGuard <em>Guard</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getTriggeredActions <em>Triggered Actions</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#isIsDefaultTransition <em>Is Default Transition</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getExecutionOrder <em>Execution Order</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl#getTrigger <em>Trigger</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TransitionImpl extends ContainableStateflowElementImpl implements Transition {
	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected Vertex source;

	/**
	 * The cached value of the '{@link #getDestination() <em>Destination</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDestination()
	 * @generated
	 * @ordered
	 */
	protected Vertex destination;

	/**
	 * The cached value of the '{@link #getGuard() <em>Guard</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGuard()
	 * @generated
	 * @ordered
	 */
	protected SFWGuard guard;

	/**
	 * The cached value of the '{@link #getTriggeredActions() <em>Triggered Actions</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriggeredActions()
	 * @generated
	 * @ordered
	 */
	protected EList<Action> triggeredActions;

	/**
	 * The default value of the '{@link #isIsDefaultTransition() <em>Is Default Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultTransition()
	 * @generated
	 * @ordered
	 */
	protected static final boolean IS_DEFAULT_TRANSITION_EDEFAULT = false;

	/**
	 * The cached value of the '{@link #isIsDefaultTransition() <em>Is Default Transition</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #isIsDefaultTransition()
	 * @generated
	 * @ordered
	 */
	protected boolean isDefaultTransition = IS_DEFAULT_TRANSITION_EDEFAULT;

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
	 * The cached value of the '{@link #getTrigger() <em>Trigger</em>}' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTrigger()
	 * @generated
	 * @ordered
	 */
	protected SFWTrigger trigger;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TransitionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.TRANSITION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getSource() {
		if (source != null && source.eIsProxy()) {
			InternalEObject oldSource = (InternalEObject)source;
			source = (Vertex)eResolveProxy(oldSource);
			if (source != oldSource) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.TRANSITION__SOURCE, oldSource, source));
			}
		}
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetSource(Vertex newSource, NotificationChain msgs) {
		Vertex oldSource = source;
		source = newSource;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__SOURCE, oldSource, newSource);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSource(Vertex newSource) {
		if (newSource != source) {
			NotificationChain msgs = null;
			if (source != null)
				msgs = ((InternalEObject)source).eInverseRemove(this, SimulinkPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
			if (newSource != null)
				msgs = ((InternalEObject)newSource).eInverseAdd(this, SimulinkPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
			msgs = basicSetSource(newSource, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__SOURCE, newSource, newSource));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex getDestination() {
		if (destination != null && destination.eIsProxy()) {
			InternalEObject oldDestination = (InternalEObject)destination;
			destination = (Vertex)eResolveProxy(oldDestination);
			if (destination != oldDestination) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.TRANSITION__DESTINATION, oldDestination, destination));
			}
		}
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Vertex basicGetDestination() {
		return destination;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetDestination(Vertex newDestination, NotificationChain msgs) {
		Vertex oldDestination = destination;
		destination = newDestination;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__DESTINATION, oldDestination, newDestination);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDestination(Vertex newDestination) {
		if (newDestination != destination) {
			NotificationChain msgs = null;
			if (destination != null)
				msgs = ((InternalEObject)destination).eInverseRemove(this, SimulinkPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
			if (newDestination != null)
				msgs = ((InternalEObject)newDestination).eInverseAdd(this, SimulinkPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
			msgs = basicSetDestination(newDestination, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__DESTINATION, newDestination, newDestination));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFWGuard getGuard() {
		return guard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetGuard(SFWGuard newGuard, NotificationChain msgs) {
		SFWGuard oldGuard = guard;
		guard = newGuard;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__GUARD, oldGuard, newGuard);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGuard(SFWGuard newGuard) {
		if (newGuard != guard) {
			NotificationChain msgs = null;
			if (guard != null)
				msgs = ((InternalEObject)guard).eInverseRemove(this, SimulinkPackage.SFW_GUARD__TRANSITION, SFWGuard.class, msgs);
			if (newGuard != null)
				msgs = ((InternalEObject)newGuard).eInverseAdd(this, SimulinkPackage.SFW_GUARD__TRANSITION, SFWGuard.class, msgs);
			msgs = basicSetGuard(newGuard, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__GUARD, newGuard, newGuard));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Action> getTriggeredActions() {
		if (triggeredActions == null) {
			triggeredActions = new EObjectContainmentWithInverseEList<Action>(Action.class, this, SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS, SimulinkPackage.ACTION__TRANSITION);
		}
		return triggeredActions;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public boolean isIsDefaultTransition() {
		return isDefaultTransition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIsDefaultTransition(boolean newIsDefaultTransition) {
		boolean oldIsDefaultTransition = isDefaultTransition;
		isDefaultTransition = newIsDefaultTransition;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION, oldIsDefaultTransition, isDefaultTransition));
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
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__EXECUTION_ORDER, oldExecutionOrder, executionOrder));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFWTrigger getTrigger() {
		return trigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetTrigger(SFWTrigger newTrigger, NotificationChain msgs) {
		SFWTrigger oldTrigger = trigger;
		trigger = newTrigger;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__TRIGGER, oldTrigger, newTrigger);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTrigger(SFWTrigger newTrigger) {
		if (newTrigger != trigger) {
			NotificationChain msgs = null;
			if (trigger != null)
				msgs = ((InternalEObject)trigger).eInverseRemove(this, SimulinkPackage.SFW_TRIGGER__TRANSITION, SFWTrigger.class, msgs);
			if (newTrigger != null)
				msgs = ((InternalEObject)newTrigger).eInverseAdd(this, SimulinkPackage.SFW_TRIGGER__TRANSITION, SFWTrigger.class, msgs);
			msgs = basicSetTrigger(newTrigger, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.TRANSITION__TRIGGER, newTrigger, newTrigger));
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
			case SimulinkPackage.TRANSITION__SOURCE:
				if (source != null)
					msgs = ((InternalEObject)source).eInverseRemove(this, SimulinkPackage.VERTEX__OUTGOING_TRANSITIONS, Vertex.class, msgs);
				return basicSetSource((Vertex)otherEnd, msgs);
			case SimulinkPackage.TRANSITION__DESTINATION:
				if (destination != null)
					msgs = ((InternalEObject)destination).eInverseRemove(this, SimulinkPackage.VERTEX__INCOMING_TRANSITIONS, Vertex.class, msgs);
				return basicSetDestination((Vertex)otherEnd, msgs);
			case SimulinkPackage.TRANSITION__GUARD:
				if (guard != null)
					msgs = ((InternalEObject)guard).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRANSITION__GUARD, null, msgs);
				return basicSetGuard((SFWGuard)otherEnd, msgs);
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				return ((InternalEList<InternalEObject>)(InternalEList<?>)getTriggeredActions()).basicAdd(otherEnd, msgs);
			case SimulinkPackage.TRANSITION__TRIGGER:
				if (trigger != null)
					msgs = ((InternalEObject)trigger).eInverseRemove(this, EOPPOSITE_FEATURE_BASE - SimulinkPackage.TRANSITION__TRIGGER, null, msgs);
				return basicSetTrigger((SFWTrigger)otherEnd, msgs);
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
			case SimulinkPackage.TRANSITION__SOURCE:
				return basicSetSource(null, msgs);
			case SimulinkPackage.TRANSITION__DESTINATION:
				return basicSetDestination(null, msgs);
			case SimulinkPackage.TRANSITION__GUARD:
				return basicSetGuard(null, msgs);
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				return ((InternalEList<?>)getTriggeredActions()).basicRemove(otherEnd, msgs);
			case SimulinkPackage.TRANSITION__TRIGGER:
				return basicSetTrigger(null, msgs);
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
			case SimulinkPackage.TRANSITION__SOURCE:
				if (resolve) return getSource();
				return basicGetSource();
			case SimulinkPackage.TRANSITION__DESTINATION:
				if (resolve) return getDestination();
				return basicGetDestination();
			case SimulinkPackage.TRANSITION__GUARD:
				return getGuard();
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				return getTriggeredActions();
			case SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION:
				return isIsDefaultTransition();
			case SimulinkPackage.TRANSITION__EXECUTION_ORDER:
				return getExecutionOrder();
			case SimulinkPackage.TRANSITION__TRIGGER:
				return getTrigger();
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
			case SimulinkPackage.TRANSITION__SOURCE:
				setSource((Vertex)newValue);
				return;
			case SimulinkPackage.TRANSITION__DESTINATION:
				setDestination((Vertex)newValue);
				return;
			case SimulinkPackage.TRANSITION__GUARD:
				setGuard((SFWGuard)newValue);
				return;
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				getTriggeredActions().clear();
				getTriggeredActions().addAll((Collection<? extends Action>)newValue);
				return;
			case SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION:
				setIsDefaultTransition((Boolean)newValue);
				return;
			case SimulinkPackage.TRANSITION__EXECUTION_ORDER:
				setExecutionOrder((Integer)newValue);
				return;
			case SimulinkPackage.TRANSITION__TRIGGER:
				setTrigger((SFWTrigger)newValue);
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
			case SimulinkPackage.TRANSITION__SOURCE:
				setSource((Vertex)null);
				return;
			case SimulinkPackage.TRANSITION__DESTINATION:
				setDestination((Vertex)null);
				return;
			case SimulinkPackage.TRANSITION__GUARD:
				setGuard((SFWGuard)null);
				return;
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				getTriggeredActions().clear();
				return;
			case SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION:
				setIsDefaultTransition(IS_DEFAULT_TRANSITION_EDEFAULT);
				return;
			case SimulinkPackage.TRANSITION__EXECUTION_ORDER:
				setExecutionOrder(EXECUTION_ORDER_EDEFAULT);
				return;
			case SimulinkPackage.TRANSITION__TRIGGER:
				setTrigger((SFWTrigger)null);
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
			case SimulinkPackage.TRANSITION__SOURCE:
				return source != null;
			case SimulinkPackage.TRANSITION__DESTINATION:
				return destination != null;
			case SimulinkPackage.TRANSITION__GUARD:
				return guard != null;
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
				return triggeredActions != null && !triggeredActions.isEmpty();
			case SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION:
				return isDefaultTransition != IS_DEFAULT_TRANSITION_EDEFAULT;
			case SimulinkPackage.TRANSITION__EXECUTION_ORDER:
				return executionOrder != EXECUTION_ORDER_EDEFAULT;
			case SimulinkPackage.TRANSITION__TRIGGER:
				return trigger != null;
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
		result.append(" (isDefaultTransition: ");
		result.append(isDefaultTransition);
		result.append(", executionOrder: ");
		result.append(executionOrder);
		result.append(')');
		return result.toString();
	}

} //TransitionImpl
