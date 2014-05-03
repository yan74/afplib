/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Extended Resource Local Identifier Res Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getExtendedResourceLocalIdentifierResType()
 * @model
 * @generated
 */
public enum ExtendedResourceLocalIdentifierResType implements Enumerator {
	/**
	 * The '<em><b>Const Retired</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_RETIRED_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_RETIRED(48, "ConstRetired", "ConstRetired"),

	/**
	 * The '<em><b>Const Media Type Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_TYPE_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MEDIA_TYPE_RESOURCE(64, "ConstMediaTypeResource", "ConstMediaTypeResource"),

	/**
	 * The '<em><b>Const Media Destination Resource</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_DESTINATION_RESOURCE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MEDIA_DESTINATION_RESOURCE(66, "ConstMediaDestinationResource", "ConstMediaDestinationResource");

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
	public static final int CONST_RETIRED_VALUE = 48;

	/**
	 * The '<em><b>Const Media Type Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Media Type Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_TYPE_RESOURCE
	 * @model name="ConstMediaTypeResource"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MEDIA_TYPE_RESOURCE_VALUE = 64;

	/**
	 * The '<em><b>Const Media Destination Resource</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Media Destination Resource</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_DESTINATION_RESOURCE
	 * @model name="ConstMediaDestinationResource"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MEDIA_DESTINATION_RESOURCE_VALUE = 66;

	/**
	 * An array of all the '<em><b>Extended Resource Local Identifier Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ExtendedResourceLocalIdentifierResType[] VALUES_ARRAY =
		new ExtendedResourceLocalIdentifierResType[] {
			CONST_RETIRED,
			CONST_MEDIA_TYPE_RESOURCE,
			CONST_MEDIA_DESTINATION_RESOURCE,
		};

	/**
	 * A public read-only list of all the '<em><b>Extended Resource Local Identifier Res Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ExtendedResourceLocalIdentifierResType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Extended Resource Local Identifier Res Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedResourceLocalIdentifierResType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtendedResourceLocalIdentifierResType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extended Resource Local Identifier Res Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedResourceLocalIdentifierResType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ExtendedResourceLocalIdentifierResType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Extended Resource Local Identifier Res Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ExtendedResourceLocalIdentifierResType get(int value) {
		switch (value) {
			case CONST_RETIRED_VALUE: return CONST_RETIRED;
			case CONST_MEDIA_TYPE_RESOURCE_VALUE: return CONST_MEDIA_TYPE_RESOURCE;
			case CONST_MEDIA_DESTINATION_RESOURCE_VALUE: return CONST_MEDIA_DESTINATION_RESOURCE;
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
	private ExtendedResourceLocalIdentifierResType(int value, String name, String literal) {
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
	
} //ExtendedResourceLocalIdentifierResType
