package com.acetaz.part2Lab4;

public class samsungNote extends samsung{
	String name = "SansungNote";
	
	public void features() {
		System.out.println("Device: " + device);
		System.out.println("Operating system: " + OS);
		System.out.println("Model: " + name);
		System.out.println("Features: ");
		samsungFeatures();
		usePen();
	}
	
	public void usePen() {
		System.out.println("UsePen from samsung");
	}
}
