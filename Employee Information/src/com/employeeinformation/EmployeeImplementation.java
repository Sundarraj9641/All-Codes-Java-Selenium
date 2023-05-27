package com.employeeinformation;

public class EmployeeImplementation {
	
	public Employee getEmployeeinfo(String str){
		String part[] = str.split("@|-|#");
		String name = part[0];
		String ssn = part[1];
		String dept =part[2];
		String salary1 = part[3];
		int salary = Integer.parseInt(salary1);
		
		return new Employee(name,ssn,dept, salary);
		
	}
	
	public String getEmployeedept(Employee e) {
		String lastthree = (e.ssn.substring(e.ssn.length()-3));
		
		int lT = Integer.parseInt(lastthree);
		
		if(lT>=1 && lT<=60) {
			return "L1";
		} else if(lT>=61 && lT<=120) {
			return "L2";
		} else if(lT>=121 && lT<=180) {
			return "L3";
	}
		else {
			return "L4";
		}
	}
}
