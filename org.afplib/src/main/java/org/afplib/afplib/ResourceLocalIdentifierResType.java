/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Resource Local Identifier Res Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getResourceLocalIdentifierResType()
 * @model
 * @generated
 */
public enum ResourceLocalIdentifierResType implements Enumerator {
	/**
	 * The '<em><b>Const Usage Dependent</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_USAGE_DEPENDENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_USAGE_DEPENDENT(0, "ConstUsageDependent", "ConstUsageDependent"),

	/**
	 * The '<em><b>Const Page Overlay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGE_OVERLAY(2, "ConstPageOverlay", "ConstPageOverlay"),

	/**
	 * The '<em><b>Const Coded Font</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CODED_FONT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CODED_FONT(5, "ConstCodedFont", "ConstCodedFont");

	/**
	 * The '<em><b>Const Usage Dependent</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Usage Dependent</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_USAGE_DEPENDENT
	 * @model name="ConstUsageDependent"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_USAGE_DEPENDENT_VALUE = 0;

	/**
	 * The '<em><b>Const Page Overlay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Overlay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OVERLAY
	 * @model name="ConstPageOverlay"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGE_OVERLAY_VALUE = 2;

	/**
	 * The '<em><b>Const Coded Font</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Coded Font</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CODED_FONT
	 * @model name="ConstCodedFont"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CODED_FONT_VALUE = 5;

	/**
	 * An array of all the '<em><b>Resource Local Identifier Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ResourceLocalIdentifierResType[] VALUES_ARRAY =
		new ResourceLocalIdentifierResType[] {
			CONST_USAGE_DEPENDENT,
			CONST_PAGE_OVERLAY,
			CONST_CODED_FONT,
		};

	/**
	 * A public read-only list of all the '<em><b>Resource Local Identifier Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ResourceLocalIdentifierResType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Resource Local Identifier Res Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceLocalIdentifierResType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceLocalIdentifierResType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Local Identifier Res Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceLocalIdentifierResType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ResourceLocalIdentifierResType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Resource Local Identifier Res Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static ResourceLocalIdentifierResType get(int value) {
		switch (value) {
			case CONST_USAGE_DEPENDENT_VALUE: return CONST_USAGE_DEPENDENT;
			case CONST_PAGE_OVERLAY_VALUE: return CONST_PAGE_OVERLAY;
			case CONST_CODED_FONT_VALUE: return CONST_CODED_FONT;
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
	private ResourceLocalIdentifierResType(int value, String name, String literal) {
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
	
} //ResourceLocalIdentifierResType
