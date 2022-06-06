package com.apolis.javabasicsDay4_May23;

import java.util.InputMismatchException;
import java.util.Scanner;

public class MultipleCatchExample {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		String input = null;
		byte x = -1;
		System.out.println("Give me something to work with.");
		
		try {
			input = scanner.next();
			if(input.contentEquals("close")) {
				scanner.close();
				scanner.next();
			}else {
				x = Byte.parseByte(input);
			}
			
		}catch(InputMismatchException | NumberFormatException | NullPointerException e) {
			System.out.println("No, I need a number! But not too big. And not zero.");
			x = scanner.nextByte();
		}catch(IllegalStateException ise) {
			System.out.println("You closed the scanner! Why would you do that?");
			System.exit(0);
		}catch(Exception e) {
			System.out.println("Well, that's not what I expected...");
			System.exit(0);
		}finally {
			scanner.close();
			System.out.println("That's all I need.");
		}
		
		System.out.println("Okay, here comes some math! 100 / " + x + " :");
		
		double y = 100.0 / (double) x;
		System.out.println(y);
	}

}
