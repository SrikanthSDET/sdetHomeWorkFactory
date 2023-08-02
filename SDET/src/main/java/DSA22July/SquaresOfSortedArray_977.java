package DSA22July;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SquaresOfSortedArray_977 {
	/*
	 * 1. Loop through the Array Elements and squares the values and update in Array
	 * 2. Sorting the Array and return 
	 */
	
	@Test
	public void Test1() {
		int[] squaresArray = squaresArray(new int[] {-4,-1,0,3,10});
		Assert.assertArrayEquals(new int[] {0,1,9,16,100}, squaresArray);
	}
	
	@Test
	public void Test2() {
		int[] squaresArray = squaresArray(new int[] {-7,-3,2,3,11});
		Assert.assertArrayEquals(new int[] {4,9,9,49,121}, squaresArray);
	}
	
	public int[] squaresArray(int[] nums) {
		for(int i=0;i<nums.length;i++) {
			nums[i] = (int)Math.pow(nums[i], 2);
		}
		Arrays.sort(nums);
		
		return nums;
	}

}
