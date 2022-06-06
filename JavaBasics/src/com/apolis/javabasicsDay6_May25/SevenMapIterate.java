package com.apolis.javabasicsDay6_May25;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/* 7.print the map elements using entry set and iterator. */
public class SevenMapIterate {

	public static void main(String[] args) {
		
		Map<Integer, String> theMap = new HashMap<>();
		
		theMap.put(3, "Flour");
		theMap.put(1, "Chicken");
		theMap.put(4, "Garlic");
		theMap.put(0, "Apple");
		theMap.put(2, "Rice");
		
		Set<Map.Entry<Integer, String>> theSet = theMap.entrySet();
		Iterator<Map.Entry<Integer, String>> itr = theSet.iterator();
		while(itr.hasNext()) {
			Map.Entry<Integer, String> entry = itr.next();
			System.out.println(entry.getKey() + " " + entry.getValue()); 
		}
	}
}
