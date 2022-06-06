package com.apolis.javabasicsDay1_May18;

public class Employee {
	
	static protected String companyName; //An example of a Static data member
	protected String firstName, lastName;
	protected int age;
	
	//default constructor
	public Employee() {
		
	}	
	
	//set the name of the employee's company
	//Demonstrates an example of a static method
	public static void setCName(String cName) {
		companyName = cName;
	}
	
	//sets first and last name of employee
	//Demonstrates Data Shadowing
	public void updateName(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	
	//sets age of employee
	//Overloads method to set name
	public void setAge(int age) {
		this.age = age;
	}
	
	//Prints the basic information about the employee
	//Demonstrates Single Inheritence
	public void printEmpInfo() {
		System.out.println("Employee's First Name : " + firstName);
		System.out.println("Employee's Last Name  : " + lastName);
		System.out.println("Employee's Age        : " + age);
		printCompany();
	}
	
	//Prints the company the employee works for.
	//An example of a static method
	public static void printCompany() {
		System.out.println("Company worked for : " + companyName);
	}
	
	public static void main(String[] args) {
		
		Employee emp1 = new Employee();
		emp1.updateName("Joshua", "Billinghurst");
		emp1.setAge(34);   //Uses overloaded method for compile-time polymorphism
		emp1.printEmpInfo(); //prints employee data before update to static variable
		companyName = "Walmart";
		System.out.println("------------Employee 1 data----------");
		emp1.printEmpInfo();
		Manager emp2 = new Manager();
		emp2.updateName("Colton", "Cantrell");
		emp2.setAge(27);
		emp2.setNumOfManagees(3);
		System.out.println("------------Employee 2 data----------");
		emp2.printEmpInfo();
		
	}
	
}
