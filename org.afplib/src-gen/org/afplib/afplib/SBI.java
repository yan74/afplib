/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>SBI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Set Baseline Increment</b><br>The Set Baseline Increment control sequence specifies the increment to be added to the current baseline coordinate when a Begin Line control sequence is executed. This is a modal control sequence.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SBI#getINCRMENT <em>INCRMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSBI()
 * @model
 * @generated
 */
public interface SBI extends Triplet {
	/**
	 * Returns the value of the '<em><b>INCRMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>INCRMENT</em>' attribute.
	 * @see #setINCRMENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSBI_INCRMENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getINCRMENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SBI#getINCRMENT <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INCRMENT</em>' attribute.
	 * @see #getINCRMENT()
	 * @generated
	 */
	void setINCRMENT(Integer value);

} // SBI
