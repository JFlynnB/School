package com.apolis.javabasicsDay2_May19;
import java.util.ArrayList;

public class Multiplier {
	
	public static int getSquare(int x) {
		x = x * x;
		return x;
	}
	
	public static void main(String[] args) {
		int x = 5;
		System.out.println("The value of x is :" + x);
		System.out.println("x squared is :" + getSquare(x));
		System.out.println("The value of x after being operated on is :" + x); 
		//The value of x at this point is still 5 because only the value has been passed to the getSquare method.
		
		//Everything below this is an example of passing by reference
		ArrayList<Integer> sequence = new ArrayList<Integer>();
		sequence.add(2);
		sequence.add(4);
		sequence.add(6);
		Even.countEvens(sequence);
		sequence.forEach((e) -> System.out.println(e));
	}

}

class Even{
	
	public static void countEvens(ArrayList<Integer> sequence) {
		int x = 0, y;
		try {
			x = (int) sequence.get(sequence.size() - 1);
		}catch(ArrayIndexOutOfBoundsException e){
			System.err.println("The array was not long enough!");
		}
		y = x + 2;
		sequence.add(y);
	}
}
