/**
 */
package com.kronosafe.osd.oasd;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EOperation;
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
 * <!-- begin-model-doc -->
 * The open architecture system description used to describe the system and functional design.
 * <!-- end-model-doc -->
 * @see com.kronosafe.osd.oasd.oasdFactory
 * @model kind="package"
 * @generated
 */
public interface oasdPackage extends EPackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The package name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNAME = "oasd";

	/**
	 * The package namespace URI.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_URI = "http://www.kronosafe.com/oasd";

	/**
	 * The package namespace name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String eNS_PREFIX = "";

	/**
	 * The singleton instance of the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	oasdPackage eINSTANCE = com.kronosafe.osd.oasd.impl.oasdPackageImpl.init();

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.IdentifiableElementReferencerImpl <em>Identifiable Element Referencer</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.IdentifiableElementReferencerImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdentifiableElementReferencer()
	 * @generated
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER = 12;

	/**
	 * The number of structural features of the '<em>Identifiable Element Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT = 0;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS = 0;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = 1;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE = 3;

	/**
	 * The number of operations of the '<em>Identifiable Element Referencer</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT = 4;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl <em>System Description</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SystemDescriptionImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSystemDescription()
	 * @generated
	 */
	int SYSTEM_DESCRIPTION = 0;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__NAME = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__VERSION = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Types</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TYPES = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Behaviors</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__BEHAVIORS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Codes</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__CODES = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Time Unit</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TIME_UNIT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Source</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__SOURCE = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Time Unit Declaration</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 7;

	/**
	 * The feature id for the '<em><b>Communications</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__COMMUNICATIONS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 8;

	/**
	 * The feature id for the '<em><b>Functional Chains</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 9;

	/**
	 * The feature id for the '<em><b>Chain Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 10;

	/**
	 * The feature id for the '<em><b>Block Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 11;

	/**
	 * The feature id for the '<em><b>Com Spatial Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 12;

	/**
	 * The number of structural features of the '<em>System Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 13;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>System Description</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SYSTEM_DESCRIPTION_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.IdentifiedElementImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdentifiedElement()
	 * @generated
	 */
	int IDENTIFIED_ELEMENT = 11;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT__ID = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Identified Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int IDENTIFIED_ELEMENT_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.InputImpl <em>Input</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.InputImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getInput()
	 * @generated
	 */
	int INPUT = 1;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT__INNER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Input</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int INPUT_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.GlobalImpl <em>Global</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.GlobalImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGlobal()
	 * @generated
	 */
	int GLOBAL = 2;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__NAME = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL__TYPE = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Global</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int GLOBAL_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.OutputImpl <em>Output</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.OutputImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOutput()
	 * @generated
	 */
	int OUTPUT = 3;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Inner</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT__INNER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Output</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int OUTPUT_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FileImpl <em>File</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FileImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFile()
	 * @generated
	 */
	int FILE = 4;

	/**
	 * The feature id for the '<em><b>Path</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE__PATH = 0;

	/**
	 * The number of structural features of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>File</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FILE_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.CodeImpl <em>Code</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.CodeImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCode()
	 * @generated
	 */
	int CODE = 5;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Files</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE__FILES = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The number of structural features of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Code</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CODE_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl <em>Behavior Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.BehaviorItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItem()
	 * @generated
	 */
	int BEHAVIOR_ITEM = 6;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__KIND = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Order</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__ORDER = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Functions</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__FUNCTIONS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Outputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__OUTPUTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Globals</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__GLOBALS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The feature id for the '<em><b>Inputs</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__INPUTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The feature id for the '<em><b>Source</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM__SOURCE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 7;

	/**
	 * The number of structural features of the '<em>Behavior Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 8;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Behavior Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BEHAVIOR_ITEM_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.NamedElementImpl <em>Named Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.NamedElementImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNamedElement()
	 * @generated
	 */
	int NAMED_ELEMENT = 13;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT__NAME = 0;

	/**
	 * The number of structural features of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Named Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int NAMED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl <em>Function Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FunctionItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionItem()
	 * @generated
	 */
	int FUNCTION_ITEM = 7;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__NAME = NAMED_ELEMENT__NAME;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__KIND = NAMED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Budget</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__BUDGET = NAMED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Exec TW Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__EXEC_TW_LENGTH = NAMED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Exec TW Rhythm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM__EXEC_TW_RHYTHM = NAMED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Function Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM_FEATURE_COUNT = NAMED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The number of operations of the '<em>Function Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTION_ITEM_OPERATION_COUNT = NAMED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TypeItemImpl <em>Type Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TypeItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTypeItem()
	 * @generated
	 */
	int TYPE_ITEM = 8;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Copy Function</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM__COPY_FUNCTION = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Type Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TYPE_ITEM_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl <em>Communication Item</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.CommunicationItemImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCommunicationItem()
	 * @generated
	 */
	int COMMUNICATION_ITEM = 9;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>PValue</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__PVALUE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Immediate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__IMMEDIATE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Temporal</b></em>' containment reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__TEMPORAL = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Dst</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__DST = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The feature id for the '<em><b>Src</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__SRC = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The feature id for the '<em><b>Type</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM__TYPE = IDENTIFIED_ELEMENT_FEATURE_COUNT + 5;

	/**
	 * The number of structural features of the '<em>Communication Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 6;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The operation id for the '<em>Get Ports</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM___GET_PORTS = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The number of operations of the '<em>Communication Item</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COMMUNICATION_ITEM_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 1;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SourceImpl <em>Source</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SourceImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSource()
	 * @generated
	 */
	int SOURCE = 10;

	/**
	 * The feature id for the '<em><b>Headers</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__HEADERS = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Code</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE__CODE = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Source</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SOURCE_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.VersionedElementImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getVersionedElement()
	 * @generated
	 */
	int VERSIONED_ELEMENT = 14;

	/**
	 * The feature id for the '<em><b>Version</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT__VERSION = 0;

	/**
	 * The number of structural features of the '<em>Versioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT_FEATURE_COUNT = 1;

	/**
	 * The number of operations of the '<em>Versioned Element</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int VERSIONED_ELEMENT_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TemporalImpl <em>Temporal</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TemporalImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporal()
	 * @generated
	 */
	int TEMPORAL = 15;

	/**
	 * The feature id for the '<em><b>Kind</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__KIND = 0;

	/**
	 * The feature id for the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__RATE = 1;

	/**
	 * The feature id for the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL__OFFSET = 2;

	/**
	 * The number of structural features of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_FEATURE_COUNT = 3;

	/**
	 * The number of operations of the '<em>Temporal</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TEMPORAL_OPERATION_COUNT = 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TimingConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingConstraint()
	 * @generated
	 */
	int TIMING_CONSTRAINT = 16;

	/**
	 * The feature id for the '<em><b>Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__OPERATOR = 0;

	/**
	 * The feature id for the '<em><b>Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT__VALUE = 1;

	/**
	 * The number of structural features of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_FEATURE_COUNT = 2;

	/**
	 * The operation id for the '<em>Get Constraint Expression</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT___GET_CONSTRAINT_EXPRESSION = 0;

	/**
	 * The number of operations of the '<em>Timing Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_CONSTRAINT_OPERATION_COUNT = 1;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.FunctionalChainImpl <em>Functional Chain</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.FunctionalChainImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionalChain()
	 * @generated
	 */
	int FUNCTIONAL_CHAIN = 17;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Constraints</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__CONSTRAINTS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The feature id for the '<em><b>Timingpaths</b></em>' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__TIMINGPATHS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The feature id for the '<em><b>Communication Items</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN__COMMUNICATION_ITEMS = IDENTIFIED_ELEMENT_FEATURE_COUNT + 3;

	/**
	 * The number of structural features of the '<em>Functional Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 4;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Functional Chain</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int FUNCTIONAL_CHAIN_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl <em>Block Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBlockSpatialConstraint()
	 * @generated
	 */
	int BLOCK_SPATIAL_CONSTRAINT = 18;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl <em>Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.SpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialConstraint()
	 * @generated
	 */
	int SPATIAL_CONSTRAINT = 20;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__ID = IDENTIFIED_ELEMENT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__NAME = IDENTIFIED_ELEMENT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = IDENTIFIED_ELEMENT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT_FEATURE_COUNT = IDENTIFIED_ELEMENT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIED_ELEMENT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIED_ELEMENT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int SPATIAL_CONSTRAINT_OPERATION_COUNT = IDENTIFIED_ELEMENT_OPERATION_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Block Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Block Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int BLOCK_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl <em>Chain Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getChainSpatialConstraint()
	 * @generated
	 */
	int CHAIN_SPATIAL_CONSTRAINT = 19;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Chain Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Chain Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int CHAIN_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl <em>Com Spatial Constraint</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getComSpatialConstraint()
	 * @generated
	 */
	int COM_SPATIAL_CONSTRAINT = 21;

	/**
	 * The feature id for the '<em><b>Id</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__ID = SPATIAL_CONSTRAINT__ID;

	/**
	 * The feature id for the '<em><b>Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__NAME = SPATIAL_CONSTRAINT__NAME;

	/**
	 * The feature id for the '<em><b>Spatial Operator</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = SPATIAL_CONSTRAINT__SPATIAL_OPERATOR;

	/**
	 * The feature id for the '<em><b>LItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__LITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>RItems</b></em>' reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT__RITEMS = SPATIAL_CONSTRAINT_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Com Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT_FEATURE_COUNT = SPATIAL_CONSTRAINT_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = SPATIAL_CONSTRAINT___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE = SPATIAL_CONSTRAINT___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Com Spatial Constraint</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int COM_SPATIAL_CONSTRAINT_OPERATION_COUNT = SPATIAL_CONSTRAINT_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.impl.TimingPathImpl <em>Timing Path</em>}' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.impl.TimingPathImpl
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingPath()
	 * @generated
	 */
	int TIMING_PATH = 22;

	/**
	 * The feature id for the '<em><b>Date</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH__DATE = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 0;

	/**
	 * The feature id for the '<em><b>Behavior Item</b></em>' reference.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH__BEHAVIOR_ITEM = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 1;

	/**
	 * The number of structural features of the '<em>Timing Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_FEATURE_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_FEATURE_COUNT + 2;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH___FIND_ITEM__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE;

	/**
	 * The operation id for the '<em>Find Item In Resource Set</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS;

	/**
	 * The operation id for the '<em>Find Item</em>' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH___FIND_ITEM__INTEGER_ECLASS_RESOURCE = IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE;

	/**
	 * The number of operations of the '<em>Timing Path</em>' class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 * @ordered
	 */
	int TIMING_PATH_OPERATION_COUNT = IDENTIFIABLE_ELEMENT_REFERENCER_OPERATION_COUNT + 0;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItemKind()
	 * @generated
	 */
	int BEHAVIOR_ITEM_KIND = 23;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionKind()
	 * @generated
	 */
	int FUNCTION_KIND = 24;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporalKind()
	 * @generated
	 */
	int TEMPORAL_KIND = 25;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getConstraintOperator()
	 * @generated
	 */
	int CONSTRAINT_OPERATOR = 26;

	/**
	 * The meta object id for the '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}' enum.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialOperator()
	 * @generated
	 */
	int SPATIAL_OPERATOR = 27;

	/**
	 * The meta object id for the '<em>Id Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdVal()
	 * @generated
	 */
	int ID_VAL = 28;

	/**
	 * The meta object id for the '<em>AString</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.String
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getAString()
	 * @generated
	 */
	int ASTRING = 29;

	/**
	 * The meta object id for the '<em>Order Val</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOrderVal()
	 * @generated
	 */
	int ORDER_VAL = 30;

	/**
	 * The meta object id for the '<em>Time Unit</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Integer
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimeUnit()
	 * @generated
	 */
	int TIME_UNIT = 31;

	/**
	 * The meta object id for the '<em>Nano Sec</em>' data type.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see java.lang.Long
	 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNanoSec()
	 * @generated
	 */
	int NANO_SEC = 32;


	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.SystemDescription <em>System Description</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>System Description</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription
	 * @generated
	 */
	EClass getSystemDescription();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getTypes <em>Types</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Types</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTypes()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Types();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getBehaviors <em>Behaviors</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Behaviors</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getBehaviors()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Behaviors();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getCodes <em>Codes</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Codes</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getCodes()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Codes();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnit <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTimeUnit()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_TimeUnit();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getSource()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_Source();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration <em>Time Unit Declaration</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Time Unit Declaration</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getTimeUnitDeclaration()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EAttribute getSystemDescription_TimeUnitDeclaration();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getCommunications <em>Communications</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Communications</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getCommunications()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_Communications();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getFunctionalChains <em>Functional Chains</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functional Chains</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getFunctionalChains()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_FunctionalChains();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getChainSpatialConstraints <em>Chain Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Chain Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getChainSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_ChainSpatialConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getBlockSpatialConstraints <em>Block Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Block Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getBlockSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_BlockSpatialConstraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.SystemDescription#getComSpatialConstraints <em>Com Spatial Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Com Spatial Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.SystemDescription#getComSpatialConstraints()
	 * @see #getSystemDescription()
	 * @generated
	 */
	EReference getSystemDescription_ComSpatialConstraints();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Input <em>Input</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Input</em>'.
	 * @see com.kronosafe.osd.oasd.Input
	 * @generated
	 */
	EClass getInput();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Input#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see com.kronosafe.osd.oasd.Input#getInner()
	 * @see #getInput()
	 * @generated
	 */
	EAttribute getInput_Inner();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Global <em>Global</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Global</em>'.
	 * @see com.kronosafe.osd.oasd.Global
	 * @generated
	 */
	EClass getGlobal();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Global#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.Global#getType()
	 * @see #getGlobal()
	 * @generated
	 */
	EReference getGlobal_Type();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Output <em>Output</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Output</em>'.
	 * @see com.kronosafe.osd.oasd.Output
	 * @generated
	 */
	EClass getOutput();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Output#getInner <em>Inner</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Inner</em>'.
	 * @see com.kronosafe.osd.oasd.Output#getInner()
	 * @see #getOutput()
	 * @generated
	 */
	EAttribute getOutput_Inner();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.File <em>File</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>File</em>'.
	 * @see com.kronosafe.osd.oasd.File
	 * @generated
	 */
	EClass getFile();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.File#getPath <em>Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Path</em>'.
	 * @see com.kronosafe.osd.oasd.File#getPath()
	 * @see #getFile()
	 * @generated
	 */
	EAttribute getFile_Path();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Code <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Code</em>'.
	 * @see com.kronosafe.osd.oasd.Code
	 * @generated
	 */
	EClass getCode();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.Code#getFiles <em>Files</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Files</em>'.
	 * @see com.kronosafe.osd.oasd.Code#getFiles()
	 * @see #getCode()
	 * @generated
	 */
	EReference getCode_Files();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.BehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Behavior Item</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem
	 * @generated
	 */
	EClass getBehaviorItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.BehaviorItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getKind()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EAttribute getBehaviorItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.BehaviorItem#getOrder <em>Order</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Order</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getOrder()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EAttribute getBehaviorItem_Order();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getFunctions <em>Functions</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Functions</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getFunctions()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Functions();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getOutputs <em>Outputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Outputs</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getOutputs()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Outputs();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getGlobals <em>Globals</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Globals</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getGlobals()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Globals();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.BehaviorItem#getInputs <em>Inputs</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Inputs</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getInputs()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Inputs();

	/**
	 * Returns the meta object for the containment reference '{@link com.kronosafe.osd.oasd.BehaviorItem#getSource <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItem#getSource()
	 * @see #getBehaviorItem()
	 * @generated
	 */
	EReference getBehaviorItem_Source();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.FunctionItem <em>Function Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Function Item</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem
	 * @generated
	 */
	EClass getFunctionItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getKind()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getBudget <em>Budget</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Budget</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getBudget()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_Budget();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWLength <em>Exec TW Length</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exec TW Length</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getExecTWLength()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_ExecTWLength();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm <em>Exec TW Rhythm</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Exec TW Rhythm</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm()
	 * @see #getFunctionItem()
	 * @generated
	 */
	EAttribute getFunctionItem_ExecTWRhythm();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TypeItem <em>Type Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Type Item</em>'.
	 * @see com.kronosafe.osd.oasd.TypeItem
	 * @generated
	 */
	EClass getTypeItem();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TypeItem#getCopyFunction <em>Copy Function</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Copy Function</em>'.
	 * @see com.kronosafe.osd.oasd.TypeItem#getCopyFunction()
	 * @see #getTypeItem()
	 * @generated
	 */
	EAttribute getTypeItem_CopyFunction();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.CommunicationItem <em>Communication Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Communication Item</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem
	 * @generated
	 */
	EClass getCommunicationItem();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getSrc <em>Src</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Src</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getSrc()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Src();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getDst <em>Dst</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Dst</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getDst()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Dst();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.CommunicationItem#getPValue <em>PValue</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>PValue</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getPValue()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EAttribute getCommunicationItem_PValue();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.CommunicationItem#isImmediate <em>Immediate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Immediate</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#isImmediate()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EAttribute getCommunicationItem_Immediate();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getType <em>Type</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Type</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getType()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Type();

	/**
	 * Returns the meta object for the containment reference '{@link com.kronosafe.osd.oasd.CommunicationItem#getTemporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference '<em>Temporal</em>'.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getTemporal()
	 * @see #getCommunicationItem()
	 * @generated
	 */
	EReference getCommunicationItem_Temporal();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.CommunicationItem#getPorts() <em>Get Ports</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Ports</em>' operation.
	 * @see com.kronosafe.osd.oasd.CommunicationItem#getPorts()
	 * @generated
	 */
	EOperation getCommunicationItem__GetPorts();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Source <em>Source</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Source</em>'.
	 * @see com.kronosafe.osd.oasd.Source
	 * @generated
	 */
	EClass getSource();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.Source#getCode <em>Code</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Code</em>'.
	 * @see com.kronosafe.osd.oasd.Source#getCode()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Code();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.Source#getHeaders <em>Headers</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Headers</em>'.
	 * @see com.kronosafe.osd.oasd.Source#getHeaders()
	 * @see #getSource()
	 * @generated
	 */
	EReference getSource_Headers();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.IdentifiedElement <em>Identified Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identified Element</em>'.
	 * @see com.kronosafe.osd.oasd.IdentifiedElement
	 * @generated
	 */
	EClass getIdentifiedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.IdentifiedElement#getId <em>Id</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Id</em>'.
	 * @see com.kronosafe.osd.oasd.IdentifiedElement#getId()
	 * @see #getIdentifiedElement()
	 * @generated
	 */
	EAttribute getIdentifiedElement_Id();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer <em>Identifiable Element Referencer</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Identifiable Element Referencer</em>'.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer
	 * @generated
	 */
	EClass getIdentifiableElementReferencer();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item In Resource Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item In Resource Set</em>' operation.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Find Item</em>' operation.
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource)
	 * @generated
	 */
	EOperation getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.NamedElement <em>Named Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Named Element</em>'.
	 * @see com.kronosafe.osd.oasd.NamedElement
	 * @generated
	 */
	EClass getNamedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.NamedElement#getName <em>Name</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Name</em>'.
	 * @see com.kronosafe.osd.oasd.NamedElement#getName()
	 * @see #getNamedElement()
	 * @generated
	 */
	EAttribute getNamedElement_Name();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.VersionedElement <em>Versioned Element</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Versioned Element</em>'.
	 * @see com.kronosafe.osd.oasd.VersionedElement
	 * @generated
	 */
	EClass getVersionedElement();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.VersionedElement#getVersion <em>Version</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Version</em>'.
	 * @see com.kronosafe.osd.oasd.VersionedElement#getVersion()
	 * @see #getVersionedElement()
	 * @generated
	 */
	EAttribute getVersionedElement_Version();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.Temporal <em>Temporal</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Temporal</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal
	 * @generated
	 */
	EClass getTemporal();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getKind <em>Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Kind</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getKind()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Kind();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getRate <em>Rate</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Rate</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getRate()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Rate();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.Temporal#getOffset <em>Offset</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Offset</em>'.
	 * @see com.kronosafe.osd.oasd.Temporal#getOffset()
	 * @see #getTemporal()
	 * @generated
	 */
	EAttribute getTemporal_Offset();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TimingConstraint <em>Timing Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint
	 * @generated
	 */
	EClass getTimingConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingConstraint#getOperator <em>Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Operator</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getOperator()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Operator();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingConstraint#getValue <em>Value</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Value</em>'.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getValue()
	 * @see #getTimingConstraint()
	 * @generated
	 */
	EAttribute getTimingConstraint_Value();

	/**
	 * Returns the meta object for the '{@link com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression() <em>Get Constraint Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the '<em>Get Constraint Expression</em>' operation.
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression()
	 * @generated
	 */
	EOperation getTimingConstraint__GetConstraintExpression();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.FunctionalChain <em>Functional Chain</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Functional Chain</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChain
	 * @generated
	 */
	EClass getFunctionalChain();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.FunctionalChain#getCommunicationItems <em>Communication Items</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>Communication Items</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChain#getCommunicationItems()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_CommunicationItems();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.FunctionalChain#getConstraints <em>Constraints</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Constraints</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChain#getConstraints()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_Constraints();

	/**
	 * Returns the meta object for the containment reference list '{@link com.kronosafe.osd.oasd.FunctionalChain#getTimingpaths <em>Timingpaths</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the containment reference list '<em>Timingpaths</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionalChain#getTimingpaths()
	 * @see #getFunctionalChain()
	 * @generated
	 */
	EReference getFunctionalChain_Timingpaths();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint <em>Block Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Block Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint
	 * @generated
	 */
	EClass getBlockSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint#getLItems()
	 * @see #getBlockSpatialConstraint()
	 * @generated
	 */
	EReference getBlockSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.BlockSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.BlockSpatialConstraint#getRItems()
	 * @see #getBlockSpatialConstraint()
	 * @generated
	 */
	EReference getBlockSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint <em>Chain Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Chain Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint
	 * @generated
	 */
	EClass getChainSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint#getLItems()
	 * @see #getChainSpatialConstraint()
	 * @generated
	 */
	EReference getChainSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ChainSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.ChainSpatialConstraint#getRItems()
	 * @see #getChainSpatialConstraint()
	 * @generated
	 */
	EReference getChainSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.SpatialConstraint <em>Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialConstraint
	 * @generated
	 */
	EClass getSpatialConstraint();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator <em>Spatial Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Spatial Operator</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialConstraint#getSpatialOperator()
	 * @see #getSpatialConstraint()
	 * @generated
	 */
	EAttribute getSpatialConstraint_SpatialOperator();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.ComSpatialConstraint <em>Com Spatial Constraint</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Com Spatial Constraint</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint
	 * @generated
	 */
	EClass getComSpatialConstraint();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ComSpatialConstraint#getLItems <em>LItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>LItems</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint#getLItems()
	 * @see #getComSpatialConstraint()
	 * @generated
	 */
	EReference getComSpatialConstraint_LItems();

	/**
	 * Returns the meta object for the reference list '{@link com.kronosafe.osd.oasd.ComSpatialConstraint#getRItems <em>RItems</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference list '<em>RItems</em>'.
	 * @see com.kronosafe.osd.oasd.ComSpatialConstraint#getRItems()
	 * @see #getComSpatialConstraint()
	 * @generated
	 */
	EReference getComSpatialConstraint_RItems();

	/**
	 * Returns the meta object for class '{@link com.kronosafe.osd.oasd.TimingPath <em>Timing Path</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for class '<em>Timing Path</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPath
	 * @generated
	 */
	EClass getTimingPath();

	/**
	 * Returns the meta object for the attribute '{@link com.kronosafe.osd.oasd.TimingPath#getDate <em>Date</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the attribute '<em>Date</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPath#getDate()
	 * @see #getTimingPath()
	 * @generated
	 */
	EAttribute getTimingPath_Date();

	/**
	 * Returns the meta object for the reference '{@link com.kronosafe.osd.oasd.TimingPath#getBehaviorItem <em>Behavior Item</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for the reference '<em>Behavior Item</em>'.
	 * @see com.kronosafe.osd.oasd.TimingPath#getBehaviorItem()
	 * @see #getTimingPath()
	 * @generated
	 */
	EReference getTimingPath_BehaviorItem();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Behavior Item Kind</em>'.
	 * @see com.kronosafe.osd.oasd.BehaviorItemKind
	 * @generated
	 */
	EEnum getBehaviorItemKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Function Kind</em>'.
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @generated
	 */
	EEnum getFunctionKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Temporal Kind</em>'.
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @generated
	 */
	EEnum getTemporalKind();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Constraint Operator</em>'.
	 * @see com.kronosafe.osd.oasd.ConstraintOperator
	 * @generated
	 */
	EEnum getConstraintOperator();

	/**
	 * Returns the meta object for enum '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for enum '<em>Spatial Operator</em>'.
	 * @see com.kronosafe.osd.oasd.SpatialOperator
	 * @generated
	 */
	EEnum getSpatialOperator();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Id Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The IdVal type corresponds to an identity number. It is an integer comprised between 0 and the maximum number of element in the model minus 1.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Id Val</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getIdVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.String <em>AString</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * The AString type corresponds to an alphanumerical string between 1 and 100 characters.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>AString</em>'.
	 * @see java.lang.String
	 * @model instanceClass="java.lang.String"
	 * @generated
	 */
	EDataType getAString();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Order Val</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * An unsigned integer
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Order Val</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getOrderVal();

	/**
	 * Returns the meta object for data type '{@link java.lang.Integer <em>Time Unit</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the meta object for data type '<em>Time Unit</em>'.
	 * @see java.lang.Integer
	 * @model instanceClass="java.lang.Integer"
	 * @generated
	 */
	EDataType getTimeUnit();

	/**
	 * Returns the meta object for data type '{@link java.lang.Long <em>Nano Sec</em>}'.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * A datatype to model the nanosecond unit.
     * <!-- end-model-doc -->
	 * @return the meta object for data type '<em>Nano Sec</em>'.
	 * @see java.lang.Long
	 * @model instanceClass="java.lang.Long"
	 * @generated
	 */
	EDataType getNanoSec();

	/**
	 * Returns the factory that creates the instances of the model.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @return the factory that creates the instances of the model.
	 * @generated
	 */
	oasdFactory getoasdFactory();

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
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl <em>System Description</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SystemDescriptionImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSystemDescription()
		 * @generated
		 */
		EClass SYSTEM_DESCRIPTION = eINSTANCE.getSystemDescription();

		/**
		 * The meta object literal for the '<em><b>Types</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__TYPES = eINSTANCE.getSystemDescription_Types();

		/**
		 * The meta object literal for the '<em><b>Behaviors</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__BEHAVIORS = eINSTANCE.getSystemDescription_Behaviors();

		/**
		 * The meta object literal for the '<em><b>Codes</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__CODES = eINSTANCE.getSystemDescription_Codes();

		/**
		 * The meta object literal for the '<em><b>Time Unit</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__TIME_UNIT = eINSTANCE.getSystemDescription_TimeUnit();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__SOURCE = eINSTANCE.getSystemDescription_Source();

		/**
		 * The meta object literal for the '<em><b>Time Unit Declaration</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION = eINSTANCE.getSystemDescription_TimeUnitDeclaration();

		/**
		 * The meta object literal for the '<em><b>Communications</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__COMMUNICATIONS = eINSTANCE.getSystemDescription_Communications();

		/**
		 * The meta object literal for the '<em><b>Functional Chains</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS = eINSTANCE.getSystemDescription_FunctionalChains();

		/**
		 * The meta object literal for the '<em><b>Chain Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_ChainSpatialConstraints();

		/**
		 * The meta object literal for the '<em><b>Block Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_BlockSpatialConstraints();

		/**
		 * The meta object literal for the '<em><b>Com Spatial Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS = eINSTANCE.getSystemDescription_ComSpatialConstraints();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.InputImpl <em>Input</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.InputImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getInput()
		 * @generated
		 */
		EClass INPUT = eINSTANCE.getInput();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute INPUT__INNER = eINSTANCE.getInput_Inner();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.GlobalImpl <em>Global</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.GlobalImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getGlobal()
		 * @generated
		 */
		EClass GLOBAL = eINSTANCE.getGlobal();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference GLOBAL__TYPE = eINSTANCE.getGlobal_Type();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.OutputImpl <em>Output</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.OutputImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOutput()
		 * @generated
		 */
		EClass OUTPUT = eINSTANCE.getOutput();

		/**
		 * The meta object literal for the '<em><b>Inner</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute OUTPUT__INNER = eINSTANCE.getOutput_Inner();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FileImpl <em>File</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FileImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFile()
		 * @generated
		 */
		EClass FILE = eINSTANCE.getFile();

		/**
		 * The meta object literal for the '<em><b>Path</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FILE__PATH = eINSTANCE.getFile_Path();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.CodeImpl <em>Code</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.CodeImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCode()
		 * @generated
		 */
		EClass CODE = eINSTANCE.getCode();

		/**
		 * The meta object literal for the '<em><b>Files</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CODE__FILES = eINSTANCE.getCode_Files();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.BehaviorItemImpl <em>Behavior Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.BehaviorItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItem()
		 * @generated
		 */
		EClass BEHAVIOR_ITEM = eINSTANCE.getBehaviorItem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ITEM__KIND = eINSTANCE.getBehaviorItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Order</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute BEHAVIOR_ITEM__ORDER = eINSTANCE.getBehaviorItem_Order();

		/**
		 * The meta object literal for the '<em><b>Functions</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__FUNCTIONS = eINSTANCE.getBehaviorItem_Functions();

		/**
		 * The meta object literal for the '<em><b>Outputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__OUTPUTS = eINSTANCE.getBehaviorItem_Outputs();

		/**
		 * The meta object literal for the '<em><b>Globals</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__GLOBALS = eINSTANCE.getBehaviorItem_Globals();

		/**
		 * The meta object literal for the '<em><b>Inputs</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__INPUTS = eINSTANCE.getBehaviorItem_Inputs();

		/**
		 * The meta object literal for the '<em><b>Source</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BEHAVIOR_ITEM__SOURCE = eINSTANCE.getBehaviorItem_Source();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FunctionItemImpl <em>Function Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FunctionItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionItem()
		 * @generated
		 */
		EClass FUNCTION_ITEM = eINSTANCE.getFunctionItem();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__KIND = eINSTANCE.getFunctionItem_Kind();

		/**
		 * The meta object literal for the '<em><b>Budget</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__BUDGET = eINSTANCE.getFunctionItem_Budget();

		/**
		 * The meta object literal for the '<em><b>Exec TW Length</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__EXEC_TW_LENGTH = eINSTANCE.getFunctionItem_ExecTWLength();

		/**
		 * The meta object literal for the '<em><b>Exec TW Rhythm</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute FUNCTION_ITEM__EXEC_TW_RHYTHM = eINSTANCE.getFunctionItem_ExecTWRhythm();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TypeItemImpl <em>Type Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TypeItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTypeItem()
		 * @generated
		 */
		EClass TYPE_ITEM = eINSTANCE.getTypeItem();

		/**
		 * The meta object literal for the '<em><b>Copy Function</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TYPE_ITEM__COPY_FUNCTION = eINSTANCE.getTypeItem_CopyFunction();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.CommunicationItemImpl <em>Communication Item</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.CommunicationItemImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getCommunicationItem()
		 * @generated
		 */
		EClass COMMUNICATION_ITEM = eINSTANCE.getCommunicationItem();

		/**
		 * The meta object literal for the '<em><b>Src</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__SRC = eINSTANCE.getCommunicationItem_Src();

		/**
		 * The meta object literal for the '<em><b>Dst</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__DST = eINSTANCE.getCommunicationItem_Dst();

		/**
		 * The meta object literal for the '<em><b>PValue</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_ITEM__PVALUE = eINSTANCE.getCommunicationItem_PValue();

		/**
		 * The meta object literal for the '<em><b>Immediate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute COMMUNICATION_ITEM__IMMEDIATE = eINSTANCE.getCommunicationItem_Immediate();

		/**
		 * The meta object literal for the '<em><b>Type</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__TYPE = eINSTANCE.getCommunicationItem_Type();

		/**
		 * The meta object literal for the '<em><b>Temporal</b></em>' containment reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COMMUNICATION_ITEM__TEMPORAL = eINSTANCE.getCommunicationItem_Temporal();

		/**
		 * The meta object literal for the '<em><b>Get Ports</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation COMMUNICATION_ITEM___GET_PORTS = eINSTANCE.getCommunicationItem__GetPorts();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SourceImpl <em>Source</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SourceImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSource()
		 * @generated
		 */
		EClass SOURCE = eINSTANCE.getSource();

		/**
		 * The meta object literal for the '<em><b>Code</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__CODE = eINSTANCE.getSource_Code();

		/**
		 * The meta object literal for the '<em><b>Headers</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference SOURCE__HEADERS = eINSTANCE.getSource_Headers();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.IdentifiedElementImpl <em>Identified Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.IdentifiedElementImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdentifiedElement()
		 * @generated
		 */
		EClass IDENTIFIED_ELEMENT = eINSTANCE.getIdentifiedElement();

		/**
		 * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute IDENTIFIED_ELEMENT__ID = eINSTANCE.getIdentifiedElement_Id();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.IdentifiableElementReferencerImpl <em>Identifiable Element Referencer</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.IdentifiableElementReferencerImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdentifiableElementReferencer()
		 * @generated
		 */
		EClass IDENTIFIABLE_ELEMENT_REFERENCER = eINSTANCE.getIdentifiableElementReferencer();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EClass();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ESTRUCTURALFEATURE = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EStructuralFeature();

		/**
		 * The meta object literal for the '<em><b>Find Item In Resource Set</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM_IN_RESOURCE_SET__INTEGER_ECLASS = eINSTANCE.getIdentifiableElementReferencer__FindItemInResourceSet__Integer_EClass();

		/**
		 * The meta object literal for the '<em><b>Find Item</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation IDENTIFIABLE_ELEMENT_REFERENCER___FIND_ITEM__INTEGER_ECLASS_RESOURCE = eINSTANCE.getIdentifiableElementReferencer__FindItem__Integer_EClass_Resource();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.NamedElementImpl <em>Named Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.NamedElementImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNamedElement()
		 * @generated
		 */
		EClass NAMED_ELEMENT = eINSTANCE.getNamedElement();

		/**
		 * The meta object literal for the '<em><b>Name</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute NAMED_ELEMENT__NAME = eINSTANCE.getNamedElement_Name();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.VersionedElementImpl <em>Versioned Element</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.VersionedElementImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getVersionedElement()
		 * @generated
		 */
		EClass VERSIONED_ELEMENT = eINSTANCE.getVersionedElement();

		/**
		 * The meta object literal for the '<em><b>Version</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute VERSIONED_ELEMENT__VERSION = eINSTANCE.getVersionedElement_Version();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TemporalImpl <em>Temporal</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TemporalImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporal()
		 * @generated
		 */
		EClass TEMPORAL = eINSTANCE.getTemporal();

		/**
		 * The meta object literal for the '<em><b>Kind</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__KIND = eINSTANCE.getTemporal_Kind();

		/**
		 * The meta object literal for the '<em><b>Rate</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__RATE = eINSTANCE.getTemporal_Rate();

		/**
		 * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TEMPORAL__OFFSET = eINSTANCE.getTemporal_Offset();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TimingConstraintImpl <em>Timing Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TimingConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingConstraint()
		 * @generated
		 */
		EClass TIMING_CONSTRAINT = eINSTANCE.getTimingConstraint();

		/**
		 * The meta object literal for the '<em><b>Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__OPERATOR = eINSTANCE.getTimingConstraint_Operator();

		/**
		 * The meta object literal for the '<em><b>Value</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_CONSTRAINT__VALUE = eINSTANCE.getTimingConstraint_Value();

		/**
		 * The meta object literal for the '<em><b>Get Constraint Expression</b></em>' operation.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EOperation TIMING_CONSTRAINT___GET_CONSTRAINT_EXPRESSION = eINSTANCE.getTimingConstraint__GetConstraintExpression();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.FunctionalChainImpl <em>Functional Chain</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.FunctionalChainImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionalChain()
		 * @generated
		 */
		EClass FUNCTIONAL_CHAIN = eINSTANCE.getFunctionalChain();

		/**
		 * The meta object literal for the '<em><b>Communication Items</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__COMMUNICATION_ITEMS = eINSTANCE.getFunctionalChain_CommunicationItems();

		/**
		 * The meta object literal for the '<em><b>Constraints</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__CONSTRAINTS = eINSTANCE.getFunctionalChain_Constraints();

		/**
		 * The meta object literal for the '<em><b>Timingpaths</b></em>' containment reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference FUNCTIONAL_CHAIN__TIMINGPATHS = eINSTANCE.getFunctionalChain_Timingpaths();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl <em>Block Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.BlockSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBlockSpatialConstraint()
		 * @generated
		 */
		EClass BLOCK_SPATIAL_CONSTRAINT = eINSTANCE.getBlockSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getBlockSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference BLOCK_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getBlockSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl <em>Chain Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ChainSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getChainSpatialConstraint()
		 * @generated
		 */
		EClass CHAIN_SPATIAL_CONSTRAINT = eINSTANCE.getChainSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getChainSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference CHAIN_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getChainSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.SpatialConstraintImpl <em>Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.SpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialConstraint()
		 * @generated
		 */
		EClass SPATIAL_CONSTRAINT = eINSTANCE.getSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>Spatial Operator</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute SPATIAL_CONSTRAINT__SPATIAL_OPERATOR = eINSTANCE.getSpatialConstraint_SpatialOperator();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl <em>Com Spatial Constraint</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.ComSpatialConstraintImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getComSpatialConstraint()
		 * @generated
		 */
		EClass COM_SPATIAL_CONSTRAINT = eINSTANCE.getComSpatialConstraint();

		/**
		 * The meta object literal for the '<em><b>LItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SPATIAL_CONSTRAINT__LITEMS = eINSTANCE.getComSpatialConstraint_LItems();

		/**
		 * The meta object literal for the '<em><b>RItems</b></em>' reference list feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference COM_SPATIAL_CONSTRAINT__RITEMS = eINSTANCE.getComSpatialConstraint_RItems();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.impl.TimingPathImpl <em>Timing Path</em>}' class.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.impl.TimingPathImpl
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimingPath()
		 * @generated
		 */
		EClass TIMING_PATH = eINSTANCE.getTimingPath();

		/**
		 * The meta object literal for the '<em><b>Date</b></em>' attribute feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EAttribute TIMING_PATH__DATE = eINSTANCE.getTimingPath_Date();

		/**
		 * The meta object literal for the '<em><b>Behavior Item</b></em>' reference feature.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @generated
		 */
		EReference TIMING_PATH__BEHAVIOR_ITEM = eINSTANCE.getTimingPath_BehaviorItem();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.BehaviorItemKind <em>Behavior Item Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.BehaviorItemKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getBehaviorItemKind()
		 * @generated
		 */
		EEnum BEHAVIOR_ITEM_KIND = eINSTANCE.getBehaviorItemKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.FunctionKind <em>Function Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.FunctionKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getFunctionKind()
		 * @generated
		 */
		EEnum FUNCTION_KIND = eINSTANCE.getFunctionKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.TemporalKind <em>Temporal Kind</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.TemporalKind
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTemporalKind()
		 * @generated
		 */
		EEnum TEMPORAL_KIND = eINSTANCE.getTemporalKind();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.ConstraintOperator <em>Constraint Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.ConstraintOperator
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getConstraintOperator()
		 * @generated
		 */
		EEnum CONSTRAINT_OPERATOR = eINSTANCE.getConstraintOperator();

		/**
		 * The meta object literal for the '{@link com.kronosafe.osd.oasd.SpatialOperator <em>Spatial Operator</em>}' enum.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see com.kronosafe.osd.oasd.SpatialOperator
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getSpatialOperator()
		 * @generated
		 */
		EEnum SPATIAL_OPERATOR = eINSTANCE.getSpatialOperator();

		/**
		 * The meta object literal for the '<em>Id Val</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getIdVal()
		 * @generated
		 */
		EDataType ID_VAL = eINSTANCE.getIdVal();

		/**
		 * The meta object literal for the '<em>AString</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.String
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getAString()
		 * @generated
		 */
		EDataType ASTRING = eINSTANCE.getAString();

		/**
		 * The meta object literal for the '<em>Order Val</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getOrderVal()
		 * @generated
		 */
		EDataType ORDER_VAL = eINSTANCE.getOrderVal();

		/**
		 * The meta object literal for the '<em>Time Unit</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Integer
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getTimeUnit()
		 * @generated
		 */
		EDataType TIME_UNIT = eINSTANCE.getTimeUnit();

		/**
		 * The meta object literal for the '<em>Nano Sec</em>' data type.
		 * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
		 * @see java.lang.Long
		 * @see com.kronosafe.osd.oasd.impl.oasdPackageImpl#getNanoSec()
		 * @generated
		 */
		EDataType NANO_SEC = eINSTANCE.getNanoSec();

	}

} //oasdPackage
