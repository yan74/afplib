/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>IOCA Function Set Identification</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.IOCAFunctionSetIdentification#getCATEGORY <em>CATEGORY</em>}</li>
 *   <li>{@link org.afplib.afplib.IOCAFunctionSetIdentification#getFCNSET <em>FCNSET</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getIOCAFunctionSetIdentification()
 * @model
 * @generated
 */
public interface IOCAFunctionSetIdentification extends Triplet {
	/**
	 * Returns the value of the '<em><b>CATEGORY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CATEGORY</em>' attribute.
	 * @see #setCATEGORY(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOCAFunctionSetIdentification_CATEGORY()
	 * @model required="true"
	 * @generated
	 */
	Integer getCATEGORY();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOCAFunctionSetIdentification#getCATEGORY <em>CATEGORY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CATEGORY</em>' attribute.
	 * @see #getCATEGORY()
	 * @generated
	 */
	void setCATEGORY(Integer value);

	/**
	 * Returns the value of the '<em><b>FCNSET</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FCNSET</em>' attribute.
	 * @see #setFCNSET(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getIOCAFunctionSetIdentification_FCNSET()
	 * @model required="true"
	 * @generated
	 */
	Integer getFCNSET();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.IOCAFunctionSetIdentification#getFCNSET <em>FCNSET</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FCNSET</em>' attribute.
	 * @see #getFCNSET()
	 * @generated
	 */
	void setFCNSET(Integer value);

} // IOCAFunctionSetIdentification
