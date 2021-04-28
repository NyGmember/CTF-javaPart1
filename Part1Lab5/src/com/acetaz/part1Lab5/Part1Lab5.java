package com.acetaz.part1Lab5;

public class Part1Lab5 {
	public static void main(String[] args) {
		int score = 70;
		String result = "";
		
		switch(score) {
		case 80 :
			result = "A"; break;
		case 70 :
			result = "B"; break;
		case 60 :
			result = "C"; break;
		case 50 :
			result = "D"; break;
		case 40 :
			result = "F"; break;
		default:
			result = "E";
		}
		
		System.out.println("Grade is " + result);
	}
}
