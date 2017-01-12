/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>TRN</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.TRN#getTRNDATA <em>TRNDATA</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getTRN()
 * @model
 * @generated
 */
public interface TRN extends Triplet {
	/**
	 * Returns the value of the '<em><b>TRNDATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TRNDATA</em>' attribute.
	 * @see #setTRNDATA(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getTRN_TRNDATA()
	 * @model required="true"
	 * @generated
	 */
	byte[] getTRNDATA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TRN#getTRNDATA <em>TRNDATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TRNDATA</em>' attribute.
	 * @see #getTRNDATA()
	 * @generated
	 */
	void setTRNDATA(byte[] value);

} // TRN
