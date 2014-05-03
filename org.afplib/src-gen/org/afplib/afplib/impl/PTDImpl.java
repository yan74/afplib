/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PTD;

import org.afplib.base.Triplet;

import org.afplib.base.impl.SFImpl;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.NotificationChain;

import org.eclipse.emf.common.util.EList;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.InternalEObject;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

import org.eclipse.emf.ecore.util.EObjectContainmentEList;
import org.eclipse.emf.ecore.util.InternalEList;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PTD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getXPBASE <em>XPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getYPBASE <em>YPBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getXPUNITVL <em>XPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getYPUNITVL <em>YPUNITVL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getXPEXTENT <em>XPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getYPEXTENT <em>YPEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PTDImpl#getCS <em>CS</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class PTDImpl extends SFImpl implements PTD {
	/**
	 * The default value of the '{@link #getXPBASE() <em>XPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPBASE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPBASE() <em>XPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPBASE()
	 * @generated
	 * @ordered
	 */
	protected Integer xpbase = XPBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPBASE() <em>YPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPBASE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPBASE() <em>YPBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPBASE()
	 * @generated
	 * @ordered
	 */
	protected Integer ypbase = YPBASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPUNITVL() <em>XPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPUNITVL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPUNITVL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPUNITVL() <em>XPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPUNITVL()
	 * @generated
	 * @ordered
	 */
	protected Integer xpunitvl = XPUNITVL_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPUNITVL() <em>YPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPUNITVL()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPUNITVL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPUNITVL() <em>YPUNITVL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPUNITVL()
	 * @generated
	 * @ordered
	 */
	protected Integer ypunitvl = YPUNITVL_EDEFAULT;

	/**
	 * The default value of the '{@link #getXPEXTENT() <em>XPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPEXTENT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XPEXTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXPEXTENT() <em>XPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXPEXTENT()
	 * @generated
	 * @ordered
	 */
	protected Integer xpextent = XPEXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getYPEXTENT() <em>YPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPEXTENT()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YPEXTENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYPEXTENT() <em>YPEXTENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYPEXTENT()
	 * @generated
	 * @ordered
	 */
	protected Integer ypextent = YPEXTENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRESERVED()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRESERVED() <em>RESERVED</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRESERVED()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The cached value of the '{@link #getCS() <em>CS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCS()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> cs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PTDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getPTD();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPBASE() {
		return xpbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPBASE(Integer newXPBASE) {
		Integer oldXPBASE = xpbase;
		xpbase = newXPBASE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__XPBASE, oldXPBASE, xpbase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPBASE() {
		return ypbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPBASE(Integer newYPBASE) {
		Integer oldYPBASE = ypbase;
		ypbase = newYPBASE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__YPBASE, oldYPBASE, ypbase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPUNITVL() {
		return xpunitvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPUNITVL(Integer newXPUNITVL) {
		Integer oldXPUNITVL = xpunitvl;
		xpunitvl = newXPUNITVL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__XPUNITVL, oldXPUNITVL, xpunitvl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPUNITVL() {
		return ypunitvl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPUNITVL(Integer newYPUNITVL) {
		Integer oldYPUNITVL = ypunitvl;
		ypunitvl = newYPUNITVL;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__YPUNITVL, oldYPUNITVL, ypunitvl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXPEXTENT() {
		return xpextent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXPEXTENT(Integer newXPEXTENT) {
		Integer oldXPEXTENT = xpextent;
		xpextent = newXPEXTENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__XPEXTENT, oldXPEXTENT, xpextent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYPEXTENT() {
		return ypextent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYPEXTENT(Integer newYPEXTENT) {
		Integer oldYPEXTENT = ypextent;
		ypextent = newYPEXTENT;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__YPEXTENT, oldYPEXTENT, ypextent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRESERVED() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRESERVED(Integer newRESERVED) {
		Integer oldRESERVED = reserved;
		reserved = newRESERVED;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PTD__RESERVED, oldRESERVED, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getCS() {
		if (cs == null) {
			cs = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.PTD__CS);
		}
		return cs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.PTD__CS:
				return ((InternalEList<?>)getCS()).basicRemove(otherEnd, msgs);
		}
		return super.eInverseRemove(otherEnd, featureID, msgs);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.PTD__XPBASE:
				return getXPBASE();
			case AfplibPackage.PTD__YPBASE:
				return getYPBASE();
			case AfplibPackage.PTD__XPUNITVL:
				return getXPUNITVL();
			case AfplibPackage.PTD__YPUNITVL:
				return getYPUNITVL();
			case AfplibPackage.PTD__XPEXTENT:
				return getXPEXTENT();
			case AfplibPackage.PTD__YPEXTENT:
				return getYPEXTENT();
			case AfplibPackage.PTD__RESERVED:
				return getRESERVED();
			case AfplibPackage.PTD__CS:
				return getCS();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@SuppressWarnings("unchecked")
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case AfplibPackage.PTD__XPBASE:
				setXPBASE((Integer)newValue);
				return;
			case AfplibPackage.PTD__YPBASE:
				setYPBASE((Integer)newValue);
				return;
			case AfplibPackage.PTD__XPUNITVL:
				setXPUNITVL((Integer)newValue);
				return;
			case AfplibPackage.PTD__YPUNITVL:
				setYPUNITVL((Integer)newValue);
				return;
			case AfplibPackage.PTD__XPEXTENT:
				setXPEXTENT((Integer)newValue);
				return;
			case AfplibPackage.PTD__YPEXTENT:
				setYPEXTENT((Integer)newValue);
				return;
			case AfplibPackage.PTD__RESERVED:
				setRESERVED((Integer)newValue);
				return;
			case AfplibPackage.PTD__CS:
				getCS().clear();
				getCS().addAll((Collection<? extends Triplet>)newValue);
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
			case AfplibPackage.PTD__XPBASE:
				setXPBASE(XPBASE_EDEFAULT);
				return;
			case AfplibPackage.PTD__YPBASE:
				setYPBASE(YPBASE_EDEFAULT);
				return;
			case AfplibPackage.PTD__XPUNITVL:
				setXPUNITVL(XPUNITVL_EDEFAULT);
				return;
			case AfplibPackage.PTD__YPUNITVL:
				setYPUNITVL(YPUNITVL_EDEFAULT);
				return;
			case AfplibPackage.PTD__XPEXTENT:
				setXPEXTENT(XPEXTENT_EDEFAULT);
				return;
			case AfplibPackage.PTD__YPEXTENT:
				setYPEXTENT(YPEXTENT_EDEFAULT);
				return;
			case AfplibPackage.PTD__RESERVED:
				setRESERVED(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.PTD__CS:
				getCS().clear();
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
			case AfplibPackage.PTD__XPBASE:
				return XPBASE_EDEFAULT == null ? xpbase != null : !XPBASE_EDEFAULT.equals(xpbase);
			case AfplibPackage.PTD__YPBASE:
				return YPBASE_EDEFAULT == null ? ypbase != null : !YPBASE_EDEFAULT.equals(ypbase);
			case AfplibPackage.PTD__XPUNITVL:
				return XPUNITVL_EDEFAULT == null ? xpunitvl != null : !XPUNITVL_EDEFAULT.equals(xpunitvl);
			case AfplibPackage.PTD__YPUNITVL:
				return YPUNITVL_EDEFAULT == null ? ypunitvl != null : !YPUNITVL_EDEFAULT.equals(ypunitvl);
			case AfplibPackage.PTD__XPEXTENT:
				return XPEXTENT_EDEFAULT == null ? xpextent != null : !XPEXTENT_EDEFAULT.equals(xpextent);
			case AfplibPackage.PTD__YPEXTENT:
				return YPEXTENT_EDEFAULT == null ? ypextent != null : !YPEXTENT_EDEFAULT.equals(ypextent);
			case AfplibPackage.PTD__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.PTD__CS:
				return cs != null && !cs.isEmpty();
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
		result.append(" (XPBASE: ");
		result.append(xpbase);
		result.append(", YPBASE: ");
		result.append(ypbase);
		result.append(", XPUNITVL: ");
		result.append(xpunitvl);
		result.append(", YPUNITVL: ");
		result.append(ypunitvl);
		result.append(", XPEXTENT: ");
		result.append(xpextent);
		result.append(", YPEXTENT: ");
		result.append(ypextent);
		result.append(", RESERVED: ");
		result.append(reserved);
		result.append(')');
		return result.toString();
	}

} //PTDImpl
