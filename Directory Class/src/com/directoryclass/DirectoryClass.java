package com.directoryclass;

import java.util.*;
public class DirectoryClass {

	public TreeMap<String, String> data;

	public DirectoryClass() {
		data = new TreeMap<>();
	}

	public String getNumber(String name) {
		return data.get(name);
	}

	public boolean getName(String number) {
		for(Map.Entry<String, String> m: data.entrySet()) {
			if(m.getValue().equals(number)) {
				return true;
			}
		}
		return false;
	}

	public String putNumber(String name, String number) {
		try {
			if(name!=null && number!=null) {
				data.put(name, number);
				return "True";
			} else {
				throw new IllegalArgumentException("Name or Number: Null Exception");
			}
		} catch (IllegalArgumentException e) {
			return e.getMessage();
		}
	}

	public TreeMap<String, String> print() {
		return data;
	}

	public static void main(String[] args) {
		DirectoryClass directory = new DirectoryClass();
		System.out.println(directory.putNumber("A1", "1111"));
		System.out.println(directory.putNumber("A2", "2222"));
		System.out.println(directory.putNumber("A3", "3333"));
		System.out.println(directory.putNumber(null, "4444"));
		System.out.println(directory.print());
		System.out.println(directory.getNumber("A1"));
		System.out.println(directory.getNumber("A2"));
		System.out.println(directory.getNumber("A3"));
		System.out.println(directory.getNumber("A55"));

	}

}
