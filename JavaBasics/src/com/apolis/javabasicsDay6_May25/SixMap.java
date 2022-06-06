package com.apolis.javabasicsDay6_May25;

import java.util.HashMap;
import java.util.Map;

/* 6.add elements in the map and print them using for each. */
public class SixMap {

	public static void main(String[] args) {
		
		Map<Integer, String> theMap = new HashMap<>();
		
		theMap.put(3, "Flour");
		theMap.put(1, "Chicken");
		theMap.put(4, "Garlic");
		theMap.put(0, "Apple");
		theMap.put(2, "Rice");
		
		for(Map.Entry<Integer, String> item : theMap.entrySet()) {
			System.out.println(item.getKey() + " " + item.getValue()); 
		}
	}
}
