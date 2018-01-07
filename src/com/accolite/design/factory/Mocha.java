package com.accolite.design.factory;

public class Mocha extends Coffee{
	public Mocha() {
		super("Mocha");
	}

	@Override
	public void delivery() {
		System.out.println("Mocha ready");
		
	}
}
