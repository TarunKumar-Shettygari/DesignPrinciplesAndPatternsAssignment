package com.accolite.design.factory;

public class Esperano extends Coffee{
	public Esperano() {
		super("Esperano");
	}

	@Override
	public void delivery() {
		System.out.println("Esperano ready");
		
	}
}
