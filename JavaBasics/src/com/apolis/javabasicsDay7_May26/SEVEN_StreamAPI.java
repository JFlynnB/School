package com.apolis.javabasicsDay7_May26;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/* 5.implement predicate ,and(), or(), negate() methods with any example.
 * 
 * 7.stream api implementations
 */
public class SEVEN_StreamAPI {

	public static void main(String[] args) {
		
		List<String> shoppingList = Arrays.asList("Chicken", "Potatoes", "Carrots", "Ginger", "Flour", "Oil", "Salt");
		
		/* Print out each element of the List */
		//      List is a Collection.
		//     /           method of the Collection interface that returns an instantiation of a Stream object
		//    /           /          method of the Stream interface that accepts a Consumer, which is a functional interface
		//   /           /          /           :: is used to reference a method. Here the we set the implementation of Consumer.accept(T t)
		//  /           /          /              /
		shoppingList.stream().forEach(System.out::println);
		

		//2.  Arrays.stream(T[] array);
		
		Arrays.stream(new String[] {"Fish, ", "Celery, ", "Eggs, ", "Tumeric, ", "Coconut, ", "Sesame Seeds, \n"}).forEach(System.out::print);
		

		//3. Stream.of(value1,value2, ...);
		//    Even though Stream is an interface, Stream.of() has an implementation
		//    /     You can just pass values to this and you will get a Stream. It's awesome! They have to be the same type, though
		//   /     /
		Stream.of("Tofu", "Onions", "Garlic", "Pepper", "Vinigar").forEach(System.out::println);

		//4. string.chars.map(x->(char)x);
		String myName = "Billinghurst"; //This is my last name in String form
		//
		//
		//           A CharSequence interface method implemented by the String class. Returns an IntStream (interface)
		//          /   containing the numbers of the individual characters
		//         /          Takes an IntFunction (functional interface {apply(int x)}) and returns a Stream.
		//        /          /          A lambda expression that just casts the ints in the IntStream to chars.
		//       /          /          /        Takes another functional interface.
		//      /          /          /        /
		myName.chars().mapToObj(x->(char)x).forEach((c) -> System.out.println(c) );  //Equivalent to System.out::println
			
		//Terminal operations convert stream into different formats
		
		//toList
		List<String> groceries = Arrays.asList("Pork", "Chives", "Mayonnaise", "Tomatoes", "Lettuce", "Bread")
		        //      Returns a Stream
				//     /        Accepts a Collector (interface) to be used to turn the Stream into a mutable container
				//    /       /            Final class implementing Collector
				//   /       /           /       static method that returns a Collector that will collect into a List
				//  /       /           /       /
				.stream().collect(Collectors.toList());
		System.out.println(groceries);

		//To set
		Set<String> moreGroceries = Arrays.asList("Broccoli","Kale","Cheese","Ketchup").stream().collect(Collectors.toSet());
		//                                                                                                     \
		//                                                                                                      Like toList() but for Sets
		System.out.println(moreGroceries);
				 
		//To Array
		String[] foodBag = Arrays.asList("Paprika","Eggplant","Cumin","Coriander","Poptarts").stream().toArray(String[]::new);
		System.out.println(Arrays.toString(foodBag));                                 //String[] java.util.function.IntFunction.apply(int value)
		

		//Intermediate operation:
		 Arrays.asList("Cereal","Pasta","Beans","Cola","Squash").stream().filter(str->str.length()>3).forEach((x) ->System.out.print(x +", "));
		 //                                                                            \
		 //                                                                       Stream.filter() accepts a Predicate as an argument.
		 //                                                                 It will automatically cast a lambda function as a Predicate.test() function
		 System.out.println();
		 //                                                      //All three of these functions are from the Stream Interface and return a Stream.
		 Arrays.stream(new Integer[] {2, 3, 5, 8, 13, 21, 34, 55}).filter(x->x%2==0).map(x->(x+1)).forEach((x) ->System.out.print(x +", "));
		 System.out.println();                                                                    //Except forEach, which is returns void
		 //               
		 Arrays.stream(new Integer[] {4, 25, 9, 81, 64, 16, 1, 49}).sorted().forEach((x) ->System.out.print(x +", "));
		 //                                                            /
		 //                                            The elements need to be Comparable, otherwise an exception may occur
		 System.out.println();
		 
		 Arrays.stream(new Integer[] {21, 15, 28, 10, 36, 6, 45, 3})
		 //     Accepts a Comparator
		 //      /                                           Integers are already Comparable, but if they weren't this is how you would do it.
		 //     /                                           /
		 .sorted((Comparator<Integer>)(x,y)->(Integer)x.compareTo(y)).forEach((x) ->System.out.print(x +", "));
		 //                    \
		 //                  Casting a lambda function as a Comparator for Integers

	}

}
