/**
 */
package org.afplib.base;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;

/**
 * <!-- begin-user-doc -->
 * The <b>Package</b> for the model.
 * It contains accessors for the meta objects to represent
 * <ul>
 *   <li>each class,</li>
 *   <li>each feature of each class,</li>
 *   <li>each enum,</li>
 *   <li>and each data type</li>
 * </ul>
 * <!-- end-user-doc -->
 * @see org.afplib.base.BaseFactory
 * @model kind="package"
 * @generated
 */
public interface BasePackage extends EPackage {
	/**
     * The package name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNAME = "base";

	/**
     * The package namespace URI.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_URI = "http://afplib.org/afplibbase";

	/**
     * The package namespace name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	String eNS_PREFIX = "base";

	/**
     * The singleton instance of the package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	BasePackage eINSTANCE = org.afplib.base.impl.BasePackageImpl.init();

	/**
     * The meta object id for the '{@link org.afplib.base.impl.AFPImpl <em>AFP</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.afplib.base.impl.AFPImpl
     * @see org.afplib.base.impl.BasePackageImpl#getAFP()
     * @generated
     */
	int AFP = 0;

	/**
     * The feature id for the '<em><b>Structured Fields</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AFP__STRUCTURED_FIELDS = 0;

	/**
     * The number of structural features of the '<em>AFP</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int AFP_FEATURE_COUNT = 1;

	/**
     * The meta object id for the '{@link org.afplib.base.impl.SFImpl <em>SF</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.afplib.base.impl.SFImpl
     * @see org.afplib.base.impl.BasePackageImpl#getSF()
     * @generated
     */
	int SF = 1;

	/**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__NUMBER = 0;

	/**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__OFFSET = 1;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__ID = 2;

	/**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__LENGTH = 3;

	/**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__CHILDREN = 4;

	/**
     * The feature id for the '<em><b>Raw Data</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__RAW_DATA = 5;

	/**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF__CHARSET = 6;

	/**
     * The number of structural features of the '<em>SF</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_FEATURE_COUNT = 7;

	/**
     * The meta object id for the '{@link org.afplib.base.impl.UNKNSFImpl <em>UNKNSF</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.afplib.base.impl.UNKNSFImpl
     * @see org.afplib.base.impl.BasePackageImpl#getUNKNSF()
     * @generated
     */
	int UNKNSF = 2;

	/**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__NUMBER = SF__NUMBER;

	/**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__OFFSET = SF__OFFSET;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__ID = SF__ID;

	/**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__LENGTH = SF__LENGTH;

	/**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__CHILDREN = SF__CHILDREN;

	/**
     * The feature id for the '<em><b>Raw Data</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__RAW_DATA = SF__RAW_DATA;

	/**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF__CHARSET = SF__CHARSET;

	/**
     * The number of structural features of the '<em>UNKNSF</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int UNKNSF_FEATURE_COUNT = SF_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.afplib.base.impl.SFGrouperImpl <em>SF Grouper</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.afplib.base.impl.SFGrouperImpl
     * @see org.afplib.base.impl.BasePackageImpl#getSFGrouper()
     * @generated
     */
	int SF_GROUPER = 3;

	/**
     * The feature id for the '<em><b>Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__NUMBER = SF__NUMBER;

	/**
     * The feature id for the '<em><b>Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__OFFSET = SF__OFFSET;

	/**
     * The feature id for the '<em><b>Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__ID = SF__ID;

	/**
     * The feature id for the '<em><b>Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__LENGTH = SF__LENGTH;

	/**
     * The feature id for the '<em><b>Children</b></em>' containment reference list.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__CHILDREN = SF__CHILDREN;

	/**
     * The feature id for the '<em><b>Raw Data</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__RAW_DATA = SF__RAW_DATA;

	/**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER__CHARSET = SF__CHARSET;

	/**
     * The number of structural features of the '<em>SF Grouper</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int SF_GROUPER_FEATURE_COUNT = SF_FEATURE_COUNT + 0;

	/**
     * The meta object id for the '{@link org.afplib.base.impl.TripletImpl <em>Triplet</em>}' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see org.afplib.base.impl.TripletImpl
     * @see org.afplib.base.impl.BasePackageImpl#getTriplet()
     * @generated
     */
	int TRIPLET = 4;

