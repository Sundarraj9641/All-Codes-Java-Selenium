package GreatestofThree;

import java.util.Scanner;

public class GreatestOfThree {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the 1st number: ");
		int a=sc.nextInt();
		
		System.out.println("Enter the 2st number: ");
		int b=sc.nextInt();
		
		System.out.println("Enter the 3st number: ");
		int c=sc.nextInt();
		
		if(a>b && a>c) {
			System.out.printf("%d is the Greatest Number",a);
		} else if(b>a && b>c) {
			System.out.printf("%d is the Greatest Number",b);
		} else {
			System.out.printf("%d is the Greatest Number",c);
		}
		
		sc.close();

	}

}
