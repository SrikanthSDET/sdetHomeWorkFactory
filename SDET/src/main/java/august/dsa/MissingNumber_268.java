package august.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class MissingNumber_268 {
	
	@Test
	public void Test1() {
		Assert.assertEquals(4, findMissingNumber(new int[] {0,1,3,2,5,6,8,7,10,9}));
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals(2, findMissingNumber(new int[] {0,1}));
	}
	
	public int findMissingNumber(int[] nums) {
		Arrays.sort(nums);
		int len = nums.length;
		int lastDigit=nums[nums.length-1];
		if(nums.length!=nums[nums.length]) return nums.length;
		
		for(int i=0;i<=nums.length;i++){
			if((nums[i+1]- nums[i])> 1) {
			return (nums[i+1]-1);			
			}
			
		}
		return 0;
	}

}
