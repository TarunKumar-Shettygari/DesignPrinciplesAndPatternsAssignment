package com.accolite.design.factory;

public abstract class Coffee {
	String name;
	public Coffee(String name) {
		this.name=name;
	}
	public String getName() {
		return name;
	}
	public abstract void delivery();
	
}
