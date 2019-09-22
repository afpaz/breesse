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

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each operation of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see ca.ets.sofeess.breesse.simulink.SimulinkFactory
 * @model kind="package"
 * @generated
 */
public interface SimulinkPackage extends EPackage {
	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "simulink";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.etsmtl.ca/sofeess/breesse/simulink/1.0";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "simulink";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	SimulinkPackage eINSTANCE = ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl.init();

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.SimulinkModelImpl <em>Model</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkModelImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSimulinkModel()
	 * @generated
	 */
	int SIMULINK_MODEL = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.SimulinkElementImpl <em>Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkElementImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSimulinkElement()
	 * @generated
	 */
	int SIMULINK_ELEMENT = 1;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ELEMENT__NAME = 0;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ELEMENT__HANDLE = 1;

	/**
	 * The number of structural features of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ELEMENT_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.BlockImpl <em>Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.BlockImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getBlock()
	 * @generated
	 */
	int BLOCK = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__NAME = SIMULINK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__HANDLE = SIMULINK_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__OWNED_PORTS = SIMULINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK__PARENT = SIMULINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_FEATURE_COUNT = SIMULINK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_OPERATION_COUNT = SIMULINK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.PortImpl <em>Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.PortImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getPort()
	 * @generated
	 */
	int PORT = 3;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.InPortImpl <em>In Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.InPortImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInPort()
	 * @generated
	 */
	int IN_PORT = 4;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutPortImpl <em>Out Port</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.OutPortImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutPort()
	 * @generated
	 */
	int OUT_PORT = 5;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.SubSystemImpl <em>Sub System</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.SubSystemImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSubSystem()
	 * @generated
	 */
	int SUB_SYSTEM = 6;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__HANDLE = BLOCK__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__OWNED_PORTS = BLOCK__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__SUB_BLOCKS = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM__CONNECTIONS = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Sub System</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SUB_SYSTEM_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__NAME = SUB_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__HANDLE = SUB_SYSTEM__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__OWNED_PORTS = SUB_SYSTEM__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__PARENT = SUB_SYSTEM__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__SUB_BLOCKS = SUB_SYSTEM__SUB_BLOCKS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__CONNECTIONS = SUB_SYSTEM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>File</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__FILE = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Is Library</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL__IS_LIBRARY = SUB_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Model</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SIMULINK_MODEL_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__NAME = SIMULINK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__HANDLE = SIMULINK_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__BLOCK = SIMULINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_BLOCK = SIMULINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__DATA_TYPE = SIMULINK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT__PORT_NUMBER = SIMULINK_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_FEATURE_COUNT = SIMULINK_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_OPERATION_COUNT = SIMULINK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__HANDLE = PORT__HANDLE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Port Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__PORT_BLOCK = PORT__PORT_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT__CONNECTION = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>In Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__NAME = PORT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__HANDLE = PORT__HANDLE;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__BLOCK = PORT__BLOCK;

	/**
	 * The feature id for the '<em><b>Port Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__PORT_BLOCK = PORT__PORT_BLOCK;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__DATA_TYPE = PORT__DATA_TYPE;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__PORT_NUMBER = PORT__PORT_NUMBER;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT__CONNECTION = PORT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_FEATURE_COUNT = PORT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Out Port</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_OPERATION_COUNT = PORT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.PortBlockImpl <em>Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.PortBlockImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getPortBlock()
	 * @generated
	 */
	int PORT_BLOCK = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__NAME = BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__HANDLE = BLOCK__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__OWNED_PORTS = BLOCK__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__PARENT = BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__PORT = BLOCK_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK__PORT_NUMBER = BLOCK_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK_FEATURE_COUNT = BLOCK_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int PORT_BLOCK_OPERATION_COUNT = BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.InPortBlockImpl <em>In Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.InPortBlockImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInPortBlock()
	 * @generated
	 */
	int IN_PORT_BLOCK = 8;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__NAME = PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__HANDLE = PORT_BLOCK__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__OWNED_PORTS = PORT_BLOCK__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__PARENT = PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__PORT = PORT_BLOCK__PORT;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK__PORT_NUMBER = PORT_BLOCK__PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>In Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK_FEATURE_COUNT = PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>In Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IN_PORT_BLOCK_OPERATION_COUNT = PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutPortBlockImpl <em>Out Port Block</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.OutPortBlockImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutPortBlock()
	 * @generated
	 */
	int OUT_PORT_BLOCK = 9;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__NAME = PORT_BLOCK__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__HANDLE = PORT_BLOCK__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__OWNED_PORTS = PORT_BLOCK__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__PARENT = PORT_BLOCK__PARENT;

	/**
	 * The feature id for the '<em><b>Port</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__PORT = PORT_BLOCK__PORT;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK__PORT_NUMBER = PORT_BLOCK__PORT_NUMBER;

	/**
	 * The number of structural features of the '<em>Out Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK_FEATURE_COUNT = PORT_BLOCK_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Out Port Block</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUT_PORT_BLOCK_OPERATION_COUNT = PORT_BLOCK_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConnectionImpl <em>Connection</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ConnectionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getConnection()
	 * @generated
	 */
	int CONNECTION = 10;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__NAME = SIMULINK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__HANDLE = SIMULINK_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>From</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__FROM = SIMULINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>To</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION__TO = SIMULINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_FEATURE_COUNT = SIMULINK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Connection</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONNECTION_OPERATION_COUNT = SIMULINK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.StateflowElementImpl <em>Stateflow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.StateflowElementImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getStateflowElement()
	 * @generated
	 */
	int STATEFLOW_ELEMENT = 18;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__NAME = SIMULINK_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__HANDLE = SIMULINK_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__PATH = SIMULINK_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT__ID = SIMULINK_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT_FEATURE_COUNT = SIMULINK_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATEFLOW_ELEMENT_OPERATION_COUNT = SIMULINK_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.CompositeStateflowElementImpl <em>Composite Stateflow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.CompositeStateflowElementImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getCompositeStateflowElement()
	 * @generated
	 */
	int COMPOSITE_STATEFLOW_ELEMENT = 20;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT__NAME = STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT__HANDLE = STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT__PATH = STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT__CHILDREN = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Composite Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Composite Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMPOSITE_STATEFLOW_ELEMENT_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ChartImpl <em>Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ChartImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getChart()
	 * @generated
	 */
	int CHART = 11;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__NAME = COMPOSITE_STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__HANDLE = COMPOSITE_STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PATH = COMPOSITE_STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__ID = COMPOSITE_STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__CHILDREN = COMPOSITE_STATEFLOW_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__OWNED_PORTS = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__PARENT = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Decomposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART__DECOMPOSITION = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_FEATURE_COUNT = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHART_OPERATION_COUNT = COMPOSITE_STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ContainableStateflowElementImpl <em>Containable Stateflow Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ContainableStateflowElementImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getContainableStateflowElement()
	 * @generated
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT = 21;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT__NAME = STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT__HANDLE = STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT__PATH = STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT__PARENT = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containable Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containable Stateflow Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_STATEFLOW_ELEMENT_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.VertexImpl <em>Vertex</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.VertexImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getVertex()
	 * @generated
	 */
	int VERTEX = 12;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__NAME = CONTAINABLE_STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__HANDLE = CONTAINABLE_STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__PATH = CONTAINABLE_STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__ID = CONTAINABLE_STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__PARENT = CONTAINABLE_STATEFLOW_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__INCOMING_TRANSITIONS = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX__OUTGOING_TRANSITIONS = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_FEATURE_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Vertex</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERTEX_OPERATION_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl <em>State</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.StateImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getState()
	 * @generated
	 */
	int STATE = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__HANDLE = VERTEX__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PATH = VERTEX__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__PARENT = VERTEX__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__CHILDREN = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Decomposition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DECOMPOSITION = VERTEX_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXECUTION_ORDER = VERTEX_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Entry Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__ENTRY_ACTIONS = VERTEX_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>During Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__DURING_ACTIONS = VERTEX_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Exit Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE__EXIT_ACTIONS = VERTEX_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 6;

