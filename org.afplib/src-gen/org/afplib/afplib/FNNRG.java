/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNNRG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b></b><br></p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNNRG#getGCGID <em>GCGID</em>}</li>
 *   <li>{@link org.afplib.afplib.FNNRG#getTSOffset <em>TS Offset</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNNRG()
 * @model
 * @generated
 */
public interface FNNRG extends Triplet {
	/**
	 * Returns the value of the '<em><b>GCGID</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>GCGID</em>' attribute.
	 * @see #setGCGID(String)
	 * @see org.afplib.afplib.AfplibPackage#getFNNRG_GCGID()
	 * @model dataType="org.afplib.base.ModcaString8" required="true"
	 * @generated
	 */
	String getGCGID();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNNRG#getGCGID <em>GCGID</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>GCGID</em>' attribute.
	 * @see #getGCGID()
	 * @generated
	 */
	void setGCGID(String value);

	/**
	 * Returns the value of the '<em><b>TS Offset</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TS Offset</em>' attribute.
	 * @see #setTSOffset(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getFNNRG_TSOffset()
	 * @model required="true"
	 * @generated
	 */
	Integer getTSOffset();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNNRG#getTSOffset <em>TS Offset</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TS Offset</em>' attribute.
	 * @see #getTSOffset()
	 * @generated
	 */
	void setTSOffset(Integer value);

} // FNNRG
