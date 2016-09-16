/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.RenderingIntent;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Rendering Intent</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getIOCARI <em>IOCARI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getOCRI <em>OCRI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getPTOCRI <em>PTOCRI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getGOCARI <em>GOCARI</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.RenderingIntentImpl#getReserved2 <em>Reserved2</em>}</li>
 * </ul>
 *
 * @generated
 */
public class RenderingIntentImpl extends TripletImpl implements RenderingIntent {
	/**
	 * The default value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved() <em>Reserved</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved = RESERVED_EDEFAULT;

	/**
	 * The default value of the '{@link #getIOCARI() <em>IOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOCARI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer IOCARI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getIOCARI() <em>IOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getIOCARI()
	 * @generated
	 * @ordered
	 */
	protected Integer iocari = IOCARI_EDEFAULT;

	/**
	 * The default value of the '{@link #getOCRI() <em>OCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCRI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer OCRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getOCRI() <em>OCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getOCRI()
	 * @generated
	 * @ordered
	 */
	protected Integer ocri = OCRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getPTOCRI() <em>PTOCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTOCRI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PTOCRI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPTOCRI() <em>PTOCRI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPTOCRI()
	 * @generated
	 * @ordered
	 */
	protected Integer ptocri = PTOCRI_EDEFAULT;

	/**
	 * The default value of the '{@link #getGOCARI() <em>GOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOCARI()
	 * @generated
	 * @ordered
	 */
	protected static final Integer GOCARI_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getGOCARI() <em>GOCARI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getGOCARI()
	 * @generated
	 * @ordered
	 */
	protected Integer gocari = GOCARI_EDEFAULT;

	/**
	 * The default value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected static final Integer RESERVED2_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getReserved2() <em>Reserved2</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getReserved2()
	 * @generated
	 * @ordered
	 */
	protected Integer reserved2 = RESERVED2_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected RenderingIntentImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.Literals.RENDERING_INTENT;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved() {
		return reserved;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved(Integer newReserved) {
		Integer oldReserved = reserved;
		reserved = newReserved;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__RESERVED, oldReserved, reserved));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getIOCARI() {
		return iocari;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setIOCARI(Integer newIOCARI) {
		Integer oldIOCARI = iocari;
		iocari = newIOCARI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__IOCARI, oldIOCARI, iocari));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getOCRI() {
		return ocri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setOCRI(Integer newOCRI) {
		Integer oldOCRI = ocri;
		ocri = newOCRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__OCRI, oldOCRI, ocri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPTOCRI() {
		return ptocri;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPTOCRI(Integer newPTOCRI) {
		Integer oldPTOCRI = ptocri;
		ptocri = newPTOCRI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__PTOCRI, oldPTOCRI, ptocri));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getGOCARI() {
		return gocari;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setGOCARI(Integer newGOCARI) {
		Integer oldGOCARI = gocari;
		gocari = newGOCARI;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__GOCARI, oldGOCARI, gocari));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getReserved2() {
		return reserved2;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setReserved2(Integer newReserved2) {
		Integer oldReserved2 = reserved2;
		reserved2 = newReserved2;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.RENDERING_INTENT__RESERVED2, oldReserved2, reserved2));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.RENDERING_INTENT__RESERVED:
				return getReserved();
			case AfplibPackage.RENDERING_INTENT__IOCARI:
				return getIOCARI();
			case AfplibPackage.RENDERING_INTENT__OCRI:
				return getOCRI();
			case AfplibPackage.RENDERING_INTENT__PTOCRI:
				return getPTOCRI();
			case AfplibPackage.RENDERING_INTENT__GOCARI:
				return getGOCARI();
			case AfplibPackage.RENDERING_INTENT__RESERVED2:
				return getReserved2();
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
			case AfplibPackage.RENDERING_INTENT__RESERVED:
				setReserved((Integer)newValue);
				return;
			case AfplibPackage.RENDERING_INTENT__IOCARI:
				setIOCARI((Integer)newValue);
				return;
			case AfplibPackage.RENDERING_INTENT__OCRI:
				setOCRI((Integer)newValue);
				return;
			case AfplibPackage.RENDERING_INTENT__PTOCRI:
				setPTOCRI((Integer)newValue);
				return;
			case AfplibPackage.RENDERING_INTENT__GOCARI:
				setGOCARI((Integer)newValue);
				return;
			case AfplibPackage.RENDERING_INTENT__RESERVED2:
				setReserved2((Integer)newValue);
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
			case AfplibPackage.RENDERING_INTENT__RESERVED:
				setReserved(RESERVED_EDEFAULT);
				return;
			case AfplibPackage.RENDERING_INTENT__IOCARI:
				setIOCARI(IOCARI_EDEFAULT);
				return;
			case AfplibPackage.RENDERING_INTENT__OCRI:
				setOCRI(OCRI_EDEFAULT);
				return;
			case AfplibPackage.RENDERING_INTENT__PTOCRI:
				setPTOCRI(PTOCRI_EDEFAULT);
				return;
			case AfplibPackage.RENDERING_INTENT__GOCARI:
				setGOCARI(GOCARI_EDEFAULT);
				return;
			case AfplibPackage.RENDERING_INTENT__RESERVED2:
				setReserved2(RESERVED2_EDEFAULT);
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
			case AfplibPackage.RENDERING_INTENT__RESERVED:
				return RESERVED_EDEFAULT == null ? reserved != null : !RESERVED_EDEFAULT.equals(reserved);
			case AfplibPackage.RENDERING_INTENT__IOCARI:
				return IOCARI_EDEFAULT == null ? iocari != null : !IOCARI_EDEFAULT.equals(iocari);
			case AfplibPackage.RENDERING_INTENT__OCRI:
				return OCRI_EDEFAULT == null ? ocri != null : !OCRI_EDEFAULT.equals(ocri);
			case AfplibPackage.RENDERING_INTENT__PTOCRI:
				return PTOCRI_EDEFAULT == null ? ptocri != null : !PTOCRI_EDEFAULT.equals(ptocri);
			case AfplibPackage.RENDERING_INTENT__GOCARI:
				return GOCARI_EDEFAULT == null ? gocari != null : !GOCARI_EDEFAULT.equals(gocari);
			case AfplibPackage.RENDERING_INTENT__RESERVED2:
				return RESERVED2_EDEFAULT == null ? reserved2 != null : !RESERVED2_EDEFAULT.equals(reserved2);
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
		result.append(" (Reserved: ");
		result.append(reserved);
		result.append(", IOCARI: ");
		result.append(iocari);
		result.append(", OCRI: ");
		result.append(ocri);
		result.append(", PTOCRI: ");
		result.append(ptocri);
		result.append(", GOCARI: ");
		result.append(gocari);
		result.append(", Reserved2: ");
		result.append(reserved2);
		result.append(')');
		return result.toString();
	}

} //RenderingIntentImpl
