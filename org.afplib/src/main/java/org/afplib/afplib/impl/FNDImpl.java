/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FND;

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
 * An implementation of the model object '<em><b>FND</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getTypeFcDesc <em>Type Fc Desc</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getFtWtClass <em>Ft Wt Class</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getFtWdClass <em>Ft Wd Class</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getMaxPtSize <em>Max Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getNomPtSize <em>Nom Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getMinPtSize <em>Min Pt Size</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getMaxHSize <em>Max HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getNomHSize <em>Nom HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getMinHSize <em>Min HSize</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getDsnGenCls <em>Dsn Gen Cls</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getDsnSubCls <em>Dsn Sub Cls</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getDsnSpcGrp <em>Dsn Spc Grp</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getReserved1 <em>Reserved1</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getFtDsFlags <em>Ft Ds Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getGCSID <em>GCSID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getFGID <em>FGID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNDImpl extends SFImpl implements FND {
	/**
     * The default value of the '{@link #getTypeFcDesc() <em>Type Fc Desc</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTypeFcDesc()
     * @generated
     * @ordered
     */
	protected static final String TYPE_FC_DESC_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTypeFcDesc() <em>Type Fc Desc</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTypeFcDesc()
     * @generated
     * @ordered
     */
	protected String typeFcDesc = TYPE_FC_DESC_EDEFAULT;

	/**
     * The default value of the '{@link #getFtWtClass() <em>Ft Wt Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtWtClass()
     * @generated
     * @ordered
     */
	protected static final Integer FT_WT_CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFtWtClass() <em>Ft Wt Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtWtClass()
     * @generated
     * @ordered
     */
	protected Integer ftWtClass = FT_WT_CLASS_EDEFAULT;

	/**
     * The default value of the '{@link #getFtWdClass() <em>Ft Wd Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtWdClass()
     * @generated
     * @ordered
     */
	protected static final Integer FT_WD_CLASS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFtWdClass() <em>Ft Wd Class</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtWdClass()
     * @generated
     * @ordered
     */
	protected Integer ftWdClass = FT_WD_CLASS_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxPtSize() <em>Max Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPtSize()
     * @generated
     * @ordered
     */
	protected static final Integer MAX_PT_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaxPtSize() <em>Max Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxPtSize()
     * @generated
     * @ordered
     */
	protected Integer maxPtSize = MAX_PT_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getNomPtSize() <em>Nom Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNomPtSize()
     * @generated
     * @ordered
     */
	protected static final Integer NOM_PT_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getNomPtSize() <em>Nom Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNomPtSize()
     * @generated
     * @ordered
     */
	protected Integer nomPtSize = NOM_PT_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getMinPtSize() <em>Min Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinPtSize()
     * @generated
     * @ordered
     */
	protected static final Integer MIN_PT_SIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMinPtSize() <em>Min Pt Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinPtSize()
     * @generated
     * @ordered
     */
	protected Integer minPtSize = MIN_PT_SIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getMaxHSize() <em>Max HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxHSize()
     * @generated
     * @ordered
     */
	protected static final Integer MAX_HSIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMaxHSize() <em>Max HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMaxHSize()
     * @generated
     * @ordered
     */
	protected Integer maxHSize = MAX_HSIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getNomHSize() <em>Nom HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNomHSize()
     * @generated
     * @ordered
     */
	protected static final Integer NOM_HSIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getNomHSize() <em>Nom HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getNomHSize()
     * @generated
     * @ordered
     */
	protected Integer nomHSize = NOM_HSIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getMinHSize() <em>Min HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinHSize()
     * @generated
     * @ordered
     */
	protected static final Integer MIN_HSIZE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMinHSize() <em>Min HSize</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMinHSize()
     * @generated
     * @ordered
     */
	protected Integer minHSize = MIN_HSIZE_EDEFAULT;

	/**
     * The default value of the '{@link #getDsnGenCls() <em>Dsn Gen Cls</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnGenCls()
     * @generated
     * @ordered
     */
	protected static final Integer DSN_GEN_CLS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDsnGenCls() <em>Dsn Gen Cls</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnGenCls()
     * @generated
     * @ordered
     */
	protected Integer dsnGenCls = DSN_GEN_CLS_EDEFAULT;

	/**
     * The default value of the '{@link #getDsnSubCls() <em>Dsn Sub Cls</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnSubCls()
     * @generated
     * @ordered
     */
	protected static final Integer DSN_SUB_CLS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDsnSubCls() <em>Dsn Sub Cls</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnSubCls()
     * @generated
     * @ordered
     */
	protected Integer dsnSubCls = DSN_SUB_CLS_EDEFAULT;

	/**
     * The default value of the '{@link #getDsnSpcGrp() <em>Dsn Spc Grp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnSpcGrp()
     * @generated
     * @ordered
     */
	protected static final Integer DSN_SPC_GRP_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getDsnSpcGrp() <em>Dsn Spc Grp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getDsnSpcGrp()
     * @generated
     * @ordered
     */
	protected Integer dsnSpcGrp = DSN_SPC_GRP_EDEFAULT;

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
     * The default value of the '{@link #getFtDsFlags() <em>Ft Ds Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtDsFlags()
     * @generated
     * @ordered
     */
	protected static final Integer FT_DS_FLAGS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFtDsFlags() <em>Ft Ds Flags</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFtDsFlags()
     * @generated
     * @ordered
     */
	protected Integer ftDsFlags = FT_DS_FLAGS_EDEFAULT;

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
     * The default value of the '{@link #getGCSID() <em>GCSID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGCSID()
     * @generated
     * @ordered
     */
	protected static final Integer GCSID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getGCSID() <em>GCSID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getGCSID()
     * @generated
     * @ordered
     */
	protected Integer gcsid = GCSID_EDEFAULT;

	/**
     * The default value of the '{@link #getFGID() <em>FGID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFGID()
     * @generated
     * @ordered
     */
	protected static final Integer FGID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFGID() <em>FGID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFGID()
     * @generated
     * @ordered
     */
	protected Integer fgid = FGID_EDEFAULT;

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
	protected FNDImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFND();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public String getTypeFcDesc() {
        return typeFcDesc;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTypeFcDesc(String newTypeFcDesc) {
        String oldTypeFcDesc = typeFcDesc;
        typeFcDesc = newTypeFcDesc;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__TYPE_FC_DESC, oldTypeFcDesc, typeFcDesc));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFtWtClass() {
        return ftWtClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFtWtClass(Integer newFtWtClass) {
        Integer oldFtWtClass = ftWtClass;
        ftWtClass = newFtWtClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__FT_WT_CLASS, oldFtWtClass, ftWtClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFtWdClass() {
        return ftWdClass;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFtWdClass(Integer newFtWdClass) {
        Integer oldFtWdClass = ftWdClass;
        ftWdClass = newFtWdClass;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__FT_WD_CLASS, oldFtWdClass, ftWdClass));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMaxPtSize() {
        return maxPtSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxPtSize(Integer newMaxPtSize) {
        Integer oldMaxPtSize = maxPtSize;
        maxPtSize = newMaxPtSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__MAX_PT_SIZE, oldMaxPtSize, maxPtSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getNomPtSize() {
        return nomPtSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNomPtSize(Integer newNomPtSize) {
        Integer oldNomPtSize = nomPtSize;
        nomPtSize = newNomPtSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__NOM_PT_SIZE, oldNomPtSize, nomPtSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMinPtSize() {
        return minPtSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinPtSize(Integer newMinPtSize) {
        Integer oldMinPtSize = minPtSize;
        minPtSize = newMinPtSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__MIN_PT_SIZE, oldMinPtSize, minPtSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMaxHSize() {
        return maxHSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMaxHSize(Integer newMaxHSize) {
        Integer oldMaxHSize = maxHSize;
        maxHSize = newMaxHSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__MAX_HSIZE, oldMaxHSize, maxHSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getNomHSize() {
        return nomHSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setNomHSize(Integer newNomHSize) {
        Integer oldNomHSize = nomHSize;
        nomHSize = newNomHSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__NOM_HSIZE, oldNomHSize, nomHSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMinHSize() {
        return minHSize;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMinHSize(Integer newMinHSize) {
        Integer oldMinHSize = minHSize;
        minHSize = newMinHSize;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__MIN_HSIZE, oldMinHSize, minHSize));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDsnGenCls() {
        return dsnGenCls;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDsnGenCls(Integer newDsnGenCls) {
        Integer oldDsnGenCls = dsnGenCls;
        dsnGenCls = newDsnGenCls;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__DSN_GEN_CLS, oldDsnGenCls, dsnGenCls));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDsnSubCls() {
        return dsnSubCls;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDsnSubCls(Integer newDsnSubCls) {
        Integer oldDsnSubCls = dsnSubCls;
        dsnSubCls = newDsnSubCls;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__DSN_SUB_CLS, oldDsnSubCls, dsnSubCls));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getDsnSpcGrp() {
        return dsnSpcGrp;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setDsnSpcGrp(Integer newDsnSpcGrp) {
        Integer oldDsnSpcGrp = dsnSpcGrp;
        dsnSpcGrp = newDsnSpcGrp;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__DSN_SPC_GRP, oldDsnSpcGrp, dsnSpcGrp));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__RESERVED1, oldReserved1, reserved1));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFtDsFlags() {
        return ftDsFlags;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFtDsFlags(Integer newFtDsFlags) {
        Integer oldFtDsFlags = ftDsFlags;
        ftDsFlags = newFtDsFlags;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__FT_DS_FLAGS, oldFtDsFlags, ftDsFlags));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__RESERVED2, oldReserved2, reserved2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getGCSID() {
        return gcsid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setGCSID(Integer newGCSID) {
        Integer oldGCSID = gcsid;
        gcsid = newGCSID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__GCSID, oldGCSID, gcsid));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFGID() {
        return fgid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFGID(Integer newFGID) {
        Integer oldFGID = fgid;
        fgid = newFGID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FND__FGID, oldFGID, fgid));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getTriplets() {
        if (triplets == null) {
            triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.FND__TRIPLETS);
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
            case AfplibPackage.FND__TRIPLETS:
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
            case AfplibPackage.FND__TYPE_FC_DESC:
                return getTypeFcDesc();
            case AfplibPackage.FND__FT_WT_CLASS:
                return getFtWtClass();
            case AfplibPackage.FND__FT_WD_CLASS:
                return getFtWdClass();
            case AfplibPackage.FND__MAX_PT_SIZE:
                return getMaxPtSize();
            case AfplibPackage.FND__NOM_PT_SIZE:
                return getNomPtSize();
            case AfplibPackage.FND__MIN_PT_SIZE:
                return getMinPtSize();
            case AfplibPackage.FND__MAX_HSIZE:
                return getMaxHSize();
            case AfplibPackage.FND__NOM_HSIZE:
                return getNomHSize();
            case AfplibPackage.FND__MIN_HSIZE:
                return getMinHSize();
            case AfplibPackage.FND__DSN_GEN_CLS:
                return getDsnGenCls();
            case AfplibPackage.FND__DSN_SUB_CLS:
                return getDsnSubCls();
            case AfplibPackage.FND__DSN_SPC_GRP:
                return getDsnSpcGrp();
            case AfplibPackage.FND__RESERVED1:
                return getReserved1();
            case AfplibPackage.FND__FT_DS_FLAGS:
                return getFtDsFlags();
            case AfplibPackage.FND__RESERVED2:
                return getReserved2();
            case AfplibPackage.FND__GCSID:
                return getGCSID();
            case AfplibPackage.FND__FGID:
                return getFGID();
            case AfplibPackage.FND__TRIPLETS:
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
            case AfplibPackage.FND__TYPE_FC_DESC:
                setTypeFcDesc((String)newValue);
                return;
            case AfplibPackage.FND__FT_WT_CLASS:
                setFtWtClass((Integer)newValue);
                return;
            case AfplibPackage.FND__FT_WD_CLASS:
                setFtWdClass((Integer)newValue);
                return;
            case AfplibPackage.FND__MAX_PT_SIZE:
                setMaxPtSize((Integer)newValue);
                return;
            case AfplibPackage.FND__NOM_PT_SIZE:
                setNomPtSize((Integer)newValue);
                return;
            case AfplibPackage.FND__MIN_PT_SIZE:
                setMinPtSize((Integer)newValue);
                return;
            case AfplibPackage.FND__MAX_HSIZE:
                setMaxHSize((Integer)newValue);
                return;
            case AfplibPackage.FND__NOM_HSIZE:
                setNomHSize((Integer)newValue);
                return;
            case AfplibPackage.FND__MIN_HSIZE:
                setMinHSize((Integer)newValue);
                return;
            case AfplibPackage.FND__DSN_GEN_CLS:
                setDsnGenCls((Integer)newValue);
                return;
            case AfplibPackage.FND__DSN_SUB_CLS:
                setDsnSubCls((Integer)newValue);
                return;
            case AfplibPackage.FND__DSN_SPC_GRP:
                setDsnSpcGrp((Integer)newValue);
                return;
            case AfplibPackage.FND__RESERVED1:
                setReserved1((byte[])newValue);
                return;
            case AfplibPackage.FND__FT_DS_FLAGS:
                setFtDsFlags((Integer)newValue);
                return;
            case AfplibPackage.FND__RESERVED2:
                setReserved2((byte[])newValue);
                return;
            case AfplibPackage.FND__GCSID:
                setGCSID((Integer)newValue);
                return;
            case AfplibPackage.FND__FGID:
                setFGID((Integer)newValue);
                return;
            case AfplibPackage.FND__TRIPLETS:
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
            case AfplibPackage.FND__TYPE_FC_DESC:
                setTypeFcDesc(TYPE_FC_DESC_EDEFAULT);
                return;
            case AfplibPackage.FND__FT_WT_CLASS:
                setFtWtClass(FT_WT_CLASS_EDEFAULT);
                return;
            case AfplibPackage.FND__FT_WD_CLASS:
                setFtWdClass(FT_WD_CLASS_EDEFAULT);
                return;
            case AfplibPackage.FND__MAX_PT_SIZE:
                setMaxPtSize(MAX_PT_SIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__NOM_PT_SIZE:
                setNomPtSize(NOM_PT_SIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__MIN_PT_SIZE:
                setMinPtSize(MIN_PT_SIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__MAX_HSIZE:
                setMaxHSize(MAX_HSIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__NOM_HSIZE:
                setNomHSize(NOM_HSIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__MIN_HSIZE:
                setMinHSize(MIN_HSIZE_EDEFAULT);
                return;
            case AfplibPackage.FND__DSN_GEN_CLS:
                setDsnGenCls(DSN_GEN_CLS_EDEFAULT);
                return;
            case AfplibPackage.FND__DSN_SUB_CLS:
                setDsnSubCls(DSN_SUB_CLS_EDEFAULT);
                return;
            case AfplibPackage.FND__DSN_SPC_GRP:
                setDsnSpcGrp(DSN_SPC_GRP_EDEFAULT);
                return;
            case AfplibPackage.FND__RESERVED1:
                setReserved1(RESERVED1_EDEFAULT);
                return;
            case AfplibPackage.FND__FT_DS_FLAGS:
                setFtDsFlags(FT_DS_FLAGS_EDEFAULT);
                return;
            case AfplibPackage.FND__RESERVED2:
                setReserved2(RESERVED2_EDEFAULT);
                return;
            case AfplibPackage.FND__GCSID:
                setGCSID(GCSID_EDEFAULT);
                return;
            case AfplibPackage.FND__FGID:
                setFGID(FGID_EDEFAULT);
                return;
            case AfplibPackage.FND__TRIPLETS:
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
            case AfplibPackage.FND__TYPE_FC_DESC:
                return TYPE_FC_DESC_EDEFAULT == null ? typeFcDesc != null : !TYPE_FC_DESC_EDEFAULT.equals(typeFcDesc);
            case AfplibPackage.FND__FT_WT_CLASS:
                return FT_WT_CLASS_EDEFAULT == null ? ftWtClass != null : !FT_WT_CLASS_EDEFAULT.equals(ftWtClass);
            case AfplibPackage.FND__FT_WD_CLASS:
                return FT_WD_CLASS_EDEFAULT == null ? ftWdClass != null : !FT_WD_CLASS_EDEFAULT.equals(ftWdClass);
            case AfplibPackage.FND__MAX_PT_SIZE:
                return MAX_PT_SIZE_EDEFAULT == null ? maxPtSize != null : !MAX_PT_SIZE_EDEFAULT.equals(maxPtSize);
            case AfplibPackage.FND__NOM_PT_SIZE:
                return NOM_PT_SIZE_EDEFAULT == null ? nomPtSize != null : !NOM_PT_SIZE_EDEFAULT.equals(nomPtSize);
            case AfplibPackage.FND__MIN_PT_SIZE:
                return MIN_PT_SIZE_EDEFAULT == null ? minPtSize != null : !MIN_PT_SIZE_EDEFAULT.equals(minPtSize);
            case AfplibPackage.FND__MAX_HSIZE:
                return MAX_HSIZE_EDEFAULT == null ? maxHSize != null : !MAX_HSIZE_EDEFAULT.equals(maxHSize);
            case AfplibPackage.FND__NOM_HSIZE:
                return NOM_HSIZE_EDEFAULT == null ? nomHSize != null : !NOM_HSIZE_EDEFAULT.equals(nomHSize);
            case AfplibPackage.FND__MIN_HSIZE:
                return MIN_HSIZE_EDEFAULT == null ? minHSize != null : !MIN_HSIZE_EDEFAULT.equals(minHSize);
            case AfplibPackage.FND__DSN_GEN_CLS:
                return DSN_GEN_CLS_EDEFAULT == null ? dsnGenCls != null : !DSN_GEN_CLS_EDEFAULT.equals(dsnGenCls);
            case AfplibPackage.FND__DSN_SUB_CLS:
                return DSN_SUB_CLS_EDEFAULT == null ? dsnSubCls != null : !DSN_SUB_CLS_EDEFAULT.equals(dsnSubCls);
            case AfplibPackage.FND__DSN_SPC_GRP:
                return DSN_SPC_GRP_EDEFAULT == null ? dsnSpcGrp != null : !DSN_SPC_GRP_EDEFAULT.equals(dsnSpcGrp);
            case AfplibPackage.FND__RESERVED1:
                return RESERVED1_EDEFAULT == null ? reserved1 != null : !RESERVED1_EDEFAULT.equals(reserved1);
            case AfplibPackage.FND__FT_DS_FLAGS:
                return FT_DS_FLAGS_EDEFAULT == null ? ftDsFlags != null : !FT_DS_FLAGS_EDEFAULT.equals(ftDsFlags);
            case AfplibPackage.FND__RESERVED2:
                return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
            case AfplibPackage.FND__GCSID:
                return GCSID_EDEFAULT == null ? gcsid != null : !GCSID_EDEFAULT.equals(gcsid);
            case AfplibPackage.FND__FGID:
                return FGID_EDEFAULT == null ? fgid != null : !FGID_EDEFAULT.equals(fgid);
            case AfplibPackage.FND__TRIPLETS:
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
        result.append(" (TypeFcDesc: ");
        result.append(typeFcDesc);
        result.append(", FtWtClass: ");
        result.append(ftWtClass);
        result.append(", FtWdClass: ");
        result.append(ftWdClass);
        result.append(", MaxPtSize: ");
        result.append(maxPtSize);
        result.append(", NomPtSize: ");
        result.append(nomPtSize);
        result.append(", MinPtSize: ");
        result.append(minPtSize);
        result.append(", MaxHSize: ");
        result.append(maxHSize);
        result.append(", NomHSize: ");
        result.append(nomHSize);
        result.append(", MinHSize: ");
        result.append(minHSize);
        result.append(", DsnGenCls: ");
        result.append(dsnGenCls);
        result.append(", DsnSubCls: ");
        result.append(dsnSubCls);
        result.append(", DsnSpcGrp: ");
        result.append(dsnSpcGrp);
        result.append(", Reserved1: ");
        result.append(reserved1);
        result.append(", FtDsFlags: ");
        result.append(ftDsFlags);
        result.append(", Reserved2: ");
        result.append(reserved2);
        result.append(", GCSID: ");
        result.append(gcsid);
        result.append(", FGID: ");
        result.append(fgid);
        result.append(')');
        return result.toString();
    }

} //FNDImpl
