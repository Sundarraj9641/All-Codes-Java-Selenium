package com.method;

public class MethodOverriding extends Mobile{
	
	public void brand(String s) {
		super.brand("Sundarraj");
		System.out.println("All Type of Mobile cases are available");
		this.samsung(5);

	}
	
	public void samsung(int a) {
		
		System.out.println("Samsung starts from Rs.32,999");
	}

	public static void main(String[] args) {
		
		MethodOverriding m = new MethodOverriding();
		
		m.brand("hello");
		

	}

}
