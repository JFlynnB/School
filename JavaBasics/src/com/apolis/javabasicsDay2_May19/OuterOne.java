package com.apolis.javabasicsDay2_May19;

//This is a class for demonstrating a static inner class and how it functions
public class OuterOne {
	//static data member
	static int x;
	
	static{
		x = 5;
	}
	public OuterOne() {}
	
	private static class Inner {
		static int y = 10; //
		
		static void multiply() {
			int z = x * y;
			System.out.println(x + " times " + y + " is equal to " + z);
		}
	}
	
	public static void main(String[] args) {
		OuterOne.Inner.multiply(); //since the method is static, no Object needs to be instantiated to call the multiply method
	}
	
		
	
	

}
