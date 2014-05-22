/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSLJ</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSLJ#getLINEJOIN <em>LINEJOIN</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSLJ()
 * @model
 * @generated
 */
public interface GSLJ extends Triplet {
	/**
	 * Returns the value of the '<em><b>LINEJOIN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LINEJOIN</em>' attribute.
	 * @see #setLINEJOIN(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSLJ_LINEJOIN()
	 * @model required="true"
	 * @generated
	 */
	Integer getLINEJOIN();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSLJ#getLINEJOIN <em>LINEJOIN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LINEJOIN</em>' attribute.
	 * @see #getLINEJOIN()
	 * @generated
	 */
	void setLINEJOIN(Integer value);

} // GSLJ
