/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.MFC;

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
 * An implementation of the model object '<em><b>MFC</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.MFCImpl#getMFCFlgs <em>MFC Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MFCImpl#getMedColl <em>Med Coll</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MFCImpl#getMFCScpe <em>MFC Scpe</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.MFCImpl#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @generated
 */
public class MFCImpl extends SFImpl implements MFC {
	/**
	 * The default value of the '{@link #getMFCFlgs() <em>MFC Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFCFlgs()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MFC_FLGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMFCFlgs() <em>MFC Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFCFlgs()
	 * @generated
	 * @ordered
	 */
	protected Integer mfcFlgs = MFC_FLGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getMedColl() <em>Med Coll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedColl()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MED_COLL_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMedColl() <em>Med Coll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMedColl()
	 * @generated
	 * @ordered
	 */
	protected Integer medColl = MED_COLL_EDEFAULT;

	/**
	 * The default value of the '{@link #getMFCScpe() <em>MFC Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFCScpe()
	 * @generated
	 * @ordered
	 */
	protected static final Integer MFC_SCPE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getMFCScpe() <em>MFC Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getMFCScpe()
	 * @generated
	 * @ordered
	 */
	protected Integer mfcScpe = MFC_SCPE_EDEFAULT;

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
	protected MFCImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getMFC();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMFCFlgs() {
		return mfcFlgs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFCFlgs(Integer newMFCFlgs) {
		Integer oldMFCFlgs = mfcFlgs;
		mfcFlgs = newMFCFlgs;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MFC__MFC_FLGS, oldMFCFlgs, mfcFlgs));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMedColl() {
		return medColl;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMedColl(Integer newMedColl) {
		Integer oldMedColl = medColl;
		medColl = newMedColl;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MFC__MED_COLL, oldMedColl, medColl));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getMFCScpe() {
		return mfcScpe;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setMFCScpe(Integer newMFCScpe) {
		Integer oldMFCScpe = mfcScpe;
		mfcScpe = newMFCScpe;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.MFC__MFC_SCPE, oldMFCScpe, mfcScpe));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getTriplets() {
		if (triplets == null) {
			triplets = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.MFC__TRIPLETS);
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
			case AfplibPackage.MFC__TRIPLETS:
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
			case AfplibPackage.MFC__MFC_FLGS:
				return getMFCFlgs();
			case AfplibPackage.MFC__MED_COLL:
				return getMedColl();
			case AfplibPackage.MFC__MFC_SCPE:
				return getMFCScpe();
			case AfplibPackage.MFC__TRIPLETS:
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
			case AfplibPackage.MFC__MFC_FLGS:
				setMFCFlgs((Integer)newValue);
				return;
			case AfplibPackage.MFC__MED_COLL:
				setMedColl((Integer)newValue);
				return;
			case AfplibPackage.MFC__MFC_SCPE:
				setMFCScpe((Integer)newValue);
				return;
			case AfplibPackage.MFC__TRIPLETS:
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
			case AfplibPackage.MFC__MFC_FLGS:
				setMFCFlgs(MFC_FLGS_EDEFAULT);
				return;
			case AfplibPackage.MFC__MED_COLL:
				setMedColl(MED_COLL_EDEFAULT);
				return;
			case AfplibPackage.MFC__MFC_SCPE:
				setMFCScpe(MFC_SCPE_EDEFAULT);
				return;
			case AfplibPackage.MFC__TRIPLETS:
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
			case AfplibPackage.MFC__MFC_FLGS:
				return MFC_FLGS_EDEFAULT == null ? mfcFlgs != null : !MFC_FLGS_EDEFAULT.equals(mfcFlgs);
			case AfplibPackage.MFC__MED_COLL:
				return MED_COLL_EDEFAULT == null ? medColl != null : !MED_COLL_EDEFAULT.equals(medColl);
			case AfplibPackage.MFC__MFC_SCPE:
				return MFC_SCPE_EDEFAULT == null ? mfcScpe != null : !MFC_SCPE_EDEFAULT.equals(mfcScpe);
			case AfplibPackage.MFC__TRIPLETS:
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
		result.append(" (MFCFlgs: ");
		result.append(mfcFlgs);
		result.append(", MedColl: ");
		result.append(medColl);
		result.append(", MFCScpe: ");
		result.append(mfcScpe);
		result.append(')');
		return result.toString();
	}

} //MFCImpl
