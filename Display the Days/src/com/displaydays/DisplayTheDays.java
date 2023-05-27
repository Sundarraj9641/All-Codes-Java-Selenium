package com.displaydays;

import java.util.Scanner;
public class DisplayTheDays {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number range Between 1 and 7");
		int in = sc.nextInt();
		
		if (in>0) {
			switch(in) {
			case 1:
				System.out.println("Monday");
				break;
			case 2:
				System.out.println("Tuesday");
				break;
			case 3:
				System.out.println("Wednesday");
				break;
			case 4:
				System.out.println("Thursday");
				break;
			case 5:
				System.out.println("Friday");
				break;
			case 6:
				System.out.println("Saturday");
				break;
			case 7:
				System.out.println("Sunday");
				break;
			default:
				System.out.println("Enter the vaild input between 1 and 7");
			}
			sc.close();
		}
		
	}

}
