/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IDE Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IDESize#getIDESZ <em>IDESZ</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIDESize()
 * @model
 * @generated
 */
public interface IDESize extends Triplet {
	/**
	 * Returns the value of the '<em><b>IDESZ</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>IDESZ</em>' attribute.
	 * @see #setIDESZ(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIDESize_IDESZ()
	 * @model required="true"
	 * @generated
	 */
	Integer getIDESZ();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IDESize#getIDESZ <em>IDESZ</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>IDESZ</em>' attribute.
	 * @see #getIDESZ()
	 * @generated
	 */
	void setIDESZ(Integer value);

} // IDESize
