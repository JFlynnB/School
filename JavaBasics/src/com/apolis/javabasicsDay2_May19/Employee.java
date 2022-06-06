package com.apolis.javabasicsDay2_May19;

public class Employee {

	final String birthday;
	String employeeName;
		
	
	public Employee(String bDay, String name) {
		birthday = bDay;
		employeeName = name;
	}
	
	final void printBirthday() {   //Note that this is declared FINAL
		System.out.println(employeeName + " was born on " + birthday);
	}
}
class Manager extends Employee{

	public Manager(String bDay, String name) {
		super(bDay, name);
	}
	//This demonstrates the property of assigning a data member as final
	//Note the error that occurs when we try to update a data member declared as final in the parent class
	public void setBirthday(String newDay) {
		this.birthday = newDay;
	}
	
	
}

class Intern extends Employee{

	public Intern(String bDay, String name) {
		super(bDay, name);
	}
	//This demonstrates the property of assigning a method as final
	//Note the error that occurs when we try to override a method declared as final in the parent class
	public void printBirthday() {
		System.out.println(employeeName + " was born on " + birthday + ". Happy Birthday!");
	}
}
