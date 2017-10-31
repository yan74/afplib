/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNC Xft Units</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNCXftUnits()
 * @model
 * @generated
 */
public enum FNCXftUnits implements Enumerator {
	/**
	 * The '<em><b>Const240dpi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST240DPI_VALUE
	 * @generated
	 * @ordered
	 */
	CONST240DPI(2400, "Const240dpi", "Const240dpi"),

	/**
	 * The '<em><b>Const300dpi</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST300DPI_VALUE
	 * @generated
	 * @ordered
	 */
	CONST300DPI(3000, "Const300dpi", "Const300dpi"),

	/**
	 * The '<em><b>Const1000unitsperemrelative</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST1000UNITSPEREMRELATIVE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST1000UNITSPEREMRELATIVE(1000, "Const1000unitsperemrelative", "Const1000unitsperemrelative");

	/**
	 * The '<em><b>Const240dpi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const240dpi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST240DPI
	 * @model name="Const240dpi"
	 * @generated
	 * @ordered
	 */
	public static final int CONST240DPI_VALUE = 2400;

	/**
	 * The '<em><b>Const300dpi</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const300dpi</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST300DPI
	 * @model name="Const300dpi"
	 * @generated
	 * @ordered
	 */
	public static final int CONST300DPI_VALUE = 3000;

	/**
	 * The '<em><b>Const1000unitsperemrelative</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const1000unitsperemrelative</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST1000UNITSPEREMRELATIVE
	 * @model name="Const1000unitsperemrelative"
	 * @generated
	 * @ordered
	 */
	public static final int CONST1000UNITSPEREMRELATIVE_VALUE = 1000;

	/**
	 * An array of all the '<em><b>FNC Xft Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNCXftUnits[] VALUES_ARRAY =
		new FNCXftUnits[] {
			CONST240DPI,
			CONST300DPI,
			CONST1000UNITSPEREMRELATIVE,
		};

	/**
	 * A public read-only list of all the '<em><b>FNC Xft Units</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNCXftUnits> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNC Xft Units</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCXftUnits get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCXftUnits result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Xft Units</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCXftUnits getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNCXftUnits result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNC Xft Units</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static FNCXftUnits get(int value) {
		switch (value) {
			case CONST240DPI_VALUE: return CONST240DPI;
			case CONST300DPI_VALUE: return CONST300DPI;
			case CONST1000UNITSPEREMRELATIVE_VALUE: return CONST1000UNITSPEREMRELATIVE;
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
	private FNCXftUnits(int value, String name, String literal) {
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
	
} //FNCXftUnits
