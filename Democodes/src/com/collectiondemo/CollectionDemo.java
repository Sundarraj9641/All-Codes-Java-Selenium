package com.collectiondemo;

import java.util.*;
public class CollectionDemo {
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		
		arr.add(3);
		arr.add(33);
		arr.add(6);
		arr.add(19);
		arr.add(1);
		arr.add(3);
		System.out.println(">>>>>> ARRAYLIST <<<<<<");
		for(int a:arr) {
			System.out.print(a + " ");
		}
		
		System.out.println();
		System.out.println(">>>>>> HASHSET <<<<<<");
		HashSet<Integer> h = new HashSet<>(arr);
		for(int b:h) {
			System.out.print(b + " ");
		}
		
		System.out.println();
		System.out.println(">>>>>> TREESET <<<<<<");
		TreeSet<Integer> tr = new TreeSet<Integer>(h);
		for(int c:tr) {
			System.out.print(c + " ");
		}
	}
	
}
	

