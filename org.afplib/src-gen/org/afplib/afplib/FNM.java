/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>FNM</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Font Patterns Map</b><br>The Font Patterns Map (FNM) structured field describes some characteristics of the font character patterns. Each pattern is described in a separate repeating group. This structured field is omitted if the font does not contain raster patterns.</p><p>ID: 13869705</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.FNM#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getFNM()
 * @model
 * @generated
 */
public interface FNM extends SF {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.FNMRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getFNM_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<FNMRG> getRg();

} // FNM
