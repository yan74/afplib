/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LLERG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LLERG#getRGLength <em>RG Length</em>}</li>
 *   <li>{@link org.afplib.afplib.LLERG#getRGFunct <em>RG Funct</em>}</li>
 *   <li>{@link org.afplib.afplib.LLERG#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLLERG()
 * @model
 * @generated
 */
public interface LLERG extends Triplet {
	/**
	 * Returns the value of the '<em><b>RG Length</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Length</em>' attribute.
	 * @see #setRGLength(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLLERG_RGLength()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGLength();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LLERG#getRGLength <em>RG Length</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Length</em>' attribute.
	 * @see #getRGLength()
	 * @generated
	 */
	void setRGLength(Integer value);

	/**
	 * Returns the value of the '<em><b>RG Funct</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RG Funct</em>' attribute.
	 * @see #setRGFunct(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLLERG_RGFunct()
	 * @model required="true"
	 * @generated
	 */
	Integer getRGFunct();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LLERG#getRGFunct <em>RG Funct</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RG Funct</em>' attribute.
	 * @see #getRGFunct()
	 * @generated
	 */
	void setRGFunct(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getLLERG_Triplets()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // LLERG
