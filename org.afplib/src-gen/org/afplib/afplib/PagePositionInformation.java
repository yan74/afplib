/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Page Position Information</b></em>'.
 * <!-- end-user-doc -->
 *
 * <!-- begin-model-doc -->
 * <p><b>Page Position Information</b><br>The Page Position Information triplet is used to tag a page with the Page Position (PGP) structured field repeating group information that is used to present the page. The PGP is specified in the medium map referenced by the FQN type X'8D'?Begin Medium Map Reference triplet. This information is used for viewing the page with a particular form map, which is normally the form map that the document containing this page was archived with. This triplet is not used for printing and is ignored by print servers.</p>
 * <!-- end-model-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.PagePositionInformation#getPGPRG <em>PGPRG</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getPagePositionInformation()
 * @model
 * @generated
 */
public interface PagePositionInformation extends Triplet {
	/**
	 * Returns the value of the '<em><b>PGPRG</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>PGPRG</em>' attribute.
	 * @see #setPGPRG(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getPagePositionInformation_PGPRG()
	 * @model required="true"
	 * @generated
	 */
	Integer getPGPRG();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.PagePositionInformation#getPGPRG <em>PGPRG</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>PGPRG</em>' attribute.
	 * @see #getPGPRG()
	 * @generated
	 */
	void setPGPRG(Integer value);

} // PagePositionInformation
