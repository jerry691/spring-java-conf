package com.demo.singleton;

public class B {
	
	public static void main(String a[]) {
		A temp = A.getInstance("Hi");
		System.out.println(temp);
		
		A temp2 = A.getInstance("Hello");
		System.out.println(temp2);
		
		try {
			Thread.sleep(30000);
		} catch(Exception e) {
			e.printStackTrace();
		}
	}

}
