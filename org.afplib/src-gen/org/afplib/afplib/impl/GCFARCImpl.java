/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCFARC;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCFARC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCFARCImpl#getMH <em>MH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCFARCImpl#getMFR <em>MFR</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GCFARCImpl extends TripletImpl implements GCFARC {
	/**
	 * The default value of the '{@link #getMH() <em>MH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMH() <em>MH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMH()
	 * @generated
	 * @ordered
	 */
	protected Integer mh = MH_EDEFAULT;

	/**
	 * The default value of the '{@link #getMFR() <em>MFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MFR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMFR() <em>MFR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFR()
	 * @generated
	 * @ordered
	 */
	protected Integer mfr = MFR_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCFARCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGCFARC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMH() {
		return mh;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMH(Integer newMH) {
		Integer oldMH = mh;
		mh = newMH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCFARC__MH, oldMH, mh));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMFR() {
		return mfr;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFR(Integer newMFR) {
		Integer oldMFR = mfr;
		mfr = newMFR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCFARC__MFR, oldMFR, mfr));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCFARC__MH:
				return getMH();
			case AfplibPackage.GCFARC__MFR:
				return getMFR();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.GCFARC__MH:
				setMH((Integer)newValue);
				return;
			case AfplibPackage.GCFARC__MFR:
				setMFR((Integer)newValue);
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
			case AfplibPackage.GCFARC__MH:
				setMH(MH_EDEFAULT);
				return;
			case AfplibPackage.GCFARC__MFR:
				setMFR(MFR_EDEFAULT);
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
			case AfplibPackage.GCFARC__MH:
				return MH_EDEFAULT == null ? mh != null : !MH_EDEFAULT.equals(mh);
			case AfplibPackage.GCFARC__MFR:
				return MFR_EDEFAULT == null ? mfr != null : !MFR_EDEFAULT.equals(mfr);
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
		result.append(" (MH: ");
		result.append(mh);
		result.append(", MFR: ");
		result.append(mfr);
		result.append(')');
		return result.toString();
	}

} //GCFARCImpl
