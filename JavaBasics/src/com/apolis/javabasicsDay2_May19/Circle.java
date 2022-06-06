package com.apolis.javabasicsDay2_May19;

public class Circle {
	
	final static double PI;  //This is an example of a blank final static data member
	private double radius;
	
	static {
		PI = 3.14159265;   //A blank static data member must be initialized in a static block.
	}
	
	public Circle(double radius) {
		this.radius = radius;
	}
	
	public void setRadius(double newRadius) {
		radius = newRadius;
	}
	
	public double getArea() {
		return (PI * (radius * radius));
	}

	public static void main(String[] args) {
		Circle myCircle = new Circle(5);
		System.out.println("The area of a circle with radius 5 is : " + myCircle.getArea());
		
	}

}


