/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>MODCA Interchange Set IStype</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getMODCAInterchangeSetIStype()
 * @model
 * @generated
 */
public enum MODCAInterchangeSetIStype implements Enumerator {
	/**
     * The '<em><b>Const Presentation</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PRESENTATION_VALUE
     * @generated
     * @ordered
     */
	CONST_PRESENTATION(1, "ConstPresentation", "ConstPresentation");

	/**
     * The '<em><b>Const Presentation</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Presentation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PRESENTATION
     * @model name="ConstPresentation"
     * @generated
     * @ordered
     */
	public static final int CONST_PRESENTATION_VALUE = 1;

	/**
     * An array of all the '<em><b>MODCA Interchange Set IStype</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final MODCAInterchangeSetIStype[] VALUES_ARRAY =
		new MODCAInterchangeSetIStype[] {
            CONST_PRESENTATION,
        };

	/**
     * A public read-only list of all the '<em><b>MODCA Interchange Set IStype</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<MODCAInterchangeSetIStype> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>MODCA Interchange Set IStype</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static MODCAInterchangeSetIStype get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MODCAInterchangeSetIStype result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>MODCA Interchange Set IStype</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static MODCAInterchangeSetIStype getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            MODCAInterchangeSetIStype result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>MODCA Interchange Set IStype</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static MODCAInterchangeSetIStype get(int value) {
        switch (value) {
            case CONST_PRESENTATION_VALUE: return CONST_PRESENTATION;
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
	private MODCAInterchangeSetIStype(int value, String name, String literal) {
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
	
} //MODCAInterchangeSetIStype
