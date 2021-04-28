package com.acetaz.part1Lab2;

public class PArt2Lab2 {
	
	public static void main(String[] args ) {
		
		float varFloat = 1.2f;
		int varInt = 20;
		double varDouble = 3.3d;
		char varChar = '\u0001';
		
		// Primitive conversion
		int conInt = (int) varFloat;
		float conFloat = varInt;
		float conDFloat = (float) varDouble;
		int conCInt = varChar;
		
		//Final variable
		final String word = "Hello";
		word = "World";
		
		bark();
		
		// Print out for primitive conversion
		System.out.println("Convert Float: " + varFloat + " -> Int: " + conInt);
		System.out.println("Convert Int: " + varInt + " -> Float: " + conFloat);
		System.out.println("Convert Double: " + varDouble + " -> Float: " + conDFloat);
		System.out.println("Convert Char: " + varChar + " -> Int: " + conCInt);
	}
	
	public static void bark() {
		String dogName = "Milo";
		System.out.println("The Dog name = "+ dogName + " bark");
	}
}
