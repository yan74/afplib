/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Container Presentation Space Size PDF Size</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectContainerPresentationSpaceSizePDFSize()
 * @model
 * @generated
 */
public enum ObjectContainerPresentationSpaceSizePDFSize implements Enumerator {
	/**
	 * The '<em><b>Const Media Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_MEDIA_BOX(1, "ConstMediaBox", "ConstMediaBox"),

	/**
	 * The '<em><b>Const Crop Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CROP_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CROP_BOX(2, "ConstCropBox", "ConstCropBox"),

	/**
	 * The '<em><b>Const Bleed Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_BLEED_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_BLEED_BOX(3, "ConstBleedBox", "ConstBleedBox"),

	/**
	 * The '<em><b>Const Trim Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_TRIM_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_TRIM_BOX(4, "ConstTrimBox", "ConstTrimBox"),

	/**
	 * The '<em><b>Const Art Box</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_ART_BOX_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_ART_BOX(5, "ConstArtBox", "ConstArtBox");

	/**
	 * The '<em><b>Const Media Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Media Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_MEDIA_BOX
	 * @model name="ConstMediaBox"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_MEDIA_BOX_VALUE = 1;

	/**
	 * The '<em><b>Const Crop Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Crop Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CROP_BOX
	 * @model name="ConstCropBox"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CROP_BOX_VALUE = 2;

	/**
	 * The '<em><b>Const Bleed Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Bleed Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_BLEED_BOX
	 * @model name="ConstBleedBox"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_BLEED_BOX_VALUE = 3;

	/**
	 * The '<em><b>Const Trim Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Trim Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_TRIM_BOX
	 * @model name="ConstTrimBox"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_TRIM_BOX_VALUE = 4;

	/**
	 * The '<em><b>Const Art Box</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Art Box</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_ART_BOX
	 * @model name="ConstArtBox"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_ART_BOX_VALUE = 5;

	/**
	 * An array of all the '<em><b>Object Container Presentation Space Size PDF Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final ObjectContainerPresentationSpaceSizePDFSize[] VALUES_ARRAY =
		new ObjectContainerPresentationSpaceSizePDFSize[] {
			CONST_MEDIA_BOX,
			CONST_CROP_BOX,
			CONST_BLEED_BOX,
			CONST_TRIM_BOX,
			CONST_ART_BOX,
		};

	/**
	 * A public read-only list of all the '<em><b>Object Container Presentation Space Size PDF Size</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<ObjectContainerPresentationSpaceSizePDFSize> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>Object Container Presentation Space Size PDF Size</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectContainerPresentationSpaceSizePDFSize get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectContainerPresentationSpaceSizePDFSize result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Container Presentation Space Size PDF Size</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectContainerPresentationSpaceSizePDFSize getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			ObjectContainerPresentationSpaceSizePDFSize result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>Object Container Presentation Space Size PDF Size</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static ObjectContainerPresentationSpaceSizePDFSize get(int value) {
		switch (value) {
			case CONST_MEDIA_BOX_VALUE: return CONST_MEDIA_BOX;
			case CONST_CROP_BOX_VALUE: return CONST_CROP_BOX;
			case CONST_BLEED_BOX_VALUE: return CONST_BLEED_BOX;
			case CONST_TRIM_BOX_VALUE: return CONST_TRIM_BOX;
			case CONST_ART_BOX_VALUE: return CONST_ART_BOX;
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
	private ObjectContainerPresentationSpaceSizePDFSize(int value, String name, String literal) {
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
	
} //ObjectContainerPresentationSpaceSizePDFSize
