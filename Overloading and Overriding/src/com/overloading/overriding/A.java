package com.overloading.overriding;

public class A {
		A(){
			this(6);
			System.out.println("A -- default constructor");
		}
		

		A(int a){
			System.out.println("A -- Int constructor");
		}
		
		public void test(int b) {
		
			System.out.println("Int Method -- A");
		}
		
		public void test(String s1) {
			
			System.out.println("String Method -- A");
		}

}
