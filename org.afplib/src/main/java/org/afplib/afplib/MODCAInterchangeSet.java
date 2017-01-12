/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MODCA Interchange Set</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.MODCAInterchangeSet#getIStype <em>IStype</em>}</li>
 *   <li>{@link org.afplib.afplib.MODCAInterchangeSet#getISid <em>ISid</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getMODCAInterchangeSet()
 * @model
 * @generated
 */
public interface MODCAInterchangeSet extends Triplet {
	/**
	 * Returns the value of the '<em><b>IStype</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IStype</em>' attribute.
	 * @see #setIStype(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMODCAInterchangeSet_IStype()
	 * @model required="true"
	 * @generated
	 */
	Integer getIStype();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MODCAInterchangeSet#getIStype <em>IStype</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IStype</em>' attribute.
	 * @see #getIStype()
	 * @generated
	 */
	void setIStype(Integer value);

	/**
	 * Returns the value of the '<em><b>ISid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>ISid</em>' attribute.
	 * @see #setISid(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMODCAInterchangeSet_ISid()
	 * @model required="true"
	 * @generated
	 */
	Integer getISid();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MODCAInterchangeSet#getISid <em>ISid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>ISid</em>' attribute.
	 * @see #getISid()
	 * @generated
	 */
	void setISid(Integer value);

} // MODCAInterchangeSet
