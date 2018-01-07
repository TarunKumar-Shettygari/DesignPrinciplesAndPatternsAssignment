package com.accolite.design.observer;

import java.beans.PropertyChangeEvent;

public class Men implements Observer {
	public Men(MyModel model) {
        model.subscribe(this);
    }
	
	@Override
	public void propertyChange(PropertyChangeEvent event){
		System.out.println("Men --- Changed property:" + event.getPropertyName() + "  oldValue:"
	            + event.getOldValue() + "  newValue:" + event.getNewValue() );
   }
	
}
