package com.checkupto.twodecimal;

import java.util.Scanner;
public class CheckUptoTwoDecimal {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in); 
		 System.out.print("Enter first 1st number: "); 
		 double n1 = sc.nextDouble(); 
		 System.out.print("Enter 2nd number: "); 
		 double n2 = sc.nextDouble(); 
		 sc.close(); 
		  
		 if (Math.abs(n1 - n2) <= 0.01) { 
		     System.out.println("Numbers are Same."); 
		 } 
		 else { 
		     System.out.println("Numbers are Different."); 
		 } 

	}

}
