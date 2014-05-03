/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MDD;

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
 * An implementation of the model object '<em><b>MDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getXmBase <em>Xm Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getYmBase <em>Ym Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getXmUnits <em>Xm Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getYmUnits <em>Ym Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getXmSize <em>Xm Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getYmSize <em>Ym Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getMDDFlgs <em>MDD Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MDDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class MDDImpl extends SFImpl implements MDD {
	/**
	 * The default value of the '{@link #getXmBase() <em>Xm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XM_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmBase() <em>Xm Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xmBase = XM_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmBase() <em>Ym Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YM_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYmBase() <em>Ym Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmBase()
	 * @generated
	 * @ordered
	 */
	protected Integer ymBase = YM_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmUnits() <em>Xm Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XM_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmUnits() <em>Xm Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xmUnits = XM_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmUnits() <em>Ym Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YM_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYmUnits() <em>Ym Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer ymUnits = YM_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmSize() <em>Xm Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmSize() <em>Xm Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmSize()
	 * @generated
	 * @ordered
	 */
	protected Integer xmSize = XM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmSize() <em>Ym Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YM_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYmSize() <em>Ym Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmSize()
	 * @generated
	 * @ordered
	 */
	protected Integer ymSize = YM_SIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getMDDFlgs() <em>MDD Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDDFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MDD_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMDDFlgs() <em>MDD Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMDDFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer mddFlgs = MDD_FLGS_EDEFAULT;

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
	protected MDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMDD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXmBase() {
		return xmBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmBase(Integer newXmBase) {
		Integer oldXmBase = xmBase;
		xmBase = newXmBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__XM_BASE, oldXmBase, xmBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYmBase() {
		return ymBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmBase(Integer newYmBase) {
		Integer oldYmBase = ymBase;
		ymBase = newYmBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__YM_BASE, oldYmBase, ymBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXmUnits() {
		return xmUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmUnits(Integer newXmUnits) {
		Integer oldXmUnits = xmUnits;
		xmUnits = newXmUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__XM_UNITS, oldXmUnits, xmUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYmUnits() {
		return ymUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmUnits(Integer newYmUnits) {
		Integer oldYmUnits = ymUnits;
		ymUnits = newYmUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__YM_UNITS, oldYmUnits, ymUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXmSize() {
		return xmSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmSize(Integer newXmSize) {
		Integer oldXmSize = xmSize;
		xmSize = newXmSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__XM_SIZE, oldXmSize, xmSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYmSize() {
		return ymSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmSize(Integer newYmSize) {
		Integer oldYmSize = ymSize;
		ymSize = newYmSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__YM_SIZE, oldYmSize, ymSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMDDFlgs() {
		return mddFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMDDFlgs(Integer newMDDFlgs) {
		Integer oldMDDFlgs = mddFlgs;
		mddFlgs = newMDDFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MDD__MDD_FLGS, oldMDDFlgs, mddFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.MDD__TRIPLETS);
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
			case AfplibPackage.MDD__TRIPLETS:
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
			case AfplibPackage.MDD__XM_BASE:
				return getXmBase();
			case AfplibPackage.MDD__YM_BASE:
				return getYmBase();
			case AfplibPackage.MDD__XM_UNITS:
				return getXmUnits();
			case AfplibPackage.MDD__YM_UNITS:
				return getYmUnits();
			case AfplibPackage.MDD__XM_SIZE:
				return getXmSize();
			case AfplibPackage.MDD__YM_SIZE:
				return getYmSize();
			case AfplibPackage.MDD__MDD_FLGS:
				return getMDDFlgs();
			case AfplibPackage.MDD__TRIPLETS:
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
			case AfplibPackage.MDD__XM_BASE:
				setXmBase((Integer)newValue);
				return;
			case AfplibPackage.MDD__YM_BASE:
				setYmBase((Integer)newValue);
				return;
			case AfplibPackage.MDD__XM_UNITS:
				setXmUnits((Integer)newValue);
				return;
			case AfplibPackage.MDD__YM_UNITS:
				setYmUnits((Integer)newValue);
				return;
			case AfplibPackage.MDD__XM_SIZE:
				setXmSize((Integer)newValue);
				return;
			case AfplibPackage.MDD__YM_SIZE:
				setYmSize((Integer)newValue);
				return;
			case AfplibPackage.MDD__MDD_FLGS:
				setMDDFlgs((Integer)newValue);
				return;
			case AfplibPackage.MDD__TRIPLETS:
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
			case AfplibPackage.MDD__XM_BASE:
				setXmBase(XM_BASE_EDEFAULT);
				return;
			case AfplibPackage.MDD__YM_BASE:
				setYmBase(YM_BASE_EDEFAULT);
				return;
			case AfplibPackage.MDD__XM_UNITS:
				setXmUnits(XM_UNITS_EDEFAULT);
				return;
			case AfplibPackage.MDD__YM_UNITS:
				setYmUnits(YM_UNITS_EDEFAULT);
				return;
			case AfplibPackage.MDD__XM_SIZE:
				setXmSize(XM_SIZE_EDEFAULT);
				return;
			case AfplibPackage.MDD__YM_SIZE:
				setYmSize(YM_SIZE_EDEFAULT);
				return;
			case AfplibPackage.MDD__MDD_FLGS:
				setMDDFlgs(MDD_FLGS_EDEFAULT);
				return;
			case AfplibPackage.MDD__TRIPLETS:
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
			case AfplibPackage.MDD__XM_BASE:
				return XM_BASE_EDEFAULT == null ? xmBase != null : !XM_BASE_EDEFAULT.equals(xmBase);
			case AfplibPackage.MDD__YM_BASE:
				return YM_BASE_EDEFAULT == null ? ymBase != null : !YM_BASE_EDEFAULT.equals(ymBase);
			case AfplibPackage.MDD__XM_UNITS:
				return XM_UNITS_EDEFAULT == null ? xmUnits != null : !XM_UNITS_EDEFAULT.equals(xmUnits);
			case AfplibPackage.MDD__YM_UNITS:
				return YM_UNITS_EDEFAULT == null ? ymUnits != null : !YM_UNITS_EDEFAULT.equals(ymUnits);
			case AfplibPackage.MDD__XM_SIZE:
				return XM_SIZE_EDEFAULT == null ? xmSize != null : !XM_SIZE_EDEFAULT.equals(xmSize);
			case AfplibPackage.MDD__YM_SIZE:
				return YM_SIZE_EDEFAULT == null ? ymSize != null : !YM_SIZE_EDEFAULT.equals(ymSize);
			case AfplibPackage.MDD__MDD_FLGS:
				return MDD_FLGS_EDEFAULT == null ? mddFlgs != null : !MDD_FLGS_EDEFAULT.equals(mddFlgs);
			case AfplibPackage.MDD__TRIPLETS:
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
		result.append(" (XmBase: ");
		result.append(xmBase);
		result.append(", YmBase: ");
		result.append(ymBase);
		result.append(", XmUnits: ");
		result.append(xmUnits);
		result.append(", YmUnits: ");
		result.append(ymUnits);
		result.append(", XmSize: ");
		result.append(xmSize);
		result.append(", YmSize: ");
		result.append(ymSize);
		result.append(", MDDFlgs: ");
		result.append(mddFlgs);
		result.append(')');
		return result.toString();
	}

} //MDDImpl
