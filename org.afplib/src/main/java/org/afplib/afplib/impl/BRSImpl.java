/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BRS;

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
 * An implementation of the model object '<em><b>BRS</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BRSImpl#getRSName <em>RS Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BRSImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BRSImpl extends SFImpl implements BRS {
	/**
	 * The default value of the '{@link #getRSName() <em>RS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSName()
	 * @generated
	 * @ordered
	 */
	protected static final String RS_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRSName() <em>RS Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRSName()
	 * @generated
	 * @ordered
	 */
	protected String rsName = RS_NAME_EDEFAULT;

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
	protected BRSImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getBRS();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRSName() {
		return rsName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRSName(String newRSName) {
		String oldRSName = rsName;
		rsName = newRSName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BRS__RS_NAME, oldRSName, rsName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.BRS__TRIPLETS);
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
			case AfplibPackage.BRS__TRIPLETS:
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
			case AfplibPackage.BRS__RS_NAME:
				return getRSName();
			case AfplibPackage.BRS__TRIPLETS:
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
			case AfplibPackage.BRS__RS_NAME:
				setRSName((String)newValue);
				return;
			case AfplibPackage.BRS__TRIPLETS:
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
			case AfplibPackage.BRS__RS_NAME:
				setRSName(RS_NAME_EDEFAULT);
				return;
			case AfplibPackage.BRS__TRIPLETS:
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
			case AfplibPackage.BRS__RS_NAME:
				return RS_NAME_EDEFAULT == null ? rsName != null : !RS_NAME_EDEFAULT.equals(rsName);
			case AfplibPackage.BRS__TRIPLETS:
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
		result.append(" (RSName: ");
		result.append(rsName);
		result.append(')');
		return result.toString();
	}

} //BRSImpl
