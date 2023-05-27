package com.studentinformation;

import java.util.ArrayList;

public class Source {

		public ArrayList<String> changeOccurrence(ArrayList<String> a, String m, String n){
			for(int i=0 ;i<a.size(); i++) {
				String s1 = a.get(i);
				if(s1.equals(m)) {
					a.add(i,n);
				}
			}
			return a;
		}
		public String listIndex(ArrayList<String>list) {
			return list.get(0);
		}
		
		public ArrayList<String> listAfter(ArrayList<String> a, String m, String n){
			ArrayList<String> arr = new ArrayList<String>();
			for(String str : a) {
				arr.add(str);
				if(str.equals(m)) {
					arr.add(n);
				}
			}
			return arr;
		}
	public static void main(String[] args) {
		
			ArrayList<String> a1 = new ArrayList<String>();
			a1.add("A");
			a1.add("B");
			a1.add("s");
			a1.add("D");
			Source sc = new Source();
			System.out.println(sc.changeOccurrence(a1,"B","C"));
			System.out.println(sc.listIndex(a1));
	}

}
