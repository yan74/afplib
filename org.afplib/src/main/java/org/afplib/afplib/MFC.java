/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>MFC</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.MFC#getMFCFlgs <em>MFC Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.MFC#getMedColl <em>Med Coll</em>}</li>
 *   <li>{@link org.afplib.afplib.MFC#getMFCScpe <em>MFC Scpe</em>}</li>
 *   <li>{@link org.afplib.afplib.MFC#getTriplets <em>Triplets</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getMFC()
 * @model
 * @generated
 */
public interface MFC extends SF {
	/**
	 * Returns the value of the '<em><b>MFC Flgs</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MFC Flgs</em>' attribute.
	 * @see #setMFCFlgs(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMFC_MFCFlgs()
	 * @model required="true"
	 * @generated
	 */
	Integer getMFCFlgs();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MFC#getMFCFlgs <em>MFC Flgs</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFC Flgs</em>' attribute.
	 * @see #getMFCFlgs()
	 * @generated
	 */
	void setMFCFlgs(Integer value);

	/**
	 * Returns the value of the '<em><b>Med Coll</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Med Coll</em>' attribute.
	 * @see #setMedColl(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMFC_MedColl()
	 * @model required="true"
	 * @generated
	 */
	Integer getMedColl();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MFC#getMedColl <em>Med Coll</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>Med Coll</em>' attribute.
	 * @see #getMedColl()
	 * @generated
	 */
	void setMedColl(Integer value);

	/**
	 * Returns the value of the '<em><b>MFC Scpe</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>MFC Scpe</em>' attribute.
	 * @see #setMFCScpe(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getMFC_MFCScpe()
	 * @model required="true"
	 * @generated
	 */
	Integer getMFCScpe();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.MFC#getMFCScpe <em>MFC Scpe</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>MFC Scpe</em>' attribute.
	 * @see #getMFCScpe()
	 * @generated
	 */
	void setMFCScpe(Integer value);

	/**
	 * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
	 * The list contents are of type {@link org.afplib.base.Triplet}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>variable length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>Triplets</em>' containment reference list.
	 * @see org.afplib.afplib.AfplibPackage#getMFC_Triplets()
	 * @model containment="true" resolveProxies="true"
	 * @generated
	 */
	EList<Triplet> getTriplets();

} // MFC
