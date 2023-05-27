package com.reversestring;

import java.util.Scanner;
public class ReverseString {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the String");
	    String Str = sc.nextLine();
	    String rev = "";
	    
	    System.out.println("Actual string: " + Str);
	        
	    for (int i = 0; i < Str.length(); i++) {
	      rev = Str.charAt(i) + rev;
	    }
	    
	    System.out.println("Reversed string: "+ rev);
	    
	    sc.close();
	}

}
