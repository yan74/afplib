/**
 */
package org.afplib.afplib;

import org.afplib.base.SF;
import org.afplib.base.Triplet;

import org.eclipse.emf.common.util.EList;

/**
 * <!-- begin-user-doc -->
 * A representation of the model object '<em><b>LND</b></em>'.
 * <!-- end-user-doc -->
 *
 * <p>
 * The following features are supported:
 * </p>
 * <ul>
 *   <li>{@link org.afplib.afplib.LND#getLNDFlgs <em>LND Flgs</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getIPos <em>IPos</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getBPos <em>BPos</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getTxtOrent <em>Txt Orent</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getFntLID <em>Fnt LID</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getChnlCde <em>Chnl Cde</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getNLNDskp <em>NLN Dskp</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getNLNDsp <em>NLN Dsp</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getNLNDreu <em>NLN Dreu</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getSupName <em>Sup Name</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getSOLid <em>SO Lid</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getDataStrt <em>Data Strt</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getDataLgth <em>Data Lgth</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getTxtColor <em>Txt Color</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getNLNDccp <em>NLN Dccp</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getSubpgID <em>Subpg ID</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getCCPID <em>CCPID</em>}</li>
 *   <li>{@link org.afplib.afplib.LND#getTriplets <em>Triplets</em>}</li>
 * </ul>
 *
 * @see org.afplib.afplib.AfplibPackage#getLND()
 * @model
 * @generated
 */
public interface LND extends SF {
	/**
     * Returns the value of the '<em><b>LND Flgs</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>LND Flgs</em>' attribute.
     * @see #setLNDFlgs(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_LNDFlgs()
     * @model required="true"
     * @generated
     */
	Integer getLNDFlgs();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getLNDFlgs <em>LND Flgs</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>LND Flgs</em>' attribute.
     * @see #getLNDFlgs()
     * @generated
     */
	void setLNDFlgs(Integer value);

	/**
     * Returns the value of the '<em><b>IPos</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>IPos</em>' attribute.
     * @see #setIPos(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_IPos()
     * @model required="true"
     * @generated
     */
	Integer getIPos();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getIPos <em>IPos</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>IPos</em>' attribute.
     * @see #getIPos()
     * @generated
     */
	void setIPos(Integer value);

	/**
     * Returns the value of the '<em><b>BPos</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>BPos</em>' attribute.
     * @see #setBPos(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_BPos()
     * @model required="true"
     * @generated
     */
	Integer getBPos();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getBPos <em>BPos</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>BPos</em>' attribute.
     * @see #getBPos()
     * @generated
     */
	void setBPos(Integer value);

	/**
     * Returns the value of the '<em><b>Txt Orent</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Txt Orent</em>' attribute.
     * @see #setTxtOrent(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_TxtOrent()
     * @model required="true"
     * @generated
     */
	Integer getTxtOrent();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getTxtOrent <em>Txt Orent</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txt Orent</em>' attribute.
     * @see #getTxtOrent()
     * @generated
     */
	void setTxtOrent(Integer value);

	/**
     * Returns the value of the '<em><b>Fnt LID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Fnt LID</em>' attribute.
     * @see #setFntLID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_FntLID()
     * @model required="true"
     * @generated
     */
	Integer getFntLID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getFntLID <em>Fnt LID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Fnt LID</em>' attribute.
     * @see #getFntLID()
     * @generated
     */
	void setFntLID(Integer value);

	/**
     * Returns the value of the '<em><b>Chnl Cde</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Chnl Cde</em>' attribute.
     * @see #setChnlCde(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_ChnlCde()
     * @model required="true"
     * @generated
     */
	Integer getChnlCde();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getChnlCde <em>Chnl Cde</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Chnl Cde</em>' attribute.
     * @see #getChnlCde()
     * @generated
     */
	void setChnlCde(Integer value);

	/**
     * Returns the value of the '<em><b>NLN Dskp</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>NLN Dskp</em>' attribute.
     * @see #setNLNDskp(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_NLNDskp()
     * @model required="true"
     * @generated
     */
	Integer getNLNDskp();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getNLNDskp <em>NLN Dskp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>NLN Dskp</em>' attribute.
     * @see #getNLNDskp()
     * @generated
     */
	void setNLNDskp(Integer value);

	/**
     * Returns the value of the '<em><b>NLN Dsp</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>NLN Dsp</em>' attribute.
     * @see #setNLNDsp(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_NLNDsp()
     * @model required="true"
     * @generated
     */
	Integer getNLNDsp();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getNLNDsp <em>NLN Dsp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>NLN Dsp</em>' attribute.
     * @see #getNLNDsp()
     * @generated
     */
	void setNLNDsp(Integer value);

