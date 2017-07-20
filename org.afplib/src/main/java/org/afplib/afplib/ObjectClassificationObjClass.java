/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>Object Classification Obj Class</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getObjectClassificationObjClass()
 * @model
 * @generated
 */
public enum ObjectClassificationObjClass implements Enumerator {
	/**
     * The '<em><b>Const Timeinvariant</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_TIMEINVARIANT_VALUE
     * @generated
     * @ordered
     */
	CONST_TIMEINVARIANT(1, "ConstTimeinvariant", "ConstTimeinvariant"),

	/**
     * The '<em><b>Const Timevariant</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_TIMEVARIANT_VALUE
     * @generated
     * @ordered
     */
	CONST_TIMEVARIANT(16, "ConstTimevariant", "ConstTimevariant"),

	/**
     * The '<em><b>Const Executableprogram</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_EXECUTABLEPROGRAM_VALUE
     * @generated
     * @ordered
     */
	CONST_EXECUTABLEPROGRAM(32, "ConstExecutableprogram", "ConstExecutableprogram"),

	/**
     * The '<em><b>Const Setupfile</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_SETUPFILE_VALUE
     * @generated
     * @ordered
     */
	CONST_SETUPFILE(48, "ConstSetupfile", "ConstSetupfile"),

	/**
     * The '<em><b>Const Secondary Resourceeg Color Profile</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE_VALUE
     * @generated
     * @ordered
     */
	CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE(64, "ConstSecondaryResourceegColorProfile", "ConstSecondaryResourceegColorProfile"),

	/**
     * The '<em><b>Const Dataobjectfont</b></em>' literal object.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @see #CONST_DATAOBJECTFONT_VALUE
     * @generated
     * @ordered
     */
	CONST_DATAOBJECTFONT(65, "ConstDataobjectfont", "ConstDataobjectfont");

	/**
     * The '<em><b>Const Timeinvariant</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Timeinvariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_TIMEINVARIANT
     * @model name="ConstTimeinvariant"
     * @generated
     * @ordered
     */
	public static final int CONST_TIMEINVARIANT_VALUE = 1;

	/**
     * The '<em><b>Const Timevariant</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Timevariant</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_TIMEVARIANT
     * @model name="ConstTimevariant"
     * @generated
     * @ordered
     */
	public static final int CONST_TIMEVARIANT_VALUE = 16;

	/**
     * The '<em><b>Const Executableprogram</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Executableprogram</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_EXECUTABLEPROGRAM
     * @model name="ConstExecutableprogram"
     * @generated
     * @ordered
     */
	public static final int CONST_EXECUTABLEPROGRAM_VALUE = 32;

	/**
     * The '<em><b>Const Setupfile</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Setupfile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_SETUPFILE
     * @model name="ConstSetupfile"
     * @generated
     * @ordered
     */
	public static final int CONST_SETUPFILE_VALUE = 48;

	/**
     * The '<em><b>Const Secondary Resourceeg Color Profile</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Secondary Resourceeg Color Profile</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE
     * @model name="ConstSecondaryResourceegColorProfile"
     * @generated
     * @ordered
     */
	public static final int CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE_VALUE = 64;

	/**
     * The '<em><b>Const Dataobjectfont</b></em>' literal value.
     * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Dataobjectfont</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
     * @see #CONST_DATAOBJECTFONT
     * @model name="ConstDataobjectfont"
     * @generated
     * @ordered
     */
	public static final int CONST_DATAOBJECTFONT_VALUE = 65;

	/**
     * An array of all the '<em><b>Object Classification Obj Class</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	private static final ObjectClassificationObjClass[] VALUES_ARRAY =
		new ObjectClassificationObjClass[] {
            CONST_TIMEINVARIANT,
            CONST_TIMEVARIANT,
            CONST_EXECUTABLEPROGRAM,
            CONST_SETUPFILE,
            CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE,
            CONST_DATAOBJECTFONT,
        };

	/**
     * A public read-only list of all the '<em><b>Object Classification Obj Class</b></em>' enumerators.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public static final List<ObjectClassificationObjClass> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
     * Returns the '<em><b>Object Classification Obj Class</b></em>' literal with the specified literal value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param literal the literal.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationObjClass get(String literal) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectClassificationObjClass result = VALUES_ARRAY[i];
            if (result.toString().equals(literal)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Classification Obj Class</b></em>' literal with the specified name.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param name the name.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationObjClass getByName(String name) {
        for (int i = 0; i < VALUES_ARRAY.length; ++i) {
            ObjectClassificationObjClass result = VALUES_ARRAY[i];
            if (result.getName().equals(name)) {
                return result;
            }
        }
        return null;
    }

	/**
     * Returns the '<em><b>Object Classification Obj Class</b></em>' literal with the specified integer value.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param value the integer value.
     * @return the matching enumerator or <code>null</code>.
     * @generated
     */
	public static ObjectClassificationObjClass get(int value) {
        switch (value) {
            case CONST_TIMEINVARIANT_VALUE: return CONST_TIMEINVARIANT;
            case CONST_TIMEVARIANT_VALUE: return CONST_TIMEVARIANT;
            case CONST_EXECUTABLEPROGRAM_VALUE: return CONST_EXECUTABLEPROGRAM;
            case CONST_SETUPFILE_VALUE: return CONST_SETUPFILE;
            case CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE_VALUE: return CONST_SECONDARY_RESOURCEEG_COLOR_PROFILE;
            case CONST_DATAOBJECTFONT_VALUE: return CONST_DATAOBJECTFONT;
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
	private ObjectClassificationObjClass(int value, String name, String literal) {
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
	
} //ObjectClassificationObjClass
