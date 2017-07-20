/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Line Data Object Position Migration Temp Orient</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getLineDataObjectPositionMigrationTempOrient()
 * @model
 * @generated
 */
public enum LineDataObjectPositionMigrationTempOrient implements Enumerator {
	/**
     * The '<em><b>Const0degree</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST0DEGREE_VALUE
     * @generated
     * @ordered
     */
	CONST0DEGREE(0, "Const0degree", "Const0degree"),

	/**
     * The '<em><b>Const270degree</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST270DEGREE_VALUE
     * @generated
     * @ordered
     */
	CONST270DEGREE(1, "Const270degree", "Const270degree"),

	/**
     * The '<em><b>Const180degree</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST180DEGREE_VALUE
     * @generated
     * @ordered
     */
	CONST180DEGREE(2, "Const180degree", "Const180degree"),

	/**
     * The '<em><b>Const90degree</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST90DEGREE_VALUE
     * @generated
     * @ordered
     */
	CONST90DEGREE(3, "Const90degree", "Const90degree");

	/**
     * The '<em><b>Const0degree</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const0degree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST0DEGREE
     * @model name="Const0degree"
     * @generated
     * @ordered
     */
	public static final int CONST0DEGREE_VALUE = 0;

	/**
     * The '<em><b>Const270degree</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const270degree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST270DEGREE
     * @model name="Const270degree"
     * @generated
     * @ordered
     */
	public static final int CONST270DEGREE_VALUE = 1;

	/**
     * The '<em><b>Const180degree</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const180degree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST180DEGREE
     * @model name="Const180degree"
     * @generated
     * @ordered
     */
	public static final int CONST180DEGREE_VALUE = 2;

	/**
     * The '<em><b>Const90degree</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const90degree</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST90DEGREE
     * @model name="Const90degree"
     * @generated
     * @ordered
     */
	public static final int CONST90DEGREE_VALUE = 3;

	/**
     * An array of all the '<em><b>Line Data Object Position Migration Temp Orient</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final LineDataObjectPositionMigrationTempOrient[] VALUES_ARRAY =
		new LineDataObjectPositionMigrationTempOrient[] {
            CONST0DEGREE,
            CONST270DEGREE,
            CONST180DEGREE,
            CONST90DEGREE,
        };

	/**
     * A public read-only list of all the '<em><b>Line Data Object Position Migration Temp Orient</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<LineDataObjectPositionMigrationTempOrient> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Line Data Object Position Migration Temp Orient</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LineDataObjectPositionMigrationTempOrient get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LineDataObjectPositionMigrationTempOrient result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Line Data Object Position Migration Temp Orient</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LineDataObjectPositionMigrationTempOrient getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LineDataObjectPositionMigrationTempOrient result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Line Data Object Position Migration Temp Orient</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LineDataObjectPositionMigrationTempOrient get(int value) {
        switch (value) {
            case CONST0DEGREE_VALUE: return CONST0DEGREE;
            case CONST270DEGREE_VALUE: return CONST270DEGREE;
            case CONST180DEGREE_VALUE: return CONST180DEGREE;
            case CONST90DEGREE_VALUE: return CONST90DEGREE;
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
	private LineDataObjectPositionMigrationTempOrient(int value, String name, String literal) {
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
	
} //LineDataObjectPositionMigrationTempOrient
