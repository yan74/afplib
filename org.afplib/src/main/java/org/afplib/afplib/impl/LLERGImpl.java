/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LLERG;

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
 * An implementation of the model object '<em><b>LLERG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LLERGImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LLERGImpl#getRGFunct <em>RG Funct</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LLERGImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LLERGImpl extends TripletImpl implements LLERG {
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
     * The default value of the '{@link #getRGFunct() <em>RG Funct</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRGFunct()
     * @generated
     * @ordered
     */
	protected static final Integer RG_FUNCT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRGFunct() <em>RG Funct</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRGFunct()
     * @generated
     * @ordered
     */
	protected Integer rgFunct = RG_FUNCT_EDEFAULT;

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
	protected LLERGImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getLLERG();
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LLERG__RG_LENGTH, oldRGLength, rgLength));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRGFunct() {
        return rgFunct;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRGFunct(Integer newRGFunct) {
        Integer oldRGFunct = rgFunct;
        rgFunct = newRGFunct;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LLERG__RG_FUNCT, oldRGFunct, rgFunct));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getTriplets() {
        if (triplets == null) {
            triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.LLERG__TRIPLETS);
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
            case AfplibPackage.LLERG__TRIPLETS:
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
            case AfplibPackage.LLERG__RG_LENGTH:
                return getRGLength();
            case AfplibPackage.LLERG__RG_FUNCT:
                return getRGFunct();
            case AfplibPackage.LLERG__TRIPLETS:
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
            case AfplibPackage.LLERG__RG_LENGTH:
                setRGLength((Integer)newValue);
                return;
            case AfplibPackage.LLERG__RG_FUNCT:
                setRGFunct((Integer)newValue);
                return;
            case AfplibPackage.LLERG__TRIPLETS:
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
            case AfplibPackage.LLERG__RG_LENGTH:
                setRGLength(RG_LENGTH_EDEFAULT);
                return;
            case AfplibPackage.LLERG__RG_FUNCT:
                setRGFunct(RG_FUNCT_EDEFAULT);
                return;
            case AfplibPackage.LLERG__TRIPLETS:
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
            case AfplibPackage.LLERG__RG_LENGTH:
                return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
            case AfplibPackage.LLERG__RG_FUNCT:
                return RG_FUNCT_EDEFAULT == null ? rgFunct != null : !RG_FUNCT_EDEFAULT.equals(rgFunct);
            case AfplibPackage.LLERG__TRIPLETS:
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
        result.append(", RGFunct: ");
        result.append(rgFunct);
        result.append(')');
        return result.toString();
    }

} //LLERGImpl
