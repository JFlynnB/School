package com.apolis.javabasicsDay9_May31;
/*
 * Ques 4 -  Given three integer arrays sorted in ascending order, find the smallest number that is common in all three arrays.
 */
public class FOURCommon {

	public static void main(String[] args) {
		
		int[] first = ArrayGenerator.getBigger();
		int[] second = ArrayGenerator.getBigger();
		int[] third = ArrayGenerator.getBigger();
		
		int smallest = 1000000;
		
		for(int i = 0; i < first.length; i++) {
			for(int j = 0; j < second.length; j++) {
				if(first[i] == second[j]) {
					for(int k = 0; k < third.length; k++) {
						if(second[j] == third[k] && third[k] < smallest) {
							smallest = third[k];
						}
					}
				}
				
			}
			
		}
		ArrayGenerator.toScreen(first);
		ArrayGenerator.toScreen(second);
		ArrayGenerator.toScreen(third);
		if(smallest != 1000000) {
			System.out.println("The smallest common element was : "+ smallest);
		}else {
			System.out.println("There was not a common element.");
		}
		

	}

}
