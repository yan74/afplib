/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPD</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CPD#getCPDesc <em>CP Desc</em>}</li>
 *   <li>{@link org.afplib.afplib.CPD#getGCGIDLen <em>GCGID Len</em>}</li>
 *   <li>{@link org.afplib.afplib.CPD#getNumCdPts <em>Num Cd Pts</em>}</li>
 *   <li>{@link org.afplib.afplib.CPD#getGCSGID <em>GCSGID</em>}</li>
 *   <li>{@link org.afplib.afplib.CPD#getCPGID <em>CPGID</em>}</li>
 *   <li>{@link org.afplib.afplib.CPD#getEncScheme <em>Enc Scheme</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCPD()
 * @model
 * @generated
 */
public interface CPD extends SF {
	/**
	 * Returns the value of the '<em><b>CP Desc</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CP Desc</em>' attribute.
	 * @see #setCPDesc(String)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_CPDesc()
	 * @model dataType="org.afplib.base.ModcaString32" required="true"
	 * @generated
	 */
	String getCPDesc();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getCPDesc <em>CP Desc</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CP Desc</em>' attribute.
	 * @see #getCPDesc()
	 * @generated
	 */
	void setCPDesc(String value);

	/**
	 * Returns the value of the '<em><b>GCGID Len</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCGID Len</em>' attribute.
	 * @see #setGCGIDLen(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_GCGIDLen()
	 * @model required="true"
	 * @generated
	 */
	Integer getGCGIDLen();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getGCGIDLen <em>GCGID Len</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCGID Len</em>' attribute.
	 * @see #getGCGIDLen()
	 * @generated
	 */
	void setGCGIDLen(Integer value);

	/**
	 * Returns the value of the '<em><b>Num Cd Pts</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num Cd Pts</em>' attribute.
	 * @see #setNumCdPts(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_NumCdPts()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumCdPts();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getNumCdPts <em>Num Cd Pts</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num Cd Pts</em>' attribute.
	 * @see #getNumCdPts()
	 * @generated
	 */
	void setNumCdPts(Integer value);

	/**
	 * Returns the value of the '<em><b>GCSGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCSGID</em>' attribute.
	 * @see #setGCSGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_GCSGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getGCSGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getGCSGID <em>GCSGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCSGID</em>' attribute.
	 * @see #getGCSGID()
	 * @generated
	 */
	void setGCSGID(Integer value);

	/**
	 * Returns the value of the '<em><b>CPGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>CPGID</em>' attribute.
	 * @see #setCPGID(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_CPGID()
	 * @model required="true"
	 * @generated
	 */
	Integer getCPGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getCPGID <em>CPGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>CPGID</em>' attribute.
	 * @see #getCPGID()
	 * @generated
	 */
	void setCPGID(Integer value);

	/**
	 * Returns the value of the '<em><b>Enc Scheme</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Enc Scheme</em>' attribute.
	 * @see #setEncScheme(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPD_EncScheme()
	 * @model
	 * @generated
	 */
	Integer getEncScheme();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPD#getEncScheme <em>Enc Scheme</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Enc Scheme</em>' attribute.
	 * @see #getEncScheme()
	 * @generated
	 */
	void setEncScheme(Integer value);

} // CPD
