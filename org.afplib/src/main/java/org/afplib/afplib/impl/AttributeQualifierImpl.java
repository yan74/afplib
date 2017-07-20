/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.AttributeQualifier;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Attribute Qualifier</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.AttributeQualifierImpl#getSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.AttributeQualifierImpl#getLevNum <em>Lev Num</em>}</li>
 * </ul>
 *
 * @generated
 */
public class AttributeQualifierImpl extends TripletImpl implements AttributeQualifier {
	/**
     * The default value of the '{@link #getSeqNum() <em>Seq Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSeqNum()
     * @generated
     * @ordered
     */
	protected static final Integer SEQ_NUM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getSeqNum() <em>Seq Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getSeqNum()
     * @generated
     * @ordered
     */
	protected Integer seqNum = SEQ_NUM_EDEFAULT;

	/**
     * The default value of the '{@link #getLevNum() <em>Lev Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLevNum()
     * @generated
     * @ordered
     */
	protected static final Integer LEV_NUM_EDEFAULT = null;

	/**
     * The cached value of the '{@link #getLevNum() <em>Lev Num</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #getLevNum()
     * @generated
     * @ordered
     */
	protected Integer levNum = LEV_NUM_EDEFAULT;

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected AttributeQualifierImpl() {
        super();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	protected EClass eStaticClass() {
        return AfplibPackage.eINSTANCE.getAttributeQualifier();
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getSeqNum() {
        return seqNum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setSeqNum(Integer newSeqNum) {
        Integer oldSeqNum = seqNum;
        seqNum = newSeqNum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ATTRIBUTE_QUALIFIER__SEQ_NUM, oldSeqNum, seqNum));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public Integer getLevNum() {
        return levNum;
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public void setLevNum(Integer newLevNum) {
        Integer oldLevNum = levNum;
        levNum = newLevNum;
        if (eNotificationRequired())
            eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.ATTRIBUTE_QUALIFIER__LEV_NUM, oldLevNum, levNum));
    }

	/**
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
        switch (featureID) {
            case AfplibPackage.ATTRIBUTE_QUALIFIER__SEQ_NUM:
                return getSeqNum();
            case AfplibPackage.ATTRIBUTE_QUALIFIER__LEV_NUM:
                return getLevNum();
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
            case AfplibPackage.ATTRIBUTE_QUALIFIER__SEQ_NUM:
                setSeqNum((Integer)newValue);
                return;
            case AfplibPackage.ATTRIBUTE_QUALIFIER__LEV_NUM:
                setLevNum((Integer)newValue);
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
            case AfplibPackage.ATTRIBUTE_QUALIFIER__SEQ_NUM:
                setSeqNum(SEQ_NUM_EDEFAULT);
                return;
            case AfplibPackage.ATTRIBUTE_QUALIFIER__LEV_NUM:
                setLevNum(LEV_NUM_EDEFAULT);
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
            case AfplibPackage.ATTRIBUTE_QUALIFIER__SEQ_NUM:
                return SEQ_NUM_EDEFAULT == null ? seqNum != null : !SEQ_NUM_EDEFAULT.equals(seqNum);
            case AfplibPackage.ATTRIBUTE_QUALIFIER__LEV_NUM:
                return LEV_NUM_EDEFAULT == null ? levNum != null : !LEV_NUM_EDEFAULT.equals(levNum);
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
        result.append(" (SeqNum: ");
        result.append(seqNum);
        result.append(", LevNum: ");
        result.append(levNum);
        result.append(')');
        return result.toString();
    }

} //AttributeQualifierImpl
