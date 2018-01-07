package com.accolite.design.factory;

import java.util.Scanner;

public class CoffeeFactoryTest {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner s=new Scanner(System.in);
		String inp=s.nextLine();
		CoffeeFactory cf=new CoffeeFactory();
		Coffee c=cf.getCoffee(inp);
		if(c==null)
			System.out.println("enter a valid option");
		else {
			System.out.println("your ordered "+c.getName());
			c.delivery();
		}
	}
}
