/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PPORG;

import org.afplib.base.Triplet;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PPORG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getObjType <em>Obj Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getProcFlgs <em>Proc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getXocaOset <em>Xoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getYocaOset <em>Yoca Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PPORGImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PPORGImpl extends TripletImpl implements PPORG {
	/**
     * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRGLength()
     * @generated
     * @ordered
     */
	protected static final Integer RG_LENGTH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRGLength()
     * @generated
     * @ordered
     */
	protected Integer rgLength = RG_LENGTH_EDEFAULT;

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
     * The default value of the '{@link #getProcFlgs() <em>Proc Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcFlgs()
     * @generated
     * @ordered
     */
	protected static final Integer PROC_FLGS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getProcFlgs() <em>Proc Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getProcFlgs()
     * @generated
     * @ordered
     */
	protected Integer procFlgs = PROC_FLGS_EDEFAULT;

	/**
     * The default value of the '{@link #getXocaOset() <em>Xoca Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXocaOset()
     * @generated
     * @ordered
     */
	protected static final Integer XOCA_OSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXocaOset() <em>Xoca Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXocaOset()
     * @generated
     * @ordered
     */
	protected Integer xocaOset = XOCA_OSET_EDEFAULT;

	/**
     * The default value of the '{@link #getYocaOset() <em>Yoca Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYocaOset()
     * @generated
     * @ordered
     */
	protected static final Integer YOCA_OSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYocaOset() <em>Yoca Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYocaOset()
     * @generated
     * @ordered
     */
	protected Integer yocaOset = YOCA_OSET_EDEFAULT;

	/**
     * The cached value of the '{@link #getTriplets() <em>Triplets</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTriplets()
     * @generated
     * @ordered
     */
	protected EList<Triplet> triplets;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected PPORGImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getPPORG();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRGLength() {
        return rgLength;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRGLength(Integer newRGLength) {
        Integer oldRGLength = rgLength;
        rgLength = newRGLength;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PPORG__RG_LENGTH, oldRGLength, rgLength));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PPORG__OBJ_TYPE, oldObjType, objType));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getProcFlgs() {
        return procFlgs;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setProcFlgs(Integer newProcFlgs) {
        Integer oldProcFlgs = procFlgs;
        procFlgs = newProcFlgs;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PPORG__PROC_FLGS, oldProcFlgs, procFlgs));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXocaOset() {
        return xocaOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXocaOset(Integer newXocaOset) {
        Integer oldXocaOset = xocaOset;
        xocaOset = newXocaOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PPORG__XOCA_OSET, oldXocaOset, xocaOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYocaOset() {
        return yocaOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYocaOset(Integer newYocaOset) {
        Integer oldYocaOset = yocaOset;
        yocaOset = newYocaOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PPORG__YOCA_OSET, oldYocaOset, yocaOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getTriplets() {
        if (triplets == null) {
            triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.PPORG__TRIPLETS);
        }
        return triplets;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.PPORG__TRIPLETS:
                return ((InternalEList<?>)getTriplets()).basicRemove(otherEnd, msgs);
        }
        return super.eInverseRemove(otherEnd, featureID, msgs);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.PPORG__RG_LENGTH:
                return getRGLength();
            case AfplibPackage.PPORG__OBJ_TYPE:
                return getObjType();
            case AfplibPackage.PPORG__PROC_FLGS:
                return getProcFlgs();
            case AfplibPackage.PPORG__XOCA_OSET:
                return getXocaOset();
            case AfplibPackage.PPORG__YOCA_OSET:
                return getYocaOset();
            case AfplibPackage.PPORG__TRIPLETS:
                return getTriplets();
        }
        return super.eGet(featureID, resolve, coreType);
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
        switch (featureID) {
            case AfplibPackage.PPORG__RG_LENGTH:
                setRGLength((Integer)newValue);
                return;
            case AfplibPackage.PPORG__OBJ_TYPE:
                setObjType((Integer)newValue);
                return;
            case AfplibPackage.PPORG__PROC_FLGS:
                setProcFlgs((Integer)newValue);
                return;
            case AfplibPackage.PPORG__XOCA_OSET:
                setXocaOset((Integer)newValue);
                return;
            case AfplibPackage.PPORG__YOCA_OSET:
                setYocaOset((Integer)newValue);
                return;
            case AfplibPackage.PPORG__TRIPLETS:
                getTriplets().clear();
                getTriplets().addAll((Collection<? extends Triplet>)newValue);
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
            case AfplibPackage.PPORG__RG_LENGTH:
                setRGLength(RG_LENGTH_EDEFAULT);
                return;
            case AfplibPackage.PPORG__OBJ_TYPE:
                setObjType(OBJ_TYPE_EDEFAULT);
                return;
            case AfplibPackage.PPORG__PROC_FLGS:
                setProcFlgs(PROC_FLGS_EDEFAULT);
                return;
            case AfplibPackage.PPORG__XOCA_OSET:
                setXocaOset(XOCA_OSET_EDEFAULT);
                return;
            case AfplibPackage.PPORG__YOCA_OSET:
                setYocaOset(YOCA_OSET_EDEFAULT);
                return;
            case AfplibPackage.PPORG__TRIPLETS:
                getTriplets().clear();
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
            case AfplibPackage.PPORG__RG_LENGTH:
                return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
            case AfplibPackage.PPORG__OBJ_TYPE:
                return OBJ_TYPE_EDEFAULT == null ? objType != null : !OBJ_TYPE_EDEFAULT.equals(objType);
            case AfplibPackage.PPORG__PROC_FLGS:
                return PROC_FLGS_EDEFAULT == null ? procFlgs != null : !PROC_FLGS_EDEFAULT.equals(procFlgs);
            case AfplibPackage.PPORG__XOCA_OSET:
                return XOCA_OSET_EDEFAULT == null ? xocaOset != null : !XOCA_OSET_EDEFAULT.equals(xocaOset);
            case AfplibPackage.PPORG__YOCA_OSET:
                return YOCA_OSET_EDEFAULT == null ? yocaOset != null : !YOCA_OSET_EDEFAULT.equals(yocaOset);
            case AfplibPackage.PPORG__TRIPLETS:
                return triplets != null && !triplets.isEmpty();
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
        result.append(" (RGLength: ");
        result.append(rgLength);
        result.append(", ObjType: ");
        result.append(objType);
        result.append(", ProcFlgs: ");
        result.append(procFlgs);
        result.append(", XocaOset: ");
        result.append(xocaOset);
        result.append(", YocaOset: ");
        result.append(yocaOset);
        result.append(')');
        return result.toString();
    }

} //PPORGImpl
