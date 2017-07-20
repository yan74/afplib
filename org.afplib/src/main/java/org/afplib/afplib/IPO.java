/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IPO</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.IPO#getOvlyName <em>Ovly Name</em>}</li>
 *   <li>{@link org.afplib.afplib.IPO#getXolOset <em>Xol Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IPO#getYolOset <em>Yol Oset</em>}</li>
 *   <li>{@link org.afplib.afplib.IPO#getOvlyOrent <em>Ovly Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.IPO#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getIPO()
 * @model
 * @generated
 */
public interface IPO extends SF {
	/**
     * Returns the value of the '<em><b>Ovly Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ovly Name</em>' attribute.
     * @see #setOvlyName(String)
     * @see org.afplib.afplib.AfplibPackage#getIPO_OvlyName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getOvlyName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPO#getOvlyName <em>Ovly Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ovly Name</em>' attribute.
     * @see #getOvlyName()
     * @generated
     */
	void setOvlyName(String value);

	/**
     * Returns the value of the '<em><b>Xol Oset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xol Oset</em>' attribute.
     * @see #setXolOset(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIPO_XolOset()
     * @model required="true"
     * @generated
     */
	Integer getXolOset();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPO#getXolOset <em>Xol Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xol Oset</em>' attribute.
     * @see #getXolOset()
     * @generated
     */
	void setXolOset(Integer value);

	/**
     * Returns the value of the '<em><b>Yol Oset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Yol Oset</em>' attribute.
     * @see #setYolOset(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIPO_YolOset()
     * @model required="true"
     * @generated
     */
	Integer getYolOset();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPO#getYolOset <em>Yol Oset</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Yol Oset</em>' attribute.
     * @see #getYolOset()
     * @generated
     */
	void setYolOset(Integer value);

	/**
     * Returns the value of the '<em><b>Ovly Orent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ovly Orent</em>' attribute.
     * @see #setOvlyOrent(Integer)
     * @see org.afplib.afplib.AfplibPackage#getIPO_OvlyOrent()
     * @model
     * @generated
     */
	Integer getOvlyOrent();

	/**
     * Sets the value of the '{@link org.afplib.afplib.IPO#getOvlyOrent <em>Ovly Orent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ovly Orent</em>' attribute.
     * @see #getOvlyOrent()
     * @generated
     */
	void setOvlyOrent(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getIPO_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // IPO
