/**
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.oad.impl.oadPackageImpl;
import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BehaviorItemKind;
import com.kronosafe.osd.oasd.BlockSpatialConstraint;
import com.kronosafe.osd.oasd.ChainSpatialConstraint;
import com.kronosafe.osd.oasd.Code;
import com.kronosafe.osd.oasd.ComSpatialConstraint;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.ConstraintOperator;
import com.kronosafe.osd.oasd.File;
import com.kronosafe.osd.oasd.FunctionItem;
import com.kronosafe.osd.oasd.FunctionKind;
import com.kronosafe.osd.oasd.FunctionalChain;
import com.kronosafe.osd.oasd.Global;
import com.kronosafe.osd.oasd.IdentifiableElementReferencer;
import com.kronosafe.osd.oasd.IdentifiedElement;
import com.kronosafe.osd.oasd.Input;
import com.kronosafe.osd.oasd.NamedElement;
import com.kronosafe.osd.oasd.Output;
import com.kronosafe.osd.oasd.Source;
import com.kronosafe.osd.oasd.SpatialConstraint;
import com.kronosafe.osd.oasd.SpatialOperator;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.Temporal;
import com.kronosafe.osd.oasd.TemporalKind;
import com.kronosafe.osd.oasd.TimingConstraint;
import com.kronosafe.osd.oasd.TimingPath;
import com.kronosafe.osd.oasd.TypeItem;
import com.kronosafe.osd.oasd.VersionedElement;
import com.kronosafe.osd.oasd.oasdFactory;
import com.kronosafe.osd.oasd.oasdPackage;
import com.kronosafe.osd.oad.oadPackage;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;
import org.eclipse.emf.ecore.xml.type.XMLTypePackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class oasdPackageImpl extends EPackageImpl implements oasdPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass systemDescriptionEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass inputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass globalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass outputEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass fileEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass codeEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass behaviorItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass typeItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass communicationItemEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sourceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass identifiableElementReferencerEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass namedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass versionedElementEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass temporalEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass functionalChainEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass blockSpatialConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass chainSpatialConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass spatialConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass comSpatialConstraintEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass timingPathEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum behaviorItemKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum functionKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum temporalKindEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum constraintOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EEnum spatialOperatorEEnum = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType idValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType orderValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType timeUnitEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType nanoSecEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see com.kronosafe.osd.oasd.oasdPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private oasdPackageImpl() {
		super(eNS_URI, oasdFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 *
	 * <p>This method is used to initialize {@link oasdPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static oasdPackage init() {
		if (isInited) return (oasdPackage)EPackage.Registry.INSTANCE.getEPackage(oasdPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredoasdPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		oasdPackageImpl theoasdPackage = registeredoasdPackage instanceof oasdPackageImpl ? (oasdPackageImpl)registeredoasdPackage : new oasdPackageImpl();

		isInited = true;

		// Initialize simple dependencies
		XMLTypePackage.eINSTANCE.eClass();

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(oadPackage.eNS_URI);
		oadPackageImpl theoadPackage = (oadPackageImpl)(registeredPackage instanceof oadPackageImpl ? registeredPackage : oadPackage.eINSTANCE);

		// Create package meta-data objects
		theoasdPackage.createPackageContents();
		theoadPackage.createPackageContents();

		// Initialize created meta-data
		theoasdPackage.initializePackageContents();
		theoadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theoasdPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(oasdPackage.eNS_URI, theoasdPackage);
		return theoasdPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSystemDescription() {
		return systemDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_Types() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_Behaviors() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_Codes() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescription_TimeUnit() {
		return (EAttribute)systemDescriptionEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescription_Source() {
		return (EAttribute)systemDescriptionEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSystemDescription_TimeUnitDeclaration() {
		return (EAttribute)systemDescriptionEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_Communications() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_FunctionalChains() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(7);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_ChainSpatialConstraints() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(8);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_BlockSpatialConstraints() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(9);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSystemDescription_ComSpatialConstraints() {
		return (EReference)systemDescriptionEClass.getEStructuralFeatures().get(10);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getInput() {
		return inputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getInput_Inner() {
		return (EAttribute)inputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getGlobal() {
		return globalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getGlobal_Type() {
		return (EReference)globalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getOutput() {
		return outputEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getOutput_Inner() {
		return (EAttribute)outputEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFile() {
		return fileEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFile_Path() {
		return (EAttribute)fileEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCode() {
		return codeEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCode_Files() {
		return (EReference)codeEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorItem() {
		return behaviorItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorItem_Kind() {
		return (EAttribute)behaviorItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorItem_Order() {
		return (EAttribute)behaviorItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItem_Functions() {
		return (EReference)behaviorItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItem_Outputs() {
		return (EReference)behaviorItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItem_Globals() {
		return (EReference)behaviorItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItem_Inputs() {
		return (EReference)behaviorItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItem_Source() {
		return (EReference)behaviorItemEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionItem() {
		return functionItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionItem_Kind() {
		return (EAttribute)functionItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionItem_Budget() {
		return (EAttribute)functionItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionItem_ExecTWLength() {
		return (EAttribute)functionItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getFunctionItem_ExecTWRhythm() {
		return (EAttribute)functionItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTypeItem() {
		return typeItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTypeItem_CopyFunction() {
		return (EAttribute)typeItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getCommunicationItem() {
		return communicationItemEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationItem_Src() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationItem_Dst() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationItem_PValue() {
		return (EAttribute)communicationItemEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getCommunicationItem_Immediate() {
		return (EAttribute)communicationItemEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationItem_Type() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getCommunicationItem_Temporal() {
		return (EReference)communicationItemEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getCommunicationItem__GetPorts() {
		return communicationItemEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSource() {
		return sourceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Code() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getSource_Headers() {
		return (EReference)sourceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiedElement() {
		return identifiedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getIdentifiedElement_Id() {
		return (EAttribute)identifiedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getIdentifiableElementReferencer() {
		return identifiableElementReferencerEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass() {
		return identifiableElementReferencerEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature() {
		return identifiableElementReferencerEClass.getEOperations().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass() {
		return identifiableElementReferencerEClass.getEOperations().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource() {
		return identifiableElementReferencerEClass.getEOperations().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getNamedElement() {
		return namedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getNamedElement_Name() {
		return (EAttribute)namedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getVersionedElement() {
		return versionedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getVersionedElement_Version() {
		return (EAttribute)versionedElementEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTemporal() {
		return temporalEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Kind() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Rate() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTemporal_Offset() {
		return (EAttribute)temporalEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingConstraint() {
		return timingConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimingConstraint_Operator() {
		return (EAttribute)timingConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimingConstraint_Value() {
		return (EAttribute)timingConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EOperation getTimingConstraint__GetConstraintExpression() {
		return timingConstraintEClass.getEOperations().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getFunctionalChain() {
		return functionalChainEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalChain_CommunicationItems() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalChain_Constraints() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getFunctionalChain_Timingpaths() {
		return (EReference)functionalChainEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBlockSpatialConstraint() {
		return blockSpatialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockSpatialConstraint_LItems() {
		return (EReference)blockSpatialConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBlockSpatialConstraint_RItems() {
		return (EReference)blockSpatialConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getChainSpatialConstraint() {
		return chainSpatialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChainSpatialConstraint_LItems() {
		return (EReference)chainSpatialConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getChainSpatialConstraint_RItems() {
		return (EReference)chainSpatialConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getSpatialConstraint() {
		return spatialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getSpatialConstraint_SpatialOperator() {
		return (EAttribute)spatialConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getComSpatialConstraint() {
		return comSpatialConstraintEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComSpatialConstraint_LItems() {
		return (EReference)comSpatialConstraintEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getComSpatialConstraint_RItems() {
		return (EReference)comSpatialConstraintEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getTimingPath() {
		return timingPathEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getTimingPath_Date() {
		return (EAttribute)timingPathEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getTimingPath_BehaviorItem() {
		return (EReference)timingPathEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getBehaviorItemKind() {
		return behaviorItemKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getFunctionKind() {
		return functionKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getTemporalKind() {
		return temporalKindEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getConstraintOperator() {
		return constraintOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EEnum getSpatialOperator() {
		return spatialOperatorEEnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getIdVal() {
		return idValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getAString() {
		return aStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getOrderVal() {
		return orderValEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getTimeUnit() {
		return timeUnitEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EDataType getNanoSec() {
		return nanoSecEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public oasdFactory getoasdFactory() {
		return (oasdFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		systemDescriptionEClass = createEClass(SYSTEM_DESCRIPTION);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__TYPES);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__BEHAVIORS);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__CODES);
		createEAttribute(systemDescriptionEClass, SYSTEM_DESCRIPTION__TIME_UNIT);
		createEAttribute(systemDescriptionEClass, SYSTEM_DESCRIPTION__SOURCE);
		createEAttribute(systemDescriptionEClass, SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__COMMUNICATIONS);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS);
		createEReference(systemDescriptionEClass, SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS);

		inputEClass = createEClass(INPUT);
		createEAttribute(inputEClass, INPUT__INNER);

		globalEClass = createEClass(GLOBAL);
		createEReference(globalEClass, GLOBAL__TYPE);

		outputEClass = createEClass(OUTPUT);
		createEAttribute(outputEClass, OUTPUT__INNER);

		fileEClass = createEClass(FILE);
		createEAttribute(fileEClass, FILE__PATH);

		codeEClass = createEClass(CODE);
		createEReference(codeEClass, CODE__FILES);

		behaviorItemEClass = createEClass(BEHAVIOR_ITEM);
		createEAttribute(behaviorItemEClass, BEHAVIOR_ITEM__KIND);
		createEAttribute(behaviorItemEClass, BEHAVIOR_ITEM__ORDER);
		createEReference(behaviorItemEClass, BEHAVIOR_ITEM__FUNCTIONS);
		createEReference(behaviorItemEClass, BEHAVIOR_ITEM__OUTPUTS);
		createEReference(behaviorItemEClass, BEHAVIOR_ITEM__GLOBALS);
		createEReference(behaviorItemEClass, BEHAVIOR_ITEM__INPUTS);
		createEReference(behaviorItemEClass, BEHAVIOR_ITEM__SOURCE);

		functionItemEClass = createEClass(FUNCTION_ITEM);
		createEAttribute(functionItemEClass, FUNCTION_ITEM__KIND);
		createEAttribute(functionItemEClass, FUNCTION_ITEM__BUDGET);
		createEAttribute(functionItemEClass, FUNCTION_ITEM__EXEC_TW_LENGTH);
		createEAttribute(functionItemEClass, FUNCTION_ITEM__EXEC_TW_RHYTHM);

		typeItemEClass = createEClass(TYPE_ITEM);
		createEAttribute(typeItemEClass, TYPE_ITEM__COPY_FUNCTION);

		communicationItemEClass = createEClass(COMMUNICATION_ITEM);
		createEAttribute(communicationItemEClass, COMMUNICATION_ITEM__PVALUE);
		createEAttribute(communicationItemEClass, COMMUNICATION_ITEM__IMMEDIATE);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__TEMPORAL);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__DST);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__SRC);
		createEReference(communicationItemEClass, COMMUNICATION_ITEM__TYPE);
		createEOperation(communicationItemEClass, COMMUNICATION_ITEM___GET_PORTS);

		sourceEClass = createEClass(SOURCE);
		createEReference(sourceEClass, SOURCE__HEADERS);
		createEReference(sourceEClass, SOURCE__CODE);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		identifiableElementReferencerEClass = createEClass(IDENTIFIABLE_ELEMENT_REFERENCER);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		versionedElementEClass = createEClass(VERSIONED_ELEMENT);
		createEAttribute(versionedElementEClass, VERSIONED_ELEMENT__VERSION);

		temporalEClass = createEClass(TEMPORAL);
		createEAttribute(temporalEClass, TEMPORAL__KIND);
		createEAttribute(temporalEClass, TEMPORAL__RATE);
		createEAttribute(temporalEClass, TEMPORAL__OFFSET);

		timingConstraintEClass = createEClass(TIMING_CONSTRAINT);
		createEAttribute(timingConstraintEClass, TIMING_CONSTRAINT__OPERATOR);
		createEAttribute(timingConstraintEClass, TIMING_CONSTRAINT__VALUE);
		createEOperation(timingConstraintEClass, TIMING_CONSTRAINT___GET_CONSTRAINT_EXPRESSION);

		functionalChainEClass = createEClass(FUNCTIONAL_CHAIN);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__CONSTRAINTS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__TIMINGPATHS);
		createEReference(functionalChainEClass, FUNCTIONAL_CHAIN__COMMUNICATION_ITEMS);

		blockSpatialConstraintEClass = createEClass(BLOCK_SPATIAL_CONSTRAINT);
		createEReference(blockSpatialConstraintEClass, BLOCK_SPATIAL_CONSTRAINT__LITEMS);
		createEReference(blockSpatialConstraintEClass, BLOCK_SPATIAL_CONSTRAINT__RITEMS);

		chainSpatialConstraintEClass = createEClass(CHAIN_SPATIAL_CONSTRAINT);
		createEReference(chainSpatialConstraintEClass, CHAIN_SPATIAL_CONSTRAINT__LITEMS);
		createEReference(chainSpatialConstraintEClass, CHAIN_SPATIAL_CONSTRAINT__RITEMS);

		spatialConstraintEClass = createEClass(SPATIAL_CONSTRAINT);
		createEAttribute(spatialConstraintEClass, SPATIAL_CONSTRAINT__SPATIAL_OPERATOR);

		comSpatialConstraintEClass = createEClass(COM_SPATIAL_CONSTRAINT);
		createEReference(comSpatialConstraintEClass, COM_SPATIAL_CONSTRAINT__LITEMS);
		createEReference(comSpatialConstraintEClass, COM_SPATIAL_CONSTRAINT__RITEMS);

		timingPathEClass = createEClass(TIMING_PATH);
		createEAttribute(timingPathEClass, TIMING_PATH__DATE);
		createEReference(timingPathEClass, TIMING_PATH__BEHAVIOR_ITEM);

		// Create enums
		behaviorItemKindEEnum = createEEnum(BEHAVIOR_ITEM_KIND);
		functionKindEEnum = createEEnum(FUNCTION_KIND);
		temporalKindEEnum = createEEnum(TEMPORAL_KIND);
		constraintOperatorEEnum = createEEnum(CONSTRAINT_OPERATOR);
		spatialOperatorEEnum = createEEnum(SPATIAL_OPERATOR);

		// Create data types
		idValEDataType = createEDataType(ID_VAL);
		aStringEDataType = createEDataType(ASTRING);
		orderValEDataType = createEDataType(ORDER_VAL);
		timeUnitEDataType = createEDataType(TIME_UNIT);
		nanoSecEDataType = createEDataType(NANO_SEC);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Obtain other dependent packages
		XMLTypePackage theXMLTypePackage = (XMLTypePackage)EPackage.Registry.INSTANCE.getEPackage(XMLTypePackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		systemDescriptionEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());
		systemDescriptionEClass.getESuperTypes().add(this.getNamedElement());
		systemDescriptionEClass.getESuperTypes().add(this.getVersionedElement());
		inputEClass.getESuperTypes().add(this.getIdentifiedElement());
		inputEClass.getESuperTypes().add(this.getNamedElement());
		globalEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());
		globalEClass.getESuperTypes().add(this.getNamedElement());
		outputEClass.getESuperTypes().add(this.getIdentifiedElement());
		outputEClass.getESuperTypes().add(this.getNamedElement());
		codeEClass.getESuperTypes().add(this.getIdentifiedElement());
		behaviorItemEClass.getESuperTypes().add(this.getIdentifiedElement());
		behaviorItemEClass.getESuperTypes().add(this.getNamedElement());
		functionItemEClass.getESuperTypes().add(this.getNamedElement());
		typeItemEClass.getESuperTypes().add(this.getIdentifiedElement());
		typeItemEClass.getESuperTypes().add(this.getNamedElement());
		communicationItemEClass.getESuperTypes().add(this.getIdentifiedElement());
		sourceEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());
		identifiedElementEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());
		functionalChainEClass.getESuperTypes().add(this.getIdentifiedElement());
		functionalChainEClass.getESuperTypes().add(this.getNamedElement());
		blockSpatialConstraintEClass.getESuperTypes().add(this.getSpatialConstraint());
		chainSpatialConstraintEClass.getESuperTypes().add(this.getSpatialConstraint());
		spatialConstraintEClass.getESuperTypes().add(this.getIdentifiedElement());
		spatialConstraintEClass.getESuperTypes().add(this.getNamedElement());
		comSpatialConstraintEClass.getESuperTypes().add(this.getSpatialConstraint());
		timingPathEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());

		// Initialize classes, features, and operations; add parameters
		initEClass(systemDescriptionEClass, SystemDescription.class, "SystemDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSystemDescription_Types(), this.getTypeItem(), null, "types", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_Behaviors(), this.getBehaviorItem(), null, "behaviors", null, 1, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_Codes(), this.getCode(), null, "codes", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDescription_TimeUnit(), this.getAString(), "timeUnit", "ast_realtime_us", 1, 1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDescription_Source(), this.getAString(), "source", "realtime", 1, 1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSystemDescription_TimeUnitDeclaration(), this.getAString(), "timeUnitDeclaration", "asterios.h", 1, 1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_Communications(), this.getCommunicationItem(), null, "communications", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_FunctionalChains(), this.getFunctionalChain(), null, "functionalChains", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_ChainSpatialConstraints(), this.getChainSpatialConstraint(), null, "chainSpatialConstraints", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_BlockSpatialConstraints(), this.getBlockSpatialConstraint(), null, "blockSpatialConstraints", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSystemDescription_ComSpatialConstraints(), this.getComSpatialConstraint(), null, "comSpatialConstraints", null, 0, -1, SystemDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(inputEClass, Input.class, "Input", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getInput_Inner(), this.getAString(), "inner", null, 0, 1, Input.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(globalEClass, Global.class, "Global", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getGlobal_Type(), this.getTypeItem(), null, "type", null, 1, 1, Global.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(outputEClass, Output.class, "Output", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getOutput_Inner(), this.getAString(), "inner", null, 0, 1, Output.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(fileEClass, File.class, "File", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFile_Path(), this.getAString(), "path", null, 1, 1, File.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(codeEClass, Code.class, "Code", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getCode_Files(), this.getFile(), null, "files", null, 1, -1, Code.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(behaviorItemEClass, BehaviorItem.class, "BehaviorItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorItem_Kind(), this.getBehaviorItemKind(), "kind", "internal", 1, 1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getBehaviorItem_Order(), this.getOrderVal(), "order", "0", 1, 1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItem_Functions(), this.getFunctionItem(), null, "functions", null, 0, -1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItem_Outputs(), this.getOutput(), null, "outputs", null, 0, -1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItem_Globals(), this.getGlobal(), null, "globals", null, 0, -1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItem_Inputs(), this.getInput(), null, "inputs", null, 0, -1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItem_Source(), this.getSource(), null, "source", null, 0, 1, BehaviorItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(functionItemEClass, FunctionItem.class, "FunctionItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getFunctionItem_Kind(), this.getFunctionKind(), "kind", null, 1, 1, FunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionItem_Budget(), this.getNanoSec(), "budget", "0", 1, 1, FunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionItem_ExecTWLength(), this.getTimeUnit(), "execTWLength", null, 0, 1, FunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getFunctionItem_ExecTWRhythm(), this.getTimeUnit(), "execTWRhythm", null, 0, 1, FunctionItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(typeItemEClass, TypeItem.class, "TypeItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTypeItem_CopyFunction(), this.getAString(), "copyFunction", null, 0, 1, TypeItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(communicationItemEClass, CommunicationItem.class, "CommunicationItem", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getCommunicationItem_PValue(), theXMLTypePackage.getInt(), "pValue", "-1", 0, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getCommunicationItem_Immediate(), theXMLTypePackage.getBoolean(), "immediate", null, 1, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_Temporal(), this.getTemporal(), null, "temporal", null, 0, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_Dst(), this.getInput(), null, "dst", null, 1, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_Src(), this.getOutput(), null, "src", null, 1, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getCommunicationItem_Type(), this.getTypeItem(), null, "type", null, 0, 1, CommunicationItem.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getCommunicationItem__GetPorts(), this.getIdentifiedElement(), "getPorts", 0, -1, IS_UNIQUE, IS_ORDERED);

		initEClass(sourceEClass, Source.class, "Source", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getSource_Headers(), this.getFile(), null, "headers", null, 1, -1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSource_Code(), this.getCode(), null, "code", null, 1, 1, Source.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiedElementEClass, IdentifiedElement.class, "IdentifiedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getIdentifiedElement_Id(), this.getIdVal(), "id", null, 1, 1, IdentifiedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(identifiableElementReferencerEClass, IdentifiableElementReferencer.class, "IdentifiableElementReferencer", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		EOperation op = initEOperation(getIdentifiableElementReferencer__FindItem__Integer_EClass(), this.getIdentifiedElement(), "findItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdVal(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature(), this.getIdentifiedElement(), "findItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdVal(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEStructuralFeature(), "feature", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass(), this.getIdentifiedElement(), "findItemInResourceSet", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdVal(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);

		op = initEOperation(getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource(), this.getIdentifiedElement(), "findItem", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, this.getIdVal(), "id", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEClass(), "eClass", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEResource(), "eRessource", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(namedElementEClass, NamedElement.class, "NamedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getNamedElement_Name(), this.getAString(), "name", null, 1, 1, NamedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedElementEClass, VersionedElement.class, "VersionedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedElement_Version(), this.getAString(), "version", "1.0.0", 1, 1, VersionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(temporalEClass, Temporal.class, "Temporal", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTemporal_Kind(), this.getTemporalKind(), "kind", null, 1, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Rate(), this.getTimeUnit(), "rate", null, 1, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTemporal_Offset(), this.getTimeUnit(), "offset", null, 1, 1, Temporal.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingConstraintEClass, TimingConstraint.class, "TimingConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingConstraint_Operator(), this.getConstraintOperator(), "operator", null, 1, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTimingConstraint_Value(), this.getTimeUnit(), "value", null, 1, 1, TimingConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEOperation(getTimingConstraint__GetConstraintExpression(), ecorePackage.getEString(), "getConstraintExpression", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(functionalChainEClass, FunctionalChain.class, "FunctionalChain", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getFunctionalChain_Constraints(), this.getTimingConstraint(), null, "constraints", null, 0, 2, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_Timingpaths(), this.getTimingPath(), null, "timingpaths", null, 0, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getFunctionalChain_CommunicationItems(), this.getCommunicationItem(), null, "communicationItems", null, 1, -1, FunctionalChain.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(blockSpatialConstraintEClass, BlockSpatialConstraint.class, "BlockSpatialConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getBlockSpatialConstraint_LItems(), this.getBehaviorItem(), null, "lItems", null, 1, -1, BlockSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getBlockSpatialConstraint_RItems(), this.getBehaviorItem(), null, "rItems", null, 1, -1, BlockSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(chainSpatialConstraintEClass, ChainSpatialConstraint.class, "ChainSpatialConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getChainSpatialConstraint_LItems(), this.getFunctionalChain(), null, "lItems", null, 1, -1, ChainSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getChainSpatialConstraint_RItems(), this.getFunctionalChain(), null, "rItems", null, 1, -1, ChainSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(spatialConstraintEClass, SpatialConstraint.class, "SpatialConstraint", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSpatialConstraint_SpatialOperator(), this.getSpatialOperator(), "spatialOperator", null, 1, 1, SpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(comSpatialConstraintEClass, ComSpatialConstraint.class, "ComSpatialConstraint", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getComSpatialConstraint_LItems(), this.getCommunicationItem(), null, "lItems", null, 1, -1, ComSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getComSpatialConstraint_RItems(), this.getCommunicationItem(), null, "rItems", null, 1, -1, ComSpatialConstraint.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(timingPathEClass, TimingPath.class, "TimingPath", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTimingPath_Date(), this.getTimeUnit(), "date", null, 1, 1, TimingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getTimingPath_BehaviorItem(), this.getBehaviorItem(), null, "behaviorItem", null, 1, 1, TimingPath.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize enums and add enum literals
		initEEnum(behaviorItemKindEEnum, BehaviorItemKind.class, "BehaviorItemKind");
		addEEnumLiteral(behaviorItemKindEEnum, BehaviorItemKind.INTERNAL);
		addEEnumLiteral(behaviorItemKindEEnum, BehaviorItemKind.IN);
		addEEnumLiteral(behaviorItemKindEEnum, BehaviorItemKind.OUT);

		initEEnum(functionKindEEnum, FunctionKind.class, "FunctionKind");
		addEEnumLiteral(functionKindEEnum, FunctionKind.INIT);
		addEEnumLiteral(functionKindEEnum, FunctionKind.CYCLE);
		addEEnumLiteral(functionKindEEnum, FunctionKind.RESET);

		initEEnum(temporalKindEEnum, TemporalKind.class, "TemporalKind");
		addEEnumLiteral(temporalKindEEnum, TemporalKind.PERIODIC);
		addEEnumLiteral(temporalKindEEnum, TemporalKind.DIRECT);

		initEEnum(constraintOperatorEEnum, ConstraintOperator.class, "ConstraintOperator");
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.LESSER_THAN);
		addEEnumLiteral(constraintOperatorEEnum, ConstraintOperator.GREATER_THAN);

		initEEnum(spatialOperatorEEnum, SpatialOperator.class, "SpatialOperator");
		addEEnumLiteral(spatialOperatorEEnum, SpatialOperator.EXCLUDE);
		addEEnumLiteral(spatialOperatorEEnum, SpatialOperator.INCLUDE);

		// Initialize data types
		initEDataType(idValEDataType, Integer.class, "IdVal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(aStringEDataType, String.class, "AString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(orderValEDataType, Integer.class, "OrderVal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(timeUnitEDataType, Integer.class, "TimeUnit", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(nanoSecEDataType, Long.class, "NanoSec", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";
		addAnnotation
		  (getFunctionalChain_CommunicationItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getBlockSpatialConstraint_LItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getBlockSpatialConstraint_RItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getChainSpatialConstraint_LItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getChainSpatialConstraint_RItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getComSpatialConstraint_LItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
		addAnnotation
		  (getComSpatialConstraint_RItems(),
		   source,
		   new String[] {
			   "kind", "element"
		   });
	}

} //oasdPackageImpl
