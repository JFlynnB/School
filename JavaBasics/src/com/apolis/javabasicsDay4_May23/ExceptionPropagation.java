package com.apolis.javabasicsDay4_May23;

import java.io.IOException;
/* This is an example of Propagating an exception through a stack of method calls*/
public class ExceptionPropagation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test.methodOne();

	}
	//System.out.println("");
}

class Test{
	
	static void methodOne() {
		System.out.println("Method one is called");
		try{
			methodTwo();   //must be in try/catch block or methodOne must throw the exception.
		}catch(IOException ioe) {  //In this case, we will handle it here.
			System.out.println("Exception caught and handled."); 
		}   //This catch never executes because no exception is ever really thrown.
	}
	
	static void methodTwo() throws IOException {
		System.out.println("Method two is called");
		methodThree(); //must be in try/catch block or methodTwo must throw the exception.
	}                  // methodTwo() will throw the exception in this case
	
	static void methodThree() throws IOException{  //IOException is a checked exception.
		System.out.println("Method three is called");  //This exception MUST be handled at some point.
	}
}
