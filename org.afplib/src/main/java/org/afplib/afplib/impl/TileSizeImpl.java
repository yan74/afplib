/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.TileSize;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Tile Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.TileSizeImpl#getTHSIZE <em>THSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSizeImpl#getTVSIZE <em>TVSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.TileSizeImpl#getRELRES <em>RELRES</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class TileSizeImpl extends TripletImpl implements TileSize {
	/**
	 * The default value of the '{@link #getTHSIZE() <em>THSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer THSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTHSIZE() <em>THSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTHSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer thsize = THSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getTVSIZE() <em>TVSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTVSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer TVSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getTVSIZE() <em>TVSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getTVSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer tvsize = TVSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getRELRES() <em>RELRES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELRES()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RELRES_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getRELRES() <em>RELRES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getRELRES()
	 * @generated
	 * @ordered
	 */
	protected Integer relres = RELRES_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected TileSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getTileSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTHSIZE() {
		return thsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTHSIZE(Integer newTHSIZE) {
		Integer oldTHSIZE = thsize;
		thsize = newTHSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SIZE__THSIZE, oldTHSIZE, thsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getTVSIZE() {
		return tvsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setTVSIZE(Integer newTVSIZE) {
		Integer oldTVSIZE = tvsize;
		tvsize = newTVSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SIZE__TVSIZE, oldTVSIZE, tvsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getRELRES() {
		return relres;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setRELRES(Integer newRELRES) {
		Integer oldRELRES = relres;
		relres = newRELRES;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.TILE_SIZE__RELRES, oldRELRES, relres));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.TILE_SIZE__THSIZE:
				return getTHSIZE();
			case AfplibPackage.TILE_SIZE__TVSIZE:
				return getTVSIZE();
			case AfplibPackage.TILE_SIZE__RELRES:
				return getRELRES();
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
			case AfplibPackage.TILE_SIZE__THSIZE:
				setTHSIZE((Integer)newValue);
				return;
			case AfplibPackage.TILE_SIZE__TVSIZE:
				setTVSIZE((Integer)newValue);
				return;
			case AfplibPackage.TILE_SIZE__RELRES:
				setRELRES((Integer)newValue);
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
			case AfplibPackage.TILE_SIZE__THSIZE:
				setTHSIZE(THSIZE_EDEFAULT);
				return;
			case AfplibPackage.TILE_SIZE__TVSIZE:
				setTVSIZE(TVSIZE_EDEFAULT);
				return;
			case AfplibPackage.TILE_SIZE__RELRES:
				setRELRES(RELRES_EDEFAULT);
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
			case AfplibPackage.TILE_SIZE__THSIZE:
				return THSIZE_EDEFAULT == null ? thsize != null : !THSIZE_EDEFAULT.equals(thsize);
			case AfplibPackage.TILE_SIZE__TVSIZE:
				return TVSIZE_EDEFAULT == null ? tvsize != null : !TVSIZE_EDEFAULT.equals(tvsize);
			case AfplibPackage.TILE_SIZE__RELRES:
				return RELRES_EDEFAULT == null ? relres != null : !RELRES_EDEFAULT.equals(relres);
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
		result.append(" (THSIZE: ");
		result.append(thsize);
		result.append(", TVSIZE: ");
		result.append(tvsize);
		result.append(", RELRES: ");
		result.append(relres);
		result.append(')');
		return result.toString();
	}

} //TileSizeImpl
