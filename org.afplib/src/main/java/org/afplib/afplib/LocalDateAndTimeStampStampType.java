/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Local Date And Time Stamp Stamp Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getLocalDateAndTimeStampStampType()
 * @model
 * @generated
 */
public enum LocalDateAndTimeStampStampType implements Enumerator {
	/**
     * The '<em><b>Const Creation</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_CREATION_VALUE
     * @generated
     * @ordered
     */
	CONST_CREATION(0, "ConstCreation", "ConstCreation"),

	/**
     * The '<em><b>Const Retired</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RETIRED_VALUE
     * @generated
     * @ordered
     */
	CONST_RETIRED(1, "ConstRetired", "ConstRetired"),

	/**
     * The '<em><b>Const Revision</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_REVISION_VALUE
     * @generated
     * @ordered
     */
	CONST_REVISION(3, "ConstRevision", "ConstRevision");

	/**
     * The '<em><b>Const Creation</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Creation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_CREATION
     * @model name="ConstCreation"
     * @generated
     * @ordered
     */
	public static final int CONST_CREATION_VALUE = 0;

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
	public static final int CONST_RETIRED_VALUE = 1;

	/**
     * The '<em><b>Const Revision</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Revision</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_REVISION
     * @model name="ConstRevision"
     * @generated
     * @ordered
     */
	public static final int CONST_REVISION_VALUE = 3;

	/**
     * An array of all the '<em><b>Local Date And Time Stamp Stamp Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final LocalDateAndTimeStampStampType[] VALUES_ARRAY =
		new LocalDateAndTimeStampStampType[] {
            CONST_CREATION,
            CONST_RETIRED,
            CONST_REVISION,
        };

	/**
     * A public read-only list of all the '<em><b>Local Date And Time Stamp Stamp Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<LocalDateAndTimeStampStampType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Local Date And Time Stamp Stamp Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LocalDateAndTimeStampStampType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LocalDateAndTimeStampStampType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Local Date And Time Stamp Stamp Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LocalDateAndTimeStampStampType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            LocalDateAndTimeStampStampType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Local Date And Time Stamp Stamp Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static LocalDateAndTimeStampStampType get(int value) {
        switch (value) {
            case CONST_CREATION_VALUE: return CONST_CREATION;
            case CONST_RETIRED_VALUE: return CONST_RETIRED;
            case CONST_REVISION_VALUE: return CONST_REVISION;
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
	private LocalDateAndTimeStampStampType(int value, String name, String literal) {
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
	
} //LocalDateAndTimeStampStampType
