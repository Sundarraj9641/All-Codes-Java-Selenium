package com.arrays;

import java.util.Scanner;
public class ArrayByUserInput {

	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of element to be added in array");
		int n = sc.nextInt();
		
		int []a = new int[n];
		System.out.println("Enter the values of Array");
		for(int i=0; i<n; i++) {
			a[i] = sc.nextInt();
		}
		
		for(int nums:a) {
			System.out.println(nums);
		}
		
		
		sc.close();
		

	}

}
