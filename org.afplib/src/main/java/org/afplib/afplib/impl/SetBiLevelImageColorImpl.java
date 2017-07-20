/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.SetBiLevelImageColor;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Set Bi Level Image Color</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.SetBiLevelImageColorImpl#getAREA <em>AREA</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SetBiLevelImageColorImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.SetBiLevelImageColorImpl#getNAMECOLR <em>NAMECOLR</em>}</li>
 * </ul>
 *
 * @generated
 */
public class SetBiLevelImageColorImpl extends TripletImpl implements SetBiLevelImageColor {
	/**
     * The default value of the '{@link #getAREA() <em>AREA</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAREA()
     * @generated
     * @ordered
     */
	protected static final Integer AREA_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getAREA() <em>AREA</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getAREA()
     * @generated
     * @ordered
     */
	protected Integer area = AREA_EDEFAULT;

	/**
     * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
     * The default value of the '{@link #getNAMECOLR() <em>NAMECOLR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNAMECOLR()
     * @generated
     * @ordered
     */
	protected static final Integer NAMECOLR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getNAMECOLR() <em>NAMECOLR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNAMECOLR()
     * @generated
     * @ordered
     */
	protected Integer namecolr = NAMECOLR_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected SetBiLevelImageColorImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getSetBiLevelImageColor();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getAREA() {
        return area;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setAREA(Integer newAREA) {
        Integer oldAREA = area;
        area = newAREA;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__AREA, oldAREA, area));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getReserved() {
        return reserved;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReserved(byte[] newReserved) {
        byte[] oldReserved = reserved;
        reserved = newReserved;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__RESERVED, oldReserved, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getNAMECOLR() {
        return namecolr;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNAMECOLR(Integer newNAMECOLR) {
        Integer oldNAMECOLR = namecolr;
        namecolr = newNAMECOLR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__NAMECOLR, oldNAMECOLR, namecolr));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__AREA:
                return getAREA();
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__RESERVED:
                return getReserved();
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__NAMECOLR:
                return getNAMECOLR();
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
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__AREA:
                setAREA((Integer)newValue);
                return;
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__RESERVED:
                setReserved((byte[])newValue);
                return;
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__NAMECOLR:
                setNAMECOLR((Integer)newValue);
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
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__AREA:
                setAREA(AREA_EDEFAULT);
                return;
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__RESERVED:
                setReserved(RESERVED_EDEFAULT);
                return;
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__NAMECOLR:
                setNAMECOLR(NAMECOLR_EDEFAULT);
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
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__AREA:
                return AREA_EDEFAULT == null ? area != null : !AREA_EDEFAULT.equals(area);
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
            case AfplibPackage.SET_BI_LEVEL_IMAGE_COLOR__NAMECOLR:
                return NAMECOLR_EDEFAULT == null ? namecolr != null : !NAMECOLR_EDEFAULT.equals(namecolr);
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
        result.append(" (AREA: ");
        result.append(area);
        result.append(", Reserved: ");
        result.append(reserved);
        result.append(", NAMECOLR: ");
        result.append(namecolr);
        result.append(')');
        return result.toString();
    }

} //SetBiLevelImageColorImpl
