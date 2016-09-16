/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Text Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.TextFidelity#getStpTxtEx <em>Stp Txt Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.TextFidelity#getRepTxtEx <em>Rep Txt Ex</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getTextFidelity()
 * @model
 * @generated
 */
public interface TextFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp Txt Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp Txt Ex</em>' attribute.
	 * @see #setStpTxtEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTextFidelity_StpTxtEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpTxtEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TextFidelity#getStpTxtEx <em>Stp Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp Txt Ex</em>' attribute.
	 * @see #getStpTxtEx()
	 * @generated
	 */
	void setStpTxtEx(Integer value);

	/**
	 * Returns the value of the '<em><b>Rep Txt Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep Txt Ex</em>' attribute.
	 * @see #setRepTxtEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTextFidelity_RepTxtEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getRepTxtEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TextFidelity#getRepTxtEx <em>Rep Txt Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Txt Ex</em>' attribute.
	 * @see #getRepTxtEx()
	 * @generated
	 */
	void setRepTxtEx(Integer value);

} // TextFidelity
