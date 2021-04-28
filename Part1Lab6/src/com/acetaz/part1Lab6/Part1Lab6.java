package com.acetaz.part1Lab6;

public class Part1Lab6 {
	public static void main(String[] args) {
		
		// While loop
		int i = 1;
		System.out.println("Simple while loop");
		while(i <= 10) {
			System.out.println(i++);
		}
		
		// Sum number with loop
		System.out.println("Sum number 1 to 10");
		System.out.println(sumLoop(1, 10));
		
		// Mod number
		System.out.println("mod number 1 to 100 by 12");
		modLoop(1, 100, 12);
		
		// Foreach
		int myArray[] = {1, 2, 3, 4, 5};
		System.out.println("For-each");
		for(int counter : myArray) {
			System.out.println("Counter: " + counter);
		}
		
		//Do while loop
		System.out.println("Do-While");
		doWhileLoop(20);
		
		//For and break
		System.out.println("For and break");
		forBreakLoop(20);
	}
	
	public static int sumLoop(int start, int end) {
		int total = 0;
		
		while(start <= end) {
			total += start;
			start++;
		}
		
		return total;
	}
	
	public static void modLoop(int start, int end, int modNumber) {
		
		System.out.print("From " + start + " to " + end + " divide evenly by " + modNumber + " is : ");
		
		while(start <= end) {
			if(start % modNumber == 0) {
				System.out.print(start + " ");
			}
			
			start++;
		}
	}
	
	public static void doWhileLoop(int counter) {
		do {
			System.out.println(counter--);
		}while(counter > 0);
	}
	
	public static void forBreakLoop(int count) {
		for(int i = 0; i < count; i++) {
			System.out.println(i);
			if(i == 11) {
				break;
			}
		}
	}
}
