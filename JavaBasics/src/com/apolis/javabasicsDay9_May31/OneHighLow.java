package com.apolis.javabasicsDay9_May31;
/*
 * Ques 1 - Given a sorted array of integers, return the low and high index of the given key.
 *       Return -1 if not found. The array length can be in millions with lots of duplicates. 
 * 
 */
public class OneHighLow {

	public static void main(String[] args) {
		
		//int[] array = ArrayGenerator.getSorted(); //This will return a sorted array with around 20 elements between 0 and 15
		int[] array = {0, 0, 1, 3, 4, 4, 5, 5, 5, 7, 7, 8, 9};
		int key = 5;    //This could be any integer 
		//ArrayGenerator.toScreen(array);
		System.out.println("The key : " + key);
		System.out.println("The low and high indexes of key : " + getLowHigh(array, key));
		
	}
	
	public static String getLowHigh(int[] array, int key) {
		int low = -1;
		int high = -1;
		int count = 0;
		while(count < array.length) {
			
			if(array[count] == key) {
				if(low == -1) {
					low = count;
				}
				high = count;
			}
			count++;
		}
		
		if(low == -1) {
			return Integer.toString(low);
		}
		
		return new String(low + ", " + high);
	}
}
