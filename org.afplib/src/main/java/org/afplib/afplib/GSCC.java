/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSCC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.GSCC#getCELLWI <em>CELLWI</em>}</li>
 *   <li>{@link org.afplib.afplib.GSCC#getCELLHI <em>CELLHI</em>}</li>
 *   <li>{@link org.afplib.afplib.GSCC#getCELLWFR <em>CELLWFR</em>}</li>
 *   <li>{@link org.afplib.afplib.GSCC#getCELLHFR <em>CELLHFR</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSCC()
 * @model
 * @generated
 */
public interface GSCC extends Triplet {
	/**
     * Returns the value of the '<em><b>CELLWI</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CELLWI</em>' attribute.
     * @see #setCELLWI(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSCC_CELLWI()
     * @model required="true"
     * @generated
     */
	Integer getCELLWI();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSCC#getCELLWI <em>CELLWI</em>}' attribute.
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
     * @see org.afplib.afplib.AfplibPackage#getGSCC_CELLHI()
     * @model required="true"
     * @generated
     */
	Integer getCELLHI();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSCC#getCELLHI <em>CELLHI</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CELLHI</em>' attribute.
     * @see #getCELLHI()
     * @generated
     */
	void setCELLHI(Integer value);

	/**
     * Returns the value of the '<em><b>CELLWFR</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CELLWFR</em>' attribute.
     * @see #setCELLWFR(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSCC_CELLWFR()
     * @model
     * @generated
     */
	Integer getCELLWFR();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSCC#getCELLWFR <em>CELLWFR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CELLWFR</em>' attribute.
     * @see #getCELLWFR()
     * @generated
     */
	void setCELLWFR(Integer value);

	/**
     * Returns the value of the '<em><b>CELLHFR</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CELLHFR</em>' attribute.
     * @see #setCELLHFR(Integer)
     * @see org.afplib.afplib.AfplibPackage#getGSCC_CELLHFR()
     * @model
     * @generated
     */
	Integer getCELLHFR();

	/**
     * Sets the value of the '{@link org.afplib.afplib.GSCC#getCELLHFR <em>CELLHFR</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CELLHFR</em>' attribute.
     * @see #getCELLHFR()
     * @generated
     */
	void setCELLHFR(Integer value);

} // GSCC
