package com.method;

public class MethodOverloading {
	
	public void print(String s) {
		System.out.println("Hello Friends");
	}
	
	public void print(int a) {
		this.print("Sundarraj");
		System.out.println("Welcome You All");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MethodOverloading mo = new MethodOverloading();
		
		mo.print(4);

	}

}
