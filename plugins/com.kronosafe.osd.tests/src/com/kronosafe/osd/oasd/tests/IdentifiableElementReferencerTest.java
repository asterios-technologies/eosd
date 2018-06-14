/**
 * Copyright Krono-Safe S.A. 2018. All rights reserved.
 */
package com.kronosafe.osd.oasd.tests;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.IdentifiableElementReferencer;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.oasdFactory;
import com.kronosafe.osd.oasd.oasdPackage;

import junit.framework.TestCase;

/**
 * <!-- begin-user-doc -->
 * A test case for the model object '<em><b>Identifiable Element Referencer</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following operations are tested:
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature) <em>Find Item</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item In Resource Set</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource) <em>Find Item</em>}</li>
 * </ul>
 * </p>
 * @generated
 */
public abstract class IdentifiableElementReferencerTest extends TestCase {

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The fixture for this Identifiable Element Referencer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableElementReferencer fixture = null;

	/**
	 * Constructs a new Identifiable Element Referencer test case with the given name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public IdentifiableElementReferencerTest(String name) {
		super(name);
	}

	/**
	 * Sets the fixture for this Identifiable Element Referencer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void setFixture(IdentifiableElementReferencer fixture) {
		this.fixture = fixture;
	}

	/**
	 * Returns the fixture for this Identifiable Element Referencer test case.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IdentifiableElementReferencer getFixture() {
		return fixture;
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @not generated
	 */
	public void testFindItem__Integer_EClass() {
		//Tested in testFindItem__Integer_EClass_Resource
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EStructuralFeature)
	 * @not generated
	 */
	public void testFindItem__Integer_EStructuralFeature() {
		SystemDescription s = oasdFactory.eINSTANCE.createSystemDescription();
		//Tests null cases
		assertNull(s.findItem(null,oasdPackage.Literals.SYSTEM_DESCRIPTION__BEHAVIORS));
		assertNull(s.findItem(0,(EStructuralFeature)null));
		
		//Tests the case of multiple structural feature
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s.getBehaviors().add(b1);
		s.getBehaviors().add(b2);
		assertEquals(b2,s.findItem(b2.getId(),oasdPackage.Literals.SYSTEM_DESCRIPTION__BEHAVIORS));

		//Tests the case of unique structural feature
		///Can't test if because there is no unique link in the current oasd
		
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass) <em>Find Item In Resource Set</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItemInResourceSet(java.lang.Integer, org.eclipse.emf.ecore.EClass)
	 * @not generated
	 */
	public void testFindItemInResourceSet__Integer_EClass() {
		//Tested in testFindItem__Integer_EClass_Resource
	}

	/**
	 * Tests the '{@link com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource) <em>Find Item</em>}' operation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see com.kronosafe.osd.oasd.IdentifiableElementReferencer#findItem(java.lang.Integer, org.eclipse.emf.ecore.EClass, org.eclipse.emf.ecore.resource.Resource)
	 * @not generated
	 */
	public void testFindItem__Integer_EClass_Resource() {
		ResourceSet rs = new ResourceSetImpl();
		URI uri = URI.createFileURI("./test.oasd");
	    Resource resource = rs.createResource(uri);
		SystemDescription s = oasdFactory.eINSTANCE.createSystemDescription();
		resource.getContents().add(s);
		//Tests null cases
		assertNull(s.findItem(null,s.eClass(),s.eResource()));
		assertNull(s.findItem(0,null,s.eResource()));
		assertNull(s.findItem(0,s.eClass(),null));
		
		//Tests the case of multiple structural feature
		BehaviorItem b1 = oasdFactory.eINSTANCE.createBehaviorItem();
		BehaviorItem b2 = oasdFactory.eINSTANCE.createBehaviorItem();
		s.getBehaviors().add(b1);
		s.getBehaviors().add(b2);
		assertEquals(b2,s.findItem(b2.getId(), b2.eClass(),s.eResource()));

	}

} //IdentifiableElementReferencerTest
