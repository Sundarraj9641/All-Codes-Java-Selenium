package com.constructor;

public class CC1 {
	
	CC1(){
		this(2);
		System.out.println("Default Constructor -- CC1");
	}
	
	CC1(int a){
		this("hello");
		System.out.println("Int constructor -- CC1");
	}
	
	CC1(String s){
		System.out.println("String constructor -- CC1");
	}

}
