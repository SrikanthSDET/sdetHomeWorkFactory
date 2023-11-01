package november;

import java.util.HashMap;

import org.junit.Test;
import org.testng.Assert;

public class FirstUniqueCharInString_387 {

	/*
	 * 1. Create Map to store input string character and their count 2. Iterate the
	 * given string till the end and add the same into map with count 3. now iterate
	 * the string through for loop 4. inside the loop check the condition, which
	 * char have the value of 1 return that character index value 5. codition not
	 * matching iterate the loop till end and finally return -1
	 * 
	 */
	@Test
	public void testData1() {
		Assert.assertEquals(0, findFirstUniqueCharInString("leetcode"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(2, findFirstUniqueCharInString("loveleetcode"));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(-1, findFirstUniqueCharInString("aabb"));
	}

	public int findFirstUniqueCharInString(String s) {
		HashMap<Character, Integer> uqiOccMap = new HashMap<>();
		for (int i = 0; i <= s.length() - 1; i++) {
			uqiOccMap.put(s.charAt(i), uqiOccMap.getOrDefault(s.charAt(i), 0) + 1);
		}
		for (int i = 0; i <= s.length() - 1; i++) {
			if (uqiOccMap.get(s.charAt(i)) == 1)
				return i;
		}
		return -1;
	}
}
