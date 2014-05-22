/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Fully Qualified Name FQN Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFullyQualifiedNameFQNFormat()
 * @model
 * @generated
 */
public enum FullyQualifiedNameFQNFormat implements Enumerator {
	/**
	 * The '<em><b>Const Characterstring</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CHARACTERSTRING_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CHARACTERSTRING(0, "ConstCharacterstring", "ConstCharacterstring"),

	/**
	 * The '<em><b>Const OID</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OID_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OID(16, "ConstOID", "ConstOID"),

	/**
	 * The '<em><b>Const URL</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_URL_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_URL(32, "ConstURL", "ConstURL");

	/**
	 * The '<em><b>Const Characterstring</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Characterstring</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CHARACTERSTRING
	 * @model name="ConstCharacterstring"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CHARACTERSTRING_VALUE = 0;

	/**
	 * The '<em><b>Const OID</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const OID</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OID
	 * @model name="ConstOID"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OID_VALUE = 16;

	/**
	 * The '<em><b>Const URL</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const URL</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_URL
	 * @model name="ConstURL"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_URL_VALUE = 32;

	/**
	 * An array of all the '<em><b>Fully Qualified Name FQN Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FullyQualifiedNameFQNFormat[] VALUES_ARRAY =
		new FullyQualifiedNameFQNFormat[] {
			CONST_CHARACTERSTRING,
			CONST_OID,
			CONST_URL,
		};

	/**
	 * A public read-only list of all the '<em><b>Fully Qualified Name FQN Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FullyQualifiedNameFQNFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Fully Qualified Name FQN Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullyQualifiedNameFQNFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FullyQualifiedNameFQNFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fully Qualified Name FQN Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullyQualifiedNameFQNFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FullyQualifiedNameFQNFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Fully Qualified Name FQN Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FullyQualifiedNameFQNFormat get(int value) {
		switch (value) {
			case CONST_CHARACTERSTRING_VALUE: return CONST_CHARACTERSTRING;
			case CONST_OID_VALUE: return CONST_OID;
			case CONST_URL_VALUE: return CONST_URL;
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
	private FullyQualifiedNameFQNFormat(int value, String name, String literal) {
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
	
} //FullyQualifiedNameFQNFormat
