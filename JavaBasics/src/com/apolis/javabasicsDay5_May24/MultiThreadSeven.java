package com.apolis.javabasicsDay5_May24;

import java.util.Arrays;

/* 7. Implement synchronization block */
public class MultiThreadSeven {

public static void main(String[] args) {
		
		int[] array = {1, 2, 3, 4, 5, 6, 7};
		
		
		
		Thread thread01 = new Thread(new RunnableSeven(array, 3, 4));
		Thread thread02 = new Thread(new RunnableSeven(array, 2, 3));
		
		 thread01.start();
		 thread02.start(); 
		 
		 
	}

}

class RunnableSeven implements Runnable{
	int[] theArray;
	int pos1, pos2;
	
	RunnableSeven(int[] array, int x, int y){
		theArray = array;
		pos1 = x;
		pos2 = y;
	}
	@Override
	public void run() {
		
		synchronized(theArray) {
			System.out.println("The array before the swap: ");
			this.printArray();
			swapElements(pos1, pos2, theArray);
			System.out.println("The array after the swap: ");
			this.printArray();
		}
	}
	
	public static void swapElements(int position1, int position2, int[] arr) {
		
		int temp1 = arr[position1];
		int temp2 = arr[position2];
		arr[position1] = temp2;
		arr[position2] = temp1;
	}
	
	public void printArray() {
		System.out.println(Arrays.toString(theArray));
	}
}

