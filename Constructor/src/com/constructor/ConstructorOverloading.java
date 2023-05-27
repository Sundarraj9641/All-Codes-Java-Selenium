package com.constructor;

public class ConstructorOverloading {
	
	ConstructorOverloading(){
		System.out.println("Default Constructor");
	}
	
	
	ConstructorOverloading(String name){
		this();
		System.out.println("My name is " + name);
	}
	
	ConstructorOverloading(int age){
		this("Sundarraj");
		System.out.println("My Age is " + age );
	}

		public void conovd() {
			System.out.println("Method in ConstructorOverloading");
		}
	public static void main(String[] args) {
		
		ConstructorOverloading co = new ConstructorOverloading(22);
		
		co.conovd();

	}

}
