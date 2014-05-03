/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getPageOverlayConditionalProcessingPgOvType()
 * @model
 * @generated
 */
public enum PageOverlayConditionalProcessingPgOvType implements Enumerator {
	/**
	 * The '<em><b>Const Normal</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_NORMAL_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_NORMAL(0, "ConstNormal", "ConstNormal"),

	/**
	 * The '<em><b>Const Annotation</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ANNOTATION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ANNOTATION(1, "ConstAnnotation", "ConstAnnotation"),

	/**
	 * The '<em><b>Const Redaction</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_REDACTION_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_REDACTION(2, "ConstRedaction", "ConstRedaction"),

	/**
	 * The '<em><b>Const Highlight</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGHLIGHT_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_HIGHLIGHT(3, "ConstHighlight", "ConstHighlight");

	/**
	 * The '<em><b>Const Normal</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Normal</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_NORMAL
	 * @model name="ConstNormal"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_NORMAL_VALUE = 0;

	/**
	 * The '<em><b>Const Annotation</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Annotation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ANNOTATION
	 * @model name="ConstAnnotation"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ANNOTATION_VALUE = 1;

	/**
	 * The '<em><b>Const Redaction</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Redaction</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_REDACTION
	 * @model name="ConstRedaction"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_REDACTION_VALUE = 2;

	/**
	 * The '<em><b>Const Highlight</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Highlight</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_HIGHLIGHT
	 * @model name="ConstHighlight"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_HIGHLIGHT_VALUE = 3;

	/**
	 * An array of all the '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final PageOverlayConditionalProcessingPgOvType[] VALUES_ARRAY =
		new PageOverlayConditionalProcessingPgOvType[] {
			CONST_NORMAL,
			CONST_ANNOTATION,
			CONST_REDACTION,
			CONST_HIGHLIGHT,
		};

	/**
	 * A public read-only list of all the '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<PageOverlayConditionalProcessingPgOvType> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageOverlayConditionalProcessingPgOvType get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageOverlayConditionalProcessingPgOvType result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageOverlayConditionalProcessingPgOvType getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			PageOverlayConditionalProcessingPgOvType result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Page Overlay Conditional Processing Pg Ov Type</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static PageOverlayConditionalProcessingPgOvType get(int value) {
		switch (value) {
			case CONST_NORMAL_VALUE: return CONST_NORMAL;
			case CONST_ANNOTATION_VALUE: return CONST_ANNOTATION;
			case CONST_REDACTION_VALUE: return CONST_REDACTION;
			case CONST_HIGHLIGHT_VALUE: return CONST_HIGHLIGHT;
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
	private PageOverlayConditionalProcessingPgOvType(int value, String name, String literal) {
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
	
} //PageOverlayConditionalProcessingPgOvType
