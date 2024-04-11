package com.enumdemo;

public class EnumDemo {
	enum names{
		hi,
		hello,
		welcome,
	}
	public static void main (String[]args) {
//		names value = names.welcome;
//		System.out.println(value);
		int num = 12345;
		int len= String.valueOf(num).length();
		for(int i =0; i<len; i++) {
		
		int rev =0;
		int rem = num%10;
		
		rev = rev*10+rem; 
		num=num/10;
		System.out.print(rev);
		}
		System.out.println();
		String str ="Sundarraj";
		String s1="";
		for (int i=0; i<str.length(); i++) {
			s1=str.charAt(i)+s1;
			
		}
		System.out.print(s1);
		
	}

}
