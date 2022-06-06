package com.apolis.javabasicsDay2_May19;
//This is to demonstrate init blocks
public class Car {

	final String vin; //VIN is not initialized during declaration 
	//vin demonstrates an example of a blank final instance variable
	
	/*int year;
	String make, model;
	
	{
		System.out.println("ALL cars MUST be assigned a VIN!");
	} */
	
	public Car(String vin) {
		this.vin = vin;        //VIN cannot be changed once assigned
	}
	
	public static void main(String[] args) {
		Car myCar = new Car("T123FD6453G9472");
		System.out.println("My car's VIN is : " + myCar.vin);
	}
}
