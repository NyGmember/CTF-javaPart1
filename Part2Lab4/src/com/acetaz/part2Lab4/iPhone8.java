package com.acetaz.part2Lab4;

public class iPhone8 extends ApplePhone{
	String name = "iPhone8";
	
	public void features() {
		System.out.println("Device: " + device);
		System.out.println("Operating system: " + OS);
		System.out.println("Model: " + name);
		System.out.println("Features: ");
		appleFeatures();
		touchID();
	}
	
	public void touchID() {
		System.out.println("TouchID form iPhoneX");
	}
}
