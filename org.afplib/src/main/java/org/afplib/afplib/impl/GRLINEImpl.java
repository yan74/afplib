/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.GRLINE;
import org.afplib.afplib.GRLINERG;

import org.afplib.base.impl.TripletImpl;

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
 * An implementation of the model object '<em><b>GRLINE</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.GRLINEImpl#getXPOS <em>XPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GRLINEImpl#getYPOS <em>YPOS</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.GRLINEImpl#getRg <em>Rg</em>}</li>
 * </ul>
 *
 * @generated
 */
public class GRLINEImpl extends TripletImpl implements GRLINE {
	/**
     * The default value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS()
     * @generated
     * @ordered
     */
	protected static final Integer XPOS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getXPOS() <em>XPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getXPOS()
     * @generated
     * @ordered
     */
	protected Integer xpos = XPOS_EDEFAULT;

	/**
     * The default value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS()
     * @generated
     * @ordered
     */
	protected static final Integer YPOS_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getYPOS() <em>YPOS</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getYPOS()
     * @generated
     * @ordered
     */
	protected Integer ypos = YPOS_EDEFAULT;

	/**
     * The cached value of the '{@link #getRg() <em>Rg</em>}' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getRg()
     * @generated
     * @ordered
     */
	protected EList<GRLINERG> rg;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected GRLINEImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getGRLINE();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getXPOS() {
        return xpos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setXPOS(Integer newXPOS) {
        Integer oldXPOS = xpos;
        xpos = newXPOS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GRLINE__XPOS, oldXPOS, xpos));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getYPOS() {
        return ypos;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setYPOS(Integer newYPOS) {
        Integer oldYPOS = ypos;
        ypos = newYPOS;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.GRLINE__YPOS, oldYPOS, ypos));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public EList<GRLINERG> getRg() {
        if (rg == null) {
            rg = new EObjectContainmentEList.Resolving<GRLINERG>(GRLINERG.class, this, AfplibPackage.GRLINE__RG);
        }
        return rg;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
        switch (featureID) {
            case AfplibPackage.GRLINE__RG:
                return ((InternalEList<?>)getRg()).basicRemove(otherEnd, msgs);
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
            case AfplibPackage.GRLINE__XPOS:
                return getXPOS();
            case AfplibPackage.GRLINE__YPOS:
                return getYPOS();
            case AfplibPackage.GRLINE__RG:
                return getRg();
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
            case AfplibPackage.GRLINE__XPOS:
                setXPOS((Integer)newValue);
                return;
            case AfplibPackage.GRLINE__YPOS:
                setYPOS((Integer)newValue);
                return;
            case AfplibPackage.GRLINE__RG:
                getRg().clear();
                getRg().addAll((Collection<? extends GRLINERG>)newValue);
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
            case AfplibPackage.GRLINE__XPOS:
                setXPOS(XPOS_EDEFAULT);
                return;
            case AfplibPackage.GRLINE__YPOS:
                setYPOS(YPOS_EDEFAULT);
                return;
            case AfplibPackage.GRLINE__RG:
                getRg().clear();
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
            case AfplibPackage.GRLINE__XPOS:
                return XPOS_EDEFAULT == null ? xpos != null : !XPOS_EDEFAULT.equals(xpos);
            case AfplibPackage.GRLINE__YPOS:
                return YPOS_EDEFAULT == null ? ypos != null : !YPOS_EDEFAULT.equals(ypos);
            case AfplibPackage.GRLINE__RG:
                return rg != null && !rg.isEmpty();
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
        result.append(" (XPOS: ");
        result.append(xpos);
        result.append(", YPOS: ");
        result.append(ypos);
        result.append(')');
        return result.toString();
    }

} //GRLINEImpl
