/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medium Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MediumOrientation#getMedOrient <em>Med Orient</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMediumOrientation()
 * @model
 * @generated
 */
public interface MediumOrientation extends Triplet {
	/**
	 * Returns the value of the '<em><b>Med Orient</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Med Orient</em>' attribute.
	 * @see #setMedOrient(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMediumOrientation_MedOrient()
	 * @model required="true"
	 * @generated
	 */
	Integer getMedOrient();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediumOrientation#getMedOrient <em>Med Orient</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med Orient</em>' attribute.
	 * @see #getMedOrient()
	 * @generated
	 */
	void setMedOrient(Integer value);

} // MediumOrientation
