/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>PGD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.PGD#getXpgBase <em>Xpg Base</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getYpgBase <em>Ypg Base</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getXpgUnits <em>Xpg Units</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getYpgUnits <em>Ypg Units</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getXpgSize <em>Xpg Size</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getYpgSize <em>Ypg Size</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getReserved <em>Reserved</em>}</li>
 *   <li>{@link org.afplib.afplib.PGD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getPGD()
 * @model
 * @generated
 */
public interface PGD extends SF {
	/**
     * Returns the value of the '<em><b>Xpg Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xpg Base</em>' attribute.
     * @see #setXpgBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_XpgBase()
     * @model required="true"
     * @generated
     */
	Integer getXpgBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getXpgBase <em>Xpg Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpg Base</em>' attribute.
     * @see #getXpgBase()
     * @generated
     */
	void setXpgBase(Integer value);

	/**
     * Returns the value of the '<em><b>Ypg Base</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ypg Base</em>' attribute.
     * @see #setYpgBase(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_YpgBase()
     * @model required="true"
     * @generated
     */
	Integer getYpgBase();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getYpgBase <em>Ypg Base</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ypg Base</em>' attribute.
     * @see #getYpgBase()
     * @generated
     */
	void setYpgBase(Integer value);

	/**
     * Returns the value of the '<em><b>Xpg Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xpg Units</em>' attribute.
     * @see #setXpgUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_XpgUnits()
     * @model required="true"
     * @generated
     */
	Integer getXpgUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getXpgUnits <em>Xpg Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpg Units</em>' attribute.
     * @see #getXpgUnits()
     * @generated
     */
	void setXpgUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Ypg Units</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ypg Units</em>' attribute.
     * @see #setYpgUnits(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_YpgUnits()
     * @model required="true"
     * @generated
     */
	Integer getYpgUnits();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getYpgUnits <em>Ypg Units</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ypg Units</em>' attribute.
     * @see #getYpgUnits()
     * @generated
     */
	void setYpgUnits(Integer value);

	/**
     * Returns the value of the '<em><b>Xpg Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Xpg Size</em>' attribute.
     * @see #setXpgSize(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_XpgSize()
     * @model required="true"
     * @generated
     */
	Integer getXpgSize();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getXpgSize <em>Xpg Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Xpg Size</em>' attribute.
     * @see #getXpgSize()
     * @generated
     */
	void setXpgSize(Integer value);

	/**
     * Returns the value of the '<em><b>Ypg Size</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Ypg Size</em>' attribute.
     * @see #setYpgSize(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_YpgSize()
     * @model required="true"
     * @generated
     */
	Integer getYpgSize();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getYpgSize <em>Ypg Size</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Ypg Size</em>' attribute.
     * @see #getYpgSize()
     * @generated
     */
	void setYpgSize(Integer value);

	/**
     * Returns the value of the '<em><b>Reserved</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Reserved</em>' attribute.
     * @see #setReserved(Integer)
     * @see org.afplib.afplib.AfplibPackage#getPGD_Reserved()
     * @model required="true"
     * @generated
     */
	Integer getReserved();

	/**
     * Sets the value of the '{@link org.afplib.afplib.PGD#getReserved <em>Reserved</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Reserved</em>' attribute.
     * @see #getReserved()
     * @generated
     */
	void setReserved(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getPGD_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // PGD
