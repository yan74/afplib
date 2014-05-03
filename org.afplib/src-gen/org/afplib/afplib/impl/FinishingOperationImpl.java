/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FinishingOperation;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Finishing Operation</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FinishingOperationImpl#getFOpType <em>FOp Type</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FinishingOperationImpl#getRefEdge <em>Ref Edge</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FinishingOperationImpl#getFOpCnt <em>FOp Cnt</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FinishingOperationImpl#getAxOffst <em>Ax Offst</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FinishingOperationImpl#getOpPos <em>Op Pos</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FinishingOperationImpl extends TripletImpl implements FinishingOperation {
	/**
	 * The default value of the '{@link #getFOpType() <em>FOp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFOpType()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FOP_TYPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFOpType() <em>FOp Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFOpType()
	 * @generated
	 * @ordered
	 */
	protected Integer fOpType = FOP_TYPE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRefEdge() <em>Ref Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefEdge()
	 * @generated
	 * @ordered
	 */
	protected static final Integer REF_EDGE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRefEdge() <em>Ref Edge</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRefEdge()
	 * @generated
	 * @ordered
	 */
	protected Integer refEdge = REF_EDGE_EDEFAULT;

	/**
	 * The default value of the '{@link #getFOpCnt() <em>FOp Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFOpCnt()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FOP_CNT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFOpCnt() <em>FOp Cnt</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFOpCnt()
	 * @generated
	 * @ordered
	 */
	protected Integer fOpCnt = FOP_CNT_EDEFAULT;

	/**
	 * The default value of the '{@link #getAxOffst() <em>Ax Offst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxOffst()
	 * @generated
	 * @ordered
	 */
	protected static final Integer AX_OFFST_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getAxOffst() <em>Ax Offst</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getAxOffst()
	 * @generated
	 * @ordered
	 */
	protected Integer axOffst = AX_OFFST_EDEFAULT;

	/**
	 * The default value of the '{@link #getOpPos() <em>Op Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpPos()
	 * @generated
	 * @ordered
	 */
	protected static final byte[] OP_POS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOpPos() <em>Op Pos</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOpPos()
	 * @generated
	 * @ordered
	 */
	protected byte[] opPos = OP_POS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FinishingOperationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFinishingOperation();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFOpType() {
		return fOpType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFOpType(Integer newFOpType) {
		Integer oldFOpType = fOpType;
		fOpType = newFOpType;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_OPERATION__FOP_TYPE, oldFOpType, fOpType));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRefEdge() {
		return refEdge;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRefEdge(Integer newRefEdge) {
		Integer oldRefEdge = refEdge;
		refEdge = newRefEdge;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_OPERATION__REF_EDGE, oldRefEdge, refEdge));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFOpCnt() {
		return fOpCnt;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFOpCnt(Integer newFOpCnt) {
		Integer oldFOpCnt = fOpCnt;
		fOpCnt = newFOpCnt;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_OPERATION__FOP_CNT, oldFOpCnt, fOpCnt));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getAxOffst() {
		return axOffst;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setAxOffst(Integer newAxOffst) {
		Integer oldAxOffst = axOffst;
		axOffst = newAxOffst;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_OPERATION__AX_OFFST, oldAxOffst, axOffst));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public byte[] getOpPos() {
		return opPos;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOpPos(byte[] newOpPos) {
		byte[] oldOpPos = opPos;
		opPos = newOpPos;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FINISHING_OPERATION__OP_POS, oldOpPos, opPos));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FINISHING_OPERATION__FOP_TYPE:
				return getFOpType();
			case AfplibPackage.FINISHING_OPERATION__REF_EDGE:
				return getRefEdge();
			case AfplibPackage.FINISHING_OPERATION__FOP_CNT:
				return getFOpCnt();
			case AfplibPackage.FINISHING_OPERATION__AX_OFFST:
				return getAxOffst();
			case AfplibPackage.FINISHING_OPERATION__OP_POS:
				return getOpPos();
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
			case AfplibPackage.FINISHING_OPERATION__FOP_TYPE:
				setFOpType((Integer)newValue);
				return;
			case AfplibPackage.FINISHING_OPERATION__REF_EDGE:
				setRefEdge((Integer)newValue);
				return;
			case AfplibPackage.FINISHING_OPERATION__FOP_CNT:
				setFOpCnt((Integer)newValue);
				return;
			case AfplibPackage.FINISHING_OPERATION__AX_OFFST:
				setAxOffst((Integer)newValue);
				return;
			case AfplibPackage.FINISHING_OPERATION__OP_POS:
				setOpPos((byte[])newValue);
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
			case AfplibPackage.FINISHING_OPERATION__FOP_TYPE:
				setFOpType(FOP_TYPE_EDEFAULT);
				return;
			case AfplibPackage.FINISHING_OPERATION__REF_EDGE:
				setRefEdge(REF_EDGE_EDEFAULT);
				return;
			case AfplibPackage.FINISHING_OPERATION__FOP_CNT:
				setFOpCnt(FOP_CNT_EDEFAULT);
				return;
			case AfplibPackage.FINISHING_OPERATION__AX_OFFST:
				setAxOffst(AX_OFFST_EDEFAULT);
				return;
			case AfplibPackage.FINISHING_OPERATION__OP_POS:
				setOpPos(OP_POS_EDEFAULT);
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
			case AfplibPackage.FINISHING_OPERATION__FOP_TYPE:
				return FOP_TYPE_EDEFAULT == null ? fOpType != null : !FOP_TYPE_EDEFAULT.equals(fOpType);
			case AfplibPackage.FINISHING_OPERATION__REF_EDGE:
				return REF_EDGE_EDEFAULT == null ? refEdge != null : !REF_EDGE_EDEFAULT.equals(refEdge);
			case AfplibPackage.FINISHING_OPERATION__FOP_CNT:
				return FOP_CNT_EDEFAULT == null ? fOpCnt != null : !FOP_CNT_EDEFAULT.equals(fOpCnt);
			case AfplibPackage.FINISHING_OPERATION__AX_OFFST:
				return AX_OFFST_EDEFAULT == null ? axOffst != null : !AX_OFFST_EDEFAULT.equals(axOffst);
			case AfplibPackage.FINISHING_OPERATION__OP_POS:
				return OP_POS_EDEFAULT == null ? opPos != null : !OP_POS_EDEFAULT.equals(opPos);
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
		result.append(" (FOpType: ");
		result.append(fOpType);
		result.append(", RefEdge: ");
		result.append(refEdge);
		result.append(", FOpCnt: ");
		result.append(fOpCnt);
		result.append(", AxOffst: ");
		result.append(axOffst);
		result.append(", OpPos: ");
		result.append(opPos);
		result.append(')');
		return result.toString();
	}

} //FinishingOperationImpl