	/**
     * The feature id for the '<em><b>Label</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__LABEL = 0;

	/**
     * The feature id for the '<em><b>Charset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__CHARSET = 1;

	/**
     * The feature id for the '<em><b>File Offset</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__FILE_OFFSET = 2;

	/**
     * The feature id for the '<em><b>Triplet Length</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__TRIPLET_LENGTH = 3;

	/**
     * The feature id for the '<em><b>Triplet Id</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__TRIPLET_ID = 4;

	/**
     * The feature id for the '<em><b>Triplet Number</b></em>' attribute.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET__TRIPLET_NUMBER = 5;

	/**
     * The number of structural features of the '<em>Triplet</em>' class.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     * @ordered
     */
	int TRIPLET_FEATURE_COUNT = 6;

	/**
     * The meta object id for the '<em>Modca String</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.afplib.base.impl.BasePackageImpl#getModcaString()
     * @generated
     */
	int MODCA_STRING = 5;

	/**
     * The meta object id for the '<em>Modca String4</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.afplib.base.impl.BasePackageImpl#getModcaString4()
     * @generated
     */
	int MODCA_STRING4 = 6;

	/**
     * The meta object id for the '<em>Modca String8</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.afplib.base.impl.BasePackageImpl#getModcaString8()
     * @generated
     */
	int MODCA_STRING8 = 7;

	/**
     * The meta object id for the '<em>Modca String32</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.lang.String
     * @see org.afplib.base.impl.BasePackageImpl#getModcaString32()
     * @generated
     */
	int MODCA_STRING32 = 8;

	/**
     * The meta object id for the '<em>Charset</em>' data type.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see java.nio.charset.Charset
     * @see org.afplib.base.impl.BasePackageImpl#getCharset()
     * @generated
     */
	int CHARSET = 9;


	/**
     * Returns the meta object for class '{@link org.afplib.base.AFP <em>AFP</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>AFP</em>'.
     * @see org.afplib.base.AFP
     * @generated
     */
	EClass getAFP();

	/**
     * Returns the meta object for the containment reference list '{@link org.afplib.base.AFP#getStructuredFields <em>Structured Fields</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Structured Fields</em>'.
     * @see org.afplib.base.AFP#getStructuredFields()
     * @see #getAFP()
     * @generated
     */
	EReference getAFP_StructuredFields();

	/**
     * Returns the meta object for class '{@link org.afplib.base.SF <em>SF</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SF</em>'.
     * @see org.afplib.base.SF
     * @generated
     */
	EClass getSF();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getNumber <em>Number</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Number</em>'.
     * @see org.afplib.base.SF#getNumber()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_Number();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getOffset <em>Offset</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Offset</em>'.
     * @see org.afplib.base.SF#getOffset()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_Offset();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getId <em>Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Id</em>'.
     * @see org.afplib.base.SF#getId()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_Id();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getLength <em>Length</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Length</em>'.
     * @see org.afplib.base.SF#getLength()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_Length();

	/**
     * Returns the meta object for the containment reference list '{@link org.afplib.base.SF#getChildren <em>Children</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the containment reference list '<em>Children</em>'.
     * @see org.afplib.base.SF#getChildren()
     * @see #getSF()
     * @generated
     */
	EReference getSF_Children();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getRawData <em>Raw Data</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Raw Data</em>'.
     * @see org.afplib.base.SF#getRawData()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_RawData();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.SF#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.afplib.base.SF#getCharset()
     * @see #getSF()
     * @generated
     */
	EAttribute getSF_Charset();

	/**
     * Returns the meta object for class '{@link org.afplib.base.UNKNSF <em>UNKNSF</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>UNKNSF</em>'.
     * @see org.afplib.base.UNKNSF
     * @generated
     */
	EClass getUNKNSF();

