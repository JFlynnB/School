package com.apolis.javabasicsDay6_May25;

import java.util.TreeSet;

/* 10. add student objects in tree set basis on the descending order of their rollno. */
public class TenDescendingTree {

	public static void main(String[] args) {
	
		StudentComparator sc = new StudentComparator();
		TreeSet<Student> set = new TreeSet<>(sc);
		set.add(new Student(4386, "Bob", "Loblaw"));
		set.add(new Student(6834, "Mary", "Sue"));
		set.add(new Student(8463, "James", "Kirk"));
		set.add(new Student(1256, "Harry", "Potter"));
		set.add(new Student(3897, "Bruce", "Wayne"));
		
		for(Student stu : set) {
			System.out.println(stu.rollNo + " " + stu.firstName + " " + stu.lastName);
		}
		
	}

}

class Student {
	int rollNo;
	String firstName, lastName;
	
	Student(int rollNo, String firstName, String lastName){
		this.rollNo = rollNo;
		this.firstName = firstName;
		this.lastName = lastName;
	}
}


