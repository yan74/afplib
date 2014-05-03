/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>EPS</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>End Page Segment</b><br>The End Page Segment structured field terminates the page segment resource object initiated by a Begin Page Segment structured field.</p><p>ID: 13871455</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.EPS#getPsegName <em>Pseg Name</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getEPS()
 * @model
 * @generated
 */
public interface EPS extends SF {
	/**
	 * Returns the value of the '<em><b>Pseg Name</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pseg Name</em>' attribute.
	 * @see #setPsegName(String)
	 * @see org.afplib.afplib.AfplibPackage#getEPS_PsegName()
	 * @model dataType="org.afplib.base.ModcaString8"
	 * @generated
	 */
	String getPsegName();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.EPS#getPsegName <em>Pseg Name</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pseg Name</em>' attribute.
	 * @see #getPsegName()
	 * @generated
	 */
	void setPsegName(String value);

} // EPS
