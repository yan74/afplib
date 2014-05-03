/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Section Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ResourceSectionNumber#getResSNum <em>Res SNum</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getResourceSectionNumber()
 * @model
 * @generated
 */
public interface ResourceSectionNumber extends Triplet {
	/**
	 * Returns the value of the '<em><b>Res SNum</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Res SNum</em>' attribute.
	 * @see #setResSNum(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getResourceSectionNumber_ResSNum()
	 * @model required="true"
	 * @generated
	 */
	Integer getResSNum();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ResourceSectionNumber#getResSNum <em>Res SNum</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Res SNum</em>' attribute.
	 * @see #getResSNum()
	 * @generated
	 */
	void setResSNum(Integer value);

} // ResourceSectionNumber
