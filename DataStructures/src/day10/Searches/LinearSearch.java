package day10.Searches;

import java.util.Random;

public class LinearSearch {

	public static void main(String[] args) {
		
		//Making a randomized array
		Random rand = new Random();
		int[] array = new int[100];
		for(int i = 0; i < array.length; i++) {
			array[i] = rand.nextInt(50);              //Fills the array with values between 0 and 20
		}
		
		System.out.println("The array:");              //This is where we print out the array
		for(int i = 0; i < array.length; i++) {
			System.out.print(" " + array[i]);
			if(i != (array.length - 1)) {
				System.out.print(",");
			}
			if(i % 25 == 0 && i != 0) {
				System.out.print("\n");
			}
		}
		System.out.print("\n");                      //Done printing the array
		
		
		int searchingFor = 10;                       //Here we define what we are searching for.
		
		int foundAt = linearSearch(array, searchingFor);
		
		if(foundAt == -1) {
			System.out.println("The array did not contain " + searchingFor);
		}else {
			System.out.println(searchingFor + " first occurs at index " + foundAt);
		}

	}
	
	//Accepts an array and a value, then returns the index of the first occurrance of that value.
	//Uses a linear search pattern, which is extremely simple. Returns -1 if there are no occurrances.
	//Does not require the array to be sorted beforehand.
	public static int linearSearch(int[] array, int value) {
		for(int i = 0; i < array.length; i++) {
			if(array[i] == value)
				return i;
		}
		return -1;
	}

}
