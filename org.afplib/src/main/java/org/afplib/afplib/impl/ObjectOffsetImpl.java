/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectOffset;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Offset</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectOffsetImpl#getObjTpe <em>Obj Tpe</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectOffsetImpl#getObjOset <em>Obj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ObjectOffsetImpl#getObjOstHi <em>Obj Ost Hi</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectOffsetImpl extends TripletImpl implements ObjectOffset {
	/**
     * The default value of the '{@link #getObjTpe() <em>Obj Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjTpe()
     * @generated
     * @ordered
     */
	protected static final Integer OBJ_TPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObjTpe() <em>Obj Tpe</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjTpe()
     * @generated
     * @ordered
     */
	protected Integer objTpe = OBJ_TPE_EDEFAULT;

	/**
     * The default value of the '{@link #getObjOset() <em>Obj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjOset()
     * @generated
     * @ordered
     */
	protected static final Integer OBJ_OSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObjOset() <em>Obj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjOset()
     * @generated
     * @ordered
     */
	protected Integer objOset = OBJ_OSET_EDEFAULT;

	/**
     * The default value of the '{@link #getObjOstHi() <em>Obj Ost Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjOstHi()
     * @generated
     * @ordered
     */
	protected static final Integer OBJ_OST_HI_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObjOstHi() <em>Obj Ost Hi</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjOstHi()
     * @generated
     * @ordered
     */
	protected Integer objOstHi = OBJ_OST_HI_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ObjectOffsetImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getObjectOffset();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getObjTpe() {
        return objTpe;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObjTpe(Integer newObjTpe) {
        Integer oldObjTpe = objTpe;
        objTpe = newObjTpe;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_OFFSET__OBJ_TPE, oldObjTpe, objTpe));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getObjOset() {
        return objOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObjOset(Integer newObjOset) {
        Integer oldObjOset = objOset;
        objOset = newObjOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_OFFSET__OBJ_OSET, oldObjOset, objOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getObjOstHi() {
        return objOstHi;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObjOstHi(Integer newObjOstHi) {
        Integer oldObjOstHi = objOstHi;
        objOstHi = newObjOstHi;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_OFFSET__OBJ_OST_HI, oldObjOstHi, objOstHi));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.OBJECT_OFFSET__OBJ_TPE:
                return getObjTpe();
            case AfplibPackage.OBJECT_OFFSET__OBJ_OSET:
                return getObjOset();
            case AfplibPackage.OBJECT_OFFSET__OBJ_OST_HI:
                return getObjOstHi();
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
            case AfplibPackage.OBJECT_OFFSET__OBJ_TPE:
                setObjTpe((Integer)newValue);
                return;
            case AfplibPackage.OBJECT_OFFSET__OBJ_OSET:
                setObjOset((Integer)newValue);
                return;
            case AfplibPackage.OBJECT_OFFSET__OBJ_OST_HI:
                setObjOstHi((Integer)newValue);
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
            case AfplibPackage.OBJECT_OFFSET__OBJ_TPE:
                setObjTpe(OBJ_TPE_EDEFAULT);
                return;
            case AfplibPackage.OBJECT_OFFSET__OBJ_OSET:
                setObjOset(OBJ_OSET_EDEFAULT);
                return;
            case AfplibPackage.OBJECT_OFFSET__OBJ_OST_HI:
                setObjOstHi(OBJ_OST_HI_EDEFAULT);
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
            case AfplibPackage.OBJECT_OFFSET__OBJ_TPE:
                return OBJ_TPE_EDEFAULT == null ? objTpe != null : !OBJ_TPE_EDEFAULT.equals(objTpe);
            case AfplibPackage.OBJECT_OFFSET__OBJ_OSET:
                return OBJ_OSET_EDEFAULT == null ? objOset != null : !OBJ_OSET_EDEFAULT.equals(objOset);
            case AfplibPackage.OBJECT_OFFSET__OBJ_OST_HI:
                return OBJ_OST_HI_EDEFAULT == null ? objOstHi != null : !OBJ_OST_HI_EDEFAULT.equals(objOstHi);
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
        result.append(" (ObjTpe: ");
        result.append(objTpe);
        result.append(", ObjOset: ");
        result.append(objOset);
        result.append(", ObjOstHi: ");
        result.append(objOstHi);
        result.append(')');
        return result.toString();
    }

} //ObjectOffsetImpl
