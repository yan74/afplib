/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MFCMFC Scpe</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMFCMFCScpe()
 * @model
 * @generated
 */
public enum MFCMFCScpe implements Enumerator {
	/**
	 * The '<em><b>Const Print Level</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PRINT_LEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PRINT_LEVEL(1, "ConstPrintLevel", "ConstPrintLevel"),

	/**
	 * The '<em><b>Const Document Level All</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT_LEVEL_ALL_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOCUMENT_LEVEL_ALL(2, "ConstDocumentLevelAll", "ConstDocumentLevelAll"),

	/**
	 * The '<em><b>Const Document Level Selected</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT_LEVEL_SELECTED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DOCUMENT_LEVEL_SELECTED(3, "ConstDocumentLevelSelected", "ConstDocumentLevelSelected"),

	/**
	 * The '<em><b>Const Medium Leveleach</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIUM_LEVELEACH_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MEDIUM_LEVELEACH(4, "ConstMediumLeveleach", "ConstMediumLeveleach"),

	/**
	 * The '<em><b>Const Medium Levelcollection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIUM_LEVELCOLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MEDIUM_LEVELCOLLECTION(5, "ConstMediumLevelcollection", "ConstMediumLevelcollection"),

	/**
	 * The '<em><b>Const Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RETIRED(6, "ConstRetired", "ConstRetired");

	/**
	 * The '<em><b>Const Print Level</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Print Level</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PRINT_LEVEL
	 * @model name="ConstPrintLevel"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PRINT_LEVEL_VALUE = 1;

	/**
	 * The '<em><b>Const Document Level All</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Document Level All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT_LEVEL_ALL
	 * @model name="ConstDocumentLevelAll"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOCUMENT_LEVEL_ALL_VALUE = 2;

	/**
	 * The '<em><b>Const Document Level Selected</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Document Level Selected</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DOCUMENT_LEVEL_SELECTED
	 * @model name="ConstDocumentLevelSelected"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DOCUMENT_LEVEL_SELECTED_VALUE = 3;

	/**
	 * The '<em><b>Const Medium Leveleach</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Medium Leveleach</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIUM_LEVELEACH
	 * @model name="ConstMediumLeveleach"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MEDIUM_LEVELEACH_VALUE = 4;

	/**
	 * The '<em><b>Const Medium Levelcollection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Medium Levelcollection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIUM_LEVELCOLLECTION
	 * @model name="ConstMediumLevelcollection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MEDIUM_LEVELCOLLECTION_VALUE = 5;

	/**
	 * The '<em><b>Const Retired</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Retired</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RETIRED
	 * @model name="ConstRetired"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RETIRED_VALUE = 6;

	/**
	 * An array of all the '<em><b>MFCMFC Scpe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MFCMFCScpe[] VALUES_ARRAY =
		new MFCMFCScpe[] {
			CONST_PRINT_LEVEL,
			CONST_DOCUMENT_LEVEL_ALL,
			CONST_DOCUMENT_LEVEL_SELECTED,
			CONST_MEDIUM_LEVELEACH,
			CONST_MEDIUM_LEVELCOLLECTION,
			CONST_RETIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>MFCMFC Scpe</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MFCMFCScpe> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MFCMFC Scpe</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MFCMFCScpe get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMFCScpe result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFCMFC Scpe</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MFCMFCScpe getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMFCScpe result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFCMFC Scpe</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static MFCMFCScpe get(int value) {
		switch (value) {
			case CONST_PRINT_LEVEL_VALUE: return CONST_PRINT_LEVEL;
			case CONST_DOCUMENT_LEVEL_ALL_VALUE: return CONST_DOCUMENT_LEVEL_ALL;
			case CONST_DOCUMENT_LEVEL_SELECTED_VALUE: return CONST_DOCUMENT_LEVEL_SELECTED;
			case CONST_MEDIUM_LEVELEACH_VALUE: return CONST_MEDIUM_LEVELEACH;
			case CONST_MEDIUM_LEVELCOLLECTION_VALUE: return CONST_MEDIUM_LEVELCOLLECTION;
			case CONST_RETIRED_VALUE: return CONST_RETIRED;
		}
		return null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final int value;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String name;

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private final String literal;

	/**
	 * Only this class can construct instances.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private MFCMFCScpe(int value, String name, String literal) {
		this.value = value;
		this.name = name;
		this.literal = literal;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public int getValue() {
	  return value;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getName() {
	  return name;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public String getLiteral() {
	  return literal;
	}

	/**
	 * Returns the literal value of the enumerator, which is its string representation.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		return literal;
	}
	
} //MFCMFCScpe
