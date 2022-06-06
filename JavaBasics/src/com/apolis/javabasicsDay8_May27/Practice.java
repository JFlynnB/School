package com.apolis.javabasicsDay8_May27;

import java.util.Comparator;
import java.util.TreeSet;


/* This is a space to practice concepts that I have learned. */
/* In this Class we we deal with the difference between 
 * the Comparable and Comparator interfaces.
 */

public class Practice {

	public static void main(String[] args) {
		
		
		TreeSet<Employee> employees = new TreeSet<>();
		employees.add(new Employee("Ram", 22));
		employees.add(new Employee("Rajashekar", 34));
		employees.add(new Employee("Vivek", 87));
		employees.add(new Employee("Joshua", 23));
		employees.add(new Employee("John", 47));
		employees.add(new Employee("Patrick", 23));
		
		System.out.println("The default sorting order is alphabetical");
		for(Employee emp : employees) {
			System.out.println(emp);
		
		
	}

}



class EmployeeComparator implements Comparator<Employee>{

	@Override
	public int compare(Employee emp1, Employee emp2) {
		if(emp1.employeeID > emp2.employeeID)
			return 1;
		if(emp1.employeeID < emp2.employeeID)
			return -1;
		else
			return 0;
	}
}
}