/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Mapping Option</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MappingOption#getMapValue <em>Map Value</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMappingOption()
 * @model
 * @generated
 */
public interface MappingOption extends Triplet {
	/**
	 * Returns the value of the '<em><b>Map Value</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Map Value</em>' attribute.
	 * @see #setMapValue(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMappingOption_MapValue()
	 * @model required="true"
	 * @generated
	 */
	Integer getMapValue();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MappingOption#getMapValue <em>Map Value</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Map Value</em>' attribute.
	 * @see #getMapValue()
	 * @generated
	 */
	void setMapValue(Integer value);

} // MappingOption
