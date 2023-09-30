package september;

import org.junit.Test;

import junit.framework.Assert;

public class GoodSubstrings {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: s =
	 * "xyzzaz" Output: 1
	 * 
	 * Input: s = "aababcabc" Output: 4
	 * 
	 * 3) Do I know how to solve this? Yes 4) Ask for hints, if you do not
	 * understand !! 5) Do I know alternate solutions? No 6) If you know more than
	 * one, then do this. 7) Start with Psuedo code 1. int startPoint=0,counter=0;
	 * 2. iterate the array elements with while loop condtion of startPoint<string
	 * length 3. check the condition with each char
	 * startPoint,startPoint+1,startPoint+2 4. when condition matched increment the
	 * counter startPoint 5. return the counter 8) Implement the code int
	 * startPoint=0,counter=0; while(startPoint<s.length()){ if(s.charAt(startPoint)
	 * == s.charAt(startPoint+1) && s.charAt(startPoint+1) == s.charAt(startPoint+2)
	 * && s.charAt(startPoint) == s.charAt(startPoint+2)){ counter++; } } return
	 * counter;
	 * 
	 * 9) Test against different test data set
	 * 
	 * 10) Debug them to solve it !
	 * 
	 */
	
	@Test
	public void testData1() {
		Assert.assertEquals(4, findGoodSubstrings("aababcabc"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(0, findGoodSubstrings("aa"));
	}

	public int findGoodSubstrings(String s) {
		if (s.length() < 3)
			return 0;
		int startPoint = 0, counter = 0;
		while (startPoint < s.length() - 2) {
			if (s.charAt(startPoint) != s.charAt(startPoint + 1) && s.charAt(startPoint + 1) != s.charAt(startPoint + 2)
					&& s.charAt(startPoint) != s.charAt(startPoint + 2)) {
				counter++;
				startPoint++;
			} else {
				startPoint++;
			}
		}
		return counter;
	}

}
