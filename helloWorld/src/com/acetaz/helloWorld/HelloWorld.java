package com.acetaz.helloWorld;

public class HelloWorld {
	public static int instanceInt = 50;
	public static void main(String[] args) {
		int num = 112;
		boolean check = true;
		String str = "Text";
		double nums = 125.225;
		float numf = (float) 1.1;
		
		System.out.println("This is integer:" + num);
		System.out.println("This is float:" + numf);
		System.out.println("This is double:" + nums);
		System.out.println("This is string:" + str);
		System.out.println("This is boolean:" + check);
		System.out.println("instanceInt" + instanceInt);
		myMethod();
		System.out.println("instanceInt" + instanceInt);
	}
	
	public static void myMethod() {
		instanceInt = 80;
	}
}
// Single line comment

/*
 * 
 * Multiple lines comment
 */