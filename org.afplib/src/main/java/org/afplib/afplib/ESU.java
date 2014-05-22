/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>ESU</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ESU#getLID <em>LID</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getESU()
 * @model
 * @generated
 */
public interface ESU extends Triplet {
	/**
	 * Returns the value of the '<em><b>LID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>LID</em>' attribute.
	 * @see #setLID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getESU_LID()
	 * @model required="true"
	 * @generated
	 */
	Integer getLID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ESU#getLID <em>LID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>LID</em>' attribute.
	 * @see #getLID()
	 * @generated
	 */
	void setLID(Integer value);

} // ESU
