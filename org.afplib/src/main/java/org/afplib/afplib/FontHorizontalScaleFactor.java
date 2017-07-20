/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Font Horizontal Scale Factor</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.FontHorizontalScaleFactor#getHscale <em>Hscale</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getFontHorizontalScaleFactor()
 * @model
 * @generated
 */
public interface FontHorizontalScaleFactor extends Triplet {
	/**
     * Returns the value of the '<em><b>Hscale</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Hscale</em>' attribute.
     * @see #setHscale(Integer)
     * @see org.afplib.afplib.AfplibPackage#getFontHorizontalScaleFactor_Hscale()
     * @model required="true"
     * @generated
     */
	Integer getHscale();

	/**
     * Sets the value of the '{@link org.afplib.afplib.FontHorizontalScaleFactor#getHscale <em>Hscale</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Hscale</em>' attribute.
     * @see #getHscale()
     * @generated
     */
	void setHscale(Integer value);

} // FontHorizontalScaleFactor
