/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCH</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCH#getHX <em>HX</em>}</li>
 *   <li>{@link org.afplib.afplib.GSCH#getHY <em>HY</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCH()
 * @model
 * @generated
 */
public interface GSCH extends Triplet {
	/**
	 * Returns the value of the '<em><b>HX</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HX</em>' attribute.
	 * @see #setHX(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSCH_HX()
	 * @model required="true"
	 * @generated
	 */
	Integer getHX();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSCH#getHX <em>HX</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HX</em>' attribute.
	 * @see #getHX()
	 * @generated
	 */
	void setHX(Integer value);

	/**
	 * Returns the value of the '<em><b>HY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HY</em>' attribute.
	 * @see #setHY(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSCH_HY()
	 * @model required="true"
	 * @generated
	 */
	Integer getHY();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSCH#getHY <em>HY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HY</em>' attribute.
	 * @see #getHY()
	 * @generated
	 */
	void setHY(Integer value);

} // GSCH
