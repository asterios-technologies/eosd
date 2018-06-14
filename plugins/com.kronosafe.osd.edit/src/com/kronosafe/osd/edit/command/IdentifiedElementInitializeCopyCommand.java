package com.kronosafe.osd.edit.command;

import java.util.Collection;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.CopyCommand.Helper;
import org.eclipse.emf.edit.command.InitializeCopyCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

import com.kronosafe.osd.oasd.oasdPackage;

public class IdentifiedElementInitializeCopyCommand extends InitializeCopyCommand {

	public IdentifiedElementInitializeCopyCommand(EditingDomain domain, EObject owner, Helper copyHelper) {
		super(domain, owner, copyHelper);
	}

	protected Collection<? extends EAttribute> getAttributesToCopy() {
		EList<EAttribute> attributes = new BasicEList<EAttribute>(owner.eClass().getEAllAttributes());
		attributes.remove(oasdPackage.eINSTANCE.getIdentifiedElement_Id());
		return attributes;
	}

}
