package com.hashset;

import java.util.*;
public class HashSetDemo {

	public static void main(String[] args) {
			
		HashSet <String> hs = new HashSet<>();
		
		hs.add("Sundar");
		hs.add("Raj");
		hs.add("Hello");
		hs.add("Raj");
		
		for(String str : hs) {
			System.out.println(str);

		}
		
	}

}
