/**
 * Copyright Krono-Safe S.A. 2018-2019. All rights reserved.
 */
package com.kronosafe.osd.core;

import org.eclipse.emf.common.util.EMap;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Annotation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * An OSD Annotation is attached to an AnnotatedElement to specify general-purpose model information that is relevant for OSD extensions, OSD iterative generations, traceability.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.core.Annotation#getDetails <em>Details</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.core.corePackage#getAnnotation()
 * @model
 * @generated
 */
public interface Annotation extends EObject {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Details</b></em>' map.
	 * The key is of type {@link java.lang.String},
	 * and the value is of type {@link java.lang.String},
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Details</em>' map isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The annotation values stored as a map.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Details</em>' map.
	 * @see com.kronosafe.osd.core.corePackage#getAnnotation_Details()
	 * @model mapType="com.kronosafe.osd.core.AnnotationMapEntry&lt;com.kronosafe.osd.core.AString, com.kronosafe.osd.core.AString&gt;"
	 * @generated
	 */
	EMap<String, String> getDetails();

} // Annotation
