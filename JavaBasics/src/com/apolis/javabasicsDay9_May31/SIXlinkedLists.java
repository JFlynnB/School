package com.apolis.javabasicsDay9_May31;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.ListIterator;

/*
 * Ques 6: Given two sorted linked lists, merge them such that resulting linked list is also sorted.
 *   Input: List1: 4, 8, 15, 19        List2: 7, 9, 10, 16
 *   Output:  4, 7, 8, 9, 10, 15, 16, 19
 */
public class SIXlinkedLists {

	public static void main(String[] args) {
		
		LinkedList<Integer> list1 = new LinkedList<Integer>(Arrays.asList(4, 8, 15, 19));
		LinkedList<Integer> list2 = new LinkedList<Integer>(Arrays.asList(7, 9, 10, 16));
		LinkedList<Integer> newList = new LinkedList<Integer>();
		
		ListIterator<Integer> itr1 = list1.listIterator();
		ListIterator<Integer> itr2 = list2.listIterator();
		
		Integer e1 = itr1.next();
		Integer e2 = itr2.next();
		
		while(itr1.hasNext() && itr2.hasNext()) {
			
			
			
			if(e1.intValue() > e2.intValue()) {
				newList.add(e2);
				e2 = itr2.next();
				continue;
			} 
			if(e1.intValue() < e2.intValue()) {
				newList.add(e1);
				e1 = itr1.next();
				continue;
			}
			if(e1.intValue() == e2.intValue()) {
				newList.add(e1);
				newList.add(e2);
				e1 = itr1.next();
				e2 = itr2.next();
			}
			
		}//After this point, there will be no more elements left in at least one of the argument lists 
		
		while(itr1.hasNext()) {
			newList.add(itr1.next());
		}
		while(itr2.hasNext()) {
			newList.add(itr2.next());
		}
		
		//The finished list should now exist
		ListIterator<Integer> itr3 = newList.listIterator();
		while(itr3.hasNext()) {
			System.out.print(" " + itr3.next().toString() + "," );
		}

	}

}