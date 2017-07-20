/**
 */
package org.afplib.base.util;

import org.afplib.base.*;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notifier;

import org.eclipse.emf.common.notify.impl.AdapterFactoryImpl;

import org.eclipse.emf.ecore.EObject;

/**
 * <!-- begin-user-doc -->
 * The <b>Adapter Factory</b> for the model.
 * It provides an adapter <code>createXXX</code> method for each class of the model.
 * <!-- end-user-doc -->
 * @see org.afplib.base.BasePackage
 * @generated
 */
public class BaseAdapterFactory extends AdapterFactoryImpl {
	/**
     * The cached model package.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected static BasePackage modelPackage;

	/**
     * Creates an instance of the adapter factory.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	public BaseAdapterFactory() {
        if (modelPackage == null) {
            modelPackage = BasePackage.eINSTANCE;
        }
    }

	/**
     * Returns whether this factory is applicable for the type of the object.
     * <!-- begin-user-doc -->
	 * This implementation returns <code>true</code> if the object is either the model's package or is an instance object of the model.
	 * <!-- end-user-doc -->
     * @return whether this factory is applicable for the type of the object.
     * @generated
     */
	@Override
	public boolean isFactoryForType(Object object) {
        if (object == modelPackage) {
            return true;
        }
        if (object instanceof EObject) {
            return ((EObject)object).eClass().getEPackage() == modelPackage;
        }
        return false;
    }

	/**
     * The switch that delegates to the <code>createXXX</code> methods.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @generated
     */
	protected BaseSwitch<Adapter> modelSwitch =
		new BaseSwitch<Adapter>() {
            @Override
            public Adapter caseAFP(AFP object) {
                return createAFPAdapter();
            }
            @Override
            public Adapter caseSF(SF object) {
                return createSFAdapter();
            }
            @Override
            public Adapter caseUNKNSF(UNKNSF object) {
                return createUNKNSFAdapter();
            }
            @Override
            public Adapter caseSFGrouper(SFGrouper object) {
                return createSFGrouperAdapter();
            }
            @Override
            public Adapter caseTriplet(Triplet object) {
                return createTripletAdapter();
            }
            @Override
            public Adapter defaultCase(EObject object) {
                return createEObjectAdapter();
            }
        };

	/**
     * Creates an adapter for the <code>target</code>.
     * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
     * @param target the object to adapt.
     * @return the adapter for the <code>target</code>.
     * @generated
     */
	@Override
	public Adapter createAdapter(Notifier target) {
        return modelSwitch.doSwitch((EObject)target);
    }


	/**
     * Creates a new adapter for an object of class '{@link org.afplib.base.AFP <em>AFP</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.afplib.base.AFP
     * @generated
     */
	public Adapter createAFPAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.afplib.base.SF <em>SF</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.afplib.base.SF
     * @generated
     */
	public Adapter createSFAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.afplib.base.UNKNSF <em>UNKNSF</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.afplib.base.UNKNSF
     * @generated
     */
	public Adapter createUNKNSFAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.afplib.base.SFGrouper <em>SF Grouper</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.afplib.base.SFGrouper
     * @generated
     */
	public Adapter createSFGrouperAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for an object of class '{@link org.afplib.base.Triplet <em>Triplet</em>}'.
     * <!-- begin-user-doc -->
	 * This default implementation returns null so that we can easily ignore cases;
	 * it's useful to ignore a case when inheritance will catch all the cases anyway.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @see org.afplib.base.Triplet
     * @generated
     */
	public Adapter createTripletAdapter() {
        return null;
    }

	/**
     * Creates a new adapter for the default case.
     * <!-- begin-user-doc -->
	 * This default implementation returns null.
	 * <!-- end-user-doc -->
     * @return the new adapter.
     * @generated
     */
	public Adapter createEObjectAdapter() {
        return null;
    }

} //BaseAdapterFactory
