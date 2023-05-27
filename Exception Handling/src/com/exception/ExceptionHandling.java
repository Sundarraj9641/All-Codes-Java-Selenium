package com.exception;

public class ExceptionHandling {

	public static void main(String[] args) {
		
		int a =100;
		try {
			int b = a/0;
			System.out.println(b);
			
		} catch (Exception e) {
			System.out.println("Number cannot be divide by zero");
		} finally {
		System.out.println("*****End of the program");
		}
		
		System.out.println("Program runned without termination");
	}

}
