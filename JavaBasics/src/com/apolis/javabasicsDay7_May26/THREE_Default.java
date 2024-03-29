package com.apolis.javabasicsDay7_May26;

/* 3.Implement example of default method  */
public class THREE_Default {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Bendable bender = () -> System.out.println("I'm gonna bend it!");
		bender.bend();
		bender.debend();
	}

}

interface Bendable{
	public void bend();
	public default void debend() {
		System.out.println("I can't do that! You'd need some kind of crazy De-Bender.");
	}
}