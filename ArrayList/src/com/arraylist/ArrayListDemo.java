package com.arraylist;

import java.util.ArrayList;
import java.util.list;
public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList <Object> arr = new ArrayList<>();
		
		arr.add("Sundar");
		arr.add("Raj");
		arr.add("Raj");
		arr.add(23);
		arr.add(111);
		
		int c = arr.size();
		for(int i =0; i<c; i++) {
			System.out.println(arr.get(i));
		}
	
		

	}

}
