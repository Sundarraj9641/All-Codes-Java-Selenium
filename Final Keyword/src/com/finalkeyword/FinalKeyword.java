package com.finalkeyword;

public class FinalKeyword {

	public static void main(String[] args) {
		
		final int a = 33;
		
		//The final local variable a cannot be assigned. 
		//It must be blank and not using a compound assignment
		
		a =12;
		System.out.println(a);

	}

}
