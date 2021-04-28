package com.acetaz.part1Lab4;

public class Part1Lab4 {
	public static void main(String[] args) {
		int score = 76;
		boolean isHandsome = true;
		
		if(score >= 80) {
			System.out.println("Good");
		}
		
		if(score >= 50 && score < 80) {
			System.out.println("Normal");
		}
		
		if(score < 50) {
			System.out.println("Fail");
		}
		
		if(score >= 80 || isHandsome) {
			System.out.println("Good");
		}else if(score >= 50) {
			System.out.println("Normal");
		}else{
			System.out.println("Fail");
		}
	}
}
