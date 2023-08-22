package august.dsa;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class SetMismatch_645 {

	@Test
	public void Test1() {
		Assert.assertArrayEquals(new int[] { 2, 3 }, findSetMismatch(new int[] { 1, 2, 2, 4 }));
	}

	@Test
	public void Test2() {
		Assert.assertArrayEquals(new int[] { 1, 2 }, findSetMismatch(new int[] { 1, 1 }));
	}

	@Test
	public void Test3() {
		Assert.assertArrayEquals(new int[] { 4, 5 }, findSetMismatch(new int[] { 6, 2, 3, 4, 4, 1 }));
	}

	@Test
	public void Test4() {
		Assert.assertArrayEquals(new int[] { 103, 104 }, findSetMismatch(new int[] { 101, 105, 106, 102, 103, 103 }));
	}

	@Test
	public void Test5() {
		Assert.assertArrayEquals(new int[] { 99, 100 }, findSetMismatch(new int[] { 98, 100, 100, 101 }));
	}

	@Test
	public void Test6() {
		Assert.assertArrayEquals(new int[] { 1001, 1002 },
				findSetMismatch(new int[] { 1000, 999, 1001, 1001, 1003, 1004 }));
	}

	@Test
	public void Test7() {
		Assert.assertArrayEquals(new int[] { 2, 1 }, findSetMismatch(new int[] { 2, 2 }));
	}

	public int[] findSetMismatch(int[] nums) {
		int index = 0, arrVal = 0, prevValue = 0, nextValue = 0, prevIndxVal = 0, nextIndxVal = 0;
		Arrays.sort(nums);
		if (nums[0] == 1 && nums[1] == 1)
			return new int[] { 1, 2 };
		for (int i = 0; i <= nums.length; i++) {
			if (nums[i] == nums[i + 1]) {
				index = i;
				arrVal = nums[i];
				break;
			}
		}

		if (index > 0) {
			prevValue = arrVal - 1;
			prevIndxVal = nums[index - 1];
		} else {
			prevValue = arrVal;
			prevIndxVal = nums[index];
		}

		nextValue = arrVal + 1;
		nextIndxVal = nums[index + 1];

		if (prevValue != prevIndxVal)
			return new int[] { prevValue, arrVal };

		if (nextValue != nextIndxVal)
			return new int[] { arrVal, nextValue };

		return new int[] {};
	}

}
