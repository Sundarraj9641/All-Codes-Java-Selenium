package com.stringpalindrome;

import java.util.Scanner;

public class StringPalindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
	    String Str = sc.nextLine();
	    String rev = "";
	        
	    for (int i = 0; i < Str.length(); i++) {
	      rev = Str.charAt(i) + rev;
	    }
	    
	    if(Str.equals(rev)) {
	    	System.out.println("Palindrome");
	    } else {
	    	System.out.println("Not Palindrome");
	    }
	    
	    sc.close();

	}

}
