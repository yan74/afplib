/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCBIMG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCBIMG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCBIMGImpl#getFORMAT <em>FORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBIMGImpl#getRES <em>RES</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBIMGImpl#getWIDTH <em>WIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCBIMGImpl#getHEIGHT <em>HEIGHT</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCBIMGImpl extends TripletImpl implements GCBIMG {
	/**
	 * The default value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMAT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FORMAT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFORMAT() <em>FORMAT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFORMAT()
	 * @generated
	 * @ordered
	 */
	protected Integer format = FORMAT_EDEFAULT;

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
	 * The default value of the '{@link #getWIDTH() <em>WIDTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWIDTH()
	 * @generated
	 * @ordered
	 */
	protected static final Integer WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getWIDTH() <em>WIDTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getWIDTH()
	 * @generated
	 * @ordered
	 */
	protected Integer width = WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getHEIGHT() <em>HEIGHT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHEIGHT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getHEIGHT() <em>HEIGHT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getHEIGHT()
	 * @generated
	 * @ordered
	 */
	protected Integer height = HEIGHT_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCBIMGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGCBIMG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFORMAT() {
		return format;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFORMAT(Integer newFORMAT) {
		Integer oldFORMAT = format;
		format = newFORMAT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBIMG__FORMAT, oldFORMAT, format));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBIMG__RES, oldRES, res));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getWIDTH() {
		return width;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setWIDTH(Integer newWIDTH) {
		Integer oldWIDTH = width;
		width = newWIDTH;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBIMG__WIDTH, oldWIDTH, width));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getHEIGHT() {
		return height;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setHEIGHT(Integer newHEIGHT) {
		Integer oldHEIGHT = height;
		height = newHEIGHT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCBIMG__HEIGHT, oldHEIGHT, height));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCBIMG__FORMAT:
				return getFORMAT();
			case AfplibPackage.GCBIMG__RES:
				return getRES();
			case AfplibPackage.GCBIMG__WIDTH:
				return getWIDTH();
			case AfplibPackage.GCBIMG__HEIGHT:
				return getHEIGHT();
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
			case AfplibPackage.GCBIMG__FORMAT:
				setFORMAT((Integer)newValue);
				return;
			case AfplibPackage.GCBIMG__RES:
				setRES((Integer)newValue);
				return;
			case AfplibPackage.GCBIMG__WIDTH:
				setWIDTH((Integer)newValue);
				return;
			case AfplibPackage.GCBIMG__HEIGHT:
				setHEIGHT((Integer)newValue);
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
			case AfplibPackage.GCBIMG__FORMAT:
				setFORMAT(FORMAT_EDEFAULT);
				return;
			case AfplibPackage.GCBIMG__RES:
				setRES(RES_EDEFAULT);
				return;
			case AfplibPackage.GCBIMG__WIDTH:
				setWIDTH(WIDTH_EDEFAULT);
				return;
			case AfplibPackage.GCBIMG__HEIGHT:
				setHEIGHT(HEIGHT_EDEFAULT);
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
			case AfplibPackage.GCBIMG__FORMAT:
				return FORMAT_EDEFAULT == null ? format != null : !FORMAT_EDEFAULT.equals(format);
			case AfplibPackage.GCBIMG__RES:
				return RES_EDEFAULT == null ? res != null : !RES_EDEFAULT.equals(res);
			case AfplibPackage.GCBIMG__WIDTH:
				return WIDTH_EDEFAULT == null ? width != null : !WIDTH_EDEFAULT.equals(width);
			case AfplibPackage.GCBIMG__HEIGHT:
				return HEIGHT_EDEFAULT == null ? height != null : !HEIGHT_EDEFAULT.equals(height);
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
		result.append(" (FORMAT: ");
		result.append(format);
		result.append(", RES: ");
		result.append(res);
		result.append(", WIDTH: ");
		result.append(width);
		result.append(", HEIGHT: ");
		result.append(height);
		result.append(')');
		return result.toString();
	}

} //GCBIMGImpl
