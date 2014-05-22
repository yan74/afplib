/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.FontDescriptorSpecification;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Font Descriptor Specification</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtWtClass <em>Ft Wt Class</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtWdClass <em>Ft Wd Class</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtHeight <em>Ft Height</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtWidth <em>Ft Width</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtDsFlags <em>Ft Ds Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.impl.FontDescriptorSpecificationImpl#getFtUsFlags <em>Ft Us Flags</em>}</li>
 * </ul>
 * </p>
 *
 * @generated
 */
public class FontDescriptorSpecificationImpl extends TripletImpl implements FontDescriptorSpecification {
	/**
	 * The default value of the '{@link #getFtWtClass() <em>Ft Wt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWtClass()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_WT_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtWtClass() <em>Ft Wt Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWtClass()
	 * @generated
	 * @ordered
	 */
	protected Integer ftWtClass = FT_WT_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtWdClass() <em>Ft Wd Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWdClass()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_WD_CLASS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtWdClass() <em>Ft Wd Class</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWdClass()
	 * @generated
	 * @ordered
	 */
	protected Integer ftWdClass = FT_WD_CLASS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtHeight() <em>Ft Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtHeight()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_HEIGHT_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtHeight() <em>Ft Height</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtHeight()
	 * @generated
	 * @ordered
	 */
	protected Integer ftHeight = FT_HEIGHT_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtWidth() <em>Ft Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWidth()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_WIDTH_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtWidth() <em>Ft Width</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtWidth()
	 * @generated
	 * @ordered
	 */
	protected Integer ftWidth = FT_WIDTH_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtDsFlags() <em>Ft Ds Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtDsFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_DS_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtDsFlags() <em>Ft Ds Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtDsFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer ftDsFlags = FT_DS_FLAGS_EDEFAULT;

	/**
	 * The default value of the '{@link #getFtUsFlags() <em>Ft Us Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtUsFlags()
	 * @generated
	 * @ordered
	 */
	protected static final Integer FT_US_FLAGS_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getFtUsFlags() <em>Ft Us Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getFtUsFlags()
	 * @generated
	 * @ordered
	 */
	protected Integer ftUsFlags = FT_US_FLAGS_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected FontDescriptorSpecificationImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getFontDescriptorSpecification();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtWtClass() {
		return ftWtClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtWtClass(Integer newFtWtClass) {
		Integer oldFtWtClass = ftWtClass;
		ftWtClass = newFtWtClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WT_CLASS, oldFtWtClass, ftWtClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtWdClass() {
		return ftWdClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtWdClass(Integer newFtWdClass) {
		Integer oldFtWdClass = ftWdClass;
		ftWdClass = newFtWdClass;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WD_CLASS, oldFtWdClass, ftWdClass));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtHeight() {
		return ftHeight;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtHeight(Integer newFtHeight) {
		Integer oldFtHeight = ftHeight;
		ftHeight = newFtHeight;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_HEIGHT, oldFtHeight, ftHeight));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtWidth() {
		return ftWidth;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtWidth(Integer newFtWidth) {
		Integer oldFtWidth = ftWidth;
		ftWidth = newFtWidth;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WIDTH, oldFtWidth, ftWidth));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtDsFlags() {
		return ftDsFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtDsFlags(Integer newFtDsFlags) {
		Integer oldFtDsFlags = ftDsFlags;
		ftDsFlags = newFtDsFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_DS_FLAGS, oldFtDsFlags, ftDsFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getFtUsFlags() {
		return ftUsFlags;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setFtUsFlags(Integer newFtUsFlags) {
		Integer oldFtUsFlags = ftUsFlags;
		ftUsFlags = newFtUsFlags;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_US_FLAGS, oldFtUsFlags, ftUsFlags));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WT_CLASS:
				return getFtWtClass();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WD_CLASS:
				return getFtWdClass();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_HEIGHT:
				return getFtHeight();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WIDTH:
				return getFtWidth();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_DS_FLAGS:
				return getFtDsFlags();
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_US_FLAGS:
				return getFtUsFlags();
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
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WT_CLASS:
				setFtWtClass((Integer)newValue);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WD_CLASS:
				setFtWdClass((Integer)newValue);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_HEIGHT:
				setFtHeight((Integer)newValue);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WIDTH:
				setFtWidth((Integer)newValue);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_DS_FLAGS:
				setFtDsFlags((Integer)newValue);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_US_FLAGS:
				setFtUsFlags((Integer)newValue);
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
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WT_CLASS:
				setFtWtClass(FT_WT_CLASS_EDEFAULT);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WD_CLASS:
				setFtWdClass(FT_WD_CLASS_EDEFAULT);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_HEIGHT:
				setFtHeight(FT_HEIGHT_EDEFAULT);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WIDTH:
				setFtWidth(FT_WIDTH_EDEFAULT);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_DS_FLAGS:
				setFtDsFlags(FT_DS_FLAGS_EDEFAULT);
				return;
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_US_FLAGS:
				setFtUsFlags(FT_US_FLAGS_EDEFAULT);
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
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WT_CLASS:
				return FT_WT_CLASS_EDEFAULT == null ? ftWtClass != null : !FT_WT_CLASS_EDEFAULT.equals(ftWtClass);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WD_CLASS:
				return FT_WD_CLASS_EDEFAULT == null ? ftWdClass != null : !FT_WD_CLASS_EDEFAULT.equals(ftWdClass);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_HEIGHT:
				return FT_HEIGHT_EDEFAULT == null ? ftHeight != null : !FT_HEIGHT_EDEFAULT.equals(ftHeight);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_WIDTH:
				return FT_WIDTH_EDEFAULT == null ? ftWidth != null : !FT_WIDTH_EDEFAULT.equals(ftWidth);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_DS_FLAGS:
				return FT_DS_FLAGS_EDEFAULT == null ? ftDsFlags != null : !FT_DS_FLAGS_EDEFAULT.equals(ftDsFlags);
			case AfplibPackage.FONT_DESCRIPTOR_SPECIFICATION__FT_US_FLAGS:
				return FT_US_FLAGS_EDEFAULT == null ? ftUsFlags != null : !FT_US_FLAGS_EDEFAULT.equals(ftUsFlags);
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
		result.append(" (FtWtClass: ");
		result.append(ftWtClass);
		result.append(", FtWdClass: ");
		result.append(ftWdClass);
		result.append(", FtHeight: ");
		result.append(ftHeight);
		result.append(", FtWidth: ");
		result.append(ftWidth);
		result.append(", FtDsFlags: ");
		result.append(ftDsFlags);
		result.append(", FtUsFlags: ");
		result.append(ftUsFlags);
		result.append(')');
		return result.toString();
	}

} //FontDescriptorSpecificationImpl
