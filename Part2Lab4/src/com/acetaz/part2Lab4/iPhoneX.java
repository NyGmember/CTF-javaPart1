package com.acetaz.part2Lab4;

public class iPhoneX extends ApplePhone{
	String name = "iPhoneX";
	
	public void features() {
		System.out.println("Device: " + device);
		System.out.println("Operating system: " + OS);
		System.out.println("Model: " + name);
		System.out.println("Features: ");
		appleFeatures();
		faceID();
	}
	
	public void faceID() {
		System.out.println("FaceID form iPhoneX");
	}
}
