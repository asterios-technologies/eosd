/**
 */
package com.kronosafe.osd.oad.impl;

import com.kronosafe.osd.core.corePackage;
import com.kronosafe.osd.core.impl.corePackageImpl;
import com.kronosafe.osd.oad.Allocation;
import com.kronosafe.osd.oad.AllocationDescription;
import com.kronosafe.osd.oad.BehaviorItemReference;
import com.kronosafe.osd.oad.oadFactory;
import com.kronosafe.osd.oad.oadPackage;
import com.kronosafe.osd.oasd.oasdPackage;
import com.kronosafe.osd.oasd.impl.oasdPackageImpl;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class oadPackageImpl extends EPackageImpl implements oadPackage {
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
	private EClass behaviorItemReferenceEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass allocationDescriptionEClass = null;

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
	 * @see com.kronosafe.osd.oad.oadPackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private oadPackageImpl() {
		super(eNS_URI, oadFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link oadPackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static oadPackage init() {
		if (isInited) return (oadPackage)EPackage.Registry.INSTANCE.getEPackage(oadPackage.eNS_URI);

		// Obtain or create and register package
		Object registeredoadPackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		oadPackageImpl theoadPackage = registeredoadPackage instanceof oadPackageImpl ? (oadPackageImpl)registeredoadPackage : new oadPackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(oasdPackage.eNS_URI);
		oasdPackageImpl theoasdPackage = (oasdPackageImpl)(registeredPackage instanceof oasdPackageImpl ? registeredPackage : oasdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(corePackage.eNS_URI);
		corePackageImpl thecorePackage = (corePackageImpl)(registeredPackage instanceof corePackageImpl ? registeredPackage : corePackage.eINSTANCE);

		// Create package meta-data objects
		theoadPackage.createPackageContents();
		theoasdPackage.createPackageContents();
		thecorePackage.createPackageContents();

		// Initialize created meta-data
		theoadPackage.initializePackageContents();
		theoasdPackage.initializePackageContents();
		thecorePackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		theoadPackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(oadPackage.eNS_URI, theoadPackage);
		return theoadPackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getBehaviorItemReference() {
		return behaviorItemReferenceEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getBehaviorItemReference_BehaviorItem() {
		return (EAttribute)behaviorItemReferenceEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getBehaviorItemReference_BehaviorItemElement() {
		return (EReference)behaviorItemReferenceEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocation() {
		return allocationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAllocation_SwExecutionUnit() {
		return (EAttribute)allocationEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocation_BehaviorItemReferences() {
		return (EReference)allocationEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAllocationDescription() {
		return allocationDescriptionEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationDescription_Allocations() {
		return (EReference)allocationDescriptionEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAllocationDescription_SystemDescriptionRef() {
		return (EReference)allocationDescriptionEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public oadFactory getoadFactory() {
		return (oadFactory)getEFactoryInstance();
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
		behaviorItemReferenceEClass = createEClass(BEHAVIOR_ITEM_REFERENCE);
		createEAttribute(behaviorItemReferenceEClass, BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM);
		createEReference(behaviorItemReferenceEClass, BEHAVIOR_ITEM_REFERENCE__BEHAVIOR_ITEM_ELEMENT);

		allocationEClass = createEClass(ALLOCATION);
		createEAttribute(allocationEClass, ALLOCATION__SW_EXECUTION_UNIT);
		createEReference(allocationEClass, ALLOCATION__BEHAVIOR_ITEM_REFERENCES);

		allocationDescriptionEClass = createEClass(ALLOCATION_DESCRIPTION);
		createEReference(allocationDescriptionEClass, ALLOCATION_DESCRIPTION__ALLOCATIONS);
		createEReference(allocationDescriptionEClass, ALLOCATION_DESCRIPTION__SYSTEM_DESCRIPTION_REF);
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
		corePackage thecorePackage = (corePackage)EPackage.Registry.INSTANCE.getEPackage(corePackage.eNS_URI);
		oasdPackage theoasdPackage = (oasdPackage)EPackage.Registry.INSTANCE.getEPackage(oasdPackage.eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		behaviorItemReferenceEClass.getESuperTypes().add(thecorePackage.getIdentifiableElementReferencer());
		allocationDescriptionEClass.getESuperTypes().add(thecorePackage.getVersionedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(behaviorItemReferenceEClass, BehaviorItemReference.class, "BehaviorItemReference", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getBehaviorItemReference_BehaviorItem(), thecorePackage.getIdVal(), "behaviorItem", null, 1, 1, BehaviorItemReference.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, IS_DERIVED, IS_ORDERED);
		initEReference(getBehaviorItemReference_BehaviorItemElement(), theoasdPackage.getBehaviorItem(), null, "behaviorItemElement", null, 1, 1, BehaviorItemReference.class, IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationEClass, Allocation.class, "Allocation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAllocation_SwExecutionUnit(), thecorePackage.getAString(), "swExecutionUnit", null, 0, 1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocation_BehaviorItemReferences(), this.getBehaviorItemReference(), null, "behaviorItemReferences", null, 1, -1, Allocation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(allocationDescriptionEClass, AllocationDescription.class, "AllocationDescription", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAllocationDescription_Allocations(), this.getAllocation(), null, "allocations", null, 0, -1, AllocationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getAllocationDescription_SystemDescriptionRef(), theoasdPackage.getSystemDescription(), null, "systemDescriptionRef", null, 1, 1, AllocationDescription.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Create resource
		createResource(eNS_URI);
	}

} //oadPackageImpl
