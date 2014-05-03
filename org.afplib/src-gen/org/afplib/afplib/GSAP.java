/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSAP</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Arc Parameters</b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSAP#getP <em>P</em>}</li>
 *   <li>{@link org.afplib.afplib.GSAP#getQ <em>Q</em>}</li>
 *   <li>{@link org.afplib.afplib.GSAP#getR <em>R</em>}</li>
 *   <li>{@link org.afplib.afplib.GSAP#getS <em>S</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSAP()
 * @model
 * @generated
 */
public interface GSAP extends Triplet {
	/**
	 * Returns the value of the '<em><b>P</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>P</em>' attribute.
	 * @see #setP(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSAP_P()
	 * @model required="true"
	 * @generated
	 */
	Integer getP();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSAP#getP <em>P</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>P</em>' attribute.
	 * @see #getP()
	 * @generated
	 */
	void setP(Integer value);

	/**
	 * Returns the value of the '<em><b>Q</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Q</em>' attribute.
	 * @see #setQ(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSAP_Q()
	 * @model required="true"
	 * @generated
	 */
	Integer getQ();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSAP#getQ <em>Q</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Q</em>' attribute.
	 * @see #getQ()
	 * @generated
	 */
	void setQ(Integer value);

	/**
	 * Returns the value of the '<em><b>R</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>R</em>' attribute.
	 * @see #setR(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSAP_R()
	 * @model required="true"
	 * @generated
	 */
	Integer getR();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSAP#getR <em>R</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>R</em>' attribute.
	 * @see #getR()
	 * @generated
	 */
	void setR(Integer value);

	/**
	 * Returns the value of the '<em><b>S</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>S</em>' attribute.
	 * @see #setS(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSAP_S()
	 * @model required="true"
	 * @generated
	 */
	Integer getS();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSAP#getS <em>S</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>S</em>' attribute.
	 * @see #getS()
	 * @generated
	 */
	void setS(Integer value);

} // GSAP
