/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectByteExtent;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Byte Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectByteExtentImpl#getByteExt <em>Byte Ext</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectByteExtentImpl#getByteExtHi <em>Byte Ext Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectByteExtentImpl extends TripletImpl implements ObjectByteExtent {
	/**
     * The default value of the '{@link #getByteExt() <em>Byte Ext</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getByteExt()
     * @generated
     * @ordered
     */
	protected static final Integer BYTE_EXT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getByteExt() <em>Byte Ext</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getByteExt()
     * @generated
     * @ordered
     */
	protected Integer byteExt = BYTE_EXT_EDEFAULT;

	/**
     * The default value of the '{@link #getByteExtHi() <em>Byte Ext Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getByteExtHi()
     * @generated
     * @ordered
     */
	protected static final Integer BYTE_EXT_HI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getByteExtHi() <em>Byte Ext Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getByteExtHi()
     * @generated
     * @ordered
     */
	protected Integer byteExtHi = BYTE_EXT_HI_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ObjectByteExtentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getObjectByteExtent();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getByteExt() {
        return byteExt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setByteExt(Integer newByteExt) {
        Integer oldByteExt = byteExt;
        byteExt = newByteExt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT, oldByteExt, byteExt));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getByteExtHi() {
        return byteExtHi;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setByteExtHi(Integer newByteExtHi) {
        Integer oldByteExtHi = byteExtHi;
        byteExtHi = newByteExtHi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT_HI, oldByteExtHi, byteExtHi));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT:
                return getByteExt();
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT_HI:
                return getByteExtHi();
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
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT:
                setByteExt((Integer)newValue);
                return;
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT_HI:
                setByteExtHi((Integer)newValue);
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
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT:
                setByteExt(BYTE_EXT_EDEFAULT);
                return;
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT_HI:
                setByteExtHi(BYTE_EXT_HI_EDEFAULT);
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
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT:
                return BYTE_EXT_EDEFAULT == null ? byteExt != null : !BYTE_EXT_EDEFAULT.equals(byteExt);
            case AfplibPackage.OBJECT_BYTE_EXTENT__BYTE_EXT_HI:
                return BYTE_EXT_HI_EDEFAULT == null ? byteExtHi != null : !BYTE_EXT_HI_EDEFAULT.equals(byteExtHi);
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
        result.append(" (ByteExt: ");
        result.append(byteExt);
        result.append(", ByteExtHi: ");
        result.append(byteExtHi);
        result.append(')');
        return result.toString();
    }

} //ObjectByteExtentImpl
