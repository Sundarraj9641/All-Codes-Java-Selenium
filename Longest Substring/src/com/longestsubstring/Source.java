package com.longestsubstring;

import java.util.Set;
import java.util.HashSet;

public class Source {

		public int lengthOfSubstring(String s, Set<Character> set) {
			int max =0, i=0, j=0;
			
			while(i<s.length()) {
				if(!set.contains(s.charAt(i))){
					
					set.add(s.charAt(i++));
					max = Math.max(max, set.size());
				} else {
					set.remove(s.charAt(j++));
				}
			}
			return max;
		}
	public static void main(String[] args) {
		
		HashSet<Character> set = new HashSet<Character>();
		String str ="abcabcbb";
		
		Source sc = new Source();
		System.out.println(sc.lengthOfSubstring(str, set));

	}

}
