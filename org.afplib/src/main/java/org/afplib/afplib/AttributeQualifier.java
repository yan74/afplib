/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Qualifier</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.AttributeQualifier#getSeqNum <em>Seq Num</em>}</li>
 *   <li>{@link org.afplib.afplib.AttributeQualifier#getLevNum <em>Lev Num</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getAttributeQualifier()
 * @model
 * @generated
 */
public interface AttributeQualifier extends Triplet {
	/**
	 * Returns the value of the '<em><b>Seq Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Seq Num</em>' attribute.
	 * @see #setSeqNum(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getAttributeQualifier_SeqNum()
	 * @model required="true"
	 * @generated
	 */
	Integer getSeqNum();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.AttributeQualifier#getSeqNum <em>Seq Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Seq Num</em>' attribute.
	 * @see #getSeqNum()
	 * @generated
	 */
	void setSeqNum(Integer value);

	/**
	 * Returns the value of the '<em><b>Lev Num</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Lev Num</em>' attribute.
	 * @see #setLevNum(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getAttributeQualifier_LevNum()
	 * @model required="true"
	 * @generated
	 */
	Integer getLevNum();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.AttributeQualifier#getLevNum <em>Lev Num</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Lev Num</em>' attribute.
	 * @see #getLevNum()
	 * @generated
	 */
	void setLevNum(Integer value);

} // AttributeQualifier
