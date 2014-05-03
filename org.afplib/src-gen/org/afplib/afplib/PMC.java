/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PMC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Page Modification Control</b><br>The Page Modification Control structured field specifies modifications to be applied to a page presented on a physical medium.</p><p>ID: 13871023</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PMC#getPMCid <em>PM Cid</em>}</li>
 *   <li>{@link org.afplib.afplib.PMC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPMC()
 * @model
 * @generated
 */
public interface PMC extends SF {
	/**
	 * Returns the value of the '<em><b>PM Cid</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PM Cid</em>' attribute.
	 * @see #setPMCid(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPMC_PMCid()
	 * @model required="true"
	 * @generated
	 */
	Integer getPMCid();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PMC#getPMCid <em>PM Cid</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PM Cid</em>' attribute.
	 * @see #getPMCid()
	 * @generated
	 */
	void setPMCid(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getPMC_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // PMC
