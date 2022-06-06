package com.apolis.javabasicsDay6_May25;

import java.util.ArrayList;
import java.util.List;
import java.util.Iterator;

/* 4.Implements Iterator example with list. */
public class FourIterate {

	public static void main(String[] args) {
		
		List<String> list = new ArrayList<>();
		list.add("Apple");
		list.add("Chicken");
		list.add("Rice");
		list.add("Flour");
		list.add("Garlic");
		
		Iterator<String> itr = list.iterator();
		int count = 0;
		while(itr.hasNext()) {
			System.out.println(count++ + " " + itr.next());
		}

	}

}
