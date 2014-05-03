/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>CPI</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Code Page Index</b><br>In a series of repeating groups, the Code Page Index (CPI) associates character IDs with code points. Each repeating group specifies a character ID, a set of flags, and a code point. The repeating groups may be sorted in ascending order by character IDs or by code point, depending on the Sort Order flag in the Code Page Control structured field. The default sort order is by ascending character ID order. One repeating group is required, but as many as 65,536 repeating groups are allowed. The maximum number of repeating groups is determined by the maximum number of code points in the code page: 256 for single-byte code pages, 256 for double-byte code page sections, and 65,536 for double-byte code pages.</p><p>ID: 13864071</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.CPI#getRg <em>Rg</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getCPI()
 * @model
 * @generated
 */
public interface CPI extends SF {
	/**
	 * Returns the value of the '<em><b>Rg</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.afplib.CPIRG}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Rg</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getCPI_Rg()
	 * @model containment="true" resolveProxies="true" required="true"
	 * @generated
	 */
	EList<CPIRG> getRg();

} // CPI
