/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Temporal</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * Reserved for internal use.
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.Temporal#getKind <em>Kind</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Temporal#getRate <em>Rate</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.Temporal#getOffset <em>Offset</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getTemporal()
 * @model
 * @generated
 */
public interface Temporal extends AnnotatedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.TemporalKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * It corresponds to the immediate boolean of the communication item.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @see #setKind(TemporalKind)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTemporal_Kind()
	 * @model required="true"
	 * @generated
	 */
	TemporalKind getKind();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Temporal#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.TemporalKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(TemporalKind value);

	/**
	 * Returns the value of the '<em><b>Rate</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Rate</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication rate.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rate</em>' attribute.
	 * @see #setRate(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTemporal_Rate()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit" required="true"
	 * @generated
	 */
	Integer getRate();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Temporal#getRate <em>Rate</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rate</em>' attribute.
	 * @see #getRate()
	 * @generated
	 */
	void setRate(Integer value);

	/**
	 * Returns the value of the '<em><b>Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Offset</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The communication offset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Offset</em>' attribute.
	 * @see #setOffset(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getTemporal_Offset()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit" required="true"
	 * @generated
	 */
	Integer getOffset();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.Temporal#getOffset <em>Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Offset</em>' attribute.
	 * @see #getOffset()
	 * @generated
	 */
	void setOffset(Integer value);

} // Temporal
