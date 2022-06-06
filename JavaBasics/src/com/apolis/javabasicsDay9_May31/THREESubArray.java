package com.apolis.javabasicsDay9_May31;
/*
 * Ques 3 - Given an array, find the contiguous subarray with the largest sum.
 *    Input: -4, 2,-5,1,2,3,6,-5,1
 *    Output: the largest sum subarray starts at index 3 and ends at 6 and the largest sum is 12 
 */
public class THREESubArray {

	public static void main(String[] args) {
		int[] array = ArrayGenerator.getWithNegatives(); //This will return a sorted array with around 20 elements between 0 and 15 
		//int[] array = {-4, 2, -5, 1, 2, 3, 6, -5, 1};
		ArrayGenerator.toScreen(array);
		
		int biggestStart = 0;
		int biggestEnd = array.length - 1;
		int largestSum = sumArray(array);
		int[] biggestArray = array;
		
		for(int i = 0; i < array.length; i++) {
			for(int j = i; j < array.length; j++) {
				if(largestSum < sumArray(splitArray(array, i, j))) {
					biggestArray = splitArray(array, i, j);
					largestSum = sumArray(biggestArray);
					biggestStart = i;
					biggestEnd = j;
				}
			}
		}
		
		System.out.print("Sub-array with the largest sum : ");
		ArrayGenerator.toScreen(biggestArray);
		System.out.println("Array starts at " + biggestStart + " and ends at " + biggestEnd + " and has total : "  + largestSum);

	}
	
	
	//produces an array that is a sub-array of an array from one index to another (inclusive).
	public static int[] splitArray(int[] array, int firstIndex, int lastIndex) {
		int[] newArray = new int[(lastIndex - firstIndex) + 1];
		int x = 0;
		for(int i = firstIndex; i <= lastIndex; i++) {
			newArray[x] = array[i];
			x++;
		}
		return newArray;
	}
	
	public static int sumArray(int[] array) {
		int x = 0;
		for(int i = 0; i < array.length; i++) {
			x += array[i];
		}
		return x;
	}
}
