package com.apolis.javabasicsDay3_May20;

/*This example demonstrates how an abstract method might be implemented */

public abstract class Quadralateral {
	double sideOne, sideTwo, sideThree, sideFour;
	
	Quadralateral(double sideOne, double sideTwo, double sideThree, double sideFour){
		this.sideOne = sideOne;
		this.sideTwo = sideTwo;
		this.sideThree = sideThree;
		this.sideFour = sideFour;
	}

	abstract double getArea();
	
	public static void main(String[] args) {
		Quadralateral myShape = new Square(4.0);
		System.out.println(myShape.getArea());
	}
}

class Square extends Quadralateral{

	Square(){
		this(10.0);
	}
	Square(double sideLength) {
		super(sideLength, sideLength, sideLength, sideLength);
	}
	
	double getArea() {
		return sideOne * sideOne;
	}
	
}
