/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GBAR</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Area</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GBAR#getFLAGS <em>FLAGS</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGBAR()
 * @model
 * @generated
 */
public interface GBAR extends Triplet {
	/**
	 * Returns the value of the '<em><b>FLAGS</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FLAGS</em>' attribute.
	 * @see #setFLAGS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGBAR_FLAGS()
	 * @model required="true"
	 * @generated
	 */
	Integer getFLAGS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GBAR#getFLAGS <em>FLAGS</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FLAGS</em>' attribute.
	 * @see #getFLAGS()
	 * @generated
	 */
	void setFLAGS(Integer value);

} // GBAR
