package november;


import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;
import org.testng.Assert;

public class UniqueNumberOccurances_1207 {
	/*
	 * 1. Create HashMap with Key and Value as Integer 2. Iterate the Array over the
	 * loop and add the values in HashMap 3. Get the Element count values 4. Load
	 * the values into Set 5. compare the set size and map values size and return
	 * the result
	 */
	@Test
	public void testData1() {
		Assert.assertTrue(findUniqueNumberOccurances(new int[] { 3, 2, 3 }));
	}

	@Test
	public void testData2() {
		Assert.assertFalse(findUniqueNumberOccurances(new int[] { 2, 1 }));
	}

	@Test
	public void testData3() {
		Assert.assertTrue(findUniqueNumberOccurances(new int[] { -3, 0, 1, -3, 1, 1, 1, -3, 10, 0 }));
	}

	public boolean findUniqueNumberOccurances(int[] arr) {
		HashMap<Integer, Integer> uniqOccuranceMap = new HashMap<>();
		for (int each : arr) {
			uniqOccuranceMap.put(each, uniqOccuranceMap.getOrDefault(each, 0) + 1);
		}
		Set<Integer> validateUniqOccu = new HashSet<>();
		validateUniqOccu.addAll(uniqOccuranceMap.values());
		return validateUniqOccu.size() == uniqOccuranceMap.values().size();
	}
}
