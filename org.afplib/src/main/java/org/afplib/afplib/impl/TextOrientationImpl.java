/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TextOrientation;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Text Orientation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TextOrientationImpl#getIAxis <em>IAxis</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TextOrientationImpl#getBAxis <em>BAxis</em>}</li>
 * </ul>
 *
 * @generated
 */
public class TextOrientationImpl extends TripletImpl implements TextOrientation {
	/**
	 * The default value of the '{@link #getIAxis() <em>IAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIAxis() <em>IAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIAxis()
	 * @generated
	 * @ordered
	 */
	protected Integer iAxis = IAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBAxis() <em>BAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAxis()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBAxis() <em>BAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBAxis()
	 * @generated
	 * @ordered
	 */
	protected Integer bAxis = BAXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TextOrientationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.TEXT_ORIENTATION;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIAxis() {
		return iAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIAxis(Integer newIAxis) {
		Integer oldIAxis = iAxis;
		iAxis = newIAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TEXT_ORIENTATION__IAXIS, oldIAxis, iAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBAxis() {
		return bAxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBAxis(Integer newBAxis) {
		Integer oldBAxis = bAxis;
		bAxis = newBAxis;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TEXT_ORIENTATION__BAXIS, oldBAxis, bAxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.TEXT_ORIENTATION__IAXIS:
				return getIAxis();
			case AfplibPackage.TEXT_ORIENTATION__BAXIS:
				return getBAxis();
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
			case AfplibPackage.TEXT_ORIENTATION__IAXIS:
				setIAxis((Integer)newValue);
				return;
			case AfplibPackage.TEXT_ORIENTATION__BAXIS:
				setBAxis((Integer)newValue);
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
			case AfplibPackage.TEXT_ORIENTATION__IAXIS:
				setIAxis(IAXIS_EDEFAULT);
				return;
			case AfplibPackage.TEXT_ORIENTATION__BAXIS:
				setBAxis(BAXIS_EDEFAULT);
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
			case AfplibPackage.TEXT_ORIENTATION__IAXIS:
				return IAXIS_EDEFAULT == null ? iAxis != null : !IAXIS_EDEFAULT.equals(iAxis);
			case AfplibPackage.TEXT_ORIENTATION__BAXIS:
				return BAXIS_EDEFAULT == null ? bAxis != null : !BAXIS_EDEFAULT.equals(bAxis);
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
		result.append(" (IAxis: ");
		result.append(iAxis);
		result.append(", BAxis: ");
		result.append(bAxis);
		result.append(')');
		return result.toString();
	}

} //TextOrientationImpl
