/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BOG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Begin Object Environment Group</b><br>The Begin Object Environment Group structured field begins an Object Environment Group, which establishes the environment parameters for the object. The scope of an object environment group is its containing object.</p><p>ID: 13871303</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.BOG#getOEGName <em>OEG Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BOG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getBOG()
 * @model
 * @generated
 */
public interface BOG extends SF {
	/**
	 * Returns the value of the '<em><b>OEG Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>OEG Name</em>' attribute.
	 * @see #setOEGName(String)
	 * @see org.afplib.afplib.AfplibPackage#getBOG_OEGName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getOEGName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.BOG#getOEGName <em>OEG Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>OEG Name</em>' attribute.
	 * @see #getOEGName()
	 * @generated
	 */
	void setOEGName(String value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getBOG_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // BOG
