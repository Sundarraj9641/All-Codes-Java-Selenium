package com.multiplicationtable;

import java.util.Scanner;
public class MultiplicationTable {
	public static void main(String[] args) {
		
		System.out.println("Enter the Number of table");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i = 1; i<=10; i++) {
			System.out.println(i +" * " +n+ " = "+ i*n);
		}
		sc.close();
	}

}
