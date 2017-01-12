/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CFIRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CFIRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getFCSName <em>FCS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getCPName <em>CP Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getSVSize <em>SV Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getSHScale <em>SH Scale</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFIRGImpl#getSection <em>Section</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFIRGImpl extends TripletImpl implements CFIRG {
	/**
	 * The default value of the '{@link #getFCSName() <em>FCS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCSName()
	 * @generated
	 * @ordered
	 */
	protected static final String FCS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFCSName() <em>FCS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFCSName()
	 * @generated
	 * @ordered
	 */
	protected String fcsName = FCS_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPName() <em>CP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPName()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPName() <em>CP Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPName()
	 * @generated
	 * @ordered
	 */
	protected String cpName = CP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSVSize() <em>SV Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SV_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSVSize() <em>SV Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSVSize()
	 * @generated
	 * @ordered
	 */
	protected Integer svSize = SV_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHScale() <em>SH Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHScale()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SH_SCALE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHScale() <em>SH Scale</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHScale()
	 * @generated
	 * @ordered
	 */
	protected Integer shScale = SH_SCALE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECTION_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSection() <em>Section</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSection()
	 * @generated
	 * @ordered
	 */
	protected Integer section = SECTION_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CFIRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.CFIRG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getFCSName() {
		return fcsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFCSName(String newFCSName) {
		String oldFCSName = fcsName;
		fcsName = newFCSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__FCS_NAME, oldFCSName, fcsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPName() {
		return cpName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPName(String newCPName) {
		String oldCPName = cpName;
		cpName = newCPName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__CP_NAME, oldCPName, cpName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSVSize() {
		return svSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSVSize(Integer newSVSize) {
		Integer oldSVSize = svSize;
		svSize = newSVSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__SV_SIZE, oldSVSize, svSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSHScale() {
		return shScale;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSHScale(Integer newSHScale) {
		Integer oldSHScale = shScale;
		shScale = newSHScale;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__SH_SCALE, oldSHScale, shScale));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSection() {
		return section;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSection(Integer newSection) {
		Integer oldSection = section;
		section = newSection;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFIRG__SECTION, oldSection, section));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.CFIRG__FCS_NAME:
				return getFCSName();
			case AfplibPackage.CFIRG__CP_NAME:
				return getCPName();
			case AfplibPackage.CFIRG__SV_SIZE:
				return getSVSize();
			case AfplibPackage.CFIRG__SH_SCALE:
				return getSHScale();
			case AfplibPackage.CFIRG__RESERVED:
				return getReserved();
			case AfplibPackage.CFIRG__SECTION:
				return getSection();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.CFIRG__FCS_NAME:
				setFCSName((String)newValue);
				return;
			case AfplibPackage.CFIRG__CP_NAME:
				setCPName((String)newValue);
				return;
			case AfplibPackage.CFIRG__SV_SIZE:
				setSVSize((Integer)newValue);
				return;
			case AfplibPackage.CFIRG__SH_SCALE:
				setSHScale((Integer)newValue);
				return;
			case AfplibPackage.CFIRG__RESERVED:
				setReserved((byte[])newValue);
				return;
			case AfplibPackage.CFIRG__SECTION:
				setSection((Integer)newValue);
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
			case AfplibPackage.CFIRG__FCS_NAME:
				setFCSName(FCS_NAME_EDEFAULT);
				return;
			case AfplibPackage.CFIRG__CP_NAME:
				setCPName(CP_NAME_EDEFAULT);
				return;
			case AfplibPackage.CFIRG__SV_SIZE:
				setSVSize(SV_SIZE_EDEFAULT);
				return;
			case AfplibPackage.CFIRG__SH_SCALE:
				setSHScale(SH_SCALE_EDEFAULT);
				return;
			case AfplibPackage.CFIRG__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.CFIRG__SECTION:
				setSection(SECTION_EDEFAULT);
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
			case AfplibPackage.CFIRG__FCS_NAME:
				return FCS_NAME_EDEFAULT == null ? fcsName != null : !FCS_NAME_EDEFAULT.equals(fcsName);
			case AfplibPackage.CFIRG__CP_NAME:
				return CP_NAME_EDEFAULT == null ? cpName != null : !CP_NAME_EDEFAULT.equals(cpName);
			case AfplibPackage.CFIRG__SV_SIZE:
				return SV_SIZE_EDEFAULT == null ? svSize != null : !SV_SIZE_EDEFAULT.equals(svSize);
			case AfplibPackage.CFIRG__SH_SCALE:
				return SH_SCALE_EDEFAULT == null ? shScale != null : !SH_SCALE_EDEFAULT.equals(shScale);
			case AfplibPackage.CFIRG__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.CFIRG__SECTION:
				return SECTION_EDEFAULT == null ? section != null : !SECTION_EDEFAULT.equals(section);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuffer result = new StringBuffer(super.toString());
		result.append(" (FCSName: ");
		result.append(fcsName);
		result.append(", CPName: ");
		result.append(cpName);
		result.append(", SVSize: ");
		result.append(svSize);
		result.append(", SHScale: ");
		result.append(shScale);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(", Section: ");
		result.append(section);
		result.append(')');
		return result.toString();
	}

} //CFIRGImpl
