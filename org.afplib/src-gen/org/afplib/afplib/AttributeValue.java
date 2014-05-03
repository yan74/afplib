/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Attribute Value</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Attribute Value</b><br>The Attribute Value triplet is used to specify a value for a document attribute.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.AttributeValue#getReserved0 <em>Reserved0</em>}</li>
 *   <li>{@link org.afplib.afplib.AttributeValue#getAttVal <em>Att Val</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getAttributeValue()
 * @model
 * @generated
 */
public interface AttributeValue extends Triplet {
	/**
	 * Returns the value of the '<em><b>Reserved0</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Reserved0</em>' attribute.
	 * @see #setReserved0(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getAttributeValue_Reserved0()
	 * @model required="true"
	 * @generated
	 */
	Integer getReserved0();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.AttributeValue#getReserved0 <em>Reserved0</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Reserved0</em>' attribute.
	 * @see #getReserved0()
	 * @generated
	 */
	void setReserved0(Integer value);

	/**
	 * Returns the value of the '<em><b>Att Val</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Att Val</em>' attribute.
	 * @see #setAttVal(String)
	 * @see org.afplib.afplib.AfplibPackage#getAttributeValue_AttVal()
	 * @model dataType="org.afplib.base.ModcaString" required="true"
	 * @generated
	 */
	String getAttVal();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.AttributeValue#getAttVal <em>Att Val</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Att Val</em>' attribute.
	 * @see #getAttVal()
	 * @generated
	 */
	void setAttVal(String value);

} // AttributeValue
