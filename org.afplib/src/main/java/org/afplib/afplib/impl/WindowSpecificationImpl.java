/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.WindowSpecification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Window Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getFLAGS <em>FLAGS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getRES3 <em>RES3</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getCFORMAT <em>CFORMAT</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getUBASE <em>UBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getXRESOL <em>XRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getYRESOL <em>YRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getIMGXYRES <em>IMGXYRES</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getXLWIND <em>XLWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getXRWIND <em>XRWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getYBWIND <em>YBWIND</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.WindowSpecificationImpl#getYTWIND <em>YTWIND</em>}</li>
 * </ul>
 *
 * @generated
 */
public class WindowSpecificationImpl extends TripletImpl implements WindowSpecification {
	/**
     * The default value of the '{@link #getFLAGS() <em>FLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFLAGS()
     * @generated
     * @ordered
     */
	protected static final Integer FLAGS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getFLAGS() <em>FLAGS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getFLAGS()
     * @generated
     * @ordered
     */
	protected Integer flags = FLAGS_EDEFAULT;

	/**
     * The default value of the '{@link #getRES3() <em>RES3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRES3()
     * @generated
     * @ordered
     */
	protected static final Integer RES3_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRES3() <em>RES3</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRES3()
     * @generated
     * @ordered
     */
	protected Integer res3 = RES3_EDEFAULT;

	/**
     * The default value of the '{@link #getCFORMAT() <em>CFORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCFORMAT()
     * @generated
     * @ordered
     */
	protected static final Integer CFORMAT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCFORMAT() <em>CFORMAT</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCFORMAT()
     * @generated
     * @ordered
     */
	protected Integer cformat = CFORMAT_EDEFAULT;

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
     * The default value of the '{@link #getXRESOL() <em>XRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXRESOL()
     * @generated
     * @ordered
     */
	protected static final Integer XRESOL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXRESOL() <em>XRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXRESOL()
     * @generated
     * @ordered
     */
	protected Integer xresol = XRESOL_EDEFAULT;

	/**
     * The default value of the '{@link #getYRESOL() <em>YRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYRESOL()
     * @generated
     * @ordered
     */
	protected static final Integer YRESOL_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYRESOL() <em>YRESOL</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYRESOL()
     * @generated
     * @ordered
     */
	protected Integer yresol = YRESOL_EDEFAULT;

	/**
     * The default value of the '{@link #getIMGXYRES() <em>IMGXYRES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIMGXYRES()
     * @generated
     * @ordered
     */
	protected static final Integer IMGXYRES_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getIMGXYRES() <em>IMGXYRES</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getIMGXYRES()
     * @generated
     * @ordered
     */
	protected Integer imgxyres = IMGXYRES_EDEFAULT;

	/**
     * The default value of the '{@link #getXLWIND() <em>XLWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXLWIND()
     * @generated
     * @ordered
     */
	protected static final Integer XLWIND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXLWIND() <em>XLWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXLWIND()
     * @generated
     * @ordered
     */
	protected Integer xlwind = XLWIND_EDEFAULT;

	/**
     * The default value of the '{@link #getXRWIND() <em>XRWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXRWIND()
     * @generated
     * @ordered
     */
	protected static final Integer XRWIND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXRWIND() <em>XRWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXRWIND()
     * @generated
     * @ordered
     */
	protected Integer xrwind = XRWIND_EDEFAULT;

	/**
     * The default value of the '{@link #getYBWIND() <em>YBWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYBWIND()
     * @generated
     * @ordered
     */
	protected static final Integer YBWIND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYBWIND() <em>YBWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYBWIND()
     * @generated
     * @ordered
     */
	protected Integer ybwind = YBWIND_EDEFAULT;

