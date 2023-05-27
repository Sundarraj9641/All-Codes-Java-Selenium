package com.treeset;

import java.util.TreeSet;
public class TreeSetDemo {

	public static void main(String[] args) {
	
		TreeSet<String> tr = new TreeSet<>();
		
		tr.add("Capgemini");
		tr.add("Apple");
		tr.add("Battle");
		tr.add("Development");
		tr.add("Capgemini");
		
		for(String str : tr) {
			System.out.println(str);
		}

	}

}
