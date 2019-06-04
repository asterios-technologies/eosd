/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.core.impl;

import com.kronosafe.osd.core.AnnotatedElement;
import com.kronosafe.osd.core.Annotation;
import com.kronosafe.osd.core.IdentifiableElementReferencer;
import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.core.NamedElement;
import com.kronosafe.osd.core.VersionedElement;
import com.kronosafe.osd.core.coreFactory;
import com.kronosafe.osd.core.corePackage;

import com.kronosafe.osd.oad.impl.oadPackageImpl;

import com.kronosafe.osd.oad.oadPackage;

import com.kronosafe.osd.oasd.impl.oasdPackageImpl;

import com.kronosafe.osd.oasd.oasdPackage;

import java.util.Map;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class corePackageImpl extends EPackageImpl implements corePackage {
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
	private EClass annotationMapEntryEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass annotatedElementEClass = null;

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
	private EClass annotationEClass = null;

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
	private EDataType idValEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType aStringEDataType = null;

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
	 * @see com.kronosafe.osd.core.corePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private corePackageImpl() {
		super(eNS_URI, coreFactory.eINSTANCE);
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
	 * <p>This method is used to initialize {@link corePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static corePackage init() {
		if (isInited) return (corePackage)EPackage.Registry.INSTANCE.getEPackage(corePackage.eNS_URI);

		// Obtain or create and register package
		Object registeredcorePackage = EPackage.Registry.INSTANCE.get(eNS_URI);
		corePackageImpl thecorePackage = registeredcorePackage instanceof corePackageImpl ? (corePackageImpl)registeredcorePackage : new corePackageImpl();

		isInited = true;

		// Obtain or create and register interdependencies
		Object registeredPackage = EPackage.Registry.INSTANCE.getEPackage(oasdPackage.eNS_URI);
		oasdPackageImpl theoasdPackage = (oasdPackageImpl)(registeredPackage instanceof oasdPackageImpl ? registeredPackage : oasdPackage.eINSTANCE);
		registeredPackage = EPackage.Registry.INSTANCE.getEPackage(oadPackage.eNS_URI);
		oadPackageImpl theoadPackage = (oadPackageImpl)(registeredPackage instanceof oadPackageImpl ? registeredPackage : oadPackage.eINSTANCE);

		// Create package meta-data objects
		thecorePackage.createPackageContents();
		theoasdPackage.createPackageContents();
		theoadPackage.createPackageContents();

		// Initialize created meta-data
		thecorePackage.initializePackageContents();
		theoasdPackage.initializePackageContents();
		theoadPackage.initializePackageContents();

		// Mark meta-data to indicate it can't be changed
		thecorePackage.freeze();

		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(corePackage.eNS_URI, thecorePackage);
		return thecorePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotationMapEntry() {
		return annotationMapEntryEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationMapEntry_Key() {
		return (EAttribute)annotationMapEntryEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EAttribute getAnnotationMapEntry_Value() {
		return (EAttribute)annotationMapEntryEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EClass getAnnotatedElement() {
		return annotatedElementEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotatedElement_Annotations() {
		return (EReference)annotatedElementEClass.getEStructuralFeatures().get(0);
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
	public EClass getAnnotation() {
		return annotationEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EReference getAnnotation_Details() {
		return (EReference)annotationEClass.getEStructuralFeatures().get(0);
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
	public coreFactory getcoreFactory() {
		return (coreFactory)getEFactoryInstance();
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
		annotationMapEntryEClass = createEClass(ANNOTATION_MAP_ENTRY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__KEY);
		createEAttribute(annotationMapEntryEClass, ANNOTATION_MAP_ENTRY__VALUE);

		annotatedElementEClass = createEClass(ANNOTATED_ELEMENT);
		createEReference(annotatedElementEClass, ANNOTATED_ELEMENT__ANNOTATIONS);

		versionedElementEClass = createEClass(VERSIONED_ELEMENT);
		createEAttribute(versionedElementEClass, VERSIONED_ELEMENT__VERSION);

		annotationEClass = createEClass(ANNOTATION);
		createEReference(annotationEClass, ANNOTATION__DETAILS);

		identifiedElementEClass = createEClass(IDENTIFIED_ELEMENT);
		createEAttribute(identifiedElementEClass, IDENTIFIED_ELEMENT__ID);

		identifiableElementReferencerEClass = createEClass(IDENTIFIABLE_ELEMENT_REFERENCER);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS);
		createEOperation(identifiableElementReferencerEClass, IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE);

		namedElementEClass = createEClass(NAMED_ELEMENT);
		createEAttribute(namedElementEClass, NAMED_ELEMENT__NAME);

		// Create data types
		idValEDataType = createEDataType(ID_VAL);
		aStringEDataType = createEDataType(ASTRING);
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

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		identifiedElementEClass.getESuperTypes().add(this.getIdentifiableElementReferencer());
		identifiableElementReferencerEClass.getESuperTypes().add(this.getAnnotatedElement());
		namedElementEClass.getESuperTypes().add(this.getAnnotatedElement());

		// Initialize classes, features, and operations; add parameters
		initEClass(annotationMapEntryEClass, Map.Entry.class, "AnnotationMapEntry", !IS_ABSTRACT, !IS_INTERFACE, !IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getAnnotationMapEntry_Key(), this.getAString(), "key", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getAnnotationMapEntry_Value(), this.getAString(), "value", null, 0, 1, Map.Entry.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotatedElementEClass, AnnotatedElement.class, "AnnotatedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotatedElement_Annotations(), this.getAnnotation(), null, "annotations", null, 0, -1, AnnotatedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(versionedElementEClass, VersionedElement.class, "VersionedElement", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getVersionedElement_Version(), this.getAString(), "version", "1.0.0", 1, 1, VersionedElement.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(annotationEClass, Annotation.class, "Annotation", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAnnotation_Details(), this.getAnnotationMapEntry(), null, "details", null, 0, -1, Annotation.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, !IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

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

		// Initialize data types
		initEDataType(idValEDataType, Integer.class, "IdVal", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(aStringEDataType, String.class, "AString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);
	}

} //corePackageImpl