	/**
	 * The number of operations of the '<em>State</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int STATE_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.JunctionImpl <em>Junction</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.JunctionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getJunction()
	 * @generated
	 */
	int JUNCTION = 14;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__NAME = VERTEX__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__HANDLE = VERTEX__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PATH = VERTEX__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__ID = VERTEX__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__PARENT = VERTEX__PARENT;

	/**
	 * The feature id for the '<em><b>Incoming Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__INCOMING_TRANSITIONS = VERTEX__INCOMING_TRANSITIONS;

	/**
	 * The feature id for the '<em><b>Outgoing Transitions</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION__OUTGOING_TRANSITIONS = VERTEX__OUTGOING_TRANSITIONS;

	/**
	 * The number of structural features of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_FEATURE_COUNT = VERTEX_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Junction</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int JUNCTION_OPERATION_COUNT = VERTEX_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl <em>Transition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.TransitionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTransition()
	 * @generated
	 */
	int TRANSITION = 15;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__NAME = CONTAINABLE_STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__HANDLE = CONTAINABLE_STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PATH = CONTAINABLE_STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__ID = CONTAINABLE_STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__PARENT = CONTAINABLE_STATEFLOW_ELEMENT__PARENT;

	/**
	 * The feature id for the '<em><b>Source</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__SOURCE = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Destination</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__DESTINATION = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Guard</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__GUARD = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Triggered Actions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGERED_ACTIONS = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Is Default Transition</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__IS_DEFAULT_TRANSITION = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Execution Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__EXECUTION_ORDER = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Trigger</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION__TRIGGER = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The number of structural features of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_FEATURE_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of operations of the '<em>Transition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRANSITION_OPERATION_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.SFWGuardImpl <em>SFW Guard</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.SFWGuardImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSFWGuard()
	 * @generated
	 */
	int SFW_GUARD = 16;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_GUARD__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_GUARD__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>SFW Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_GUARD_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SFW Guard</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_GUARD_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl <em>Action</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ActionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getAction()
	 * @generated
	 */
	int ACTION = 17;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__TRANSITION = 1;

	/**
	 * The feature id for the '<em><b>State Entry</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATE_ENTRY = 2;

	/**
	 * The feature id for the '<em><b>State During</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATE_DURING = 3;

	/**
	 * The feature id for the '<em><b>State Exit</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION__STATE_EXIT = 4;

	/**
	 * The number of structural features of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_FEATURE_COUNT = 5;

	/**
	 * The number of operations of the '<em>Action</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.FunctionImpl <em>Function</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.FunctionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getFunction()
	 * @generated
	 */
	int FUNCTION = 19;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__NAME = COMPOSITE_STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__HANDLE = COMPOSITE_STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PATH = COMPOSITE_STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__ID = COMPOSITE_STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Children</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__CHILDREN = COMPOSITE_STATEFLOW_ELEMENT__CHILDREN;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__PARENT = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Signature</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION__SIGNATURE = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_FEATURE_COUNT = COMPOSITE_STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Function</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_OPERATION_COUNT = COMPOSITE_STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl <em>Truth Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTruthTable()
	 * @generated
	 */
	int TRUTH_TABLE = 22;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__NAME = STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__HANDLE = STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__PATH = STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__ID = STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Condition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__CONDITION_TABLE = STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Action Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__ACTION_TABLE = STATEFLOW_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE__DATA = STATEFLOW_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The number of structural features of the '<em>Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_FEATURE_COUNT = STATEFLOW_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of operations of the '<em>Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_OPERATION_COUNT = STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConditionTableImpl <em>Condition Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ConditionTableImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getConditionTable()
	 * @generated
	 */
	int CONDITION_TABLE = 23;

	/**
	 * The feature id for the '<em><b>Decisions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TABLE__DECISIONS = 0;

	/**
	 * The feature id for the '<em><b>Conditions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TABLE__CONDITIONS = 1;

	/**
	 * The number of structural features of the '<em>Condition Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TABLE_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionTableImpl <em>Action Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ActionTableImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getActionTable()
	 * @generated
	 */
	int ACTION_TABLE = 24;

	/**
	 * The feature id for the '<em><b>Action Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TABLE__ACTION_ENTRIES = 0;

	/**
	 * The number of structural features of the '<em>Action Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TABLE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Action Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_TABLE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConditionImpl <em>Condition</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ConditionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getCondition()
	 * @generated
	 */
	int CONDITION = 25;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION__STATEMENT = 1;

	/**
	 * The number of structural features of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Condition</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONDITION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.DecisionImpl <em>Decision</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.DecisionImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecision()
	 * @generated
	 */
	int DECISION = 26;

	/**
	 * The feature id for the '<em><b>Decision Entries</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__DECISION_ENTRIES = 0;

	/**
	 * The feature id for the '<em><b>Action Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ACTION_REFERENCE = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION__ID = 2;

	/**
	 * The number of structural features of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Decision</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl <em>Decision Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecisionEntry()
	 * @generated
	 */
	int DECISION_ENTRY = 27;

