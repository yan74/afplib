/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>IOB Obj Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getIOBObjType()
 * @model
 * @generated
 */
public enum IOBObjType implements Enumerator {
	/**
	 * The '<em><b>Const Page Segment</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_SEGMENT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_PAGE_SEGMENT(95, "ConstPageSegment", "ConstPageSegment"),

	/**
	 * The '<em><b>Const Otherobjectdata</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_OTHEROBJECTDATA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_OTHEROBJECTDATA(146, "ConstOtherobjectdata", "ConstOtherobjectdata"),

	/**
	 * The '<em><b>Const Graphics GOCA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_GRAPHICS_GOCA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_GRAPHICS_GOCA(187, "ConstGraphicsGOCA", "ConstGraphicsGOCA"),

	/**
	 * The '<em><b>Const Bar Code BCOCA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BAR_CODE_BCOCA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BAR_CODE_BCOCA(235, "ConstBarCodeBCOCA", "ConstBarCodeBCOCA"),

	/**
	 * The '<em><b>Const Image IOCA</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_IMAGE_IOCA_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_IMAGE_IOCA(251, "ConstImageIOCA", "ConstImageIOCA");

	/**
	 * The '<em><b>Const Page Segment</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Page Segment</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_PAGE_SEGMENT
	 * @model name="ConstPageSegment"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_PAGE_SEGMENT_VALUE = 95;

	/**
	 * The '<em><b>Const Otherobjectdata</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Otherobjectdata</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_OTHEROBJECTDATA
	 * @model name="ConstOtherobjectdata"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_OTHEROBJECTDATA_VALUE = 146;

	/**
	 * The '<em><b>Const Graphics GOCA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Graphics GOCA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_GRAPHICS_GOCA
	 * @model name="ConstGraphicsGOCA"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_GRAPHICS_GOCA_VALUE = 187;

	/**
	 * The '<em><b>Const Bar Code BCOCA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bar Code BCOCA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BAR_CODE_BCOCA
	 * @model name="ConstBarCodeBCOCA"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BAR_CODE_BCOCA_VALUE = 235;

	/**
	 * The '<em><b>Const Image IOCA</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Image IOCA</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_IMAGE_IOCA
	 * @model name="ConstImageIOCA"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_IMAGE_IOCA_VALUE = 251;

	/**
	 * An array of all the '<em><b>IOB Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final IOBObjType[] VALUES_ARRAY =
		new IOBObjType[] {
			CONST_PAGE_SEGMENT,
			CONST_OTHEROBJECTDATA,
			CONST_GRAPHICS_GOCA,
			CONST_BAR_CODE_BCOCA,
			CONST_IMAGE_IOCA,
		};

	/**
	 * A public read-only list of all the '<em><b>IOB Obj Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<IOBObjType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>IOB Obj Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOBObjType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOBObjType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IOB Obj Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOBObjType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			IOBObjType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>IOB Obj Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static IOBObjType get(int value) {
		switch (value) {
			case CONST_PAGE_SEGMENT_VALUE: return CONST_PAGE_SEGMENT;
			case CONST_OTHEROBJECTDATA_VALUE: return CONST_OTHEROBJECTDATA;
			case CONST_GRAPHICS_GOCA_VALUE: return CONST_GRAPHICS_GOCA;
			case CONST_BAR_CODE_BCOCA_VALUE: return CONST_BAR_CODE_BCOCA;
			case CONST_IMAGE_IOCA_VALUE: return CONST_IMAGE_IOCA;
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
	private IOBObjType(int value, String name, String literal) {
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
	
} //IOBObjType
