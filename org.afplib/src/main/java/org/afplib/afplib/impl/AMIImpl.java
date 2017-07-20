/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AMI;
import org.afplib.afplib.AfplibPackage;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>AMI</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.AMIImpl#getDSPLCMNT <em>DSPLCMNT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AMIImpl extends TripletImpl implements AMI {
	/**
     * The default value of the '{@link #getDSPLCMNT() <em>DSPLCMNT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDSPLCMNT()
     * @generated
     * @ordered
     */
	protected static final Integer DSPLCMNT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDSPLCMNT() <em>DSPLCMNT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDSPLCMNT()
     * @generated
     * @ordered
     */
	protected Integer dsplcmnt = DSPLCMNT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AMIImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getAMI();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDSPLCMNT() {
        return dsplcmnt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDSPLCMNT(Integer newDSPLCMNT) {
        Integer oldDSPLCMNT = dsplcmnt;
        dsplcmnt = newDSPLCMNT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.AMI__DSPLCMNT, oldDSPLCMNT, dsplcmnt));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.AMI__DSPLCMNT:
                return getDSPLCMNT();
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
            case AfplibPackage.AMI__DSPLCMNT:
                setDSPLCMNT((Integer)newValue);
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
            case AfplibPackage.AMI__DSPLCMNT:
                setDSPLCMNT(DSPLCMNT_EDEFAULT);
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
            case AfplibPackage.AMI__DSPLCMNT:
                return DSPLCMNT_EDEFAULT == null ? dsplcmnt != null : !DSPLCMNT_EDEFAULT.equals(dsplcmnt);
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
        result.append(" (DSPLCMNT: ");
        result.append(dsplcmnt);
        result.append(')');
        return result.toString();
    }

} //AMIImpl
