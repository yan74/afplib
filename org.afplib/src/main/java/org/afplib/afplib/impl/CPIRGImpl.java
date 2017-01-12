/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.CPIRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>CPIRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.CPIRGImpl#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPIRGImpl#getPrtFlags <em>Prt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPIRGImpl#getCodePoint <em>Code Point</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.CPIRGImpl#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @generated
 */
public class CPIRGImpl extends TripletImpl implements CPIRG {
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
	 * The default value of the '{@link #getPrtFlags() <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrtFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PRT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPrtFlags() <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPrtFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer prtFlags = PRT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCodePoint() <em>Code Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePoint()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CODE_POINT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCodePoint() <em>Code Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCodePoint()
	 * @generated
	 * @ordered
	 */
	protected Integer codePoint = CODE_POINT_EDEFAULT;

	/**
	 * The default value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected static final Integer COUNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCount() <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCount()
	 * @generated
	 * @ordered
	 */
	protected Integer count = COUNT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected CPIRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.CPIRG;
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPIRG__GCGID, oldGCGID, gcgid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPrtFlags() {
		return prtFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPrtFlags(Integer newPrtFlags) {
		Integer oldPrtFlags = prtFlags;
		prtFlags = newPrtFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPIRG__PRT_FLAGS, oldPrtFlags, prtFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCodePoint() {
		return codePoint;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCodePoint(Integer newCodePoint) {
		Integer oldCodePoint = codePoint;
		codePoint = newCodePoint;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPIRG__CODE_POINT, oldCodePoint, codePoint));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCount() {
		return count;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCount(Integer newCount) {
		Integer oldCount = count;
		count = newCount;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.CPIRG__COUNT, oldCount, count));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.CPIRG__GCGID:
				return getGCGID();
			case AfplibPackage.CPIRG__PRT_FLAGS:
				return getPrtFlags();
			case AfplibPackage.CPIRG__CODE_POINT:
				return getCodePoint();
			case AfplibPackage.CPIRG__COUNT:
				return getCount();
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
			case AfplibPackage.CPIRG__GCGID:
				setGCGID((String)newValue);
				return;
			case AfplibPackage.CPIRG__PRT_FLAGS:
				setPrtFlags((Integer)newValue);
				return;
			case AfplibPackage.CPIRG__CODE_POINT:
				setCodePoint((Integer)newValue);
				return;
			case AfplibPackage.CPIRG__COUNT:
				setCount((Integer)newValue);
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
			case AfplibPackage.CPIRG__GCGID:
				setGCGID(GCGID_EDEFAULT);
				return;
			case AfplibPackage.CPIRG__PRT_FLAGS:
				setPrtFlags(PRT_FLAGS_EDEFAULT);
				return;
			case AfplibPackage.CPIRG__CODE_POINT:
				setCodePoint(CODE_POINT_EDEFAULT);
				return;
			case AfplibPackage.CPIRG__COUNT:
				setCount(COUNT_EDEFAULT);
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
			case AfplibPackage.CPIRG__GCGID:
				return GCGID_EDEFAULT == null ? gcgid != null : !GCGID_EDEFAULT.equals(gcgid);
			case AfplibPackage.CPIRG__PRT_FLAGS:
				return PRT_FLAGS_EDEFAULT == null ? prtFlags != null : !PRT_FLAGS_EDEFAULT.equals(prtFlags);
			case AfplibPackage.CPIRG__CODE_POINT:
				return CODE_POINT_EDEFAULT == null ? codePoint != null : !CODE_POINT_EDEFAULT.equals(codePoint);
			case AfplibPackage.CPIRG__COUNT:
				return COUNT_EDEFAULT == null ? count != null : !COUNT_EDEFAULT.equals(count);
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
		result.append(", PrtFlags: ");
		result.append(prtFlags);
		result.append(", CodePoint: ");
		result.append(codePoint);
		result.append(", Count: ");
		result.append(count);
		result.append(')');
		return result.toString();
	}

} //CPIRGImpl
