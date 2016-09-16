/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNIRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNIRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getCharInc <em>Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getAscendHt <em>Ascend Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getDescendDp <em>Descend Dp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getFNMCnt <em>FNM Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getASpace <em>ASpace</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getBSpace <em>BSpace</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getCSpace <em>CSpace</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNIRGImpl#getBaseOset <em>Base Oset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNIRGImpl extends TripletImpl implements FNIRG {
	/**
	 * The default value of the '{@link #getGCGID() <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGID()
	 * @generated
	 * @ordered
	 */
	protected static final String GCGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGCGID() <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGID()
	 * @generated
	 * @ordered
	 */
	protected String gcgid = GCGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharInc() <em>Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharInc() <em>Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharInc()
	 * @generated
	 * @ordered
	 */
	protected Integer charInc = CHAR_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getAscendHt() <em>Ascend Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscendHt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ASCEND_HT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAscendHt() <em>Ascend Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAscendHt()
	 * @generated
	 * @ordered
	 */
	protected Integer ascendHt = ASCEND_HT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDescendDp() <em>Descend Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendDp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DESCEND_DP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDescendDp() <em>Descend Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDescendDp()
	 * @generated
	 * @ordered
	 */
	protected Integer descendDp = DESCEND_DP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNMCnt() <em>FNM Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNMCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNM_CNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNMCnt() <em>FNM Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNMCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer fnmCnt = FNM_CNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getASpace() <em>ASpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASpace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ASPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getASpace() <em>ASpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getASpace()
	 * @generated
	 * @ordered
	 */
	protected Integer aSpace = ASPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getBSpace() <em>BSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBSpace() <em>BSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBSpace()
	 * @generated
	 * @ordered
	 */
	protected Integer bSpace = BSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getCSpace() <em>CSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSpace()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CSPACE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCSpace() <em>CSpace</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCSpace()
	 * @generated
	 * @ordered
	 */
	protected Integer cSpace = CSPACE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved2 = RESERVED2_EDEFAULT;

	/**
	 * The default value of the '{@link #getBaseOset() <em>Base Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BASE_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBaseOset() <em>Base Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBaseOset()
	 * @generated
	 * @ordered
	 */
	protected Integer baseOset = BASE_OSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNIRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFNIRG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGCGID() {
		return gcgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGCGID(String newGCGID) {
		String oldGCGID = gcgid;
		gcgid = newGCGID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__GCGID, oldGCGID, gcgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharInc() {
		return charInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharInc(Integer newCharInc) {
		Integer oldCharInc = charInc;
		charInc = newCharInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__CHAR_INC, oldCharInc, charInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAscendHt() {
		return ascendHt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAscendHt(Integer newAscendHt) {
		Integer oldAscendHt = ascendHt;
		ascendHt = newAscendHt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__ASCEND_HT, oldAscendHt, ascendHt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDescendDp() {
		return descendDp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDescendDp(Integer newDescendDp) {
		Integer oldDescendDp = descendDp;
		descendDp = newDescendDp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__DESCEND_DP, oldDescendDp, descendDp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Integer newReserved) {
		Integer oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNMCnt() {
		return fnmCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNMCnt(Integer newFNMCnt) {
		Integer oldFNMCnt = fnmCnt;
		fnmCnt = newFNMCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__FNM_CNT, oldFNMCnt, fnmCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getASpace() {
		return aSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setASpace(Integer newASpace) {
		Integer oldASpace = aSpace;
		aSpace = newASpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__ASPACE, oldASpace, aSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBSpace() {
		return bSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBSpace(Integer newBSpace) {
		Integer oldBSpace = bSpace;
		bSpace = newBSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__BSPACE, oldBSpace, bSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCSpace() {
		return cSpace;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCSpace(Integer newCSpace) {
		Integer oldCSpace = cSpace;
		cSpace = newCSpace;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__CSPACE, oldCSpace, cSpace));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved2() {
		return reserved2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved2(Integer newReserved2) {
		Integer oldReserved2 = reserved2;
		reserved2 = newReserved2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__RESERVED2, oldReserved2, reserved2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBaseOset() {
		return baseOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBaseOset(Integer newBaseOset) {
		Integer oldBaseOset = baseOset;
		baseOset = newBaseOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNIRG__BASE_OSET, oldBaseOset, baseOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FNIRG__GCGID:
				return getGCGID();
			case AfplibPackage.FNIRG__CHAR_INC:
				return getCharInc();
			case AfplibPackage.FNIRG__ASCEND_HT:
				return getAscendHt();
			case AfplibPackage.FNIRG__DESCEND_DP:
				return getDescendDp();
			case AfplibPackage.FNIRG__RESERVED:
				return getReserved();
			case AfplibPackage.FNIRG__FNM_CNT:
				return getFNMCnt();
			case AfplibPackage.FNIRG__ASPACE:
				return getASpace();
			case AfplibPackage.FNIRG__BSPACE:
				return getBSpace();
			case AfplibPackage.FNIRG__CSPACE:
				return getCSpace();
			case AfplibPackage.FNIRG__RESERVED2:
				return getReserved2();
			case AfplibPackage.FNIRG__BASE_OSET:
				return getBaseOset();
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
			case AfplibPackage.FNIRG__GCGID:
				setGCGID((String)newValue);
				return;
			case AfplibPackage.FNIRG__CHAR_INC:
				setCharInc((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__ASCEND_HT:
				setAscendHt((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__DESCEND_DP:
				setDescendDp((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__FNM_CNT:
				setFNMCnt((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__ASPACE:
				setASpace((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__BSPACE:
				setBSpace((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__CSPACE:
				setCSpace((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__RESERVED2:
				setReserved2((Integer)newValue);
				return;
			case AfplibPackage.FNIRG__BASE_OSET:
				setBaseOset((Integer)newValue);
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
			case AfplibPackage.FNIRG__GCGID:
				setGCGID(GCGID_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__CHAR_INC:
				setCharInc(CHAR_INC_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__ASCEND_HT:
				setAscendHt(ASCEND_HT_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__DESCEND_DP:
				setDescendDp(DESCEND_DP_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__FNM_CNT:
				setFNMCnt(FNM_CNT_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__ASPACE:
				setASpace(ASPACE_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__BSPACE:
				setBSpace(BSPACE_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__CSPACE:
				setCSpace(CSPACE_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__RESERVED2:
				setReserved2(RESERVED2_EDEFAULT);
				return;
			case AfplibPackage.FNIRG__BASE_OSET:
				setBaseOset(BASE_OSET_EDEFAULT);
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
			case AfplibPackage.FNIRG__GCGID:
				return GCGID_EDEFAULT == null ? gcgid != null : !GCGID_EDEFAULT.equals(gcgid);
			case AfplibPackage.FNIRG__CHAR_INC:
				return CHAR_INC_EDEFAULT == null ? charInc != null : !CHAR_INC_EDEFAULT.equals(charInc);
			case AfplibPackage.FNIRG__ASCEND_HT:
				return ASCEND_HT_EDEFAULT == null ? ascendHt != null : !ASCEND_HT_EDEFAULT.equals(ascendHt);
			case AfplibPackage.FNIRG__DESCEND_DP:
				return DESCEND_DP_EDEFAULT == null ? descendDp != null : !DESCEND_DP_EDEFAULT.equals(descendDp);
			case AfplibPackage.FNIRG__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.FNIRG__FNM_CNT:
				return FNM_CNT_EDEFAULT == null ? fnmCnt != null : !FNM_CNT_EDEFAULT.equals(fnmCnt);
			case AfplibPackage.FNIRG__ASPACE:
				return ASPACE_EDEFAULT == null ? aSpace != null : !ASPACE_EDEFAULT.equals(aSpace);
			case AfplibPackage.FNIRG__BSPACE:
				return BSPACE_EDEFAULT == null ? bSpace != null : !BSPACE_EDEFAULT.equals(bSpace);
			case AfplibPackage.FNIRG__CSPACE:
				return CSPACE_EDEFAULT == null ? cSpace != null : !CSPACE_EDEFAULT.equals(cSpace);
			case AfplibPackage.FNIRG__RESERVED2:
				return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
			case AfplibPackage.FNIRG__BASE_OSET:
				return BASE_OSET_EDEFAULT == null ? baseOset != null : !BASE_OSET_EDEFAULT.equals(baseOset);
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
		result.append(" (GCGID: ");
		result.append(gcgid);
		result.append(", CharInc: ");
		result.append(charInc);
		result.append(", AscendHt: ");
		result.append(ascendHt);
		result.append(", DescendDp: ");
		result.append(descendDp);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(", FNMCnt: ");
		result.append(fnmCnt);
		result.append(", ASpace: ");
		result.append(aSpace);
		result.append(", BSpace: ");
		result.append(bSpace);
		result.append(", CSpace: ");
		result.append(cSpace);
		result.append(", Reserved2: ");
		result.append(reserved2);
		result.append(", BaseOset: ");
		result.append(baseOset);
		result.append(')');
		return result.toString();
	}

} //FNIRGImpl
