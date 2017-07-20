/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IPS#getPsegName <em>Pseg Name</em>}</li>
 *   <li>{@link org.afplib.afplib.IPS#getXpsOset <em>Xps Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IPS#getYpsOset <em>Yps Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IPS#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIPS()
 * @model
 * @generated
 */
public interface IPS extends SF {
	/**
     * Returns the value of the '<em><b>Pseg Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Pseg Name</em>' attribute.
     * @see #setPsegName(String)
     * @see org.afplib.afplib.AfplibPackage#getIPS_PsegName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getPsegName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPS#getPsegName <em>Pseg Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Pseg Name</em>' attribute.
     * @see #getPsegName()
     * @generated
     */
	void setPsegName(String value);

	/**
     * Returns the value of the '<em><b>Xps Oset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xps Oset</em>' attribute.
     * @see #setXpsOset(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIPS_XpsOset()
     * @model required="true"
     * @generated
     */
	Integer getXpsOset();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPS#getXpsOset <em>Xps Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xps Oset</em>' attribute.
     * @see #getXpsOset()
     * @generated
     */
	void setXpsOset(Integer value);

	/**
     * Returns the value of the '<em><b>Yps Oset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yps Oset</em>' attribute.
     * @see #setYpsOset(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIPS_YpsOset()
     * @model required="true"
     * @generated
     */
	Integer getYpsOset();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPS#getYpsOset <em>Yps Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yps Oset</em>' attribute.
     * @see #getYpsOset()
     * @generated
     */
	void setYpsOset(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getIPS_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // IPS
