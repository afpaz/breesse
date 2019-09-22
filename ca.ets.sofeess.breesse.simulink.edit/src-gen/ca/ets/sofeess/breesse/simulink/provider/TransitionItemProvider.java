/**
 * Copyright (c) 2016-2019 ÉTS
 * 
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 * 
 *     https://www.apache.org/licenses/LICENSE-2.0
 *     
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package ca.ets.sofeess.breesse.simulink.provider;


import java.util.Collection;
import java.util.List;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notification;

import org.eclipse.emf.ecore.EStructuralFeature;

import org.eclipse.emf.edit.provider.ComposeableAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ItemPropertyDescriptor;
import org.eclipse.emf.edit.provider.ViewerNotification;

import ca.ets.sofeess.breesse.simulink.SimulinkFactory;
import ca.ets.sofeess.breesse.simulink.SimulinkPackage;
import ca.ets.sofeess.breesse.simulink.State;
import ca.ets.sofeess.breesse.simulink.Transition;
import ca.ets.sofeess.breesse.simulink.Vertex;

/**
 * This is the item provider adapter for a {@link ca.ets.sofeess.breesse.simulink.Transition} object.
 * <!-- begin-user-doc -->
 * <!-- end-user-doc -->
 * @generated
 */
public class TransitionItemProvider extends ContainableStateflowElementItemProvider {
	/**
	 * This constructs an instance from a factory and a notifier.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	public TransitionItemProvider(AdapterFactory adapterFactory) {
		super(adapterFactory);
	}

	/**
	 * This returns the property descriptors for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public List<IItemPropertyDescriptor> getPropertyDescriptors(Object object) {
		if (itemPropertyDescriptors == null) {
			super.getPropertyDescriptors(object);

			addSourcePropertyDescriptor(object);
			addDestinationPropertyDescriptor(object);
			addIsDefaultTransitionPropertyDescriptor(object);
			addExecutionOrderPropertyDescriptor(object);
		}
		return itemPropertyDescriptors;
	}

	/**
	 * This adds a property descriptor for the Source feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addSourcePropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_source_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_source_feature", "_UI_Transition_type"),
				 SimulinkPackage.Literals.TRANSITION__SOURCE,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Destination feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addDestinationPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_destination_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_destination_feature", "_UI_Transition_type"),
				 SimulinkPackage.Literals.TRANSITION__DESTINATION,
				 true,
				 false,
				 true,
				 null,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Is Default Transition feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addIsDefaultTransitionPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_isDefaultTransition_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_isDefaultTransition_feature", "_UI_Transition_type"),
				 SimulinkPackage.Literals.TRANSITION__IS_DEFAULT_TRANSITION,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.BOOLEAN_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This adds a property descriptor for the Execution Order feature.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	protected void addExecutionOrderPropertyDescriptor(Object object) {
		itemPropertyDescriptors.add
			(createItemPropertyDescriptor
				(((ComposeableAdapterFactory)adapterFactory).getRootAdapterFactory(),
				 getResourceLocator(),
				 getString("_UI_Transition_executionOrder_feature"),
				 getString("_UI_PropertyDescriptor_description", "_UI_Transition_executionOrder_feature", "_UI_Transition_type"),
				 SimulinkPackage.Literals.TRANSITION__EXECUTION_ORDER,
				 true,
				 false,
				 false,
				 ItemPropertyDescriptor.INTEGRAL_VALUE_IMAGE,
				 null,
				 null));
	}

	/**
	 * This specifies how to implement {@link #getChildren} and is used to deduce an appropriate feature for an
	 * {@link org.eclipse.emf.edit.command.AddCommand}, {@link org.eclipse.emf.edit.command.RemoveCommand} or
	 * {@link org.eclipse.emf.edit.command.MoveCommand} in {@link #createCommand}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Collection<? extends EStructuralFeature> getChildrenFeatures(Object object) {
		if (childrenFeatures == null) {
			super.getChildrenFeatures(object);
			childrenFeatures.add(SimulinkPackage.Literals.TRANSITION__GUARD);
			childrenFeatures.add(SimulinkPackage.Literals.TRANSITION__TRIGGERED_ACTIONS);
			childrenFeatures.add(SimulinkPackage.Literals.TRANSITION__TRIGGER);
		}
		return childrenFeatures;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EStructuralFeature getChildFeature(Object object, Object child) {
		// Check the type of the specified child object and return the proper feature to use for
		// adding (see {@link AddCommand}) it as a child.

		return super.getChildFeature(object, child);
	}

	/**
	 * This returns Transition.gif.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object getImage(Object object) {
		return overlayImage(object, getResourceLocator().getImage("full/obj16/Transition"));
	}

	/**
	 * This returns the label text for the adapted class.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public String getText(Object object) {
//		String label = ((Transition)object).getName();
//		return label == null || label.length() == 0 ?
//			getString("_UI_Transition_type") :
//			getString("_UI_Transition_type") + " " + label;
		Transition transition = (Transition)object;
        Vertex source = transition.getSource();
        Vertex destination = transition.getDestination();
        String sourceText = "";
        String destinationText = "";
        if (source != null) {
            if (source instanceof State) {
                sourceText = ((State) source).getName();
            } else {
                sourceText = getString("_UI_Junction_type") + " " + source.getId();
            }
        } else {
            sourceText = "•";
        }
        if (destination != null) {
        		if (destination instanceof State) {
                destinationText = ((State) destination).getName();
            } else {
                destinationText = getString("_UI_Junction_type") + " " + destination.getId();
            }
		} else {
			destinationText = "•";
		}
        return getString("_UI_Transition_type") + " " + transition.getId() + ": " + sourceText + " -> " + destinationText;
	}
	

	/**
	 * This handles model notifications by calling {@link #updateChildren} to update any cached
	 * children and by creating a viewer notification, which it passes to {@link #fireNotifyChanged}.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void notifyChanged(Notification notification) {
		updateChildren(notification);

		switch (notification.getFeatureID(Transition.class)) {
			case SimulinkPackage.TRANSITION__IS_DEFAULT_TRANSITION:
			case SimulinkPackage.TRANSITION__EXECUTION_ORDER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), false, true));
				return;
			case SimulinkPackage.TRANSITION__GUARD:
			case SimulinkPackage.TRANSITION__TRIGGERED_ACTIONS:
			case SimulinkPackage.TRANSITION__TRIGGER:
				fireNotifyChanged(new ViewerNotification(notification, notification.getNotifier(), true, false));
				return;
		}
		super.notifyChanged(notification);
	}

	/**
	 * This adds {@link org.eclipse.emf.edit.command.CommandParameter}s describing the children
	 * that can be created under this object.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected void collectNewChildDescriptors(Collection<Object> newChildDescriptors, Object object) {
		super.collectNewChildDescriptors(newChildDescriptors, object);

		newChildDescriptors.add
			(createChildParameter
				(SimulinkPackage.Literals.TRANSITION__GUARD,
				 SimulinkFactory.eINSTANCE.createSFWGuard()));

		newChildDescriptors.add
			(createChildParameter
				(SimulinkPackage.Literals.TRANSITION__TRIGGERED_ACTIONS,
				 SimulinkFactory.eINSTANCE.createAction()));

		newChildDescriptors.add
			(createChildParameter
				(SimulinkPackage.Literals.TRANSITION__TRIGGER,
				 SimulinkFactory.eINSTANCE.createSFWTrigger()));
	}

}
