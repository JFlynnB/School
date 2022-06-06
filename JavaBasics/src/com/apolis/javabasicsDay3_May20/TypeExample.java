package com.apolis.javabasicsDay3_May20;

/* Demonstrate how type promotion works */

public class TypeExample {

	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	
	TypeExample(){
		a = 100;
		f = e = d = c = b = a;
		
	}
	
	void displayNumber(short number) {
		System.out.println(number);
	}
	void displayNumber(int number) {
		System.out.println(number);
	}
	void displayNumber(float number) {
		System.out.println(number);
	}
	
	
	public static void main(String[] args) {
		TypeExample example = new TypeExample();
		example.displayNumber(example.a);  //there is no problem here because a byte will be implicitly cast as a short
		//example.displayNumber(example.f); This does not work because there is no method that can be passed a double
		example.displayNumber((short)example.f); //This works now because it was cast explicitly
	}

}