	/**
     * The default value of the '{@link #getYTWIND() <em>YTWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYTWIND()
     * @generated
     * @ordered
     */
	protected static final Integer YTWIND_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYTWIND() <em>YTWIND</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYTWIND()
     * @generated
     * @ordered
     */
	protected Integer ytwind = YTWIND_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected WindowSpecificationImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getWindowSpecification();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getFLAGS() {
        return flags;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setFLAGS(Integer newFLAGS) {
        Integer oldFLAGS = flags;
        flags = newFLAGS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__FLAGS, oldFLAGS, flags));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRES3() {
        return res3;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRES3(Integer newRES3) {
        Integer oldRES3 = res3;
        res3 = newRES3;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__RES3, oldRES3, res3));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCFORMAT() {
        return cformat;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCFORMAT(Integer newCFORMAT) {
        Integer oldCFORMAT = cformat;
        cformat = newCFORMAT;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__CFORMAT, oldCFORMAT, cformat));
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
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__UBASE, oldUBASE, ubase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXRESOL() {
        return xresol;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXRESOL(Integer newXRESOL) {
        Integer oldXRESOL = xresol;
        xresol = newXRESOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__XRESOL, oldXRESOL, xresol));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYRESOL() {
        return yresol;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYRESOL(Integer newYRESOL) {
        Integer oldYRESOL = yresol;
        yresol = newYRESOL;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__YRESOL, oldYRESOL, yresol));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getIMGXYRES() {
        return imgxyres;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setIMGXYRES(Integer newIMGXYRES) {
        Integer oldIMGXYRES = imgxyres;
        imgxyres = newIMGXYRES;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__IMGXYRES, oldIMGXYRES, imgxyres));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXLWIND() {
        return xlwind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXLWIND(Integer newXLWIND) {
        Integer oldXLWIND = xlwind;
        xlwind = newXLWIND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__XLWIND, oldXLWIND, xlwind));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXRWIND() {
        return xrwind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXRWIND(Integer newXRWIND) {
        Integer oldXRWIND = xrwind;
        xrwind = newXRWIND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__XRWIND, oldXRWIND, xrwind));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYBWIND() {
        return ybwind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYBWIND(Integer newYBWIND) {
        Integer oldYBWIND = ybwind;
        ybwind = newYBWIND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__YBWIND, oldYBWIND, ybwind));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYTWIND() {
        return ytwind;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYTWIND(Integer newYTWIND) {
        Integer oldYTWIND = ytwind;
        ytwind = newYTWIND;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.WINDOW_SPECIFICATION__YTWIND, oldYTWIND, ytwind));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.WINDOW_SPECIFICATION__FLAGS:
                return getFLAGS();
            case AfplibPackage.WINDOW_SPECIFICATION__RES3:
                return getRES3();
            case AfplibPackage.WINDOW_SPECIFICATION__CFORMAT:
                return getCFORMAT();
            case AfplibPackage.WINDOW_SPECIFICATION__UBASE:
                return getUBASE();
            case AfplibPackage.WINDOW_SPECIFICATION__XRESOL:
                return getXRESOL();
            case AfplibPackage.WINDOW_SPECIFICATION__YRESOL:
                return getYRESOL();
            case AfplibPackage.WINDOW_SPECIFICATION__IMGXYRES:
                return getIMGXYRES();
            case AfplibPackage.WINDOW_SPECIFICATION__XLWIND:
                return getXLWIND();
            case AfplibPackage.WINDOW_SPECIFICATION__XRWIND:
                return getXRWIND();
            case AfplibPackage.WINDOW_SPECIFICATION__YBWIND:
                return getYBWIND();
            case AfplibPackage.WINDOW_SPECIFICATION__YTWIND:
                return getYTWIND();
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
            case AfplibPackage.WINDOW_SPECIFICATION__FLAGS:
                setFLAGS((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__RES3:
                setRES3((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__CFORMAT:
                setCFORMAT((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__UBASE:
                setUBASE((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XRESOL:
                setXRESOL((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YRESOL:
                setYRESOL((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__IMGXYRES:
                setIMGXYRES((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XLWIND:
                setXLWIND((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XRWIND:
                setXRWIND((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YBWIND:
                setYBWIND((Integer)newValue);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YTWIND:
                setYTWIND((Integer)newValue);
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
            case AfplibPackage.WINDOW_SPECIFICATION__FLAGS:
                setFLAGS(FLAGS_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__RES3:
                setRES3(RES3_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__CFORMAT:
                setCFORMAT(CFORMAT_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__UBASE:
                setUBASE(UBASE_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XRESOL:
                setXRESOL(XRESOL_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YRESOL:
                setYRESOL(YRESOL_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__IMGXYRES:
                setIMGXYRES(IMGXYRES_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XLWIND:
                setXLWIND(XLWIND_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__XRWIND:
                setXRWIND(XRWIND_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YBWIND:
                setYBWIND(YBWIND_EDEFAULT);
                return;
            case AfplibPackage.WINDOW_SPECIFICATION__YTWIND:
                setYTWIND(YTWIND_EDEFAULT);
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
            case AfplibPackage.WINDOW_SPECIFICATION__FLAGS:
                return FLAGS_EDEFAULT == null ? flags != null : !FLAGS_EDEFAULT.equals(flags);
            case AfplibPackage.WINDOW_SPECIFICATION__RES3:
                return RES3_EDEFAULT == null ? res3 != null : !RES3_EDEFAULT.equals(res3);
            case AfplibPackage.WINDOW_SPECIFICATION__CFORMAT:
                return CFORMAT_EDEFAULT == null ? cformat != null : !CFORMAT_EDEFAULT.equals(cformat);
            case AfplibPackage.WINDOW_SPECIFICATION__UBASE:
                return UBASE_EDEFAULT == null ? ubase != null : !UBASE_EDEFAULT.equals(ubase);
            case AfplibPackage.WINDOW_SPECIFICATION__XRESOL:
                return XRESOL_EDEFAULT == null ? xresol != null : !XRESOL_EDEFAULT.equals(xresol);
            case AfplibPackage.WINDOW_SPECIFICATION__YRESOL:
                return YRESOL_EDEFAULT == null ? yresol != null : !YRESOL_EDEFAULT.equals(yresol);
            case AfplibPackage.WINDOW_SPECIFICATION__IMGXYRES:
                return IMGXYRES_EDEFAULT == null ? imgxyres != null : !IMGXYRES_EDEFAULT.equals(imgxyres);
            case AfplibPackage.WINDOW_SPECIFICATION__XLWIND:
                return XLWIND_EDEFAULT == null ? xlwind != null : !XLWIND_EDEFAULT.equals(xlwind);
            case AfplibPackage.WINDOW_SPECIFICATION__XRWIND:
                return XRWIND_EDEFAULT == null ? xrwind != null : !XRWIND_EDEFAULT.equals(xrwind);
            case AfplibPackage.WINDOW_SPECIFICATION__YBWIND:
                return YBWIND_EDEFAULT == null ? ybwind != null : !YBWIND_EDEFAULT.equals(ybwind);
            case AfplibPackage.WINDOW_SPECIFICATION__YTWIND:
                return YTWIND_EDEFAULT == null ? ytwind != null : !YTWIND_EDEFAULT.equals(ytwind);
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
        result.append(" (FLAGS: ");
        result.append(flags);
        result.append(", RES3: ");
        result.append(res3);
        result.append(", CFORMAT: ");
        result.append(cformat);
        result.append(", UBASE: ");
        result.append(ubase);
        result.append(", XRESOL: ");
        result.append(xresol);
        result.append(", YRESOL: ");
        result.append(yresol);
        result.append(", IMGXYRES: ");
        result.append(imgxyres);
        result.append(", XLWIND: ");
        result.append(xlwind);
        result.append(", XRWIND: ");
        result.append(xrwind);
        result.append(", YBWIND: ");
        result.append(ybwind);
        result.append(", YTWIND: ");
        result.append(ytwind);
        result.append(')');
        return result.toString();
    }

} //WindowSpecificationImpl
