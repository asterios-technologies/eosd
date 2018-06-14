/**
 */
package com.kronosafe.osd.oasd.impl;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.impl.EFactoryImpl;

import org.eclipse.emf.ecore.plugin.EcorePlugin;

import com.kronosafe.osd.oasd.*;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Factory</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class oasdFactoryImpl extends EFactoryImpl implements oasdFactory {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Creates the default factory implementation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static oasdFactory init() {
		try {
			oasdFactory theoasdFactory = (oasdFactory)EPackage.Registry.INSTANCE.getEFactory(oasdPackage.eNS_URI);
			if (theoasdFactory != null) {
				return theoasdFactory;
			}
		}
		catch (Exception exception) {
			EcorePlugin.INSTANCE.log(exception);
		}
		return new oasdFactoryImpl();
	}

	/**
	 * Creates an instance of the factory.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasdFactoryImpl() {
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
			case oasdPackage.SYSTEM_DESCRIPTION: return createSystemDescription();
			case oasdPackage.INPUT: return createInput();
			case oasdPackage.GLOBAL: return createGlobal();
			case oasdPackage.OUTPUT: return createOutput();
			case oasdPackage.FILE: return createFile();
			case oasdPackage.CODE: return createCode();
			case oasdPackage.BEHAVIOR_ITEM: return createBehaviorItem();
			case oasdPackage.FUNCTION_ITEM: return createFunctionItem();
			case oasdPackage.TYPE_ITEM: return createTypeItem();
			case oasdPackage.COMMUNICATION_ITEM: return createCommunicationItem();
			case oasdPackage.SOURCE: return createSource();
			case oasdPackage.TEMPORAL: return createTemporal();
			case oasdPackage.TIMING_CONSTRAINT: return createTimingConstraint();
			case oasdPackage.FUNCTIONAL_CHAIN: return createFunctionalChain();
			case oasdPackage.BLOCK_SPATIAL_CONSTRAINT: return createBlockSpatialConstraint();
			case oasdPackage.CHAIN_SPATIAL_CONSTRAINT: return createChainSpatialConstraint();
			case oasdPackage.COM_SPATIAL_CONSTRAINT: return createComSpatialConstraint();
			case oasdPackage.TIMING_PATH: return createTimingPath();
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
			case oasdPackage.BEHAVIOR_ITEM_KIND:
				return createBehaviorItemKindFromString(eDataType, initialValue);
			case oasdPackage.FUNCTION_KIND:
				return createFunctionKindFromString(eDataType, initialValue);
			case oasdPackage.TEMPORAL_KIND:
				return createTemporalKindFromString(eDataType, initialValue);
			case oasdPackage.CONSTRAINT_OPERATOR:
				return createConstraintOperatorFromString(eDataType, initialValue);
			case oasdPackage.SPATIAL_OPERATOR:
				return createSpatialOperatorFromString(eDataType, initialValue);
			case oasdPackage.ID_VAL:
				return createIdValFromString(eDataType, initialValue);
			case oasdPackage.ASTRING:
				return createAStringFromString(eDataType, initialValue);
			case oasdPackage.ORDER_VAL:
				return createOrderValFromString(eDataType, initialValue);
			case oasdPackage.TIME_UNIT:
				return createTimeUnitFromString(eDataType, initialValue);
			case oasdPackage.NANO_SEC:
				return createNanoSecFromString(eDataType, initialValue);
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
			case oasdPackage.BEHAVIOR_ITEM_KIND:
				return convertBehaviorItemKindToString(eDataType, instanceValue);
			case oasdPackage.FUNCTION_KIND:
				return convertFunctionKindToString(eDataType, instanceValue);
			case oasdPackage.TEMPORAL_KIND:
				return convertTemporalKindToString(eDataType, instanceValue);
			case oasdPackage.CONSTRAINT_OPERATOR:
				return convertConstraintOperatorToString(eDataType, instanceValue);
			case oasdPackage.SPATIAL_OPERATOR:
				return convertSpatialOperatorToString(eDataType, instanceValue);
			case oasdPackage.ID_VAL:
				return convertIdValToString(eDataType, instanceValue);
			case oasdPackage.ASTRING:
				return convertAStringToString(eDataType, instanceValue);
			case oasdPackage.ORDER_VAL:
				return convertOrderValToString(eDataType, instanceValue);
			case oasdPackage.TIME_UNIT:
				return convertTimeUnitToString(eDataType, instanceValue);
			case oasdPackage.NANO_SEC:
				return convertNanoSecToString(eDataType, instanceValue);
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
	public SystemDescription createSystemDescription() {
		SystemDescriptionImpl systemDescription = new SystemDescriptionImpl();
		return systemDescription;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Input createInput() {
		InputImpl input = new InputImpl();
		return input;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Global createGlobal() {
		GlobalImpl global = new GlobalImpl();
		return global;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Output createOutput() {
		OutputImpl output = new OutputImpl();
		return output;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public File createFile() {
		FileImpl file = new FileImpl();
		return file;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Code createCode() {
		CodeImpl code = new CodeImpl();
		return code;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BehaviorItem createBehaviorItem() {
		BehaviorItemImpl behaviorItem = new BehaviorItemImpl();
		return behaviorItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionItem createFunctionItem() {
		FunctionItemImpl functionItem = new FunctionItemImpl();
		return functionItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TypeItem createTypeItem() {
		TypeItemImpl typeItem = new TypeItemImpl();
		return typeItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public CommunicationItem createCommunicationItem() {
		CommunicationItemImpl communicationItem = new CommunicationItemImpl();
		return communicationItem;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Source createSource() {
		SourceImpl source = new SourceImpl();
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Temporal createTemporal() {
		TemporalImpl temporal = new TemporalImpl();
		return temporal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingConstraint createTimingConstraint() {
		TimingConstraintImpl timingConstraint = new TimingConstraintImpl();
		return timingConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public FunctionalChain createFunctionalChain() {
		FunctionalChainImpl functionalChain = new FunctionalChainImpl();
		return functionalChain;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public BlockSpatialConstraint createBlockSpatialConstraint() {
		BlockSpatialConstraintImpl blockSpatialConstraint = new BlockSpatialConstraintImpl();
		return blockSpatialConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ChainSpatialConstraint createChainSpatialConstraint() {
		ChainSpatialConstraintImpl chainSpatialConstraint = new ChainSpatialConstraintImpl();
		return chainSpatialConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public ComSpatialConstraint createComSpatialConstraint() {
		ComSpatialConstraintImpl comSpatialConstraint = new ComSpatialConstraintImpl();
		return comSpatialConstraint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public TimingPath createTimingPath() {
		TimingPathImpl timingPath = new TimingPathImpl();
		return timingPath;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BehaviorItemKind createBehaviorItemKindFromString(EDataType eDataType, String initialValue) {
		BehaviorItemKind result = BehaviorItemKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertBehaviorItemKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public FunctionKind createFunctionKindFromString(EDataType eDataType, String initialValue) {
		FunctionKind result = FunctionKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertFunctionKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TemporalKind createTemporalKindFromString(EDataType eDataType, String initialValue) {
		TemporalKind result = TemporalKind.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertTemporalKindToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public ConstraintOperator createConstraintOperatorFromString(EDataType eDataType, String initialValue) {
		ConstraintOperator result = ConstraintOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertConstraintOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public SpatialOperator createSpatialOperatorFromString(EDataType eDataType, String initialValue) {
		SpatialOperator result = SpatialOperator.get(initialValue);
		if (result == null) throw new IllegalArgumentException("The value '" + initialValue + "' is not a valid enumerator of '" + eDataType.getName() + "'");
		return result;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertSpatialOperatorToString(EDataType eDataType, Object instanceValue) {
		return instanceValue == null ? null : instanceValue.toString();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createIdValFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertIdValToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String createAStringFromString(EDataType eDataType, String initialValue) {
		return (String)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertAStringToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer createOrderValFromString(EDataType eDataType, String initialValue) {
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertOrderValToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public Integer createTimeUnitFromString(EDataType eDataType, String initialValue) {
		if(initialValue.isEmpty())
			return null;
		return (Integer)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @not generated
	 */
	public String convertTimeUnitToString(EDataType eDataType, Object instanceValue) {
		if(instanceValue == null)
			return "";
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Long createNanoSecFromString(EDataType eDataType, String initialValue) {
		return (Long)super.createFromString(eDataType, initialValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String convertNanoSecToString(EDataType eDataType, Object instanceValue) {
		return super.convertToString(eDataType, instanceValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public oasdPackage getoasdPackage() {
		return (oasdPackage)getEPackage();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @deprecated
	 * @generated
	 */
	@Deprecated
	public static oasdPackage getPackage() {
		return oasdPackage.eINSTANCE;
	}

} //oasdFactoryImpl
