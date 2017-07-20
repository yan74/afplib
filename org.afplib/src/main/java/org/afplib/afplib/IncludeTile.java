/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Include Tile</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IncludeTile#getTIRID <em>TIRID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIncludeTile()
 * @model
 * @generated
 */
public interface IncludeTile extends Triplet {
	/**
     * Returns the value of the '<em><b>TIRID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>TIRID</em>' attribute.
     * @see #setTIRID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIncludeTile_TIRID()
     * @model required="true"
     * @generated
     */
	Integer getTIRID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IncludeTile#getTIRID <em>TIRID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>TIRID</em>' attribute.
     * @see #getTIRID()
     * @generated
     */
	void setTIRID(Integer value);

} // IncludeTile
