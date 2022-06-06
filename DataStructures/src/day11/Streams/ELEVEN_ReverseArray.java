package day11.Streams;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

/*
 * 11.reverse array using stream
 */
public class ELEVEN_ReverseArray {

	public static void main(String[] args) {
		
		int[] input = {8, 6, 7, 5, 3, 0, 9};
		
		Arrays.stream(input).boxed().collect(Collectors.collectingAndThen(Collectors.toList(), list -> {
			Collections.reverse(list);
			return list.stream();                             
		})).forEach(System.out::println);
	}

}
