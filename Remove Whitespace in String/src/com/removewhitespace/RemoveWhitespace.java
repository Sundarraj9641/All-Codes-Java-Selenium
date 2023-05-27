package com.removewhitespace;

import java.util.Scanner;
public class RemoveWhitespace {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the String : ");
		String str1 = sc.nextLine();
		
		String str3 = str1.replaceAll("[ ]", "");
		
		System.out.println(str3);
		
		sc.close();

	}

}
