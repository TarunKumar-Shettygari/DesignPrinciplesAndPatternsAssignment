package com.accolite.design.factory;

public class Latte extends Coffee {
	public Latte() {
		super("Latte");
	}

	@Override
	public void delivery() {
		System.out.println("Latte ready");
		
	}

}
