package day11.Streams;

import java.util.Arrays;

/*
 * 1.convert array [2,3,1,4,5,3] into stream and print
 */
public class ONE_ArrayConvert {

	public static void main(String[] args) {
		
		int[] array = {2,3,1,4,5,3};
		
		Arrays.stream(array).forEach(System.out::print);     
		
	}

}
