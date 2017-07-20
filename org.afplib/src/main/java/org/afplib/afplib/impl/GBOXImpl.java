/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GBOX;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GBOX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getXPOS0 <em>XPOS0</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getYPOS0 <em>YPOS0</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getXPOS1 <em>XPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getYPOS1 <em>YPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getHAXIS <em>HAXIS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GBOXImpl#getVAXIS <em>VAXIS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GBOXImpl extends TripletImpl implements GBOX {
	/**
     * The default value of the '{@link #getRES() <em>RES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRES()
     * @generated
     * @ordered
     */
	protected static final Integer RES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRES() <em>RES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRES()
     * @generated
     * @ordered
     */
	protected Integer res = RES_EDEFAULT;

	/**
     * The default value of the '{@link #getXPOS0() <em>XPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS0()
     * @generated
     * @ordered
     */
	protected static final Integer XPOS0_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPOS0() <em>XPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS0()
     * @generated
     * @ordered
     */
	protected Integer xpos0 = XPOS0_EDEFAULT;

	/**
     * The default value of the '{@link #getYPOS0() <em>YPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS0()
     * @generated
     * @ordered
     */
	protected static final Integer YPOS0_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPOS0() <em>YPOS0</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS0()
     * @generated
     * @ordered
     */
	protected Integer ypos0 = YPOS0_EDEFAULT;

	/**
     * The default value of the '{@link #getXPOS1() <em>XPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS1()
     * @generated
     * @ordered
     */
	protected static final Integer XPOS1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPOS1() <em>XPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS1()
     * @generated
     * @ordered
     */
	protected Integer xpos1 = XPOS1_EDEFAULT;

	/**
     * The default value of the '{@link #getYPOS1() <em>YPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS1()
     * @generated
     * @ordered
     */
	protected static final Integer YPOS1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPOS1() <em>YPOS1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS1()
     * @generated
     * @ordered
     */
	protected Integer ypos1 = YPOS1_EDEFAULT;

	/**
     * The default value of the '{@link #getHAXIS() <em>HAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHAXIS()
     * @generated
     * @ordered
     */
	protected static final Integer HAXIS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getHAXIS() <em>HAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getHAXIS()
     * @generated
     * @ordered
     */
	protected Integer haxis = HAXIS_EDEFAULT;

	/**
     * The default value of the '{@link #getVAXIS() <em>VAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVAXIS()
     * @generated
     * @ordered
     */
	protected static final Integer VAXIS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getVAXIS() <em>VAXIS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getVAXIS()
     * @generated
     * @ordered
     */
	protected Integer vaxis = VAXIS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GBOXImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getGBOX();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRES() {
        return res;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRES(Integer newRES) {
        Integer oldRES = res;
        res = newRES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__RES, oldRES, res));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPOS0() {
        return xpos0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPOS0(Integer newXPOS0) {
        Integer oldXPOS0 = xpos0;
        xpos0 = newXPOS0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__XPOS0, oldXPOS0, xpos0));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPOS0() {
        return ypos0;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPOS0(Integer newYPOS0) {
        Integer oldYPOS0 = ypos0;
        ypos0 = newYPOS0;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__YPOS0, oldYPOS0, ypos0));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPOS1() {
        return xpos1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPOS1(Integer newXPOS1) {
        Integer oldXPOS1 = xpos1;
        xpos1 = newXPOS1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__XPOS1, oldXPOS1, xpos1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPOS1() {
        return ypos1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPOS1(Integer newYPOS1) {
        Integer oldYPOS1 = ypos1;
        ypos1 = newYPOS1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__YPOS1, oldYPOS1, ypos1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getHAXIS() {
        return haxis;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setHAXIS(Integer newHAXIS) {
        Integer oldHAXIS = haxis;
        haxis = newHAXIS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__HAXIS, oldHAXIS, haxis));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getVAXIS() {
        return vaxis;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setVAXIS(Integer newVAXIS) {
        Integer oldVAXIS = vaxis;
        vaxis = newVAXIS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GBOX__VAXIS, oldVAXIS, vaxis));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.GBOX__RES:
                return getRES();
            case AfplibPackage.GBOX__XPOS0:
                return getXPOS0();
            case AfplibPackage.GBOX__YPOS0:
                return getYPOS0();
            case AfplibPackage.GBOX__XPOS1:
                return getXPOS1();
            case AfplibPackage.GBOX__YPOS1:
                return getYPOS1();
            case AfplibPackage.GBOX__HAXIS:
                return getHAXIS();
            case AfplibPackage.GBOX__VAXIS:
                return getVAXIS();
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
            case AfplibPackage.GBOX__RES:
                setRES((Integer)newValue);
                return;
            case AfplibPackage.GBOX__XPOS0:
                setXPOS0((Integer)newValue);
                return;
            case AfplibPackage.GBOX__YPOS0:
                setYPOS0((Integer)newValue);
                return;
            case AfplibPackage.GBOX__XPOS1:
                setXPOS1((Integer)newValue);
                return;
            case AfplibPackage.GBOX__YPOS1:
                setYPOS1((Integer)newValue);
                return;
            case AfplibPackage.GBOX__HAXIS:
                setHAXIS((Integer)newValue);
                return;
            case AfplibPackage.GBOX__VAXIS:
                setVAXIS((Integer)newValue);
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
            case AfplibPackage.GBOX__RES:
                setRES(RES_EDEFAULT);
                return;
            case AfplibPackage.GBOX__XPOS0:
                setXPOS0(XPOS0_EDEFAULT);
                return;
            case AfplibPackage.GBOX__YPOS0:
                setYPOS0(YPOS0_EDEFAULT);
                return;
            case AfplibPackage.GBOX__XPOS1:
                setXPOS1(XPOS1_EDEFAULT);
                return;
            case AfplibPackage.GBOX__YPOS1:
                setYPOS1(YPOS1_EDEFAULT);
                return;
            case AfplibPackage.GBOX__HAXIS:
                setHAXIS(HAXIS_EDEFAULT);
                return;
            case AfplibPackage.GBOX__VAXIS:
                setVAXIS(VAXIS_EDEFAULT);
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
            case AfplibPackage.GBOX__RES:
                return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
            case AfplibPackage.GBOX__XPOS0:
                return XPOS0_EDEFAULT == null ? xpos0 != null : !XPOS0_EDEFAULT.equals(xpos0);
            case AfplibPackage.GBOX__YPOS0:
                return YPOS0_EDEFAULT == null ? ypos0 != null : !YPOS0_EDEFAULT.equals(ypos0);
            case AfplibPackage.GBOX__XPOS1:
                return XPOS1_EDEFAULT == null ? xpos1 != null : !XPOS1_EDEFAULT.equals(xpos1);
            case AfplibPackage.GBOX__YPOS1:
                return YPOS1_EDEFAULT == null ? ypos1 != null : !YPOS1_EDEFAULT.equals(ypos1);
            case AfplibPackage.GBOX__HAXIS:
                return HAXIS_EDEFAULT == null ? haxis != null : !HAXIS_EDEFAULT.equals(haxis);
            case AfplibPackage.GBOX__VAXIS:
                return VAXIS_EDEFAULT == null ? vaxis != null : !VAXIS_EDEFAULT.equals(vaxis);
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
        result.append(" (RES: ");
        result.append(res);
        result.append(", XPOS0: ");
        result.append(xpos0);
        result.append(", YPOS0: ");
        result.append(ypos0);
        result.append(", XPOS1: ");
        result.append(xpos1);
        result.append(", YPOS1: ");
        result.append(ypos1);
        result.append(", HAXIS: ");
        result.append(haxis);
        result.append(", VAXIS: ");
        result.append(vaxis);
        result.append(')');
        return result.toString();
    }

} //GBOXImpl
