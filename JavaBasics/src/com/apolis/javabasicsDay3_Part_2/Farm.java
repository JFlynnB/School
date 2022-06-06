package com.apolis.javabasicsDay3_Part_2;
/* This and the Farmer class are used for both the shallow cloning and deep cloning examples */
public class Farm {
	String cropGrown;    
	int numberOfAnimals;
	
	Farm(int numberOfAnimals, String cropGrown){
		this.numberOfAnimals = numberOfAnimals;
		this.cropGrown = cropGrown;
	}

	@Override
	public String toString() {
		return "Farm [cropGrown=" + cropGrown + ", numberOfAnimals=" + numberOfAnimals + "]";
	}
	
}
