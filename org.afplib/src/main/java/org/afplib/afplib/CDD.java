/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CDD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CDD#getXocBase <em>Xoc Base</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getYocBase <em>Yoc Base</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getXocUnits <em>Xoc Units</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getYocUnits <em>Yoc Units</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getXocSize <em>Xoc Size</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getYocSize <em>Yoc Size</em>}</li>
 *   <li>{@link org.afplib.afplib.CDD#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCDD()
 * @model
 * @generated
 */
public interface CDD extends SF {
	/**
	 * Returns the value of the '<em><b>Xoc Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoc Base</em>' attribute.
	 * @see #setXocBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_XocBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getXocBase <em>Xoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoc Base</em>' attribute.
	 * @see #getXocBase()
	 * @generated
	 */
	void setXocBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoc Base</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoc Base</em>' attribute.
	 * @see #setYocBase(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_YocBase()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocBase();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getYocBase <em>Yoc Base</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoc Base</em>' attribute.
	 * @see #getYocBase()
	 * @generated
	 */
	void setYocBase(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoc Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoc Units</em>' attribute.
	 * @see #setXocUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_XocUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getXocUnits <em>Xoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoc Units</em>' attribute.
	 * @see #getXocUnits()
	 * @generated
	 */
	void setXocUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoc Units</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoc Units</em>' attribute.
	 * @see #setYocUnits(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_YocUnits()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocUnits();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getYocUnits <em>Yoc Units</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoc Units</em>' attribute.
	 * @see #getYocUnits()
	 * @generated
	 */
	void setYocUnits(Integer value);

	/**
	 * Returns the value of the '<em><b>Xoc Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Xoc Size</em>' attribute.
	 * @see #setXocSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_XocSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getXocSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getXocSize <em>Xoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Xoc Size</em>' attribute.
	 * @see #getXocSize()
	 * @generated
	 */
	void setXocSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Yoc Size</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Yoc Size</em>' attribute.
	 * @see #setYocSize(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCDD_YocSize()
	 * @model required="true"
	 * @generated
	 */
	Integer getYocSize();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CDD#getYocSize <em>Yoc Size</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Yoc Size</em>' attribute.
	 * @see #getYocSize()
	 * @generated
	 */
	void setYocSize(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getCDD_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // CDD
