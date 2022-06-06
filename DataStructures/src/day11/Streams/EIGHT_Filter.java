package day11.Streams;

import java.util.Arrays;

/*
 * 8.filter only the first 3 strings in {"Bus", "car", "bicycle", "train"}
 */
public class EIGHT_Filter {
	static int count;      //Important for the Predicate

	public static void main(String[] args) {
		
		String[] input = { "Bus", "car", "bicycle", "train"};
		count = 0;                                       
		
		Arrays.stream(input).filter(s -> count++ > 2).forEach(System.out::print);   //This contains the Stream expression
	}

}
