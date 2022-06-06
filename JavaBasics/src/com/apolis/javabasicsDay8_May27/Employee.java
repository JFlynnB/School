package com.apolis.javabasicsDay8_May27;


class Employee implements Comparable<Employee>{

	String firstName;
	int employeeID;
	
	Employee(String firstName, int employeeID){
		this.firstName = firstName;
		this.employeeID = employeeID;
	}
	@Override
	public int compareTo(Employee subject) {
		if(this.employeeID > subject.employeeID)
			return 1;
		if(this.employeeID < subject.employeeID)
			return -1;
		else
			return this.firstName.compareTo(subject.firstName);
	}
	
	@Override
	public String toString() {
		return new String(employeeID + " " +  firstName);
	}
	
}