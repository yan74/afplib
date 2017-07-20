/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TileTOC;
import org.afplib.afplib.TileTOCRG;

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
 * An implementation of the model object '<em><b>Tile TOC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TileTOCImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileTOCImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TileTOCImpl extends TripletImpl implements TileTOC {
	/**
     * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getReserved()
     * @generated
     * @ordered
     */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
     * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRg()
     * @generated
     * @ordered
     */
	protected EList<TileTOCRG> rg;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected TileTOCImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getTileTOC();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getReserved() {
        return reserved;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setReserved(Integer newReserved) {
        Integer oldReserved = reserved;
        reserved = newReserved;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_TOC__RESERVED, oldReserved, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<TileTOCRG> getRg() {
        if (rg == null) {
            rg = new EObjectContainmentEList.Resolving<TileTOCRG>(TileTOCRG.class, this, AfplibPackage.TILE_TOC__RG);
        }
        return rg;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.TILE_TOC__RG:
                return ((InternalEList<?>)getRg()).basicRemove(otherEnd, msgs);
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
            case AfplibPackage.TILE_TOC__RESERVED:
                return getReserved();
            case AfplibPackage.TILE_TOC__RG:
                return getRg();
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
            case AfplibPackage.TILE_TOC__RESERVED:
                setReserved((Integer)newValue);
                return;
            case AfplibPackage.TILE_TOC__RG:
                getRg().clear();
                getRg().addAll((Collection<? extends TileTOCRG>)newValue);
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
            case AfplibPackage.TILE_TOC__RESERVED:
                setReserved(RESERVED_EDEFAULT);
                return;
            case AfplibPackage.TILE_TOC__RG:
                getRg().clear();
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
            case AfplibPackage.TILE_TOC__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
            case AfplibPackage.TILE_TOC__RG:
                return rg != null && !rg.isEmpty();
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
        result.append(" (Reserved: ");
        result.append(reserved);
        result.append(')');
        return result.toString();
    }

} //TileTOCImpl
