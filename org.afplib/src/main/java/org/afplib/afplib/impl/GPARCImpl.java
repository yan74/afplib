/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GPARC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GPARC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getXCENT <em>XCENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getYCENT <em>YCENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getMFR <em>MFR</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getSTART <em>START</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GPARCImpl#getSWEEP <em>SWEEP</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GPARCImpl extends TripletImpl implements GPARC {
	/**
     * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS()
     * @generated
     * @ordered
     */
	protected static final Integer XPOS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS()
     * @generated
     * @ordered
     */
	protected Integer xpos = XPOS_EDEFAULT;

	/**
     * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS()
     * @generated
     * @ordered
     */
	protected static final Integer YPOS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS()
     * @generated
     * @ordered
     */
	protected Integer ypos = YPOS_EDEFAULT;

	/**
     * The default value of the '{@link #getXCENT() <em>XCENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXCENT()
     * @generated
     * @ordered
     */
	protected static final Integer XCENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXCENT() <em>XCENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXCENT()
     * @generated
     * @ordered
     */
	protected Integer xcent = XCENT_EDEFAULT;

	/**
     * The default value of the '{@link #getYCENT() <em>YCENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYCENT()
     * @generated
     * @ordered
     */
	protected static final Integer YCENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYCENT() <em>YCENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYCENT()
     * @generated
     * @ordered
     */
	protected Integer ycent = YCENT_EDEFAULT;

	/**
     * The default value of the '{@link #getMH() <em>MH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMH()
     * @generated
     * @ordered
     */
	protected static final Integer MH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMH() <em>MH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMH()
     * @generated
     * @ordered
     */
	protected Integer mh = MH_EDEFAULT;

	/**
     * The default value of the '{@link #getMFR() <em>MFR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMFR()
     * @generated
     * @ordered
     */
	protected static final Integer MFR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMFR() <em>MFR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMFR()
     * @generated
     * @ordered
     */
	protected Integer mfr = MFR_EDEFAULT;

	/**
     * The default value of the '{@link #getSTART() <em>START</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSTART()
     * @generated
     * @ordered
     */
	protected static final Integer START_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSTART() <em>START</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSTART()
     * @generated
     * @ordered
     */
	protected Integer start = START_EDEFAULT;

	/**
     * The default value of the '{@link #getSWEEP() <em>SWEEP</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSWEEP()
     * @generated
     * @ordered
     */
	protected static final Integer SWEEP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSWEEP() <em>SWEEP</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSWEEP()
     * @generated
     * @ordered
     */
	protected Integer sweep = SWEEP_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GPARCImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getGPARC();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPOS() {
        return xpos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPOS(Integer newXPOS) {
        Integer oldXPOS = xpos;
        xpos = newXPOS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__XPOS, oldXPOS, xpos));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPOS() {
        return ypos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPOS(Integer newYPOS) {
        Integer oldYPOS = ypos;
        ypos = newYPOS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__YPOS, oldYPOS, ypos));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXCENT() {
        return xcent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXCENT(Integer newXCENT) {
        Integer oldXCENT = xcent;
        xcent = newXCENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__XCENT, oldXCENT, xcent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYCENT() {
        return ycent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYCENT(Integer newYCENT) {
        Integer oldYCENT = ycent;
        ycent = newYCENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__YCENT, oldYCENT, ycent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMH() {
        return mh;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMH(Integer newMH) {
        Integer oldMH = mh;
        mh = newMH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__MH, oldMH, mh));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMFR() {
        return mfr;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMFR(Integer newMFR) {
        Integer oldMFR = mfr;
        mfr = newMFR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__MFR, oldMFR, mfr));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSTART() {
        return start;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSTART(Integer newSTART) {
        Integer oldSTART = start;
        start = newSTART;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__START, oldSTART, start));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSWEEP() {
        return sweep;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSWEEP(Integer newSWEEP) {
        Integer oldSWEEP = sweep;
        sweep = newSWEEP;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GPARC__SWEEP, oldSWEEP, sweep));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.GPARC__XPOS:
                return getXPOS();
            case AfplibPackage.GPARC__YPOS:
                return getYPOS();
            case AfplibPackage.GPARC__XCENT:
                return getXCENT();
            case AfplibPackage.GPARC__YCENT:
                return getYCENT();
            case AfplibPackage.GPARC__MH:
                return getMH();
            case AfplibPackage.GPARC__MFR:
                return getMFR();
            case AfplibPackage.GPARC__START:
                return getSTART();
            case AfplibPackage.GPARC__SWEEP:
                return getSWEEP();
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
            case AfplibPackage.GPARC__XPOS:
                setXPOS((Integer)newValue);
                return;
            case AfplibPackage.GPARC__YPOS:
                setYPOS((Integer)newValue);
                return;
            case AfplibPackage.GPARC__XCENT:
                setXCENT((Integer)newValue);
                return;
            case AfplibPackage.GPARC__YCENT:
                setYCENT((Integer)newValue);
                return;
            case AfplibPackage.GPARC__MH:
                setMH((Integer)newValue);
                return;
            case AfplibPackage.GPARC__MFR:
                setMFR((Integer)newValue);
                return;
            case AfplibPackage.GPARC__START:
                setSTART((Integer)newValue);
                return;
            case AfplibPackage.GPARC__SWEEP:
                setSWEEP((Integer)newValue);
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
            case AfplibPackage.GPARC__XPOS:
                setXPOS(XPOS_EDEFAULT);
                return;
            case AfplibPackage.GPARC__YPOS:
                setYPOS(YPOS_EDEFAULT);
                return;
            case AfplibPackage.GPARC__XCENT:
                setXCENT(XCENT_EDEFAULT);
                return;
            case AfplibPackage.GPARC__YCENT:
                setYCENT(YCENT_EDEFAULT);
                return;
            case AfplibPackage.GPARC__MH:
                setMH(MH_EDEFAULT);
                return;
            case AfplibPackage.GPARC__MFR:
                setMFR(MFR_EDEFAULT);
                return;
            case AfplibPackage.GPARC__START:
                setSTART(START_EDEFAULT);
                return;
            case AfplibPackage.GPARC__SWEEP:
                setSWEEP(SWEEP_EDEFAULT);
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
            case AfplibPackage.GPARC__XPOS:
                return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
            case AfplibPackage.GPARC__YPOS:
                return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
            case AfplibPackage.GPARC__XCENT:
                return XCENT_EDEFAULT == null ? xcent != null : !XCENT_EDEFAULT.equals(xcent);
            case AfplibPackage.GPARC__YCENT:
                return YCENT_EDEFAULT == null ? ycent != null : !YCENT_EDEFAULT.equals(ycent);
            case AfplibPackage.GPARC__MH:
                return MH_EDEFAULT == null ? mh != null : !MH_EDEFAULT.equals(mh);
            case AfplibPackage.GPARC__MFR:
                return MFR_EDEFAULT == null ? mfr != null : !MFR_EDEFAULT.equals(mfr);
            case AfplibPackage.GPARC__START:
                return START_EDEFAULT == null ? start != null : !START_EDEFAULT.equals(start);
            case AfplibPackage.GPARC__SWEEP:
                return SWEEP_EDEFAULT == null ? sweep != null : !SWEEP_EDEFAULT.equals(sweep);
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
        result.append(" (XPOS: ");
        result.append(xpos);
        result.append(", YPOS: ");
        result.append(ypos);
        result.append(", XCENT: ");
        result.append(xcent);
        result.append(", YCENT: ");
        result.append(ycent);
        result.append(", MH: ");
        result.append(mh);
        result.append(", MFR: ");
        result.append(mfr);
        result.append(", START: ");
        result.append(start);
        result.append(", SWEEP: ");
        result.append(sweep);
        result.append(')');
        return result.toString();
    }

} //GPARCImpl
