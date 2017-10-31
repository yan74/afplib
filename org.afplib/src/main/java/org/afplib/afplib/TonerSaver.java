/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Toner Saver</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.TonerSaver#getTSvCtrl <em>TSv Ctrl</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getTonerSaver()
 * @model
 * @generated
 */
public interface TonerSaver extends Triplet {
	/**
	 * Returns the value of the '<em><b>TSv Ctrl</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TSv Ctrl</em>' attribute.
	 * @see #setTSvCtrl(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTonerSaver_TSvCtrl()
	 * @model required="true"
	 * @generated
	 */
	Integer getTSvCtrl();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TonerSaver#getTSvCtrl <em>TSv Ctrl</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TSv Ctrl</em>' attribute.
	 * @see #getTSvCtrl()
	 * @generated
	 */
	void setTSvCtrl(Integer value);

} // TonerSaver
