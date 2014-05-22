/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Finishing Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FinishingFidelity#getStpFinEx <em>Stp Fin Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.FinishingFidelity#getRepFinEx <em>Rep Fin Ex</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFinishingFidelity()
 * @model
 * @generated
 */
public interface FinishingFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp Fin Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp Fin Ex</em>' attribute.
	 * @see #setStpFinEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFinishingFidelity_StpFinEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpFinEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FinishingFidelity#getStpFinEx <em>Stp Fin Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp Fin Ex</em>' attribute.
	 * @see #getStpFinEx()
	 * @generated
	 */
	void setStpFinEx(Integer value);

	/**
	 * Returns the value of the '<em><b>Rep Fin Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep Fin Ex</em>' attribute.
	 * @see #setRepFinEx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFinishingFidelity_RepFinEx()
	 * @model required="true"
	 * @generated
	 */
	Integer getRepFinEx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FinishingFidelity#getRepFinEx <em>Rep Fin Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep Fin Ex</em>' attribute.
	 * @see #getRepFinEx()
	 * @generated
	 */
	void setRepFinEx(Integer value);

} // FinishingFidelity
