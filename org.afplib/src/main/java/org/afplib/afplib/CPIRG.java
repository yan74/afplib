/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPIRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.CPIRG#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.CPIRG#getPrtFlags <em>Prt Flags</em>}</li>
 *   <li>{@link org.afplib.afplib.CPIRG#getCodePoint <em>Code Point</em>}</li>
 *   <li>{@link org.afplib.afplib.CPIRG#getCount <em>Count</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getCPIRG()
 * @model
 * @generated
 */
public interface CPIRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>GCGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCGID</em>' attribute.
	 * @see #setGCGID(String)
	 * @see org.afplib.afplib.AfplibPackage#getCPIRG_GCGID()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getGCGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPIRG#getGCGID <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCGID</em>' attribute.
	 * @see #getGCGID()
	 * @generated
	 */
	void setGCGID(String value);

	/**
	 * Returns the value of the '<em><b>Prt Flags</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Prt Flags</em>' attribute.
	 * @see #setPrtFlags(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPIRG_PrtFlags()
	 * @model required="true"
	 * @generated
	 */
	Integer getPrtFlags();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPIRG#getPrtFlags <em>Prt Flags</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Prt Flags</em>' attribute.
	 * @see #getPrtFlags()
	 * @generated
	 */
	void setPrtFlags(Integer value);

	/**
	 * Returns the value of the '<em><b>Code Point</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Code Point</em>' attribute.
	 * @see #setCodePoint(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPIRG_CodePoint()
	 * @model required="true"
	 * @generated
	 */
	Integer getCodePoint();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPIRG#getCodePoint <em>Code Point</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Code Point</em>' attribute.
	 * @see #getCodePoint()
	 * @generated
	 */
	void setCodePoint(Integer value);

	/**
	 * Returns the value of the '<em><b>Count</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Count</em>' attribute.
	 * @see #setCount(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getCPIRG_Count()
	 * @model
	 * @generated
	 */
	Integer getCount();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.CPIRG#getCount <em>Count</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Count</em>' attribute.
	 * @see #getCount()
	 * @generated
	 */
	void setCount(Integer value);

} // CPIRG
