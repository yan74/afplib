/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNNRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNNRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNNRGImpl#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNNRGImpl#getTSOffset <em>TS Offset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNNRGImpl extends TripletImpl implements FNNRG {
	/**
	 * The default value of the '{@link #getGCGID() <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGID()
	 * @generated
	 * @ordered
	 */
	protected static final String GCGID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGCGID() <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGCGID()
	 * @generated
	 * @ordered
	 */
	protected String gcgid = GCGID_EDEFAULT;

	/**
	 * The default value of the '{@link #getTSOffset() <em>TS Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSOffset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TS_OFFSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTSOffset() <em>TS Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTSOffset()
	 * @generated
	 * @ordered
	 */
	protected Integer tsOffset = TS_OFFSET_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNNRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFNNRG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getGCGID() {
		return gcgid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGCGID(String newGCGID) {
		String oldGCGID = gcgid;
		gcgid = newGCGID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNNRG__GCGID, oldGCGID, gcgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTSOffset() {
		return tsOffset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTSOffset(Integer newTSOffset) {
		Integer oldTSOffset = tsOffset;
		tsOffset = newTSOffset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNNRG__TS_OFFSET, oldTSOffset, tsOffset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FNNRG__GCGID:
				return getGCGID();
			case AfplibPackage.FNNRG__TS_OFFSET:
				return getTSOffset();
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
			case AfplibPackage.FNNRG__GCGID:
				setGCGID((String)newValue);
				return;
			case AfplibPackage.FNNRG__TS_OFFSET:
				setTSOffset((Integer)newValue);
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
			case AfplibPackage.FNNRG__GCGID:
				setGCGID(GCGID_EDEFAULT);
				return;
			case AfplibPackage.FNNRG__TS_OFFSET:
				setTSOffset(TS_OFFSET_EDEFAULT);
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
			case AfplibPackage.FNNRG__GCGID:
				return GCGID_EDEFAULT == null ? gcgid != null : !GCGID_EDEFAULT.equals(gcgid);
			case AfplibPackage.FNNRG__TS_OFFSET:
				return TS_OFFSET_EDEFAULT == null ? tsOffset != null : !TS_OFFSET_EDEFAULT.equals(tsOffset);
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
		result.append(" (GCGID: ");
		result.append(gcgid);
		result.append(", TSOffset: ");
		result.append(tsOffset);
		result.append(')');
		return result.toString();
	}

} //FNNRGImpl
