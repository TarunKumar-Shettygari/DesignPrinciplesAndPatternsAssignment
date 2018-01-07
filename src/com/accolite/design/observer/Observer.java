package com.accolite.design.observer;


import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;

public interface Observer extends PropertyChangeListener{
	
	@Override
	default void propertyChange(PropertyChangeEvent event) {
			System.out.println("Changed property: " + event.getPropertyName() + " [old -> "
		            + event.getOldValue() + "] | [new -> " + event.getNewValue() +"]");
	   }
	
	
}
