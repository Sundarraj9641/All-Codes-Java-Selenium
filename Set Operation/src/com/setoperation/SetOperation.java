package com.setoperation;
import java.util.HashSet;
import java.util.Set;
public class SetOperation {


	public Set<Integer> subtract(Set<Integer> a, Set<Integer> b){
	HashSet<Integer> result = new HashSet<Integer>(a);
	for(int element: b) {
	if(result.contains(element))
	result.remove(element);
	}
	return result;
	}
	
	
	public Set<Integer> union(Set<Integer> a, Set<Integer> b){
	HashSet<Integer> result = new HashSet<Integer>(a);
	result.addAll(b);
	return result;
	}
	
	
	public Set<Integer> intersection(Set<Integer> a, Set<Integer> b){
	HashSet<Integer> result = new HashSet<Integer>(a);
	result.retainAll(b);
	return result;
	}
	
	
	public static void main(String[] args) {
	HashSet<Integer> set1 = new HashSet<Integer>();
	set1.add(5);
	set1.add(6);
	set1.add(7);
	set1.add(8);
	HashSet<Integer> set2 = new HashSet<Integer>();
	set2.add(9);
	set2.add(3);
	set2.add(7);
	SetOperation source = new SetOperation();
	System.out.println("Set1: "+set1);
	System.out.println("Set2: "+set2);
	System.out.println("Set Difference: "+ source.subtract(set1, set2));
	System.out.println("Set Union: " + source.union(set1, set2));
	System.out.println("Set Intersection: " + source.intersection(set1, set2));
	}
	}

