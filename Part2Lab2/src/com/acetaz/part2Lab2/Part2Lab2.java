package com.acetaz.part2Lab2;

public class Part2Lab2 {
	public static void main(String[] args) {
		String string1 = "You and Me";
		String string2 = " you and me ";
		
		//1. Check equal
		System.out.println("Is string is equal: " + string1.equals(string2));
		
		//2. Find some text
		System.out.println("Have 'you' in string 1: " + string1.contains("you"));
		System.out.println("Have 'you' in string 2: " + string2.contains("you"));
		
		//3. string length
		System.out.println("How string 1 long: " + string1.length());
		System.out.println("How string 2 long: " + string2.length());
		
		//4. Cut some char
		System.out.println("Cut Char 1-4 from string1: " + string1.substring(4));
		System.out.println("Cut Char 1-4 from string2: " + string2.substring(4));
		
		//5. remove space
		System.out.println("string1 after remove space: " + string1.trim());
		System.out.println("string2 after remove space: " + string2.trim());
		
		//6. Capitalization
		System.out.println("Capitalization string1: " + string1.toUpperCase());
		System.out.println("Capitalization string2: " + string2.toUpperCase());
		
		//7. Capitalize with trim
		System.out.println("Capitalization with trim string2: " + string2.toUpperCase().trim());
	}
}
