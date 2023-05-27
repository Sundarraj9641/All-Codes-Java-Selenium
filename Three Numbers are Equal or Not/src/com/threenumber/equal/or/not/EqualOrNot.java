package com.threenumber.equal.or.not;


import java.util.Scanner;
public class EqualOrNot {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the First Number :");
		int a = sc.nextInt();
		
		System.out.print("Enter the Second Number : ");
		int b = sc.nextInt();
		
		System.out.print("Enter the Third Number :");
		int c = sc.nextInt();
		
		
		if(a==b && a==c) {
			System.out.println("All are Equal");
		} else if(a==b || b==c || c==a) {
			System.out.println("Neither all are equal or different");
		} else {
			System.out.println("All are Different");
		}
			sc.close();
	}

}
