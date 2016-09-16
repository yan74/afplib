/**
 */
package org.afplib.afplib.impl;

import org.afplib.afplib.AfplibPackage;
import org.afplib.afplib.ObjectContainerPresentationSpaceSize;

import org.afplib.base.impl.TripletImpl;

import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EClass;

import org.eclipse.emf.ecore.impl.ENotificationImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model object '<em><b>Object Container Presentation Space Size</b></em>'.
 * <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.impl.ObjectContainerPresentationSpaceSizeImpl#getPDFSize <em>PDF Size</em>}</li>
 * </ul>
 *
 * @generated
 */
public class ObjectContainerPresentationSpaceSizeImpl extends TripletImpl implements ObjectContainerPresentationSpaceSize {
	/**
	 * The default value of the '{@link #getPDFSize() <em>PDF Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDFSize()
	 * @generated
	 * @ordered
	 */
	protected static final Integer PDF_SIZE_EDEFAULT = null;

	/**
	 * The cached value of the '{@link #getPDFSize() <em>PDF Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPDFSize()
	 * @generated
	 * @ordered
	 */
	protected Integer pdfSize = PDF_SIZE_EDEFAULT;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected ObjectContainerPresentationSpaceSizeImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return AfplibPackage.eINSTANCE.getObjectContainerPresentationSpaceSize();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public Integer getPDFSize() {
		return pdfSize;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void setPDFSize(Integer newPDFSize) {
		Integer oldPDFSize = pdfSize;
		pdfSize = newPDFSize;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE__PDF_SIZE, oldPDFSize, pdfSize));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE__PDF_SIZE:
				return getPDFSize();
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
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE__PDF_SIZE:
				setPDFSize((Integer)newValue);
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
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE__PDF_SIZE:
				setPDFSize(PDF_SIZE_EDEFAULT);
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
			case AfplibPackage.OBJECT_CONTAINER_PRESENTATION_SPACE_SIZE__PDF_SIZE:
				return PDF_SIZE_EDEFAULT == null ? pdfSize != null : !PDF_SIZE_EDEFAULT.equals(pdfSize);
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
		result.append(" (PDFSize: ");
		result.append(pdfSize);
		result.append(')');
		return result.toString();
	}

} //ObjectContainerPresentationSpaceSizeImpl
