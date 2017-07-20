/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Descriptor Position</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.DescriptorPosition#getDesPosID <em>Des Pos ID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getDescriptorPosition()
 * @model
 * @generated
 */
public interface DescriptorPosition extends Triplet {
	/**
     * Returns the value of the '<em><b>Des Pos ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Des Pos ID</em>' attribute.
     * @see #setDesPosID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getDescriptorPosition_DesPosID()
     * @model required="true"
     * @generated
     */
	Integer getDesPosID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.DescriptorPosition#getDesPosID <em>Des Pos ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Des Pos ID</em>' attribute.
     * @see #getDesPosID()
     * @generated
     */
	void setDesPosID(Integer value);

} // DescriptorPosition
