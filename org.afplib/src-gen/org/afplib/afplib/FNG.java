/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNG</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Font Patterns</b><br>The Font Patterns (FNG) structured field carries the character shape data (raster patterns or outline data) for a font character set. When there is more shape data than can fit in a single FNG structured field, a series of consecutive FNG structured fields are used to carry the character shape data; the data can be split across FNG structured fields at any byte boundary; the segmentation flag is not used.</p><p>ID: 13889161</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNG#getPatData <em>Pat Data</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNG()
 * @model
 * @generated
 */
public interface FNG extends SF {
	/**
	 * Returns the value of the '<em><b>Pat Data</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Pat Data</em>' attribute.
	 * @see #setPatData(byte[])
	 * @see org.afplib.afplib.AfplibPackage#getFNG_PatData()
	 * @model
	 * @generated
	 */
	byte[] getPatData();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.FNG#getPatData <em>Pat Data</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Pat Data</em>' attribute.
	 * @see #getPatData()
	 * @generated
	 */
	void setPatData(byte[] value);

} // FNG
