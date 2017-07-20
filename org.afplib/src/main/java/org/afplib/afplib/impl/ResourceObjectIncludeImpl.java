/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ResourceObjectInclude;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Resource Object Include</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectIncludeImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectIncludeImpl#getObjName <em>Obj Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectIncludeImpl#getXobjOset <em>Xobj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectIncludeImpl#getYobjOset <em>Yobj Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ResourceObjectIncludeImpl#getObOrent <em>Ob Orent</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ResourceObjectIncludeImpl extends TripletImpl implements ResourceObjectInclude {
	/**
     * The default value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjType()
     * @generated
     * @ordered
     */
	protected static final Integer OBJ_TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObjType() <em>Obj Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjType()
     * @generated
     * @ordered
     */
	protected Integer objType = OBJ_TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjName()
     * @generated
     * @ordered
     */
	protected static final String OBJ_NAME_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObjName() <em>Obj Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObjName()
     * @generated
     * @ordered
     */
	protected String objName = OBJ_NAME_EDEFAULT;

	/**
     * The default value of the '{@link #getXobjOset() <em>Xobj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXobjOset()
     * @generated
     * @ordered
     */
	protected static final Integer XOBJ_OSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXobjOset() <em>Xobj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXobjOset()
     * @generated
     * @ordered
     */
	protected Integer xobjOset = XOBJ_OSET_EDEFAULT;

	/**
     * The default value of the '{@link #getYobjOset() <em>Yobj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYobjOset()
     * @generated
     * @ordered
     */
	protected static final Integer YOBJ_OSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYobjOset() <em>Yobj Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYobjOset()
     * @generated
     * @ordered
     */
	protected Integer yobjOset = YOBJ_OSET_EDEFAULT;

	/**
     * The default value of the '{@link #getObOrent() <em>Ob Orent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObOrent()
     * @generated
     * @ordered
     */
	protected static final Integer OB_ORENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getObOrent() <em>Ob Orent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getObOrent()
     * @generated
     * @ordered
     */
	protected Integer obOrent = OB_ORENT_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected ResourceObjectIncludeImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getResourceObjectInclude();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getObjType() {
        return objType;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObjType(Integer newObjType) {
        Integer oldObjType = objType;
        objType = newObjType;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_TYPE, oldObjType, objType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getObjName() {
        return objName;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObjName(String newObjName) {
        String oldObjName = objName;
        objName = newObjName;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_NAME, oldObjName, objName));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXobjOset() {
        return xobjOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXobjOset(Integer newXobjOset) {
        Integer oldXobjOset = xobjOset;
        xobjOset = newXobjOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_INCLUDE__XOBJ_OSET, oldXobjOset, xobjOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYobjOset() {
        return yobjOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYobjOset(Integer newYobjOset) {
        Integer oldYobjOset = yobjOset;
        yobjOset = newYobjOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_INCLUDE__YOBJ_OSET, oldYobjOset, yobjOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getObOrent() {
        return obOrent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setObOrent(Integer newObOrent) {
        Integer oldObOrent = obOrent;
        obOrent = newObOrent;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RESOURCE_OBJECT_INCLUDE__OB_ORENT, oldObOrent, obOrent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_TYPE:
                return getObjType();
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_NAME:
                return getObjName();
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__XOBJ_OSET:
                return getXobjOset();
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__YOBJ_OSET:
                return getYobjOset();
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OB_ORENT:
                return getObOrent();
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
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_TYPE:
                setObjType((Integer)newValue);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_NAME:
                setObjName((String)newValue);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__XOBJ_OSET:
                setXobjOset((Integer)newValue);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__YOBJ_OSET:
                setYobjOset((Integer)newValue);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OB_ORENT:
                setObOrent((Integer)newValue);
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
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_TYPE:
                setObjType(OBJ_TYPE_EDEFAULT);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_NAME:
                setObjName(OBJ_NAME_EDEFAULT);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__XOBJ_OSET:
                setXobjOset(XOBJ_OSET_EDEFAULT);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__YOBJ_OSET:
                setYobjOset(YOBJ_OSET_EDEFAULT);
                return;
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OB_ORENT:
                setObOrent(OB_ORENT_EDEFAULT);
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
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_TYPE:
                return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OBJ_NAME:
                return OBJ_NAME_EDEFAULT == null ? objName != null : !OBJ_NAME_EDEFAULT.equals(objName);
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__XOBJ_OSET:
                return XOBJ_OSET_EDEFAULT == null ? xobjOset != null : !XOBJ_OSET_EDEFAULT.equals(xobjOset);
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__YOBJ_OSET:
                return YOBJ_OSET_EDEFAULT == null ? yobjOset != null : !YOBJ_OSET_EDEFAULT.equals(yobjOset);
            case AfplibPackage.RESOURCE_OBJECT_INCLUDE__OB_ORENT:
                return OB_ORENT_EDEFAULT == null ? obOrent != null : !OB_ORENT_EDEFAULT.equals(obOrent);
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
        result.append(" (ObjType: ");
        result.append(objType);
        result.append(", ObjName: ");
        result.append(objName);
        result.append(", XobjOset: ");
        result.append(xobjOset);
        result.append(", YobjOset: ");
        result.append(yobjOset);
        result.append(", ObOrent: ");
        result.append(obOrent);
        result.append(')');
        return result.toString();
    }

} //ResourceObjectIncludeImpl
