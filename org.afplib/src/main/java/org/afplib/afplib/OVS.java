/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>OVS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.OVS#getBYPSIDEN <em>BYPSIDEN</em>}</li>
 *   <li>{@link org.afplib.afplib.OVS#getOVERCHAR <em>OVERCHAR</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getOVS()
 * @model
 * @generated
 */
public interface OVS extends Triplet {
	/**
	 * Returns the value of the '<em><b>BYPSIDEN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BYPSIDEN</em>' attribute.
	 * @see #setBYPSIDEN(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOVS_BYPSIDEN()
	 * @model required="true"
	 * @generated
	 */
	Integer getBYPSIDEN();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OVS#getBYPSIDEN <em>BYPSIDEN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BYPSIDEN</em>' attribute.
	 * @see #getBYPSIDEN()
	 * @generated
	 */
	void setBYPSIDEN(Integer value);

	/**
	 * Returns the value of the '<em><b>OVERCHAR</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OVERCHAR</em>' attribute.
	 * @see #setOVERCHAR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getOVS_OVERCHAR()
	 * @model required="true"
	 * @generated
	 */
	Integer getOVERCHAR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.OVS#getOVERCHAR <em>OVERCHAR</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OVERCHAR</em>' attribute.
	 * @see #getOVERCHAR()
	 * @generated
	 */
	void setOVERCHAR(Integer value);

} // OVS
