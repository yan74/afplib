/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSECOL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSECOL#getCOLOR <em>COLOR</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSECOL()
 * @model
 * @generated
 */
public interface GSECOL extends Triplet {
	/**
	 * Returns the value of the '<em><b>COLOR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COLOR</em>' attribute.
	 * @see #setCOLOR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSECOL_COLOR()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOLOR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSECOL#getCOLOR <em>COLOR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COLOR</em>' attribute.
	 * @see #getCOLOR()
	 * @generated
	 */
	void setCOLOR(Integer value);

} // GSECOL
