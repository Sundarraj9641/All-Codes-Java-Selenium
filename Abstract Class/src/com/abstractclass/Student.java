package com.abstractclass;

public class Student extends Member {
	
	public void message () {
		System.out.println("Hello Students!!!!");
	}


	public static void main(String[] args) {
		
		Student st = new Student();
		
		st.message();
		st.greeting();
		

	}

}
