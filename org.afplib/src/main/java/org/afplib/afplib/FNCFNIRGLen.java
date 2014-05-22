/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNCFNIRG Len</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCFNIRGLen()
 * @model
 * @generated
 */
public enum FNCFNIRGLen implements Enumerator {
	/**
	 * The '<em><b>Const FNI Size10</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FNI_SIZE10_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FNI_SIZE10(10, "ConstFNISize10", "ConstFNISize10"),

	/**
	 * The '<em><b>Const FNI Size28</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FNI_SIZE28_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FNI_SIZE28(28, "ConstFNISize28", "ConstFNISize28");

	/**
	 * The '<em><b>Const FNI Size10</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const FNI Size10</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FNI_SIZE10
	 * @model name="ConstFNISize10"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FNI_SIZE10_VALUE = 10;

	/**
	 * The '<em><b>Const FNI Size28</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const FNI Size28</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FNI_SIZE28
	 * @model name="ConstFNISize28"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FNI_SIZE28_VALUE = 28;

	/**
	 * An array of all the '<em><b>FNCFNIRG Len</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCFNIRGLen[] VALUES_ARRAY =
		new FNCFNIRGLen[] {
			CONST_FNI_SIZE10,
			CONST_FNI_SIZE28,
		};

	/**
	 * A public read-only list of all the '<em><b>FNCFNIRG Len</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCFNIRGLen> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNCFNIRG Len</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCFNIRGLen get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCFNIRGLen result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNCFNIRG Len</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCFNIRGLen getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCFNIRGLen result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNCFNIRG Len</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNCFNIRGLen get(int value) {
		switch (value) {
			case CONST_FNI_SIZE10_VALUE: return CONST_FNI_SIZE10;
			case CONST_FNI_SIZE28_VALUE: return CONST_FNI_SIZE28;
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
	private FNCFNIRGLen(int value, String name, String literal) {
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
	
} //FNCFNIRGLen
