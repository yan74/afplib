/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>OBP Ref CSys</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getOBPRefCSys()
 * @model
 * @generated
 */
public enum OBPRefCSys implements Enumerator {
	/**
	 * The '<em><b>Const Page Or Overlay IPS Defines Origin</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN(0, "ConstPageOrOverlayIPSDefinesOrigin", "ConstPageOrOverlayIPSDefinesOrigin"),

	/**
	 * The '<em><b>Const Page Or Overlay</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OR_OVERLAY_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGE_OR_OVERLAY(1, "ConstPageOrOverlay", "ConstPageOrOverlay"),

	/**
	 * The '<em><b>Const Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RETIRED(5, "ConstRetired", "ConstRetired");

	/**
	 * The '<em><b>Const Page Or Overlay IPS Defines Origin</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Or Overlay IPS Defines Origin</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN
	 * @model name="ConstPageOrOverlayIPSDefinesOrigin"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN_VALUE = 0;

	/**
	 * The '<em><b>Const Page Or Overlay</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Or Overlay</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_OR_OVERLAY
	 * @model name="ConstPageOrOverlay"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGE_OR_OVERLAY_VALUE = 1;

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
	public static final int CONST_RETIRED_VALUE = 5;

	/**
	 * An array of all the '<em><b>OBP Ref CSys</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final OBPRefCSys[] VALUES_ARRAY =
		new OBPRefCSys[] {
			CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN,
			CONST_PAGE_OR_OVERLAY,
			CONST_RETIRED,
		};

	/**
	 * A public read-only list of all the '<em><b>OBP Ref CSys</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<OBPRefCSys> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>OBP Ref CSys</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param literal the literal.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBPRefCSys get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OBPRefCSys result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OBP Ref CSys</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param name the name.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBPRefCSys getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			OBPRefCSys result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>OBP Ref CSys</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @param value the integer value.
	 * @return the matching enumerator or <code>null</code>.
	 * @generated
	 */
	public static OBPRefCSys get(int value) {
		switch (value) {
			case CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN_VALUE: return CONST_PAGE_OR_OVERLAY_IPS_DEFINES_ORIGIN;
			case CONST_PAGE_OR_OVERLAY_VALUE: return CONST_PAGE_OR_OVERLAY;
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
	private OBPRefCSys(int value, String name, String literal) {
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
	
} //OBPRefCSys
