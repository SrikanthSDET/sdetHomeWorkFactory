package november;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;
import org.testng.Assert;

public class MajorityElements_169 {
	/*
	 * 1. Create HashMap with key and values as Integer 2. Iterate through the loop
	 * add the values into 3. Find the mid size of the array 4. Iterate Map values
	 * and compare with mid size, if map values is greater than mid size 5. Get the
	 * element using values and return
	 */
	@Test
	public void testData1() {
		Assert.assertEquals(3, findMajorityElements(new int[] { 3, 2, 3 }));
	}

	public int findMajorityElements(int[] nums) {
		HashMap<Integer, Integer> majorityEleMap = new HashMap<>();
		for (int each : nums) {
			majorityEleMap.put(each, majorityEleMap.getOrDefault(each, 0) + 1);
		}
		int mid = nums.length / 2;
		for (Map.Entry<Integer, Integer> entrySet : majorityEleMap.entrySet()) {
			if (entrySet.getValue() > mid) {
				return entrySet.getKey();
			}
		}

		return 0;
	}

}
