package com.apolis.javabasicsDay3_May20;

/*Demonstrate an Anonymous Inner Class */

public class Parent {
	
	protected int x = 10;
	
	Parent(int newX){
		x = newX;
	}
	
	void displayValue() {
		System.out.println("The value of x is :" + x);
	}
	
	public static void main(String[] args) {
		
		Parent temp = new Parent(30) {        //An Anonymous inner class is implemented here
			void displayValue() {
				System.out.print(" The \n value \n of \n x \n is \n " + x);
			}
		};
		temp.displayValue(); //calls the overridden version of the method in the anonymous child class
	}

}