	/**
	 * The feature id for the '<em><b>Condition</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ENTRY__CONDITION = 0;

	/**
	 * The feature id for the '<em><b>Condition Outcome</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ENTRY__CONDITION_OUTCOME = 1;

	/**
	 * The number of structural features of the '<em>Decision Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ENTRY_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>Decision Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DECISION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ContainableTruthTableImpl <em>Containable Truth Table</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ContainableTruthTableImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getContainableTruthTable()
	 * @generated
	 */
	int CONTAINABLE_TRUTH_TABLE = 28;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__NAME = TRUTH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__HANDLE = TRUTH_TABLE__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__PATH = TRUTH_TABLE__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__ID = TRUTH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Condition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__CONDITION_TABLE = TRUTH_TABLE__CONDITION_TABLE;

	/**
	 * The feature id for the '<em><b>Action Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__ACTION_TABLE = TRUTH_TABLE__ACTION_TABLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__DATA = TRUTH_TABLE__DATA;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE__PARENT = TRUTH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Containable Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE_FEATURE_COUNT = TRUTH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Containable Truth Table</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CONTAINABLE_TRUTH_TABLE_OPERATION_COUNT = TRUTH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl <em>Truth Table Chart</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTruthTableChart()
	 * @generated
	 */
	int TRUTH_TABLE_CHART = 29;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__NAME = TRUTH_TABLE__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__HANDLE = TRUTH_TABLE__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__PATH = TRUTH_TABLE__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__ID = TRUTH_TABLE__ID;

	/**
	 * The feature id for the '<em><b>Condition Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__CONDITION_TABLE = TRUTH_TABLE__CONDITION_TABLE;

	/**
	 * The feature id for the '<em><b>Action Table</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__ACTION_TABLE = TRUTH_TABLE__ACTION_TABLE;

	/**
	 * The feature id for the '<em><b>Data</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__DATA = TRUTH_TABLE__DATA;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__OWNED_PORTS = TRUTH_TABLE_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART__PARENT = TRUTH_TABLE_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Truth Table Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART_FEATURE_COUNT = TRUTH_TABLE_FEATURE_COUNT + 2;

	/**
	 * The number of operations of the '<em>Truth Table Chart</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TRUTH_TABLE_CHART_OPERATION_COUNT = TRUTH_TABLE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl <em>Action Entry</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getActionEntry()
	 * @generated
	 */
	int ACTION_ENTRY = 30;

	/**
	 * The feature id for the '<em><b>Action Reference</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__ACTION_REFERENCE = 0;

	/**
	 * The feature id for the '<em><b>Description</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__DESCRIPTION = 1;

	/**
	 * The feature id for the '<em><b>Action Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY__ACTION_STATEMENT = 2;

	/**
	 * The number of structural features of the '<em>Action Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Action Entry</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int ACTION_ENTRY_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.DataImpl <em>Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.DataImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getData()
	 * @generated
	 */
	int DATA = 31;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__NAME = CONTAINABLE_STATEFLOW_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__HANDLE = CONTAINABLE_STATEFLOW_ELEMENT__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PATH = CONTAINABLE_STATEFLOW_ELEMENT__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__ID = CONTAINABLE_STATEFLOW_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA__PARENT = CONTAINABLE_STATEFLOW_ELEMENT__PARENT;

	/**
	 * The number of structural features of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_FEATURE_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int DATA_OPERATION_COUNT = CONTAINABLE_STATEFLOW_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl <em>Input Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.InputDataImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInputData()
	 * @generated
	 */
	int INPUT_DATA = 32;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__HANDLE = DATA__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__PATH = DATA__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__BLOCK = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__PORT_BLOCK = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__DATA_TYPE = DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__PORT_NUMBER = DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA__CONNECTION = DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Input Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutputDataImpl <em>Output Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.OutputDataImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutputData()
	 * @generated
	 */
	int OUTPUT_DATA = 33;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__HANDLE = DATA__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__PATH = DATA__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Block</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__BLOCK = DATA_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Port Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__PORT_BLOCK = DATA_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__DATA_TYPE = DATA_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Port Number</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__PORT_NUMBER = DATA_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Connection</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA__CONNECTION = DATA_FEATURE_COUNT + 4;

	/**
	 * The number of structural features of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 5;

	/**
	 * The number of operations of the '<em>Output Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.LocalDataImpl <em>Local Data</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.LocalDataImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getLocalData()
	 * @generated
	 */
	int LOCAL_DATA = 34;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__NAME = DATA__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__HANDLE = DATA__HANDLE;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__PATH = DATA__PATH;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__ID = DATA__ID;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__PARENT = DATA__PARENT;

	/**
	 * The feature id for the '<em><b>Data Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA__DATA_TYPE = DATA_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Local Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_FEATURE_COUNT = DATA_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Local Data</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int LOCAL_DATA_OPERATION_COUNT = DATA_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ReferenceImpl <em>Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ReferenceImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getReference()
	 * @generated
	 */
	int REFERENCE = 38;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__NAME = SUB_SYSTEM__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__HANDLE = SUB_SYSTEM__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__OWNED_PORTS = SUB_SYSTEM__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__PARENT = SUB_SYSTEM__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SUB_BLOCKS = SUB_SYSTEM__SUB_BLOCKS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__CONNECTIONS = SUB_SYSTEM__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE__SOURCE_BLOCK = SUB_SYSTEM_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_FEATURE_COUNT = SUB_SYSTEM_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int REFERENCE_OPERATION_COUNT = SUB_SYSTEM_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.BlockReferenceImpl <em>Block Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.BlockReferenceImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getBlockReference()
	 * @generated
	 */
	int BLOCK_REFERENCE = 35;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__HANDLE = REFERENCE__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__OWNED_PORTS = REFERENCE__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__PARENT = REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__SUB_BLOCKS = REFERENCE__SUB_BLOCKS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__CONNECTIONS = REFERENCE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE__SOURCE_BLOCK = REFERENCE__SOURCE_BLOCK;

	/**
	 * The number of structural features of the '<em>Block Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of operations of the '<em>Block Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.SFWTriggerImpl <em>SFW Trigger</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.SFWTriggerImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSFWTrigger()
	 * @generated
	 */
	int SFW_TRIGGER = 36;

	/**
	 * The feature id for the '<em><b>Statement</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_TRIGGER__STATEMENT = 0;

	/**
	 * The feature id for the '<em><b>Transition</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_TRIGGER__TRANSITION = 1;

	/**
	 * The number of structural features of the '<em>SFW Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_TRIGGER_FEATURE_COUNT = 2;

	/**
	 * The number of operations of the '<em>SFW Trigger</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SFW_TRIGGER_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.impl.ModelReferenceImpl
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getModelReference()
	 * @generated
	 */
	int MODEL_REFERENCE = 37;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__NAME = REFERENCE__NAME;

