/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Object Include Obj Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getResourceObjectIncludeObjType()
 * @model
 * @generated
 */
public enum ResourceObjectIncludeObjType implements Enumerator {
	/**
     * The '<em><b>Const Overlay</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_OVERLAY_VALUE
     * @generated
     * @ordered
     */
	CONST_OVERLAY(223, "ConstOverlay", "ConstOverlay"),

	/**
     * The '<em><b>Const Retired</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_RETIRED_VALUE
     * @generated
     * @ordered
     */
	CONST_RETIRED(95, "ConstRetired", "ConstRetired");

	/**
     * The '<em><b>Const Overlay</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Overlay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_OVERLAY
     * @model name="ConstOverlay"
     * @generated
     * @ordered
     */
	public static final int CONST_OVERLAY_VALUE = 223;

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
	public static final int CONST_RETIRED_VALUE = 95;

	/**
     * An array of all the '<em><b>Resource Object Include Obj Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ResourceObjectIncludeObjType[] VALUES_ARRAY =
		new ResourceObjectIncludeObjType[] {
            CONST_OVERLAY,
            CONST_RETIRED,
        };

	/**
     * A public read-only list of all the '<em><b>Resource Object Include Obj Type</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ResourceObjectIncludeObjType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Resource Object Include Obj Type</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourceObjectIncludeObjType get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResourceObjectIncludeObjType result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resource Object Include Obj Type</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourceObjectIncludeObjType getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ResourceObjectIncludeObjType result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Resource Object Include Obj Type</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ResourceObjectIncludeObjType get(int value) {
        switch (value) {
            case CONST_OVERLAY_VALUE: return CONST_OVERLAY;
            case CONST_RETIRED_VALUE: return CONST_RETIRED;
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
	private ResourceObjectIncludeObjType(int value, String name, String literal) {
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
	
} //ResourceObjectIncludeObjType
