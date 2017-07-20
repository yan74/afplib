/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Band Image Data</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.BandImageData#getBANDNUM <em>BANDNUM</em>}</li>
 *   <li>{@link org.afplib.afplib.BandImageData#getRESERVED <em>RESERVED</em>}</li>
 *   <li>{@link org.afplib.afplib.BandImageData#getDATA <em>DATA</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getBandImageData()
 * @model
 * @generated
 */
public interface BandImageData extends Triplet {
	/**
     * Returns the value of the '<em><b>BANDNUM</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>BANDNUM</em>' attribute.
     * @see #setBANDNUM(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBandImageData_BANDNUM()
     * @model required="true"
     * @generated
     */
	Integer getBANDNUM();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BandImageData#getBANDNUM <em>BANDNUM</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>BANDNUM</em>' attribute.
     * @see #getBANDNUM()
     * @generated
     */
	void setBANDNUM(Integer value);

	/**
     * Returns the value of the '<em><b>RESERVED</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>RESERVED</em>' attribute.
     * @see #setRESERVED(Integer)
     * @see org.afplib.afplib.AfplibPackage#getBandImageData_RESERVED()
     * @model required="true"
     * @generated
     */
	Integer getRESERVED();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BandImageData#getRESERVED <em>RESERVED</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>RESERVED</em>' attribute.
     * @see #getRESERVED()
     * @generated
     */
	void setRESERVED(Integer value);

	/**
     * Returns the value of the '<em><b>DATA</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>DATA</em>' attribute.
     * @see #setDATA(byte[])
     * @see org.afplib.afplib.AfplibPackage#getBandImageData_DATA()
     * @model
     * @generated
     */
	byte[] getDATA();

	/**
     * Sets the value of the '{@link org.afplib.afplib.BandImageData#getDATA <em>DATA</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>DATA</em>' attribute.
     * @see #getDATA()
     * @generated
     */
	void setDATA(byte[] value);

} // BandImageData