	/**
     * Returns the meta object for class '{@link org.afplib.base.SFGrouper <em>SF Grouper</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>SF Grouper</em>'.
     * @see org.afplib.base.SFGrouper
     * @generated
     */
	EClass getSFGrouper();

	/**
     * Returns the meta object for class '{@link org.afplib.base.Triplet <em>Triplet</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for class '<em>Triplet</em>'.
     * @see org.afplib.base.Triplet
     * @generated
     */
	EClass getTriplet();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getLabel <em>Label</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Label</em>'.
     * @see org.afplib.base.Triplet#getLabel()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_Label();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getCharset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Charset</em>'.
     * @see org.afplib.base.Triplet#getCharset()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_Charset();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getFileOffset <em>File Offset</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>File Offset</em>'.
     * @see org.afplib.base.Triplet#getFileOffset()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_FileOffset();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getTripletLength <em>Triplet Length</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triplet Length</em>'.
     * @see org.afplib.base.Triplet#getTripletLength()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_TripletLength();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getTripletId <em>Triplet Id</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triplet Id</em>'.
     * @see org.afplib.base.Triplet#getTripletId()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_TripletId();

	/**
     * Returns the meta object for the attribute '{@link org.afplib.base.Triplet#getTripletNumber <em>Triplet Number</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for the attribute '<em>Triplet Number</em>'.
     * @see org.afplib.base.Triplet#getTripletNumber()
     * @see #getTriplet()
     * @generated
     */
	EAttribute getTriplet_TripletNumber();

	/**
     * Returns the meta object for data type '{@link java.lang.String <em>Modca String</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modca String</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     * @generated
     */
	EDataType getModcaString();

	/**
     * Returns the meta object for data type '{@link java.lang.String <em>Modca String4</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modca String4</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='ModcaString4' baseType='java.lang.String' minLength='4' maxLength='4'"
     * @generated
     */
	EDataType getModcaString4();

	/**
     * Returns the meta object for data type '{@link java.lang.String <em>Modca String8</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modca String8</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='ModcaString8' baseType='java.lang.String' minLength='8' maxLength='8'"
     * @generated
     */
	EDataType getModcaString8();

	/**
     * Returns the meta object for data type '{@link java.lang.String <em>Modca String32</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Modca String32</em>'.
     * @see java.lang.String
     * @model instanceClass="java.lang.String"
     *        extendedMetaData="name='ModcaString32' baseType='java.lang.String' minLength='32' maxLength='32'"
     * @generated
     */
	EDataType getModcaString32();

	/**
     * Returns the meta object for data type '{@link java.nio.charset.Charset <em>Charset</em>}'.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the meta object for data type '<em>Charset</em>'.
     * @see java.nio.charset.Charset
     * @model instanceClass="java.nio.charset.Charset"
     * @generated
     */
	EDataType getCharset();

	/**
     * Returns the factory that creates the instances of the model.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @return the factory that creates the instances of the model.
     * @generated
     */
	BaseFactory getBaseFactory();

	/**
     * <!-- begin-user-doc -->
	 * Defines literals for the meta objects that represent
	 * <ul>
	 *   <li>each class,</li>
	 *   <li>each feature of each class,</li>
	 *   <li>each enum,</li>
	 *   <li>and each data type</li>
	 * </ul>
	 * <!-- end-user-doc -->
     * @generated
     */
	interface Literals {
		/**
         * The meta object literal for the '{@link org.afplib.base.impl.AFPImpl <em>AFP</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.afplib.base.impl.AFPImpl
         * @see org.afplib.base.impl.BasePackageImpl#getAFP()
         * @generated
         */
		EClass AFP = eINSTANCE.getAFP();

		/**
         * The meta object literal for the '<em><b>Structured Fields</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference AFP__STRUCTURED_FIELDS = eINSTANCE.getAFP_StructuredFields();

		/**
         * The meta object literal for the '{@link org.afplib.base.impl.SFImpl <em>SF</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.afplib.base.impl.SFImpl
         * @see org.afplib.base.impl.BasePackageImpl#getSF()
         * @generated
         */
		EClass SF = eINSTANCE.getSF();

