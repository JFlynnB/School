package com.apolis.javabasicsDay7_May26;

/* Implement lambda expressions in all of these forms
 * 
 * 1.(int x,int y) -> { int z = x+y; System.out.println(z);}
 * 
 * 2.(x,y) -> {int z =x+y;System.out.println(z);}
 * 
 * 3. x -> { int y = x*x; System.out.println(y);}   
 * 
 * 4. x -> System.out.println(x);  
 * 
 * 5. x -> x*x;
 */

public class ONE_Lambdas {

	public static void main(String[] args) {
		
		//Repeats a phrases a given number of times
		Two repeater = (int x, String y) -> {
			for(int i = 0; i < x; i++)
				System.out.println(y);
		};
		repeater.display(3, "Horray! ");
		
		//Splits a phrase into two at a given index
		Two splitter = (x, y) -> {
			System.out.println(y.substring(0, x));
			System.out.println(y.substring(x));
		};
		splitter.display(4, "Billinghurst");
		
		//Prints the square of a number 
		OneThree squarer = x -> {
			int z = x * x;
			System.out.println(x + " times " + x + " is equal to " + z);
		};
		squarer.display(3);
		
		//Does what is says on the label
		OneFour print = x -> System.out.println(x);
		print.line("Hey, this was much easier to type over and over again.");
		
		//A squaring expression with a simpler call
		OneFive sq = x -> x * x;
		System.out.println("5 is the square root of " + sq.square(5));
		
		
	}

}

interface OneThree{
	public void display(int x);
}

interface OneFour{
	public void line(String string);
}

interface OneFive{
	public int square(int x);
}
