/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PTD1;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTD1</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getXPBASE <em>XPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getYPBASE <em>YPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getXPUNITVL <em>XPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getYPUNITVL <em>YPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getXPEXTENT <em>XPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getYPEXTENT <em>YPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTD1Impl#getRESERVED <em>RESERVED</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PTD1Impl extends SFImpl implements PTD1 {
	/**
     * The default value of the '{@link #getXPBASE() <em>XPBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPBASE()
     * @generated
     * @ordered
     */
	protected static final Integer XPBASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPBASE() <em>XPBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPBASE()
     * @generated
     * @ordered
     */
	protected Integer xpbase = XPBASE_EDEFAULT;

	/**
     * The default value of the '{@link #getYPBASE() <em>YPBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPBASE()
     * @generated
     * @ordered
     */
	protected static final Integer YPBASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPBASE() <em>YPBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPBASE()
     * @generated
     * @ordered
     */
	protected Integer ypbase = YPBASE_EDEFAULT;

	/**
     * The default value of the '{@link #getXPUNITVL() <em>XPUNITVL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPUNITVL()
     * @generated
     * @ordered
     */
	protected static final Integer XPUNITVL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPUNITVL() <em>XPUNITVL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPUNITVL()
     * @generated
     * @ordered
     */
	protected Integer xpunitvl = XPUNITVL_EDEFAULT;

	/**
     * The default value of the '{@link #getYPUNITVL() <em>YPUNITVL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPUNITVL()
     * @generated
     * @ordered
     */
	protected static final Integer YPUNITVL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPUNITVL() <em>YPUNITVL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPUNITVL()
     * @generated
     * @ordered
     */
	protected Integer ypunitvl = YPUNITVL_EDEFAULT;

	/**
     * The default value of the '{@link #getXPEXTENT() <em>XPEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPEXTENT()
     * @generated
     * @ordered
     */
	protected static final Integer XPEXTENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPEXTENT() <em>XPEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPEXTENT()
     * @generated
     * @ordered
     */
	protected Integer xpextent = XPEXTENT_EDEFAULT;

	/**
     * The default value of the '{@link #getYPEXTENT() <em>YPEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPEXTENT()
     * @generated
     * @ordered
     */
	protected static final Integer YPEXTENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPEXTENT() <em>YPEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPEXTENT()
     * @generated
     * @ordered
     */
	protected Integer ypextent = YPEXTENT_EDEFAULT;

	/**
     * The default value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRESERVED()
     * @generated
     * @ordered
     */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRESERVED()
     * @generated
     * @ordered
     */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PTD1Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getPTD1();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPBASE() {
        return xpbase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPBASE(Integer newXPBASE) {
        Integer oldXPBASE = xpbase;
        xpbase = newXPBASE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__XPBASE, oldXPBASE, xpbase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPBASE() {
        return ypbase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPBASE(Integer newYPBASE) {
        Integer oldYPBASE = ypbase;
        ypbase = newYPBASE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__YPBASE, oldYPBASE, ypbase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPUNITVL() {
        return xpunitvl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPUNITVL(Integer newXPUNITVL) {
        Integer oldXPUNITVL = xpunitvl;
        xpunitvl = newXPUNITVL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__XPUNITVL, oldXPUNITVL, xpunitvl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPUNITVL() {
        return ypunitvl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPUNITVL(Integer newYPUNITVL) {
        Integer oldYPUNITVL = ypunitvl;
        ypunitvl = newYPUNITVL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__YPUNITVL, oldYPUNITVL, ypunitvl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPEXTENT() {
        return xpextent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPEXTENT(Integer newXPEXTENT) {
        Integer oldXPEXTENT = xpextent;
        xpextent = newXPEXTENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__XPEXTENT, oldXPEXTENT, xpextent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPEXTENT() {
        return ypextent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPEXTENT(Integer newYPEXTENT) {
        Integer oldYPEXTENT = ypextent;
        ypextent = newYPEXTENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__YPEXTENT, oldYPEXTENT, ypextent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRESERVED() {
        return reserved;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRESERVED(Integer newRESERVED) {
        Integer oldRESERVED = reserved;
        reserved = newRESERVED;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD1__RESERVED, oldRESERVED, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.PTD1__XPBASE:
                return getXPBASE();
            case AfplibPackage.PTD1__YPBASE:
                return getYPBASE();
            case AfplibPackage.PTD1__XPUNITVL:
                return getXPUNITVL();
            case AfplibPackage.PTD1__YPUNITVL:
                return getYPUNITVL();
            case AfplibPackage.PTD1__XPEXTENT:
                return getXPEXTENT();
            case AfplibPackage.PTD1__YPEXTENT:
                return getYPEXTENT();
            case AfplibPackage.PTD1__RESERVED:
                return getRESERVED();
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
            case AfplibPackage.PTD1__XPBASE:
                setXPBASE((Integer)newValue);
                return;
            case AfplibPackage.PTD1__YPBASE:
                setYPBASE((Integer)newValue);
                return;
            case AfplibPackage.PTD1__XPUNITVL:
                setXPUNITVL((Integer)newValue);
                return;
            case AfplibPackage.PTD1__YPUNITVL:
                setYPUNITVL((Integer)newValue);
                return;
            case AfplibPackage.PTD1__XPEXTENT:
                setXPEXTENT((Integer)newValue);
                return;
            case AfplibPackage.PTD1__YPEXTENT:
                setYPEXTENT((Integer)newValue);
                return;
            case AfplibPackage.PTD1__RESERVED:
                setRESERVED((Integer)newValue);
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
            case AfplibPackage.PTD1__XPBASE:
                setXPBASE(XPBASE_EDEFAULT);
                return;
            case AfplibPackage.PTD1__YPBASE:
                setYPBASE(YPBASE_EDEFAULT);
                return;
            case AfplibPackage.PTD1__XPUNITVL:
                setXPUNITVL(XPUNITVL_EDEFAULT);
                return;
            case AfplibPackage.PTD1__YPUNITVL:
                setYPUNITVL(YPUNITVL_EDEFAULT);
                return;
            case AfplibPackage.PTD1__XPEXTENT:
                setXPEXTENT(XPEXTENT_EDEFAULT);
                return;
            case AfplibPackage.PTD1__YPEXTENT:
                setYPEXTENT(YPEXTENT_EDEFAULT);
                return;
            case AfplibPackage.PTD1__RESERVED:
                setRESERVED(RESERVED_EDEFAULT);
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
            case AfplibPackage.PTD1__XPBASE:
                return XPBASE_EDEFAULT == null ? xpbase != null : !XPBASE_EDEFAULT.equals(xpbase);
            case AfplibPackage.PTD1__YPBASE:
                return YPBASE_EDEFAULT == null ? ypbase != null : !YPBASE_EDEFAULT.equals(ypbase);
            case AfplibPackage.PTD1__XPUNITVL:
                return XPUNITVL_EDEFAULT == null ? xpunitvl != null : !XPUNITVL_EDEFAULT.equals(xpunitvl);
            case AfplibPackage.PTD1__YPUNITVL:
                return YPUNITVL_EDEFAULT == null ? ypunitvl != null : !YPUNITVL_EDEFAULT.equals(ypunitvl);
            case AfplibPackage.PTD1__XPEXTENT:
                return XPEXTENT_EDEFAULT == null ? xpextent != null : !XPEXTENT_EDEFAULT.equals(xpextent);
            case AfplibPackage.PTD1__YPEXTENT:
                return YPEXTENT_EDEFAULT == null ? ypextent != null : !YPEXTENT_EDEFAULT.equals(ypextent);
            case AfplibPackage.PTD1__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
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
        result.append(" (XPBASE: ");
        result.append(xpbase);
        result.append(", YPBASE: ");
        result.append(ypbase);
        result.append(", XPUNITVL: ");
        result.append(xpunitvl);
        result.append(", YPUNITVL: ");
        result.append(ypunitvl);
        result.append(", XPEXTENT: ");
        result.append(xpextent);
        result.append(", YPEXTENT: ");
        result.append(ypextent);
        result.append(", RESERVED: ");
        result.append(reserved);
        result.append(')');
        return result.toString();
    }

} //PTD1Impl
