package com.concatestring;

import java.util.Scanner;
public class ConcateString {
	 public static void main(String[] args) {

			String str1 = "Hello ";
			Scanner sc = new Scanner(System.in);
			
			System.out.println("Enter the String you want to add");
			String str2 = sc.nextLine();
			
			String str3 = str1.concat(str2);
			System.out.println(str3);
			
			sc.close();
	}
	

}
