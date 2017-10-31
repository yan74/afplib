/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PGPRGP Gorient</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPGPRGPGorient()
 * @model
 * @generated
 */
public enum PGPRGPGorient implements Enumerator {
	/**
	 * The '<em><b>Const0degrees</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST0DEGREES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST0DEGREES(0, "Const0degrees", "Const0degrees"),

	/**
	 * The '<em><b>Const90degrees</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST90DEGREES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST90DEGREES(11520, "Const90degrees", "Const90degrees"),

	/**
	 * The '<em><b>Const180degrees</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST180DEGREES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST180DEGREES(23040, "Const180degrees", "Const180degrees"),

	/**
	 * The '<em><b>Const270degrees</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST270DEGREES_VALUE
	 * @generated
	 * @ordered
	 */
	CONST270DEGREES(34560, "Const270degrees", "Const270degrees");

	/**
	 * The '<em><b>Const0degrees</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const0degrees</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST0DEGREES
	 * @model name="Const0degrees"
	 * @generated
	 * @ordered
	 */
	public static final int CONST0DEGREES_VALUE = 0;

	/**
	 * The '<em><b>Const90degrees</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const90degrees</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST90DEGREES
	 * @model name="Const90degrees"
	 * @generated
	 * @ordered
	 */
	public static final int CONST90DEGREES_VALUE = 11520;

	/**
	 * The '<em><b>Const180degrees</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const180degrees</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST180DEGREES
	 * @model name="Const180degrees"
	 * @generated
	 * @ordered
	 */
	public static final int CONST180DEGREES_VALUE = 23040;

	/**
	 * The '<em><b>Const270degrees</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const270degrees</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST270DEGREES
	 * @model name="Const270degrees"
	 * @generated
	 * @ordered
	 */
	public static final int CONST270DEGREES_VALUE = 34560;

	/**
	 * An array of all the '<em><b>PGPRGP Gorient</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PGPRGPGorient[] VALUES_ARRAY =
		new PGPRGPGorient[] {
			CONST0DEGREES,
			CONST90DEGREES,
			CONST180DEGREES,
			CONST270DEGREES,
		};

	/**
	 * A public read-only list of all the '<em><b>PGPRGP Gorient</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PGPRGPGorient> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>PGPRGP Gorient</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PGPRGPGorient get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PGPRGPGorient result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PGPRGP Gorient</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PGPRGPGorient getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PGPRGPGorient result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>PGPRGP Gorient</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static PGPRGPGorient get(int value) {
		switch (value) {
			case CONST0DEGREES_VALUE: return CONST0DEGREES;
			case CONST90DEGREES_VALUE: return CONST90DEGREES;
			case CONST180DEGREES_VALUE: return CONST180DEGREES;
			case CONST270DEGREES_VALUE: return CONST270DEGREES;
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
	private PGPRGPGorient(int value, String name, String literal) {
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
	
} //PGPRGPGorient
