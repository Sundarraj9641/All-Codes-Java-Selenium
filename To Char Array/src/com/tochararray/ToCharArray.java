package com.tochararray;

public class ToCharArray {

	public static void main(String[] args) {
		String str = "Sundarraj";
		
		char ch[] = str.toCharArray();
		
		for(int i=0; i<str.length(); i++) {
			System.out.println(ch[i]);
		}

	}

}
