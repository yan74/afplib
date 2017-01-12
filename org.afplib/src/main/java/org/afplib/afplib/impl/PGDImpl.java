/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PGD;

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
 * An implementation of the model object '<em><b>PGD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getXpgBase <em>Xpg Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getYpgBase <em>Ypg Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getXpgUnits <em>Xpg Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getYpgUnits <em>Ypg Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getXpgSize <em>Xpg Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getYpgSize <em>Ypg Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGDImpl extends SFImpl implements PGD {
	/**
	 * The default value of the '{@link #getXpgBase() <em>Xpg Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPG_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpgBase() <em>Xpg Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xpgBase = XPG_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYpgBase() <em>Ypg Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPG_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYpgBase() <em>Ypg Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgBase()
	 * @generated
	 * @ordered
	 */
	protected Integer ypgBase = YPG_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpgUnits() <em>Xpg Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPG_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpgUnits() <em>Xpg Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xpgUnits = XPG_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYpgUnits() <em>Ypg Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPG_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYpgUnits() <em>Ypg Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer ypgUnits = YPG_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXpgSize() <em>Xpg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPG_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXpgSize() <em>Xpg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXpgSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xpgSize = XPG_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYpgSize() <em>Ypg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPG_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYpgSize() <em>Ypg Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYpgSize()
	 * @generated
	 * @ordered
	 */
	protected Integer ypgSize = YPG_SIZE_EDEFAULT;

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
	protected PGDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.PGD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXpgBase() {
		return xpgBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpgBase(Integer newXpgBase) {
		Integer oldXpgBase = xpgBase;
		xpgBase = newXpgBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__XPG_BASE, oldXpgBase, xpgBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYpgBase() {
		return ypgBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpgBase(Integer newYpgBase) {
		Integer oldYpgBase = ypgBase;
		ypgBase = newYpgBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__YPG_BASE, oldYpgBase, ypgBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXpgUnits() {
		return xpgUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpgUnits(Integer newXpgUnits) {
		Integer oldXpgUnits = xpgUnits;
		xpgUnits = newXpgUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__XPG_UNITS, oldXpgUnits, xpgUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYpgUnits() {
		return ypgUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpgUnits(Integer newYpgUnits) {
		Integer oldYpgUnits = ypgUnits;
		ypgUnits = newYpgUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__YPG_UNITS, oldYpgUnits, ypgUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXpgSize() {
		return xpgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXpgSize(Integer newXpgSize) {
		Integer oldXpgSize = xpgSize;
		xpgSize = newXpgSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__XPG_SIZE, oldXpgSize, xpgSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYpgSize() {
		return ypgSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYpgSize(Integer newYpgSize) {
		Integer oldYpgSize = ypgSize;
		ypgSize = newYpgSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__YPG_SIZE, oldYpgSize, ypgSize));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGD__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.PGD__TRIPLETS);
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
			case AfplibPackage.PGD__TRIPLETS:
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
			case AfplibPackage.PGD__XPG_BASE:
				return getXpgBase();
			case AfplibPackage.PGD__YPG_BASE:
				return getYpgBase();
			case AfplibPackage.PGD__XPG_UNITS:
				return getXpgUnits();
			case AfplibPackage.PGD__YPG_UNITS:
				return getYpgUnits();
			case AfplibPackage.PGD__XPG_SIZE:
				return getXpgSize();
			case AfplibPackage.PGD__YPG_SIZE:
				return getYpgSize();
			case AfplibPackage.PGD__RESERVED:
				return getReserved();
			case AfplibPackage.PGD__TRIPLETS:
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
			case AfplibPackage.PGD__XPG_BASE:
				setXpgBase((Integer)newValue);
				return;
			case AfplibPackage.PGD__YPG_BASE:
				setYpgBase((Integer)newValue);
				return;
			case AfplibPackage.PGD__XPG_UNITS:
				setXpgUnits((Integer)newValue);
				return;
			case AfplibPackage.PGD__YPG_UNITS:
				setYpgUnits((Integer)newValue);
				return;
			case AfplibPackage.PGD__XPG_SIZE:
				setXpgSize((Integer)newValue);
				return;
			case AfplibPackage.PGD__YPG_SIZE:
				setYpgSize((Integer)newValue);
				return;
			case AfplibPackage.PGD__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.PGD__TRIPLETS:
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
			case AfplibPackage.PGD__XPG_BASE:
				setXpgBase(XPG_BASE_EDEFAULT);
				return;
			case AfplibPackage.PGD__YPG_BASE:
				setYpgBase(YPG_BASE_EDEFAULT);
				return;
			case AfplibPackage.PGD__XPG_UNITS:
				setXpgUnits(XPG_UNITS_EDEFAULT);
				return;
			case AfplibPackage.PGD__YPG_UNITS:
				setYpgUnits(YPG_UNITS_EDEFAULT);
				return;
			case AfplibPackage.PGD__XPG_SIZE:
				setXpgSize(XPG_SIZE_EDEFAULT);
				return;
			case AfplibPackage.PGD__YPG_SIZE:
				setYpgSize(YPG_SIZE_EDEFAULT);
				return;
			case AfplibPackage.PGD__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.PGD__TRIPLETS:
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
			case AfplibPackage.PGD__XPG_BASE:
				return XPG_BASE_EDEFAULT == null ? xpgBase != null : !XPG_BASE_EDEFAULT.equals(xpgBase);
			case AfplibPackage.PGD__YPG_BASE:
				return YPG_BASE_EDEFAULT == null ? ypgBase != null : !YPG_BASE_EDEFAULT.equals(ypgBase);
			case AfplibPackage.PGD__XPG_UNITS:
				return XPG_UNITS_EDEFAULT == null ? xpgUnits != null : !XPG_UNITS_EDEFAULT.equals(xpgUnits);
			case AfplibPackage.PGD__YPG_UNITS:
				return YPG_UNITS_EDEFAULT == null ? ypgUnits != null : !YPG_UNITS_EDEFAULT.equals(ypgUnits);
			case AfplibPackage.PGD__XPG_SIZE:
				return XPG_SIZE_EDEFAULT == null ? xpgSize != null : !XPG_SIZE_EDEFAULT.equals(xpgSize);
			case AfplibPackage.PGD__YPG_SIZE:
				return YPG_SIZE_EDEFAULT == null ? ypgSize != null : !YPG_SIZE_EDEFAULT.equals(ypgSize);
			case AfplibPackage.PGD__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.PGD__TRIPLETS:
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
		result.append(" (XpgBase: ");
		result.append(xpgBase);
		result.append(", YpgBase: ");
		result.append(ypgBase);
		result.append(", XpgUnits: ");
		result.append(xpgUnits);
		result.append(", YpgUnits: ");
		result.append(ypgUnits);
		result.append(", XpgSize: ");
		result.append(xpgSize);
		result.append(", YpgSize: ");
		result.append(ypgSize);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(')');
		return result.toString();
	}

} //PGDImpl
