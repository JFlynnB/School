package com.apolis.javabasicsDay6_May25;

import java.util.Comparator;

public class StudentComparator implements Comparator<Student>{

	@Override
	public int compare(Student stu1, Student stu2) {
		if(stu1.rollNo < stu2.rollNo)
			return 1;
		if(stu1.rollNo > stu2.rollNo)
			return -1;
		else
			return 0;

		
	}
	
}