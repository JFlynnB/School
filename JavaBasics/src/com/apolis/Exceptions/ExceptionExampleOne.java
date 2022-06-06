package com.apolis.Exceptions;
/* This is an example of code that easily throws an unhandled exception and breaks easily */
import java.util.Scanner;

public class ExceptionExampleOne {

	public static void main(String[] args) {
		System.out.println("Give me something to work with.");
		
		Scanner scanner = new Scanner(System.in);
		
		byte x = scanner.nextByte();    //This line will throw an exception if the user inputs a number that is too large,
					// or a number that has a decimal, or something that isn't a number at all. Usually an InputMismatchException.
		double y = 3.14/x;       //This line will not throw an AritmaticException if the user enters "0". y will be "Infinity". 
								// BAD MATH!
		System.out.println(y);
		
		System.out.println("I guess that worked.");  //This code only executes if no exceptions are thrown.
		
		scanner.close();     //You should always close your scanners when you are done with them.

	}

}
