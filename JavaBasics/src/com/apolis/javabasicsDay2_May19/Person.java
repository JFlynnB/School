package com.apolis.javabasicsDay2_May19;

//This is a demonstration of how to implement a Copy Constructor
public class Person {

	public String firstName, lastName;
	public int age;
	
	public Person(String firstName, String lastName, int age) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.age = age;
	}
	
	public Person(Person human) {   //This is the Copy Constructor
		firstName = human.firstName;
		lastName = human.lastName;
		age = human.age;
	}
}
