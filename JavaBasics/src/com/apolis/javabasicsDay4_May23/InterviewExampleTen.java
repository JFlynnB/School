package com.apolis.javabasicsDay4_May23;

public class InterviewExampleTen {

	public static void main(String[] args) {
		
		System.out.println("The final value we actualy get is : "+ getValue());
	}
	
	@SuppressWarnings("finally")
	static int getValue() {
		
		try {
			@SuppressWarnings("unused")
			int data = 1 / 0;
			System.out.println("That wasn't supposed to work, actually...");
			return 10;
		}catch(ArithmeticException ae) {
			System.out.println("I meant to do that. Math exception caught!");  //This line still happens
			return 15;            //Since this would prevent the finally block from working, it does not happen.
		}finally {
			System.out.println("What had really happened was...");
			return 20;
		}
	}

}
