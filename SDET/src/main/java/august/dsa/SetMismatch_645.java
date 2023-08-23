package august.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatch_645 {

	@Test
	public void Test1() {
		Assert.assertArrayEquals(new int[] { 2, 3 }, findSetMatch(new int[] { 1, 2, 2, 4 }));
	}

	@Test
	public void Test2() {
		Assert.assertArrayEquals(new int[] { 1, 2 }, findSetMatch(new int[] { 1, 1 }));
	}

	@Test
	public void Test3() {
		Assert.assertArrayEquals(new int[] { 4, 5 }, findSetMatch(new int[] { 6, 2, 3, 4, 4, 1 }));
	}

	@Test
	public void Test4() {
		Assert.assertArrayEquals(new int[] { 2, 1 }, findSetMatch(new int[] { 2, 2 }));
	}

	@Test
	public void Test5() {
		Assert.assertArrayEquals(new int[] { 3, 4 }, findSetMatch(new int[] { 1, 2, 3, 3, 5, 6 }));
	}

	@Test
	public void Test6() {
		Assert.assertArrayEquals(new int[] { 3, 2 }, findSetMatch(new int[] { 1, 3, 3 }));
	}

	@Test
	public void Test7() {
		Assert.assertArrayEquals(new int[] { 3, 1 }, findSetMatch(new int[] { 3, 2, 3, 4, 6, 5 }));
	}

	@Test
	public void Test8() {
		Assert.assertArrayEquals(new int[] { 2, 10 }, findSetMatch(new int[] { 1, 5, 3, 2, 2, 7, 6, 4, 8, 9 }));
	}

	@Test
	public void Test9() {
		Assert.assertArrayEquals(new int[] { 39, 55 },
				findSetMatch(new int[] { 37, 62, 43, 27, 12, 66, 36, 18, 39, 54, 61, 65, 47, 32, 23, 2, 46, 8, 4, 24,
						29, 38, 63, 39, 25, 11, 45, 28, 44, 52, 15, 30, 21, 7, 57, 49, 1, 59, 58, 14, 9, 40, 3, 42, 56,
						31, 20, 41, 22, 50, 13, 33, 6, 10, 16, 64, 53, 51, 19, 17, 48, 26, 34, 60, 35, 5 }));
	}

	public int[] findSetMatch(int[] nums) {
		int index = 0, arrElemVal = 0, dupIndex = 0;
		Arrays.sort(nums);
		if (nums.length == 2) {
			if (nums[0] - 1 != 0)
				return new int[] { nums[0], nums[0] - 1 };
			else
				return new int[] { nums[0], nums[0] + 1 };
		}
		for (int i = 0; i < nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				dupIndex = i;
				arrElemVal = nums[i];
				break;
			}
		}

		if (nums[0] != 1)
			return new int[] { arrElemVal, 1 };

		if (nums[nums.length - 1] != nums.length)
			return new int[] { arrElemVal, nums.length };

		/*
		 * if (arrElemVal == dupIndex + 1) { return new int[] { arrElemVal, arrElemVal +
		 * 1 }; }
		 */

		for (int i = 0; i <= nums.length; i += 2) {
			if (nums[i + 1] - nums[i] > 1) {
				return new int[] { arrElemVal, i + 1 };
			}
		}

		/*
		 * for (int i = 0; i <= nums.length; i++) { if ((i + 1) != nums[i]) { index = i;
		 * break; } }
		 */

		return new int[] { arrElemVal, index + 1 };
	}

}
