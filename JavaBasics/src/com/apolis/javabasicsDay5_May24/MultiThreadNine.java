package com.apolis.javabasicsDay5_May24;

import java.util.ArrayList;

/* 9. Implements dead lock example */
public class MultiThreadNine {

	public static void main(String[] args) {
		ArrayList<String> shoppingList = new ArrayList<>();
		shoppingList.add("Sugar");
		shoppingList.add("Rice");
		shoppingList.add("Potatoes");
		shoppingList.add("Ginger");
		
		ArrayList<String> nextWeekList = new ArrayList<>();
		nextWeekList.add("Flour");
		nextWeekList.add("Walnuts");
		nextWeekList.add("Bananas");
		nextWeekList.add("Chicken");

		Thread thread01 = new Thread(new Runnable() {
			public void run(){
				swapListItem(shoppingList, nextWeekList, "Sugar");
				}
			});
		Thread thread02 = new Thread(new Runnable() {
			public void run(){ 
				swapListItem(nextWeekList, shoppingList, "Bananas");
			}
			});
			//Start the threads
			thread01.start();
			thread02.start();
		}

	private static void swapListItem (ArrayList<String> fromList, ArrayList<String> toList, String item) {
		//Make sure to put a monitor lock on both ArrayList objects that each thread would use
		synchronized (fromList) {  //The first Thread that reaches this block will prevent the other thread from being able to complete the operation
			synchronized (toList) {   //because one thread is still acquiring the first lock while the other is requesting the second.
				if(fromList.remove(item)){
					toList.add(item);
				}
			}
		}
	}
}