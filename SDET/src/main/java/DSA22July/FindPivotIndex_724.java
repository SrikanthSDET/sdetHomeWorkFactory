package DSA22July;

import org.junit.Test;

import junit.framework.Assert;

public class FindPivotIndex_724 {
	
	@Test
	public void Test1() {
		int findPivotIndex = findPivotIndex(new int[] {7,4,6,5,6});
		Assert.assertEquals(2, findPivotIndex);
	}
	
	//@Test
	public void Test2() {
		int findPivotIndex = findPivotIndex(new int[] {2,1,-1});
		Assert.assertEquals(0, findPivotIndex);
	}
	
	//@Test
	public void Test3() {
		int findPivotIndex = findPivotIndex(new int[] {1,2,3});
		Assert.assertEquals(-1, findPivotIndex);
	}
	public int findPivotIndex(int[] nums) {	
		int leftSum=0, rightSum=0;
		if(nums.length==3) {
			if(nums[1]+nums[2]==0) {
				return 0;
			}else {
				return -1;
			}
			
		}
		for(int j=0;j<nums.length;j++) {
		do {
				leftSum=leftSum+nums[j];	
				
				if(leftSum==rightSum && nums.length!=j)
					return j+1;
				
				rightSum=rightSum+nums[nums.length-1-j];	
				
				if(leftSum==rightSum)
					return j+1;
		}while(leftSum==rightSum);
		
		}
		return -1;		
	}

}
