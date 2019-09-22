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

import org.eclipse.emf.ecore.util.EcoreUtil;

import ca.ets.sofeess.breesse.simulink.Block;
import ca.ets.sofeess.breesse.simulink.Connection;
import ca.ets.sofeess.breesse.simulink.InPort;
import ca.ets.sofeess.breesse.simulink.InputData;
import ca.ets.sofeess.breesse.simulink.Port;
import ca.ets.sofeess.breesse.simulink.PortBlock;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Input Data</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl#getBlock <em>Block</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl#getPortBlock <em>Port Block</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl#getDataType <em>Data Type</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl#getPortNumber <em>Port Number</em>}</li>
 *   <li>{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl#getConnection <em>Connection</em>}</li>
 * </ul>
 *
 * @generated
 */
public class InputDataImpl extends DataImpl implements InputData {
	/**
	 * The cached value of the '{@link #getPortBlock() <em>Port Block</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortBlock()
	 * @generated
	 * @ordered
	 */
	protected PortBlock portBlock;

	/**
	 * The default value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected static final String DATA_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataType() <em>Data Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataType()
	 * @generated
	 * @ordered
	 */
	protected String dataType = DATA_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_NUMBER_EDEFAULT = 0;

	/**
	 * The cached value of the '{@link #getPortNumber() <em>Port Number</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPortNumber()
	 * @generated
	 * @ordered
	 */
	protected int portNumber = PORT_NUMBER_EDEFAULT;

	/**
	 * The cached value of the '{@link #getConnection() <em>Connection</em>}' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getConnection()
	 * @generated
	 * @ordered
	 */
	protected Connection connection;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected InputDataImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return SimulinkPackage.Literals.INPUT_DATA;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block getBlock() {
		if (eContainerFeatureID() != SimulinkPackage.INPUT_DATA__BLOCK) return null;
		return (Block)eInternalContainer();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetBlock(Block newBlock, NotificationChain msgs) {
		msgs = eBasicSetContainer((InternalEObject)newBlock, SimulinkPackage.INPUT_DATA__BLOCK, msgs);
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBlock(Block newBlock) {
		if (newBlock != eInternalContainer() || (eContainerFeatureID() != SimulinkPackage.INPUT_DATA__BLOCK && newBlock != null)) {
			if (EcoreUtil.isAncestor(this, newBlock))
				throw new IllegalArgumentException("Recursive containment not allowed for " + toString());
			NotificationChain msgs = null;
			if (eInternalContainer() != null)
				msgs = eBasicRemoveFromContainer(msgs);
			if (newBlock != null)
				msgs = ((InternalEObject)newBlock).eInverseAdd(this, SimulinkPackage.BLOCK__OWNED_PORTS, Block.class, msgs);
			msgs = basicSetBlock(newBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__BLOCK, newBlock, newBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortBlock getPortBlock() {
		if (portBlock != null && portBlock.eIsProxy()) {
			InternalEObject oldPortBlock = (InternalEObject)portBlock;
			portBlock = (PortBlock)eResolveProxy(oldPortBlock);
			if (portBlock != oldPortBlock) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.INPUT_DATA__PORT_BLOCK, oldPortBlock, portBlock));
			}
		}
		return portBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public PortBlock basicGetPortBlock() {
		return portBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetPortBlock(PortBlock newPortBlock, NotificationChain msgs) {
		PortBlock oldPortBlock = portBlock;
		portBlock = newPortBlock;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__PORT_BLOCK, oldPortBlock, newPortBlock);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortBlock(PortBlock newPortBlock) {
		if (newPortBlock != portBlock) {
			NotificationChain msgs = null;
			if (portBlock != null)
				msgs = ((InternalEObject)portBlock).eInverseRemove(this, SimulinkPackage.PORT_BLOCK__PORT, PortBlock.class, msgs);
			if (newPortBlock != null)
				msgs = ((InternalEObject)newPortBlock).eInverseAdd(this, SimulinkPackage.PORT_BLOCK__PORT, PortBlock.class, msgs);
			msgs = basicSetPortBlock(newPortBlock, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__PORT_BLOCK, newPortBlock, newPortBlock));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDataType() {
		return dataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataType(String newDataType) {
		String oldDataType = dataType;
		dataType = newDataType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__DATA_TYPE, oldDataType, dataType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getPortNumber() {
		return portNumber;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPortNumber(int newPortNumber) {
		int oldPortNumber = portNumber;
		portNumber = newPortNumber;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__PORT_NUMBER, oldPortNumber, portNumber));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection getConnection() {
		if (connection != null && connection.eIsProxy()) {
			InternalEObject oldConnection = (InternalEObject)connection;
			connection = (Connection)eResolveProxy(oldConnection);
			if (connection != oldConnection) {
				if (eNotificationRequired())
					eNotify(new ENotificationImpl(this, Notification.RESOLVE, SimulinkPackage.INPUT_DATA__CONNECTION, oldConnection, connection));
			}
		}
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection basicGetConnection() {
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public NotificationChain basicSetConnection(Connection newConnection, NotificationChain msgs) {
		Connection oldConnection = connection;
		connection = newConnection;
		if (eNotificationRequired()) {
			ENotificationImpl notification = new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__CONNECTION, oldConnection, newConnection);
			if (msgs == null) msgs = notification; else msgs.add(notification);
		}
		return msgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setConnection(Connection newConnection) {
		if (newConnection != connection) {
			NotificationChain msgs = null;
			if (connection != null)
				msgs = ((InternalEObject)connection).eInverseRemove(this, SimulinkPackage.CONNECTION__TO, Connection.class, msgs);
			if (newConnection != null)
				msgs = ((InternalEObject)newConnection).eInverseAdd(this, SimulinkPackage.CONNECTION__TO, Connection.class, msgs);
			msgs = basicSetConnection(newConnection, msgs);
			if (msgs != null) msgs.dispatch();
		}
		else if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, SimulinkPackage.INPUT_DATA__CONNECTION, newConnection, newConnection));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseAdd(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case SimulinkPackage.INPUT_DATA__BLOCK:
				if (eInternalContainer() != null)
					msgs = eBasicRemoveFromContainer(msgs);
				return basicSetBlock((Block)otherEnd, msgs);
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				if (portBlock != null)
					msgs = ((InternalEObject)portBlock).eInverseRemove(this, SimulinkPackage.PORT_BLOCK__PORT, PortBlock.class, msgs);
				return basicSetPortBlock((PortBlock)otherEnd, msgs);
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				if (connection != null)
					msgs = ((InternalEObject)connection).eInverseRemove(this, SimulinkPackage.CONNECTION__TO, Connection.class, msgs);
				return basicSetConnection((Connection)otherEnd, msgs);
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				return basicSetBlock(null, msgs);
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				return basicSetPortBlock(null, msgs);
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				return basicSetConnection(null, msgs);
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				return eInternalContainer().eInverseRemove(this, SimulinkPackage.BLOCK__OWNED_PORTS, Block.class, msgs);
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				return getBlock();
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				if (resolve) return getPortBlock();
				return basicGetPortBlock();
			case SimulinkPackage.INPUT_DATA__DATA_TYPE:
				return getDataType();
			case SimulinkPackage.INPUT_DATA__PORT_NUMBER:
				return getPortNumber();
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				if (resolve) return getConnection();
				return basicGetConnection();
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				setBlock((Block)newValue);
				return;
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				setPortBlock((PortBlock)newValue);
				return;
			case SimulinkPackage.INPUT_DATA__DATA_TYPE:
				setDataType((String)newValue);
				return;
			case SimulinkPackage.INPUT_DATA__PORT_NUMBER:
				setPortNumber((Integer)newValue);
				return;
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				setConnection((Connection)newValue);
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				setBlock((Block)null);
				return;
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				setPortBlock((PortBlock)null);
				return;
			case SimulinkPackage.INPUT_DATA__DATA_TYPE:
				setDataType(DATA_TYPE_EDEFAULT);
				return;
			case SimulinkPackage.INPUT_DATA__PORT_NUMBER:
				setPortNumber(PORT_NUMBER_EDEFAULT);
				return;
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				setConnection((Connection)null);
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
			case SimulinkPackage.INPUT_DATA__BLOCK:
				return getBlock() != null;
			case SimulinkPackage.INPUT_DATA__PORT_BLOCK:
				return portBlock != null;
			case SimulinkPackage.INPUT_DATA__DATA_TYPE:
				return DATA_TYPE_EDEFAULT == null ? dataType != null : !DATA_TYPE_EDEFAULT.equals(dataType);
			case SimulinkPackage.INPUT_DATA__PORT_NUMBER:
				return portNumber != PORT_NUMBER_EDEFAULT;
			case SimulinkPackage.INPUT_DATA__CONNECTION:
				return connection != null;
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
		if (baseClass == Port.class) {
			switch (derivedFeatureID) {
				case SimulinkPackage.INPUT_DATA__BLOCK: return SimulinkPackage.PORT__BLOCK;
				case SimulinkPackage.INPUT_DATA__PORT_BLOCK: return SimulinkPackage.PORT__PORT_BLOCK;
				case SimulinkPackage.INPUT_DATA__DATA_TYPE: return SimulinkPackage.PORT__DATA_TYPE;
				case SimulinkPackage.INPUT_DATA__PORT_NUMBER: return SimulinkPackage.PORT__PORT_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == InPort.class) {
			switch (derivedFeatureID) {
				case SimulinkPackage.INPUT_DATA__CONNECTION: return SimulinkPackage.IN_PORT__CONNECTION;
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
		if (baseClass == Port.class) {
			switch (baseFeatureID) {
				case SimulinkPackage.PORT__BLOCK: return SimulinkPackage.INPUT_DATA__BLOCK;
				case SimulinkPackage.PORT__PORT_BLOCK: return SimulinkPackage.INPUT_DATA__PORT_BLOCK;
				case SimulinkPackage.PORT__DATA_TYPE: return SimulinkPackage.INPUT_DATA__DATA_TYPE;
				case SimulinkPackage.PORT__PORT_NUMBER: return SimulinkPackage.INPUT_DATA__PORT_NUMBER;
				default: return -1;
			}
		}
		if (baseClass == InPort.class) {
			switch (baseFeatureID) {
				case SimulinkPackage.IN_PORT__CONNECTION: return SimulinkPackage.INPUT_DATA__CONNECTION;
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
		result.append(" (dataType: ");
		result.append(dataType);
		result.append(", portNumber: ");
		result.append(portNumber);
		result.append(')');
		return result.toString();
	}

} //InputDataImpl