	/**
	 * The feature id for the '<em><b>Handle</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__HANDLE = REFERENCE__HANDLE;

	/**
	 * The feature id for the '<em><b>Owned Ports</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__OWNED_PORTS = REFERENCE__OWNED_PORTS;

	/**
	 * The feature id for the '<em><b>Parent</b></em>' container reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__PARENT = REFERENCE__PARENT;

	/**
	 * The feature id for the '<em><b>Sub Blocks</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__SUB_BLOCKS = REFERENCE__SUB_BLOCKS;

	/**
	 * The feature id for the '<em><b>Connections</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__CONNECTIONS = REFERENCE__CONNECTIONS;

	/**
	 * The feature id for the '<em><b>Source Block</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__SOURCE_BLOCK = REFERENCE__SOURCE_BLOCK;

	/**
	 * The feature id for the '<em><b>Model Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE__MODEL_NAME = REFERENCE_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_FEATURE_COUNT = REFERENCE_FEATURE_COUNT + 1;

	/**
	 * The number of operations of the '<em>Model Reference</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int MODEL_REFERENCE_OPERATION_COUNT = REFERENCE_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link ca.ets.sofeess.breesse.simulink.DecompositionType <em>Decomposition Type</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see ca.ets.sofeess.breesse.simulink.DecompositionType
	 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecompositionType()
	 * @generated
	 */
	int DECOMPOSITION_TYPE = 39;


	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.SimulinkModel <em>Model</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkModel
	 * @generated
	 */
	EClass getSimulinkModel();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SimulinkModel#getFile <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>File</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkModel#getFile()
	 * @see #getSimulinkModel()
	 * @generated
	 */
	EAttribute getSimulinkModel_File();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SimulinkModel#isIsLibrary <em>Is Library</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Library</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkModel#isIsLibrary()
	 * @see #getSimulinkModel()
	 * @generated
	 */
	EAttribute getSimulinkModel_IsLibrary();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.SimulinkElement <em>Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Element</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkElement
	 * @generated
	 */
	EClass getSimulinkElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SimulinkElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkElement#getName()
	 * @see #getSimulinkElement()
	 * @generated
	 */
	EAttribute getSimulinkElement_Name();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SimulinkElement#getHandle <em>Handle</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Handle</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SimulinkElement#getHandle()
	 * @see #getSimulinkElement()
	 * @generated
	 */
	EAttribute getSimulinkElement_Handle();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Block <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Block
	 * @generated
	 */
	EClass getBlock();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.Block#getOwnedPorts <em>Owned Ports</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Owned Ports</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Block#getOwnedPorts()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_OwnedPorts();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Block#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Block#getParent()
	 * @see #getBlock()
	 * @generated
	 */
	EReference getBlock_Parent();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Port <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Port
	 * @generated
	 */
	EClass getPort();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Port#getBlock <em>Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Port#getBlock()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_Block();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Port#getPortBlock <em>Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Port#getPortBlock()
	 * @see #getPort()
	 * @generated
	 */
	EReference getPort_PortBlock();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Port#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Port#getDataType()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_DataType();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Port#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Port#getPortNumber()
	 * @see #getPort()
	 * @generated
	 */
	EAttribute getPort_PortNumber();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.InPort <em>In Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.InPort
	 * @generated
	 */
	EClass getInPort();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.InPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.InPort#getConnection()
	 * @see #getInPort()
	 * @generated
	 */
	EReference getInPort_Connection();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.OutPort <em>Out Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.OutPort
	 * @generated
	 */
	EClass getOutPort();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.OutPort#getConnection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Connection</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.OutPort#getConnection()
	 * @see #getOutPort()
	 * @generated
	 */
	EReference getOutPort_Connection();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.SubSystem <em>Sub System</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Sub System</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SubSystem
	 * @generated
	 */
	EClass getSubSystem();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.SubSystem#getSubBlocks <em>Sub Blocks</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Sub Blocks</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SubSystem#getSubBlocks()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_SubBlocks();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.SubSystem#getConnections <em>Connections</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Connections</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SubSystem#getConnections()
	 * @see #getSubSystem()
	 * @generated
	 */
	EReference getSubSystem_Connections();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.PortBlock <em>Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Port Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.PortBlock
	 * @generated
	 */
	EClass getPortBlock();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.PortBlock#getPort <em>Port</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Port</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.PortBlock#getPort()
	 * @see #getPortBlock()
	 * @generated
	 */
	EReference getPortBlock_Port();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.PortBlock#getPortNumber <em>Port Number</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Port Number</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.PortBlock#getPortNumber()
	 * @see #getPortBlock()
	 * @generated
	 */
	EAttribute getPortBlock_PortNumber();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.InPortBlock <em>In Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>In Port Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.InPortBlock
	 * @generated
	 */
	EClass getInPortBlock();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.OutPortBlock <em>Out Port Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Out Port Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.OutPortBlock
	 * @generated
	 */
	EClass getOutPortBlock();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Connection <em>Connection</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Connection</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Connection
	 * @generated
	 */
	EClass getConnection();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Connection#getFrom <em>From</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>From</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Connection#getFrom()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_From();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Connection#getTo <em>To</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>To</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Connection#getTo()
	 * @see #getConnection()
	 * @generated
	 */
	EReference getConnection_To();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Chart <em>Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chart</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Chart
	 * @generated
	 */
	EClass getChart();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Chart#getDecomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Chart#getDecomposition()
	 * @see #getChart()
	 * @generated
	 */
	EAttribute getChart_Decomposition();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Vertex <em>Vertex</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Vertex</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Vertex
	 * @generated
	 */
	EClass getVertex();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.breesse.simulink.Vertex#getIncomingTransitions <em>Incoming Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Incoming Transitions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Vertex#getIncomingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_IncomingTransitions();

	/**
	 * Returns the meta object for the reference list '{@link ca.ets.sofeess.breesse.simulink.Vertex#getOutgoingTransitions <em>Outgoing Transitions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Outgoing Transitions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Vertex#getOutgoingTransitions()
	 * @see #getVertex()
	 * @generated
	 */
	EReference getVertex_OutgoingTransitions();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.State <em>State</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>State</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State
	 * @generated
	 */
	EClass getState();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.State#getDecomposition <em>Decomposition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Decomposition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State#getDecomposition()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_Decomposition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.State#getExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State#getExecutionOrder()
	 * @see #getState()
	 * @generated
	 */
	EAttribute getState_ExecutionOrder();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.State#getEntryActions <em>Entry Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Entry Actions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State#getEntryActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_EntryActions();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.State#getDuringActions <em>During Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>During Actions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State#getDuringActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_DuringActions();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.State#getExitActions <em>Exit Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Exit Actions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.State#getExitActions()
	 * @see #getState()
	 * @generated
	 */
	EReference getState_ExitActions();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Junction <em>Junction</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Junction</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Junction
	 * @generated
	 */
	EClass getJunction();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Transition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Transition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition
	 * @generated
	 */
	EClass getTransition();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Transition#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getSource()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Source();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Transition#getDestination <em>Destination</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Destination</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getDestination()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Destination();

