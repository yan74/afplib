/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNNRG2;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNNRG2</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNNRG2Impl#getTSIDLen <em>TSID Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNNRG2Impl#getTSID <em>TSID</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNNRG2Impl extends TripletImpl implements FNNRG2 {
	/**
     * The default value of the '{@link #getTSIDLen() <em>TSID Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSIDLen()
     * @generated
     * @ordered
     */
	protected static final Integer TSID_LEN_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTSIDLen() <em>TSID Len</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSIDLen()
     * @generated
     * @ordered
     */
	protected Integer tsidLen = TSID_LEN_EDEFAULT;

	/**
     * The default value of the '{@link #getTSID() <em>TSID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSID()
     * @generated
     * @ordered
     */
	protected static final byte[] TSID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTSID() <em>TSID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSID()
     * @generated
     * @ordered
     */
	protected byte[] tsid = TSID_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FNNRG2Impl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFNNRG2();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getTSIDLen() {
        return tsidLen;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTSIDLen(Integer newTSIDLen) {
        Integer oldTSIDLen = tsidLen;
        tsidLen = newTSIDLen;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNNRG2__TSID_LEN, oldTSIDLen, tsidLen));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getTSID() {
        return tsid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTSID(byte[] newTSID) {
        byte[] oldTSID = tsid;
        tsid = newTSID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNNRG2__TSID, oldTSID, tsid));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.FNNRG2__TSID_LEN:
                return getTSIDLen();
            case AfplibPackage.FNNRG2__TSID:
                return getTSID();
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
            case AfplibPackage.FNNRG2__TSID_LEN:
                setTSIDLen((Integer)newValue);
                return;
            case AfplibPackage.FNNRG2__TSID:
                setTSID((byte[])newValue);
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
            case AfplibPackage.FNNRG2__TSID_LEN:
                setTSIDLen(TSID_LEN_EDEFAULT);
                return;
            case AfplibPackage.FNNRG2__TSID:
                setTSID(TSID_EDEFAULT);
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
            case AfplibPackage.FNNRG2__TSID_LEN:
                return TSID_LEN_EDEFAULT == null ? tsidLen != null : !TSID_LEN_EDEFAULT.equals(tsidLen);
            case AfplibPackage.FNNRG2__TSID:
                return TSID_EDEFAULT == null ? tsid != null : !TSID_EDEFAULT.equals(tsid);
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
        result.append(" (TSIDLen: ");
        result.append(tsidLen);
        result.append(", TSID: ");
        result.append(tsid);
        result.append(')');
        return result.toString();
    }

} //FNNRG2Impl
