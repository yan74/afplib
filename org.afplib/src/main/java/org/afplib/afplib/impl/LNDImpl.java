/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.LND;

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
 * An implementation of the model object '<em><b>LND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getLNDFlgs <em>LND Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getIPos <em>IPos</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getBPos <em>BPos</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getTxtOrent <em>Txt Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getFntLID <em>Fnt LID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getChnlCde <em>Chnl Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getNLNDskp <em>NLN Dskp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getNLNDsp <em>NLN Dsp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getNLNDreu <em>NLN Dreu</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getSupName <em>Sup Name</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getSOLid <em>SO Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getDataStrt <em>Data Strt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getDataLgth <em>Data Lgth</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getTxtColor <em>Txt Color</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getNLNDccp <em>NLN Dccp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getSubpgID <em>Subpg ID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getCCPID <em>CCPID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.LNDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class LNDImpl extends SFImpl implements LND {
	/**
	 * The default value of the '{@link #getLNDFlgs() <em>LND Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLNDFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer LND_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getLNDFlgs() <em>LND Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getLNDFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer lndFlgs = LND_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getIPos() <em>IPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPos()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIPos() <em>IPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIPos()
	 * @generated
	 * @ordered
	 */
	protected Integer iPos = IPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getBPos() <em>BPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPos()
	 * @generated
	 * @ordered
	 */
	protected static final Integer BPOS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getBPos() <em>BPos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getBPos()
	 * @generated
	 * @ordered
	 */
	protected Integer bPos = BPOS_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtOrent() <em>Txt Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtOrent()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TXT_ORENT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtOrent() <em>Txt Orent</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtOrent()
	 * @generated
	 * @ordered
	 */
	protected Integer txtOrent = TXT_ORENT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFntLID() <em>Fnt LID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFntLID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FNT_LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFntLID() <em>Fnt LID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFntLID()
	 * @generated
	 * @ordered
	 */
	protected Integer fntLID = FNT_LID_EDEFAULT;

	/**
	 * The default value of the '{@link #getChnlCde() <em>Chnl Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChnlCde()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CHNL_CDE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getChnlCde() <em>Chnl Cde</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getChnlCde()
	 * @generated
	 * @ordered
	 */
	protected Integer chnlCde = CHNL_CDE_EDEFAULT;

	/**
	 * The default value of the '{@link #getNLNDskp() <em>NLN Dskp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDskp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NLN_DSKP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNLNDskp() <em>NLN Dskp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDskp()
	 * @generated
	 * @ordered
	 */
	protected Integer nlnDskp = NLN_DSKP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNLNDsp() <em>NLN Dsp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDsp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NLN_DSP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNLNDsp() <em>NLN Dsp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDsp()
	 * @generated
	 * @ordered
	 */
	protected Integer nlnDsp = NLN_DSP_EDEFAULT;

	/**
	 * The default value of the '{@link #getNLNDreu() <em>NLN Dreu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDreu()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NLN_DREU_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNLNDreu() <em>NLN Dreu</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDreu()
	 * @generated
	 * @ordered
	 */
	protected Integer nlnDreu = NLN_DREU_EDEFAULT;

	/**
	 * The default value of the '{@link #getSupName() <em>Sup Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupName()
	 * @generated
	 * @ordered
	 */
	protected static final String SUP_NAME_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSupName() <em>Sup Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSupName()
	 * @generated
	 * @ordered
	 */
	protected String supName = SUP_NAME_EDEFAULT;

	/**
	 * The default value of the '{@link #getSOLid() <em>SO Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOLid()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SO_LID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSOLid() <em>SO Lid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSOLid()
	 * @generated
	 * @ordered
	 */
	protected Integer soLid = SO_LID_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataStrt() <em>Data Strt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStrt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_STRT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataStrt() <em>Data Strt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataStrt()
	 * @generated
	 * @ordered
	 */
	protected Integer dataStrt = DATA_STRT_EDEFAULT;

	/**
	 * The default value of the '{@link #getDataLgth() <em>Data Lgth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLgth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer DATA_LGTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getDataLgth() <em>Data Lgth</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getDataLgth()
	 * @generated
	 * @ordered
	 */
	protected Integer dataLgth = DATA_LGTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getTxtColor() <em>Txt Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtColor()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TXT_COLOR_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTxtColor() <em>Txt Color</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTxtColor()
	 * @generated
	 * @ordered
	 */
	protected Integer txtColor = TXT_COLOR_EDEFAULT;

	/**
	 * The default value of the '{@link #getNLNDccp() <em>NLN Dccp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDccp()
	 * @generated
	 * @ordered
	 */
	protected static final Integer NLN_DCCP_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getNLNDccp() <em>NLN Dccp</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getNLNDccp()
	 * @generated
	 * @ordered
	 */
	protected Integer nlnDccp = NLN_DCCP_EDEFAULT;

	/**
	 * The default value of the '{@link #getSubpgID() <em>Subpg ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpgID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer SUBPG_ID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getSubpgID() <em>Subpg ID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSubpgID()
	 * @generated
	 * @ordered
	 */
	protected Integer subpgID = SUBPG_ID_EDEFAULT;

	/**
	 * The default value of the '{@link #getCCPID() <em>CCPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCPID()
	 * @generated
	 * @ordered
	 */
	protected static final Integer CCPID_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getCCPID() <em>CCPID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getCCPID()
	 * @generated
	 * @ordered
	 */
	protected Integer ccpid = CCPID_EDEFAULT;

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
	protected LNDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getLND();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getLNDFlgs() {
		return lndFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setLNDFlgs(Integer newLNDFlgs) {
		Integer oldLNDFlgs = lndFlgs;
		lndFlgs = newLNDFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__LND_FLGS, oldLNDFlgs, lndFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIPos() {
		return iPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIPos(Integer newIPos) {
		Integer oldIPos = iPos;
		iPos = newIPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__IPOS, oldIPos, iPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getBPos() {
		return bPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setBPos(Integer newBPos) {
		Integer oldBPos = bPos;
		bPos = newBPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__BPOS, oldBPos, bPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTxtOrent() {
		return txtOrent;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtOrent(Integer newTxtOrent) {
		Integer oldTxtOrent = txtOrent;
		txtOrent = newTxtOrent;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__TXT_ORENT, oldTxtOrent, txtOrent));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFntLID() {
		return fntLID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFntLID(Integer newFntLID) {
		Integer oldFntLID = fntLID;
		fntLID = newFntLID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__FNT_LID, oldFntLID, fntLID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getChnlCde() {
		return chnlCde;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setChnlCde(Integer newChnlCde) {
		Integer oldChnlCde = chnlCde;
		chnlCde = newChnlCde;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__CHNL_CDE, oldChnlCde, chnlCde));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNLNDskp() {
		return nlnDskp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNLNDskp(Integer newNLNDskp) {
		Integer oldNLNDskp = nlnDskp;
		nlnDskp = newNLNDskp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__NLN_DSKP, oldNLNDskp, nlnDskp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNLNDsp() {
		return nlnDsp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNLNDsp(Integer newNLNDsp) {
		Integer oldNLNDsp = nlnDsp;
		nlnDsp = newNLNDsp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__NLN_DSP, oldNLNDsp, nlnDsp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNLNDreu() {
		return nlnDreu;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNLNDreu(Integer newNLNDreu) {
		Integer oldNLNDreu = nlnDreu;
		nlnDreu = newNLNDreu;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__NLN_DREU, oldNLNDreu, nlnDreu));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getSupName() {
		return supName;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSupName(String newSupName) {
		String oldSupName = supName;
		supName = newSupName;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__SUP_NAME, oldSupName, supName));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSOLid() {
		return soLid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSOLid(Integer newSOLid) {
		Integer oldSOLid = soLid;
		soLid = newSOLid;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__SO_LID, oldSOLid, soLid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDataStrt() {
		return dataStrt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataStrt(Integer newDataStrt) {
		Integer oldDataStrt = dataStrt;
		dataStrt = newDataStrt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__DATA_STRT, oldDataStrt, dataStrt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getDataLgth() {
		return dataLgth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setDataLgth(Integer newDataLgth) {
		Integer oldDataLgth = dataLgth;
		dataLgth = newDataLgth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__DATA_LGTH, oldDataLgth, dataLgth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTxtColor() {
		return txtColor;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTxtColor(Integer newTxtColor) {
		Integer oldTxtColor = txtColor;
		txtColor = newTxtColor;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__TXT_COLOR, oldTxtColor, txtColor));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getNLNDccp() {
		return nlnDccp;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setNLNDccp(Integer newNLNDccp) {
		Integer oldNLNDccp = nlnDccp;
		nlnDccp = newNLNDccp;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__NLN_DCCP, oldNLNDccp, nlnDccp));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getSubpgID() {
		return subpgID;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setSubpgID(Integer newSubpgID) {
		Integer oldSubpgID = subpgID;
		subpgID = newSubpgID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__SUBPG_ID, oldSubpgID, subpgID));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getCCPID() {
		return ccpid;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setCCPID(Integer newCCPID) {
		Integer oldCCPID = ccpid;
		ccpid = newCCPID;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.LND__CCPID, oldCCPID, ccpid));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.LND__TRIPLETS);
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
			case AfplibPackage.LND__TRIPLETS:
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
			case AfplibPackage.LND__LND_FLGS:
				return getLNDFlgs();
			case AfplibPackage.LND__IPOS:
				return getIPos();
			case AfplibPackage.LND__BPOS:
				return getBPos();
			case AfplibPackage.LND__TXT_ORENT:
				return getTxtOrent();
			case AfplibPackage.LND__FNT_LID:
				return getFntLID();
			case AfplibPackage.LND__CHNL_CDE:
				return getChnlCde();
			case AfplibPackage.LND__NLN_DSKP:
				return getNLNDskp();
			case AfplibPackage.LND__NLN_DSP:
				return getNLNDsp();
			case AfplibPackage.LND__NLN_DREU:
				return getNLNDreu();
			case AfplibPackage.LND__SUP_NAME:
				return getSupName();
			case AfplibPackage.LND__SO_LID:
				return getSOLid();
			case AfplibPackage.LND__DATA_STRT:
				return getDataStrt();
			case AfplibPackage.LND__DATA_LGTH:
				return getDataLgth();
			case AfplibPackage.LND__TXT_COLOR:
				return getTxtColor();
			case AfplibPackage.LND__NLN_DCCP:
				return getNLNDccp();
			case AfplibPackage.LND__SUBPG_ID:
				return getSubpgID();
			case AfplibPackage.LND__CCPID:
				return getCCPID();
			case AfplibPackage.LND__TRIPLETS:
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
			case AfplibPackage.LND__LND_FLGS:
				setLNDFlgs((Integer)newValue);
				return;
			case AfplibPackage.LND__IPOS:
				setIPos((Integer)newValue);
				return;
			case AfplibPackage.LND__BPOS:
				setBPos((Integer)newValue);
				return;
			case AfplibPackage.LND__TXT_ORENT:
				setTxtOrent((Integer)newValue);
				return;
			case AfplibPackage.LND__FNT_LID:
				setFntLID((Integer)newValue);
				return;
			case AfplibPackage.LND__CHNL_CDE:
				setChnlCde((Integer)newValue);
				return;
			case AfplibPackage.LND__NLN_DSKP:
				setNLNDskp((Integer)newValue);
				return;
			case AfplibPackage.LND__NLN_DSP:
				setNLNDsp((Integer)newValue);
				return;
			case AfplibPackage.LND__NLN_DREU:
				setNLNDreu((Integer)newValue);
				return;
			case AfplibPackage.LND__SUP_NAME:
				setSupName((String)newValue);
				return;
			case AfplibPackage.LND__SO_LID:
				setSOLid((Integer)newValue);
				return;
			case AfplibPackage.LND__DATA_STRT:
				setDataStrt((Integer)newValue);
				return;
			case AfplibPackage.LND__DATA_LGTH:
				setDataLgth((Integer)newValue);
				return;
			case AfplibPackage.LND__TXT_COLOR:
				setTxtColor((Integer)newValue);
				return;
			case AfplibPackage.LND__NLN_DCCP:
				setNLNDccp((Integer)newValue);
				return;
			case AfplibPackage.LND__SUBPG_ID:
				setSubpgID((Integer)newValue);
				return;
			case AfplibPackage.LND__CCPID:
				setCCPID((Integer)newValue);
				return;
			case AfplibPackage.LND__TRIPLETS:
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
			case AfplibPackage.LND__LND_FLGS:
				setLNDFlgs(LND_FLGS_EDEFAULT);
				return;
			case AfplibPackage.LND__IPOS:
				setIPos(IPOS_EDEFAULT);
				return;
			case AfplibPackage.LND__BPOS:
				setBPos(BPOS_EDEFAULT);
				return;
			case AfplibPackage.LND__TXT_ORENT:
				setTxtOrent(TXT_ORENT_EDEFAULT);
				return;
			case AfplibPackage.LND__FNT_LID:
				setFntLID(FNT_LID_EDEFAULT);
				return;
			case AfplibPackage.LND__CHNL_CDE:
				setChnlCde(CHNL_CDE_EDEFAULT);
				return;
			case AfplibPackage.LND__NLN_DSKP:
				setNLNDskp(NLN_DSKP_EDEFAULT);
				return;
			case AfplibPackage.LND__NLN_DSP:
				setNLNDsp(NLN_DSP_EDEFAULT);
				return;
			case AfplibPackage.LND__NLN_DREU:
				setNLNDreu(NLN_DREU_EDEFAULT);
				return;
			case AfplibPackage.LND__SUP_NAME:
				setSupName(SUP_NAME_EDEFAULT);
				return;
			case AfplibPackage.LND__SO_LID:
				setSOLid(SO_LID_EDEFAULT);
				return;
			case AfplibPackage.LND__DATA_STRT:
				setDataStrt(DATA_STRT_EDEFAULT);
				return;
			case AfplibPackage.LND__DATA_LGTH:
				setDataLgth(DATA_LGTH_EDEFAULT);
				return;
			case AfplibPackage.LND__TXT_COLOR:
				setTxtColor(TXT_COLOR_EDEFAULT);
				return;
			case AfplibPackage.LND__NLN_DCCP:
				setNLNDccp(NLN_DCCP_EDEFAULT);
				return;
			case AfplibPackage.LND__SUBPG_ID:
				setSubpgID(SUBPG_ID_EDEFAULT);
				return;
			case AfplibPackage.LND__CCPID:
				setCCPID(CCPID_EDEFAULT);
				return;
			case AfplibPackage.LND__TRIPLETS:
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
			case AfplibPackage.LND__LND_FLGS:
				return LND_FLGS_EDEFAULT == null ? lndFlgs != null : !LND_FLGS_EDEFAULT.equals(lndFlgs);
			case AfplibPackage.LND__IPOS:
				return IPOS_EDEFAULT == null ? iPos != null : !IPOS_EDEFAULT.equals(iPos);
			case AfplibPackage.LND__BPOS:
				return BPOS_EDEFAULT == null ? bPos != null : !BPOS_EDEFAULT.equals(bPos);
			case AfplibPackage.LND__TXT_ORENT:
				return TXT_ORENT_EDEFAULT == null ? txtOrent != null : !TXT_ORENT_EDEFAULT.equals(txtOrent);
			case AfplibPackage.LND__FNT_LID:
				return FNT_LID_EDEFAULT == null ? fntLID != null : !FNT_LID_EDEFAULT.equals(fntLID);
			case AfplibPackage.LND__CHNL_CDE:
				return CHNL_CDE_EDEFAULT == null ? chnlCde != null : !CHNL_CDE_EDEFAULT.equals(chnlCde);
			case AfplibPackage.LND__NLN_DSKP:
				return NLN_DSKP_EDEFAULT == null ? nlnDskp != null : !NLN_DSKP_EDEFAULT.equals(nlnDskp);
			case AfplibPackage.LND__NLN_DSP:
				return NLN_DSP_EDEFAULT == null ? nlnDsp != null : !NLN_DSP_EDEFAULT.equals(nlnDsp);
			case AfplibPackage.LND__NLN_DREU:
				return NLN_DREU_EDEFAULT == null ? nlnDreu != null : !NLN_DREU_EDEFAULT.equals(nlnDreu);
			case AfplibPackage.LND__SUP_NAME:
				return SUP_NAME_EDEFAULT == null ? supName != null : !SUP_NAME_EDEFAULT.equals(supName);
			case AfplibPackage.LND__SO_LID:
				return SO_LID_EDEFAULT == null ? soLid != null : !SO_LID_EDEFAULT.equals(soLid);
			case AfplibPackage.LND__DATA_STRT:
				return DATA_STRT_EDEFAULT == null ? dataStrt != null : !DATA_STRT_EDEFAULT.equals(dataStrt);
			case AfplibPackage.LND__DATA_LGTH:
				return DATA_LGTH_EDEFAULT == null ? dataLgth != null : !DATA_LGTH_EDEFAULT.equals(dataLgth);
			case AfplibPackage.LND__TXT_COLOR:
				return TXT_COLOR_EDEFAULT == null ? txtColor != null : !TXT_COLOR_EDEFAULT.equals(txtColor);
			case AfplibPackage.LND__NLN_DCCP:
				return NLN_DCCP_EDEFAULT == null ? nlnDccp != null : !NLN_DCCP_EDEFAULT.equals(nlnDccp);
			case AfplibPackage.LND__SUBPG_ID:
				return SUBPG_ID_EDEFAULT == null ? subpgID != null : !SUBPG_ID_EDEFAULT.equals(subpgID);
			case AfplibPackage.LND__CCPID:
				return CCPID_EDEFAULT == null ? ccpid != null : !CCPID_EDEFAULT.equals(ccpid);
			case AfplibPackage.LND__TRIPLETS:
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
		result.append(" (LNDFlgs: ");
		result.append(lndFlgs);
		result.append(", IPos: ");
		result.append(iPos);
		result.append(", BPos: ");
		result.append(bPos);
		result.append(", TxtOrent: ");
		result.append(txtOrent);
		result.append(", FntLID: ");
		result.append(fntLID);
		result.append(", ChnlCde: ");
		result.append(chnlCde);
		result.append(", NLNDskp: ");
		result.append(nlnDskp);
		result.append(", NLNDsp: ");
		result.append(nlnDsp);
		result.append(", NLNDreu: ");
		result.append(nlnDreu);
		result.append(", SupName: ");
		result.append(supName);
		result.append(", SOLid: ");
		result.append(soLid);
		result.append(", DataStrt: ");
		result.append(dataStrt);
		result.append(", DataLgth: ");
		result.append(dataLgth);
		result.append(", TxtColor: ");
		result.append(txtColor);
		result.append(", NLNDccp: ");
		result.append(nlnDccp);
		result.append(", SubpgID: ");
		result.append(subpgID);
		result.append(", CCPID: ");
		result.append(ccpid);
		result.append(')');
		return result.toString();
	}

} //LNDImpl
