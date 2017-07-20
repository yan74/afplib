/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Rendering Intent GOCARI</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getRenderingIntentGOCARI()
 * @model
 * @generated
 */
public enum RenderingIntentGOCARI implements Enumerator {
	/**
     * The '<em><b>Const Perceptual</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_PERCEPTUAL_VALUE
     * @generated
     * @ordered
     */
	CONST_PERCEPTUAL(0, "ConstPerceptual", "ConstPerceptual"),

	/**
     * The '<em><b>Const Media Relative Colorimetric</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_MEDIA_RELATIVE_COLORIMETRIC_VALUE
     * @generated
     * @ordered
     */
	CONST_MEDIA_RELATIVE_COLORIMETRIC(1, "ConstMediaRelativeColorimetric", "ConstMediaRelativeColorimetric"),

	/**
     * The '<em><b>Const Saturation</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_SATURATION_VALUE
     * @generated
     * @ordered
     */
	CONST_SATURATION(2, "ConstSaturation", "ConstSaturation"),

	/**
     * The '<em><b>Const ICC Absolute Colorimetrc</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_ICC_ABSOLUTE_COLORIMETRC_VALUE
     * @generated
     * @ordered
     */
	CONST_ICC_ABSOLUTE_COLORIMETRC(3, "ConstICCAbsoluteColorimetrc", "ConstICCAbsoluteColorimetrc"),

	/**
     * The '<em><b>Const Not Specified</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_NOT_SPECIFIED_VALUE
     * @generated
     * @ordered
     */
	CONST_NOT_SPECIFIED(255, "ConstNotSpecified", "ConstNotSpecified");

	/**
     * The '<em><b>Const Perceptual</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Perceptual</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_PERCEPTUAL
     * @model name="ConstPerceptual"
     * @generated
     * @ordered
     */
	public static final int CONST_PERCEPTUAL_VALUE = 0;

	/**
     * The '<em><b>Const Media Relative Colorimetric</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Media Relative Colorimetric</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_MEDIA_RELATIVE_COLORIMETRIC
     * @model name="ConstMediaRelativeColorimetric"
     * @generated
     * @ordered
     */
	public static final int CONST_MEDIA_RELATIVE_COLORIMETRIC_VALUE = 1;

	/**
     * The '<em><b>Const Saturation</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Saturation</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_SATURATION
     * @model name="ConstSaturation"
     * @generated
     * @ordered
     */
	public static final int CONST_SATURATION_VALUE = 2;

	/**
     * The '<em><b>Const ICC Absolute Colorimetrc</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const ICC Absolute Colorimetrc</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_ICC_ABSOLUTE_COLORIMETRC
     * @model name="ConstICCAbsoluteColorimetrc"
     * @generated
     * @ordered
     */
	public static final int CONST_ICC_ABSOLUTE_COLORIMETRC_VALUE = 3;

	/**
     * The '<em><b>Const Not Specified</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Not Specified</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_NOT_SPECIFIED
     * @model name="ConstNotSpecified"
     * @generated
     * @ordered
     */
	public static final int CONST_NOT_SPECIFIED_VALUE = 255;

	/**
     * An array of all the '<em><b>Rendering Intent GOCARI</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final RenderingIntentGOCARI[] VALUES_ARRAY =
		new RenderingIntentGOCARI[] {
            CONST_PERCEPTUAL,
            CONST_MEDIA_RELATIVE_COLORIMETRIC,
            CONST_SATURATION,
            CONST_ICC_ABSOLUTE_COLORIMETRC,
            CONST_NOT_SPECIFIED,
        };

	/**
     * A public read-only list of all the '<em><b>Rendering Intent GOCARI</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<RenderingIntentGOCARI> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Rendering Intent GOCARI</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static RenderingIntentGOCARI get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RenderingIntentGOCARI result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Rendering Intent GOCARI</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static RenderingIntentGOCARI getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            RenderingIntentGOCARI result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Rendering Intent GOCARI</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static RenderingIntentGOCARI get(int value) {
        switch (value) {
            case CONST_PERCEPTUAL_VALUE: return CONST_PERCEPTUAL;
            case CONST_MEDIA_RELATIVE_COLORIMETRIC_VALUE: return CONST_MEDIA_RELATIVE_COLORIMETRIC;
            case CONST_SATURATION_VALUE: return CONST_SATURATION;
            case CONST_ICC_ABSOLUTE_COLORIMETRC_VALUE: return CONST_ICC_ABSOLUTE_COLORIMETRC;
            case CONST_NOT_SPECIFIED_VALUE: return CONST_NOT_SPECIFIED;
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
	private RenderingIntentGOCARI(int value, String name, String literal) {
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
	
} //RenderingIntentGOCARI
