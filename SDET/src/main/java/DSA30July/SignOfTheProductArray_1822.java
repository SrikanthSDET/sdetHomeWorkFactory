package DSA30July;

import org.junit.Test;

import junit.framework.Assert;

public class SignOfTheProductArray_1822 {
	
	@Test
	public void Test1() {
		int actSign = findSignOfTheProductArray(new int[] {-1,-2,-3,-4,3,2,1});
		Assert.assertEquals(1, actSign);
	}
	
	@Test
	public void Test2() {
		int actSign = findSignOfTheProductArray(new int[] {-1,5,0,2,-3});
		Assert.assertEquals(0, actSign);
	}
	
	@Test
	public void Test3() {
		int actSign = findSignOfTheProductArray(new int[] {-1,1,-1,1,-1});
		Assert.assertEquals(-1, actSign);
	}
	
	public int findSignOfTheProductArray(int[] nums) {
		int sum=nums[0];
		for(int i=1;i<nums.length;i++) {
			sum=sum*nums[i];
		}
		if(sum==0) {
			return 0;
		}else if(sum>0) {
			return 1;
		}else {
			return -1;
		}
		
	}

}
