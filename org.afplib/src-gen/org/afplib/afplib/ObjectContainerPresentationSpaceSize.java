/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Object Container Presentation Space Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ObjectContainerPresentationSpaceSize#getPDFSize <em>PDF Size</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getObjectContainerPresentationSpaceSize()
 * @model
 * @generated
 */
public interface ObjectContainerPresentationSpaceSize extends Triplet {
	/**
	 * Returns the value of the '<em><b>PDF Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PDF Size</em>' attribute.
	 * @see #setPDFSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getObjectContainerPresentationSpaceSize_PDFSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getPDFSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ObjectContainerPresentationSpaceSize#getPDFSize <em>PDF Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PDF Size</em>' attribute.
	 * @see #getPDFSize()
	 * @generated
	 */
	void setPDFSize(Integer value);

} // ObjectContainerPresentationSpaceSize
