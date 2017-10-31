/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IPO;

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
 * An implementation of the model object '<em><b>IPO</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IPOImpl#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPOImpl#getXolOset <em>Xol Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPOImpl#getYolOset <em>Yol Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPOImpl#getOvlyOrent <em>Ovly Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IPOImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IPOImpl extends SFImpl implements IPO {
	/**
	 * The default value of the '{@link #getOvlyName() <em>Ovly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvlyName()
	 * @generated
	 * @ordered
	 */
	protected static final String OVLY_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvlyName() <em>Ovly Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvlyName()
	 * @generated
	 * @ordered
	 */
	protected String ovlyName = OVLY_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getXolOset() <em>Xol Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXolOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOL_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXolOset() <em>Xol Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXolOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xolOset = XOL_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYolOset() <em>Yol Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYolOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOL_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYolOset() <em>Yol Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYolOset()
	 * @generated
	 * @ordered
	 */
	protected Integer yolOset = YOL_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getOvlyOrent() <em>Ovly Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvlyOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OVLY_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOvlyOrent() <em>Ovly Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOvlyOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer ovlyOrent = OVLY_ORENT_EDEFAULT;

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
	protected IPOImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getIPO();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getOvlyName() {
		return ovlyName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvlyName(String newOvlyName) {
		String oldOvlyName = ovlyName;
		ovlyName = newOvlyName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPO__OVLY_NAME, oldOvlyName, ovlyName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXolOset() {
		return xolOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXolOset(Integer newXolOset) {
		Integer oldXolOset = xolOset;
		xolOset = newXolOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPO__XOL_OSET, oldXolOset, xolOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYolOset() {
		return yolOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYolOset(Integer newYolOset) {
		Integer oldYolOset = yolOset;
		yolOset = newYolOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPO__YOL_OSET, oldYolOset, yolOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOvlyOrent() {
		return ovlyOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOvlyOrent(Integer newOvlyOrent) {
		Integer oldOvlyOrent = ovlyOrent;
		ovlyOrent = newOvlyOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IPO__OVLY_ORENT, oldOvlyOrent, ovlyOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IPO__TRIPLETS);
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
			case AfplibPackage.IPO__TRIPLETS:
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
			case AfplibPackage.IPO__OVLY_NAME:
				return getOvlyName();
			case AfplibPackage.IPO__XOL_OSET:
				return getXolOset();
			case AfplibPackage.IPO__YOL_OSET:
				return getYolOset();
			case AfplibPackage.IPO__OVLY_ORENT:
				return getOvlyOrent();
			case AfplibPackage.IPO__TRIPLETS:
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
			case AfplibPackage.IPO__OVLY_NAME:
				setOvlyName((String)newValue);
				return;
			case AfplibPackage.IPO__XOL_OSET:
				setXolOset((Integer)newValue);
				return;
			case AfplibPackage.IPO__YOL_OSET:
				setYolOset((Integer)newValue);
				return;
			case AfplibPackage.IPO__OVLY_ORENT:
				setOvlyOrent((Integer)newValue);
				return;
			case AfplibPackage.IPO__TRIPLETS:
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
			case AfplibPackage.IPO__OVLY_NAME:
				setOvlyName(OVLY_NAME_EDEFAULT);
				return;
			case AfplibPackage.IPO__XOL_OSET:
				setXolOset(XOL_OSET_EDEFAULT);
				return;
			case AfplibPackage.IPO__YOL_OSET:
				setYolOset(YOL_OSET_EDEFAULT);
				return;
			case AfplibPackage.IPO__OVLY_ORENT:
				setOvlyOrent(OVLY_ORENT_EDEFAULT);
				return;
			case AfplibPackage.IPO__TRIPLETS:
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
			case AfplibPackage.IPO__OVLY_NAME:
				return OVLY_NAME_EDEFAULT == null ? ovlyName != null : !OVLY_NAME_EDEFAULT.equals(ovlyName);
			case AfplibPackage.IPO__XOL_OSET:
				return XOL_OSET_EDEFAULT == null ? xolOset != null : !XOL_OSET_EDEFAULT.equals(xolOset);
			case AfplibPackage.IPO__YOL_OSET:
				return YOL_OSET_EDEFAULT == null ? yolOset != null : !YOL_OSET_EDEFAULT.equals(yolOset);
			case AfplibPackage.IPO__OVLY_ORENT:
				return OVLY_ORENT_EDEFAULT == null ? ovlyOrent != null : !OVLY_ORENT_EDEFAULT.equals(ovlyOrent);
			case AfplibPackage.IPO__TRIPLETS:
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
		result.append(" (OvlyName: ");
		result.append(ovlyName);
		result.append(", XolOset: ");
		result.append(xolOset);
		result.append(", YolOset: ");
		result.append(yolOset);
		result.append(", OvlyOrent: ");
		result.append(ovlyOrent);
		result.append(')');
		return result.toString();
	}

} //IPOImpl
