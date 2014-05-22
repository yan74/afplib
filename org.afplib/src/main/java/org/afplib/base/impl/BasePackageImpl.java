/**
 */
package org.afplib.base.impl;

import java.nio.charset.Charset;

import org.afplib.afplib.AfplibPackage;

import org.afplib.afplib.impl.AfplibPackageImpl;

import org.afplib.base.BaseFactory;
import org.afplib.base.BasePackage;
import org.afplib.base.SFGrouper;
import org.afplib.base.Triplet;

import org.afplib.base.util.BaseValidator;

import org.eclipse.emf.ecore.EAttribute;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EOperation;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecore.EValidator;

import org.eclipse.emf.ecore.impl.EPackageImpl;

/**
 * <!-- begin-user-doc -->
 * An implementation of the model <b>Package</b>.
 * <!-- end-user-doc -->
 * @generated
 */
public class BasePackageImpl extends EPackageImpl implements BasePackage {
	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass afpEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass unknsfEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass sfGrouperEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EClass tripletEClass = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modcaStringEDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modcaString4EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modcaString8EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType modcaString32EDataType = null;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private EDataType charsetEDataType = null;

	/**
	 * Creates an instance of the model <b>Package</b>, registered with
	 * {@link org.eclipse.emf.ecore.EPackage.Registry EPackage.Registry} by the package
	 * package URI value.
	 * <p>Note: the correct way to create the package is via the static
	 * factory method {@link #init init()}, which also performs
	 * initialization of the package, or returns the registered package,
	 * if one already exists.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see org.eclipse.emf.ecore.EPackage.Registry
	 * @see org.afplib.base.BasePackage#eNS_URI
	 * @see #init()
	 * @generated
	 */
	private BasePackageImpl() {
		super(eNS_URI, BaseFactory.eINSTANCE);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static boolean isInited = false;

	/**
	 * Creates, registers, and initializes the <b>Package</b> for this model, and for any others upon which it depends.
	 * 
	 * <p>This method is used to initialize {@link BasePackage#eINSTANCE} when that field is accessed.
	 * Clients should not invoke it directly. Instead, they should simply access that field to obtain the package.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #eNS_URI
	 * @see #createPackageContents()
	 * @see #initializePackageContents()
	 * @generated
	 */
	public static BasePackage init() {
		if (isInited) return (BasePackage)EPackage.Registry.INSTANCE.getEPackage(BasePackage.eNS_URI);

		// Obtain or create and register package
		BasePackageImpl theBasePackage = (BasePackageImpl)(EPackage.Registry.INSTANCE.get(eNS_URI) instanceof BasePackageImpl ? EPackage.Registry.INSTANCE.get(eNS_URI) : new BasePackageImpl());

		isInited = true;

		// Obtain or create and register interdependencies
		AfplibPackageImpl theAfplibPackage = (AfplibPackageImpl)(EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI) instanceof AfplibPackageImpl ? EPackage.Registry.INSTANCE.getEPackage(AfplibPackage.eNS_URI) : AfplibPackage.eINSTANCE);

		// Load packages
		theAfplibPackage.loadPackage();

		// Create package meta-data objects
		theBasePackage.createPackageContents();

		// Initialize created meta-data
		theBasePackage.initializePackageContents();

		// Fix loaded packages
		theAfplibPackage.fixPackageContents();

		// Register package validator
		EValidator.Registry.INSTANCE.put
			(theBasePackage, 
			 new EValidator.Descriptor() {
				 public EValidator getEValidator() {
					 return BaseValidator.INSTANCE;
				 }
			 });

		// Mark meta-data to indicate it can't be changed
		theBasePackage.freeze();

  
		// Update the registry and return the package
		EPackage.Registry.INSTANCE.put(BasePackage.eNS_URI, theBasePackage);
		return theBasePackage;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getAFP() {
		return afpEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getAFP_StructuredFields() {
		return (EReference)afpEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSF() {
		return sfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_Number() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_Offset() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_Id() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_Length() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EReference getSF_Children() {
		return (EReference)sfEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_RawData() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getSF_Charset() {
		return (EAttribute)sfEClass.getEStructuralFeatures().get(6);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getUNKNSF() {
		return unknsfEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getSFGrouper() {
		return sfGrouperEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EClass getTriplet() {
		return tripletEClass;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_Label() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(0);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_Charset() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(1);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_FileOffset() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(2);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_TripletLength() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(3);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_TripletId() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(4);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EAttribute getTriplet_TripletNumber() {
		return (EAttribute)tripletEClass.getEStructuralFeatures().get(5);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModcaString() {
		return modcaStringEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModcaString4() {
		return modcaString4EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModcaString8() {
		return modcaString8EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getModcaString32() {
		return modcaString32EDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public EDataType getCharset() {
		return charsetEDataType;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public BaseFactory getBaseFactory() {
		return (BaseFactory)getEFactoryInstance();
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isCreated = false;

	/**
	 * Creates the meta-model objects for the package.  This method is
	 * guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void createPackageContents() {
		if (isCreated) return;
		isCreated = true;

		// Create classes and their features
		afpEClass = createEClass(AFP);
		createEReference(afpEClass, AFP__STRUCTURED_FIELDS);

		sfEClass = createEClass(SF);
		createEAttribute(sfEClass, SF__NUMBER);
		createEAttribute(sfEClass, SF__OFFSET);
		createEAttribute(sfEClass, SF__ID);
		createEAttribute(sfEClass, SF__LENGTH);
		createEReference(sfEClass, SF__CHILDREN);
		createEAttribute(sfEClass, SF__RAW_DATA);
		createEAttribute(sfEClass, SF__CHARSET);

		unknsfEClass = createEClass(UNKNSF);

		sfGrouperEClass = createEClass(SF_GROUPER);

		tripletEClass = createEClass(TRIPLET);
		createEAttribute(tripletEClass, TRIPLET__LABEL);
		createEAttribute(tripletEClass, TRIPLET__CHARSET);
		createEAttribute(tripletEClass, TRIPLET__FILE_OFFSET);
		createEAttribute(tripletEClass, TRIPLET__TRIPLET_LENGTH);
		createEAttribute(tripletEClass, TRIPLET__TRIPLET_ID);
		createEAttribute(tripletEClass, TRIPLET__TRIPLET_NUMBER);

		// Create data types
		modcaStringEDataType = createEDataType(MODCA_STRING);
		modcaString4EDataType = createEDataType(MODCA_STRING4);
		modcaString8EDataType = createEDataType(MODCA_STRING8);
		modcaString32EDataType = createEDataType(MODCA_STRING32);
		charsetEDataType = createEDataType(CHARSET);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private boolean isInitialized = false;

	/**
	 * Complete the initialization of the package and its meta-model.  This
	 * method is guarded to have no affect on any invocation but its first.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public void initializePackageContents() {
		if (isInitialized) return;
		isInitialized = true;

		// Initialize package
		setName(eNAME);
		setNsPrefix(eNS_PREFIX);
		setNsURI(eNS_URI);

		// Create type parameters

		// Set bounds for type parameters

		// Add supertypes to classes
		unknsfEClass.getESuperTypes().add(this.getSF());
		sfGrouperEClass.getESuperTypes().add(this.getSF());

		// Initialize classes and features; add operations and parameters
		initEClass(afpEClass, org.afplib.base.AFP.class, "AFP", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEReference(getAFP_StructuredFields(), this.getSF(), null, "structuredFields", null, 0, -1, org.afplib.base.AFP.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		initEClass(sfEClass, org.afplib.base.SF.class, "SF", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getSF_Number(), ecorePackage.getELong(), "number", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSF_Offset(), ecorePackage.getELong(), "offset", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSF_Id(), ecorePackage.getEInt(), "id", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSF_Length(), ecorePackage.getEInt(), "length", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEReference(getSF_Children(), this.getSF(), null, "children", null, 0, -1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, IS_COMPOSITE, IS_RESOLVE_PROXIES, !IS_UNSETTABLE, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSF_RawData(), ecorePackage.getEByteArray(), "rawData", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getSF_Charset(), this.getCharset(), "charset", null, 0, 1, org.afplib.base.SF.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		addEOperation(sfEClass, ecorePackage.getEBoolean(), "isBegin", 0, 1, IS_UNIQUE, IS_ORDERED);

		addEOperation(sfEClass, ecorePackage.getEBoolean(), "isEnd", 0, 1, IS_UNIQUE, IS_ORDERED);

		EOperation op = addEOperation(sfEClass, ecorePackage.getEBoolean(), "isDefault", 0, 1, IS_UNIQUE, IS_ORDERED);
		addEParameter(op, ecorePackage.getEString(), "value", 0, 1, IS_UNIQUE, IS_ORDERED);

		initEClass(unknsfEClass, org.afplib.base.UNKNSF.class, "UNKNSF", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(sfGrouperEClass, SFGrouper.class, "SFGrouper", !IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);

		initEClass(tripletEClass, Triplet.class, "Triplet", IS_ABSTRACT, !IS_INTERFACE, IS_GENERATED_INSTANCE_CLASS);
		initEAttribute(getTriplet_Label(), ecorePackage.getEString(), "label", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplet_Charset(), this.getCharset(), "charset", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplet_FileOffset(), ecorePackage.getELong(), "fileOffset", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplet_TripletLength(), ecorePackage.getEInt(), "tripletLength", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplet_TripletId(), ecorePackage.getEInt(), "tripletId", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);
		initEAttribute(getTriplet_TripletNumber(), ecorePackage.getEInt(), "tripletNumber", null, 0, 1, Triplet.class, !IS_TRANSIENT, !IS_VOLATILE, IS_CHANGEABLE, !IS_UNSETTABLE, !IS_ID, IS_UNIQUE, !IS_DERIVED, IS_ORDERED);

		// Initialize data types
		initEDataType(modcaStringEDataType, String.class, "ModcaString", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modcaString4EDataType, String.class, "ModcaString4", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modcaString8EDataType, String.class, "ModcaString8", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(modcaString32EDataType, String.class, "ModcaString32", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);
		initEDataType(charsetEDataType, Charset.class, "Charset", IS_SERIALIZABLE, !IS_GENERATED_INSTANCE_CLASS);

		// Create resource
		createResource(eNS_URI);

		// Create annotations
		// http:///org/eclipse/emf/ecore/util/ExtendedMetaData
		createExtendedMetaDataAnnotations();
	}

	/**
	 * Initializes the annotations for <b>http:///org/eclipse/emf/ecore/util/ExtendedMetaData</b>.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void createExtendedMetaDataAnnotations() {
		String source = "http:///org/eclipse/emf/ecore/util/ExtendedMetaData";		
		addAnnotation
		  (modcaString4EDataType, 
		   source, 
		   new String[] {
			 "name", "ModcaString4",
			 "baseType", "java.lang.String",
			 "minLength", "4",
			 "maxLength", "4"
		   });		
		addAnnotation
		  (modcaString8EDataType, 
		   source, 
		   new String[] {
			 "name", "ModcaString8",
			 "baseType", "java.lang.String",
			 "minLength", "8",
			 "maxLength", "8"
		   });		
		addAnnotation
		  (modcaString32EDataType, 
		   source, 
		   new String[] {
			 "name", "ModcaString32",
			 "baseType", "java.lang.String",
			 "minLength", "32",
			 "maxLength", "32"
		   });
	}

} //BasePackageImpl
