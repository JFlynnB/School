package day11.Streams;

import java.util.Arrays;

/*
 * 4.Filter all values greater than 2 in an array,then multiply each value by 3,then sum the values
 * 
 * 5.part 2 //do that without using sum method.
 */
public class FOUR_Math {

	public static void main(String[] args) {
		
		int[] input = {2,3,1,4,5,3};
		
		int firstResult = Arrays.stream(input).filter(x -> x > 2).map(x -> x * 3).sum();
		
		System.out.println("The result of part 1 : " + firstResult);  //Part 1 complete
		
		int secondResult = Arrays.stream(input).filter(x -> x > 2).map(x -> x * 3).reduce(0, (x, y) -> x + y);
		
		System.out.println("The result of part 2 : " + secondResult);  //Part 2 complete

	}

}
