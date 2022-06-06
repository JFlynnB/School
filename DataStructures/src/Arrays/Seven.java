package Arrays;

import java.util.Arrays;
/* sort in ascending or descending order */
public class Seven {

	public static void main(String[] args) {
		
		int[] arr = ArrayGenerator.getBiggerArray();
		System.out.println("Before : " + Arrays.toString(arr));
		
		for(int i = arr.length; i > 0; i--) {
			
			for(int k = 0; k < i; k++) {
				if((k + 1) < arr.length) {
					if(arr[k] > arr[k+1]) {swap(k, k+1, arr);}
				}
			}
			
		}
		
		System.out.println("After a good sort : ");
		System.out.println(Arrays.toString(arr));

	}
	
	public static void swap(int position1, int position2, int[] array) {
		int temp1 = array[position1];
		int temp2 = array[position2];
		array[position1] = temp2;
		array[position2] = temp1;
	}   //Swap accomplished!

}
