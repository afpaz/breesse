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

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;

import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import ca.ets.sofeess.breesse.simulink.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class SimulinkFactoryImpl extends EFactoryImpl implements SimulinkFactory {
	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static SimulinkFactory init() {
		try {
			SimulinkFactory theSimulinkFactory = (SimulinkFactory)EPackage.Registry.INSTANCE.getEFactory(SimulinkPackage.eNS_URI);
			if (theSimulinkFactory != null) {
				return theSimulinkFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new SimulinkFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkFactoryImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EObject create(EClass eClass) {
		switch (eClass.getClassifierID()) {
			case SimulinkPackage.SIMULINK_MODEL: return createSimulinkModel();
			case SimulinkPackage.BLOCK: return createBlock();
			case SimulinkPackage.IN_PORT: return createInPort();
			case SimulinkPackage.OUT_PORT: return createOutPort();
			case SimulinkPackage.SUB_SYSTEM: return createSubSystem();
			case SimulinkPackage.IN_PORT_BLOCK: return createInPortBlock();
			case SimulinkPackage.OUT_PORT_BLOCK: return createOutPortBlock();
			case SimulinkPackage.CONNECTION: return createConnection();
			case SimulinkPackage.CHART: return createChart();
			case SimulinkPackage.STATE: return createState();
			case SimulinkPackage.JUNCTION: return createJunction();
			case SimulinkPackage.TRANSITION: return createTransition();
			case SimulinkPackage.SFW_GUARD: return createSFWGuard();
			case SimulinkPackage.ACTION: return createAction();
			case SimulinkPackage.FUNCTION: return createFunction();
			case SimulinkPackage.CONDITION_TABLE: return createConditionTable();
			case SimulinkPackage.ACTION_TABLE: return createActionTable();
			case SimulinkPackage.CONDITION: return createCondition();
			case SimulinkPackage.DECISION: return createDecision();
			case SimulinkPackage.DECISION_ENTRY: return createDecisionEntry();
			case SimulinkPackage.CONTAINABLE_TRUTH_TABLE: return createContainableTruthTable();
			case SimulinkPackage.TRUTH_TABLE_CHART: return createTruthTableChart();
			case SimulinkPackage.ACTION_ENTRY: return createActionEntry();
			case SimulinkPackage.INPUT_DATA: return createInputData();
			case SimulinkPackage.OUTPUT_DATA: return createOutputData();
			case SimulinkPackage.LOCAL_DATA: return createLocalData();
			case SimulinkPackage.BLOCK_REFERENCE: return createBlockReference();
			case SimulinkPackage.SFW_TRIGGER: return createSFWTrigger();
			case SimulinkPackage.MODEL_REFERENCE: return createModelReference();
			default:
				throw new IllegalArgumentException("The class '" + eClass.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object createFromString(EDataType eDataType, String initialValue) {
		switch (eDataType.getClassifierID()) {
			case SimulinkPackage.DECOMPOSITION_TYPE:
				return createDecompositionTypeFromString(eDataType, initialValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String convertToString(EDataType eDataType, Object instanceValue) {
		switch (eDataType.getClassifierID()) {
			case SimulinkPackage.DECOMPOSITION_TYPE:
				return convertDecompositionTypeToString(eDataType, instanceValue);
			default:
				throw new IllegalArgumentException("The datatype '" + eDataType.getName() + "' is not a valid classifier");
		}
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkModel createSimulinkModel() {
		SimulinkModelImpl simulinkModel = new SimulinkModelImpl();
		return simulinkModel;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Block createBlock() {
		BlockImpl block = new BlockImpl();
		return block;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPort createInPort() {
		InPortImpl inPort = new InPortImpl();
		return inPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPort createOutPort() {
		OutPortImpl outPort = new OutPortImpl();
		return outPort;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SubSystem createSubSystem() {
		SubSystemImpl subSystem = new SubSystemImpl();
		return subSystem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InPortBlock createInPortBlock() {
		InPortBlockImpl inPortBlock = new InPortBlockImpl();
		return inPortBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutPortBlock createOutPortBlock() {
		OutPortBlockImpl outPortBlock = new OutPortBlockImpl();
		return outPortBlock;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Connection createConnection() {
		ConnectionImpl connection = new ConnectionImpl();
		return connection;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Chart createChart() {
		ChartImpl chart = new ChartImpl();
		return chart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public State createState() {
		StateImpl state = new StateImpl();
		return state;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Junction createJunction() {
		JunctionImpl junction = new JunctionImpl();
		return junction;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Transition createTransition() {
		TransitionImpl transition = new TransitionImpl();
		return transition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFWGuard createSFWGuard() {
		SFWGuardImpl sfwGuard = new SFWGuardImpl();
		return sfwGuard;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Action createAction() {
		ActionImpl action = new ActionImpl();
		return action;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Function createFunction() {
		FunctionImpl function = new FunctionImpl();
		return function;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConditionTable createConditionTable() {
		ConditionTableImpl conditionTable = new ConditionTableImpl();
		return conditionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionTable createActionTable() {
		ActionTableImpl actionTable = new ActionTableImpl();
		return actionTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Condition createCondition() {
		ConditionImpl condition = new ConditionImpl();
		return condition;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Decision createDecision() {
		DecisionImpl decision = new DecisionImpl();
		return decision;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecisionEntry createDecisionEntry() {
		DecisionEntryImpl decisionEntry = new DecisionEntryImpl();
		return decisionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ContainableTruthTable createContainableTruthTable() {
		ContainableTruthTableImpl containableTruthTable = new ContainableTruthTableImpl();
		return containableTruthTable;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TruthTableChart createTruthTableChart() {
		TruthTableChartImpl truthTableChart = new TruthTableChartImpl();
		return truthTableChart;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ActionEntry createActionEntry() {
		ActionEntryImpl actionEntry = new ActionEntryImpl();
		return actionEntry;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public InputData createInputData() {
		InputDataImpl inputData = new InputDataImpl();
		return inputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public OutputData createOutputData() {
		OutputDataImpl outputData = new OutputDataImpl();
		return outputData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public LocalData createLocalData() {
		LocalDataImpl localData = new LocalDataImpl();
		return localData;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BlockReference createBlockReference() {
		BlockReferenceImpl blockReference = new BlockReferenceImpl();
		return blockReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SFWTrigger createSFWTrigger() {
		SFWTriggerImpl sfwTrigger = new SFWTriggerImpl();
		return sfwTrigger;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ModelReference createModelReference() {
		ModelReferenceImpl modelReference = new ModelReferenceImpl();
		return modelReference;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public DecompositionType createDecompositionTypeFromString(EDataType eDataType, String initialValue) {
		DecompositionType result = DecompositionType.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertDecompositionTypeToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SimulinkPackage getSimulinkPackage() {
		return (SimulinkPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static SimulinkPackage getPackage() {
		return SimulinkPackage.eINSTANCE;
	}

} //SimulinkFactoryImpl
