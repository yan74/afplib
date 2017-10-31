/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.PGPRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>PGPRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getXmOset <em>Xm Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getYmOset <em>Ym Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getPGorient <em>PGorient</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getSHside <em>SHside</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getPgFlgs <em>Pg Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.PGPRGImpl#getPMCid <em>PM Cid</em>}</li>
 * </ul>
 *
 * @generated
 */
public class PGPRGImpl extends TripletImpl implements PGPRG {
	/**
	 * The default value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RG_LENGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRGLength() <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRGLength()
	 * @generated
	 * @ordered
	 */
	protected Integer rgLength = RG_LENGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getXmOset() <em>Xm Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XM_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXmOset() <em>Xm Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXmOset()
	 * @generated
	 * @ordered
	 */
	protected Integer xmOset = XM_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getYmOset() <em>Ym Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YM_OSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYmOset() <em>Ym Oset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYmOset()
	 * @generated
	 * @ordered
	 */
	protected Integer ymOset = YM_OSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getPGorient() <em>PGorient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGorient()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PGORIENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPGorient() <em>PGorient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPGorient()
	 * @generated
	 * @ordered
	 */
	protected Integer pGorient = PGORIENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getSHside() <em>SHside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHside()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SHSIDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSHside() <em>SHside</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSHside()
	 * @generated
	 * @ordered
	 */
	protected Integer sHside = SHSIDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getPgFlgs() <em>Pg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PG_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPgFlgs() <em>Pg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPgFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer pgFlgs = PG_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getPMCid() <em>PM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPMCid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PM_CID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPMCid() <em>PM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPMCid()
	 * @generated
	 * @ordered
	 */
	protected Integer pmCid = PM_CID_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected PGPRGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getPGPRG();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRGLength() {
		return rgLength;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRGLength(Integer newRGLength) {
		Integer oldRGLength = rgLength;
		rgLength = newRGLength;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__RG_LENGTH, oldRGLength, rgLength));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXmOset() {
		return xmOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXmOset(Integer newXmOset) {
		Integer oldXmOset = xmOset;
		xmOset = newXmOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__XM_OSET, oldXmOset, xmOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYmOset() {
		return ymOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYmOset(Integer newYmOset) {
		Integer oldYmOset = ymOset;
		ymOset = newYmOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__YM_OSET, oldYmOset, ymOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPGorient() {
		return pGorient;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPGorient(Integer newPGorient) {
		Integer oldPGorient = pGorient;
		pGorient = newPGorient;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__PGORIENT, oldPGorient, pGorient));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSHside() {
		return sHside;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSHside(Integer newSHside) {
		Integer oldSHside = sHside;
		sHside = newSHside;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__SHSIDE, oldSHside, sHside));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPgFlgs() {
		return pgFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPgFlgs(Integer newPgFlgs) {
		Integer oldPgFlgs = pgFlgs;
		pgFlgs = newPgFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__PG_FLGS, oldPgFlgs, pgFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPMCid() {
		return pmCid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPMCid(Integer newPMCid) {
		Integer oldPMCid = pmCid;
		pmCid = newPMCid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.PGPRG__PM_CID, oldPMCid, pmCid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.PGPRG__RG_LENGTH:
				return getRGLength();
			case AfplibPackage.PGPRG__XM_OSET:
				return getXmOset();
			case AfplibPackage.PGPRG__YM_OSET:
				return getYmOset();
			case AfplibPackage.PGPRG__PGORIENT:
				return getPGorient();
			case AfplibPackage.PGPRG__SHSIDE:
				return getSHside();
			case AfplibPackage.PGPRG__PG_FLGS:
				return getPgFlgs();
			case AfplibPackage.PGPRG__PM_CID:
				return getPMCid();
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
			case AfplibPackage.PGPRG__RG_LENGTH:
				setRGLength((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__XM_OSET:
				setXmOset((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__YM_OSET:
				setYmOset((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__PGORIENT:
				setPGorient((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__SHSIDE:
				setSHside((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__PG_FLGS:
				setPgFlgs((Integer)newValue);
				return;
			case AfplibPackage.PGPRG__PM_CID:
				setPMCid((Integer)newValue);
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
			case AfplibPackage.PGPRG__RG_LENGTH:
				setRGLength(RG_LENGTH_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__XM_OSET:
				setXmOset(XM_OSET_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__YM_OSET:
				setYmOset(YM_OSET_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__PGORIENT:
				setPGorient(PGORIENT_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__SHSIDE:
				setSHside(SHSIDE_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__PG_FLGS:
				setPgFlgs(PG_FLGS_EDEFAULT);
				return;
			case AfplibPackage.PGPRG__PM_CID:
				setPMCid(PM_CID_EDEFAULT);
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
			case AfplibPackage.PGPRG__RG_LENGTH:
				return RG_LENGTH_EDEFAULT == null ? rgLength != null : !RG_LENGTH_EDEFAULT.equals(rgLength);
			case AfplibPackage.PGPRG__XM_OSET:
				return XM_OSET_EDEFAULT == null ? xmOset != null : !XM_OSET_EDEFAULT.equals(xmOset);
			case AfplibPackage.PGPRG__YM_OSET:
				return YM_OSET_EDEFAULT == null ? ymOset != null : !YM_OSET_EDEFAULT.equals(ymOset);
			case AfplibPackage.PGPRG__PGORIENT:
				return PGORIENT_EDEFAULT == null ? pGorient != null : !PGORIENT_EDEFAULT.equals(pGorient);
			case AfplibPackage.PGPRG__SHSIDE:
				return SHSIDE_EDEFAULT == null ? sHside != null : !SHSIDE_EDEFAULT.equals(sHside);
			case AfplibPackage.PGPRG__PG_FLGS:
				return PG_FLGS_EDEFAULT == null ? pgFlgs != null : !PG_FLGS_EDEFAULT.equals(pgFlgs);
			case AfplibPackage.PGPRG__PM_CID:
				return PM_CID_EDEFAULT == null ? pmCid != null : !PM_CID_EDEFAULT.equals(pmCid);
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
		result.append(" (RGLength: ");
		result.append(rgLength);
		result.append(", XmOset: ");
		result.append(xmOset);
		result.append(", YmOset: ");
		result.append(ymOset);
		result.append(", PGorient: ");
		result.append(pGorient);
		result.append(", SHside: ");
		result.append(sHside);
		result.append(", PgFlgs: ");
		result.append(pgFlgs);
		result.append(", PMCid: ");
		result.append(pmCid);
		result.append(')');
		return result.toString();
	}

} //PGPRGImpl
