package com.apolis.javabasicsDay9_May31;

import java.util.Random;

/* This is just so I don't have to keep hard coding arrays over and over */
public class ArrayGenerator {

	private static Random random;
	
	static {
		random = new Random();
	}
	
	public static int[] getWithNegatives() {
		int[] array = new int[random.nextInt(20) + 10];
		for(int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt(20) - 10;
		}
		return array;
	}
	
	public static int[] getTen() {
		int[] array = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt(9) + 1;
		}
		return array;
	}
	
	public static int[] getBigger() {
		int[] array = new int[random.nextInt(20) + 10];
		for(int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt(15);
		}
		return array;
	}
	
	public static int[] getSorted() {
		int[] array = getBigger();
		sort(array);
		return array;
	}
	
	public static void sort(int[] array) {
		
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] > array[j + 1]) {
                    swapElements(array, j, (j + 1));
                }
            }
        }
	}
	
	public static void swapElements(int[] array, int index1, int index2) {
		int temp1 = array[index1];
		int temp2 = array[index2];
		array[index1] = temp2;
		array[index2] = temp1;
	}
	
	public static void toScreen(int[] array) {
		System.out.print("The array:");
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " +array[i]);
			if(i != (array.length - 1)) {
				System.out.print(",");
			}
		}
		System.out.print("\n");
	}
}
