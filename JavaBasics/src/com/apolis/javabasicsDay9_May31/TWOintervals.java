package com.apolis.javabasicsDay9_May31;

/*
 * Ques 2 - Given an array of intervals as input where each interval has a start and end timestamps.
      Input array is sorted by starting timestamps.
      Merge overlapping intervals and return output array (list).
      Eg:
      Input: Intervals [(1, 5), (3, 7), (4, 6), (6, 8)]
      Output: [(1, 8)]		 
	  
	  For each interval in the input list,
		Step 1: check if the current element  value < the output interval y value. If it is, then it is overlapping
		Step 2: Update last interval of output list with merged interval i.e. the max value between y1 & y2
		Step 3: If it is not overlapping, add the current input interval element to the output list
 */
public class TWOintervals {

	public static void main(String[] args) {
		Interval[] array = {
				new Interval(1, 5),
				new Interval(3, 7),
				new Interval(4, 6),
				new Interval(6, 8)
		};
		Interval[] newArray = new Interval[array.length];
		int newCount = 0;
		int lowestStart = array[0].getStart();
		for(int i = 0; i < array.length - 1; i++) {
			if(array[i].getEnd() > array[i + 1].getStart()) {
				continue;
			}
			if(array[i].getEnd() < array[i + 1].getStart()) {
				newArray[newCount++] = new Interval(lowestStart, array[i + 1].getEnd()));
			}
		}
		
		

	}

}

class Interval{
	int startTimestamp, endTimestamp;
	
	Interval(int start, int end){
		startTimestamp = start;
		endTimestamp = end;
	}
	public int getStart() {
		return startTimestamp;
	}
	public int getEnd() {
		return endTimestamp;
	}
	public String toString() {
		return "(" + startTimestamp + ", " + endTimestamp + ")";
	}
}