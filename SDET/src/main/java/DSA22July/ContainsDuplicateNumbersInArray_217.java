package DSA22July;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateNumbersInArray_217 {
	
	/*
	 * 1. Sort the given Array 
	 * 2. Iterate the Array with loop and compare the Elements 
	 * 3. Verify any consecutive are equal break the loop and return true
	 */
	
	@Test
	public void Test1() {
		boolean findDuplicateInArray = findDuplicateInArray(new int[] {1,2,3,1});
		Assert.assertTrue(findDuplicateInArray);
	}
	
	@Test
	public void Test2() {
		boolean findDuplicateInArray = findDuplicateInArray(new int[] {1,2,3,4});
		Assert.assertTrue(!findDuplicateInArray);
	}
	
	@Test
	public void Test3() {
		boolean findDuplicateInArray = findDuplicateInArray(new int[] {1,1,1,3,3,4,3,2,4,2});
		Assert.assertTrue(findDuplicateInArray);
	}
	
	public boolean findDuplicateInArray(int[] nums) {
		Arrays.sort(nums);
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				return true;
			}
		}
		return false;
	}

}
