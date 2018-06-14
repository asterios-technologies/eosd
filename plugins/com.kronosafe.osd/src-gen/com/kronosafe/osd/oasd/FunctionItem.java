/**
 */
package com.kronosafe.osd.oasd;


/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Function Item</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * A FunctionItem represents a specific C-function of a block in the system. It can be the function called during the initialization phase, the function called during the reset phase or the function called during the main cycle phase. There are 3 FunctionItem per block. One of kind init, one of kind reset and one of kind cycle. The budget attribute is not used. The name attribute is the name of the C-function that will be executed during the corresponding phase (the reset phase is not used, only init and cycle functions are used).
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionItem#getKind <em>Kind</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionItem#getBudget <em>Budget</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWLength <em>Exec TW Length</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm <em>Exec TW Rhythm</em>}</li>
 * </ul>
 *
 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionItem()
 * @model
 * @generated
 */
public interface FunctionItem extends NamedElement {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Returns the value of the '<em><b>Kind</b></em>' attribute.
	 * The literals are from the enumeration {@link com.kronosafe.osd.oasd.FunctionKind}.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Kind</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The kind of function: initialization, cycle or reset.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @see #setKind(FunctionKind)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionItem_Kind()
	 * @model required="true"
	 * @generated
	 */
	FunctionKind getKind();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.FunctionItem#getKind <em>Kind</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Kind</em>' attribute.
	 * @see com.kronosafe.osd.oasd.FunctionKind
	 * @see #getKind()
	 * @generated
	 */
	void setKind(FunctionKind value);

	/**
	 * Returns the value of the '<em><b>Budget</b></em>' attribute.
	 * The default value is <code>"0"</code>.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Budget</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * The timing budget needed by the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Budget</em>' attribute.
	 * @see #setBudget(Long)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionItem_Budget()
	 * @model default="0" dataType="com.kronosafe.osd.oasd.NanoSec" required="true"
	 * @generated
	 */
	Long getBudget();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.FunctionItem#getBudget <em>Budget</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Budget</em>' attribute.
	 * @see #getBudget()
	 * @generated
	 */
	void setBudget(Long value);

	/**
	 * Returns the value of the '<em><b>Exec TW Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec TW Length</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  It is the execution time windows length, i.e. the time windows in which the function shall be executed only once. The end instant of that time windows defines the communication visibility date. It is not the budget of the function, i.e the time to execute the function.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exec TW Length</em>' attribute.
	 * @see #setExecTWLength(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionItem_ExecTWLength()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit"
	 * @generated
	 */
	Integer getExecTWLength();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWLength <em>Exec TW Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec TW Length</em>' attribute.
	 * @see #getExecTWLength()
	 * @generated
	 */
	void setExecTWLength(Integer value);

	/**
	 * Returns the value of the '<em><b>Exec TW Rhythm</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of the '<em>Exec TW Rhythm</em>' attribute isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 *  It is the rhythm on which the execution time windows is activated, i.e. the period of the execution time window start.
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Exec TW Rhythm</em>' attribute.
	 * @see #setExecTWRhythm(Integer)
	 * @see com.kronosafe.osd.oasd.oasdPackage#getFunctionItem_ExecTWRhythm()
	 * @model dataType="com.kronosafe.osd.oasd.TimeUnit"
	 * @generated
	 */
	Integer getExecTWRhythm();

	/**
	 * Sets the value of the '{@link com.kronosafe.osd.oasd.FunctionItem#getExecTWRhythm <em>Exec TW Rhythm</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Exec TW Rhythm</em>' attribute.
	 * @see #getExecTWRhythm()
	 * @generated
	 */
	void setExecTWRhythm(Integer value);

} // FunctionItem
