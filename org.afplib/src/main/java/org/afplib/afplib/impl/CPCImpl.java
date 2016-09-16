/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CPC;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getDefCharID <em>Def Char ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getPrtFlags <em>Prt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getCPIRGLen <em>CPIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getVSCharSN <em>VS Char SN</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getVSChar <em>VS Char</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPCImpl#getVSFlags <em>VS Flags</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPCImpl extends SFImpl implements CPC {
	/**
	 * The default value of the '{@link #getDefCharID() <em>Def Char ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefCharID()
	 * @generated
	 * @ordered
	 */
	protected static final String DEF_CHAR_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefCharID() <em>Def Char ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefCharID()
	 * @generated
	 * @ordered
	 */
	protected String defCharID = DEF_CHAR_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getPrtFlags() <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrtFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrtFlags() <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrtFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer prtFlags = PRT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPIRGLen() <em>CPIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPIRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CPIRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPIRGLen() <em>CPIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPIRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer cpirgLen = CPIRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSCharSN() <em>VS Char SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSCharSN()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VS_CHAR_SN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSCharSN() <em>VS Char SN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSCharSN()
	 * @generated
	 * @ordered
	 */
	protected Integer vsCharSN = VS_CHAR_SN_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSChar() <em>VS Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSChar()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VS_CHAR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSChar() <em>VS Char</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSChar()
	 * @generated
	 * @ordered
	 */
	protected Integer vsChar = VS_CHAR_EDEFAULT;

	/**
	 * The default value of the '{@link #getVSFlags() <em>VS Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VS_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVSFlags() <em>VS Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVSFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer vsFlags = VS_FLAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getCPC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getDefCharID() {
		return defCharID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefCharID(String newDefCharID) {
		String oldDefCharID = defCharID;
		defCharID = newDefCharID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__DEF_CHAR_ID, oldDefCharID, defCharID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrtFlags() {
		return prtFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrtFlags(Integer newPrtFlags) {
		Integer oldPrtFlags = prtFlags;
		prtFlags = newPrtFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__PRT_FLAGS, oldPrtFlags, prtFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCPIRGLen() {
		return cpirgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPIRGLen(Integer newCPIRGLen) {
		Integer oldCPIRGLen = cpirgLen;
		cpirgLen = newCPIRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__CPIRG_LEN, oldCPIRGLen, cpirgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVSCharSN() {
		return vsCharSN;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSCharSN(Integer newVSCharSN) {
		Integer oldVSCharSN = vsCharSN;
		vsCharSN = newVSCharSN;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__VS_CHAR_SN, oldVSCharSN, vsCharSN));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVSChar() {
		return vsChar;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSChar(Integer newVSChar) {
		Integer oldVSChar = vsChar;
		vsChar = newVSChar;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__VS_CHAR, oldVSChar, vsChar));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVSFlags() {
		return vsFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVSFlags(Integer newVSFlags) {
		Integer oldVSFlags = vsFlags;
		vsFlags = newVSFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPC__VS_FLAGS, oldVSFlags, vsFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.CPC__DEF_CHAR_ID:
				return getDefCharID();
			case AfplibPackage.CPC__PRT_FLAGS:
				return getPrtFlags();
			case AfplibPackage.CPC__CPIRG_LEN:
				return getCPIRGLen();
			case AfplibPackage.CPC__VS_CHAR_SN:
				return getVSCharSN();
			case AfplibPackage.CPC__VS_CHAR:
				return getVSChar();
			case AfplibPackage.CPC__VS_FLAGS:
				return getVSFlags();
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
			case AfplibPackage.CPC__DEF_CHAR_ID:
				setDefCharID((String)newValue);
				return;
			case AfplibPackage.CPC__PRT_FLAGS:
				setPrtFlags((Integer)newValue);
				return;
			case AfplibPackage.CPC__CPIRG_LEN:
				setCPIRGLen((Integer)newValue);
				return;
			case AfplibPackage.CPC__VS_CHAR_SN:
				setVSCharSN((Integer)newValue);
				return;
			case AfplibPackage.CPC__VS_CHAR:
				setVSChar((Integer)newValue);
				return;
			case AfplibPackage.CPC__VS_FLAGS:
				setVSFlags((Integer)newValue);
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
			case AfplibPackage.CPC__DEF_CHAR_ID:
				setDefCharID(DEF_CHAR_ID_EDEFAULT);
				return;
			case AfplibPackage.CPC__PRT_FLAGS:
				setPrtFlags(PRT_FLAGS_EDEFAULT);
				return;
			case AfplibPackage.CPC__CPIRG_LEN:
				setCPIRGLen(CPIRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.CPC__VS_CHAR_SN:
				setVSCharSN(VS_CHAR_SN_EDEFAULT);
				return;
			case AfplibPackage.CPC__VS_CHAR:
				setVSChar(VS_CHAR_EDEFAULT);
				return;
			case AfplibPackage.CPC__VS_FLAGS:
				setVSFlags(VS_FLAGS_EDEFAULT);
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
			case AfplibPackage.CPC__DEF_CHAR_ID:
				return DEF_CHAR_ID_EDEFAULT == null ? defCharID != null : !DEF_CHAR_ID_EDEFAULT.equals(defCharID);
			case AfplibPackage.CPC__PRT_FLAGS:
				return PRT_FLAGS_EDEFAULT == null ? prtFlags != null : !PRT_FLAGS_EDEFAULT.equals(prtFlags);
			case AfplibPackage.CPC__CPIRG_LEN:
				return CPIRG_LEN_EDEFAULT == null ? cpirgLen != null : !CPIRG_LEN_EDEFAULT.equals(cpirgLen);
			case AfplibPackage.CPC__VS_CHAR_SN:
				return VS_CHAR_SN_EDEFAULT == null ? vsCharSN != null : !VS_CHAR_SN_EDEFAULT.equals(vsCharSN);
			case AfplibPackage.CPC__VS_CHAR:
				return VS_CHAR_EDEFAULT == null ? vsChar != null : !VS_CHAR_EDEFAULT.equals(vsChar);
			case AfplibPackage.CPC__VS_FLAGS:
				return VS_FLAGS_EDEFAULT == null ? vsFlags != null : !VS_FLAGS_EDEFAULT.equals(vsFlags);
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
		result.append(" (DefCharID: ");
		result.append(defCharID);
		result.append(", PrtFlags: ");
		result.append(prtFlags);
		result.append(", CPIRGLen: ");
		result.append(cpirgLen);
		result.append(", VSCharSN: ");
		result.append(vsCharSN);
		result.append(", VSChar: ");
		result.append(vsChar);
		result.append(", VSFlags: ");
		result.append(vsFlags);
		result.append(')');
		return result.toString();
	}

} //CPCImpl
