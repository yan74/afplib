/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>External Algorithm RG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.ExternalAlgorithmRG#getDIRCTN <em>DIRCTN</em>}</li>
 *   <li>{@link org.afplib.afplib.ExternalAlgorithmRG#getPADBDRY <em>PADBDRY</em>}</li>
 *   <li>{@link org.afplib.afplib.ExternalAlgorithmRG#getPADALMT <em>PADALMT</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRG()
 * @model
 * @generated
 */
public interface ExternalAlgorithmRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>DIRCTN</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>DIRCTN</em>' attribute.
	 * @see #setDIRCTN(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRG_DIRCTN()
	 * @model required="true"
	 * @generated
	 */
	Integer getDIRCTN();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ExternalAlgorithmRG#getDIRCTN <em>DIRCTN</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>DIRCTN</em>' attribute.
	 * @see #getDIRCTN()
	 * @generated
	 */
	void setDIRCTN(Integer value);

	/**
	 * Returns the value of the '<em><b>PADBDRY</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PADBDRY</em>' attribute.
	 * @see #setPADBDRY(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRG_PADBDRY()
	 * @model required="true"
	 * @generated
	 */
	Integer getPADBDRY();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ExternalAlgorithmRG#getPADBDRY <em>PADBDRY</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PADBDRY</em>' attribute.
	 * @see #getPADBDRY()
	 * @generated
	 */
	void setPADBDRY(Integer value);

	/**
	 * Returns the value of the '<em><b>PADALMT</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PADALMT</em>' attribute.
	 * @see #setPADALMT(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getExternalAlgorithmRG_PADALMT()
	 * @model required="true"
	 * @generated
	 */
	Integer getPADALMT();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.ExternalAlgorithmRG#getPADALMT <em>PADALMT</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PADALMT</em>' attribute.
	 * @see #getPADALMT()
	 * @generated
	 */
	void setPADALMT(Integer value);

} // ExternalAlgorithmRG
