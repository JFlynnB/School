package com.apolis.javabasicsDay6_May25;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
/* 5.implements List Iterator example with list Iterator. */
public class FiveListIterate {

	public static void main(String[] args) {
		
		List<String> list = new LinkedList<>();
		list.add("Apple");
		list.add("Chicken");
		list.add("Rice");
		list.add("Flour");
		list.add("Garlic");
		
		ListIterator<String> itr = list.listIterator();
		
		while(itr.hasNext()) {
			System.out.println(itr.nextIndex() + " " + itr.next());
		}
		while(itr.hasPrevious()) {
			System.out.println(itr.previousIndex() + " " + itr.previous());
		}

	}

}
