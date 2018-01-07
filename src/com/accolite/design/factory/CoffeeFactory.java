package com.accolite.design.factory;

public class CoffeeFactory {
	Coffee coffee=null;
	public Coffee getCoffee(String option) {
		if("A".equals(option))
			coffee=new Capuccino();
		else if("B".equals(option))
			coffee=new Mocha();
		else if("C".equals(option))
			coffee=new Latte();
		else if("D".equals(option))
			coffee=new Esperano();
		return coffee;
	}

}
