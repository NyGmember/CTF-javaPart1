package com.acetaz.part2Lab4;

public class Part2Lab4 {
	public static void main(String[] args) {
		samsungNote phone1 = new samsungNote();
		phone1.name = "Samsung Galaxy Note 8";
		phone1.features();
		
		System.out.println("-----------------------------------------");
		
		iPhoneX phone2 = new iPhoneX();
		phone2.name = "iPhone X";
		phone2.features();
		
		System.out.println("-----------------------------------------");
		
		iPhone8 phone3 = new iPhone8();
		phone3.name = "iPhone 8s";
		phone3.features();
		
		System.out.println("-----------------------------------------");
		
		samsungS phone4 = new samsungS();
		phone4.name = "iPhone X";
		phone4.features();
		
		System.out.println("-----------------------------------------");
	}
}