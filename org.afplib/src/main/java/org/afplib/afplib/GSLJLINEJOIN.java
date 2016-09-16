/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSLJLINEJOIN</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGSLJLINEJOIN()
 * @model
 * @generated
 */
public enum GSLJLINEJOIN implements Enumerator {
	/**
	 * The '<em><b>Const Default</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_DEFAULT(0, "ConstDefault", "ConstDefault"),

	/**
	 * The '<em><b>Const Bevel</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BEVEL_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BEVEL(1, "ConstBevel", "ConstBevel"),

	/**
	 * The '<em><b>Const Round</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ROUND_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ROUND(2, "ConstRound", "ConstRound"),

	/**
	 * The '<em><b>Const Miter</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MITER_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MITER(3, "ConstMiter", "ConstMiter");

	/**
	 * The '<em><b>Const Default</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Default</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_DEFAULT
	 * @model name="ConstDefault"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_DEFAULT_VALUE = 0;

	/**
	 * The '<em><b>Const Bevel</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bevel</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BEVEL
	 * @model name="ConstBevel"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BEVEL_VALUE = 1;

	/**
	 * The '<em><b>Const Round</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Round</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ROUND
	 * @model name="ConstRound"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ROUND_VALUE = 2;

	/**
	 * The '<em><b>Const Miter</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Miter</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MITER
	 * @model name="ConstMiter"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MITER_VALUE = 3;

	/**
	 * An array of all the '<em><b>GSLJLINEJOIN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSLJLINEJOIN[] VALUES_ARRAY =
		new GSLJLINEJOIN[] {
			CONST_DEFAULT,
			CONST_BEVEL,
			CONST_ROUND,
			CONST_MITER,
		};

	/**
	 * A public read-only list of all the '<em><b>GSLJLINEJOIN</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSLJLINEJOIN> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSLJLINEJOIN</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLJLINEJOIN get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSLJLINEJOIN result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSLJLINEJOIN</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLJLINEJOIN getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSLJLINEJOIN result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSLJLINEJOIN</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSLJLINEJOIN get(int value) {
		switch (value) {
			case CONST_DEFAULT_VALUE: return CONST_DEFAULT;
			case CONST_BEVEL_VALUE: return CONST_BEVEL;
			case CONST_ROUND_VALUE: return CONST_ROUND;
			case CONST_MITER_VALUE: return CONST_MITER;
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
	private GSLJLINEJOIN(int value, String name, String literal) {
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
	
} //GSLJLINEJOIN
