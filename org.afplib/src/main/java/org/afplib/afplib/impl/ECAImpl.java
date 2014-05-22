/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ECA;

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
 * An implementation of the model object '<em><b>ECA</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ECAImpl#getCATName <em>CAT Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.ECAImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class ECAImpl extends SFImpl implements ECA {
	/**
	 * The default value of the '{@link #getCATName() <em>CAT Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATName()
	 * @generated
	 * @ordered
	 */
	protected static final String CAT_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCATName() <em>CAT Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCATName()
	 * @generated
	 * @ordered
	 */
	protected String catName = CAT_NAME_EDEFAULT;

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
	protected ECAImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getECA();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCATName() {
		return catName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCATName(String newCATName) {
		String oldCATName = catName;
		catName = newCATName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ECA__CAT_NAME, oldCATName, catName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.ECA__TRIPLETS);
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
			case AfplibPackage.ECA__TRIPLETS:
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
			case AfplibPackage.ECA__CAT_NAME:
				return getCATName();
			case AfplibPackage.ECA__TRIPLETS:
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
			case AfplibPackage.ECA__CAT_NAME:
				setCATName((String)newValue);
				return;
			case AfplibPackage.ECA__TRIPLETS:
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
			case AfplibPackage.ECA__CAT_NAME:
				setCATName(CAT_NAME_EDEFAULT);
				return;
			case AfplibPackage.ECA__TRIPLETS:
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
			case AfplibPackage.ECA__CAT_NAME:
				return CAT_NAME_EDEFAULT == null ? catName != null : !CAT_NAME_EDEFAULT.equals(catName);
			case AfplibPackage.ECA__TRIPLETS:
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
		result.append(" (CATName: ");
		result.append(catName);
		result.append(')');
		return result.toString();
	}

} //ECAImpl
