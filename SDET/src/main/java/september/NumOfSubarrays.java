package september;

import org.junit.Test;

import junit.framework.Assert;

public class NumOfSubarrays {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: arr =
	 * [2,2,2,2,5,5,5,8], k = 3, threshold = 4 Output: 3
	 * 
	 * 3) Do I know how to solve this? Yes 4) Ask for hints, if you do not
	 * understand !! 5) Do I know alternate solutions? No 6) If you know more than
	 * one, then do this. 7) Start with Psuedo code 1. startPointer=0,counter=0; 2.
	 * iterate through while loop for 1st subarray with condition startPointer< k 3.
	 * do the sum and avg and compare with threshold 4. condition mathing increament
	 * the counter 5. iterate through while loop for subsequent arrays with
	 * condition of startPointer < arr.length 6. while do the sum remove the
	 * previous element value and add the next element 7. do the sum and avg and
	 * compare with threshold, condition mathing increament the counter 8) Implement
	 * the code int startPointer=0,sum=0; double avg=0.0; while(startPointer<k){
	 * sum+= arr[startPointer]; startPointer++; } avg=sum/k; if(avg<=t) counter++;
	 * 
	 * 
	 * while(startPointer<arr.length){
	 * 
	 * sum+= arr[startPointer]-arr[startPointer-k]; avg=sum/k; if(avg<=t) counter++;
	 * startPointer++; } return counter;
	 * 
	 * 9) Test against different test data set
	 * 
	 * 10) Debug them to solve it !
	 * 
	 */

	@Test
	public void testData1() {
		Assert.assertEquals(3, findAvgTheshold(new int[] { 2, 2, 2, 2, 5, 5, 5, 8 }, 3, 4));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(6, findAvgTheshold(new int[] { 11, 13, 17, 23, 29, 31, 7, 5, 2, 3 }, 3, 5));
	}

	public int findAvgTheshold(int[] arr, int k, int t) {
		int startPointer = 0, sum = 0, counter = 0;
		double avg = 0.0;
		while (startPointer < k) {
			sum += arr[startPointer];
			startPointer++;
		}
		avg = sum / k;
		if (avg >= t)
			counter++;

		while (startPointer < arr.length) {
			sum += arr[startPointer] - arr[startPointer - k];
			avg = sum / k;
			if (avg >= t)
				counter++;
			startPointer++;
		}
		return counter;
	}

}
