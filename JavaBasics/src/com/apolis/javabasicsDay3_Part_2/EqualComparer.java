package com.apolis.javabasicsDay3_Part_2;
/* Demonstrates a custom implementation of the equals() method */
public class EqualComparer {

	public static void main(String[] args) {
		Car myCar = new Car(2004, "Honda", "Civic");
		Car yourCar = new Car(2004, "Honda", "Civic");
		System.out.println("My car is " + myCar.toString());
		System.out.println("Your car is " + yourCar.toString());
		System.out.println("Our cars are the same : " + myCar.equals(yourCar));

	}
}

class Car{
	int year;
	String make, model;
	
	Car(int year, String make, String model){
		this.year = year;
		this.make = make;
		this.model = model;
	}
	//This is a custom implementation of the equals() method which overrides java.lang.Object.equals()
	public boolean equals(Car obj) {
		if(obj == null) {return false;}
		if(obj instanceof Car != true) {return false;}
		else {
			return obj.year == this.year && obj.make.equals(this.make) && obj.model.equals(this.model);
		}	
	}
	public String toString() {
		return "Car [year=" + year + ", make=" + make + ", model=" + model + "]";
	}
}


