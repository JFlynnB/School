package Arrays;

import java.util.Arrays;

/* position left rotate elements in array. */
public class Two {

	public static void main(String[] args) {
		int[] arr = ArrayGenerator.getTenArray();
		
		System.out.println("Before : " + Arrays.toString(arr));
		leftRotate(arr);
		System.out.println("After : " + Arrays.toString(arr));

	}
	//All the actual logic is right here.
	public static void leftRotate(int[] array) {
		int first = array[0]; //taking the first element
		int temp1 = -1;
		int temp2 = -1;
		for(int i = array.length -1; i >= 0; i--) { //traversing the array in reverse
			if(temp1 == -1) {
				temp2 = first;
			}else {           //imagine two hands, one passing to the other, moving down the array
				temp2 = temp1;
			}
			
			temp1 = array[i]; //reading
			array[i] = temp2; //re-assigning
		}
	}

}
