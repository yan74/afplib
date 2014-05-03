/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GSPT</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GSPT#getPATT <em>PATT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGSPT()
 * @model
 * @generated
 */
public interface GSPT extends Triplet {
	/**
	 * Returns the value of the '<em><b>PATT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PATT</em>' attribute.
	 * @see #setPATT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getGSPT_PATT()
	 * @model required="true"
	 * @generated
	 */
	Integer getPATT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GSPT#getPATT <em>PATT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PATT</em>' attribute.
	 * @see #getPATT()
	 * @generated
	 */
	void setPATT(Integer value);

} // GSPT
