/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSCH;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSCH</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSCHImpl#getHX <em>HX</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSCHImpl#getHY <em>HY</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GSCHImpl extends TripletImpl implements GSCH {
	/**
	 * The default value of the '{@link #getHX() <em>HX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHX()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HX_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHX() <em>HX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHX()
	 * @generated
	 * @ordered
	 */
	protected Integer hx = HX_EDEFAULT;

	/**
	 * The default value of the '{@link #getHY() <em>HY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHY()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HY_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHY() <em>HY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHY()
	 * @generated
	 * @ordered
	 */
	protected Integer hy = HY_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSCHImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.GSCH;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHX() {
		return hx;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHX(Integer newHX) {
		Integer oldHX = hx;
		hx = newHX;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCH__HX, oldHX, hx));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHY() {
		return hy;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHY(Integer newHY) {
		Integer oldHY = hy;
		hy = newHY;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSCH__HY, oldHY, hy));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSCH__HX:
				return getHX();
			case AfplibPackage.GSCH__HY:
				return getHY();
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
			case AfplibPackage.GSCH__HX:
				setHX((Integer)newValue);
				return;
			case AfplibPackage.GSCH__HY:
				setHY((Integer)newValue);
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
			case AfplibPackage.GSCH__HX:
				setHX(HX_EDEFAULT);
				return;
			case AfplibPackage.GSCH__HY:
				setHY(HY_EDEFAULT);
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
			case AfplibPackage.GSCH__HX:
				return HX_EDEFAULT == null ? hx != null : !HX_EDEFAULT.equals(hx);
			case AfplibPackage.GSCH__HY:
				return HY_EDEFAULT == null ? hy != null : !HY_EDEFAULT.equals(hy);
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
		result.append(" (HX: ");
		result.append(hx);
		result.append(", HY: ");
		result.append(hy);
		result.append(')');
		return result.toString();
	}

} //GSCHImpl
