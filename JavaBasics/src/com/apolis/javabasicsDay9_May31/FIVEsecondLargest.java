package com.apolis.javabasicsDay9_May31;
/*
 * Ques 5 : Find second largest element in an array:
 *   Input: {2, 3, 10, 6, 4, 8, 1}
 *   Output: 8 
 */
public class FIVEsecondLargest {

	public static void main(String[] args) {
		
		int[] array = ArrayGenerator.getBigger();
		int largest = -1;
		int secondLargest = -1;
		
		ArrayGenerator.toScreen(array);  //print the array
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > largest) {
				largest = array[i];
			}
		}
		
		
		for(int i = 0; i < array.length; i++) {
			if(array[i] > secondLargest && largest > array[i]) {
				secondLargest = array[i];
			}
		}
		
		System.out.println("The second largest is : " + secondLargest);
	}

}
