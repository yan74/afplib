/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TonerSaver;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Toner Saver</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TonerSaverImpl#getTSvCtrl <em>TSv Ctrl</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TonerSaverImpl extends TripletImpl implements TonerSaver {
	/**
     * The default value of the '{@link #getTSvCtrl() <em>TSv Ctrl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSvCtrl()
     * @generated
     * @ordered
     */
	protected static final Integer TSV_CTRL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTSvCtrl() <em>TSv Ctrl</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTSvCtrl()
     * @generated
     * @ordered
     */
	protected Integer tSvCtrl = TSV_CTRL_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TonerSaverImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getTonerSaver();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getTSvCtrl() {
        return tSvCtrl;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTSvCtrl(Integer newTSvCtrl) {
        Integer oldTSvCtrl = tSvCtrl;
        tSvCtrl = newTSvCtrl;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TONER_SAVER__TSV_CTRL, oldTSvCtrl, tSvCtrl));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.TONER_SAVER__TSV_CTRL:
                return getTSvCtrl();
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
            case AfplibPackage.TONER_SAVER__TSV_CTRL:
                setTSvCtrl((Integer)newValue);
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
            case AfplibPackage.TONER_SAVER__TSV_CTRL:
                setTSvCtrl(TSV_CTRL_EDEFAULT);
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
            case AfplibPackage.TONER_SAVER__TSV_CTRL:
                return TSV_CTRL_EDEFAULT == null ? tSvCtrl != null : !TSV_CTRL_EDEFAULT.equals(tSvCtrl);
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
        result.append(" (TSvCtrl: ");
        result.append(tSvCtrl);
        result.append(')');
        return result.toString();
    }

} //TonerSaverImpl
