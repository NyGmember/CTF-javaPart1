package com.acetaz.part2Lab4;

public class ApplePhone extends MobilePhone{
	String OS = "iOS";
	
	public void appleFeatures() {
		mobileFeatures();
		appStore();
	}
	
	public void appStore() {
		System.out.println("AppStore form Android");
	}

}