	/**
     * Returns the value of the '<em><b>NLN Dreu</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>NLN Dreu</em>' attribute.
     * @see #setNLNDreu(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_NLNDreu()
     * @model required="true"
     * @generated
     */
	Integer getNLNDreu();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getNLNDreu <em>NLN Dreu</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>NLN Dreu</em>' attribute.
     * @see #getNLNDreu()
     * @generated
     */
	void setNLNDreu(Integer value);

	/**
     * Returns the value of the '<em><b>Sup Name</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Sup Name</em>' attribute.
     * @see #setSupName(String)
     * @see org.afplib.afplib.AfplibPackage#getLND_SupName()
     * @model dataType="org.afplib.base.ModcaString8" required="true"
     * @generated
     */
	String getSupName();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getSupName <em>Sup Name</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Sup Name</em>' attribute.
     * @see #getSupName()
     * @generated
     */
	void setSupName(String value);

	/**
     * Returns the value of the '<em><b>SO Lid</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>SO Lid</em>' attribute.
     * @see #setSOLid(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_SOLid()
     * @model required="true"
     * @generated
     */
	Integer getSOLid();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getSOLid <em>SO Lid</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>SO Lid</em>' attribute.
     * @see #getSOLid()
     * @generated
     */
	void setSOLid(Integer value);

	/**
     * Returns the value of the '<em><b>Data Strt</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Strt</em>' attribute.
     * @see #setDataStrt(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_DataStrt()
     * @model required="true"
     * @generated
     */
	Integer getDataStrt();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getDataStrt <em>Data Strt</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Strt</em>' attribute.
     * @see #getDataStrt()
     * @generated
     */
	void setDataStrt(Integer value);

	/**
     * Returns the value of the '<em><b>Data Lgth</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Data Lgth</em>' attribute.
     * @see #setDataLgth(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_DataLgth()
     * @model required="true"
     * @generated
     */
	Integer getDataLgth();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getDataLgth <em>Data Lgth</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Data Lgth</em>' attribute.
     * @see #getDataLgth()
     * @generated
     */
	void setDataLgth(Integer value);

	/**
     * Returns the value of the '<em><b>Txt Color</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Txt Color</em>' attribute.
     * @see #setTxtColor(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_TxtColor()
     * @model required="true"
     * @generated
     */
	Integer getTxtColor();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getTxtColor <em>Txt Color</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Txt Color</em>' attribute.
     * @see #getTxtColor()
     * @generated
     */
	void setTxtColor(Integer value);

	/**
     * Returns the value of the '<em><b>NLN Dccp</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>NLN Dccp</em>' attribute.
     * @see #setNLNDccp(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_NLNDccp()
     * @model required="true"
     * @generated
     */
	Integer getNLNDccp();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getNLNDccp <em>NLN Dccp</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>NLN Dccp</em>' attribute.
     * @see #getNLNDccp()
     * @generated
     */
	void setNLNDccp(Integer value);

	/**
     * Returns the value of the '<em><b>Subpg ID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Subpg ID</em>' attribute.
     * @see #setSubpgID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_SubpgID()
     * @model required="true"
     * @generated
     */
	Integer getSubpgID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getSubpgID <em>Subpg ID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>Subpg ID</em>' attribute.
     * @see #getSubpgID()
     * @generated
     */
	void setSubpgID(Integer value);

	/**
     * Returns the value of the '<em><b>CCPID</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>mandatory<br>fixed length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>CCPID</em>' attribute.
     * @see #setCCPID(Integer)
     * @see org.afplib.afplib.AfplibPackage#getLND_CCPID()
     * @model required="true"
     * @generated
     */
	Integer getCCPID();

	/**
     * Sets the value of the '{@link org.afplib.afplib.LND#getCCPID <em>CCPID</em>}' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the new value of the '<em>CCPID</em>' attribute.
     * @see #getCCPID()
     * @generated
     */
	void setCCPID(Integer value);

	/**
     * Returns the value of the '<em><b>Triplets</b></em>' containment reference list.
     * The list contents are of type {@link org.afplib.base.Triplet}.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * <!-- begin-model-doc -->
     * <p>optional<br>variable length</p>
     * <!-- end-model-doc -->
     * @return the value of the '<em>Triplets</em>' containment reference list.
     * @see org.afplib.afplib.AfplibPackage#getLND_Triplets()
     * @model containment="true" resolveProxies="true"
     * @generated
     */
	EList<Triplet> getTriplets();

} // LND
