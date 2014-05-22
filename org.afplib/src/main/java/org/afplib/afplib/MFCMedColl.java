/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MFC Med Coll</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMFCMedColl()
 * @model
 * @generated
 */
public enum MFCMedColl implements Enumerator {
	/**
	 * The '<em><b>Const Nosheetcollection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NOSHEETCOLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NOSHEETCOLLECTION(0, "ConstNosheetcollection", "ConstNosheetcollection"),

	/**
	 * The '<em><b>Const Beginsheetcollection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BEGINSHEETCOLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BEGINSHEETCOLLECTION(1, "ConstBeginsheetcollection", "ConstBeginsheetcollection"),

	/**
	 * The '<em><b>Const Continuesheetcollection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CONTINUESHEETCOLLECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CONTINUESHEETCOLLECTION(0, "ConstContinuesheetcollection", "ConstContinuesheetcollection");

	/**
	 * The '<em><b>Const Nosheetcollection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Nosheetcollection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NOSHEETCOLLECTION
	 * @model name="ConstNosheetcollection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NOSHEETCOLLECTION_VALUE = 0;

	/**
	 * The '<em><b>Const Beginsheetcollection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Beginsheetcollection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BEGINSHEETCOLLECTION
	 * @model name="ConstBeginsheetcollection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BEGINSHEETCOLLECTION_VALUE = 1;

	/**
	 * The '<em><b>Const Continuesheetcollection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Continuesheetcollection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CONTINUESHEETCOLLECTION
	 * @model name="ConstContinuesheetcollection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CONTINUESHEETCOLLECTION_VALUE = 0;

	/**
	 * An array of all the '<em><b>MFC Med Coll</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MFCMedColl[] VALUES_ARRAY =
		new MFCMedColl[] {
			CONST_NOSHEETCOLLECTION,
			CONST_BEGINSHEETCOLLECTION,
			CONST_CONTINUESHEETCOLLECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>MFC Med Coll</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MFCMedColl> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MFC Med Coll</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMedColl get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMedColl result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFC Med Coll</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMedColl getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MFCMedColl result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MFC Med Coll</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MFCMedColl get(int value) {
		switch (value) {
			case CONST_NOSHEETCOLLECTION_VALUE: return CONST_NOSHEETCOLLECTION;
			case CONST_BEGINSHEETCOLLECTION_VALUE: return CONST_BEGINSHEETCOLLECTION;
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
	private MFCMedColl(int value, String name, String literal) {
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
	
} //MFCMedColl
