package com.acetaz.part2Lab4;

public class MobilePhone {
	String device = "Mobile phone";
	
	public void mobileFeatures() {
		phoneCall();
		SMS();
		internetSurfing();
	}
	
	public void phoneCall() {
		System.out.println("PhoneCall form Mobile");
	}
	
	public void SMS() {
		System.out.println("SMS form Mobile");
	}
	
	public void internetSurfing() {
		System.out.println("internetSurfing form Mobile");
	}
}
