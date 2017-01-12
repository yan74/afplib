/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNORG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNORG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getCharRot <em>Char Rot</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getMaxBOset <em>Max BOset</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getMaxCharInc <em>Max Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getSpCharInc <em>Sp Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getMaxBExt <em>Max BExt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getOrntFlgs <em>Ornt Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getEmSpInc <em>Em Sp Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getReserved3 <em>Reserved3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getFigSpInc <em>Fig Sp Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getNomCharInc <em>Nom Char Inc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getDefBInc <em>Def BInc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNORGImpl#getMinASp <em>Min ASp</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNORGImpl extends TripletImpl implements FNORG {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharRot()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHAR_ROT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCharRot() <em>Char Rot</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCharRot()
	 * @generated
	 * @ordered
	 */
	protected Integer charRot = CHAR_ROT_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBOset() <em>Max BOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBOset()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_BOSET_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBOset() <em>Max BOset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBOset()
	 * @generated
	 * @ordered
	 */
	protected Integer maxBOset = MAX_BOSET_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxCharInc() <em>Max Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCharInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_CHAR_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxCharInc() <em>Max Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxCharInc()
	 * @generated
	 * @ordered
	 */
	protected Integer maxCharInc = MAX_CHAR_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getSpCharInc() <em>Sp Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpCharInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SP_CHAR_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSpCharInc() <em>Sp Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSpCharInc()
	 * @generated
	 * @ordered
	 */
	protected Integer spCharInc = SP_CHAR_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBExt() <em>Max BExt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBExt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_BEXT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBExt() <em>Max BExt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBExt()
	 * @generated
	 * @ordered
	 */
	protected Integer maxBExt = MAX_BEXT_EDEFAULT;

	/**
	 * The default value of the '{@link #getOrntFlgs() <em>Ornt Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrntFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer ORNT_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOrntFlgs() <em>Ornt Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOrntFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer orntFlgs = ORNT_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved2 = RESERVED2_EDEFAULT;

	/**
	 * The default value of the '{@link #getEmSpInc() <em>Em Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmSpInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer EM_SP_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getEmSpInc() <em>Em Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getEmSpInc()
	 * @generated
	 * @ordered
	 */
	protected Integer emSpInc = EM_SP_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved3() <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved3()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED3_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved3() <em>Reserved3</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved3()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved3 = RESERVED3_EDEFAULT;

	/**
	 * The default value of the '{@link #getFigSpInc() <em>Fig Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigSpInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FIG_SP_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFigSpInc() <em>Fig Sp Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFigSpInc()
	 * @generated
	 * @ordered
	 */
	protected Integer figSpInc = FIG_SP_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getNomCharInc() <em>Nom Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCharInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NOM_CHAR_INC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNomCharInc() <em>Nom Char Inc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNomCharInc()
	 * @generated
	 * @ordered
	 */
	protected Integer nomCharInc = NOM_CHAR_INC_EDEFAULT;

	/**
	 * The default value of the '{@link #getDefBInc() <em>Def BInc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefBInc()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DEF_BINC_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDefBInc() <em>Def BInc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDefBInc()
	 * @generated
	 * @ordered
	 */
	protected Integer defBInc = DEF_BINC_EDEFAULT;

	/**
	 * The default value of the '{@link #getMinASp() <em>Min ASp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MIN_ASP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMinASp() <em>Min ASp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMinASp()
	 * @generated
	 * @ordered
	 */
	protected Integer minASp = MIN_ASP_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNORGImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.FNORG;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Integer newReserved) {
		Integer oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCharRot() {
		return charRot;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCharRot(Integer newCharRot) {
		Integer oldCharRot = charRot;
		charRot = newCharRot;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__CHAR_ROT, oldCharRot, charRot));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxBOset() {
		return maxBOset;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBOset(Integer newMaxBOset) {
		Integer oldMaxBOset = maxBOset;
		maxBOset = newMaxBOset;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__MAX_BOSET, oldMaxBOset, maxBOset));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxCharInc() {
		return maxCharInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxCharInc(Integer newMaxCharInc) {
		Integer oldMaxCharInc = maxCharInc;
		maxCharInc = newMaxCharInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__MAX_CHAR_INC, oldMaxCharInc, maxCharInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSpCharInc() {
		return spCharInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSpCharInc(Integer newSpCharInc) {
		Integer oldSpCharInc = spCharInc;
		spCharInc = newSpCharInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__SP_CHAR_INC, oldSpCharInc, spCharInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxBExt() {
		return maxBExt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBExt(Integer newMaxBExt) {
		Integer oldMaxBExt = maxBExt;
		maxBExt = newMaxBExt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__MAX_BEXT, oldMaxBExt, maxBExt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOrntFlgs() {
		return orntFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOrntFlgs(Integer newOrntFlgs) {
		Integer oldOrntFlgs = orntFlgs;
		orntFlgs = newOrntFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__ORNT_FLGS, oldOrntFlgs, orntFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved2() {
		return reserved2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved2(Integer newReserved2) {
		Integer oldReserved2 = reserved2;
		reserved2 = newReserved2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__RESERVED2, oldReserved2, reserved2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getEmSpInc() {
		return emSpInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setEmSpInc(Integer newEmSpInc) {
		Integer oldEmSpInc = emSpInc;
		emSpInc = newEmSpInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__EM_SP_INC, oldEmSpInc, emSpInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved3() {
		return reserved3;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved3(Integer newReserved3) {
		Integer oldReserved3 = reserved3;
		reserved3 = newReserved3;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__RESERVED3, oldReserved3, reserved3));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFigSpInc() {
		return figSpInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFigSpInc(Integer newFigSpInc) {
		Integer oldFigSpInc = figSpInc;
		figSpInc = newFigSpInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__FIG_SP_INC, oldFigSpInc, figSpInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNomCharInc() {
		return nomCharInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNomCharInc(Integer newNomCharInc) {
		Integer oldNomCharInc = nomCharInc;
		nomCharInc = newNomCharInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__NOM_CHAR_INC, oldNomCharInc, nomCharInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDefBInc() {
		return defBInc;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDefBInc(Integer newDefBInc) {
		Integer oldDefBInc = defBInc;
		defBInc = newDefBInc;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__DEF_BINC, oldDefBInc, defBInc));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMinASp() {
		return minASp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMinASp(Integer newMinASp) {
		Integer oldMinASp = minASp;
		minASp = newMinASp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNORG__MIN_ASP, oldMinASp, minASp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FNORG__RESERVED:
				return getReserved();
			case AfplibPackage.FNORG__CHAR_ROT:
				return getCharRot();
			case AfplibPackage.FNORG__MAX_BOSET:
				return getMaxBOset();
			case AfplibPackage.FNORG__MAX_CHAR_INC:
				return getMaxCharInc();
			case AfplibPackage.FNORG__SP_CHAR_INC:
				return getSpCharInc();
			case AfplibPackage.FNORG__MAX_BEXT:
				return getMaxBExt();
			case AfplibPackage.FNORG__ORNT_FLGS:
				return getOrntFlgs();
			case AfplibPackage.FNORG__RESERVED2:
				return getReserved2();
			case AfplibPackage.FNORG__EM_SP_INC:
				return getEmSpInc();
			case AfplibPackage.FNORG__RESERVED3:
				return getReserved3();
			case AfplibPackage.FNORG__FIG_SP_INC:
				return getFigSpInc();
			case AfplibPackage.FNORG__NOM_CHAR_INC:
				return getNomCharInc();
			case AfplibPackage.FNORG__DEF_BINC:
				return getDefBInc();
			case AfplibPackage.FNORG__MIN_ASP:
				return getMinASp();
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
			case AfplibPackage.FNORG__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.FNORG__CHAR_ROT:
				setCharRot((Integer)newValue);
				return;
			case AfplibPackage.FNORG__MAX_BOSET:
				setMaxBOset((Integer)newValue);
				return;
			case AfplibPackage.FNORG__MAX_CHAR_INC:
				setMaxCharInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__SP_CHAR_INC:
				setSpCharInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__MAX_BEXT:
				setMaxBExt((Integer)newValue);
				return;
			case AfplibPackage.FNORG__ORNT_FLGS:
				setOrntFlgs((Integer)newValue);
				return;
			case AfplibPackage.FNORG__RESERVED2:
				setReserved2((Integer)newValue);
				return;
			case AfplibPackage.FNORG__EM_SP_INC:
				setEmSpInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__RESERVED3:
				setReserved3((Integer)newValue);
				return;
			case AfplibPackage.FNORG__FIG_SP_INC:
				setFigSpInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__NOM_CHAR_INC:
				setNomCharInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__DEF_BINC:
				setDefBInc((Integer)newValue);
				return;
			case AfplibPackage.FNORG__MIN_ASP:
				setMinASp((Integer)newValue);
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
			case AfplibPackage.FNORG__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.FNORG__CHAR_ROT:
				setCharRot(CHAR_ROT_EDEFAULT);
				return;
			case AfplibPackage.FNORG__MAX_BOSET:
				setMaxBOset(MAX_BOSET_EDEFAULT);
				return;
			case AfplibPackage.FNORG__MAX_CHAR_INC:
				setMaxCharInc(MAX_CHAR_INC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__SP_CHAR_INC:
				setSpCharInc(SP_CHAR_INC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__MAX_BEXT:
				setMaxBExt(MAX_BEXT_EDEFAULT);
				return;
			case AfplibPackage.FNORG__ORNT_FLGS:
				setOrntFlgs(ORNT_FLGS_EDEFAULT);
				return;
			case AfplibPackage.FNORG__RESERVED2:
				setReserved2(RESERVED2_EDEFAULT);
				return;
			case AfplibPackage.FNORG__EM_SP_INC:
				setEmSpInc(EM_SP_INC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__RESERVED3:
				setReserved3(RESERVED3_EDEFAULT);
				return;
			case AfplibPackage.FNORG__FIG_SP_INC:
				setFigSpInc(FIG_SP_INC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__NOM_CHAR_INC:
				setNomCharInc(NOM_CHAR_INC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__DEF_BINC:
				setDefBInc(DEF_BINC_EDEFAULT);
				return;
			case AfplibPackage.FNORG__MIN_ASP:
				setMinASp(MIN_ASP_EDEFAULT);
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
			case AfplibPackage.FNORG__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.FNORG__CHAR_ROT:
				return CHAR_ROT_EDEFAULT == null ? charRot != null : !CHAR_ROT_EDEFAULT.equals(charRot);
			case AfplibPackage.FNORG__MAX_BOSET:
				return MAX_BOSET_EDEFAULT == null ? maxBOset != null : !MAX_BOSET_EDEFAULT.equals(maxBOset);
			case AfplibPackage.FNORG__MAX_CHAR_INC:
				return MAX_CHAR_INC_EDEFAULT == null ? maxCharInc != null : !MAX_CHAR_INC_EDEFAULT.equals(maxCharInc);
			case AfplibPackage.FNORG__SP_CHAR_INC:
				return SP_CHAR_INC_EDEFAULT == null ? spCharInc != null : !SP_CHAR_INC_EDEFAULT.equals(spCharInc);
			case AfplibPackage.FNORG__MAX_BEXT:
				return MAX_BEXT_EDEFAULT == null ? maxBExt != null : !MAX_BEXT_EDEFAULT.equals(maxBExt);
			case AfplibPackage.FNORG__ORNT_FLGS:
				return ORNT_FLGS_EDEFAULT == null ? orntFlgs != null : !ORNT_FLGS_EDEFAULT.equals(orntFlgs);
			case AfplibPackage.FNORG__RESERVED2:
				return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
			case AfplibPackage.FNORG__EM_SP_INC:
				return EM_SP_INC_EDEFAULT == null ? emSpInc != null : !EM_SP_INC_EDEFAULT.equals(emSpInc);
			case AfplibPackage.FNORG__RESERVED3:
				return RESERVED3_EDEFAULT == null ? reserved3 != null : !RESERVED3_EDEFAULT.equals(reserved3);
			case AfplibPackage.FNORG__FIG_SP_INC:
				return FIG_SP_INC_EDEFAULT == null ? figSpInc != null : !FIG_SP_INC_EDEFAULT.equals(figSpInc);
			case AfplibPackage.FNORG__NOM_CHAR_INC:
				return NOM_CHAR_INC_EDEFAULT == null ? nomCharInc != null : !NOM_CHAR_INC_EDEFAULT.equals(nomCharInc);
			case AfplibPackage.FNORG__DEF_BINC:
				return DEF_BINC_EDEFAULT == null ? defBInc != null : !DEF_BINC_EDEFAULT.equals(defBInc);
			case AfplibPackage.FNORG__MIN_ASP:
				return MIN_ASP_EDEFAULT == null ? minASp != null : !MIN_ASP_EDEFAULT.equals(minASp);
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
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", CharRot: ");
		result.append(charRot);
		result.append(", MaxBOset: ");
		result.append(maxBOset);
		result.append(", MaxCharInc: ");
		result.append(maxCharInc);
		result.append(", SpCharInc: ");
		result.append(spCharInc);
		result.append(", MaxBExt: ");
		result.append(maxBExt);
		result.append(", OrntFlgs: ");
		result.append(orntFlgs);
		result.append(", Reserved2: ");
		result.append(reserved2);
		result.append(", EmSpInc: ");
		result.append(emSpInc);
		result.append(", Reserved3: ");
		result.append(reserved3);
		result.append(", FigSpInc: ");
		result.append(figSpInc);
		result.append(", NomCharInc: ");
		result.append(nomCharInc);
		result.append(", DefBInc: ");
		result.append(defBInc);
		result.append(", MinASp: ");
		result.append(minASp);
		result.append(')');
		return result.toString();
	}

} //FNORGImpl
