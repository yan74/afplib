/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Resource Local Identifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.ResourceLocalIdentifier#getResType <em>Res Type</em>}</li>
 *   <li>{@link org.afplib.afplib.ResourceLocalIdentifier#getResLID <em>Res LID</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getResourceLocalIdentifier()
 * @model
 * @generated
 */
public interface ResourceLocalIdentifier extends Triplet {
	/**
     * Returns the value of the '<em><b>Res Type</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Res Type</em>' attribute.
     * @see #setResType(Integer)
     * @see org.afplib.afplib.AfplibPackage#getResourceLocalIdentifier_ResType()
     * @model required="true"
     * @generated
     */
	Integer getResType();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ResourceLocalIdentifier#getResType <em>Res Type</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res Type</em>' attribute.
     * @see #getResType()
     * @generated
     */
	void setResType(Integer value);

	/**
     * Returns the value of the '<em><b>Res LID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Res LID</em>' attribute.
     * @see #setResLID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getResourceLocalIdentifier_ResLID()
     * @model required="true"
     * @generated
     */
	Integer getResLID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.ResourceLocalIdentifier#getResLID <em>Res LID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Res LID</em>' attribute.
     * @see #getResLID()
     * @generated
     */
	void setResLID(Integer value);

} // ResourceLocalIdentifier
