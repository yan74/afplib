/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Orientation</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.TextOrientation#getIAxis <em>IAxis</em>}</li>
 *   <li>{@link org.afplib.afplib.TextOrientation#getBAxis <em>BAxis</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getTextOrientation()
 * @model
 * @generated
 */
public interface TextOrientation extends Triplet {
	/**
	 * Returns the value of the '<em><b>IAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IAxis</em>' attribute.
	 * @see #setIAxis(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTextOrientation_IAxis()
	 * @model required="true"
	 * @generated
	 */
	Integer getIAxis();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TextOrientation#getIAxis <em>IAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IAxis</em>' attribute.
	 * @see #getIAxis()
	 * @generated
	 */
	void setIAxis(Integer value);

	/**
	 * Returns the value of the '<em><b>BAxis</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BAxis</em>' attribute.
	 * @see #setBAxis(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTextOrientation_BAxis()
	 * @model required="true"
	 * @generated
	 */
	Integer getBAxis();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TextOrientation#getBAxis <em>BAxis</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BAxis</em>' attribute.
	 * @see #getBAxis()
	 * @generated
	 */
	void setBAxis(Integer value);

} // TextOrientation
