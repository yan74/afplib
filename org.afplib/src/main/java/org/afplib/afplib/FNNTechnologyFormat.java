/**
 */
package org.afplib.afplib;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import org.eclipse.emf.common.util.Enumerator;

/**
 * <!-- begin-user-doc -->
 * A representation of the literals of the enumeration '<em><b>FNN Technology Format</b></em>',
 * and utility methods for working with them.
 * <!-- end-user-doc -->
 * @see org.afplib.afplib.AfplibPackage#getFNNTechnologyFormat()
 * @model
 * @generated
 */
public enum FNNTechnologyFormat implements Enumerator {
	/**
	 * The '<em><b>Const Fontspecific ASCI Icharacternameusedwith Type1 PF Bfonts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS(3, "ConstFontspecificASCIIcharacternameusedwithType1PFBfonts", "ConstFontspecificASCIIcharacternameusedwithType1PFBfonts"),

	/**
	 * The '<em><b>Const CMA Pbinarycodepointusedwith CI Dkeyedfonts</b></em>' literal object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS_VALUE
	 * @generated
	 * @ordered
	 */
	CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS(5, "ConstCMAPbinarycodepointusedwithCIDkeyedfonts", "ConstCMAPbinarycodepointusedwithCIDkeyedfonts");

	/**
	 * The '<em><b>Const Fontspecific ASCI Icharacternameusedwith Type1 PF Bfonts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const Fontspecific ASCI Icharacternameusedwith Type1 PF Bfonts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS
	 * @model name="ConstFontspecificASCIIcharacternameusedwithType1PFBfonts"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS_VALUE = 3;

	/**
	 * The '<em><b>Const CMA Pbinarycodepointusedwith CI Dkeyedfonts</b></em>' literal value.
	 * <!-- begin-user-doc -->
	 * <p>
	 * If the meaning of '<em><b>Const CMA Pbinarycodepointusedwith CI Dkeyedfonts</b></em>' literal object isn't clear,
	 * there really should be more of a description here...
	 * </p>
	 * <!-- end-user-doc -->
	 * @see #CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS
	 * @model name="ConstCMAPbinarycodepointusedwithCIDkeyedfonts"
	 * @generated
	 * @ordered
	 */
	public static final int CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS_VALUE = 5;

	/**
	 * An array of all the '<em><b>FNN Technology Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	private static final FNNTechnologyFormat[] VALUES_ARRAY =
		new FNNTechnologyFormat[] {
			CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS,
			CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS,
		};

	/**
	 * A public read-only list of all the '<em><b>FNN Technology Format</b></em>' enumerators.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static final List<FNNTechnologyFormat> VALUES = Collections.unmodifiableList(Arrays.asList(VALUES_ARRAY));

	/**
	 * Returns the '<em><b>FNN Technology Format</b></em>' literal with the specified literal value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNNTechnologyFormat get(String literal) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNNTechnologyFormat result = VALUES_ARRAY[i];
			if (result.toString().equals(literal)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNN Technology Format</b></em>' literal with the specified name.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNNTechnologyFormat getByName(String name) {
		for (int i = 0; i < VALUES_ARRAY.length; ++i) {
			FNNTechnologyFormat result = VALUES_ARRAY[i];
			if (result.getName().equals(name)) {
				return result;
			}
		}
		return null;
	}

	/**
	 * Returns the '<em><b>FNN Technology Format</b></em>' literal with the specified integer value.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public static FNNTechnologyFormat get(int value) {
		switch (value) {
			case CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS_VALUE: return CONST_FONTSPECIFIC_ASCI_ICHARACTERNAMEUSEDWITH_TYPE1_PF_BFONTS;
			case CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS_VALUE: return CONST_CMA_PBINARYCODEPOINTUSEDWITH_CI_DKEYEDFONTS;
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
	private FNNTechnologyFormat(int value, String name, String literal) {
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
	
} //FNNTechnologyFormat
