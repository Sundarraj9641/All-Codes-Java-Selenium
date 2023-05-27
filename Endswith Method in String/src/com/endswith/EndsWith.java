package com.endswith;

public class EndsWith {
	public static void main(String[] args) {
		
		String str1 = "Sundarraj";
		String end = "raj";
		String end1 = "sundar";
		
		boolean b1 = str1.endsWith(end);
		boolean b2 = str1.endsWith(end1);
		
		System.out.println(b1);
		System.out.println(b2);
		
	}
}
