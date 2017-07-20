/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectStructuredFieldExtent;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Structured Field Extent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectStructuredFieldExtentImpl#getSFExt <em>SF Ext</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectStructuredFieldExtentImpl#getSFExtHi <em>SF Ext Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectStructuredFieldExtentImpl extends TripletImpl implements ObjectStructuredFieldExtent {
	/**
     * The default value of the '{@link #getSFExt() <em>SF Ext</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFExt()
     * @generated
     * @ordered
     */
	protected static final Integer SF_EXT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSFExt() <em>SF Ext</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFExt()
     * @generated
     * @ordered
     */
	protected Integer sfExt = SF_EXT_EDEFAULT;

	/**
     * The default value of the '{@link #getSFExtHi() <em>SF Ext Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFExtHi()
     * @generated
     * @ordered
     */
	protected static final Integer SF_EXT_HI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSFExtHi() <em>SF Ext Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSFExtHi()
     * @generated
     * @ordered
     */
	protected Integer sfExtHi = SF_EXT_HI_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ObjectStructuredFieldExtentImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getObjectStructuredFieldExtent();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSFExt() {
        return sfExt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSFExt(Integer newSFExt) {
        Integer oldSFExt = sfExt;
        sfExt = newSFExt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT, oldSFExt, sfExt));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSFExtHi() {
        return sfExtHi;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSFExtHi(Integer newSFExtHi) {
        Integer oldSFExtHi = sfExtHi;
        sfExtHi = newSFExtHi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT_HI, oldSFExtHi, sfExtHi));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT:
                return getSFExt();
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT_HI:
                return getSFExtHi();
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT:
                setSFExt((Integer)newValue);
                return;
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT_HI:
                setSFExtHi((Integer)newValue);
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT:
                setSFExt(SF_EXT_EDEFAULT);
                return;
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT_HI:
                setSFExtHi(SF_EXT_HI_EDEFAULT);
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
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT:
                return SF_EXT_EDEFAULT == null ? sfExt != null : !SF_EXT_EDEFAULT.equals(sfExt);
            case AfplibPackage.OBJECT_STRUCTURED_FIELD_EXTENT__SF_EXT_HI:
                return SF_EXT_HI_EDEFAULT == null ? sfExtHi != null : !SF_EXT_HI_EDEFAULT.equals(sfExtHi);
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
        result.append(" (SFExt: ");
        result.append(sfExt);
        result.append(", SFExtHi: ");
        result.append(sfExtHi);
        result.append(')');
        return result.toString();
    }

} //ObjectStructuredFieldExtentImpl
