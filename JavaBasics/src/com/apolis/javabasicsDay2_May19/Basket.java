package com.apolis.javabasicsDay2_May19;

//This is a demonstration of instance inner class.
public class Basket {
	
	static int maxNumber = 10;
	String typeOfFruit = "Apples";
	class Fruit{
		void determineMaxContents() {
			//Note that both the static variable maxNumber and the non-static typeOfFruit are accessible
			//to this non-static class
			System.out.println("There can be up to " + maxNumber + " " + typeOfFruit + " in this basket.");
		}
	}
	
	public static void main(String[] a) {
		Basket mybasket = new Basket();               //Because the inner class is non-static, both the outer class
		Basket.Fruit myfruit = mybasket.new Fruit();  // and the inner class need to be instantiated before methods
		myfruit.determineMaxContents();               // from the nested class can be used.
	}

}
