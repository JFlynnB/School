package com.apolis.javabasicsDay2_May19;

//This class declaration demonstrates the properties of declaring a class as final.
//Note that there is an error when Skyscraper tries to extend SingleStoryBuilding
public class Skyscraper extends SingleStoryBuilding{

	int floors;
	
	public Skyscraper(int floors) {
		this.floors = floors;
	}
}
