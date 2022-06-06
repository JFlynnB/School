
package com.apolis.javabasicsDay4_May23;

import java.io.IOException;
/* This demonstrates how exception throwing affects Parent/Child class methods being overridden */
public class ExceptionInOverriding {

	public static void main(String[] args) {
		ParentOne myObj = new ChildOne();
		
		try{
			myObj.methodOne();
		}catch(IOException ioe) {
			System.out.println("Checked exception caught.");
		}
		myObj.methodTwo(); //this can be done because the method in the Parent class does not throw anything.
		myObj.methodThree();
		myObj.methodFour();
	}
	//System.out.println("");

}

class ParentOne{
	
	void methodOne() throws IOException{
		System.out.println("Parent method that throws a checked exception");
	}
	void methodTwo() {
		System.out.println("Parent method that does not throw an exception.");
	}
	void methodThree() throws IndexOutOfBoundsException{
		System.out.println("Parent method that throws an unchecked exception.");
	}
	void methodFour() {
		System.out.println("Parent method that does not throw an exception.");
	}
}

class ChildOne extends ParentOne{
	
	void methodOne() {
		System.out.println("Child method that does not throw an exception.");
	}
	//void methodTwo() throws IOException{       
	//	System.out.println("Child method that throws a checked exception.");
	//}     In this case, because the super method does not throw the check exception, overriding is not possible.
	void methodThree() {
		System.out.println("Child method that does not throw an exception.");
	}
	void methodFour() throws IndexOutOfBoundsException{
		System.out.println("Child method that throws an unchecked exception.");
	}
}
