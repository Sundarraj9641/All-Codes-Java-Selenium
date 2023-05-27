package com.employeeinformation;

import java.util.Scanner;
public class Source {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		String str = sc.nextLine();
		
		EmployeeImplementation Ei = new EmployeeImplementation();
		
		Employee e = Ei.getEmployeeinfo(str);
		
	
		System.out.println(Ei.getEmployeedept(e));
		
			sc.close();
	}

}
