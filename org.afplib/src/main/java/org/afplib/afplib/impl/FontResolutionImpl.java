/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FontResolution;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Resolution</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FontResolutionImpl#getMetTech <em>Met Tech</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontResolutionImpl#getRPuBase <em>RPu Base</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontResolutionImpl#getRPUnits <em>RP Units</em>}</li>
 * </ul>
 *
 * @generated
 */
public class FontResolutionImpl extends TripletImpl implements FontResolution {
	/**
     * The default value of the '{@link #getMetTech() <em>Met Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMetTech()
     * @generated
     * @ordered
     */
	protected static final Integer MET_TECH_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getMetTech() <em>Met Tech</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getMetTech()
     * @generated
     * @ordered
     */
	protected Integer metTech = MET_TECH_EDEFAULT;

	/**
     * The default value of the '{@link #getRPuBase() <em>RPu Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRPuBase()
     * @generated
     * @ordered
     */
	protected static final Integer RPU_BASE_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRPuBase() <em>RPu Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRPuBase()
     * @generated
     * @ordered
     */
	protected Integer rPuBase = RPU_BASE_EDEFAULT;

	/**
     * The default value of the '{@link #getRPUnits() <em>RP Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRPUnits()
     * @generated
     * @ordered
     */
	protected static final Integer RP_UNITS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getRPUnits() <em>RP Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRPUnits()
     * @generated
     * @ordered
     */
	protected Integer rpUnits = RP_UNITS_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected FontResolutionImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getFontResolution();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getMetTech() {
        return metTech;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setMetTech(Integer newMetTech) {
        Integer oldMetTech = metTech;
        metTech = newMetTech;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_RESOLUTION__MET_TECH, oldMetTech, metTech));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRPuBase() {
        return rPuBase;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRPuBase(Integer newRPuBase) {
        Integer oldRPuBase = rPuBase;
        rPuBase = newRPuBase;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_RESOLUTION__RPU_BASE, oldRPuBase, rPuBase));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getRPUnits() {
        return rpUnits;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setRPUnits(Integer newRPUnits) {
        Integer oldRPUnits = rpUnits;
        rpUnits = newRPUnits;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_RESOLUTION__RP_UNITS, oldRPUnits, rpUnits));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.FONT_RESOLUTION__MET_TECH:
                return getMetTech();
            case AfplibPackage.FONT_RESOLUTION__RPU_BASE:
                return getRPuBase();
            case AfplibPackage.FONT_RESOLUTION__RP_UNITS:
                return getRPUnits();
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
            case AfplibPackage.FONT_RESOLUTION__MET_TECH:
                setMetTech((Integer)newValue);
                return;
            case AfplibPackage.FONT_RESOLUTION__RPU_BASE:
                setRPuBase((Integer)newValue);
                return;
            case AfplibPackage.FONT_RESOLUTION__RP_UNITS:
                setRPUnits((Integer)newValue);
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
            case AfplibPackage.FONT_RESOLUTION__MET_TECH:
                setMetTech(MET_TECH_EDEFAULT);
                return;
            case AfplibPackage.FONT_RESOLUTION__RPU_BASE:
                setRPuBase(RPU_BASE_EDEFAULT);
                return;
            case AfplibPackage.FONT_RESOLUTION__RP_UNITS:
                setRPUnits(RP_UNITS_EDEFAULT);
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
            case AfplibPackage.FONT_RESOLUTION__MET_TECH:
                return MET_TECH_EDEFAULT == null ? metTech != null : !MET_TECH_EDEFAULT.equals(metTech);
            case AfplibPackage.FONT_RESOLUTION__RPU_BASE:
                return RPU_BASE_EDEFAULT == null ? rPuBase != null : !RPU_BASE_EDEFAULT.equals(rPuBase);
            case AfplibPackage.FONT_RESOLUTION__RP_UNITS:
                return RP_UNITS_EDEFAULT == null ? rpUnits != null : !RP_UNITS_EDEFAULT.equals(rpUnits);
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
        result.append(" (MetTech: ");
        result.append(metTech);
        result.append(", RPuBase: ");
        result.append(rPuBase);
        result.append(", RPUnits: ");
        result.append(rpUnits);
        result.append(')');
        return result.toString();
    }

} //FontResolutionImpl
