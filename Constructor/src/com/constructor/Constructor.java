package com.constructor;

public class Constructor {
	
	//Constructor -- must be same name as class name
	//constructor is called whenever the object is created for the class
	Constructor(){
		System.out.println("This is default constructor");
	}
	
	//function
	public void defcon() {
		System.out.println("This is method from Constructor class");
	}
	public static void main(String[] args) {
		
		
		//object creation for class
		Constructor con = new Constructor();
		
		//calling function from Constructor class
		con.defcon();
	}

}
