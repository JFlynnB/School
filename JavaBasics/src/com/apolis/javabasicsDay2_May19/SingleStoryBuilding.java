package com.apolis.javabasicsDay2_May19;

public final class SingleStoryBuilding extends Building {
	
	final static int FLOORS;

	//this is an example of a static block
	static {
		FLOORS = 1;
	}

	public SingleStoryBuilding(int rooms, double squareFeet) {
		super(rooms, squareFeet);
	}
	
	public String toString() {
		return "A single-story building with " + rooms + " rooms(s) and " + squareFeet + " square feet.";
	}
	public static void main(String[] args) {
		             //This demonstrates the creation of an object using the new keyword.
		SingleStoryBuilding myHome = new SingleStoryBuilding(3, 600.0);
		System.out.println(myHome);
	}
}
