/**
 */
package com.kronosafe.osd.oasd.util;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.xmi.impl.XMLResourceImpl;
import org.eclipse.emf.ecore.EValidator;
import org.eclipse.emf.ecore.xmi.XMLHelper;
import org.eclipse.emf.ecore.xmi.XMLLoad;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.XMLSave;

import com.kronosafe.osd.oasd.oasdPackage;
import com.kronosafe.osd.validation.oasdValidator;
import com.kronosafe.osd.xml.XMLKsm3HelperImpl;
import com.kronosafe.osd.xml.XMLKsm3LoadImpl;
import com.kronosafe.osd.xml.XMLKsm3SaveImpl;

/**
 * <!-- begin-user-doc --> The <b>Resource </b> associated with the package.
 * <!-- end-user-doc -->
 * @see com.kronosafe.osd.oasd.util.oasdResourceFactoryImpl
 * @generated
 */
public class oasdResourceImpl extends XMLResourceImpl {



	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * Creates an instance of the resource. <!-- begin-user-doc --> <!--
	 * end-user-doc -->
	 * 
	 * @param uri
	 *            the URI of the new resource.
	 * @not generated
	 */
	public oasdResourceImpl(URI uri) {
		super(uri);
		final EValidator.Registry registry = EValidator.Registry.INSTANCE;
		registry.put(oasdPackage.eINSTANCE, new oasdValidator());

		this.getDefaultSaveOptions().put(XMLResource.OPTION_KEEP_DEFAULT_CONTENT, Boolean.TRUE);
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
	@Override
	protected XMLHelper createXMLHelper() {
		return new XMLKsm3HelperImpl(this);
	}

	/**
	 * Override for using XMLKsm3LoadImpl
	 * 
	 * @not generated
	 */
	@Override
	protected XMLLoad createXMLLoad() {
		return new XMLKsm3LoadImpl(createXMLHelper());
	}

} // oasdResourceImpl