	/**
	 * Returns the meta object for the containment reference '{@link ca.ets.sofeess.breesse.simulink.Transition#getGuard <em>Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Guard</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getGuard()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Guard();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.Transition#getTriggeredActions <em>Triggered Actions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Triggered Actions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getTriggeredActions()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_TriggeredActions();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Transition#isIsDefaultTransition <em>Is Default Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Is Default Transition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#isIsDefaultTransition()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_IsDefaultTransition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Transition#getExecutionOrder <em>Execution Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Execution Order</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getExecutionOrder()
	 * @see #getTransition()
	 * @generated
	 */
	EAttribute getTransition_ExecutionOrder();

	/**
	 * Returns the meta object for the containment reference '{@link ca.ets.sofeess.breesse.simulink.Transition#getTrigger <em>Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Trigger</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Transition#getTrigger()
	 * @see #getTransition()
	 * @generated
	 */
	EReference getTransition_Trigger();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.SFWGuard <em>SFW Guard</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFW Guard</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWGuard
	 * @generated
	 */
	EClass getSFWGuard();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SFWGuard#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWGuard#getStatement()
	 * @see #getSFWGuard()
	 * @generated
	 */
	EAttribute getSFWGuard_Statement();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.SFWGuard#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWGuard#getTransition()
	 * @see #getSFWGuard()
	 * @generated
	 */
	EReference getSFWGuard_Transition();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Action <em>Action</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action
	 * @generated
	 */
	EClass getAction();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Action#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStatement()
	 * @see #getAction()
	 * @generated
	 */
	EAttribute getAction_Statement();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Action#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action#getTransition()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_Transition();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Action#getStateEntry <em>State Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Entry</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateEntry()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_StateEntry();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Action#getStateDuring <em>State During</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State During</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateDuring()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_StateDuring();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.Action#getStateExit <em>State Exit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>State Exit</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Action#getStateExit()
	 * @see #getAction()
	 * @generated
	 */
	EReference getAction_StateExit();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.StateflowElement <em>Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Stateflow Element</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.StateflowElement
	 * @generated
	 */
	EClass getStateflowElement();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.StateflowElement#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.StateflowElement#getPath()
	 * @see #getStateflowElement()
	 * @generated
	 */
	EAttribute getStateflowElement_Path();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.StateflowElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.StateflowElement#getId()
	 * @see #getStateflowElement()
	 * @generated
	 */
	EAttribute getStateflowElement_Id();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Function <em>Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Function
	 * @generated
	 */
	EClass getFunction();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Function#getSignature <em>Signature</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Signature</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Function#getSignature()
	 * @see #getFunction()
	 * @generated
	 */
	EAttribute getFunction_Signature();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.CompositeStateflowElement <em>Composite Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Composite Stateflow Element</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.CompositeStateflowElement
	 * @generated
	 */
	EClass getCompositeStateflowElement();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.CompositeStateflowElement#getChildren <em>Children</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Children</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.CompositeStateflowElement#getChildren()
	 * @see #getCompositeStateflowElement()
	 * @generated
	 */
	EReference getCompositeStateflowElement_Children();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ContainableStateflowElement <em>Containable Stateflow Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Stateflow Element</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ContainableStateflowElement
	 * @generated
	 */
	EClass getContainableStateflowElement();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.ContainableStateflowElement#getParent <em>Parent</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Parent</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ContainableStateflowElement#getParent()
	 * @see #getContainableStateflowElement()
	 * @generated
	 */
	EReference getContainableStateflowElement_Parent();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.TruthTable <em>Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truth Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTable
	 * @generated
	 */
	EClass getTruthTable();

	/**
	 * Returns the meta object for the containment reference '{@link ca.ets.sofeess.breesse.simulink.TruthTable#getConditionTable <em>Condition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Condition Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTable#getConditionTable()
	 * @see #getTruthTable()
	 * @generated
	 */
	EReference getTruthTable_ConditionTable();

	/**
	 * Returns the meta object for the containment reference '{@link ca.ets.sofeess.breesse.simulink.TruthTable#getActionTable <em>Action Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Action Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTable#getActionTable()
	 * @see #getTruthTable()
	 * @generated
	 */
	EReference getTruthTable_ActionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.TruthTable#getData <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Data</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTable#getData()
	 * @see #getTruthTable()
	 * @generated
	 */
	EReference getTruthTable_Data();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ConditionTable <em>Condition Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ConditionTable
	 * @generated
	 */
	EClass getConditionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.ConditionTable#getDecisions <em>Decisions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decisions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ConditionTable#getDecisions()
	 * @see #getConditionTable()
	 * @generated
	 */
	EReference getConditionTable_Decisions();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.ConditionTable#getConditions <em>Conditions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Conditions</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ConditionTable#getConditions()
	 * @see #getConditionTable()
	 * @generated
	 */
	EReference getConditionTable_Conditions();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ActionTable <em>Action Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionTable
	 * @generated
	 */
	EClass getActionTable();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.ActionTable#getActionEntries <em>Action Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Action Entries</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionTable#getActionEntries()
	 * @see #getActionTable()
	 * @generated
	 */
	EReference getActionTable_ActionEntries();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Condition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Condition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Condition
	 * @generated
	 */
	EClass getCondition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Condition#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Condition#getDescription()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Condition#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Condition#getStatement()
	 * @see #getCondition()
	 * @generated
	 */
	EAttribute getCondition_Statement();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Decision <em>Decision</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Decision
	 * @generated
	 */
	EClass getDecision();

