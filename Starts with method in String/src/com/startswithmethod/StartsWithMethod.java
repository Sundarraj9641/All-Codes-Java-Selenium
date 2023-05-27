package com.startswithmethod;

public class StartsWithMethod {
	
	public static void main(String[] args) {
		
		String str1 = "Welcome to the new world";
		String str2 = "Welcome";
		String str3 = "World";
		
		boolean b1 = str1.startsWith(str2);
		boolean b2 = str1.startsWith(str3);
		
		System.out.println(b1);
		System.out.println(b2);
	}

}
