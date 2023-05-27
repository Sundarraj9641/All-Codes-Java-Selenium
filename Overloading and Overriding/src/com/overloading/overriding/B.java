package com.overloading.overriding;

public class B extends A{
	
	B(int a){
		this("raj");
		System.out.println("B -- Int constructor");
	}
	B(String s2){
		System.out.println("B -- String constructor");
	}
	
	public void test(int b) {
		super.test(4);
		System.out.println("Int Method -- B");
	}
	
	public void test(String s1) {
		super.test("Sundar");
		System.out.println("String Method -- B");
	}

	public static void main(String[] args) {
		
		B b = new B(2);
		b.test("hello");
		b.test(5);

	}

}
