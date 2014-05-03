/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Font Index</b><br>For each character in a raster font, the Font Index (FNI) describes specific characteristics and points to an entry in the Font Patterns Map (FNM) structured field.</p><p>ID: 13864073</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNI#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNI()
 * @model
 * @generated
 */
public interface FNI extends SF {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.FNIRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getFNI_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<FNIRG> getRg();

} // FNI
