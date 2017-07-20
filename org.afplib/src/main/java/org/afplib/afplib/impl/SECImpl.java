/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.SEC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>SEC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLSPCE <em>COLSPCE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLSIZE1 <em>COLSIZE1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLSIZE2 <em>COLSIZE2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLSIZE3 <em>COLSIZE3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLSIZE4 <em>COLSIZE4</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SECImpl#getCOLVALUE <em>COLVALUE</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SECImpl extends TripletImpl implements SEC {
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
     * The default value of the '{@link #getCOLSPCE() <em>COLSPCE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSPCE()
     * @generated
     * @ordered
     */
	protected static final Integer COLSPCE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLSPCE() <em>COLSPCE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSPCE()
     * @generated
     * @ordered
     */
	protected Integer colspce = COLSPCE_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLSIZE1() <em>COLSIZE1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE1()
     * @generated
     * @ordered
     */
	protected static final Integer COLSIZE1_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLSIZE1() <em>COLSIZE1</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE1()
     * @generated
     * @ordered
     */
	protected Integer colsize1 = COLSIZE1_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLSIZE2() <em>COLSIZE2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE2()
     * @generated
     * @ordered
     */
	protected static final Integer COLSIZE2_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLSIZE2() <em>COLSIZE2</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE2()
     * @generated
     * @ordered
     */
	protected Integer colsize2 = COLSIZE2_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLSIZE3() <em>COLSIZE3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE3()
     * @generated
     * @ordered
     */
	protected static final Integer COLSIZE3_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLSIZE3() <em>COLSIZE3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE3()
     * @generated
     * @ordered
     */
	protected Integer colsize3 = COLSIZE3_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLSIZE4() <em>COLSIZE4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE4()
     * @generated
     * @ordered
     */
	protected static final Integer COLSIZE4_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLSIZE4() <em>COLSIZE4</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLSIZE4()
     * @generated
     * @ordered
     */
	protected Integer colsize4 = COLSIZE4_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLVALUE() <em>COLVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLVALUE()
     * @generated
     * @ordered
     */
	protected static final byte[] COLVALUE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLVALUE() <em>COLVALUE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLVALUE()
     * @generated
     * @ordered
     */
	protected byte[] colvalue = COLVALUE_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SECImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getSEC();
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__RESERVED, oldRESERVED, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLSPCE() {
        return colspce;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLSPCE(Integer newCOLSPCE) {
        Integer oldCOLSPCE = colspce;
        colspce = newCOLSPCE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLSPCE, oldCOLSPCE, colspce));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLSIZE1() {
        return colsize1;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLSIZE1(Integer newCOLSIZE1) {
        Integer oldCOLSIZE1 = colsize1;
        colsize1 = newCOLSIZE1;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLSIZE1, oldCOLSIZE1, colsize1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLSIZE2() {
        return colsize2;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLSIZE2(Integer newCOLSIZE2) {
        Integer oldCOLSIZE2 = colsize2;
        colsize2 = newCOLSIZE2;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLSIZE2, oldCOLSIZE2, colsize2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLSIZE3() {
        return colsize3;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLSIZE3(Integer newCOLSIZE3) {
        Integer oldCOLSIZE3 = colsize3;
        colsize3 = newCOLSIZE3;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLSIZE3, oldCOLSIZE3, colsize3));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLSIZE4() {
        return colsize4;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLSIZE4(Integer newCOLSIZE4) {
        Integer oldCOLSIZE4 = colsize4;
        colsize4 = newCOLSIZE4;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLSIZE4, oldCOLSIZE4, colsize4));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getCOLVALUE() {
        return colvalue;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLVALUE(byte[] newCOLVALUE) {
        byte[] oldCOLVALUE = colvalue;
        colvalue = newCOLVALUE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SEC__COLVALUE, oldCOLVALUE, colvalue));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.SEC__RESERVED:
                return getRESERVED();
            case AfplibPackage.SEC__COLSPCE:
                return getCOLSPCE();
            case AfplibPackage.SEC__COLSIZE1:
                return getCOLSIZE1();
            case AfplibPackage.SEC__COLSIZE2:
                return getCOLSIZE2();
            case AfplibPackage.SEC__COLSIZE3:
                return getCOLSIZE3();
            case AfplibPackage.SEC__COLSIZE4:
                return getCOLSIZE4();
            case AfplibPackage.SEC__COLVALUE:
                return getCOLVALUE();
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
            case AfplibPackage.SEC__RESERVED:
                setRESERVED((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLSPCE:
                setCOLSPCE((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLSIZE1:
                setCOLSIZE1((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLSIZE2:
                setCOLSIZE2((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLSIZE3:
                setCOLSIZE3((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLSIZE4:
                setCOLSIZE4((Integer)newValue);
                return;
            case AfplibPackage.SEC__COLVALUE:
                setCOLVALUE((byte[])newValue);
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
            case AfplibPackage.SEC__RESERVED:
                setRESERVED(RESERVED_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLSPCE:
                setCOLSPCE(COLSPCE_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLSIZE1:
                setCOLSIZE1(COLSIZE1_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLSIZE2:
                setCOLSIZE2(COLSIZE2_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLSIZE3:
                setCOLSIZE3(COLSIZE3_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLSIZE4:
                setCOLSIZE4(COLSIZE4_EDEFAULT);
                return;
            case AfplibPackage.SEC__COLVALUE:
                setCOLVALUE(COLVALUE_EDEFAULT);
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
            case AfplibPackage.SEC__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
            case AfplibPackage.SEC__COLSPCE:
                return COLSPCE_EDEFAULT == null ? colspce != null : !COLSPCE_EDEFAULT.equals(colspce);
            case AfplibPackage.SEC__COLSIZE1:
                return COLSIZE1_EDEFAULT == null ? colsize1 != null : !COLSIZE1_EDEFAULT.equals(colsize1);
            case AfplibPackage.SEC__COLSIZE2:
                return COLSIZE2_EDEFAULT == null ? colsize2 != null : !COLSIZE2_EDEFAULT.equals(colsize2);
            case AfplibPackage.SEC__COLSIZE3:
                return COLSIZE3_EDEFAULT == null ? colsize3 != null : !COLSIZE3_EDEFAULT.equals(colsize3);
            case AfplibPackage.SEC__COLSIZE4:
                return COLSIZE4_EDEFAULT == null ? colsize4 != null : !COLSIZE4_EDEFAULT.equals(colsize4);
            case AfplibPackage.SEC__COLVALUE:
                return COLVALUE_EDEFAULT == null ? colvalue != null : !COLVALUE_EDEFAULT.equals(colvalue);
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
        result.append(" (RESERVED: ");
        result.append(reserved);
        result.append(", COLSPCE: ");
        result.append(colspce);
        result.append(", COLSIZE1: ");
        result.append(colsize1);
        result.append(", COLSIZE2: ");
        result.append(colsize2);
        result.append(", COLSIZE3: ");
        result.append(colsize3);
        result.append(", COLSIZE4: ");
        result.append(colsize4);
        result.append(", COLVALUE: ");
        result.append(colvalue);
        result.append(')');
        return result.toString();
    }

} //SECImpl
