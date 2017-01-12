/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CDD;

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
 * An implementation of the model object '<em><b>CDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getXocBase <em>Xoc Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getYocBase <em>Yoc Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getXocUnits <em>Xoc Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getYocUnits <em>Yoc Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getXocSize <em>Xoc Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getYocSize <em>Yoc Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CDDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CDDImpl extends SFImpl implements CDD {
	/**
	 * The default value of the '{@link #getXocBase() <em>Xoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOC_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXocBase() <em>Xoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xocBase = XOC_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYocBase() <em>Yoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOC_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYocBase() <em>Yoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocBase()
	 * @generated
	 * @ordered
	 */
	protected Integer yocBase = YOC_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXocUnits() <em>Xoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOC_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXocUnits() <em>Xoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xocUnits = XOC_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYocUnits() <em>Yoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOC_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYocUnits() <em>Yoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer yocUnits = YOC_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXocSize() <em>Xoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOC_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXocSize() <em>Xoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXocSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xocSize = XOC_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYocSize() <em>Yoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOC_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYocSize() <em>Yoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYocSize()
	 * @generated
	 * @ordered
	 */
	protected Integer yocSize = YOC_SIZE_EDEFAULT;

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
	protected CDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.CDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXocBase() {
		return xocBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXocBase(Integer newXocBase) {
		Integer oldXocBase = xocBase;
		xocBase = newXocBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__XOC_BASE, oldXocBase, xocBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYocBase() {
		return yocBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYocBase(Integer newYocBase) {
		Integer oldYocBase = yocBase;
		yocBase = newYocBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__YOC_BASE, oldYocBase, yocBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXocUnits() {
		return xocUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXocUnits(Integer newXocUnits) {
		Integer oldXocUnits = xocUnits;
		xocUnits = newXocUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__XOC_UNITS, oldXocUnits, xocUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYocUnits() {
		return yocUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYocUnits(Integer newYocUnits) {
		Integer oldYocUnits = yocUnits;
		yocUnits = newYocUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__YOC_UNITS, oldYocUnits, yocUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXocSize() {
		return xocSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXocSize(Integer newXocSize) {
		Integer oldXocSize = xocSize;
		xocSize = newXocSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__XOC_SIZE, oldXocSize, xocSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYocSize() {
		return yocSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYocSize(Integer newYocSize) {
		Integer oldYocSize = yocSize;
		yocSize = newYocSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CDD__YOC_SIZE, oldYocSize, yocSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.CDD__TRIPLETS);
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
			case AfplibPackage.CDD__TRIPLETS:
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
			case AfplibPackage.CDD__XOC_BASE:
				return getXocBase();
			case AfplibPackage.CDD__YOC_BASE:
				return getYocBase();
			case AfplibPackage.CDD__XOC_UNITS:
				return getXocUnits();
			case AfplibPackage.CDD__YOC_UNITS:
				return getYocUnits();
			case AfplibPackage.CDD__XOC_SIZE:
				return getXocSize();
			case AfplibPackage.CDD__YOC_SIZE:
				return getYocSize();
			case AfplibPackage.CDD__TRIPLETS:
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
			case AfplibPackage.CDD__XOC_BASE:
				setXocBase((Integer)newValue);
				return;
			case AfplibPackage.CDD__YOC_BASE:
				setYocBase((Integer)newValue);
				return;
			case AfplibPackage.CDD__XOC_UNITS:
				setXocUnits((Integer)newValue);
				return;
			case AfplibPackage.CDD__YOC_UNITS:
				setYocUnits((Integer)newValue);
				return;
			case AfplibPackage.CDD__XOC_SIZE:
				setXocSize((Integer)newValue);
				return;
			case AfplibPackage.CDD__YOC_SIZE:
				setYocSize((Integer)newValue);
				return;
			case AfplibPackage.CDD__TRIPLETS:
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
			case AfplibPackage.CDD__XOC_BASE:
				setXocBase(XOC_BASE_EDEFAULT);
				return;
			case AfplibPackage.CDD__YOC_BASE:
				setYocBase(YOC_BASE_EDEFAULT);
				return;
			case AfplibPackage.CDD__XOC_UNITS:
				setXocUnits(XOC_UNITS_EDEFAULT);
				return;
			case AfplibPackage.CDD__YOC_UNITS:
				setYocUnits(YOC_UNITS_EDEFAULT);
				return;
			case AfplibPackage.CDD__XOC_SIZE:
				setXocSize(XOC_SIZE_EDEFAULT);
				return;
			case AfplibPackage.CDD__YOC_SIZE:
				setYocSize(YOC_SIZE_EDEFAULT);
				return;
			case AfplibPackage.CDD__TRIPLETS:
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
			case AfplibPackage.CDD__XOC_BASE:
				return XOC_BASE_EDEFAULT == null ? xocBase != null : !XOC_BASE_EDEFAULT.equals(xocBase);
			case AfplibPackage.CDD__YOC_BASE:
				return YOC_BASE_EDEFAULT == null ? yocBase != null : !YOC_BASE_EDEFAULT.equals(yocBase);
			case AfplibPackage.CDD__XOC_UNITS:
				return XOC_UNITS_EDEFAULT == null ? xocUnits != null : !XOC_UNITS_EDEFAULT.equals(xocUnits);
			case AfplibPackage.CDD__YOC_UNITS:
				return YOC_UNITS_EDEFAULT == null ? yocUnits != null : !YOC_UNITS_EDEFAULT.equals(yocUnits);
			case AfplibPackage.CDD__XOC_SIZE:
				return XOC_SIZE_EDEFAULT == null ? xocSize != null : !XOC_SIZE_EDEFAULT.equals(xocSize);
			case AfplibPackage.CDD__YOC_SIZE:
				return YOC_SIZE_EDEFAULT == null ? yocSize != null : !YOC_SIZE_EDEFAULT.equals(yocSize);
			case AfplibPackage.CDD__TRIPLETS:
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
		result.append(" (XocBase: ");
		result.append(xocBase);
		result.append(", YocBase: ");
		result.append(yocBase);
		result.append(", XocUnits: ");
		result.append(xocUnits);
		result.append(", YocUnits: ");
		result.append(yocUnits);
		result.append(", XocSize: ");
		result.append(xocSize);
		result.append(", YocSize: ");
		result.append(yocSize);
		result.append(')');
		return result.toString();
	}

} //CDDImpl
