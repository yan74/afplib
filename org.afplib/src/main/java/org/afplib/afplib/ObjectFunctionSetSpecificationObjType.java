/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Function Set Specification Obj Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectFunctionSetSpecificationObjType()
 * @model
 * @generated
 */
public enum ObjectFunctionSetSpecificationObjType implements Enumerator {
	/**
	 * The '<em><b>Const Presentation Text</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PRESENTATION_TEXT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PRESENTATION_TEXT(2, "ConstPresentationText", "ConstPresentationText"),

	/**
	 * The '<em><b>Const Graphics</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_GRAPHICS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_GRAPHICS(3, "ConstGraphics", "ConstGraphics"),

	/**
	 * The '<em><b>Const Bar Code</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BAR_CODE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BAR_CODE(5, "ConstBarCode", "ConstBarCode"),

	/**
	 * The '<em><b>Const Image</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IMAGE_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IMAGE(6, "ConstImage", "ConstImage");

	/**
	 * The '<em><b>Const Presentation Text</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Presentation Text</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PRESENTATION_TEXT
	 * @model name="ConstPresentationText"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PRESENTATION_TEXT_VALUE = 2;

	/**
	 * The '<em><b>Const Graphics</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Graphics</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_GRAPHICS
	 * @model name="ConstGraphics"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_GRAPHICS_VALUE = 3;

	/**
	 * The '<em><b>Const Bar Code</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bar Code</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BAR_CODE
	 * @model name="ConstBarCode"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BAR_CODE_VALUE = 5;

	/**
	 * The '<em><b>Const Image</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Image</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IMAGE
	 * @model name="ConstImage"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IMAGE_VALUE = 6;

	/**
	 * An array of all the '<em><b>Object Function Set Specification Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectFunctionSetSpecificationObjType[] VALUES_ARRAY =
		new ObjectFunctionSetSpecificationObjType[] {
			CONST_PRESENTATION_TEXT,
			CONST_GRAPHICS,
			CONST_BAR_CODE,
			CONST_IMAGE,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Function Set Specification Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectFunctionSetSpecificationObjType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Function Set Specification Obj Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationObjType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationObjType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification Obj Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationObjType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectFunctionSetSpecificationObjType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Function Set Specification Obj Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectFunctionSetSpecificationObjType get(int value) {
		switch (value) {
			case CONST_PRESENTATION_TEXT_VALUE: return CONST_PRESENTATION_TEXT;
			case CONST_GRAPHICS_VALUE: return CONST_GRAPHICS;
			case CONST_BAR_CODE_VALUE: return CONST_BAR_CODE;
			case CONST_IMAGE_VALUE: return CONST_IMAGE;
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
	private ObjectFunctionSetSpecificationObjType(int value, String name, String literal) {
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
	
} //ObjectFunctionSetSpecificationObjType
