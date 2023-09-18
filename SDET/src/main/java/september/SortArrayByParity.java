package september;

import org.junit.Assert;
import org.junit.Test;

import java.util.Arrays;

public class SortArrayByParity {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: nums =
	 * [3,1,2,4] 0 1 2 3 Output: [2,4,3,1] 3 1 2 4
	 * 
	 * 3) Do I know how to solve this? Yes 4) Ask for hints, if you do not
	 * understand !! 5) Do I know alternate solutions? No 6) If you know more than
	 * one, then do this. 7. Start with Psuedo code 1. Initilize left=0,
	 * right=nums.length()-1 2. Iterate the input array till the condition
	 * left<right 3. if((nums[left]%2==0) && (nums[right]%2!=0)) continue increament
	 * left & decreament right 4. if((nums[left]%2!=0) && (nums[right]%2==0))
	 * temp=nums[left]; nums[left]=nums[right]; nums[right]=temp; increament left &
	 * decreament right 5. if((nums[left]%2!=0)&& (nums[right]%2!=0)) decreament
	 * right 6. if((nums[left]%2==0)&& (nums[right]%2==0)) increament left 7. return
	 * the nums array
	 * 
	 * 8. Implement the code
	 * 
	 * int left=0, right=nums.length()-1,temp=0; if(nums.length==1 && nums[0]==0)
	 * return nums; while(left<right){ if((nums[left]%2==0) && (nums[right]%2!=0)){
	 * left++; right--; }else if((nums[left]%2!=0) && (nums[right]%2==0)){
	 * temp=nums[left]; nums[left]=nums[right]; nums[right]=temp; left++; right--;
	 * }else if((nums[left]%2!=0)&& (nums[right]%2!=0)){ right--; }else
	 * if((nums[left]%2==0)&& (nums[right]%2==0)){ left++; } } return nums;
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */
	@Test
	public void validTestData() {
		Assert.assertArrayEquals(new int[] { 4, 2, 1, 3 }, findValidTestData(new int[] { 3, 1, 2, 4 }));
	}

	public int[] findValidTestData(int[] nums) {
		int left = 0, right = nums.length - 1, temp = 0;
		if (nums.length == 1 && nums[0] == 0)
			return nums;
		while (left < right) {
			if ((nums[left] % 2 == 0) && (nums[right] % 2 != 0)) {
				left++;
				right--;
			} else if ((nums[left] % 2 != 0) && (nums[right] % 2 == 0)) {
				temp = nums[left];
				nums[left] = nums[right];
				nums[right] = temp;
				left++;
				right--;
			} else if ((nums[left] % 2 != 0) && (nums[right] % 2 != 0)) {
				right--;
			} else if ((nums[left] % 2 == 0) && (nums[right] % 2 == 0)) {
				left++;
			}
		}
		System.out.println(Arrays.toString(nums));
		return nums;

	}
}
