package august.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ArrayPartition_561 {
	
	/*
	 * 1. Sort the Array elements 
	   2. Iterate the Array elements and Increment the loop by 2 
 	   3. Check the consecutive pair of elements and compare the values get the minimum value and added into sum variable
	   4. Return the sum value 
	 */
	@Test
	public void Test1() {		
		Assert.assertEquals(4, findArrayPartition(new int[] {1,4,3,2}));
	}
	
	@Test
	public void Test2() {		
		Assert.assertEquals(9, findArrayPartition(new int[] {6,2,6,5,1,2}));
	}
	
	public int findArrayPartition(int[] nums) {
		int sum=0;
		Arrays.sort(nums);
			
		for(int i=0;i<nums.length;i+=2){
			if(nums[i]<=nums[i+1])
				sum += nums[i];
		}	
		return sum;
	}

}
