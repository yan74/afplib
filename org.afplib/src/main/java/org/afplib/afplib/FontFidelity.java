/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FontFidelity#getStpFntEx <em>Stp Fnt Ex</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFontFidelity()
 * @model
 * @generated
 */
public interface FontFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp Fnt Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp Fnt Ex</em>' attribute.
	 * @see #setStpFntEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFontFidelity_StpFntEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpFntEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FontFidelity#getStpFntEx <em>Stp Fnt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp Fnt Ex</em>' attribute.
	 * @see #getStpFntEx()
	 * @generated
	 */
	void setStpFntEx(Integer value);

} // FontFidelity
