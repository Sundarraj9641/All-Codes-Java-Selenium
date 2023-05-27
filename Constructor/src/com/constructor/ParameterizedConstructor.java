package com.constructor;

public class ParameterizedConstructor {

		//constructor with parameter
	ParameterizedConstructor(int n){
		System.out.println(n*n);
	}
	
	public void paraconsr() {
		System.out.println("This is method from ParameterizedConstructor");
	}
	
	public static void main(String[] args) {
		
		//passing parameter for the constructor -- n=5
		ParameterizedConstructor pc = new ParameterizedConstructor(5);
		
		pc.paraconsr();

	}

}
