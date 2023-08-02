package DSA;

import java.util.HashSet;
import java.util.Set;

import org.junit.Assert;
import org.junit.Test;

public class ContainsDuplicateNumbersInArray_217 {
	
	/*
	 * Given an integer array nums, return true if any value appears at least twice in the array, and return false if every element is distinct.
		Input: Int[]
		Output: Boolean
		Traverse the loop
		Add into Set and verify the duplicate based on response and return 
	 */
	@Test
	public void Test1() {
		boolean result = findDuplicateNumberInArray(new int[] {1,2,3,1});
		Assert.assertEquals(true, result);
	}
	
	@Test
	public void Test2() {
		boolean result = findDuplicateNumberInArray(new int[] {1,2,3,4});
		Assert.assertEquals(false, result);
	}
	
	@Test
	public void Test3() {
		boolean result = findDuplicateNumberInArray(new int[] {1,1,1,3,3,4,3,2,4,2});
		Assert.assertEquals(true, result);
	}
	
	public boolean findDuplicateNumberInArray(int[] n) {
		Set<Integer> set = new HashSet<Integer>();
		for (Integer integer : n) {
			if(!set.add(integer))
				return true;
		}
		return false;
	}

}
