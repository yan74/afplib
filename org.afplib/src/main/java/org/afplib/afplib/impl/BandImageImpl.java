/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BandImage;
import org.afplib.afplib.BandImageRG;

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
 * An implementation of the model object '<em><b>Band Image</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BandImageImpl#getBCOUNT <em>BCOUNT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BandImageImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BandImageImpl extends TripletImpl implements BandImage {
	/**
     * The default value of the '{@link #getBCOUNT() <em>BCOUNT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBCOUNT()
     * @generated
     * @ordered
     */
	protected static final Integer BCOUNT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getBCOUNT() <em>BCOUNT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getBCOUNT()
     * @generated
     * @ordered
     */
	protected Integer bcount = BCOUNT_EDEFAULT;

	/**
     * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRg()
     * @generated
     * @ordered
     */
	protected EList<BandImageRG> rg;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BandImageImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getBandImage();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getBCOUNT() {
        return bcount;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setBCOUNT(Integer newBCOUNT) {
        Integer oldBCOUNT = bcount;
        bcount = newBCOUNT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BAND_IMAGE__BCOUNT, oldBCOUNT, bcount));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<BandImageRG> getRg() {
        if (rg == null) {
            rg = new EObjectContainmentEList.Resolving<BandImageRG>(BandImageRG.class, this, AfplibPackage.BAND_IMAGE__RG);
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
            case AfplibPackage.BAND_IMAGE__RG:
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
            case AfplibPackage.BAND_IMAGE__BCOUNT:
                return getBCOUNT();
            case AfplibPackage.BAND_IMAGE__RG:
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
            case AfplibPackage.BAND_IMAGE__BCOUNT:
                setBCOUNT((Integer)newValue);
                return;
            case AfplibPackage.BAND_IMAGE__RG:
                getRg().clear();
                getRg().addAll((Collection<? extends BandImageRG>)newValue);
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
            case AfplibPackage.BAND_IMAGE__BCOUNT:
                setBCOUNT(BCOUNT_EDEFAULT);
                return;
            case AfplibPackage.BAND_IMAGE__RG:
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
            case AfplibPackage.BAND_IMAGE__BCOUNT:
                return BCOUNT_EDEFAULT == null ? bcount != null : !BCOUNT_EDEFAULT.equals(bcount);
            case AfplibPackage.BAND_IMAGE__RG:
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
        result.append(" (BCOUNT: ");
        result.append(bcount);
        result.append(')');
        return result.toString();
    }

} //BandImageImpl
