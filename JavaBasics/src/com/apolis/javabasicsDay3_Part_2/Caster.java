package com.apolis.javabasicsDay3_Part_2;
/*This is an example that demonstrates upcasting and downcasting */
public class Caster {

	public static void main(String[] args) {
		Square mySquare = new Square();
		Rectangle myRect = mySquare;       //Upcasting has been achieved in this line
		
		myRect.setSide(10.0, 10.0);
		myRect.printArea();
		
		Square nextSquare = (Square) myRect;   //Downcasting has happened to the Rectangle object myRect.
		nextSquare.printArea();

	}

}



//These are the parent and child classes
class Rectangle{
	double length, width;
	
	protected void setSide(double length, double width) {
		this.length = length;
		this.width = width;
	}
	
	public void printArea() {
		double area = length * width;
		System.out.println("The area of this rectangle is : " + area);
	}
}

class Square extends Rectangle{
	void setSide(double sideLength) {
		super.setSide(sideLength, sideLength);
	}
	
	public void printArea() {
		double area = length * width;
		System.out.println("The area of this square is : " + area);
	}
}
