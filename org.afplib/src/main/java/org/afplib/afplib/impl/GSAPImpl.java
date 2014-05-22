/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GSAP;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>GSAP</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GSAPImpl#getP <em>P</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSAPImpl#getQ <em>Q</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSAPImpl#getR <em>R</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GSAPImpl#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class GSAPImpl extends TripletImpl implements GSAP {
	/**
	 * The default value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected static final Integer P_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getP() <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getP()
	 * @generated
	 * @ordered
	 */
	protected Integer p = P_EDEFAULT;

	/**
	 * The default value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected static final Integer Q_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getQ() <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getQ()
	 * @generated
	 * @ordered
	 */
	protected Integer q = Q_EDEFAULT;

	/**
	 * The default value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected static final Integer R_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getR() <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getR()
	 * @generated
	 * @ordered
	 */
	protected Integer r = R_EDEFAULT;

	/**
	 * The default value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected static final Integer S_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getS() <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getS()
	 * @generated
	 * @ordered
	 */
	protected Integer s = S_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected GSAPImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getGSAP();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getP() {
		return p;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setP(Integer newP) {
		Integer oldP = p;
		p = newP;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSAP__P, oldP, p));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getQ() {
		return q;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setQ(Integer newQ) {
		Integer oldQ = q;
		q = newQ;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSAP__Q, oldQ, q));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getR() {
		return r;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setR(Integer newR) {
		Integer oldR = r;
		r = newR;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSAP__R, oldR, r));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getS() {
		return s;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setS(Integer newS) {
		Integer oldS = s;
		s = newS;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GSAP__S, oldS, s));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.GSAP__P:
				return getP();
			case AfplibPackage.GSAP__Q:
				return getQ();
			case AfplibPackage.GSAP__R:
				return getR();
			case AfplibPackage.GSAP__S:
				return getS();
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
			case AfplibPackage.GSAP__P:
				setP((Integer)newValue);
				return;
			case AfplibPackage.GSAP__Q:
				setQ((Integer)newValue);
				return;
			case AfplibPackage.GSAP__R:
				setR((Integer)newValue);
				return;
			case AfplibPackage.GSAP__S:
				setS((Integer)newValue);
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
			case AfplibPackage.GSAP__P:
				setP(P_EDEFAULT);
				return;
			case AfplibPackage.GSAP__Q:
				setQ(Q_EDEFAULT);
				return;
			case AfplibPackage.GSAP__R:
				setR(R_EDEFAULT);
				return;
			case AfplibPackage.GSAP__S:
				setS(S_EDEFAULT);
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
			case AfplibPackage.GSAP__P:
				return P_EDEFAULT == null ? p != null : !P_EDEFAULT.equals(p);
			case AfplibPackage.GSAP__Q:
				return Q_EDEFAULT == null ? q != null : !Q_EDEFAULT.equals(q);
			case AfplibPackage.GSAP__R:
				return R_EDEFAULT == null ? r != null : !R_EDEFAULT.equals(r);
			case AfplibPackage.GSAP__S:
				return S_EDEFAULT == null ? s != null : !S_EDEFAULT.equals(s);
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
		result.append(" (P: ");
		result.append(p);
		result.append(", Q: ");
		result.append(q);
		result.append(", R: ");
		result.append(r);
		result.append(", S: ");
		result.append(s);
		result.append(')');
		return result.toString();
	}

} //GSAPImpl
