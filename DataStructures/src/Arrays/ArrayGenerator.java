package Arrays;
import java.util.Random;
/* This is just so I don't have to keep hard coding arrays over and over */
public class ArrayGenerator {

	private static Random random;
	
	static {
		random = new Random();
	}
	
	public static int[] getTenArray() {
		int[] array = {0,0,0,0,0,0,0,0,0,0};
		for(int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt(9) + 1;
		}
		return array;
	}
	
	public static int[] getBiggerArray() {
		int[] array = new int[random.nextInt(20) + 10];
		for(int i = 0; i < array.length; i++ ) {
			array[i] = random.nextInt(10);
		}
		return array;
	}
}
