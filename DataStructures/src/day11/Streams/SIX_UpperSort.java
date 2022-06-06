package day11.Streams;

import java.util.Arrays;
import java.util.stream.Collectors;

/*
 * 6.convert all strings with length greater than 3 into uppercase strings,then sort alphabetically
 * 
 * 7.part 2 // get String[] as output.
 */
public class SIX_UpperSort {

	public static void main(String[] args) {
		
		String[] input = { "My", "suffering", "left", "me", "sad", "and", "gloomy"};
		
		Arrays.stream(input).map( s -> {
			if(s.length() > 3) {
				return s.toUpperCase();
			}
			return s;})
		.sorted((s, t) -> s.compareToIgnoreCase(t))
		.forEach(System.out::print);                     //Part 1 complete and printed out.
		
		String[] output = (String[]) Arrays.stream(input).map( s -> {
			if(s.length() > 3) {
				return s.toUpperCase();
			}
			return s;})
		.sorted((s, t) -> s.compareToIgnoreCase(t)).collect(Collectors.toList()).toArray(input);                 
		//Part 2 complete
		for(String s : output) {
			System.out.print(s + " ");
		}
	}

}