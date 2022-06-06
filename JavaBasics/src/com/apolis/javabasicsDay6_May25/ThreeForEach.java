package com.apolis.javabasicsDay6_May25;

import java.util.ArrayList;
/* 3.add elements to arraylist and print them using for each. */
public abstract class ThreeForEach {

	public static void main(String[] args) {


		ArrayList<String> thingsBought = new ArrayList<String>();
		thingsBought.add("Apple");
		thingsBought.add("Apple");
		thingsBought.add("Rice");
		thingsBought.add("Flour");
		thingsBought.add("Garlic");
		System.out.println("The things I bought: ");
		for(String item : thingsBought) {
			System.out.println(item);
		}
	}

}