	/**
	 * Returns the meta object for the containment reference list '{@link ca.ets.sofeess.breesse.simulink.Decision#getDecisionEntries <em>Decision Entries</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Decision Entries</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Decision#getDecisionEntries()
	 * @see #getDecision()
	 * @generated
	 */
	EReference getDecision_DecisionEntries();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Decision#getActionReference <em>Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Reference</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Decision#getActionReference()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_ActionReference();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.Decision#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Decision#getId()
	 * @see #getDecision()
	 * @generated
	 */
	EAttribute getDecision_Id();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.DecisionEntry <em>Decision Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Decision Entry</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.DecisionEntry
	 * @generated
	 */
	EClass getDecisionEntry();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.DecisionEntry#getCondition <em>Condition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Condition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.DecisionEntry#getCondition()
	 * @see #getDecisionEntry()
	 * @generated
	 */
	EReference getDecisionEntry_Condition();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.DecisionEntry#getConditionOutcome <em>Condition Outcome</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Condition Outcome</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.DecisionEntry#getConditionOutcome()
	 * @see #getDecisionEntry()
	 * @generated
	 */
	EAttribute getDecisionEntry_ConditionOutcome();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ContainableTruthTable <em>Containable Truth Table</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Containable Truth Table</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ContainableTruthTable
	 * @generated
	 */
	EClass getContainableTruthTable();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.TruthTableChart <em>Truth Table Chart</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Truth Table Chart</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.TruthTableChart
	 * @generated
	 */
	EClass getTruthTableChart();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ActionEntry <em>Action Entry</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Action Entry</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionEntry
	 * @generated
	 */
	EClass getActionEntry();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionReference <em>Action Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Reference</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionEntry#getActionReference()
	 * @see #getActionEntry()
	 * @generated
	 */
	EAttribute getActionEntry_ActionReference();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getDescription <em>Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Description</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionEntry#getDescription()
	 * @see #getActionEntry()
	 * @generated
	 */
	EAttribute getActionEntry_Description();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.ActionEntry#getActionStatement <em>Action Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Action Statement</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ActionEntry#getActionStatement()
	 * @see #getActionEntry()
	 * @generated
	 */
	EAttribute getActionEntry_ActionStatement();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Data <em>Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Data</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Data
	 * @generated
	 */
	EClass getData();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.InputData <em>Input Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input Data</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.InputData
	 * @generated
	 */
	EClass getInputData();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.OutputData <em>Output Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output Data</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.OutputData
	 * @generated
	 */
	EClass getOutputData();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.LocalData <em>Local Data</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Local Data</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.LocalData
	 * @generated
	 */
	EClass getLocalData();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.LocalData#getDataType <em>Data Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Data Type</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.LocalData#getDataType()
	 * @see #getLocalData()
	 * @generated
	 */
	EAttribute getLocalData_DataType();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.BlockReference <em>Block Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Reference</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.BlockReference
	 * @generated
	 */
	EClass getBlockReference();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.Reference <em>Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Reference</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Reference
	 * @generated
	 */
	EClass getReference();

	/**
	 * Returns the meta object for the reference '{@link ca.ets.sofeess.breesse.simulink.Reference#getSourceBlock <em>Source Block</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Source Block</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.Reference#getSourceBlock()
	 * @see #getReference()
	 * @generated
	 */
	EReference getReference_SourceBlock();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.SFWTrigger <em>SFW Trigger</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>SFW Trigger</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWTrigger
	 * @generated
	 */
	EClass getSFWTrigger();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.SFWTrigger#getStatement <em>Statement</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Statement</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWTrigger#getStatement()
	 * @see #getSFWTrigger()
	 * @generated
	 */
	EAttribute getSFWTrigger_Statement();

	/**
	 * Returns the meta object for the container reference '{@link ca.ets.sofeess.breesse.simulink.SFWTrigger#getTransition <em>Transition</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the container reference '<em>Transition</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.SFWTrigger#getTransition()
	 * @see #getSFWTrigger()
	 * @generated
	 */
	EReference getSFWTrigger_Transition();

	/**
	 * Returns the meta object for class '{@link ca.ets.sofeess.breesse.simulink.ModelReference <em>Model Reference</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Model Reference</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ModelReference
	 * @generated
	 */
	EClass getModelReference();

	/**
	 * Returns the meta object for the attribute '{@link ca.ets.sofeess.breesse.simulink.ModelReference#getModelName <em>Model Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Model Name</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.ModelReference#getModelName()
	 * @see #getModelReference()
	 * @generated
	 */
	EAttribute getModelReference_ModelName();

	/**
	 * Returns the meta object for enum '{@link ca.ets.sofeess.breesse.simulink.DecompositionType <em>Decomposition Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Decomposition Type</em>'.
	 * @see ca.ets.sofeess.breesse.simulink.DecompositionType
	 * @generated
	 */
	EEnum getDecompositionType();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	SimulinkFactory getSimulinkFactory();

	/**
	 * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each operation of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
	 * @generated
	 */
	interface Literals {
		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.SimulinkModelImpl <em>Model</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkModelImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSimulinkModel()
		 * @generated
		 */
		EClass SIMULINK_MODEL = eINSTANCE.getSimulinkModel();

		/**
		 * The meta object literal for the '<em><b>File</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULINK_MODEL__FILE = eINSTANCE.getSimulinkModel_File();

		/**
		 * The meta object literal for the '<em><b>Is Library</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULINK_MODEL__IS_LIBRARY = eINSTANCE.getSimulinkModel_IsLibrary();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.SimulinkElementImpl <em>Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkElementImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSimulinkElement()
		 * @generated
		 */
		EClass SIMULINK_ELEMENT = eINSTANCE.getSimulinkElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULINK_ELEMENT__NAME = eINSTANCE.getSimulinkElement_Name();

		/**
		 * The meta object literal for the '<em><b>Handle</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SIMULINK_ELEMENT__HANDLE = eINSTANCE.getSimulinkElement_Handle();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.BlockImpl <em>Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.BlockImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getBlock()
		 * @generated
		 */
		EClass BLOCK = eINSTANCE.getBlock();

		/**
		 * The meta object literal for the '<em><b>Owned Ports</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__OWNED_PORTS = eINSTANCE.getBlock_OwnedPorts();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK__PARENT = eINSTANCE.getBlock_Parent();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.PortImpl <em>Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.PortImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getPort()
		 * @generated
		 */
		EClass PORT = eINSTANCE.getPort();

		/**
		 * The meta object literal for the '<em><b>Block</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__BLOCK = eINSTANCE.getPort_Block();

		/**
		 * The meta object literal for the '<em><b>Port Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT__PORT_BLOCK = eINSTANCE.getPort_PortBlock();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__DATA_TYPE = eINSTANCE.getPort_DataType();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT__PORT_NUMBER = eINSTANCE.getPort_PortNumber();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.InPortImpl <em>In Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.InPortImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInPort()
		 * @generated
		 */
		EClass IN_PORT = eINSTANCE.getInPort();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference IN_PORT__CONNECTION = eINSTANCE.getInPort_Connection();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutPortImpl <em>Out Port</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.OutPortImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutPort()
		 * @generated
		 */
		EClass OUT_PORT = eINSTANCE.getOutPort();

		/**
		 * The meta object literal for the '<em><b>Connection</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference OUT_PORT__CONNECTION = eINSTANCE.getOutPort_Connection();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.SubSystemImpl <em>Sub System</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.SubSystemImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSubSystem()
		 * @generated
		 */
		EClass SUB_SYSTEM = eINSTANCE.getSubSystem();

		/**
		 * The meta object literal for the '<em><b>Sub Blocks</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__SUB_BLOCKS = eINSTANCE.getSubSystem_SubBlocks();

		/**
		 * The meta object literal for the '<em><b>Connections</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SUB_SYSTEM__CONNECTIONS = eINSTANCE.getSubSystem_Connections();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.PortBlockImpl <em>Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.PortBlockImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getPortBlock()
		 * @generated
		 */
		EClass PORT_BLOCK = eINSTANCE.getPortBlock();

