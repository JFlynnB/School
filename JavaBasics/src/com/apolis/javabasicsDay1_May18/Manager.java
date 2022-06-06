package com.apolis.javabasicsDay1_May18;

public class Manager extends Employee{
	
	int numberOfManagees;
	
	//default constructor
	public Manager() {

	}
	
	public void setNumOfManagees(int x) {
		numberOfManagees = x;
	}
	/*
	@Override
	//Sets the years that a Manager has been with the company
	//Overrides the method to set an Employee's age
	public void updateEmployee(int years) {
		this.yearsWorked = years;
		
	}
	*/
	@Override
	//Overrides the printEmpInfo method of the Employee class
	//Demonstrates Multilevel Inheritance
	public void printEmpInfo() {
		/*
		System.out.println("Employee's First Name : " + firstName);
		System.out.println("Employee's Last Name : " + lastName);
		System.out.println("Employee's Age : " + age);
		*/
		super.printEmpInfo();
		System.out.println("Managing : " + numberOfManagees + " employees");
		Employee.printCompany();
	}

}