		/**
         * The meta object literal for the '<em><b>Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__NUMBER = eINSTANCE.getSF_Number();

		/**
         * The meta object literal for the '<em><b>Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__OFFSET = eINSTANCE.getSF_Offset();

		/**
         * The meta object literal for the '<em><b>Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__ID = eINSTANCE.getSF_Id();

		/**
         * The meta object literal for the '<em><b>Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__LENGTH = eINSTANCE.getSF_Length();

		/**
         * The meta object literal for the '<em><b>Children</b></em>' containment reference list feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EReference SF__CHILDREN = eINSTANCE.getSF_Children();

		/**
         * The meta object literal for the '<em><b>Raw Data</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__RAW_DATA = eINSTANCE.getSF_RawData();

		/**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute SF__CHARSET = eINSTANCE.getSF_Charset();

		/**
         * The meta object literal for the '{@link org.afplib.base.impl.UNKNSFImpl <em>UNKNSF</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.afplib.base.impl.UNKNSFImpl
         * @see org.afplib.base.impl.BasePackageImpl#getUNKNSF()
         * @generated
         */
		EClass UNKNSF = eINSTANCE.getUNKNSF();

		/**
         * The meta object literal for the '{@link org.afplib.base.impl.SFGrouperImpl <em>SF Grouper</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.afplib.base.impl.SFGrouperImpl
         * @see org.afplib.base.impl.BasePackageImpl#getSFGrouper()
         * @generated
         */
		EClass SF_GROUPER = eINSTANCE.getSFGrouper();

		/**
         * The meta object literal for the '{@link org.afplib.base.impl.TripletImpl <em>Triplet</em>}' class.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see org.afplib.base.impl.TripletImpl
         * @see org.afplib.base.impl.BasePackageImpl#getTriplet()
         * @generated
         */
		EClass TRIPLET = eINSTANCE.getTriplet();

		/**
         * The meta object literal for the '<em><b>Label</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__LABEL = eINSTANCE.getTriplet_Label();

		/**
         * The meta object literal for the '<em><b>Charset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__CHARSET = eINSTANCE.getTriplet_Charset();

		/**
         * The meta object literal for the '<em><b>File Offset</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__FILE_OFFSET = eINSTANCE.getTriplet_FileOffset();

		/**
         * The meta object literal for the '<em><b>Triplet Length</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__TRIPLET_LENGTH = eINSTANCE.getTriplet_TripletLength();

		/**
         * The meta object literal for the '<em><b>Triplet Id</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__TRIPLET_ID = eINSTANCE.getTriplet_TripletId();

		/**
         * The meta object literal for the '<em><b>Triplet Number</b></em>' attribute feature.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @generated
         */
		EAttribute TRIPLET__TRIPLET_NUMBER = eINSTANCE.getTriplet_TripletNumber();

		/**
         * The meta object literal for the '<em>Modca String</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.afplib.base.impl.BasePackageImpl#getModcaString()
         * @generated
         */
		EDataType MODCA_STRING = eINSTANCE.getModcaString();

		/**
         * The meta object literal for the '<em>Modca String4</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.afplib.base.impl.BasePackageImpl#getModcaString4()
         * @generated
         */
		EDataType MODCA_STRING4 = eINSTANCE.getModcaString4();

		/**
         * The meta object literal for the '<em>Modca String8</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.afplib.base.impl.BasePackageImpl#getModcaString8()
         * @generated
         */
		EDataType MODCA_STRING8 = eINSTANCE.getModcaString8();

		/**
         * The meta object literal for the '<em>Modca String32</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.lang.String
         * @see org.afplib.base.impl.BasePackageImpl#getModcaString32()
         * @generated
         */
		EDataType MODCA_STRING32 = eINSTANCE.getModcaString32();

		/**
         * The meta object literal for the '<em>Charset</em>' data type.
         * <!-- begin-user-doc -->
		 * <!-- end-user-doc -->
         * @see java.nio.charset.Charset
         * @see org.afplib.base.impl.BasePackageImpl#getCharset()
         * @generated
         */
		EDataType CHARSET = eINSTANCE.getCharset();

	}

} //BasePackage
