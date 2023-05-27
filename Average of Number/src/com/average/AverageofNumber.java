package com.average;

import java.util.Scanner;
public class AverageofNumber {

	public static void main(String[] args) {
		

		
		System.out.println("Enter the 5 integers");
		
		int num = 0;
		for(int i =0; i<5; i++) {
			Scanner sc = new Scanner(System.in);
			num= sc.nextInt();
			num+=num;
			sc.close();
		}
		
		int avg = num/5;
		System.out.println("The Average of Numbe is : " +avg);
		
		
	}

}