		/**
		 * The meta object literal for the '<em><b>Port</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference PORT_BLOCK__PORT = eINSTANCE.getPortBlock_Port();

		/**
		 * The meta object literal for the '<em><b>Port Number</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute PORT_BLOCK__PORT_NUMBER = eINSTANCE.getPortBlock_PortNumber();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.InPortBlockImpl <em>In Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.InPortBlockImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInPortBlock()
		 * @generated
		 */
		EClass IN_PORT_BLOCK = eINSTANCE.getInPortBlock();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutPortBlockImpl <em>Out Port Block</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.OutPortBlockImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutPortBlock()
		 * @generated
		 */
		EClass OUT_PORT_BLOCK = eINSTANCE.getOutPortBlock();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConnectionImpl <em>Connection</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ConnectionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getConnection()
		 * @generated
		 */
		EClass CONNECTION = eINSTANCE.getConnection();

		/**
		 * The meta object literal for the '<em><b>From</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__FROM = eINSTANCE.getConnection_From();

		/**
		 * The meta object literal for the '<em><b>To</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONNECTION__TO = eINSTANCE.getConnection_To();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ChartImpl <em>Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ChartImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getChart()
		 * @generated
		 */
		EClass CHART = eINSTANCE.getChart();

		/**
		 * The meta object literal for the '<em><b>Decomposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CHART__DECOMPOSITION = eINSTANCE.getChart_Decomposition();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.VertexImpl <em>Vertex</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.VertexImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getVertex()
		 * @generated
		 */
		EClass VERTEX = eINSTANCE.getVertex();

		/**
		 * The meta object literal for the '<em><b>Incoming Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__INCOMING_TRANSITIONS = eINSTANCE.getVertex_IncomingTransitions();

		/**
		 * The meta object literal for the '<em><b>Outgoing Transitions</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference VERTEX__OUTGOING_TRANSITIONS = eINSTANCE.getVertex_OutgoingTransitions();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.StateImpl <em>State</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.StateImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getState()
		 * @generated
		 */
		EClass STATE = eINSTANCE.getState();

		/**
		 * The meta object literal for the '<em><b>Decomposition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__DECOMPOSITION = eINSTANCE.getState_Decomposition();

		/**
		 * The meta object literal for the '<em><b>Execution Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATE__EXECUTION_ORDER = eINSTANCE.getState_ExecutionOrder();

		/**
		 * The meta object literal for the '<em><b>Entry Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__ENTRY_ACTIONS = eINSTANCE.getState_EntryActions();

		/**
		 * The meta object literal for the '<em><b>During Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__DURING_ACTIONS = eINSTANCE.getState_DuringActions();

		/**
		 * The meta object literal for the '<em><b>Exit Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference STATE__EXIT_ACTIONS = eINSTANCE.getState_ExitActions();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.JunctionImpl <em>Junction</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.JunctionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getJunction()
		 * @generated
		 */
		EClass JUNCTION = eINSTANCE.getJunction();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.TransitionImpl <em>Transition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.TransitionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTransition()
		 * @generated
		 */
		EClass TRANSITION = eINSTANCE.getTransition();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__SOURCE = eINSTANCE.getTransition_Source();

		/**
		 * The meta object literal for the '<em><b>Destination</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__DESTINATION = eINSTANCE.getTransition_Destination();

		/**
		 * The meta object literal for the '<em><b>Guard</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__GUARD = eINSTANCE.getTransition_Guard();

		/**
		 * The meta object literal for the '<em><b>Triggered Actions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGERED_ACTIONS = eINSTANCE.getTransition_TriggeredActions();

		/**
		 * The meta object literal for the '<em><b>Is Default Transition</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__IS_DEFAULT_TRANSITION = eINSTANCE.getTransition_IsDefaultTransition();

		/**
		 * The meta object literal for the '<em><b>Execution Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TRANSITION__EXECUTION_ORDER = eINSTANCE.getTransition_ExecutionOrder();

		/**
		 * The meta object literal for the '<em><b>Trigger</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRANSITION__TRIGGER = eINSTANCE.getTransition_Trigger();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.SFWGuardImpl <em>SFW Guard</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.SFWGuardImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSFWGuard()
		 * @generated
		 */
		EClass SFW_GUARD = eINSTANCE.getSFWGuard();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFW_GUARD__STATEMENT = eINSTANCE.getSFWGuard_Statement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFW_GUARD__TRANSITION = eINSTANCE.getSFWGuard_Transition();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionImpl <em>Action</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ActionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getAction()
		 * @generated
		 */
		EClass ACTION = eINSTANCE.getAction();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION__STATEMENT = eINSTANCE.getAction_Statement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__TRANSITION = eINSTANCE.getAction_Transition();

		/**
		 * The meta object literal for the '<em><b>State Entry</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STATE_ENTRY = eINSTANCE.getAction_StateEntry();

		/**
		 * The meta object literal for the '<em><b>State During</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STATE_DURING = eINSTANCE.getAction_StateDuring();

		/**
		 * The meta object literal for the '<em><b>State Exit</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION__STATE_EXIT = eINSTANCE.getAction_StateExit();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.StateflowElementImpl <em>Stateflow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.StateflowElementImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getStateflowElement()
		 * @generated
		 */
		EClass STATEFLOW_ELEMENT = eINSTANCE.getStateflowElement();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEFLOW_ELEMENT__PATH = eINSTANCE.getStateflowElement_Path();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute STATEFLOW_ELEMENT__ID = eINSTANCE.getStateflowElement_Id();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.FunctionImpl <em>Function</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.FunctionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getFunction()
		 * @generated
		 */
		EClass FUNCTION = eINSTANCE.getFunction();

		/**
		 * The meta object literal for the '<em><b>Signature</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION__SIGNATURE = eINSTANCE.getFunction_Signature();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.CompositeStateflowElementImpl <em>Composite Stateflow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.CompositeStateflowElementImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getCompositeStateflowElement()
		 * @generated
		 */
		EClass COMPOSITE_STATEFLOW_ELEMENT = eINSTANCE.getCompositeStateflowElement();

		/**
		 * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMPOSITE_STATEFLOW_ELEMENT__CHILDREN = eINSTANCE.getCompositeStateflowElement_Children();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ContainableStateflowElementImpl <em>Containable Stateflow Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ContainableStateflowElementImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getContainableStateflowElement()
		 * @generated
		 */
		EClass CONTAINABLE_STATEFLOW_ELEMENT = eINSTANCE.getContainableStateflowElement();

		/**
		 * The meta object literal for the '<em><b>Parent</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONTAINABLE_STATEFLOW_ELEMENT__PARENT = eINSTANCE.getContainableStateflowElement_Parent();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl <em>Truth Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.TruthTableImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTruthTable()
		 * @generated
		 */
		EClass TRUTH_TABLE = eINSTANCE.getTruthTable();

