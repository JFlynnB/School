package com.apolis.javabasicsDay6_May25;

import java.util.Comparator;
import java.util.TreeSet;

/* 9. custom sorting on strings type of treeset and sorting will be based on ascending of string length. */
public class NineCustomSort {

	public static void main(String[] args) {
		
		NameComparator nc = new NameComparator();
		TreeSet<String> names = new TreeSet<>(nc);
		names.add("Ram");
		names.add("Rajashekar");
		names.add("Vivek");
		names.add("Joshua");
		names.add("John");
		names.add("Patrick");
		
		System.out.println("The custom sorting order is by length ascending.");
		for(String name : names) {
			System.out.println(name);
		}

	}

}

class NameComparator implements Comparator<String>{

	@Override
	public int compare(String name1, String name2) {
		if(name1.length() > name2.length()) {
			return 1;
		}
		if(name1.length() < name2.length()) {
			return -1;
		}
		return 0;
	}
	
}
