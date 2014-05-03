/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MODCA Interchange Set ISid</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMODCAInterchangeSetISid()
 * @model
 * @generated
 */
public enum MODCAInterchangeSetISid implements Enumerator {
	/**
	 * The '<em><b>Const IS1</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IS1_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IS1(2304, "ConstIS1", "ConstIS1"),

	/**
	 * The '<em><b>Const Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RETIRED(3072, "ConstRetired", "ConstRetired"),

	/**
	 * The '<em><b>Const IS3</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IS3_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IS3(3328, "ConstIS3", "ConstIS3");

	/**
	 * The '<em><b>Const IS1</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const IS1</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IS1
	 * @model name="ConstIS1"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IS1_VALUE = 2304;

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
	public static final int CONST_RETIRED_VALUE = 3072;

	/**
	 * The '<em><b>Const IS3</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const IS3</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IS3
	 * @model name="ConstIS3"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IS3_VALUE = 3328;

	/**
	 * An array of all the '<em><b>MODCA Interchange Set ISid</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final MODCAInterchangeSetISid[] VALUES_ARRAY =
		new MODCAInterchangeSetISid[] {
			CONST_IS1,
			CONST_RETIRED,
			CONST_IS3,
		};

	/**
	 * A public read-only list of all the '<em><b>MODCA Interchange Set ISid</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<MODCAInterchangeSetISid> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>MODCA Interchange Set ISid</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MODCAInterchangeSetISid get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MODCAInterchangeSetISid result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MODCA Interchange Set ISid</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MODCAInterchangeSetISid getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			MODCAInterchangeSetISid result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>MODCA Interchange Set ISid</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static MODCAInterchangeSetISid get(int value) {
		switch (value) {
			case CONST_IS1_VALUE: return CONST_IS1;
			case CONST_RETIRED_VALUE: return CONST_RETIRED;
			case CONST_IS3_VALUE: return CONST_IS3;
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
	private MODCAInterchangeSetISid(int value, String name, String literal) {
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
	
} //MODCAInterchangeSetISid
