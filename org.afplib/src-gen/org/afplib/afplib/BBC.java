/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BBC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BBC#getBCdoName <em>BCdo Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BBC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBBC()
 * @model
 * @generated
 */
public interface BBC extends SF {
	/**
	 * Returns the value of the '<em><b>BCdo Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>BCdo Name</em>' attribute.
	 * @see #setBCdoName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBBC_BCdoName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getBCdoName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BBC#getBCdoName <em>BCdo Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>BCdo Name</em>' attribute.
	 * @see #getBCdoName()
	 * @generated
	 */
	void setBCdoName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBBC_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BBC
