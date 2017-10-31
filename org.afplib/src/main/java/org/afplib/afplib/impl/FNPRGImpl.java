/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNPRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNPRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getLcHeight <em>Lc Height</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getCapMHt <em>Cap MHt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getMaxAscHt <em>Max Asc Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getMaxDesDp <em>Max Des Dp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getRetired <em>Retired</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getReserved3 <em>Reserved3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getUscoreWd <em>Uscore Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getUscoreWdf <em>Uscore Wdf</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNPRGImpl#getUscorePos <em>Uscore Pos</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNPRGImpl extends TripletImpl implements FNPRG {
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
	 * The default value of the '{@link #getLcHeight() <em>Lc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LC_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLcHeight() <em>Lc Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLcHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer lcHeight = LC_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCapMHt() <em>Cap MHt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapMHt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CAP_MHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCapMHt() <em>Cap MHt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCapMHt()
	 * @generated
	 * @ordered
	 */
	protected Integer capMHt = CAP_MHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxAscHt() <em>Max Asc Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAscHt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_ASC_HT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxAscHt() <em>Max Asc Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxAscHt()
	 * @generated
	 * @ordered
	 */
	protected Integer maxAscHt = MAX_ASC_HT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxDesDp() <em>Max Des Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDesDp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_DES_DP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxDesDp() <em>Max Des Dp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxDesDp()
	 * @generated
	 * @ordered
	 */
	protected Integer maxDesDp = MAX_DES_DP_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved2 = RESERVED2_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetired() <em>Retired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetired() <em>Retired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired()
	 * @generated
	 * @ordered
	 */
	protected Integer retired = RETIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved3() <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved3()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved3() <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved3()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved3 = RESERVED3_EDEFAULT;

	/**
	 * The default value of the '{@link #getUscoreWd() <em>Uscore Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscoreWd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USCORE_WD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUscoreWd() <em>Uscore Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscoreWd()
	 * @generated
	 * @ordered
	 */
	protected Integer uscoreWd = USCORE_WD_EDEFAULT;

	/**
	 * The default value of the '{@link #getUscoreWdf() <em>Uscore Wdf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscoreWdf()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USCORE_WDF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUscoreWdf() <em>Uscore Wdf</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscoreWdf()
	 * @generated
	 * @ordered
	 */
	protected Integer uscoreWdf = USCORE_WDF_EDEFAULT;

	/**
	 * The default value of the '{@link #getUscorePos() <em>Uscore Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscorePos()
	 * @generated
	 * @ordered
	 */
	protected static final Integer USCORE_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUscorePos() <em>Uscore Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUscorePos()
	 * @generated
	 * @ordered
	 */
	protected Integer uscorePos = USCORE_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNPRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFNPRG();
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLcHeight() {
		return lcHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLcHeight(Integer newLcHeight) {
		Integer oldLcHeight = lcHeight;
		lcHeight = newLcHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__LC_HEIGHT, oldLcHeight, lcHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCapMHt() {
		return capMHt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCapMHt(Integer newCapMHt) {
		Integer oldCapMHt = capMHt;
		capMHt = newCapMHt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__CAP_MHT, oldCapMHt, capMHt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxAscHt() {
		return maxAscHt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxAscHt(Integer newMaxAscHt) {
		Integer oldMaxAscHt = maxAscHt;
		maxAscHt = newMaxAscHt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__MAX_ASC_HT, oldMaxAscHt, maxAscHt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxDesDp() {
		return maxDesDp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxDesDp(Integer newMaxDesDp) {
		Integer oldMaxDesDp = maxDesDp;
		maxDesDp = newMaxDesDp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__MAX_DES_DP, oldMaxDesDp, maxDesDp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved2() {
		return reserved2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved2(byte[] newReserved2) {
		byte[] oldReserved2 = reserved2;
		reserved2 = newReserved2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__RESERVED2, oldReserved2, reserved2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRetired() {
		return retired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetired(Integer newRetired) {
		Integer oldRetired = retired;
		retired = newRetired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__RETIRED, oldRetired, retired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved3() {
		return reserved3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved3(Integer newReserved3) {
		Integer oldReserved3 = reserved3;
		reserved3 = newReserved3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__RESERVED3, oldReserved3, reserved3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUscoreWd() {
		return uscoreWd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUscoreWd(Integer newUscoreWd) {
		Integer oldUscoreWd = uscoreWd;
		uscoreWd = newUscoreWd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__USCORE_WD, oldUscoreWd, uscoreWd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUscoreWdf() {
		return uscoreWdf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUscoreWdf(Integer newUscoreWdf) {
		Integer oldUscoreWdf = uscoreWdf;
		uscoreWdf = newUscoreWdf;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__USCORE_WDF, oldUscoreWdf, uscoreWdf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUscorePos() {
		return uscorePos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUscorePos(Integer newUscorePos) {
		Integer oldUscorePos = uscorePos;
		uscorePos = newUscorePos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNPRG__USCORE_POS, oldUscorePos, uscorePos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FNPRG__RESERVED:
				return getReserved();
			case AfplibPackage.FNPRG__LC_HEIGHT:
				return getLcHeight();
			case AfplibPackage.FNPRG__CAP_MHT:
				return getCapMHt();
			case AfplibPackage.FNPRG__MAX_ASC_HT:
				return getMaxAscHt();
			case AfplibPackage.FNPRG__MAX_DES_DP:
				return getMaxDesDp();
			case AfplibPackage.FNPRG__RESERVED2:
				return getReserved2();
			case AfplibPackage.FNPRG__RETIRED:
				return getRetired();
			case AfplibPackage.FNPRG__RESERVED3:
				return getReserved3();
			case AfplibPackage.FNPRG__USCORE_WD:
				return getUscoreWd();
			case AfplibPackage.FNPRG__USCORE_WDF:
				return getUscoreWdf();
			case AfplibPackage.FNPRG__USCORE_POS:
				return getUscorePos();
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
			case AfplibPackage.FNPRG__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__LC_HEIGHT:
				setLcHeight((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__CAP_MHT:
				setCapMHt((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__MAX_ASC_HT:
				setMaxAscHt((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__MAX_DES_DP:
				setMaxDesDp((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__RESERVED2:
				setReserved2((byte[])newValue);
				return;
			case AfplibPackage.FNPRG__RETIRED:
				setRetired((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__RESERVED3:
				setReserved3((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__USCORE_WD:
				setUscoreWd((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__USCORE_WDF:
				setUscoreWdf((Integer)newValue);
				return;
			case AfplibPackage.FNPRG__USCORE_POS:
				setUscorePos((Integer)newValue);
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
			case AfplibPackage.FNPRG__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__LC_HEIGHT:
				setLcHeight(LC_HEIGHT_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__CAP_MHT:
				setCapMHt(CAP_MHT_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__MAX_ASC_HT:
				setMaxAscHt(MAX_ASC_HT_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__MAX_DES_DP:
				setMaxDesDp(MAX_DES_DP_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__RESERVED2:
				setReserved2(RESERVED2_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__RETIRED:
				setRetired(RETIRED_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__RESERVED3:
				setReserved3(RESERVED3_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__USCORE_WD:
				setUscoreWd(USCORE_WD_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__USCORE_WDF:
				setUscoreWdf(USCORE_WDF_EDEFAULT);
				return;
			case AfplibPackage.FNPRG__USCORE_POS:
				setUscorePos(USCORE_POS_EDEFAULT);
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
			case AfplibPackage.FNPRG__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.FNPRG__LC_HEIGHT:
				return LC_HEIGHT_EDEFAULT == null ? lcHeight != null : !LC_HEIGHT_EDEFAULT.equals(lcHeight);
			case AfplibPackage.FNPRG__CAP_MHT:
				return CAP_MHT_EDEFAULT == null ? capMHt != null : !CAP_MHT_EDEFAULT.equals(capMHt);
			case AfplibPackage.FNPRG__MAX_ASC_HT:
				return MAX_ASC_HT_EDEFAULT == null ? maxAscHt != null : !MAX_ASC_HT_EDEFAULT.equals(maxAscHt);
			case AfplibPackage.FNPRG__MAX_DES_DP:
				return MAX_DES_DP_EDEFAULT == null ? maxDesDp != null : !MAX_DES_DP_EDEFAULT.equals(maxDesDp);
			case AfplibPackage.FNPRG__RESERVED2:
				return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
			case AfplibPackage.FNPRG__RETIRED:
				return RETIRED_EDEFAULT == null ? retired != null : !RETIRED_EDEFAULT.equals(retired);
			case AfplibPackage.FNPRG__RESERVED3:
				return RESERVED3_EDEFAULT == null ? reserved3 != null : !RESERVED3_EDEFAULT.equals(reserved3);
			case AfplibPackage.FNPRG__USCORE_WD:
				return USCORE_WD_EDEFAULT == null ? uscoreWd != null : !USCORE_WD_EDEFAULT.equals(uscoreWd);
			case AfplibPackage.FNPRG__USCORE_WDF:
				return USCORE_WDF_EDEFAULT == null ? uscoreWdf != null : !USCORE_WDF_EDEFAULT.equals(uscoreWdf);
			case AfplibPackage.FNPRG__USCORE_POS:
				return USCORE_POS_EDEFAULT == null ? uscorePos != null : !USCORE_POS_EDEFAULT.equals(uscorePos);
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
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", LcHeight: ");
		result.append(lcHeight);
		result.append(", CapMHt: ");
		result.append(capMHt);
		result.append(", MaxAscHt: ");
		result.append(maxAscHt);
		result.append(", MaxDesDp: ");
		result.append(maxDesDp);
		result.append(", Reserved2: ");
		result.append(reserved2);
		result.append(", Retired: ");
		result.append(retired);
		result.append(", Reserved3: ");
		result.append(reserved3);
		result.append(", UscoreWd: ");
		result.append(uscoreWd);
		result.append(", UscoreWdf: ");
		result.append(uscoreWdf);
		result.append(", UscorePos: ");
		result.append(uscorePos);
		result.append(')');
		return result.toString();
	}

} //FNPRGImpl
