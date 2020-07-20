package com.demo.singleton;

import java.util.Date;

public class A {
	
	private static A a1;
	String name;
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}
	
	
	private A() {
		System.out.println(new Date());
	}
	
	public static A getInstance(String str) {
		
		if(a1 == null) {
			a1 = new A();
			a1.setName(str);
		}
		
		return a1;
	}
	
	public String toString() {
		return "[" + name + "]";
	}

}
