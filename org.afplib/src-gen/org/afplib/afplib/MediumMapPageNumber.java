/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Medium Map Page Number</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Medium Map Page Number</b><br>The Medium Map Page Number triplet is used to specify the sequence number of the page in the set of sequential pages whose presentation is controlled by the most recently activated medium map.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MediumMapPageNumber#getPageNum <em>Page Num</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMediumMapPageNumber()
 * @model
 * @generated
 */
public interface MediumMapPageNumber extends Triplet {
	/**
	 * Returns the value of the '<em><b>Page Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Page Num</em>' attribute.
	 * @see #setPageNum(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMediumMapPageNumber_PageNum()
	 * @model required="true"
	 * @generated
	 */
	Integer getPageNum();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MediumMapPageNumber#getPageNum <em>Page Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Page Num</em>' attribute.
	 * @see #getPageNum()
	 * @generated
	 */
	void setPageNum(Integer value);

} // MediumMapPageNumber
