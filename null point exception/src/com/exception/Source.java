package com.exception;

public class Source {

	public static void main(String[] args) {

		{

		     try
		     {       System.out.println("A");
		      throw new NullPointerException ("Hello");
		     }
		     catch(ArithmeticException e)
		     {
		      System.out.print("B");
		     }
		    }
		}
	}


