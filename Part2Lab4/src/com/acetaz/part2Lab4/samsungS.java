package com.acetaz.part2Lab4;

public class samsungS extends samsung{
	String name = "SansungS";
	
	public void features() {
		System.out.println("Device: " + device);
		System.out.println("Operating system: " + OS);
		System.out.println("Model: " + name);
		System.out.println("Features: ");
		samsungFeatures();
	}
}
