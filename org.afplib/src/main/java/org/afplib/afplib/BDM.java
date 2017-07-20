/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>BDM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BDM#getDMName <em>DM Name</em>}</li>
 *   <li>{@link org.afplib.afplib.BDM#getDatFmt <em>Dat Fmt</em>}</li>
 *   <li>{@link org.afplib.afplib.BDM#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBDM()
 * @model
 * @generated
 */
public interface BDM extends SF {
	/**
     * Returns the value of the '<em><b>DM Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>DM Name</em>' attribute.
     * @see #setDMName(String)
     * @see org.afplib.afplib.AfplibPackage#getBDM_DMName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getDMName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDM#getDMName <em>DM Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>DM Name</em>' attribute.
     * @see #getDMName()
     * @generated
     */
	void setDMName(String value);

	/**
     * Returns the value of the '<em><b>Dat Fmt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Dat Fmt</em>' attribute.
     * @see #setDatFmt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBDM_DatFmt()
     * @model required="true"
     * @generated
     */
	Integer getDatFmt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BDM#getDatFmt <em>Dat Fmt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Dat Fmt</em>' attribute.
     * @see #getDatFmt()
     * @generated
     */
	void setDatFmt(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getBDM_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // BDM
