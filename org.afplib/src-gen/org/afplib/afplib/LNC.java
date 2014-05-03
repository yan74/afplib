/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LNC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Line Descriptor Count</b><br></p><p>ID: 13871847</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.LNC#getNumDSC <em>Num DSC</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getLNC()
 * @model
 * @generated
 */
public interface LNC extends SF {
	/**
	 * Returns the value of the '<em><b>Num DSC</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Num DSC</em>' attribute.
	 * @see #setNumDSC(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getLNC_NumDSC()
	 * @model required="true"
	 * @generated
	 */
	Integer getNumDSC();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.LNC#getNumDSC <em>Num DSC</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Num DSC</em>' attribute.
	 * @see #getNumDSC()
	 * @generated
	 */
	void setNumDSC(Integer value);

} // LNC
