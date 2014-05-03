/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Fully Qualified Name</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Fully Qualified Name</b><br>Ein Fully Qualified Name kann benutzt werden, um Referenzen auf Objekte oder Objektnamen (zum Beispiel DocName im BDT) zu überschreiben.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FullyQualifiedName#getFQNType <em>FQN Type</em>}</li>
 *   <li>{@link org.afplib.afplib.FullyQualifiedName#getFQNFormat <em>FQN Format</em>}</li>
 *   <li>{@link org.afplib.afplib.FullyQualifiedName#getFQName <em>FQ Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFullyQualifiedName()
 * @model
 * @generated
 */
public interface FullyQualifiedName extends Triplet {
	/**
	 * Returns the value of the '<em><b>FQN Type</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FQN Type</em>' attribute.
	 * @see #setFQNType(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFullyQualifiedName_FQNType()
	 * @model required="true"
	 * @generated
	 */
	Integer getFQNType();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FullyQualifiedName#getFQNType <em>FQN Type</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQN Type</em>' attribute.
	 * @see #getFQNType()
	 * @generated
	 */
	void setFQNType(Integer value);

	/**
	 * Returns the value of the '<em><b>FQN Format</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FQN Format</em>' attribute.
	 * @see #setFQNFormat(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFullyQualifiedName_FQNFormat()
	 * @model required="true"
	 * @generated
	 */
	Integer getFQNFormat();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FullyQualifiedName#getFQNFormat <em>FQN Format</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQN Format</em>' attribute.
	 * @see #getFQNFormat()
	 * @generated
	 */
	void setFQNFormat(Integer value);

	/**
	 * Returns the value of the '<em><b>FQ Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>FQ Name</em>' attribute.
	 * @see #setFQName(String)
	 * @see org.afplib.afplib.AfplibPackage#getFullyQualifiedName_FQName()
	 * @model dataType="org.afplib.base.ModcaString" required="true"
	 * @generated
	 */
	String getFQName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FullyQualifiedName#getFQName <em>FQ Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>FQ Name</em>' attribute.
	 * @see #getFQName()
	 * @generated
	 */
	void setFQName(String value);

} // FullyQualifiedName
