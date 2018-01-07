package com.accolite.design.singleton;

public class Singleton {
	int demo_int;
	String demo_str;
	static Singleton singleton=null;
	private Singleton(int demo_int,String demo_str) {
		this.demo_int=demo_int;
		this.demo_str=demo_str;
	}
	public static Singleton getInstance(int demo_int,String demo_str){
		if(singleton==null) {
			synchronized(Singleton.class) {
				if(singleton == null)
				singleton=new Singleton(demo_int,demo_str);
			}
		}
		return singleton;
	}
	
}
