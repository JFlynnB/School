package com.apolis.Collections;

import java.util.Comparator;
import java.util.TreeSet;

public class CompareExample {

	public static void main(String[] args) {
		TreeSet<Employee> mySet = new TreeSet<>(new EmployeeComparator());

	}

}

class Employee{
	String firstName, lastName;
	int idNumber;
	
	Employee(String firstName, String lastName, int idNumber){
		this.firstName = firstName;
		this.lastName = lastName;
		this.idNumber = idNumber;
	}
}

class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee arg0, Employee arg1) {
		if(arg0.idNumber < arg1.idNumber) {return -1;}
		if(arg0.idNumber > arg1.idNumber) {return 1;}
		return 0;
	}
	
}
