/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCBOX;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCBOX</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCBOXImpl#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBOXImpl#getXPOS1 <em>XPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBOXImpl#getYPOS1 <em>YPOS1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBOXImpl#getHAXIS <em>HAXIS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBOXImpl#getVAXIS <em>VAXIS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCBOXImpl extends TripletImpl implements GCBOX {
	/**
	 * The default value of the '{@link #getRES() <em>RES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRES()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRES() <em>RES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRES()
	 * @generated
	 * @ordered
	 */
	protected Integer res = RES_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPOS1() <em>XPOS1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPOS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPOS1() <em>XPOS1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS1()
	 * @generated
	 * @ordered
	 */
	protected Integer xpos1 = XPOS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPOS1() <em>YPOS1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS1()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPOS1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPOS1() <em>YPOS1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS1()
	 * @generated
	 * @ordered
	 */
	protected Integer ypos1 = YPOS1_EDEFAULT;

	/**
	 * The default value of the '{@link #getHAXIS() <em>HAXIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAXIS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHAXIS() <em>HAXIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHAXIS()
	 * @generated
	 * @ordered
	 */
	protected Integer haxis = HAXIS_EDEFAULT;

	/**
	 * The default value of the '{@link #getVAXIS() <em>VAXIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAXIS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer VAXIS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVAXIS() <em>VAXIS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVAXIS()
	 * @generated
	 * @ordered
	 */
	protected Integer vaxis = VAXIS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCBOXImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.GCBOX;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRES() {
		return res;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRES(Integer newRES) {
		Integer oldRES = res;
		res = newRES;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBOX__RES, oldRES, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPOS1() {
		return xpos1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPOS1(Integer newXPOS1) {
		Integer oldXPOS1 = xpos1;
		xpos1 = newXPOS1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBOX__XPOS1, oldXPOS1, xpos1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPOS1() {
		return ypos1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPOS1(Integer newYPOS1) {
		Integer oldYPOS1 = ypos1;
		ypos1 = newYPOS1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBOX__YPOS1, oldYPOS1, ypos1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHAXIS() {
		return haxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHAXIS(Integer newHAXIS) {
		Integer oldHAXIS = haxis;
		haxis = newHAXIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBOX__HAXIS, oldHAXIS, haxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getVAXIS() {
		return vaxis;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVAXIS(Integer newVAXIS) {
		Integer oldVAXIS = vaxis;
		vaxis = newVAXIS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBOX__VAXIS, oldVAXIS, vaxis));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCBOX__RES:
				return getRES();
			case AfplibPackage.GCBOX__XPOS1:
				return getXPOS1();
			case AfplibPackage.GCBOX__YPOS1:
				return getYPOS1();
			case AfplibPackage.GCBOX__HAXIS:
				return getHAXIS();
			case AfplibPackage.GCBOX__VAXIS:
				return getVAXIS();
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
			case AfplibPackage.GCBOX__RES:
				setRES((Integer)newValue);
				return;
			case AfplibPackage.GCBOX__XPOS1:
				setXPOS1((Integer)newValue);
				return;
			case AfplibPackage.GCBOX__YPOS1:
				setYPOS1((Integer)newValue);
				return;
			case AfplibPackage.GCBOX__HAXIS:
				setHAXIS((Integer)newValue);
				return;
			case AfplibPackage.GCBOX__VAXIS:
				setVAXIS((Integer)newValue);
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
			case AfplibPackage.GCBOX__RES:
				setRES(RES_EDEFAULT);
				return;
			case AfplibPackage.GCBOX__XPOS1:
				setXPOS1(XPOS1_EDEFAULT);
				return;
			case AfplibPackage.GCBOX__YPOS1:
				setYPOS1(YPOS1_EDEFAULT);
				return;
			case AfplibPackage.GCBOX__HAXIS:
				setHAXIS(HAXIS_EDEFAULT);
				return;
			case AfplibPackage.GCBOX__VAXIS:
				setVAXIS(VAXIS_EDEFAULT);
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
			case AfplibPackage.GCBOX__RES:
				return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
			case AfplibPackage.GCBOX__XPOS1:
				return XPOS1_EDEFAULT == null ? xpos1 != null : !XPOS1_EDEFAULT.equals(xpos1);
			case AfplibPackage.GCBOX__YPOS1:
				return YPOS1_EDEFAULT == null ? ypos1 != null : !YPOS1_EDEFAULT.equals(ypos1);
			case AfplibPackage.GCBOX__HAXIS:
				return HAXIS_EDEFAULT == null ? haxis != null : !HAXIS_EDEFAULT.equals(haxis);
			case AfplibPackage.GCBOX__VAXIS:
				return VAXIS_EDEFAULT == null ? vaxis != null : !VAXIS_EDEFAULT.equals(vaxis);
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
		result.append(" (RES: ");
		result.append(res);
		result.append(", XPOS1: ");
		result.append(xpos1);
		result.append(", YPOS1: ");
		result.append(ypos1);
		result.append(", HAXIS: ");
		result.append(haxis);
		result.append(", VAXIS: ");
		result.append(vaxis);
		result.append(')');
		return result.toString();
	}

} //GCBOXImpl
