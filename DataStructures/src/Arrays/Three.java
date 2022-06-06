package Arrays;
import java.util.Arrays;
/* print all duplicate elements in the array. */
public class Three {

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
		String result = "";
		for(int i = 0; i < elements.length; i++) {
			if(elements[i] == -1 && i == 0) {result = "none";}
			if(elements[i] == -1) {break;}  //if we're reading unassigned elements we don't need to go on.
			if(frequency[i] > 1) {
				result = result.concat(Integer.toString(elements[i]) + ", ");
			}
		}
		
		System.out.println("Numbers that repeat :");
		System.out.println(result);
	}

}
