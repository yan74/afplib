/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Usage Attribute</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ResourceUsageAttribute#getFrequency <em>Frequency</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getResourceUsageAttribute()
 * @model
 * @generated
 */
public interface ResourceUsageAttribute extends Triplet {
	/**
     * Returns the value of the '<em><b>Frequency</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Frequency</em>' attribute.
     * @see #setFrequency(Integer)
     * @see org.afplib.afplib.AfplibPackage#getResourceUsageAttribute_Frequency()
     * @model required="true"
     * @generated
     */
	Integer getFrequency();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ResourceUsageAttribute#getFrequency <em>Frequency</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Frequency</em>' attribute.
     * @see #getFrequency()
     * @generated
     */
	void setFrequency(Integer value);

} // ResourceUsageAttribute
