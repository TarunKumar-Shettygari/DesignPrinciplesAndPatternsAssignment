package com.accolite.design.observer;


import java.beans.PropertyChangeEvent;


public class Client implements Observer {
	public Client(MyModel model) {
        model.subscribe(this);
    }
	
	@Override
	public void propertyChange(PropertyChangeEvent event){
		System.out.println("Client --- Changed property:" + event.getPropertyName() + "  oldValue:"
	            + event.getOldValue() + "  newValue:" + event.getNewValue() );
   }
	
	
}
