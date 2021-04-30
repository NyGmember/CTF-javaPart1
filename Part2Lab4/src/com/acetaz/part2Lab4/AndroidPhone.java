package com.acetaz.part2Lab4;

public class AndroidPhone extends MobilePhone {
	String OS = "Android";
	
	public void androidFeatures() {
		mobileFeatures();
		transformToPC();
		googlePlay();
	}
	
	public void transformToPC() {
		System.out.println("transformToPC form Android");
	}
	
	public void googlePlay() {
		System.out.println("googlePlay form Android");
	}
}
