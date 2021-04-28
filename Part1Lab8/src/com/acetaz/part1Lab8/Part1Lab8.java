package com.acetaz.part1Lab8;

public class Part1Lab8 {
	public static void main(String[] args) {
		// Method with return value
		System.out.println("Value form method: " + methodWithReturn());
		
		//Method without return
		methodNoReturn();
	}
	
	public static String methodWithReturn() {
		return "I am form method";
	}
	
	public static void methodNoReturn() {
		System.out.println("I am still here!!");
	}
}
