package com.methoddemo;

public class MethodDemo2 extends MethodDemo {
	public int add(int a, int b) {
		System.out.println(super.sub(4,2));
		return a+b;
	}
	public void word(){
		enum names{
			hi,
			hello,
			welcome,
			
		}
	}
 public static void main(String[] args) {
	 MethodDemo2 md2 = new MethodDemo2();
	 System.out.println(md2.add(3, 5));
	 names value = names.hello;
}
}
