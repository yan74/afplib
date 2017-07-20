/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.BDD;

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
 * An implementation of the model object '<em><b>BDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getUBASE <em>UBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getXUPUB <em>XUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getYUPUB <em>YUPUB</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getXEXTENT <em>XEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getYEXTENT <em>YEXTENT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getReserved2 <em>Reserved2</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getTYPE <em>TYPE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getMOD <em>MOD</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getLID <em>LID</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getCOLOR <em>COLOR</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getMODULEWIDTH <em>MODULEWIDTH</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getELEMENTHEIGHT <em>ELEMENTHEIGHT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getMULT <em>MULT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getWENE <em>WENE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.BDDImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BDDImpl extends SFImpl implements BDD {
	/**
     * The default value of the '{@link #getUBASE() <em>UBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUBASE()
     * @generated
     * @ordered
     */
	protected static final Integer UBASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getUBASE() <em>UBASE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getUBASE()
     * @generated
     * @ordered
     */
	protected Integer ubase = UBASE_EDEFAULT;

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
     * The default value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXUPUB()
     * @generated
     * @ordered
     */
	protected static final Integer XUPUB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXUPUB() <em>XUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXUPUB()
     * @generated
     * @ordered
     */
	protected Integer xupub = XUPUB_EDEFAULT;

	/**
     * The default value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYUPUB()
     * @generated
     * @ordered
     */
	protected static final Integer YUPUB_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYUPUB() <em>YUPUB</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYUPUB()
     * @generated
     * @ordered
     */
	protected Integer yupub = YUPUB_EDEFAULT;

	/**
     * The default value of the '{@link #getXEXTENT() <em>XEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXEXTENT()
     * @generated
     * @ordered
     */
	protected static final Integer XEXTENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXEXTENT() <em>XEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXEXTENT()
     * @generated
     * @ordered
     */
	protected Integer xextent = XEXTENT_EDEFAULT;

	/**
     * The default value of the '{@link #getYEXTENT() <em>YEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYEXTENT()
     * @generated
     * @ordered
     */
	protected static final Integer YEXTENT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYEXTENT() <em>YEXTENT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYEXTENT()
     * @generated
     * @ordered
     */
	protected Integer yextent = YEXTENT_EDEFAULT;

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
     * The default value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
	protected static final Integer TYPE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getTYPE() <em>TYPE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getTYPE()
     * @generated
     * @ordered
     */
	protected Integer type = TYPE_EDEFAULT;

	/**
     * The default value of the '{@link #getMOD() <em>MOD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMOD()
     * @generated
     * @ordered
     */
	protected static final Integer MOD_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMOD() <em>MOD</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMOD()
     * @generated
     * @ordered
     */
	protected Integer mod = MOD_EDEFAULT;

	/**
     * The default value of the '{@link #getLID() <em>LID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLID()
     * @generated
     * @ordered
     */
	protected static final Integer LID_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLID() <em>LID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLID()
     * @generated
     * @ordered
     */
	protected Integer lid = LID_EDEFAULT;

	/**
     * The default value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLOR()
     * @generated
     * @ordered
     */
	protected static final Integer COLOR_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCOLOR() <em>COLOR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCOLOR()
     * @generated
     * @ordered
     */
	protected Integer color = COLOR_EDEFAULT;

	/**
     * The default value of the '{@link #getMODULEWIDTH() <em>MODULEWIDTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMODULEWIDTH()
     * @generated
     * @ordered
     */
	protected static final Integer MODULEWIDTH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMODULEWIDTH() <em>MODULEWIDTH</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMODULEWIDTH()
     * @generated
     * @ordered
     */
	protected Integer modulewidth = MODULEWIDTH_EDEFAULT;

	/**
     * The default value of the '{@link #getELEMENTHEIGHT() <em>ELEMENTHEIGHT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getELEMENTHEIGHT()
     * @generated
     * @ordered
     */
	protected static final Integer ELEMENTHEIGHT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getELEMENTHEIGHT() <em>ELEMENTHEIGHT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getELEMENTHEIGHT()
     * @generated
     * @ordered
     */
	protected Integer elementheight = ELEMENTHEIGHT_EDEFAULT;

	/**
     * The default value of the '{@link #getMULT() <em>MULT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMULT()
     * @generated
     * @ordered
     */
	protected static final Integer MULT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMULT() <em>MULT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMULT()
     * @generated
     * @ordered
     */
	protected Integer mult = MULT_EDEFAULT;

	/**
     * The default value of the '{@link #getWENE() <em>WENE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWENE()
     * @generated
     * @ordered
     */
	protected static final Integer WENE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getWENE() <em>WENE</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getWENE()
     * @generated
     * @ordered
     */
	protected Integer wene = WENE_EDEFAULT;

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
	protected BDDImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getBDD();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getUBASE() {
        return ubase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setUBASE(Integer newUBASE) {
        Integer oldUBASE = ubase;
        ubase = newUBASE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__UBASE, oldUBASE, ubase));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__RESERVED, oldReserved, reserved));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXUPUB() {
        return xupub;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXUPUB(Integer newXUPUB) {
        Integer oldXUPUB = xupub;
        xupub = newXUPUB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__XUPUB, oldXUPUB, xupub));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYUPUB() {
        return yupub;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYUPUB(Integer newYUPUB) {
        Integer oldYUPUB = yupub;
        yupub = newYUPUB;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__YUPUB, oldYUPUB, yupub));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXEXTENT() {
        return xextent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXEXTENT(Integer newXEXTENT) {
        Integer oldXEXTENT = xextent;
        xextent = newXEXTENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__XEXTENT, oldXEXTENT, xextent));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYEXTENT() {
        return yextent;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYEXTENT(Integer newYEXTENT) {
        Integer oldYEXTENT = yextent;
        yextent = newYEXTENT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__YEXTENT, oldYEXTENT, yextent));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__RESERVED2, oldReserved2, reserved2));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getTYPE() {
        return type;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setTYPE(Integer newTYPE) {
        Integer oldTYPE = type;
        type = newTYPE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__TYPE, oldTYPE, type));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMOD() {
        return mod;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMOD(Integer newMOD) {
        Integer oldMOD = mod;
        mod = newMOD;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__MOD, oldMOD, mod));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getLID() {
        return lid;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLID(Integer newLID) {
        Integer oldLID = lid;
        lid = newLID;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__LID, oldLID, lid));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCOLOR() {
        return color;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCOLOR(Integer newCOLOR) {
        Integer oldCOLOR = color;
        color = newCOLOR;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__COLOR, oldCOLOR, color));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMODULEWIDTH() {
        return modulewidth;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMODULEWIDTH(Integer newMODULEWIDTH) {
        Integer oldMODULEWIDTH = modulewidth;
        modulewidth = newMODULEWIDTH;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__MODULEWIDTH, oldMODULEWIDTH, modulewidth));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getELEMENTHEIGHT() {
        return elementheight;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setELEMENTHEIGHT(Integer newELEMENTHEIGHT) {
        Integer oldELEMENTHEIGHT = elementheight;
        elementheight = newELEMENTHEIGHT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__ELEMENTHEIGHT, oldELEMENTHEIGHT, elementheight));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMULT() {
        return mult;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMULT(Integer newMULT) {
        Integer oldMULT = mult;
        mult = newMULT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__MULT, oldMULT, mult));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getWENE() {
        return wene;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setWENE(Integer newWENE) {
        Integer oldWENE = wene;
        wene = newWENE;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.BDD__WENE, oldWENE, wene));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<Triplet> getTriplets() {
        if (triplets == null) {
            triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.BDD__TRIPLETS);
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
            case AfplibPackage.BDD__TRIPLETS:
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
            case AfplibPackage.BDD__UBASE:
                return getUBASE();
            case AfplibPackage.BDD__RESERVED:
                return getReserved();
            case AfplibPackage.BDD__XUPUB:
                return getXUPUB();
            case AfplibPackage.BDD__YUPUB:
                return getYUPUB();
            case AfplibPackage.BDD__XEXTENT:
                return getXEXTENT();
            case AfplibPackage.BDD__YEXTENT:
                return getYEXTENT();
            case AfplibPackage.BDD__RESERVED2:
                return getReserved2();
            case AfplibPackage.BDD__TYPE:
                return getTYPE();
            case AfplibPackage.BDD__MOD:
                return getMOD();
            case AfplibPackage.BDD__LID:
                return getLID();
            case AfplibPackage.BDD__COLOR:
                return getCOLOR();
            case AfplibPackage.BDD__MODULEWIDTH:
                return getMODULEWIDTH();
            case AfplibPackage.BDD__ELEMENTHEIGHT:
                return getELEMENTHEIGHT();
            case AfplibPackage.BDD__MULT:
                return getMULT();
            case AfplibPackage.BDD__WENE:
                return getWENE();
            case AfplibPackage.BDD__TRIPLETS:
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
            case AfplibPackage.BDD__UBASE:
                setUBASE((Integer)newValue);
                return;
            case AfplibPackage.BDD__RESERVED:
                setReserved((Integer)newValue);
                return;
            case AfplibPackage.BDD__XUPUB:
                setXUPUB((Integer)newValue);
                return;
            case AfplibPackage.BDD__YUPUB:
                setYUPUB((Integer)newValue);
                return;
            case AfplibPackage.BDD__XEXTENT:
                setXEXTENT((Integer)newValue);
                return;
            case AfplibPackage.BDD__YEXTENT:
                setYEXTENT((Integer)newValue);
                return;
            case AfplibPackage.BDD__RESERVED2:
                setReserved2((Integer)newValue);
                return;
            case AfplibPackage.BDD__TYPE:
                setTYPE((Integer)newValue);
                return;
            case AfplibPackage.BDD__MOD:
                setMOD((Integer)newValue);
                return;
            case AfplibPackage.BDD__LID:
                setLID((Integer)newValue);
                return;
            case AfplibPackage.BDD__COLOR:
                setCOLOR((Integer)newValue);
                return;
            case AfplibPackage.BDD__MODULEWIDTH:
                setMODULEWIDTH((Integer)newValue);
                return;
            case AfplibPackage.BDD__ELEMENTHEIGHT:
                setELEMENTHEIGHT((Integer)newValue);
                return;
            case AfplibPackage.BDD__MULT:
                setMULT((Integer)newValue);
                return;
            case AfplibPackage.BDD__WENE:
                setWENE((Integer)newValue);
                return;
            case AfplibPackage.BDD__TRIPLETS:
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
            case AfplibPackage.BDD__UBASE:
                setUBASE(UBASE_EDEFAULT);
                return;
            case AfplibPackage.BDD__RESERVED:
                setReserved(RESERVED_EDEFAULT);
                return;
            case AfplibPackage.BDD__XUPUB:
                setXUPUB(XUPUB_EDEFAULT);
                return;
            case AfplibPackage.BDD__YUPUB:
                setYUPUB(YUPUB_EDEFAULT);
                return;
            case AfplibPackage.BDD__XEXTENT:
                setXEXTENT(XEXTENT_EDEFAULT);
                return;
            case AfplibPackage.BDD__YEXTENT:
                setYEXTENT(YEXTENT_EDEFAULT);
                return;
            case AfplibPackage.BDD__RESERVED2:
                setReserved2(RESERVED2_EDEFAULT);
                return;
            case AfplibPackage.BDD__TYPE:
                setTYPE(TYPE_EDEFAULT);
                return;
            case AfplibPackage.BDD__MOD:
                setMOD(MOD_EDEFAULT);
                return;
            case AfplibPackage.BDD__LID:
                setLID(LID_EDEFAULT);
                return;
            case AfplibPackage.BDD__COLOR:
                setCOLOR(COLOR_EDEFAULT);
                return;
            case AfplibPackage.BDD__MODULEWIDTH:
                setMODULEWIDTH(MODULEWIDTH_EDEFAULT);
                return;
            case AfplibPackage.BDD__ELEMENTHEIGHT:
                setELEMENTHEIGHT(ELEMENTHEIGHT_EDEFAULT);
                return;
            case AfplibPackage.BDD__MULT:
                setMULT(MULT_EDEFAULT);
                return;
            case AfplibPackage.BDD__WENE:
                setWENE(WENE_EDEFAULT);
                return;
            case AfplibPackage.BDD__TRIPLETS:
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
            case AfplibPackage.BDD__UBASE:
                return UBASE_EDEFAULT == null ? ubase != null : !UBASE_EDEFAULT.equals(ubase);
            case AfplibPackage.BDD__RESERVED:
                return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
            case AfplibPackage.BDD__XUPUB:
                return XUPUB_EDEFAULT == null ? xupub != null : !XUPUB_EDEFAULT.equals(xupub);
            case AfplibPackage.BDD__YUPUB:
                return YUPUB_EDEFAULT == null ? yupub != null : !YUPUB_EDEFAULT.equals(yupub);
            case AfplibPackage.BDD__XEXTENT:
                return XEXTENT_EDEFAULT == null ? xextent != null : !XEXTENT_EDEFAULT.equals(xextent);
            case AfplibPackage.BDD__YEXTENT:
                return YEXTENT_EDEFAULT == null ? yextent != null : !YEXTENT_EDEFAULT.equals(yextent);
            case AfplibPackage.BDD__RESERVED2:
                return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
            case AfplibPackage.BDD__TYPE:
                return TYPE_EDEFAULT == null ? type != null : !TYPE_EDEFAULT.equals(type);
            case AfplibPackage.BDD__MOD:
                return MOD_EDEFAULT == null ? mod != null : !MOD_EDEFAULT.equals(mod);
            case AfplibPackage.BDD__LID:
                return LID_EDEFAULT == null ? lid != null : !LID_EDEFAULT.equals(lid);
            case AfplibPackage.BDD__COLOR:
                return COLOR_EDEFAULT == null ? color != null : !COLOR_EDEFAULT.equals(color);
            case AfplibPackage.BDD__MODULEWIDTH:
                return MODULEWIDTH_EDEFAULT == null ? modulewidth != null : !MODULEWIDTH_EDEFAULT.equals(modulewidth);
            case AfplibPackage.BDD__ELEMENTHEIGHT:
                return ELEMENTHEIGHT_EDEFAULT == null ? elementheight != null : !ELEMENTHEIGHT_EDEFAULT.equals(elementheight);
            case AfplibPackage.BDD__MULT:
                return MULT_EDEFAULT == null ? mult != null : !MULT_EDEFAULT.equals(mult);
            case AfplibPackage.BDD__WENE:
                return WENE_EDEFAULT == null ? wene != null : !WENE_EDEFAULT.equals(wene);
            case AfplibPackage.BDD__TRIPLETS:
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
        result.append(" (UBASE: ");
        result.append(ubase);
        result.append(", Reserved: ");
        result.append(reserved);
        result.append(", XUPUB: ");
        result.append(xupub);
        result.append(", YUPUB: ");
        result.append(yupub);
        result.append(", XEXTENT: ");
        result.append(xextent);
        result.append(", YEXTENT: ");
        result.append(yextent);
        result.append(", Reserved2: ");
        result.append(reserved2);
        result.append(", TYPE: ");
        result.append(type);
        result.append(", MOD: ");
        result.append(mod);
        result.append(", LID: ");
        result.append(lid);
        result.append(", COLOR: ");
        result.append(color);
        result.append(", MODULEWIDTH: ");
        result.append(modulewidth);
        result.append(", ELEMENTHEIGHT: ");
        result.append(elementheight);
        result.append(", MULT: ");
        result.append(mult);
        result.append(", WENE: ");
        result.append(wene);
        result.append(')');
        return result.toString();
    }

} //BDDImpl
