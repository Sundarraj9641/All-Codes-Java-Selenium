package com.maxarray;

public class MaxOfArray {

	public static void main(String[] args) {
		
		int[] a = {1,5,6,9,12,11};
		
		int max =0;
		
		for(int num:a) {
			
			if (num>max) {
				max = num;
			
			}
		}
		System.out.println("The Maximum of this array is : " + max);

	}

}
