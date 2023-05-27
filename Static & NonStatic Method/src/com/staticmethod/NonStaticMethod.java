package com.staticmethod;

public class NonStaticMethod {
	
	int num = 55;
	
	public void nsc() {
		System.out.println("This is non Static Method");
	}
	public static void main(String[] args) {
		
		NonStaticMethod n = new NonStaticMethod();
		
		System.out.println(n.num);
		n.nsc();
	}

}
