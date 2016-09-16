/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Comment</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.Comment#getComment <em>Comment</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getComment()
 * @model
 * @generated
 */
public interface Comment extends Triplet {
	/**
	 * Returns the value of the '<em><b>Comment</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Comment</em>' attribute.
	 * @see #setComment(String)
	 * @see org.afplib.afplib.AfplibPackage#getComment_Comment()
	 * @model dataType="org.afplib.base.ModcaString" required="true"
	 * @generated
	 */
	String getComment();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.Comment#getComment <em>Comment</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Comment</em>' attribute.
	 * @see #getComment()
	 * @generated
	 */
	void setComment(String value);

} // Comment
