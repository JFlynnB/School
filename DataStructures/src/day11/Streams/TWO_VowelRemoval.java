package day11.Streams;

import java.util.stream.Collectors;

/*
 * 2.remove vowel from string - "Hello" and print.
 * 
 * 3.part 2 //get String as an output
 */
public class TWO_VowelRemoval {

	public static void main(String[] args) {
		
		String input = new String("Hello");
		//Part 1
		input.chars().filter( x -> x != 97 && x != 101 && x != 105 && x != 111 && x != 117 )
		.mapToObj(c -> (char) c).forEach(System.out::print);
		
		//Part 2 get string as an output.
		String output = input.chars().filter( x -> x != 97 && x != 101 && x != 105 && x != 111 && x != 117 )
		.mapToObj(c -> (char) c).map(c -> c.toString()).collect(Collectors.joining());
		
		System.out.print("\n" + output);
		
	}

}
