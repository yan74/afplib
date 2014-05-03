/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BSG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Resource Environment Group</b><br>The Begin Resource Environment Group structured field begins a Resource Environment Group (REG), which defines a subset of the resources required for a document or for a group of pages in a document. The scope of the Resource Environment Group is the group of pages that follow, up to the next REG, which is a complete replacement for the current REG, or the end of the document, whichever occurs first.</p><p>ID: 13871321</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BSG#getREGName <em>REG Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BSG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBSG()
 * @model
 * @generated
 */
public interface BSG extends SF {
	/**
	 * Returns the value of the '<em><b>REG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>REG Name</em>' attribute.
	 * @see #setREGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBSG_REGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getREGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BSG#getREGName <em>REG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>REG Name</em>' attribute.
	 * @see #getREGName()
	 * @generated
	 */
	void setREGName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBSG_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BSG
