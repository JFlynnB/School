package com.apolis.javabasicsDay2_May19;

public class Building {

	
	int rooms;
	double squareFeet;
	
	//this is an example of a constructor with no arguments
	//Note that a default constructor could have been possible if this constructor were not implemented
	//A default constructor would have set rooms to 0, and set squareFeet to 0.0.
	public Building() {
		rooms = 1;
		squareFeet = 1.0;
	}
	//This demonstrates the concept of a Private constructor
	private Building(double squareFeet) {
		this.squareFeet = squareFeet;
	}
	//This demonstrates Constructor Overloading/Chaining
	public Building(int rooms, double squareFeet) {
		this(squareFeet);
		this.rooms = rooms;
	}
	
	

}
