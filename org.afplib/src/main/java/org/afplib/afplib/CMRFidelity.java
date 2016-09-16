/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CMR Fidelity</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CMRFidelity#getStpCMREx <em>Stp CMR Ex</em>}</li>
 *   <li>{@link org.afplib.afplib.CMRFidelity#getRepCMREx <em>Rep CMR Ex</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCMRFidelity()
 * @model
 * @generated
 */
public interface CMRFidelity extends Triplet {
	/**
	 * Returns the value of the '<em><b>Stp CMR Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Stp CMR Ex</em>' attribute.
	 * @see #setStpCMREx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCMRFidelity_StpCMREx()
	 * @model required="true"
	 * @generated
	 */
	Integer getStpCMREx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CMRFidelity#getStpCMREx <em>Stp CMR Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Stp CMR Ex</em>' attribute.
	 * @see #getStpCMREx()
	 * @generated
	 */
	void setStpCMREx(Integer value);

	/**
	 * Returns the value of the '<em><b>Rep CMR Ex</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rep CMR Ex</em>' attribute.
	 * @see #setRepCMREx(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCMRFidelity_RepCMREx()
	 * @model required="true"
	 * @generated
	 */
	Integer getRepCMREx();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CMRFidelity#getRepCMREx <em>Rep CMR Ex</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Rep CMR Ex</em>' attribute.
	 * @see #getRepCMREx()
	 * @generated
	 */
	void setRepCMREx(Integer value);

} // CMRFidelity
