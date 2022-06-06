package com.apolis.javabasicsDay6_May25;

import java.util.TreeSet;

/* 8.perform Default sorting using tree set. */
public class EightTreeSort {

	public static void main(String[] args) {
		
		TreeSet<String> names = new TreeSet<>();
		names.add("Ram");
		names.add("Rajashekar");
		names.add("Vivek");
		names.add("Joshua");
		names.add("John");
		names.add("Patrick");
		
		System.out.println("The default sorting order is alphabetical");
		for(String name : names) {
			System.out.println(name);
		}
	}
}
