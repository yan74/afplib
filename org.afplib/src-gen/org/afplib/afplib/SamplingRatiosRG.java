/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Sampling Ratios RG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.SamplingRatiosRG#getHSAMPLE <em>HSAMPLE</em>}</li>
 *   <li>{@link org.afplib.afplib.SamplingRatiosRG#getVSAMPLE <em>VSAMPLE</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getSamplingRatiosRG()
 * @model
 * @generated
 */
public interface SamplingRatiosRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>HSAMPLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>HSAMPLE</em>' attribute.
	 * @see #setHSAMPLE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSamplingRatiosRG_HSAMPLE()
	 * @model required="true"
	 * @generated
	 */
	Integer getHSAMPLE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SamplingRatiosRG#getHSAMPLE <em>HSAMPLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>HSAMPLE</em>' attribute.
	 * @see #getHSAMPLE()
	 * @generated
	 */
	void setHSAMPLE(Integer value);

	/**
	 * Returns the value of the '<em><b>VSAMPLE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>VSAMPLE</em>' attribute.
	 * @see #setVSAMPLE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getSamplingRatiosRG_VSAMPLE()
	 * @model required="true"
	 * @generated
	 */
	Integer getVSAMPLE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.SamplingRatiosRG#getVSAMPLE <em>VSAMPLE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>VSAMPLE</em>' attribute.
	 * @see #getVSAMPLE()
	 * @generated
	 */
	void setVSAMPLE(Integer value);

} // SamplingRatiosRG
