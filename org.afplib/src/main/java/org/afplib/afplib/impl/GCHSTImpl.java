/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GCHST;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GCHST</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GCHSTImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCHSTImpl#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GCHSTImpl#getCP <em>CP</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GCHSTImpl extends TripletImpl implements GCHST {
	/**
	 * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPOS()
	 * @generated
	 * @ordered
	 */
	protected Integer xpos = XPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPOS()
	 * @generated
	 * @ordered
	 */
	protected Integer ypos = YPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getCP() <em>CP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP()
	 * @generated
	 * @ordered
	 */
	protected static final String CP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCP() <em>CP</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCP()
	 * @generated
	 * @ordered
	 */
	protected String cp = CP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GCHSTImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGCHST();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPOS() {
		return xpos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPOS(Integer newXPOS) {
		Integer oldXPOS = xpos;
		xpos = newXPOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCHST__XPOS, oldXPOS, xpos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPOS() {
		return ypos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPOS(Integer newYPOS) {
		Integer oldYPOS = ypos;
		ypos = newYPOS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCHST__YPOS, oldYPOS, ypos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getCP() {
		return cp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCP(String newCP) {
		String oldCP = cp;
		cp = newCP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GCHST__CP, oldCP, cp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GCHST__XPOS:
				return getXPOS();
			case AfplibPackage.GCHST__YPOS:
				return getYPOS();
			case AfplibPackage.GCHST__CP:
				return getCP();
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
			case AfplibPackage.GCHST__XPOS:
				setXPOS((Integer)newValue);
				return;
			case AfplibPackage.GCHST__YPOS:
				setYPOS((Integer)newValue);
				return;
			case AfplibPackage.GCHST__CP:
				setCP((String)newValue);
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
			case AfplibPackage.GCHST__XPOS:
				setXPOS(XPOS_EDEFAULT);
				return;
			case AfplibPackage.GCHST__YPOS:
				setYPOS(YPOS_EDEFAULT);
				return;
			case AfplibPackage.GCHST__CP:
				setCP(CP_EDEFAULT);
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
			case AfplibPackage.GCHST__XPOS:
				return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
			case AfplibPackage.GCHST__YPOS:
				return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
			case AfplibPackage.GCHST__CP:
				return CP_EDEFAULT == null ? cp != null : !CP_EDEFAULT.equals(cp);
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
		result.append(" (XPOS: ");
		result.append(xpos);
		result.append(", YPOS: ");
		result.append(ypos);
		result.append(", CP: ");
		result.append(cp);
		result.append(')');
		return result.toString();
	}

} //GCHSTImpl
