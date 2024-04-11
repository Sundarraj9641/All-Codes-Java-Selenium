package com.methoddemo;

public class MethodDemo {
	public void greeting() {
		System.out.println("Good Morning");
	}
	public int add(int a, int b) {
		
		return a+b;
	}
	public int sub(int a, int b) {
		return a-b;
	}
	public double add(double a, double b) {
		this.greeting();
		System.out.println(this.sub(4, 2));
		return a+b;
	}
	
	
	public int mul(int a, int b) {
		return a*b;
	}
	
	public int div(int a, int b) {
		return a/b;
	}
	
	public static void main(String[] args) {
		MethodDemo md = new MethodDemo();
		//System.out.println(md.add(3, 5));
		
		System.out.println(md.add(3.98, 5.64654));
		
		
//		System.out.println(md.sub(3, 5));
//		
//		System.out.println(md.div(34, 5));
//		
//		System.out.println(md.mul(3, 5));
	}

}
