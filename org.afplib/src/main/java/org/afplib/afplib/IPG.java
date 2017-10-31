/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IPG#getPgName <em>Pg Name</em>}</li>
 *   <li>{@link org.afplib.afplib.IPG#getIPgFlgs <em>IPg Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.IPG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIPG()
 * @model
 * @generated
 */
public interface IPG extends SF {
	/**
	 * Returns the value of the '<em><b>Pg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pg Name</em>' attribute.
	 * @see #setPgName(String)
	 * @see org.afplib.afplib.AfplibPackage#getIPG_PgName()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getPgName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IPG#getPgName <em>Pg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pg Name</em>' attribute.
	 * @see #getPgName()
	 * @generated
	 */
	void setPgName(String value);

	/**
	 * Returns the value of the '<em><b>IPg Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IPg Flgs</em>' attribute.
	 * @see #setIPgFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIPG_IPgFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getIPgFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IPG#getIPgFlgs <em>IPg Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IPg Flgs</em>' attribute.
	 * @see #getIPgFlgs()
	 * @generated
	 */
	void setIPgFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getIPG_Triplets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // IPG
