package com.stringoperations;

import java.util.Scanner;

public class CharacterAtGivenString {
public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the Sting: ");
		String str = sc.nextLine();
		while(true) {
		System.out.print("Enter the index: ");
		int n = sc.nextInt();
		
		if(n<str.length()) {
		char ch = str.charAt(n);
		System.out.println("The Character at index " + n + " is "+ ch);
		System.out.println("");
		} else {
			System.out.println("Enter the index number within limit!!!!!!!!!!!!!");
			System.out.println("");
			sc.close();
		}
		}
}
}
