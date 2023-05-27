package com.sumofoddnaturalnumbers;

public class SumOfOddNaturalNumbers {

	public static void main(String[] args) {
		int sum = 0;
		System.out.println("Odd Natural Numbers");
		for(int i = 0 ;i<=10; i++) {
			if(i%2==0) {
				continue;
				
			}
			System.out.println(i);
			 sum = sum+i;
		}
		
		System.out.println("The Sum of Odd Natural Numbers : " +sum);

	}

}