		/**
		 * The meta object literal for the '<em><b>Condition Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUTH_TABLE__CONDITION_TABLE = eINSTANCE.getTruthTable_ConditionTable();

		/**
		 * The meta object literal for the '<em><b>Action Table</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUTH_TABLE__ACTION_TABLE = eINSTANCE.getTruthTable_ActionTable();

		/**
		 * The meta object literal for the '<em><b>Data</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TRUTH_TABLE__DATA = eINSTANCE.getTruthTable_Data();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConditionTableImpl <em>Condition Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ConditionTableImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getConditionTable()
		 * @generated
		 */
		EClass CONDITION_TABLE = eINSTANCE.getConditionTable();

		/**
		 * The meta object literal for the '<em><b>Decisions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_TABLE__DECISIONS = eINSTANCE.getConditionTable_Decisions();

		/**
		 * The meta object literal for the '<em><b>Conditions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CONDITION_TABLE__CONDITIONS = eINSTANCE.getConditionTable_Conditions();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionTableImpl <em>Action Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ActionTableImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getActionTable()
		 * @generated
		 */
		EClass ACTION_TABLE = eINSTANCE.getActionTable();

		/**
		 * The meta object literal for the '<em><b>Action Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference ACTION_TABLE__ACTION_ENTRIES = eINSTANCE.getActionTable_ActionEntries();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ConditionImpl <em>Condition</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ConditionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getCondition()
		 * @generated
		 */
		EClass CONDITION = eINSTANCE.getCondition();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__DESCRIPTION = eINSTANCE.getCondition_Description();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute CONDITION__STATEMENT = eINSTANCE.getCondition_Statement();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.DecisionImpl <em>Decision</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.DecisionImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecision()
		 * @generated
		 */
		EClass DECISION = eINSTANCE.getDecision();

		/**
		 * The meta object literal for the '<em><b>Decision Entries</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION__DECISION_ENTRIES = eINSTANCE.getDecision_DecisionEntries();

		/**
		 * The meta object literal for the '<em><b>Action Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__ACTION_REFERENCE = eINSTANCE.getDecision_ActionReference();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION__ID = eINSTANCE.getDecision_Id();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl <em>Decision Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.DecisionEntryImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecisionEntry()
		 * @generated
		 */
		EClass DECISION_ENTRY = eINSTANCE.getDecisionEntry();

		/**
		 * The meta object literal for the '<em><b>Condition</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference DECISION_ENTRY__CONDITION = eINSTANCE.getDecisionEntry_Condition();

		/**
		 * The meta object literal for the '<em><b>Condition Outcome</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute DECISION_ENTRY__CONDITION_OUTCOME = eINSTANCE.getDecisionEntry_ConditionOutcome();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ContainableTruthTableImpl <em>Containable Truth Table</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ContainableTruthTableImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getContainableTruthTable()
		 * @generated
		 */
		EClass CONTAINABLE_TRUTH_TABLE = eINSTANCE.getContainableTruthTable();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl <em>Truth Table Chart</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.TruthTableChartImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getTruthTableChart()
		 * @generated
		 */
		EClass TRUTH_TABLE_CHART = eINSTANCE.getTruthTableChart();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl <em>Action Entry</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ActionEntryImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getActionEntry()
		 * @generated
		 */
		EClass ACTION_ENTRY = eINSTANCE.getActionEntry();

		/**
		 * The meta object literal for the '<em><b>Action Reference</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ENTRY__ACTION_REFERENCE = eINSTANCE.getActionEntry_ActionReference();

		/**
		 * The meta object literal for the '<em><b>Description</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ENTRY__DESCRIPTION = eINSTANCE.getActionEntry_Description();

		/**
		 * The meta object literal for the '<em><b>Action Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute ACTION_ENTRY__ACTION_STATEMENT = eINSTANCE.getActionEntry_ActionStatement();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.DataImpl <em>Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.DataImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getData()
		 * @generated
		 */
		EClass DATA = eINSTANCE.getData();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.InputDataImpl <em>Input Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.InputDataImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getInputData()
		 * @generated
		 */
		EClass INPUT_DATA = eINSTANCE.getInputData();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.OutputDataImpl <em>Output Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.OutputDataImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getOutputData()
		 * @generated
		 */
		EClass OUTPUT_DATA = eINSTANCE.getOutputData();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.LocalDataImpl <em>Local Data</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.LocalDataImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getLocalData()
		 * @generated
		 */
		EClass LOCAL_DATA = eINSTANCE.getLocalData();

		/**
		 * The meta object literal for the '<em><b>Data Type</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute LOCAL_DATA__DATA_TYPE = eINSTANCE.getLocalData_DataType();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.BlockReferenceImpl <em>Block Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.BlockReferenceImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getBlockReference()
		 * @generated
		 */
		EClass BLOCK_REFERENCE = eINSTANCE.getBlockReference();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ReferenceImpl <em>Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ReferenceImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getReference()
		 * @generated
		 */
		EClass REFERENCE = eINSTANCE.getReference();

		/**
		 * The meta object literal for the '<em><b>Source Block</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference REFERENCE__SOURCE_BLOCK = eINSTANCE.getReference_SourceBlock();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.SFWTriggerImpl <em>SFW Trigger</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.SFWTriggerImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getSFWTrigger()
		 * @generated
		 */
		EClass SFW_TRIGGER = eINSTANCE.getSFWTrigger();

		/**
		 * The meta object literal for the '<em><b>Statement</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SFW_TRIGGER__STATEMENT = eINSTANCE.getSFWTrigger_Statement();

		/**
		 * The meta object literal for the '<em><b>Transition</b></em>' container reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SFW_TRIGGER__TRANSITION = eINSTANCE.getSFWTrigger_Transition();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.impl.ModelReferenceImpl <em>Model Reference</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.impl.ModelReferenceImpl
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getModelReference()
		 * @generated
		 */
		EClass MODEL_REFERENCE = eINSTANCE.getModelReference();

		/**
		 * The meta object literal for the '<em><b>Model Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute MODEL_REFERENCE__MODEL_NAME = eINSTANCE.getModelReference_ModelName();

		/**
		 * The meta object literal for the '{@link ca.ets.sofeess.breesse.simulink.DecompositionType <em>Decomposition Type</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see ca.ets.sofeess.breesse.simulink.DecompositionType
		 * @see ca.ets.sofeess.breesse.simulink.impl.SimulinkPackageImpl#getDecompositionType()
		 * @generated
		 */
		EEnum DECOMPOSITION_TYPE = eINSTANCE.getDecompositionType();

	}

} //SimulinkPackage
