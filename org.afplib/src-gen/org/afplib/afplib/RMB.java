/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RMB</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Relative Move Baseline</b><br>The Relative Move Baseline control sequence moves the baseline coordinate relative to the current baseline coordinate position.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.RMB#getINCRMENT <em>INCRMENT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getRMB()
 * @model
 * @generated
 */
public interface RMB extends Triplet {
	/**
	 * Returns the value of the '<em><b>INCRMENT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>INCRMENT</em>' attribute.
	 * @see #setINCRMENT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRMB_INCRMENT()
	 * @model required="true"
	 * @generated
	 */
	Integer getINCRMENT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RMB#getINCRMENT <em>INCRMENT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>INCRMENT</em>' attribute.
	 * @see #getINCRMENT()
	 * @generated
	 */
	void setINCRMENT(Integer value);

} // RMB
