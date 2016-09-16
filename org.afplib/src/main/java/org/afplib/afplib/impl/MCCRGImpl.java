/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MCCRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>MCCRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MCCRGImpl#getStartnum <em>Startnum</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCCRGImpl#getStopnum <em>Stopnum</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MCCRGImpl#getMMCid <em>MM Cid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MCCRGImpl extends TripletImpl implements MCCRG {
	/**
	 * The default value of the '{@link #getStartnum() <em>Startnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartnum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STARTNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStartnum() <em>Startnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStartnum()
	 * @generated
	 * @ordered
	 */
	protected Integer startnum = STARTNUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getStopnum() <em>Stopnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopnum()
	 * @generated
	 * @ordered
	 */
	protected static final Integer STOPNUM_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getStopnum() <em>Stopnum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getStopnum()
	 * @generated
	 * @ordered
	 */
	protected Integer stopnum = STOPNUM_EDEFAULT;

	/**
	 * The default value of the '{@link #getMMCid() <em>MM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMCid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MM_CID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMMCid() <em>MM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMMCid()
	 * @generated
	 * @ordered
	 */
	protected Integer mmCid = MM_CID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected MCCRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMCCRG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStartnum() {
		return startnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStartnum(Integer newStartnum) {
		Integer oldStartnum = startnum;
		startnum = newStartnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCCRG__STARTNUM, oldStartnum, startnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getStopnum() {
		return stopnum;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setStopnum(Integer newStopnum) {
		Integer oldStopnum = stopnum;
		stopnum = newStopnum;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCCRG__STOPNUM, oldStopnum, stopnum));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMMCid() {
		return mmCid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMMCid(Integer newMMCid) {
		Integer oldMMCid = mmCid;
		mmCid = newMMCid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MCCRG__MM_CID, oldMMCid, mmCid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.MCCRG__STARTNUM:
				return getStartnum();
			case AfplibPackage.MCCRG__STOPNUM:
				return getStopnum();
			case AfplibPackage.MCCRG__MM_CID:
				return getMMCid();
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
			case AfplibPackage.MCCRG__STARTNUM:
				setStartnum((Integer)newValue);
				return;
			case AfplibPackage.MCCRG__STOPNUM:
				setStopnum((Integer)newValue);
				return;
			case AfplibPackage.MCCRG__MM_CID:
				setMMCid((Integer)newValue);
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
			case AfplibPackage.MCCRG__STARTNUM:
				setStartnum(STARTNUM_EDEFAULT);
				return;
			case AfplibPackage.MCCRG__STOPNUM:
				setStopnum(STOPNUM_EDEFAULT);
				return;
			case AfplibPackage.MCCRG__MM_CID:
				setMMCid(MM_CID_EDEFAULT);
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
			case AfplibPackage.MCCRG__STARTNUM:
				return STARTNUM_EDEFAULT == null ? startnum != null : !STARTNUM_EDEFAULT.equals(startnum);
			case AfplibPackage.MCCRG__STOPNUM:
				return STOPNUM_EDEFAULT == null ? stopnum != null : !STOPNUM_EDEFAULT.equals(stopnum);
			case AfplibPackage.MCCRG__MM_CID:
				return MM_CID_EDEFAULT == null ? mmCid != null : !MM_CID_EDEFAULT.equals(mmCid);
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
		result.append(" (Startnum: ");
		result.append(startnum);
		result.append(", Stopnum: ");
		result.append(stopnum);
		result.append(", MMCid: ");
		result.append(mmCid);
		result.append(')');
		return result.toString();
	}

} //MCCRGImpl
