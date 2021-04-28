package com.acetaz.part1Lab7;

public class Part1Lab7 {
	public static void main(String[] args) {
		// Count continue on 11
		System.out.println("For and count");
		for(int count = 0; count < 20; count++) {
			System.out.println(count);
			if(count == 11 ) {
				continue;
			}
		}
		
		System.out.println("skip 2");
		for(int count = 0; count < 10; count++) {
			if(count == 2 ) {
				continue;
			}
			System.out.println(count);
		}
	}
}
