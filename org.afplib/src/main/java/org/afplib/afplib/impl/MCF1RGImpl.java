/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MCF1RG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCF1RG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getCFLid <em>CF Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getSectid <em>Sectid</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getCFName <em>CF Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getCPName <em>CP Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getFCSName <em>FCS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCF1RGImpl#getCharRot <em>Char Rot</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCF1RGImpl extends TripletImpl implements MCF1RG {
	/**
	 * The default value of the '{@link #getCFLid() <em>CF Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFLid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CF_LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFLid() <em>CF Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFLid()
	 * @generated
	 * @ordered
	 */
	protected Integer cfLid = CF_LID_EDEFAULT;

	/**
	 * The default value of the '{@link #getSectid() <em>Sectid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SECTID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSectid() <em>Sectid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSectid()
	 * @generated
	 * @ordered
	 */
	protected Integer sectid = SECTID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCFName() <em>CF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFName()
	 * @generated
	 * @ordered
	 */
	protected static final String CF_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFName() <em>CF Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFName()
	 * @generated
	 * @ordered
	 */
	protected String cfName = CF_NAME_EDEFAULT;

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
	 * The default value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharRot()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_ROT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharRot()
	 * @generated
	 * @ordered
	 */
	protected Integer charRot = CHAR_ROT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCF1RGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.MCF1RG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCFLid() {
		return cfLid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFLid(Integer newCFLid) {
		Integer oldCFLid = cfLid;
		cfLid = newCFLid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__CF_LID, oldCFLid, cfLid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSectid() {
		return sectid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSectid(Integer newSectid) {
		Integer oldSectid = sectid;
		sectid = newSectid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__SECTID, oldSectid, sectid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCFName() {
		return cfName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFName(String newCFName) {
		String oldCFName = cfName;
		cfName = newCFName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__CF_NAME, oldCFName, cfName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__CP_NAME, oldCPName, cpName));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__FCS_NAME, oldFCSName, fcsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharRot() {
		return charRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharRot(Integer newCharRot) {
		Integer oldCharRot = charRot;
		charRot = newCharRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCF1RG__CHAR_ROT, oldCharRot, charRot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MCF1RG__CF_LID:
				return getCFLid();
			case AfplibPackage.MCF1RG__SECTID:
				return getSectid();
			case AfplibPackage.MCF1RG__CF_NAME:
				return getCFName();
			case AfplibPackage.MCF1RG__CP_NAME:
				return getCPName();
			case AfplibPackage.MCF1RG__FCS_NAME:
				return getFCSName();
			case AfplibPackage.MCF1RG__CHAR_ROT:
				return getCharRot();
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
			case AfplibPackage.MCF1RG__CF_LID:
				setCFLid((Integer)newValue);
				return;
			case AfplibPackage.MCF1RG__SECTID:
				setSectid((Integer)newValue);
				return;
			case AfplibPackage.MCF1RG__CF_NAME:
				setCFName((String)newValue);
				return;
			case AfplibPackage.MCF1RG__CP_NAME:
				setCPName((String)newValue);
				return;
			case AfplibPackage.MCF1RG__FCS_NAME:
				setFCSName((String)newValue);
				return;
			case AfplibPackage.MCF1RG__CHAR_ROT:
				setCharRot((Integer)newValue);
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
			case AfplibPackage.MCF1RG__CF_LID:
				setCFLid(CF_LID_EDEFAULT);
				return;
			case AfplibPackage.MCF1RG__SECTID:
				setSectid(SECTID_EDEFAULT);
				return;
			case AfplibPackage.MCF1RG__CF_NAME:
				setCFName(CF_NAME_EDEFAULT);
				return;
			case AfplibPackage.MCF1RG__CP_NAME:
				setCPName(CP_NAME_EDEFAULT);
				return;
			case AfplibPackage.MCF1RG__FCS_NAME:
				setFCSName(FCS_NAME_EDEFAULT);
				return;
			case AfplibPackage.MCF1RG__CHAR_ROT:
				setCharRot(CHAR_ROT_EDEFAULT);
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
			case AfplibPackage.MCF1RG__CF_LID:
				return CF_LID_EDEFAULT == null ? cfLid != null : !CF_LID_EDEFAULT.equals(cfLid);
			case AfplibPackage.MCF1RG__SECTID:
				return SECTID_EDEFAULT == null ? sectid != null : !SECTID_EDEFAULT.equals(sectid);
			case AfplibPackage.MCF1RG__CF_NAME:
				return CF_NAME_EDEFAULT == null ? cfName != null : !CF_NAME_EDEFAULT.equals(cfName);
			case AfplibPackage.MCF1RG__CP_NAME:
				return CP_NAME_EDEFAULT == null ? cpName != null : !CP_NAME_EDEFAULT.equals(cpName);
			case AfplibPackage.MCF1RG__FCS_NAME:
				return FCS_NAME_EDEFAULT == null ? fcsName != null : !FCS_NAME_EDEFAULT.equals(fcsName);
			case AfplibPackage.MCF1RG__CHAR_ROT:
				return CHAR_ROT_EDEFAULT == null ? charRot != null : !CHAR_ROT_EDEFAULT.equals(charRot);
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
		result.append(" (CFLid: ");
		result.append(cfLid);
		result.append(", Sectid: ");
		result.append(sectid);
		result.append(", CFName: ");
		result.append(cfName);
		result.append(", CPName: ");
		result.append(cpName);
		result.append(", FCSName: ");
		result.append(fcsName);
		result.append(", CharRot: ");
		result.append(charRot);
		result.append(')');
		return result.toString();
	}

} //MCF1RGImpl
