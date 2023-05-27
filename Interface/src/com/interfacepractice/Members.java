package com.interfacepractice;

public class Members extends NonTeachingStaffs implements Students, Staffs  {
	
	public void intro() {
		System.out.println("Hello all !!!!!!");
	}
	
	public void message() {
		System.out.println("We are Students");
	}
	
	public void getmessage() {
		System.out.println("We are Staffs");
	}
	
	public void NonTeach() {
		System.out.println("We are Non Teaching Staffs");
	}

	public static void main(String[] args) {
		
		Members m = new Members();
		
		m.intro();
		m.message();
		m.getmessage();
		m.NonTeach();
		m.count();
	}

}
