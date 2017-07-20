/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MediumMapPageNumber;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Medium Map Page Number</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MediumMapPageNumberImpl#getPageNum <em>Page Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MediumMapPageNumberImpl extends TripletImpl implements MediumMapPageNumber {
	/**
     * The default value of the '{@link #getPageNum() <em>Page Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPageNum()
     * @generated
     * @ordered
     */
	protected static final Integer PAGE_NUM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getPageNum() <em>Page Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getPageNum()
     * @generated
     * @ordered
     */
	protected Integer pageNum = PAGE_NUM_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected MediumMapPageNumberImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getMediumMapPageNumber();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getPageNum() {
        return pageNum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setPageNum(Integer newPageNum) {
        Integer oldPageNum = pageNum;
        pageNum = newPageNum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MEDIUM_MAP_PAGE_NUMBER__PAGE_NUM, oldPageNum, pageNum));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER__PAGE_NUM:
                return getPageNum();
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
            case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER__PAGE_NUM:
                setPageNum((Integer)newValue);
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
            case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER__PAGE_NUM:
                setPageNum(PAGE_NUM_EDEFAULT);
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
            case AfplibPackage.MEDIUM_MAP_PAGE_NUMBER__PAGE_NUM:
                return PAGE_NUM_EDEFAULT == null ? pageNum != null : !PAGE_NUM_EDEFAULT.equals(pageNum);
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
        result.append(" (PageNum: ");
        result.append(pageNum);
        result.append(')');
        return result.toString();
    }

} //MediumMapPageNumberImpl
