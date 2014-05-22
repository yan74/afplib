/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BGR;

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
 * An implementation of the model object '<em><b>BGR</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BGRImpl#getGdoName <em>Gdo Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BGRImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class BGRImpl extends SFImpl implements BGR {
	/**
	 * The default value of the '{@link #getGdoName() <em>Gdo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdoName()
	 * @generated
	 * @ordered
	 */
	protected static final String GDO_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGdoName() <em>Gdo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGdoName()
	 * @generated
	 * @ordered
	 */
	protected String gdoName = GDO_NAME_EDEFAULT;

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
	protected BGRImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getBGR();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGdoName() {
		return gdoName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGdoName(String newGdoName) {
		String oldGdoName = gdoName;
		gdoName = newGdoName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BGR__GDO_NAME, oldGdoName, gdoName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.BGR__TRIPLETS);
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
			case AfplibPackage.BGR__TRIPLETS:
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
			case AfplibPackage.BGR__GDO_NAME:
				return getGdoName();
			case AfplibPackage.BGR__TRIPLETS:
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
			case AfplibPackage.BGR__GDO_NAME:
				setGdoName((String)newValue);
				return;
			case AfplibPackage.BGR__TRIPLETS:
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
			case AfplibPackage.BGR__GDO_NAME:
				setGdoName(GDO_NAME_EDEFAULT);
				return;
			case AfplibPackage.BGR__TRIPLETS:
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
			case AfplibPackage.BGR__GDO_NAME:
				return GDO_NAME_EDEFAULT == null ? gdoName != null : !GDO_NAME_EDEFAULT.equals(gdoName);
			case AfplibPackage.BGR__TRIPLETS:
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
		result.append(" (GdoName: ");
		result.append(gdoName);
		result.append(')');
		return result.toString();
	}

} //BGRImpl
