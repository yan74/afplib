/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PFC#getPFCFlgs <em>PFC Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.PFC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPFC()
 * @model
 * @generated
 */
public interface PFC extends SF {
	/**
     * Returns the value of the '<em><b>PFC Flgs</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>PFC Flgs</em>' attribute.
     * @see #setPFCFlgs(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPFC_PFCFlgs()
     * @model required="true"
     * @generated
     */
	Integer getPFCFlgs();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PFC#getPFCFlgs <em>PFC Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>PFC Flgs</em>' attribute.
     * @see #getPFCFlgs()
     * @generated
     */
	void setPFCFlgs(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getPFC_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // PFC
