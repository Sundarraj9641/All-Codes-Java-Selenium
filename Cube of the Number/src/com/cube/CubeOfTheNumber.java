package com.cube;

import java.util.Scanner;
public class CubeOfTheNumber {
	public static void main(String[] args) {
		
		System.out.println("Enter the how many steps you want to cube");
		Scanner sc = new Scanner(System.in);
		int n= sc.nextInt();
		
		for(int i =1; i<=n; i++) {
			int cub = i*i*i;
			System.out.println("The Cube of " +i+ " is "+cub);
		}
		sc.close();
	}

}
