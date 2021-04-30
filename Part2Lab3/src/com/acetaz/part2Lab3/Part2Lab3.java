package com.acetaz.part2Lab3;

public class Part2Lab3 {
	public static void main(String[] args) {
		int[][] myArray = {{1,2,3}, {4,5,6,7,8,9}, {10,11,12,13}};
		int sumLastElement = 0;
		int eleVal = 0;
		
		for(int[] dim1: myArray) {
			for(int ele: dim1) {
				System.out.print(ele + " ");
				eleVal = ele;
			}
			System.out.println("");
			sumLastElement += eleVal;
		}
		System.out.println("Sum of every last element is " + sumLastElement);
	}
}
