package Arrays;

import java.util.Arrays;
/* print smallest and biggest number in the array. */
public class Five {

	public static void main(String[] args) {
		
		int[] arr = ArrayGenerator.getTenArray();
		System.out.println("Before : " + Arrays.toString(arr));
		
		int smallest = arr[0];
		int biggest = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(smallest > arr[i]) {smallest = arr[i];}
			if(biggest < arr[i]) {biggest = arr[i];}
		}
		
		System.out.println("Smallest number in the array : " + smallest);
		System.out.println("Biggest number in the array : " + biggest);
		//This one was pretty easy.
	}

}
