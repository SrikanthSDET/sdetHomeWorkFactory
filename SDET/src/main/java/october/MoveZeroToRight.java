package october;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroToRight {
	
	@Test
	public void testData1() {
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, moveZeroToRight(new int[] {0,1,0,3,12}));
	}
	
	public int[] moveZeroToRight(int[] nums) {
		int left=0,right=1,temp=0;
		while(right<nums.length){
			if(nums[left]==0 && nums[right]!=0){
				temp=nums[left];
				nums[left]=nums[right];
				nums[right]=temp;
				left++;
				right=left+1;
			}else if(nums[left]==0 && nums[right]==0){
				right++;
			}else {
				left++;
				right++;
			}
			
		}
		
		return nums;
	}

}
