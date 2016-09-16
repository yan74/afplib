/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCRLINERG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCRLINERG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCRLINERGImpl#getXOSSF <em>XOSSF</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCRLINERGImpl#getYOFFS <em>YOFFS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GCRLINERGImpl extends TripletImpl implements GCRLINERG {
	/**
	 * The default value of the '{@link #getXOSSF() <em>XOSSF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOSSF()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XOSSF_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXOSSF() <em>XOSSF</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXOSSF()
	 * @generated
	 * @ordered
	 */
	protected Integer xossf = XOSSF_EDEFAULT;

	/**
	 * The default value of the '{@link #getYOFFS() <em>YOFFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOFFS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YOFFS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYOFFS() <em>YOFFS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYOFFS()
	 * @generated
	 * @ordered
	 */
	protected Integer yoffs = YOFFS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCRLINERGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGCRLINERG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXOSSF() {
		return xossf;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXOSSF(Integer newXOSSF) {
		Integer oldXOSSF = xossf;
		xossf = newXOSSF;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCRLINERG__XOSSF, oldXOSSF, xossf));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYOFFS() {
		return yoffs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYOFFS(Integer newYOFFS) {
		Integer oldYOFFS = yoffs;
		yoffs = newYOFFS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCRLINERG__YOFFS, oldYOFFS, yoffs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCRLINERG__XOSSF:
				return getXOSSF();
			case AfplibPackage.GCRLINERG__YOFFS:
				return getYOFFS();
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
			case AfplibPackage.GCRLINERG__XOSSF:
				setXOSSF((Integer)newValue);
				return;
			case AfplibPackage.GCRLINERG__YOFFS:
				setYOFFS((Integer)newValue);
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
			case AfplibPackage.GCRLINERG__XOSSF:
				setXOSSF(XOSSF_EDEFAULT);
				return;
			case AfplibPackage.GCRLINERG__YOFFS:
				setYOFFS(YOFFS_EDEFAULT);
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
			case AfplibPackage.GCRLINERG__XOSSF:
				return XOSSF_EDEFAULT == null ? xossf != null : !XOSSF_EDEFAULT.equals(xossf);
			case AfplibPackage.GCRLINERG__YOFFS:
				return YOFFS_EDEFAULT == null ? yoffs != null : !YOFFS_EDEFAULT.equals(yoffs);
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
		result.append(" (XOSSF: ");
		result.append(xossf);
		result.append(", YOFFS: ");
		result.append(yoffs);
		result.append(')');
		return result.toString();
	}

} //GCRLINERGImpl
