package com.accolite.design.singleton;

public class SingletonTest implements Runnable {
	Singleton d;
	
	@Override
	public void run() {
		for(int t=0;t<5;t++) {
			d=Singleton.getInstance(t,t+"");
			System.out.println(d.demo_int);
		}
	}
	
	public static void main(String[] args) {
		SingletonTest obj = new SingletonTest();
		Thread t=new Thread(obj);
		t.start();
		Thread t1=new Thread(obj);
		t1.start();
	
	}
}
