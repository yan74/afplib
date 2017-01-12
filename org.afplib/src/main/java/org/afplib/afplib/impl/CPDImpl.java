/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CPD;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getCPDesc <em>CP Desc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getGCGIDLen <em>GCGID Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getNumCdPts <em>Num Cd Pts</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getCPGID <em>CPGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPDImpl#getEncScheme <em>Enc Scheme</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPDImpl extends SFImpl implements CPD {
	/**
	 * The default value of the '{@link #getCPDesc() <em>CP Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPDesc()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_DESC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPDesc() <em>CP Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPDesc()
	 * @generated
	 * @ordered
	 */
	protected String cpDesc = CP_DESC_EDEFAULT;

	/**
	 * The default value of the '{@link #getGCGIDLen() <em>GCGID Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGIDLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GCGID_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGCGIDLen() <em>GCGID Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGIDLen()
	 * @generated
	 * @ordered
	 */
	protected Integer gcgidLen = GCGID_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getNumCdPts() <em>Num Cd Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCdPts()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NUM_CD_PTS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNumCdPts() <em>Num Cd Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNumCdPts()
	 * @generated
	 * @ordered
	 */
	protected Integer numCdPts = NUM_CD_PTS_EDEFAULT;

	/**
	 * The default value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCSGID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GCSGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGCSGID() <em>GCSGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCSGID()
	 * @generated
	 * @ordered
	 */
	protected Integer gcsgid = GCSGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPGID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CPGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCPGID() <em>CPGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCPGID()
	 * @generated
	 * @ordered
	 */
	protected Integer cpgid = CPGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getEncScheme() <em>Enc Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncScheme()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ENC_SCHEME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEncScheme() <em>Enc Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEncScheme()
	 * @generated
	 * @ordered
	 */
	protected Integer encScheme = ENC_SCHEME_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.CPD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCPDesc() {
		return cpDesc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPDesc(String newCPDesc) {
		String oldCPDesc = cpDesc;
		cpDesc = newCPDesc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__CP_DESC, oldCPDesc, cpDesc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getGCGIDLen() {
		return gcgidLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGCGIDLen(Integer newGCGIDLen) {
		Integer oldGCGIDLen = gcgidLen;
		gcgidLen = newGCGIDLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__GCGID_LEN, oldGCGIDLen, gcgidLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNumCdPts() {
		return numCdPts;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNumCdPts(Integer newNumCdPts) {
		Integer oldNumCdPts = numCdPts;
		numCdPts = newNumCdPts;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__NUM_CD_PTS, oldNumCdPts, numCdPts));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getGCSGID() {
		return gcsgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGCSGID(Integer newGCSGID) {
		Integer oldGCSGID = gcsgid;
		gcsgid = newGCSGID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__GCSGID, oldGCSGID, gcsgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCPGID() {
		return cpgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCPGID(Integer newCPGID) {
		Integer oldCPGID = cpgid;
		cpgid = newCPGID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__CPGID, oldCPGID, cpgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEncScheme() {
		return encScheme;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEncScheme(Integer newEncScheme) {
		Integer oldEncScheme = encScheme;
		encScheme = newEncScheme;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPD__ENC_SCHEME, oldEncScheme, encScheme));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.CPD__CP_DESC:
				return getCPDesc();
			case AfplibPackage.CPD__GCGID_LEN:
				return getGCGIDLen();
			case AfplibPackage.CPD__NUM_CD_PTS:
				return getNumCdPts();
			case AfplibPackage.CPD__GCSGID:
				return getGCSGID();
			case AfplibPackage.CPD__CPGID:
				return getCPGID();
			case AfplibPackage.CPD__ENC_SCHEME:
				return getEncScheme();
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
			case AfplibPackage.CPD__CP_DESC:
				setCPDesc((String)newValue);
				return;
			case AfplibPackage.CPD__GCGID_LEN:
				setGCGIDLen((Integer)newValue);
				return;
			case AfplibPackage.CPD__NUM_CD_PTS:
				setNumCdPts((Integer)newValue);
				return;
			case AfplibPackage.CPD__GCSGID:
				setGCSGID((Integer)newValue);
				return;
			case AfplibPackage.CPD__CPGID:
				setCPGID((Integer)newValue);
				return;
			case AfplibPackage.CPD__ENC_SCHEME:
				setEncScheme((Integer)newValue);
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
			case AfplibPackage.CPD__CP_DESC:
				setCPDesc(CP_DESC_EDEFAULT);
				return;
			case AfplibPackage.CPD__GCGID_LEN:
				setGCGIDLen(GCGID_LEN_EDEFAULT);
				return;
			case AfplibPackage.CPD__NUM_CD_PTS:
				setNumCdPts(NUM_CD_PTS_EDEFAULT);
				return;
			case AfplibPackage.CPD__GCSGID:
				setGCSGID(GCSGID_EDEFAULT);
				return;
			case AfplibPackage.CPD__CPGID:
				setCPGID(CPGID_EDEFAULT);
				return;
			case AfplibPackage.CPD__ENC_SCHEME:
				setEncScheme(ENC_SCHEME_EDEFAULT);
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
			case AfplibPackage.CPD__CP_DESC:
				return CP_DESC_EDEFAULT == null ? cpDesc != null : !CP_DESC_EDEFAULT.equals(cpDesc);
			case AfplibPackage.CPD__GCGID_LEN:
				return GCGID_LEN_EDEFAULT == null ? gcgidLen != null : !GCGID_LEN_EDEFAULT.equals(gcgidLen);
			case AfplibPackage.CPD__NUM_CD_PTS:
				return NUM_CD_PTS_EDEFAULT == null ? numCdPts != null : !NUM_CD_PTS_EDEFAULT.equals(numCdPts);
			case AfplibPackage.CPD__GCSGID:
				return GCSGID_EDEFAULT == null ? gcsgid != null : !GCSGID_EDEFAULT.equals(gcsgid);
			case AfplibPackage.CPD__CPGID:
				return CPGID_EDEFAULT == null ? cpgid != null : !CPGID_EDEFAULT.equals(cpgid);
			case AfplibPackage.CPD__ENC_SCHEME:
				return ENC_SCHEME_EDEFAULT == null ? encScheme != null : !ENC_SCHEME_EDEFAULT.equals(encScheme);
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
		result.append(" (CPDesc: ");
		result.append(cpDesc);
		result.append(", GCGIDLen: ");
		result.append(gcgidLen);
		result.append(", NumCdPts: ");
		result.append(numCdPts);
		result.append(", GCSGID: ");
		result.append(gcsgid);
		result.append(", CPGID: ");
		result.append(cpgid);
		result.append(", EncScheme: ");
		result.append(encScheme);
		result.append(')');
		return result.toString();
	}

} //CPDImpl
