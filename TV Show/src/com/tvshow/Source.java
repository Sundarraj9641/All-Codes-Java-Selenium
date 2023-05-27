package com.tvshow;

import java.util.ArrayList;
public class Source {
	
	public String printindex (ArrayList<String> list, int ind) {
		return list.get(ind);
	}
	public ArrayList<String> addAfter(ArrayList<String> a, String m, String n){
		int index = a.indexOf(m);
		if(index != -1) {
			index++;
			a.add(n);
		}
		return a;
	}
	
	public  static ArrayList<String> pickIndexAndAppend(ArrayList<String> p, int ind){
		String str = p.get(ind);
		p.remove(ind);
		p.add(str);
		return p;
	}
	public static void main(String[] args) {
		
		ArrayList <String> list = new ArrayList <String>();
		list.add("sundar");
		list.add("Raj");
		list.add("Karthik");
		
		ArrayList <String> a = new ArrayList <String>();
		list.add("Mobile");
		list.add("Laptop");
		list.add("Table");
		
		ArrayList <String> p = new ArrayList <String>();
		list.add("Karur");
		list.add("Chennai");
		list.add("Trichy");
		
		Source s = new Source();
		System.out.println(s.printindex(list, 1));
		s.addAfter(a, "Laptop", "Iphone");
		pickIndexAndAppend(p,1);
		for(String str1 : a) {
			System.out.println(str1);
		}

			System.out.println();
	}

}
