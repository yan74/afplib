/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>PPORG Proc Flgs</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPPORGProcFlgs()
 * @model
 * @generated
 */
public enum PPORGProcFlgs implements Enumerator {
	/**
     * The '<em><b>Degree0</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEGREE0_VALUE
     * @generated
     * @ordered
     */
	DEGREE0(128, "Degree0", "Degree0"),

	/**
     * The '<em><b>Degree90</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEGREE90_VALUE
     * @generated
     * @ordered
     */
	DEGREE90(64, "Degree90", "Degree90"),

	/**
     * The '<em><b>Degree180</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEGREE180_VALUE
     * @generated
     * @ordered
     */
	DEGREE180(32, "Degree180", "Degree180"),

	/**
     * The '<em><b>Degree270</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #DEGREE270_VALUE
     * @generated
     * @ordered
     */
	DEGREE270(16, "Degree270", "Degree270"),

	/**
     * The '<em><b>Preprocess All</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #PREPROCESS_ALL_VALUE
     * @generated
     * @ordered
     */
	PREPROCESS_ALL(8, "PreprocessAll", "PreprocessAll");

	/**
     * The '<em><b>Degree0</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degree0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEGREE0
     * @model name="Degree0"
     * @generated
     * @ordered
     */
	public static final int DEGREE0_VALUE = 128;

	/**
     * The '<em><b>Degree90</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degree90</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEGREE90
     * @model name="Degree90"
     * @generated
     * @ordered
     */
	public static final int DEGREE90_VALUE = 64;

	/**
     * The '<em><b>Degree180</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degree180</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEGREE180
     * @model name="Degree180"
     * @generated
     * @ordered
     */
	public static final int DEGREE180_VALUE = 32;

	/**
     * The '<em><b>Degree270</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Degree270</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #DEGREE270
     * @model name="Degree270"
     * @generated
     * @ordered
     */
	public static final int DEGREE270_VALUE = 16;

	/**
     * The '<em><b>Preprocess All</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Preprocess All</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #PREPROCESS_ALL
     * @model name="PreprocessAll"
     * @generated
     * @ordered
     */
	public static final int PREPROCESS_ALL_VALUE = 8;

	/**
     * An array of all the '<em><b>PPORG Proc Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final PPORGProcFlgs[] VALUES_ARRAY =
		new PPORGProcFlgs[] {
            DEGREE0,
            DEGREE90,
            DEGREE180,
            DEGREE270,
            PREPROCESS_ALL,
        };

	/**
     * A public read-only list of all the '<em><b>PPORG Proc Flgs</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<PPORGProcFlgs> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>PPORG Proc Flgs</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PPORGProcFlgs get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PPORGProcFlgs result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>PPORG Proc Flgs</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PPORGProcFlgs getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            PPORGProcFlgs result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>PPORG Proc Flgs</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static PPORGProcFlgs get(int value) {
        switch (value) {
            case DEGREE0_VALUE: return DEGREE0;
            case DEGREE90_VALUE: return DEGREE90;
            case DEGREE180_VALUE: return DEGREE180;
            case DEGREE270_VALUE: return DEGREE270;
            case PREPROCESS_ALL_VALUE: return PREPROCESS_ALL;
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
	private PPORGProcFlgs(int value, String name, String literal) {
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
	
} //PPORGProcFlgs
