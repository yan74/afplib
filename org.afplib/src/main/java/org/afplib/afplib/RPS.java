/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>RPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.RPS#getRLENGTH <em>RLENGTH</em>}</li>
 *   <li>{@link org.afplib.afplib.RPS#getRPTDATA <em>RPTDATA</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getRPS()
 * @model
 * @generated
 */
public interface RPS extends Triplet {
	/**
	 * Returns the value of the '<em><b>RLENGTH</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RLENGTH</em>' attribute.
	 * @see #setRLENGTH(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getRPS_RLENGTH()
	 * @model required="true"
	 * @generated
	 */
	Integer getRLENGTH();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RPS#getRLENGTH <em>RLENGTH</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RLENGTH</em>' attribute.
	 * @see #getRLENGTH()
	 * @generated
	 */
	void setRLENGTH(Integer value);

	/**
	 * Returns the value of the '<em><b>RPTDATA</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RPTDATA</em>' attribute.
	 * @see #setRPTDATA(String)
	 * @see org.afplib.afplib.AfplibPackage#getRPS_RPTDATA()
	 * @model dataType="org.afplib.base.ModcaString"
	 * @generated
	 */
	String getRPTDATA();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.RPS#getRPTDATA <em>RPTDATA</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RPTDATA</em>' attribute.
	 * @see #getRPTDATA()
	 * @generated
	 */
	void setRPTDATA(String value);

} // RPS
