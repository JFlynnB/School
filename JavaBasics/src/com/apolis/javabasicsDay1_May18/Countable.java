package com.apolis.javabasicsDay1_May18;

@FunctionalInterface
public interface Countable {

	//A method for quickly counting packages of items.
	//Given the number of groups and the number of items in a group,
	//Prints then returns the total quantity of the item in question.
	public int count(int numOf, int groupsOf);
}
