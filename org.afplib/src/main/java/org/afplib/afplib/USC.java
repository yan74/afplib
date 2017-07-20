/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>USC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.USC#getBYPSIDEN <em>BYPSIDEN</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getUSC()
 * @model
 * @generated
 */
public interface USC extends Triplet {
	/**
     * Returns the value of the '<em><b>BYPSIDEN</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>BYPSIDEN</em>' attribute.
     * @see #setBYPSIDEN(Integer)
     * @see org.afplib.afplib.AfplibPackage#getUSC_BYPSIDEN()
     * @model required="true"
     * @generated
     */
	Integer getBYPSIDEN();

	/**
     * Sets the value of the '{@link org.afplib.afplib.USC#getBYPSIDEN <em>BYPSIDEN</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>BYPSIDEN</em>' attribute.
     * @see #getBYPSIDEN()
     * @generated
     */
	void setBYPSIDEN(Integer value);

} // USC
