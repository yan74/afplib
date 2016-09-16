/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>GSCDDIRECTION</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getGSCDDIRECTION()
 * @model
 * @generated
 */
public enum GSCDDIRECTION implements Enumerator {
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
	 * The '<em><b>Const Left2 Right</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_LEFT2_RIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_LEFT2_RIGHT(1, "ConstLeft2Right", "ConstLeft2Right"),

	/**
	 * The '<em><b>Const Top2 Bottom</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TOP2_BOTTOM_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TOP2_BOTTOM(2, "ConstTop2Bottom", "ConstTop2Bottom"),

	/**
	 * The '<em><b>Const Right2 Left</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RIGHT2_LEFT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RIGHT2_LEFT(3, "ConstRight2Left", "ConstRight2Left"),

	/**
	 * The '<em><b>Const Bottom2 Top</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BOTTOM2_TOP_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BOTTOM2_TOP(4, "ConstBottom2Top", "ConstBottom2Top");

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
	 * The '<em><b>Const Left2 Right</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Left2 Right</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_LEFT2_RIGHT
	 * @model name="ConstLeft2Right"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_LEFT2_RIGHT_VALUE = 1;

	/**
	 * The '<em><b>Const Top2 Bottom</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Top2 Bottom</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TOP2_BOTTOM
	 * @model name="ConstTop2Bottom"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TOP2_BOTTOM_VALUE = 2;

	/**
	 * The '<em><b>Const Right2 Left</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Right2 Left</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_RIGHT2_LEFT
	 * @model name="ConstRight2Left"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_RIGHT2_LEFT_VALUE = 3;

	/**
	 * The '<em><b>Const Bottom2 Top</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bottom2 Top</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BOTTOM2_TOP
	 * @model name="ConstBottom2Top"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BOTTOM2_TOP_VALUE = 4;

	/**
	 * An array of all the '<em><b>GSCDDIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final GSCDDIRECTION[] VALUES_ARRAY =
		new GSCDDIRECTION[] {
			CONST_DEFAULT,
			CONST_LEFT2_RIGHT,
			CONST_TOP2_BOTTOM,
			CONST_RIGHT2_LEFT,
			CONST_BOTTOM2_TOP,
		};

	/**
	 * A public read-only list of all the '<em><b>GSCDDIRECTION</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<GSCDDIRECTION> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>GSCDDIRECTION</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCDDIRECTION get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSCDDIRECTION result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSCDDIRECTION</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCDDIRECTION getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			GSCDDIRECTION result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>GSCDDIRECTION</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static GSCDDIRECTION get(int value) {
		switch (value) {
			case CONST_DEFAULT_VALUE: return CONST_DEFAULT;
			case CONST_LEFT2_RIGHT_VALUE: return CONST_LEFT2_RIGHT;
			case CONST_TOP2_BOTTOM_VALUE: return CONST_TOP2_BOTTOM;
			case CONST_RIGHT2_LEFT_VALUE: return CONST_RIGHT2_LEFT;
			case CONST_BOTTOM2_TOP_VALUE: return CONST_BOTTOM2_TOP;
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
	private GSCDDIRECTION(int value, String name, String literal) {
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
	
} //GSCDDIRECTION
