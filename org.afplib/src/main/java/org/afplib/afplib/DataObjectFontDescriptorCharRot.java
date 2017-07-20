/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Data Object Font Descriptor Char Rot</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getDataObjectFontDescriptorCharRot()
 * @model
 * @generated
 */
public enum DataObjectFontDescriptorCharRot implements Enumerator {
	/**
     * The '<em><b>Const0</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST0_VALUE
     * @generated
     * @ordered
     */
	CONST0(0, "Const0", "Const0"),

	/**
     * The '<em><b>Const90</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST90_VALUE
     * @generated
     * @ordered
     */
	CONST90(11520, "Const90", "Const90"),

	/**
     * The '<em><b>Const180</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST180_VALUE
     * @generated
     * @ordered
     */
	CONST180(23040, "Const180", "Const180"),

	/**
     * The '<em><b>Const270</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST270_VALUE
     * @generated
     * @ordered
     */
	CONST270(34560, "Const270", "Const270");

	/**
     * The '<em><b>Const0</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const0</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST0
     * @model name="Const0"
     * @generated
     * @ordered
     */
	public static final int CONST0_VALUE = 0;

	/**
     * The '<em><b>Const90</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const90</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST90
     * @model name="Const90"
     * @generated
     * @ordered
     */
	public static final int CONST90_VALUE = 11520;

	/**
     * The '<em><b>Const180</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const180</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST180
     * @model name="Const180"
     * @generated
     * @ordered
     */
	public static final int CONST180_VALUE = 23040;

	/**
     * The '<em><b>Const270</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const270</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST270
     * @model name="Const270"
     * @generated
     * @ordered
     */
	public static final int CONST270_VALUE = 34560;

	/**
     * An array of all the '<em><b>Data Object Font Descriptor Char Rot</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final DataObjectFontDescriptorCharRot[] VALUES_ARRAY =
		new DataObjectFontDescriptorCharRot[] {
            CONST0,
            CONST90,
            CONST180,
            CONST270,
        };

	/**
     * A public read-only list of all the '<em><b>Data Object Font Descriptor Char Rot</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<DataObjectFontDescriptorCharRot> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Data Object Font Descriptor Char Rot</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static DataObjectFontDescriptorCharRot get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DataObjectFontDescriptorCharRot result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Data Object Font Descriptor Char Rot</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static DataObjectFontDescriptorCharRot getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            DataObjectFontDescriptorCharRot result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Data Object Font Descriptor Char Rot</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static DataObjectFontDescriptorCharRot get(int value) {
        switch (value) {
            case CONST0_VALUE: return CONST0;
            case CONST90_VALUE: return CONST90;
            case CONST180_VALUE: return CONST180;
            case CONST270_VALUE: return CONST270;
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
	private DataObjectFontDescriptorCharRot(int value, String name, String literal) {
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
	
} //DataObjectFontDescriptorCharRot
