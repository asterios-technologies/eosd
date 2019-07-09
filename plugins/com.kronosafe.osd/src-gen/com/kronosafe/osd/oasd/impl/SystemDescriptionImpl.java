/**
 */
package com.kronosafe.osd.oasd.impl;

import com.kronosafe.osd.core.NamedElement;
import com.kronosafe.osd.core.VersionedElement;
import com.kronosafe.osd.core.corePackage;
import com.kronosafe.osd.core.impl.IdentifiableElementReferencerImpl;

import java.util.Collection;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;
import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

import com.kronosafe.osd.oasd.BehaviorItem;
import com.kronosafe.osd.oasd.BlockSpatialConstraint;
import com.kronosafe.osd.oasd.ChainSpatialConstraint;
import com.kronosafe.osd.oasd.Code;
import com.kronosafe.osd.oasd.ComSpatialConstraint;
import com.kronosafe.osd.oasd.CommunicationItem;
import com.kronosafe.osd.oasd.FunctionalChainItem;
import com.kronosafe.osd.oasd.GenerationMode;
import com.kronosafe.osd.oasd.SystemDescription;
import com.kronosafe.osd.oasd.TypeItem;
import com.kronosafe.osd.oasd.oasdPackage;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>System Description</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getName <em>Name</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getVersion <em>Version</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getTypes <em>Types</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getBehaviors <em>Behaviors</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getCodes <em>Codes</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getTimeUnit <em>Time Unit</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getSource <em>Source</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getTimeUnitDeclaration <em>Time Unit Declaration</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getCommunications <em>Communications</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getFunctionalChains <em>Functional Chains</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getChainSpatialConstraints <em>Chain Spatial Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getBlockSpatialConstraints <em>Block Spatial Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getComSpatialConstraints <em>Com Spatial Constraints</em>}</li>
 *   <li>{@link com.kronosafe.osd.oasd.impl.SystemDescriptionImpl#getGeneration <em>Generation</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SystemDescriptionImpl extends IdentifiableElementReferencerImpl implements SystemDescription {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final String copyright = "Copyright Krono-Safe S.A. 2018-2019. All rights reserved.";

	/**
	 * The default value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected static final String NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getName() <em>Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getName()
	 * @generated
	 * @ordered
	 */
	protected String name = NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected static final String VERSION_EDEFAULT = "1.0.0";

	/**
	 * The cached value of the '{@link #getVersion() <em>Version</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVersion()
	 * @generated
	 * @ordered
	 */
	protected String version = VERSION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTypes() <em>Types</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTypes()
	 * @generated
	 * @ordered
	 */
	protected EList<TypeItem> types;

	/**
	 * The cached value of the '{@link #getBehaviors() <em>Behaviors</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBehaviors()
	 * @generated
	 * @ordered
	 */
	protected EList<BehaviorItem> behaviors;

	/**
	 * The cached value of the '{@link #getCodes() <em>Codes</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodes()
	 * @generated
	 * @ordered
	 */
	protected EList<Code> codes;

	/**
	 * The default value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_EDEFAULT = "ast_realtime_us";

	/**
	 * The cached value of the '{@link #getTimeUnit() <em>Time Unit</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnit()
	 * @generated
	 * @ordered
	 */
	protected String timeUnit = TIME_UNIT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected static final String SOURCE_EDEFAULT = "realtime";

	/**
	 * The cached value of the '{@link #getSource() <em>Source</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSource()
	 * @generated
	 * @ordered
	 */
	protected String source = SOURCE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTimeUnitDeclaration() <em>Time Unit Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnitDeclaration()
	 * @generated
	 * @ordered
	 */
	protected static final String TIME_UNIT_DECLARATION_EDEFAULT = "asterios.h";

	/**
	 * The cached value of the '{@link #getTimeUnitDeclaration() <em>Time Unit Declaration</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTimeUnitDeclaration()
	 * @generated
	 * @ordered
	 */
	protected String timeUnitDeclaration = TIME_UNIT_DECLARATION_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCommunications() <em>Communications</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCommunications()
	 * @generated
	 * @ordered
	 */
	protected EList<CommunicationItem> communications;

	/**
	 * The cached value of the '{@link #getFunctionalChains() <em>Functional Chains</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFunctionalChains()
	 * @generated
	 * @ordered
	 */
	protected EList<FunctionalChainItem> functionalChains;

	/**
	 * The cached value of the '{@link #getChainSpatialConstraints() <em>Chain Spatial Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChainSpatialConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ChainSpatialConstraint> chainSpatialConstraints;

	/**
	 * The cached value of the '{@link #getBlockSpatialConstraints() <em>Block Spatial Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBlockSpatialConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<BlockSpatialConstraint> blockSpatialConstraints;

	/**
	 * The cached value of the '{@link #getComSpatialConstraints() <em>Com Spatial Constraints</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getComSpatialConstraints()
	 * @generated
	 * @ordered
	 */
	protected EList<ComSpatialConstraint> comSpatialConstraints;

	/**
	 * The default value of the '{@link #getGeneration() <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected static final GenerationMode GENERATION_EDEFAULT = GenerationMode.GLOBAL_CONTEXT;

	/**
	 * The cached value of the '{@link #getGeneration() <em>Generation</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGeneration()
	 * @generated
	 * @ordered
	 */
	protected GenerationMode generation = GENERATION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected SystemDescriptionImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return oasdPackage.Literals.SYSTEM_DESCRIPTION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getName() {
		return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setName(String newName) {
		String oldName = name;
		name = newName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__NAME, oldName, name));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getVersion() {
		return version;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setVersion(String newVersion) {
		String oldVersion = version;
		version = newVersion;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__VERSION, oldVersion, version));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<TypeItem> getTypes() {
		if (types == null) {
			types = new EObjectContainmentEList<TypeItem>(TypeItem.class, this, oasdPackage.SYSTEM_DESCRIPTION__TYPES);
		}
		return types;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BehaviorItem> getBehaviors() {
		if (behaviors == null) {
			behaviors = new EObjectContainmentEList<BehaviorItem>(BehaviorItem.class, this, oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS);
		}
		return behaviors;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<Code> getCodes() {
		if (codes == null) {
			codes = new EObjectContainmentEList<Code>(Code.class, this, oasdPackage.SYSTEM_DESCRIPTION__CODES);
		}
		return codes;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeUnit() {
		return timeUnit;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnit(String newTimeUnit) {
		String oldTimeUnit = timeUnit;
		timeUnit = newTimeUnit;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT, oldTimeUnit, timeUnit));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getSource() {
		return source;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setSource(String newSource) {
		String oldSource = source;
		source = newSource;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__SOURCE, oldSource, source));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getTimeUnitDeclaration() {
		return timeUnitDeclaration;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setTimeUnitDeclaration(String newTimeUnitDeclaration) {
		String oldTimeUnitDeclaration = timeUnitDeclaration;
		timeUnitDeclaration = newTimeUnitDeclaration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION, oldTimeUnitDeclaration, timeUnitDeclaration));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<CommunicationItem> getCommunications() {
		if (communications == null) {
			communications = new EObjectContainmentEList<CommunicationItem>(CommunicationItem.class, this, oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS);
		}
		return communications;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<FunctionalChainItem> getFunctionalChains() {
		if (functionalChains == null) {
			functionalChains = new EObjectContainmentEList<FunctionalChainItem>(FunctionalChainItem.class, this, oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS);
		}
		return functionalChains;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ChainSpatialConstraint> getChainSpatialConstraints() {
		if (chainSpatialConstraints == null) {
			chainSpatialConstraints = new EObjectContainmentEList<ChainSpatialConstraint>(ChainSpatialConstraint.class, this, oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS);
		}
		return chainSpatialConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<BlockSpatialConstraint> getBlockSpatialConstraints() {
		if (blockSpatialConstraints == null) {
			blockSpatialConstraints = new EObjectContainmentEList<BlockSpatialConstraint>(BlockSpatialConstraint.class, this, oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS);
		}
		return blockSpatialConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public EList<ComSpatialConstraint> getComSpatialConstraints() {
		if (comSpatialConstraints == null) {
			comSpatialConstraints = new EObjectContainmentEList<ComSpatialConstraint>(ComSpatialConstraint.class, this, oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS);
		}
		return comSpatialConstraints;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public GenerationMode getGeneration() {
		return generation;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setGeneration(GenerationMode newGeneration) {
		GenerationMode oldGeneration = generation;
		generation = newGeneration == null ? GENERATION_EDEFAULT : newGeneration;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, oasdPackage.SYSTEM_DESCRIPTION__GENERATION, oldGeneration, generation));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
				return ((InternalEList<?>)getTypes()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
				return ((InternalEList<?>)getBehaviors()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
				return ((InternalEList<?>)getCodes()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
				return ((InternalEList<?>)getCommunications()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
				return ((InternalEList<?>)getFunctionalChains()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
				return ((InternalEList<?>)getChainSpatialConstraints()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
				return ((InternalEList<?>)getBlockSpatialConstraints()).basicRemove(otherEnd, msgs);
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				return ((InternalEList<?>)getComSpatialConstraints()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case oasdPackage.SYSTEM_DESCRIPTION__NAME:
				return getName();
			case oasdPackage.SYSTEM_DESCRIPTION__VERSION:
				return getVersion();
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
				return getTypes();
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
				return getBehaviors();
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
				return getCodes();
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT:
				return getTimeUnit();
			case oasdPackage.SYSTEM_DESCRIPTION__SOURCE:
				return getSource();
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION:
				return getTimeUnitDeclaration();
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
				return getCommunications();
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
				return getFunctionalChains();
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
				return getChainSpatialConstraints();
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
				return getBlockSpatialConstraints();
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				return getComSpatialConstraints();
			case oasdPackage.SYSTEM_DESCRIPTION__GENERATION:
				return getGeneration();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case oasdPackage.SYSTEM_DESCRIPTION__NAME:
				setName((String)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__VERSION:
				setVersion((String)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
				getTypes().clear();
				getTypes().addAll((Collection<? extends TypeItem>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
				getBehaviors().clear();
				getBehaviors().addAll((Collection<? extends BehaviorItem>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
				getCodes().clear();
				getCodes().addAll((Collection<? extends Code>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT:
				setTimeUnit((String)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__SOURCE:
				setSource((String)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION:
				setTimeUnitDeclaration((String)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
				getCommunications().clear();
				getCommunications().addAll((Collection<? extends CommunicationItem>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
				getFunctionalChains().clear();
				getFunctionalChains().addAll((Collection<? extends FunctionalChainItem>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
				getChainSpatialConstraints().clear();
				getChainSpatialConstraints().addAll((Collection<? extends ChainSpatialConstraint>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
				getBlockSpatialConstraints().clear();
				getBlockSpatialConstraints().addAll((Collection<? extends BlockSpatialConstraint>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				getComSpatialConstraints().clear();
				getComSpatialConstraints().addAll((Collection<? extends ComSpatialConstraint>)newValue);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__GENERATION:
				setGeneration((GenerationMode)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case oasdPackage.SYSTEM_DESCRIPTION__NAME:
				setName(NAME_EDEFAULT);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__VERSION:
				setVersion(VERSION_EDEFAULT);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
				getTypes().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
				getBehaviors().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
				getCodes().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT:
				setTimeUnit(TIME_UNIT_EDEFAULT);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__SOURCE:
				setSource(SOURCE_EDEFAULT);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION:
				setTimeUnitDeclaration(TIME_UNIT_DECLARATION_EDEFAULT);
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
				getCommunications().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
				getFunctionalChains().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
				getChainSpatialConstraints().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
				getBlockSpatialConstraints().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				getComSpatialConstraints().clear();
				return;
			case oasdPackage.SYSTEM_DESCRIPTION__GENERATION:
				setGeneration(GENERATION_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case oasdPackage.SYSTEM_DESCRIPTION__NAME:
				return NAME_EDEFAULT == null ? name != null : !NAME_EDEFAULT.equals(name);
			case oasdPackage.SYSTEM_DESCRIPTION__VERSION:
				return VERSION_EDEFAULT == null ? version != null : !VERSION_EDEFAULT.equals(version);
			case oasdPackage.SYSTEM_DESCRIPTION__TYPES:
				return types != null && !types.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__BEHAVIORS:
				return behaviors != null && !behaviors.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__CODES:
				return codes != null && !codes.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT:
				return TIME_UNIT_EDEFAULT == null ? timeUnit != null : !TIME_UNIT_EDEFAULT.equals(timeUnit);
			case oasdPackage.SYSTEM_DESCRIPTION__SOURCE:
				return SOURCE_EDEFAULT == null ? source != null : !SOURCE_EDEFAULT.equals(source);
			case oasdPackage.SYSTEM_DESCRIPTION__TIME_UNIT_DECLARATION:
				return TIME_UNIT_DECLARATION_EDEFAULT == null ? timeUnitDeclaration != null : !TIME_UNIT_DECLARATION_EDEFAULT.equals(timeUnitDeclaration);
			case oasdPackage.SYSTEM_DESCRIPTION__COMMUNICATIONS:
				return communications != null && !communications.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__FUNCTIONAL_CHAINS:
				return functionalChains != null && !functionalChains.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__CHAIN_SPATIAL_CONSTRAINTS:
				return chainSpatialConstraints != null && !chainSpatialConstraints.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__BLOCK_SPATIAL_CONSTRAINTS:
				return blockSpatialConstraints != null && !blockSpatialConstraints.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__COM_SPATIAL_CONSTRAINTS:
				return comSpatialConstraints != null && !comSpatialConstraints.isEmpty();
			case oasdPackage.SYSTEM_DESCRIPTION__GENERATION:
				return generation != GENERATION_EDEFAULT;
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eBaseStructuralFeatureID(int derivedFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (derivedFeatureID) {
				case oasdPackage.SYSTEM_DESCRIPTION__NAME: return corePackage.NAMED_ELEMENT__NAME;
				default: return -1;
			}
		}
		if (baseClass == VersionedElement.class) {
			switch (derivedFeatureID) {
				case oasdPackage.SYSTEM_DESCRIPTION__VERSION: return corePackage.VERSIONED_ELEMENT__VERSION;
				default: return -1;
			}
		}
		return super.eBaseStructuralFeatureID(derivedFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public int eDerivedStructuralFeatureID(int baseFeatureID, Class<?> baseClass) {
		if (baseClass == NamedElement.class) {
			switch (baseFeatureID) {
				case corePackage.NAMED_ELEMENT__NAME: return oasdPackage.SYSTEM_DESCRIPTION__NAME;
				default: return -1;
			}
		}
		if (baseClass == VersionedElement.class) {
			switch (baseFeatureID) {
				case corePackage.VERSIONED_ELEMENT__VERSION: return oasdPackage.SYSTEM_DESCRIPTION__VERSION;
				default: return -1;
			}
		}
		return super.eDerivedStructuralFeatureID(baseFeatureID, baseClass);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (name: ");
		result.append(name);
		result.append(", version: ");
		result.append(version);
		result.append(", timeUnit: ");
		result.append(timeUnit);
		result.append(", source: ");
		result.append(source);
		result.append(", timeUnitDeclaration: ");
		result.append(timeUnitDeclaration);
		result.append(", generation: ");
		result.append(generation);
		result.append(')');
		return result.toString();
	}

} //SystemDescriptionImpl
