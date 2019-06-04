package com.kronosafe.osd.xml;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.xmi.NameInfo;
import org.eclipse.emf.ecore.xmi.XMLResource;
import org.eclipse.emf.ecore.xmi.impl.XMLHelperImpl;

import com.kronosafe.osd.core.IdentifiedElement;
import com.kronosafe.osd.oad.oadPackage;
import com.kronosafe.osd.oasd.oasdPackage;

public class XMLKsm3HelperImpl extends XMLHelperImpl {

	public XMLKsm3HelperImpl(XMLResource resource) {
		super(resource);
	}

	@Override
	protected String getQName(NameInfo nameInfo, EPackage ePackage, String name, boolean mustHavePrefix) {
		if (name == oasdPackage.Literals.SYSTEM_DESCRIPTION.getName())
			return oasdPackage.eNAME;
		if (name == oadPackage.Literals.ALLOCATION_DESCRIPTION.getName())
			return oadPackage.eNAME;

		return super.getQName(nameInfo, ePackage, name, mustHavePrefix);
	}

	@Override
	protected String getQName(EPackage ePackage, String name, boolean mustHavePrefix) {
		if (name == oasdPackage.Literals.SYSTEM_DESCRIPTION.getName())
			return oasdPackage.eNAME;
		if (name == oadPackage.Literals.ALLOCATION_DESCRIPTION.getName())
			return oadPackage.eNAME;

		return super.getQName(ePackage, name, mustHavePrefix);
	}

	public String getURI(String prefix) {
		if (prefix == oasdPackage.eNAME)
			return oasdPackage.eNS_URI;

		if (prefix == oadPackage.eNAME)
			return oadPackage.eNS_URI;

		return super.getURI(prefix);
	}

	@Override
	public String getIDREF(EObject obj) {
		if(obj instanceof IdentifiedElement) {
			return ((IdentifiedElement)obj).getId().toString();
		}
		return super.getIDREF(obj);
	}

	@Override
	public String getHREF(EObject obj) {
		if(obj instanceof IdentifiedElement) {
			return ((IdentifiedElement)obj).getId().toString();
		}
		return super.getHREF(obj);
	}
	
	
	
	
}
