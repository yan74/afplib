/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FNMRG;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>FNMRG</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FNMRGImpl#getCharBoxWd <em>Char Box Wd</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNMRGImpl#getCharBoxHt <em>Char Box Ht</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FNMRGImpl#getPatDOset <em>Pat DOset</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FNMRGImpl extends TripletImpl implements FNMRG {
	/**
     * The default value of the '{@link #getCharBoxWd() <em>Char Box Wd</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharBoxWd()
     * @generated
     * @ordered
     */
	protected static final Integer CHAR_BOX_WD_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharBoxWd() <em>Char Box Wd</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharBoxWd()
     * @generated
     * @ordered
     */
	protected Integer charBoxWd = CHAR_BOX_WD_EDEFAULT;

	/**
     * The default value of the '{@link #getCharBoxHt() <em>Char Box Ht</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharBoxHt()
     * @generated
     * @ordered
     */
	protected static final Integer CHAR_BOX_HT_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getCharBoxHt() <em>Char Box Ht</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getCharBoxHt()
     * @generated
     * @ordered
     */
	protected Integer charBoxHt = CHAR_BOX_HT_EDEFAULT;

	/**
     * The default value of the '{@link #getPatDOset() <em>Pat DOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPatDOset()
     * @generated
     * @ordered
     */
	protected static final Integer PAT_DOSET_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPatDOset() <em>Pat DOset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPatDOset()
     * @generated
     * @ordered
     */
	protected Integer patDOset = PAT_DOSET_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FNMRGImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFNMRG();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCharBoxWd() {
        return charBoxWd;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharBoxWd(Integer newCharBoxWd) {
        Integer oldCharBoxWd = charBoxWd;
        charBoxWd = newCharBoxWd;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNMRG__CHAR_BOX_WD, oldCharBoxWd, charBoxWd));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getCharBoxHt() {
        return charBoxHt;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setCharBoxHt(Integer newCharBoxHt) {
        Integer oldCharBoxHt = charBoxHt;
        charBoxHt = newCharBoxHt;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNMRG__CHAR_BOX_HT, oldCharBoxHt, charBoxHt));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getPatDOset() {
        return patDOset;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPatDOset(Integer newPatDOset) {
        Integer oldPatDOset = patDOset;
        patDOset = newPatDOset;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FNMRG__PAT_DOSET, oldPatDOset, patDOset));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.FNMRG__CHAR_BOX_WD:
                return getCharBoxWd();
            case AfplibPackage.FNMRG__CHAR_BOX_HT:
                return getCharBoxHt();
            case AfplibPackage.FNMRG__PAT_DOSET:
                return getPatDOset();
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
            case AfplibPackage.FNMRG__CHAR_BOX_WD:
                setCharBoxWd((Integer)newValue);
                return;
            case AfplibPackage.FNMRG__CHAR_BOX_HT:
                setCharBoxHt((Integer)newValue);
                return;
            case AfplibPackage.FNMRG__PAT_DOSET:
                setPatDOset((Integer)newValue);
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
            case AfplibPackage.FNMRG__CHAR_BOX_WD:
                setCharBoxWd(CHAR_BOX_WD_EDEFAULT);
                return;
            case AfplibPackage.FNMRG__CHAR_BOX_HT:
                setCharBoxHt(CHAR_BOX_HT_EDEFAULT);
                return;
            case AfplibPackage.FNMRG__PAT_DOSET:
                setPatDOset(PAT_DOSET_EDEFAULT);
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
            case AfplibPackage.FNMRG__CHAR_BOX_WD:
                return CHAR_BOX_WD_EDEFAULT == null ? charBoxWd != null : !CHAR_BOX_WD_EDEFAULT.equals(charBoxWd);
            case AfplibPackage.FNMRG__CHAR_BOX_HT:
                return CHAR_BOX_HT_EDEFAULT == null ? charBoxHt != null : !CHAR_BOX_HT_EDEFAULT.equals(charBoxHt);
            case AfplibPackage.FNMRG__PAT_DOSET:
                return PAT_DOSET_EDEFAULT == null ? patDOset != null : !PAT_DOSET_EDEFAULT.equals(patDOset);
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
        result.append(" (CharBoxWd: ");
        result.append(charBoxWd);
        result.append(", CharBoxHt: ");
        result.append(charBoxHt);
        result.append(", PatDOset: ");
        result.append(patDOset);
        result.append(')');
        return result.toString();
    }

} //FNMRGImpl
