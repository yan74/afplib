/**
 */
package org.afplib.afplib;

import org.afplib.base.Triplet;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>Tile Size</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * <ul>
 *   <li>{@link org.afplib.afplib.TileSize#getTHSIZE <em>THSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSize#getTVSIZE <em>TVSIZE</em>}</li>
 *   <li>{@link org.afplib.afplib.TileSize#getRELRES <em>RELRES</em>}</li>
 * </ul>
 * </p>
 *
 * @see org.afplib.afplib.AfplibPackage#getTileSize()
 * @model
 * @generated
 */
public interface TileSize extends Triplet {
	/**
	 * Returns the value of the '<em><b>THSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>THSIZE</em>' attribute.
	 * @see #setTHSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileSize_THSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getTHSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileSize#getTHSIZE <em>THSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>THSIZE</em>' attribute.
	 * @see #getTHSIZE()
	 * @generated
	 */
	void setTHSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>TVSIZE</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>mandatory<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>TVSIZE</em>' attribute.
	 * @see #setTVSIZE(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileSize_TVSIZE()
	 * @model required="true"
	 * @generated
	 */
	Integer getTVSIZE();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileSize#getTVSIZE <em>TVSIZE</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>TVSIZE</em>' attribute.
	 * @see #getTVSIZE()
	 * @generated
	 */
	void setTVSIZE(Integer value);

	/**
	 * Returns the value of the '<em><b>RELRES</b></em>' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * <!-- begin-model-doc -->
	 * <p>optional<br>fixed length</p>
	 * <!-- end-model-doc -->
	 * @return the value of the '<em>RELRES</em>' attribute.
	 * @see #setRELRES(Integer)
	 * @see org.afplib.afplib.AfplibPackage#getTileSize_RELRES()
	 * @model
	 * @generated
	 */
	Integer getRELRES();

	/**
	 * Sets the value of the '{@link org.afplib.afplib.TileSize#getRELRES <em>RELRES</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the new value of the '<em>RELRES</em>' attribute.
	 * @see #getRELRES()
	 * @generated
	 */
	void setRELRES(Integer value);

} // TileSize
