/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>SIADIRCTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getSIADIRCTION()
 * @model
 * @generated
 */
public enum SIADIRCTION implements Enumerator {
	/**
	 * The '<em><b>Const Positive Idirection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_POSITIVE_IDIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_POSITIVE_IDIRECTION(0, "ConstPositiveIdirection", "ConstPositiveIdirection"),

	/**
	 * The '<em><b>Const Negative Idirection</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NEGATIVE_IDIRECTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NEGATIVE_IDIRECTION(1, "ConstNegativeIdirection", "ConstNegativeIdirection");

	/**
	 * The '<em><b>Const Positive Idirection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Positive Idirection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_POSITIVE_IDIRECTION
	 * @model name="ConstPositiveIdirection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_POSITIVE_IDIRECTION_VALUE = 0;

	/**
	 * The '<em><b>Const Negative Idirection</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Negative Idirection</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NEGATIVE_IDIRECTION
	 * @model name="ConstNegativeIdirection"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NEGATIVE_IDIRECTION_VALUE = 1;

	/**
	 * An array of all the '<em><b>SIADIRCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final SIADIRCTION[] VALUES_ARRAY =
		new SIADIRCTION[] {
			CONST_POSITIVE_IDIRECTION,
			CONST_NEGATIVE_IDIRECTION,
		};

	/**
	 * A public read-only list of all the '<em><b>SIADIRCTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<SIADIRCTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>SIADIRCTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIADIRCTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SIADIRCTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SIADIRCTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIADIRCTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			SIADIRCTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>SIADIRCTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static SIADIRCTION get(int value) {
		switch (value) {
			case CONST_POSITIVE_IDIRECTION_VALUE: return CONST_POSITIVE_IDIRECTION;
			case CONST_NEGATIVE_IDIRECTION_VALUE: return CONST_NEGATIVE_IDIRECTION;
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
	private SIADIRCTION(int value, String name, String literal) {
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
	
} //SIADIRCTION
