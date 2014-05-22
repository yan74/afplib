/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>GDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.GDD#getGOCAdes <em>GOC Ades</em>}</li>
 *   <li>{@link org.afplib.afplib.GDD#getCommands <em>Commands</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getGDD()
 * @model
 * @generated
 */
public interface GDD extends SF {
	/**
	 * Returns the value of the '<em><b>GOC Ades</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GOC Ades</em>' attribute.
	 * @see #setGOCAdes(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getGDD_GOCAdes()
	 * @model
	 * @generated
	 */
	byte[] getGOCAdes();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.GDD#getGOCAdes <em>GOC Ades</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GOC Ades</em>' attribute.
	 * @see #getGOCAdes()
	 * @generated
	 */
	void setGOCAdes(byte[] value);

	/**
	 * Returns the value of the '<em><b>Commands</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Commands</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getGDD_Commands()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getCommands();

} // GDD
