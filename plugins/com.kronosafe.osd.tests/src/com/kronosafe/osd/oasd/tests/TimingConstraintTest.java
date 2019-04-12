/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import com.kronosafe.osd.oasd.ConstraintOperator;
import com.kronosafe.osd.oasd.TimingConstraint;
import com.kronosafe.osd.oasd.oasdFactory;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Timing Constraint</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression() <em>Get Constraint Expression</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public class TimingConstraintTest extends AnnotatedElementTest {

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
	public static void main(String[] args) {
		TestRunner.run(TimingConstraintTest.class);
	}

	/**
	 * Constructs a new Timing Constraint test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TimingConstraintTest(String name) {
		super(name);
	}

	/**
	 * Returns the fixture for this Timing Constraint test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected TimingConstraint getFixture() {
		return (TimingConstraint)fixture;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#setUp()
	 * @generated
	 */
	@Override
	protected void setUp() throws Exception {
		setFixture(oasdFactory.eINSTANCE.createTimingConstraint());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see junit.framework.TestCase#tearDown()
	 * @generated
	 */
	@Override
	protected void tearDown() throws Exception {
		setFixture(null);
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression() <em>Get Constraint Expression</em>}' operation.
	 * <!-- begin-user-doc -->
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1817
	 * http://polarion.ks.int/polarion/#/project/ASTDESIGNER/workitem?id=ASTD-1816
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.TimingConstraint#getConstraintExpression()
	 * @not generated
	 */
	public void testGetConstraintExpression() {
		TimingConstraint t = oasdFactory.eINSTANCE.createTimingConstraint();
		t.setOperator(ConstraintOperator.LESSER_THAN);
		t.setValue(2);
		assertEquals("<2", t.getConstraintExpression());
		t.setOperator(ConstraintOperator.GREATER_THAN);
		assertEquals(">2", t.getConstraintExpression());
	}

} //TimingConstraintTest
