package day11.Streams;

import java.util.Arrays;

/*
 * 9.Remove all duplicate values in a list of numbers  without converting
 */
public class NINE_Distinct {

	public static void main(String[] args) {
		
		int[] array = {0, 0, 0, 1, 1, 3, 3, 3, 4, 4, 4, 4, 4, 5, 5, 5, 6, 6, 6, 8, 8, 8, 9};
		
		Arrays.stream(array).distinct().forEach(System.out::print); 
	}

}