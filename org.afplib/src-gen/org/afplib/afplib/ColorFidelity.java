/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Color Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ColorFidelity#getStpCoEx <em>Stp Co Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorFidelity#getRepCoEx <em>Rep Co Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.ColorFidelity#getColSub <em>Col Sub</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getColorFidelity()
 * @model
 * @generated
 */
public interface ColorFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp Co Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp Co Ex</em>' attribute.
	 * @see #setStpCoEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorFidelity_StpCoEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpCoEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorFidelity#getStpCoEx <em>Stp Co Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp Co Ex</em>' attribute.
	 * @see #getStpCoEx()
	 * @generated
	 */
	void setStpCoEx(Integer value);

	/**
	 * Returns the value of the '<em><b>Rep Co Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep Co Ex</em>' attribute.
	 * @see #setRepCoEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorFidelity_RepCoEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getRepCoEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorFidelity#getRepCoEx <em>Rep Co Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Co Ex</em>' attribute.
	 * @see #getRepCoEx()
	 * @generated
	 */
	void setRepCoEx(Integer value);

	/**
	 * Returns the value of the '<em><b>Col Sub</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Col Sub</em>' attribute.
	 * @see #setColSub(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getColorFidelity_ColSub()
	 * @model required="true"
	 * @generated
	 */
	Integer getColSub();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ColorFidelity#getColSub <em>Col Sub</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Col Sub</em>' attribute.
	 * @see #getColSub()
	 * @generated
	 */
	void setColSub(Integer value);

} // ColorFidelity
