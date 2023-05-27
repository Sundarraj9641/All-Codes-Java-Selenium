package com.leapyear;

import java.util.Scanner;
public class LeapyearorNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the year : ");
		int y = sc.nextInt();
		
		if(y%4==0) {
			System.out.printf("%d is a Leap Year", y);
		} else {
			System.out.printf("%d is Not a Leap Year", y);
		}
		sc.close();

	}

}
