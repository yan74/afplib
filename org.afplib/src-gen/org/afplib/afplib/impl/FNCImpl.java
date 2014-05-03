/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNC;

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
 * An implementation of the model object '<em><b>FNC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getRetired <em>Retired</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getPatTech <em>Pat Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getReserved1 <em>Reserved1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFntFlags <em>Fnt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getXUnitBase <em>XUnit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getYUnitBase <em>YUnit Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getXftUnits <em>Xft Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getYftUnits <em>Yft Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getMaxBoxWd <em>Max Box Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getMaxBoxHt <em>Max Box Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNORGLen <em>FNORG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNIRGLen <em>FNIRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getPatAlign <em>Pat Align</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getRPatDCnt <em>RPat DCnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNPRGLen <em>FNPRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNMRGLen <em>FNMRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getResXUBase <em>Res XU Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getResYUBase <em>Res YU Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getXfrUnits <em>Xfr Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getYfrUnits <em>Yfr Units</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getOPatDCnt <em>OPat DCnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNNRGLen <em>FNNRG Len</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNNDCnt <em>FNND Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getFNNMapCnt <em>FNN Map Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNCImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FNCImpl extends SFImpl implements FNC {
	/**
	 * The default value of the '{@link #getRetired() <em>Retired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RETIRED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRetired() <em>Retired</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRetired()
	 * @generated
	 * @ordered
	 */
	protected Integer retired = RETIRED_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatTech() <em>Pat Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatTech()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAT_TECH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatTech() <em>Pat Tech</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatTech()
	 * @generated
	 * @ordered
	 */
	protected Integer patTech = PAT_TECH_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved1() <em>Reserved1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved1()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED1_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved1() <em>Reserved1</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved1()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved1 = RESERVED1_EDEFAULT;

	/**
	 * The default value of the '{@link #getFntFlags() <em>Fnt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFntFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNT_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFntFlags() <em>Fnt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFntFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer fntFlags = FNT_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getXUnitBase() <em>XUnit Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnitBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XUNIT_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXUnitBase() <em>XUnit Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXUnitBase()
	 * @generated
	 * @ordered
	 */
	protected Integer xUnitBase = XUNIT_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYUnitBase() <em>YUnit Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnitBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YUNIT_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYUnitBase() <em>YUnit Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYUnitBase()
	 * @generated
	 * @ordered
	 */
	protected Integer yUnitBase = YUNIT_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXftUnits() <em>Xft Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXftUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XFT_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXftUnits() <em>Xft Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXftUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xftUnits = XFT_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYftUnits() <em>Yft Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYftUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YFT_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYftUnits() <em>Yft Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYftUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer yftUnits = YFT_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBoxWd() <em>Max Box Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBoxWd()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_BOX_WD_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBoxWd() <em>Max Box Wd</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBoxWd()
	 * @generated
	 * @ordered
	 */
	protected Integer maxBoxWd = MAX_BOX_WD_EDEFAULT;

	/**
	 * The default value of the '{@link #getMaxBoxHt() <em>Max Box Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBoxHt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MAX_BOX_HT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMaxBoxHt() <em>Max Box Ht</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMaxBoxHt()
	 * @generated
	 * @ordered
	 */
	protected Integer maxBoxHt = MAX_BOX_HT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNORGLen() <em>FNORG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNORGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNORG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNORGLen() <em>FNORG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNORGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer fnorgLen = FNORG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNIRGLen() <em>FNIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNIRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNIRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNIRGLen() <em>FNIRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNIRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer fnirgLen = FNIRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getPatAlign() <em>Pat Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatAlign()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PAT_ALIGN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPatAlign() <em>Pat Align</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPatAlign()
	 * @generated
	 * @ordered
	 */
	protected Integer patAlign = PAT_ALIGN_EDEFAULT;

	/**
	 * The default value of the '{@link #getRPatDCnt() <em>RPat DCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPatDCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RPAT_DCNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRPatDCnt() <em>RPat DCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRPatDCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer rPatDCnt = RPAT_DCNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNPRGLen() <em>FNPRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNPRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNPRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNPRGLen() <em>FNPRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNPRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer fnprgLen = FNPRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNMRGLen() <em>FNMRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNMRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNMRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNMRGLen() <em>FNMRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNMRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer fnmrgLen = FNMRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getResXUBase() <em>Res XU Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResXUBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_XU_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResXUBase() <em>Res XU Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResXUBase()
	 * @generated
	 * @ordered
	 */
	protected Integer resXUBase = RES_XU_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getResYUBase() <em>Res YU Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResYUBase()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RES_YU_BASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getResYUBase() <em>Res YU Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getResYUBase()
	 * @generated
	 * @ordered
	 */
	protected Integer resYUBase = RES_YU_BASE_EDEFAULT;

	/**
	 * The default value of the '{@link #getXfrUnits() <em>Xfr Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXfrUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XFR_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXfrUnits() <em>Xfr Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXfrUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer xfrUnits = XFR_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getYfrUnits() <em>Yfr Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYfrUnits()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YFR_UNITS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYfrUnits() <em>Yfr Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYfrUnits()
	 * @generated
	 * @ordered
	 */
	protected Integer yfrUnits = YFR_UNITS_EDEFAULT;

	/**
	 * The default value of the '{@link #getOPatDCnt() <em>OPat DCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOPatDCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OPAT_DCNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOPatDCnt() <em>OPat DCnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOPatDCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer oPatDCnt = OPAT_DCNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] RESERVED2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected byte[] reserved2 = RESERVED2_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNNRGLen() <em>FNNRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNRGLen()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNNRG_LEN_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNNRGLen() <em>FNNRG Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNRGLen()
	 * @generated
	 * @ordered
	 */
	protected Integer fnnrgLen = FNNRG_LEN_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNNDCnt() <em>FNND Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNDCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNND_CNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNNDCnt() <em>FNND Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNDCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer fnndCnt = FNND_CNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFNNMapCnt() <em>FNN Map Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNMapCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNN_MAP_CNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFNNMapCnt() <em>FNN Map Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFNNMapCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer fnnMapCnt = FNN_MAP_CNT_EDEFAULT;

	/**
	 * The cached value of the '{@link #getTriplets() <em>Triplets</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTriplets()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> triplets;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FNCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFNC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRetired() {
		return retired;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRetired(Integer newRetired) {
		Integer oldRetired = retired;
		retired = newRetired;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RETIRED, oldRetired, retired));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPatTech() {
		return patTech;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatTech(Integer newPatTech) {
		Integer oldPatTech = patTech;
		patTech = newPatTech;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__PAT_TECH, oldPatTech, patTech));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved1() {
		return reserved1;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved1(byte[] newReserved1) {
		byte[] oldReserved1 = reserved1;
		reserved1 = newReserved1;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RESERVED1, oldReserved1, reserved1));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFntFlags() {
		return fntFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFntFlags(Integer newFntFlags) {
		Integer oldFntFlags = fntFlags;
		fntFlags = newFntFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNT_FLAGS, oldFntFlags, fntFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXUnitBase() {
		return xUnitBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXUnitBase(Integer newXUnitBase) {
		Integer oldXUnitBase = xUnitBase;
		xUnitBase = newXUnitBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__XUNIT_BASE, oldXUnitBase, xUnitBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYUnitBase() {
		return yUnitBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYUnitBase(Integer newYUnitBase) {
		Integer oldYUnitBase = yUnitBase;
		yUnitBase = newYUnitBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__YUNIT_BASE, oldYUnitBase, yUnitBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXftUnits() {
		return xftUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXftUnits(Integer newXftUnits) {
		Integer oldXftUnits = xftUnits;
		xftUnits = newXftUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__XFT_UNITS, oldXftUnits, xftUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYftUnits() {
		return yftUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYftUnits(Integer newYftUnits) {
		Integer oldYftUnits = yftUnits;
		yftUnits = newYftUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__YFT_UNITS, oldYftUnits, yftUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxBoxWd() {
		return maxBoxWd;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBoxWd(Integer newMaxBoxWd) {
		Integer oldMaxBoxWd = maxBoxWd;
		maxBoxWd = newMaxBoxWd;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__MAX_BOX_WD, oldMaxBoxWd, maxBoxWd));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMaxBoxHt() {
		return maxBoxHt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMaxBoxHt(Integer newMaxBoxHt) {
		Integer oldMaxBoxHt = maxBoxHt;
		maxBoxHt = newMaxBoxHt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__MAX_BOX_HT, oldMaxBoxHt, maxBoxHt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNORGLen() {
		return fnorgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNORGLen(Integer newFNORGLen) {
		Integer oldFNORGLen = fnorgLen;
		fnorgLen = newFNORGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNORG_LEN, oldFNORGLen, fnorgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNIRGLen() {
		return fnirgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNIRGLen(Integer newFNIRGLen) {
		Integer oldFNIRGLen = fnirgLen;
		fnirgLen = newFNIRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNIRG_LEN, oldFNIRGLen, fnirgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPatAlign() {
		return patAlign;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPatAlign(Integer newPatAlign) {
		Integer oldPatAlign = patAlign;
		patAlign = newPatAlign;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__PAT_ALIGN, oldPatAlign, patAlign));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRPatDCnt() {
		return rPatDCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRPatDCnt(Integer newRPatDCnt) {
		Integer oldRPatDCnt = rPatDCnt;
		rPatDCnt = newRPatDCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RPAT_DCNT, oldRPatDCnt, rPatDCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNPRGLen() {
		return fnprgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNPRGLen(Integer newFNPRGLen) {
		Integer oldFNPRGLen = fnprgLen;
		fnprgLen = newFNPRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNPRG_LEN, oldFNPRGLen, fnprgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNMRGLen() {
		return fnmrgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNMRGLen(Integer newFNMRGLen) {
		Integer oldFNMRGLen = fnmrgLen;
		fnmrgLen = newFNMRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNMRG_LEN, oldFNMRGLen, fnmrgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResXUBase() {
		return resXUBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResXUBase(Integer newResXUBase) {
		Integer oldResXUBase = resXUBase;
		resXUBase = newResXUBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RES_XU_BASE, oldResXUBase, resXUBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getResYUBase() {
		return resYUBase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setResYUBase(Integer newResYUBase) {
		Integer oldResYUBase = resYUBase;
		resYUBase = newResYUBase;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RES_YU_BASE, oldResYUBase, resYUBase));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXfrUnits() {
		return xfrUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXfrUnits(Integer newXfrUnits) {
		Integer oldXfrUnits = xfrUnits;
		xfrUnits = newXfrUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__XFR_UNITS, oldXfrUnits, xfrUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYfrUnits() {
		return yfrUnits;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYfrUnits(Integer newYfrUnits) {
		Integer oldYfrUnits = yfrUnits;
		yfrUnits = newYfrUnits;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__YFR_UNITS, oldYfrUnits, yfrUnits));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOPatDCnt() {
		return oPatDCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOPatDCnt(Integer newOPatDCnt) {
		Integer oldOPatDCnt = oPatDCnt;
		oPatDCnt = newOPatDCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__OPAT_DCNT, oldOPatDCnt, oPatDCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getReserved2() {
		return reserved2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved2(byte[] newReserved2) {
		byte[] oldReserved2 = reserved2;
		reserved2 = newReserved2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__RESERVED2, oldReserved2, reserved2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNNRGLen() {
		return fnnrgLen;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNNRGLen(Integer newFNNRGLen) {
		Integer oldFNNRGLen = fnnrgLen;
		fnnrgLen = newFNNRGLen;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNNRG_LEN, oldFNNRGLen, fnnrgLen));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNNDCnt() {
		return fnndCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNNDCnt(Integer newFNNDCnt) {
		Integer oldFNNDCnt = fnndCnt;
		fnndCnt = newFNNDCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNND_CNT, oldFNNDCnt, fnndCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFNNMapCnt() {
		return fnnMapCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFNNMapCnt(Integer newFNNMapCnt) {
		Integer oldFNNMapCnt = fnnMapCnt;
		fnnMapCnt = newFNNMapCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNC__FNN_MAP_CNT, oldFNNMapCnt, fnnMapCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.FNC__TRIPLETS);
		}
		return triplets;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.FNC__TRIPLETS:
				return ((InternalEList<?>)getTriplets()).basicRemove(otherEnd, msgs);
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
			case AfplibPackage.FNC__RETIRED:
				return getRetired();
			case AfplibPackage.FNC__PAT_TECH:
				return getPatTech();
			case AfplibPackage.FNC__RESERVED1:
				return getReserved1();
			case AfplibPackage.FNC__FNT_FLAGS:
				return getFntFlags();
			case AfplibPackage.FNC__XUNIT_BASE:
				return getXUnitBase();
			case AfplibPackage.FNC__YUNIT_BASE:
				return getYUnitBase();
			case AfplibPackage.FNC__XFT_UNITS:
				return getXftUnits();
			case AfplibPackage.FNC__YFT_UNITS:
				return getYftUnits();
			case AfplibPackage.FNC__MAX_BOX_WD:
				return getMaxBoxWd();
			case AfplibPackage.FNC__MAX_BOX_HT:
				return getMaxBoxHt();
			case AfplibPackage.FNC__FNORG_LEN:
				return getFNORGLen();
			case AfplibPackage.FNC__FNIRG_LEN:
				return getFNIRGLen();
			case AfplibPackage.FNC__PAT_ALIGN:
				return getPatAlign();
			case AfplibPackage.FNC__RPAT_DCNT:
				return getRPatDCnt();
			case AfplibPackage.FNC__FNPRG_LEN:
				return getFNPRGLen();
			case AfplibPackage.FNC__FNMRG_LEN:
				return getFNMRGLen();
			case AfplibPackage.FNC__RES_XU_BASE:
				return getResXUBase();
			case AfplibPackage.FNC__RES_YU_BASE:
				return getResYUBase();
			case AfplibPackage.FNC__XFR_UNITS:
				return getXfrUnits();
			case AfplibPackage.FNC__YFR_UNITS:
				return getYfrUnits();
			case AfplibPackage.FNC__OPAT_DCNT:
				return getOPatDCnt();
			case AfplibPackage.FNC__RESERVED2:
				return getReserved2();
			case AfplibPackage.FNC__FNNRG_LEN:
				return getFNNRGLen();
			case AfplibPackage.FNC__FNND_CNT:
				return getFNNDCnt();
			case AfplibPackage.FNC__FNN_MAP_CNT:
				return getFNNMapCnt();
			case AfplibPackage.FNC__TRIPLETS:
				return getTriplets();
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
			case AfplibPackage.FNC__RETIRED:
				setRetired((Integer)newValue);
				return;
			case AfplibPackage.FNC__PAT_TECH:
				setPatTech((Integer)newValue);
				return;
			case AfplibPackage.FNC__RESERVED1:
				setReserved1((byte[])newValue);
				return;
			case AfplibPackage.FNC__FNT_FLAGS:
				setFntFlags((Integer)newValue);
				return;
			case AfplibPackage.FNC__XUNIT_BASE:
				setXUnitBase((Integer)newValue);
				return;
			case AfplibPackage.FNC__YUNIT_BASE:
				setYUnitBase((Integer)newValue);
				return;
			case AfplibPackage.FNC__XFT_UNITS:
				setXftUnits((Integer)newValue);
				return;
			case AfplibPackage.FNC__YFT_UNITS:
				setYftUnits((Integer)newValue);
				return;
			case AfplibPackage.FNC__MAX_BOX_WD:
				setMaxBoxWd((Integer)newValue);
				return;
			case AfplibPackage.FNC__MAX_BOX_HT:
				setMaxBoxHt((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNORG_LEN:
				setFNORGLen((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNIRG_LEN:
				setFNIRGLen((Integer)newValue);
				return;
			case AfplibPackage.FNC__PAT_ALIGN:
				setPatAlign((Integer)newValue);
				return;
			case AfplibPackage.FNC__RPAT_DCNT:
				setRPatDCnt((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNPRG_LEN:
				setFNPRGLen((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNMRG_LEN:
				setFNMRGLen((Integer)newValue);
				return;
			case AfplibPackage.FNC__RES_XU_BASE:
				setResXUBase((Integer)newValue);
				return;
			case AfplibPackage.FNC__RES_YU_BASE:
				setResYUBase((Integer)newValue);
				return;
			case AfplibPackage.FNC__XFR_UNITS:
				setXfrUnits((Integer)newValue);
				return;
			case AfplibPackage.FNC__YFR_UNITS:
				setYfrUnits((Integer)newValue);
				return;
			case AfplibPackage.FNC__OPAT_DCNT:
				setOPatDCnt((Integer)newValue);
				return;
			case AfplibPackage.FNC__RESERVED2:
				setReserved2((byte[])newValue);
				return;
			case AfplibPackage.FNC__FNNRG_LEN:
				setFNNRGLen((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNND_CNT:
				setFNNDCnt((Integer)newValue);
				return;
			case AfplibPackage.FNC__FNN_MAP_CNT:
				setFNNMapCnt((Integer)newValue);
				return;
			case AfplibPackage.FNC__TRIPLETS:
				getTriplets().clear();
				getTriplets().addAll((Collection<? extends Triplet>)newValue);
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
			case AfplibPackage.FNC__RETIRED:
				setRetired(RETIRED_EDEFAULT);
				return;
			case AfplibPackage.FNC__PAT_TECH:
				setPatTech(PAT_TECH_EDEFAULT);
				return;
			case AfplibPackage.FNC__RESERVED1:
				setReserved1(RESERVED1_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNT_FLAGS:
				setFntFlags(FNT_FLAGS_EDEFAULT);
				return;
			case AfplibPackage.FNC__XUNIT_BASE:
				setXUnitBase(XUNIT_BASE_EDEFAULT);
				return;
			case AfplibPackage.FNC__YUNIT_BASE:
				setYUnitBase(YUNIT_BASE_EDEFAULT);
				return;
			case AfplibPackage.FNC__XFT_UNITS:
				setXftUnits(XFT_UNITS_EDEFAULT);
				return;
			case AfplibPackage.FNC__YFT_UNITS:
				setYftUnits(YFT_UNITS_EDEFAULT);
				return;
			case AfplibPackage.FNC__MAX_BOX_WD:
				setMaxBoxWd(MAX_BOX_WD_EDEFAULT);
				return;
			case AfplibPackage.FNC__MAX_BOX_HT:
				setMaxBoxHt(MAX_BOX_HT_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNORG_LEN:
				setFNORGLen(FNORG_LEN_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNIRG_LEN:
				setFNIRGLen(FNIRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.FNC__PAT_ALIGN:
				setPatAlign(PAT_ALIGN_EDEFAULT);
				return;
			case AfplibPackage.FNC__RPAT_DCNT:
				setRPatDCnt(RPAT_DCNT_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNPRG_LEN:
				setFNPRGLen(FNPRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNMRG_LEN:
				setFNMRGLen(FNMRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.FNC__RES_XU_BASE:
				setResXUBase(RES_XU_BASE_EDEFAULT);
				return;
			case AfplibPackage.FNC__RES_YU_BASE:
				setResYUBase(RES_YU_BASE_EDEFAULT);
				return;
			case AfplibPackage.FNC__XFR_UNITS:
				setXfrUnits(XFR_UNITS_EDEFAULT);
				return;
			case AfplibPackage.FNC__YFR_UNITS:
				setYfrUnits(YFR_UNITS_EDEFAULT);
				return;
			case AfplibPackage.FNC__OPAT_DCNT:
				setOPatDCnt(OPAT_DCNT_EDEFAULT);
				return;
			case AfplibPackage.FNC__RESERVED2:
				setReserved2(RESERVED2_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNNRG_LEN:
				setFNNRGLen(FNNRG_LEN_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNND_CNT:
				setFNNDCnt(FNND_CNT_EDEFAULT);
				return;
			case AfplibPackage.FNC__FNN_MAP_CNT:
				setFNNMapCnt(FNN_MAP_CNT_EDEFAULT);
				return;
			case AfplibPackage.FNC__TRIPLETS:
				getTriplets().clear();
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
			case AfplibPackage.FNC__RETIRED:
				return RETIRED_EDEFAULT == null ? retired != null : !RETIRED_EDEFAULT.equals(retired);
			case AfplibPackage.FNC__PAT_TECH:
				return PAT_TECH_EDEFAULT == null ? patTech != null : !PAT_TECH_EDEFAULT.equals(patTech);
			case AfplibPackage.FNC__RESERVED1:
				return RESERVED1_EDEFAULT == null ? reserved1 != null : !RESERVED1_EDEFAULT.equals(reserved1);
			case AfplibPackage.FNC__FNT_FLAGS:
				return FNT_FLAGS_EDEFAULT == null ? fntFlags != null : !FNT_FLAGS_EDEFAULT.equals(fntFlags);
			case AfplibPackage.FNC__XUNIT_BASE:
				return XUNIT_BASE_EDEFAULT == null ? xUnitBase != null : !XUNIT_BASE_EDEFAULT.equals(xUnitBase);
			case AfplibPackage.FNC__YUNIT_BASE:
				return YUNIT_BASE_EDEFAULT == null ? yUnitBase != null : !YUNIT_BASE_EDEFAULT.equals(yUnitBase);
			case AfplibPackage.FNC__XFT_UNITS:
				return XFT_UNITS_EDEFAULT == null ? xftUnits != null : !XFT_UNITS_EDEFAULT.equals(xftUnits);
			case AfplibPackage.FNC__YFT_UNITS:
				return YFT_UNITS_EDEFAULT == null ? yftUnits != null : !YFT_UNITS_EDEFAULT.equals(yftUnits);
			case AfplibPackage.FNC__MAX_BOX_WD:
				return MAX_BOX_WD_EDEFAULT == null ? maxBoxWd != null : !MAX_BOX_WD_EDEFAULT.equals(maxBoxWd);
			case AfplibPackage.FNC__MAX_BOX_HT:
				return MAX_BOX_HT_EDEFAULT == null ? maxBoxHt != null : !MAX_BOX_HT_EDEFAULT.equals(maxBoxHt);
			case AfplibPackage.FNC__FNORG_LEN:
				return FNORG_LEN_EDEFAULT == null ? fnorgLen != null : !FNORG_LEN_EDEFAULT.equals(fnorgLen);
			case AfplibPackage.FNC__FNIRG_LEN:
				return FNIRG_LEN_EDEFAULT == null ? fnirgLen != null : !FNIRG_LEN_EDEFAULT.equals(fnirgLen);
			case AfplibPackage.FNC__PAT_ALIGN:
				return PAT_ALIGN_EDEFAULT == null ? patAlign != null : !PAT_ALIGN_EDEFAULT.equals(patAlign);
			case AfplibPackage.FNC__RPAT_DCNT:
				return RPAT_DCNT_EDEFAULT == null ? rPatDCnt != null : !RPAT_DCNT_EDEFAULT.equals(rPatDCnt);
			case AfplibPackage.FNC__FNPRG_LEN:
				return FNPRG_LEN_EDEFAULT == null ? fnprgLen != null : !FNPRG_LEN_EDEFAULT.equals(fnprgLen);
			case AfplibPackage.FNC__FNMRG_LEN:
				return FNMRG_LEN_EDEFAULT == null ? fnmrgLen != null : !FNMRG_LEN_EDEFAULT.equals(fnmrgLen);
			case AfplibPackage.FNC__RES_XU_BASE:
				return RES_XU_BASE_EDEFAULT == null ? resXUBase != null : !RES_XU_BASE_EDEFAULT.equals(resXUBase);
			case AfplibPackage.FNC__RES_YU_BASE:
				return RES_YU_BASE_EDEFAULT == null ? resYUBase != null : !RES_YU_BASE_EDEFAULT.equals(resYUBase);
			case AfplibPackage.FNC__XFR_UNITS:
				return XFR_UNITS_EDEFAULT == null ? xfrUnits != null : !XFR_UNITS_EDEFAULT.equals(xfrUnits);
			case AfplibPackage.FNC__YFR_UNITS:
				return YFR_UNITS_EDEFAULT == null ? yfrUnits != null : !YFR_UNITS_EDEFAULT.equals(yfrUnits);
			case AfplibPackage.FNC__OPAT_DCNT:
				return OPAT_DCNT_EDEFAULT == null ? oPatDCnt != null : !OPAT_DCNT_EDEFAULT.equals(oPatDCnt);
			case AfplibPackage.FNC__RESERVED2:
				return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
			case AfplibPackage.FNC__FNNRG_LEN:
				return FNNRG_LEN_EDEFAULT == null ? fnnrgLen != null : !FNNRG_LEN_EDEFAULT.equals(fnnrgLen);
			case AfplibPackage.FNC__FNND_CNT:
				return FNND_CNT_EDEFAULT == null ? fnndCnt != null : !FNND_CNT_EDEFAULT.equals(fnndCnt);
			case AfplibPackage.FNC__FNN_MAP_CNT:
				return FNN_MAP_CNT_EDEFAULT == null ? fnnMapCnt != null : !FNN_MAP_CNT_EDEFAULT.equals(fnnMapCnt);
			case AfplibPackage.FNC__TRIPLETS:
				return triplets != null && !triplets.isEmpty();
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
		result.append(" (Retired: ");
		result.append(retired);
		result.append(", PatTech: ");
		result.append(patTech);
		result.append(", Reserved1: ");
		result.append(reserved1);
		result.append(", FntFlags: ");
		result.append(fntFlags);
		result.append(", XUnitBase: ");
		result.append(xUnitBase);
		result.append(", YUnitBase: ");
		result.append(yUnitBase);
		result.append(", XftUnits: ");
		result.append(xftUnits);
		result.append(", YftUnits: ");
		result.append(yftUnits);
		result.append(", MaxBoxWd: ");
		result.append(maxBoxWd);
		result.append(", MaxBoxHt: ");
		result.append(maxBoxHt);
		result.append(", FNORGLen: ");
		result.append(fnorgLen);
		result.append(", FNIRGLen: ");
		result.append(fnirgLen);
		result.append(", PatAlign: ");
		result.append(patAlign);
		result.append(", RPatDCnt: ");
		result.append(rPatDCnt);
		result.append(", FNPRGLen: ");
		result.append(fnprgLen);
		result.append(", FNMRGLen: ");
		result.append(fnmrgLen);
		result.append(", ResXUBase: ");
		result.append(resXUBase);
		result.append(", ResYUBase: ");
		result.append(resYUBase);
		result.append(", XfrUnits: ");
		result.append(xfrUnits);
		result.append(", YfrUnits: ");
		result.append(yfrUnits);
		result.append(", OPatDCnt: ");
		result.append(oPatDCnt);
		result.append(", Reserved2: ");
		result.append(reserved2);
		result.append(", FNNRGLen: ");
		result.append(fnnrgLen);
		result.append(", FNNDCnt: ");
		result.append(fnndCnt);
		result.append(", FNNMapCnt: ");
		result.append(fnnMapCnt);
		result.append(')');
		return result.toString();
	}

} //FNCImpl
