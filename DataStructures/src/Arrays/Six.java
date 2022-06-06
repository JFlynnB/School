package Arrays;

import java.util.Arrays;
/* print all elements in the array that are on odd position. */
public class Six {

	public static void main(String[] args) {
		
		int[] arr = ArrayGenerator.getBiggerArray();
		System.out.println("Before : " + Arrays.toString(arr));

		int[] odds = new int[(arr.length / 2)];
		
		for(int i = 1; i < arr.length; i+=2) {
			odds[i/2] = arr[i];
		}
		
		System.out.println("elements in odd positions : " + Arrays.toString(odds));
	}

}
