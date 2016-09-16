/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CFC;

import org.afplib.base.Triplet;

import org.afplib.base.impl.SFImpl;

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
 * An implementation of the model object '<em><b>CFC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CFCImpl#getCFIRGLen <em>CFIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFCImpl#getRetired1 <em>Retired1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CFCImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CFCImpl extends SFImpl implements CFC {
	/**
	 * The default value of the '{@link #getCFIRGLen() <em>CFIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFIRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CFIRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCFIRGLen() <em>CFIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCFIRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer cfirgLen = CFIRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRetired1() <em>Retired1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETIRED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetired1() <em>Retired1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired1()
	 * @generated
	 * @ordered
	 */
	protected Integer retired1 = RETIRED1_EDEFAULT;

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
	protected CFCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getCFC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCFIRGLen() {
		return cfirgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCFIRGLen(Integer newCFIRGLen) {
		Integer oldCFIRGLen = cfirgLen;
		cfirgLen = newCFIRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFC__CFIRG_LEN, oldCFIRGLen, cfirgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRetired1() {
		return retired1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetired1(Integer newRetired1) {
		Integer oldRetired1 = retired1;
		retired1 = newRetired1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CFC__RETIRED1, oldRetired1, retired1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.CFC__TRIPLETS);
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
			case AfplibPackage.CFC__TRIPLETS:
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
			case AfplibPackage.CFC__CFIRG_LEN:
				return getCFIRGLen();
			case AfplibPackage.CFC__RETIRED1:
				return getRetired1();
			case AfplibPackage.CFC__TRIPLETS:
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
			case AfplibPackage.CFC__CFIRG_LEN:
				setCFIRGLen((Integer)newValue);
				return;
			case AfplibPackage.CFC__RETIRED1:
				setRetired1((Integer)newValue);
				return;
			case AfplibPackage.CFC__TRIPLETS:
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
			case AfplibPackage.CFC__CFIRG_LEN:
				setCFIRGLen(CFIRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.CFC__RETIRED1:
				setRetired1(RETIRED1_EDEFAULT);
				return;
			case AfplibPackage.CFC__TRIPLETS:
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
			case AfplibPackage.CFC__CFIRG_LEN:
				return CFIRG_LEN_EDEFAULT == null ? cfirgLen != null : !CFIRG_LEN_EDEFAULT.equals(cfirgLen);
			case AfplibPackage.CFC__RETIRED1:
				return RETIRED1_EDEFAULT == null ? retired1 != null : !RETIRED1_EDEFAULT.equals(retired1);
			case AfplibPackage.CFC__TRIPLETS:
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
		result.append(" (CFIRGLen: ");
		result.append(cfirgLen);
		result.append(", Retired1: ");
		result.append(retired1);
		result.append(')');
		return result.toString();
	}

} //CFCImpl
