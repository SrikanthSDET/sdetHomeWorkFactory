package DSA30July;

import org.junit.Test;

import junit.framework.Assert;

public class AvgValueOfEvenNumDivByThree_2455 {
	
	@Test
	public void Test1() {
		int findAvg = findAvgValueOfEvenNumDivByThree(new int[] {1,3,6,10,12,15});
		Assert.assertEquals(9, findAvg);
	}
	
	@Test
	public void Test2() {
		int findAvg = findAvgValueOfEvenNumDivByThree(new int[] {1,2,4,7,10});
		Assert.assertEquals(0, findAvg);
	}
	
	public int findAvgValueOfEvenNumDivByThree(int[] nums) {
		int sum=0,counter=0;
		for(int i=0;i<nums.length;i++) {			
				if(nums[i]%2==0 && nums[i]%3==0) {					
						sum=sum+nums[i];
						counter++;				
				}			
		}
		if(sum>0) {
			return sum/counter;
		}
		return 0;
	}

}
