package com.lengthofstring;

import java.util.Scanner;
public class LengthOfString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str = sc.nextLine();
		
		int len = str.length();
		
		System.out.print("The length of the string you entered  is :" + len);
		sc.close();
		
	
	}

}
