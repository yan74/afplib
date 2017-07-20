/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectStructuredFieldOffset;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Structured Field Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectStructuredFieldOffsetImpl#getSFOff <em>SF Off</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectStructuredFieldOffsetImpl#getSFOffHi <em>SF Off Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectStructuredFieldOffsetImpl extends TripletImpl implements ObjectStructuredFieldOffset {
	/**
     * The default value of the '{@link #getSFOff() <em>SF Off</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFOff()
     * @generated
     * @ordered
     */
	protected static final Integer SF_OFF_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSFOff() <em>SF Off</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFOff()
     * @generated
     * @ordered
     */
	protected Integer sfOff = SF_OFF_EDEFAULT;

	/**
     * The default value of the '{@link #getSFOffHi() <em>SF Off Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFOffHi()
     * @generated
     * @ordered
     */
	protected static final Integer SF_OFF_HI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSFOffHi() <em>SF Off Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFOffHi()
     * @generated
     * @ordered
     */
	protected Integer sfOffHi = SF_OFF_HI_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ObjectStructuredFieldOffsetImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getObjectStructuredFieldOffset();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSFOff() {
        return sfOff;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSFOff(Integer newSFOff) {
        Integer oldSFOff = sfOff;
        sfOff = newSFOff;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF, oldSFOff, sfOff));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSFOffHi() {
        return sfOffHi;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSFOffHi(Integer newSFOffHi) {
        Integer oldSFOffHi = sfOffHi;
        sfOffHi = newSFOffHi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF_HI, oldSFOffHi, sfOffHi));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF:
                return getSFOff();
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF_HI:
                return getSFOffHi();
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF:
                setSFOff((Integer)newValue);
                return;
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF_HI:
                setSFOffHi((Integer)newValue);
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF:
                setSFOff(SF_OFF_EDEFAULT);
                return;
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF_HI:
                setSFOffHi(SF_OFF_HI_EDEFAULT);
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF:
                return SF_OFF_EDEFAULT == null ? sfOff != null : !SF_OFF_EDEFAULT.equals(sfOff);
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_OFFSET__SF_OFF_HI:
                return SF_OFF_HI_EDEFAULT == null ? sfOffHi != null : !SF_OFF_HI_EDEFAULT.equals(sfOffHi);
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
        result.append(" (SFOff: ");
        result.append(sfOff);
        result.append(", SFOffHi: ");
        result.append(sfOffHi);
        result.append(')');
        return result.toString();
    }

} //ObjectStructuredFieldOffsetImpl
