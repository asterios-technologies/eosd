/**
 */
package com.kronosafe.osd.oad.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLSave;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;

import com.kronosafe.osd.oad.oadPackage;
import com.kronosafe.osd.validation.oadValidator;
import com.kronosafe.osd.xml.XMLKsm3HelperImpl;
import com.kronosafe.osd.xml.XMLKsm3LoadImpl;
import com.kronosafe.osd.xml.XMLKsm3SaveImpl;

/**
 * <!-- begin-user-doc -->
 * The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.kronosafe.osd.oad.util.oadResourceFactoryImpl
 * @generated
 */
public class oadResourceImpl extends XMLResourceImpl {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Creates an instance of the resource.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param uri the URI of the new resource.
	 * @not generated
	 */
	public oadResourceImpl(URI uri) {
		super(uri);
		final EValidator.Registry registry = EValidator.Registry.INSTANCE;
		registry.put(oadPackage.eINSTANCE, new oadValidator());
	}
	
	/**
	 * Override for using XMLKsm3SaveImpl
	 * 
	 * @not generated
	 */
	protected XMLSave createXMLSave() {
		return new XMLKsm3SaveImpl(createXMLHelper());
	}

	/**
	 * Override for using XMLKsm3HelperImpl
	 * 
	 * @not generated
	 */
	protected XMLHelper createXMLHelper() {
		return new XMLKsm3HelperImpl(this);
	}

	/**
	 * Override for using XMLKsm3LoadImpl
	 * 
	 * @not generated
	 */
	protected XMLLoad createXMLLoad() {
		return new XMLKsm3LoadImpl(createXMLHelper());
	}

} //oadResourceImpl
