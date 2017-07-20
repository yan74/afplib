/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GFARC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GFARC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GFARCImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GFARCImpl#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GFARCImpl#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GFARCImpl#getMFR <em>MFR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GFARCImpl extends TripletImpl implements GFARC {
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
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GFARCImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getGFARC();
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GFARC__XPOS, oldXPOS, xpos));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GFARC__YPOS, oldYPOS, ypos));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GFARC__MH, oldMH, mh));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GFARC__MFR, oldMFR, mfr));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.GFARC__XPOS:
                return getXPOS();
            case AfplibPackage.GFARC__YPOS:
                return getYPOS();
            case AfplibPackage.GFARC__MH:
                return getMH();
            case AfplibPackage.GFARC__MFR:
                return getMFR();
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
            case AfplibPackage.GFARC__XPOS:
                setXPOS((Integer)newValue);
                return;
            case AfplibPackage.GFARC__YPOS:
                setYPOS((Integer)newValue);
                return;
            case AfplibPackage.GFARC__MH:
                setMH((Integer)newValue);
                return;
            case AfplibPackage.GFARC__MFR:
                setMFR((Integer)newValue);
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
            case AfplibPackage.GFARC__XPOS:
                setXPOS(XPOS_EDEFAULT);
                return;
            case AfplibPackage.GFARC__YPOS:
                setYPOS(YPOS_EDEFAULT);
                return;
            case AfplibPackage.GFARC__MH:
                setMH(MH_EDEFAULT);
                return;
            case AfplibPackage.GFARC__MFR:
                setMFR(MFR_EDEFAULT);
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
            case AfplibPackage.GFARC__XPOS:
                return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
            case AfplibPackage.GFARC__YPOS:
                return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
            case AfplibPackage.GFARC__MH:
                return MH_EDEFAULT == null ? mh != null : !MH_EDEFAULT.equals(mh);
            case AfplibPackage.GFARC__MFR:
                return MFR_EDEFAULT == null ? mfr != null : !MFR_EDEFAULT.equals(mfr);
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
        result.append(", MH: ");
        result.append(mh);
        result.append(", MFR: ");
        result.append(mfr);
        result.append(')');
        return result.toString();
    }

} //GFARCImpl
