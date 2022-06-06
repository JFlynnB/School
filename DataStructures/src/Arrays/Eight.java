package Arrays;

import java.util.Arrays;
/* reverse the array without using 2nd array. */
public class Eight {

	public static void main(String[] args) {
		
		int[] arr = ArrayGenerator.getBiggerArray();
		System.out.println("Before : " + Arrays.toString(arr));
		
		for(int i = 0; i < arr.length/2; i++) {
			swap(i, ((arr.length - 1) - i), arr);
		}  //Ha! Wasn't even that hard!
		
		System.out.println("After : " + Arrays.toString(arr));
	}

	public static void swap(int position1, int position2, int[] array) {
		int temp1 = array[position1];
		int temp2 = array[position2];
		array[position1] = temp2;
		array[position2] = temp1;
	}   //Swap accomplished!
}
