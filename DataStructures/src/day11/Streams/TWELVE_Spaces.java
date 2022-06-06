package day11.Streams;

/*
 * 12.remove all the spaces from string
 */
public class TWELVE_Spaces {

	public static void main(String[] args) {
		
		String input = new String("T h i s I s T e s t I n p u t");
		
		input.chars().filter( x -> x != 32 )
		.mapToObj(c -> (char) c).forEach(System.out::print);
	}

}
