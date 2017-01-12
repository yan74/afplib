/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LocaleSelector;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Locale Selector</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getLocFlgs <em>Loc Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getLangCode <em>Lang Code</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getScrptCde <em>Scrpt Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getRegCde <em>Reg Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LocaleSelectorImpl#getVarCde <em>Var Cde</em>}</li>
 * </ul>
 *
 * @generated
 */
public class LocaleSelectorImpl extends TripletImpl implements LocaleSelector {
	/**
	 * The default value of the '{@link #getLocFlgs() <em>Loc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LOC_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLocFlgs() <em>Loc Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLocFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer locFlgs = LOC_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getLangCode() <em>Lang Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode()
	 * @generated
	 * @ordered
	 */
	protected static final String LANG_CODE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLangCode() <em>Lang Code</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLangCode()
	 * @generated
	 * @ordered
	 */
	protected String langCode = LANG_CODE_EDEFAULT;

	/**
	 * The default value of the '{@link #getScrptCde() <em>Scrpt Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrptCde()
	 * @generated
	 * @ordered
	 */
	protected static final String SCRPT_CDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getScrptCde() <em>Scrpt Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getScrptCde()
	 * @generated
	 * @ordered
	 */
	protected String scrptCde = SCRPT_CDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRegCde() <em>Reg Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegCde()
	 * @generated
	 * @ordered
	 */
	protected static final String REG_CDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRegCde() <em>Reg Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRegCde()
	 * @generated
	 * @ordered
	 */
	protected String regCde = REG_CDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getVarCde() <em>Var Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarCde()
	 * @generated
	 * @ordered
	 */
	protected static final String VAR_CDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getVarCde() <em>Var Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getVarCde()
	 * @generated
	 * @ordered
	 */
	protected String varCde = VAR_CDE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected LocaleSelectorImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.LOCALE_SELECTOR;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLocFlgs() {
		return locFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLocFlgs(Integer newLocFlgs) {
		Integer oldLocFlgs = locFlgs;
		locFlgs = newLocFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__LOC_FLGS, oldLocFlgs, locFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLangCode() {
		return langCode;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLangCode(String newLangCode) {
		String oldLangCode = langCode;
		langCode = newLangCode;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__LANG_CODE, oldLangCode, langCode));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getScrptCde() {
		return scrptCde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setScrptCde(String newScrptCde) {
		String oldScrptCde = scrptCde;
		scrptCde = newScrptCde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__SCRPT_CDE, oldScrptCde, scrptCde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getRegCde() {
		return regCde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRegCde(String newRegCde) {
		String oldRegCde = regCde;
		regCde = newRegCde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__REG_CDE, oldRegCde, regCde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(byte[] newReserved) {
		byte[] oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getVarCde() {
		return varCde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setVarCde(String newVarCde) {
		String oldVarCde = varCde;
		varCde = newVarCde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LOCALE_SELECTOR__VAR_CDE, oldVarCde, varCde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.LOCALE_SELECTOR__LOC_FLGS:
				return getLocFlgs();
			case AfplibPackage.LOCALE_SELECTOR__LANG_CODE:
				return getLangCode();
			case AfplibPackage.LOCALE_SELECTOR__SCRPT_CDE:
				return getScrptCde();
			case AfplibPackage.LOCALE_SELECTOR__REG_CDE:
				return getRegCde();
			case AfplibPackage.LOCALE_SELECTOR__RESERVED:
				return getReserved();
			case AfplibPackage.LOCALE_SELECTOR__VAR_CDE:
				return getVarCde();
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
			case AfplibPackage.LOCALE_SELECTOR__LOC_FLGS:
				setLocFlgs((Integer)newValue);
				return;
			case AfplibPackage.LOCALE_SELECTOR__LANG_CODE:
				setLangCode((String)newValue);
				return;
			case AfplibPackage.LOCALE_SELECTOR__SCRPT_CDE:
				setScrptCde((String)newValue);
				return;
			case AfplibPackage.LOCALE_SELECTOR__REG_CDE:
				setRegCde((String)newValue);
				return;
			case AfplibPackage.LOCALE_SELECTOR__RESERVED:
				setReserved((byte[])newValue);
				return;
			case AfplibPackage.LOCALE_SELECTOR__VAR_CDE:
				setVarCde((String)newValue);
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
			case AfplibPackage.LOCALE_SELECTOR__LOC_FLGS:
				setLocFlgs(LOC_FLGS_EDEFAULT);
				return;
			case AfplibPackage.LOCALE_SELECTOR__LANG_CODE:
				setLangCode(LANG_CODE_EDEFAULT);
				return;
			case AfplibPackage.LOCALE_SELECTOR__SCRPT_CDE:
				setScrptCde(SCRPT_CDE_EDEFAULT);
				return;
			case AfplibPackage.LOCALE_SELECTOR__REG_CDE:
				setRegCde(REG_CDE_EDEFAULT);
				return;
			case AfplibPackage.LOCALE_SELECTOR__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.LOCALE_SELECTOR__VAR_CDE:
				setVarCde(VAR_CDE_EDEFAULT);
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
			case AfplibPackage.LOCALE_SELECTOR__LOC_FLGS:
				return LOC_FLGS_EDEFAULT == null ? locFlgs != null : !LOC_FLGS_EDEFAULT.equals(locFlgs);
			case AfplibPackage.LOCALE_SELECTOR__LANG_CODE:
				return LANG_CODE_EDEFAULT == null ? langCode != null : !LANG_CODE_EDEFAULT.equals(langCode);
			case AfplibPackage.LOCALE_SELECTOR__SCRPT_CDE:
				return SCRPT_CDE_EDEFAULT == null ? scrptCde != null : !SCRPT_CDE_EDEFAULT.equals(scrptCde);
			case AfplibPackage.LOCALE_SELECTOR__REG_CDE:
				return REG_CDE_EDEFAULT == null ? regCde != null : !REG_CDE_EDEFAULT.equals(regCde);
			case AfplibPackage.LOCALE_SELECTOR__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.LOCALE_SELECTOR__VAR_CDE:
				return VAR_CDE_EDEFAULT == null ? varCde != null : !VAR_CDE_EDEFAULT.equals(varCde);
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
		result.append(" (LocFlgs: ");
		result.append(locFlgs);
		result.append(", LangCode: ");
		result.append(langCode);
		result.append(", ScrptCde: ");
		result.append(scrptCde);
		result.append(", RegCde: ");
		result.append(regCde);
		result.append(", Reserved: ");
		result.append(reserved);
		result.append(", VarCde: ");
		result.append(varCde);
		result.append(')');
		return result.toString();
	}

} //LocaleSelectorImpl
