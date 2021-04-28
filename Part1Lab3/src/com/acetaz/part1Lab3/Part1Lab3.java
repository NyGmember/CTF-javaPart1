package com.acetaz.part1Lab3;

public class Part1Lab3 {
	public static void main(String[] args) {
		int i = 20;
		
		// i++ *5
		i++;
		i++;
		i++;
		i++;
		i++;
		
		System.out.println(i);
		
		// i-- *5
		i--;
		i--;
		i--;
		i--;
		i--;
		
		System.out.println(i);
		
		// Compare operation
		float a = 1.0f;
		float b = 2.0f;
		if((a > 0) && (b > 0)) {
			System.out.println("a and b is positive");
		}
		
		char c = '\u0063';
		char d = '\u0044';
		if(c == 'c' || d == 'd')
		System.out.println("Some char is correct");
	}
}
