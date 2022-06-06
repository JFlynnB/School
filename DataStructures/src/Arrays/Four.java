package Arrays;

import java.util.Arrays;
/* print first unique element in array. */
public class Four {

	public static void main(String[] args) {
		
		int[] arr = ArrayGenerator.getBiggerArray();
		System.out.println("Before : " + Arrays.toString(arr));
		
		int[] elements = new int[arr.length];
		int[] frequency = new int[arr.length];
		
		for(int i = 0; i < elements.length; i++) {
			elements[i] = -1;
		}   //We make all the elements equal to -1 so that we can tell which positions haven't been assigned yet
		
		for(int i = 0; i < arr.length; i++) {
			int x = arr[i];            //Here we consider the number in each index of the array.
			
			for(int j = 0; j < elements.length; j++) {  //And here we make we keep track of how many
				if(x == elements[j]) {					//that we saw of each one.
					frequency[j]++;
					break;
				}if(elements[j] == -1) {      //if an element here is -1 we know it is unassigned.
					elements[j] = x;
					frequency[j] = 1;  //1 because this is the first time we have found this number
					break;           // we are done with this for loop. we found what we need.
				}
			}   
		}
		String result = "No unique numbers.";
		for(int i = 0; i < elements.length; i++) {
			if(frequency[i] == 1) {
				result = Integer.toString(elements[i]);
				break;
			}
			
		}
		System.out.println("The first unique number:");
		System.out.println(result);

	}

}
