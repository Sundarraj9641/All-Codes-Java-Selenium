package com.loops;

public class ForEachLoop {
	public static void main(String[] args) {
		int []arr = {1,4,6,2,77,88};
		for(int a:arr) {
			if(a%2 ==0) {
			System.out.println(a);
			}
		}
	}
}
