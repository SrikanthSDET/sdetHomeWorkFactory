package september;

import org.junit.Assert;
import org.junit.Test;

public class TargetCount {
	/*
	 * Input: nums = [2,3,5,7], target = 9 Output: [0,3] Output: Because nums[0] +
	 * nums[3] == 9, we return [0, 3].
	 */
	@Test
	public void TestData1() {
		Assert.assertArrayEquals(new int[] { 0, 3 }, findTargetValue(new int[] { 2, 3, 5, 7 }, 9));
	}

	@Test
	public void TestData2() {
		Assert.assertArrayEquals(new int[] { 1, 2 }, findTargetValue(new int[] { 2, 3, 5, 7 }, 8));
	}

	@Test
	public void TestData3() {
		Assert.assertArrayEquals(new int[] { 0, 2 }, findTargetValue(new int[] { 2, 3, 5, 7 }, 7));
	}

	@Test
	public void TestData4() {
		Assert.assertArrayEquals(new int[] { 2, 3 }, findTargetValue(new int[] { 2, 3, 5, 7 }, 12));
	}

	@Test
	public void TestData5() {
		Assert.assertArrayEquals(new int[] { 0, 1 }, findTargetValue(new int[] { 2, 3, 5, 7 }, 5));
	}

	@Test
	public void TestData6() {
		Assert.assertArrayEquals(new int[] { 1, 5 }, findTargetValue(new int[] { 2, 3, 4, 6, 8, 9 }, 12));
	}

	public int[] findTargetValue(int[] nums, int target) {
		int startIdx = 0;
		int endIdx = nums.length - 1;
		while (startIdx < endIdx) {
			if (nums[startIdx] + nums[endIdx] == target) {
				return new int[] { startIdx, endIdx };
			}
			if (nums[startIdx] + nums[endIdx] > target) {
				endIdx--;
			} else {
				startIdx++;
			}

		}

		return new int[] {};
	}

}
