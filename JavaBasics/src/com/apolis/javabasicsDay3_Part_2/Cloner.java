package com.apolis.javabasicsDay3_Part_2;
/* This example demonstrates Cloning. */
public class Cloner {

	public static void main(String[] args) {
		//First we create a Car object using specific values.
		Car myCar = new Car(1990, "Volvo", "240DL");
		Car yourCar = (Car) myCar.clone();           //The clone() method is used here to create a new Car object
		//Then we display the values
		System.out.println("My car is a : " + myCar);
		System.out.println("Your car is a : " + yourCar);  //The values are the same.
	}
	static class Car implements Cloneable{
		int year;
		String make, model;
		
		Car(int year, String make, String model){
			this.year = year;
			this.make = make;
			this.model = model;
		}
		public String toString() {
			return "Car [year=" + year + ", make=" + make + ", model=" + model + "]";
		}
		//This returns a different Car object containing identical values
		public Object clone() {
			return new Car(this.year, this.make, this.model);     
		}
	}

}

