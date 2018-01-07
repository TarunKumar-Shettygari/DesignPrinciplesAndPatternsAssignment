package com.accolite.design.factory;

public class Capuccino extends Coffee{
	public Capuccino() {
		super("Capuccino");
	}

	@Override
	public void delivery() {
		System.out.println("Capuccino ready");
		
	}

}
