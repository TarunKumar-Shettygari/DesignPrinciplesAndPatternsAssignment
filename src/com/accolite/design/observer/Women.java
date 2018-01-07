package com.accolite.design.observer;

import java.beans.PropertyChangeEvent;

public class Women implements Observer{
	
	public Women(MyModel model) {
        model.subscribe(this);
    }
	
	@Override
	public void propertyChange(PropertyChangeEvent event){
		System.out.println("Women --- Changed property:" + event.getPropertyName() + "  oldValue:"
	            + event.getOldValue() + "  newValue:" + event.getNewValue() );
   }

}
