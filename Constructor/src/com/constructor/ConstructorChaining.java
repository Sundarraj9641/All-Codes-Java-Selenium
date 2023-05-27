package com.constructor;

public class ConstructorChaining extends CC1 {
	
	ConstructorChaining(){
		System.out.println("Default Constructor -- ConstructorChaining");
		
	}
	
	ConstructorChaining(int a){
		super(3);
		System.out.println("Int constructor -- ConstructorChaining");
	}
	
	ConstructorChaining(String s){
		this(4);
		System.out.println("String constructor -- ConstructorChaining");
	}

	public static void main(String[] args) {
	
		ConstructorChaining c = new ConstructorChaining("Sundarraj");
		

	}

}
