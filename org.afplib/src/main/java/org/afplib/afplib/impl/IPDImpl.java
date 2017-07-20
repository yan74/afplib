/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IPD;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>IPD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IPDImpl#getIOCAdat <em>IOC Adat</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPDImpl#getImageData <em>Image Data</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPDImpl extends SFImpl implements IPD {
	/**
     * The default value of the '{@link #getIOCAdat() <em>IOC Adat</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIOCAdat()
     * @generated
     * @ordered
     */
	protected static final byte[] IOC_ADAT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIOCAdat() <em>IOC Adat</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIOCAdat()
     * @generated
     * @ordered
     */
	protected byte[] iocAdat = IOC_ADAT_EDEFAULT;

	/**
     * The default value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImageData()
     * @generated
     * @ordered
     */
	protected static final byte[] IMAGE_DATA_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getImageData() <em>Image Data</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getImageData()
     * @generated
     * @ordered
     */
	protected byte[] imageData = IMAGE_DATA_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected IPDImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getIPD();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getIOCAdat() {
        return iocAdat;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIOCAdat(byte[] newIOCAdat) {
        byte[] oldIOCAdat = iocAdat;
        iocAdat = newIOCAdat;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPD__IOC_ADAT, oldIOCAdat, iocAdat));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public byte[] getImageData() {
        return imageData;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setImageData(byte[] newImageData) {
        byte[] oldImageData = imageData;
        imageData = newImageData;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPD__IMAGE_DATA, oldImageData, imageData));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.IPD__IOC_ADAT:
                return getIOCAdat();
            case AfplibPackage.IPD__IMAGE_DATA:
                return getImageData();
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
            case AfplibPackage.IPD__IOC_ADAT:
                setIOCAdat((byte[])newValue);
                return;
            case AfplibPackage.IPD__IMAGE_DATA:
                setImageData((byte[])newValue);
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
            case AfplibPackage.IPD__IOC_ADAT:
                setIOCAdat(IOC_ADAT_EDEFAULT);
                return;
            case AfplibPackage.IPD__IMAGE_DATA:
                setImageData(IMAGE_DATA_EDEFAULT);
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
            case AfplibPackage.IPD__IOC_ADAT:
                return IOC_ADAT_EDEFAULT == null ? iocAdat != null : !IOC_ADAT_EDEFAULT.equals(iocAdat);
            case AfplibPackage.IPD__IMAGE_DATA:
                return IMAGE_DATA_EDEFAULT == null ? imageData != null : !IMAGE_DATA_EDEFAULT.equals(imageData);
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
        result.append(" (IOCAdat: ");
        result.append(iocAdat);
        result.append(", imageData: ");
        result.append(imageData);
        result.append(')');
        return result.toString();
    }

} //IPDImpl
