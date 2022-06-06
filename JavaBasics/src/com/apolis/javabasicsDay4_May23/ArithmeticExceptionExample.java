package com.apolis.javabasicsDay4_May23;
/* Here we show an example of implementation of basic runtime exception handling */
import java.util.InputMismatchException;
import java.util.Scanner;

public class ArithmeticExceptionExample {

	public static void main(String[] args) {
		System.out.println("Give me something to work with.");
		
		Scanner scanner = new Scanner(System.in);
		byte x = 0;
		int y = 0;
		try {
			x = scanner.nextByte();             //This line is still likely to throw an example based on the input.
		} catch(InputMismatchException ime) {   //Here we catch and then handle the most likely exception.
			System.out.println(ime);
			System.out.println("Actually, I need it to be a whole number with an absolute value less than 128.");
			scanner.nextLine();                 //This is necessary to clear the buffer.
			x = scanner.nextByte();            //We will give the user one more chance.
		}
		
		try {
			y = 100/x;         //Bad math is still possible if the user enters 0.
		}catch(ArithmeticException ae) {
			System.out.println("You can't divide by zero!");
		}
		
		
		System.out.println(y);
		
		System.out.println("If you are seeing 0 you gave me bad input.");  
		
		scanner.close();     //You should always close your scanners when you are done with them.

	}

}
