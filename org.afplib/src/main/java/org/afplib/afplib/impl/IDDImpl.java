/**
 */
package org.afplib.afplib.impl;

import java.util.Collection;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.IDD;

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
 * An implementation of the model object '<em><b>IDD</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getUNITBASE <em>UNITBASE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getXRESOL <em>XRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getYRESOL <em>YRESOL</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getXSIZE <em>XSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getYSIZE <em>YSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.IDDImpl#getSDFS <em>SDFS</em>}</li>
 * </ul>
 *
 * @generated
 */
public class IDDImpl extends SFImpl implements IDD {
	/**
	 * The default value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNITBASE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer UNITBASE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getUNITBASE() <em>UNITBASE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUNITBASE()
	 * @generated
	 * @ordered
	 */
	protected Integer unitbase = UNITBASE_EDEFAULT;

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
	 * The default value of the '{@link #getXSIZE() <em>XSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer XSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getXSIZE() <em>XSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getXSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer xsize = XSIZE_EDEFAULT;

	/**
	 * The default value of the '{@link #getYSIZE() <em>YSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSIZE()
	 * @generated
	 * @ordered
	 */
	protected static final Integer YSIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getYSIZE() <em>YSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getYSIZE()
	 * @generated
	 * @ordered
	 */
	protected Integer ysize = YSIZE_EDEFAULT;

	/**
	 * The cached value of the '{@link #getSDFS() <em>SDFS</em>}' containment reference list.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getSDFS()
	 * @generated
	 * @ordered
	 */
	protected EList<Triplet> sdfs;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected IDDImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.IDD;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getUNITBASE() {
		return unitbase;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setUNITBASE(Integer newUNITBASE) {
		Integer oldUNITBASE = unitbase;
		unitbase = newUNITBASE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDD__UNITBASE, oldUNITBASE, unitbase));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDD__XRESOL, oldXRESOL, xresol));
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
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDD__YRESOL, oldYRESOL, yresol));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getXSIZE() {
		return xsize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setXSIZE(Integer newXSIZE) {
		Integer oldXSIZE = xsize;
		xsize = newXSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDD__XSIZE, oldXSIZE, xsize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getYSIZE() {
		return ysize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setYSIZE(Integer newYSIZE) {
		Integer oldYSIZE = ysize;
		ysize = newYSIZE;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.IDD__YSIZE, oldYSIZE, ysize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EList<Triplet> getSDFS() {
		if (sdfs == null) {
			sdfs = new EObjectContainmentEList.Resolving<Triplet>(Triplet.class, this, AfplibPackage.IDD__SDFS);
		}
		return sdfs;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public NotificationChain eInverseRemove(InternalEObject otherEnd, int featureID, NotificationChain msgs) {
		switch (featureID) {
			case AfplibPackage.IDD__SDFS:
				return ((InternalEList<?>)getSDFS()).basicRemove(otherEnd, msgs);
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
			case AfplibPackage.IDD__UNITBASE:
				return getUNITBASE();
			case AfplibPackage.IDD__XRESOL:
				return getXRESOL();
			case AfplibPackage.IDD__YRESOL:
				return getYRESOL();
			case AfplibPackage.IDD__XSIZE:
				return getXSIZE();
			case AfplibPackage.IDD__YSIZE:
				return getYSIZE();
			case AfplibPackage.IDD__SDFS:
				return getSDFS();
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
			case AfplibPackage.IDD__UNITBASE:
				setUNITBASE((Integer)newValue);
				return;
			case AfplibPackage.IDD__XRESOL:
				setXRESOL((Integer)newValue);
				return;
			case AfplibPackage.IDD__YRESOL:
				setYRESOL((Integer)newValue);
				return;
			case AfplibPackage.IDD__XSIZE:
				setXSIZE((Integer)newValue);
				return;
			case AfplibPackage.IDD__YSIZE:
				setYSIZE((Integer)newValue);
				return;
			case AfplibPackage.IDD__SDFS:
				getSDFS().clear();
				getSDFS().addAll((Collection<? extends Triplet>)newValue);
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
			case AfplibPackage.IDD__UNITBASE:
				setUNITBASE(UNITBASE_EDEFAULT);
				return;
			case AfplibPackage.IDD__XRESOL:
				setXRESOL(XRESOL_EDEFAULT);
				return;
			case AfplibPackage.IDD__YRESOL:
				setYRESOL(YRESOL_EDEFAULT);
				return;
			case AfplibPackage.IDD__XSIZE:
				setXSIZE(XSIZE_EDEFAULT);
				return;
			case AfplibPackage.IDD__YSIZE:
				setYSIZE(YSIZE_EDEFAULT);
				return;
			case AfplibPackage.IDD__SDFS:
				getSDFS().clear();
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
			case AfplibPackage.IDD__UNITBASE:
				return UNITBASE_EDEFAULT == null ? unitbase != null : !UNITBASE_EDEFAULT.equals(unitbase);
			case AfplibPackage.IDD__XRESOL:
				return XRESOL_EDEFAULT == null ? xresol != null : !XRESOL_EDEFAULT.equals(xresol);
			case AfplibPackage.IDD__YRESOL:
				return YRESOL_EDEFAULT == null ? yresol != null : !YRESOL_EDEFAULT.equals(yresol);
			case AfplibPackage.IDD__XSIZE:
				return XSIZE_EDEFAULT == null ? xsize != null : !XSIZE_EDEFAULT.equals(xsize);
			case AfplibPackage.IDD__YSIZE:
				return YSIZE_EDEFAULT == null ? ysize != null : !YSIZE_EDEFAULT.equals(ysize);
			case AfplibPackage.IDD__SDFS:
				return sdfs != null && !sdfs.isEmpty();
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
		result.append(" (UNITBASE: ");
		result.append(unitbase);
		result.append(", XRESOL: ");
		result.append(xresol);
		result.append(", YRESOL: ");
		result.append(yresol);
		result.append(", XSIZE: ");
		result.append(xsize);
		result.append(", YSIZE: ");
		result.append(ysize);
		result.append(')');
		return result.toString();
	}

} //IDDImpl
