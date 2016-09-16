/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSMC#getCELLWI <em>CELLWI</em>}</li>
 *   <li>{@link org.afplib.afplib.GSMC#getCELLHI <em>CELLHI</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSMC()
 * @model
 * @generated
 */
public interface GSMC extends Triplet {
	/**
	 * Returns the value of the '<em><b>CELLWI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CELLWI</em>' attribute.
	 * @see #setCELLWI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSMC_CELLWI()
	 * @model required="true"
	 * @generated
	 */
	Integer getCELLWI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSMC#getCELLWI <em>CELLWI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CELLWI</em>' attribute.
	 * @see #getCELLWI()
	 * @generated
	 */
	void setCELLWI(Integer value);

	/**
	 * Returns the value of the '<em><b>CELLHI</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CELLHI</em>' attribute.
	 * @see #setCELLHI(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSMC_CELLHI()
	 * @model required="true"
	 * @generated
	 */
	Integer getCELLHI();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSMC#getCELLHI <em>CELLHI</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CELLHI</em>' attribute.
	 * @see #getCELLHI()
	 * @generated
	 */
	void setCELLHI(Integer value);

} // GSMC
