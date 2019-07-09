/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import junit.framework.Test;
import junit.framework.TestSuite;
import junit.textui.TestRunner;

/**
 * <!-- begin-user-doc -->
 * A test suite for the '<em><b>oasd</b></em>' package.
 * <!-- end-user-doc -->
 * @generated
 */
public class oasdTests extends TestSuite {

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
		TestRunner.run(suite());
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static Test suite() {
		TestSuite suite = new oasdTests("oasd Tests");
		suite.addTestSuite(SystemDescriptionTest.class);
		suite.addTestSuite(InputTest.class);
		suite.addTestSuite(GlobalTest.class);
		suite.addTestSuite(OutputTest.class);
		suite.addTestSuite(CodeTest.class);
		suite.addTestSuite(BehaviorItemTest.class);
		suite.addTestSuite(TypeItemTest.class);
		suite.addTestSuite(CommunicationItemTest.class);
		suite.addTestSuite(SourceTest.class);
		suite.addTestSuite(TimingConstraintTest.class);
		suite.addTestSuite(FunctionalChainItemTest.class);
		suite.addTestSuite(BlockSpatialConstraintTest.class);
		suite.addTestSuite(ChainSpatialConstraintTest.class);
		suite.addTestSuite(ComSpatialConstraintTest.class);
		suite.addTestSuite(TimingPathItemTest.class);
		suite.addTestSuite(ParameterTest.class);
		suite.addTestSuite(ReturnValueTest.class);
		return suite;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public oasdTests(String name) {
		super(name);
	}

} //oasdTests
