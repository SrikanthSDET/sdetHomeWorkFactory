package september;

import java.util.HashMap;
import java.util.Map;

import org.junit.Assert;
import org.junit.Test;

public class TwoSum {
	/*
	 * Input: nums = [2,7,11,15], target = 9
		Output: [0,1]
	 * 
	 * Intialize the left to index-0 and right to length-1
	 * Check the condition with Target value and sum of left and right
	 * contidition matched return the left,right, else increament the right
	 */
	
   @Test
   public void Test1() {
	  Assert.assertArrayEquals(new int[] {0,1}, twoSum(new int[] {2,7,11,15},9));
   }
	
	public int[] twoSum(int[] nums, int target) {
		
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for(int i=0;i<nums.length;i++) {
			map.put(i, nums[i]);
		}
		for(int i=0;i<map.size();i++) {
			//map.get(i)
		}
		return new int[] {};
	}
}
