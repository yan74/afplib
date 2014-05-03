/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCOL</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Color</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCOL#getCOL <em>COL</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCOL()
 * @model
 * @generated
 */
public interface GSCOL extends Triplet {
	/**
	 * Returns the value of the '<em><b>COL</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>COL</em>' attribute.
	 * @see #setCOL(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSCOL_COL()
	 * @model required="true"
	 * @generated
	 */
	Integer getCOL();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSCOL#getCOL <em>COL</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>COL</em>' attribute.
	 * @see #getCOL()
	 * @generated
	 */
	void setCOL(Integer value);

} // GSCOL
