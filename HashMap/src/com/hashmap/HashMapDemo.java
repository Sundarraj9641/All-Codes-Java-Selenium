package com.hashmap;

import java.util.*;
public class HashMapDemo {

	public static void main(String[] args) {
		
		HashMap<Integer, String> map = new HashMap<>();
		
		map.put(1, "Sundar");
		map.put(2, "Raj");
		map.put(3, "Karthik");
		map.put(4, "Kiran");
		map.put(1, "Siva");
		
		for(Map.Entry m : map.entrySet()) {
			System.out.println(m.getKey()+ " " + m.getValue());
		}
	}

}
