package september;

import org.junit.Assert;
import org.junit.Test;

public class FindMaximumNumberOfStringPairs {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 
	 * 2) Derive your test data Input: words = ["cd","ac","dc","ca","zz"] Output: 2
	 * 
	 * Input: words = ["ab","ba","cc"] Output: 1
	 * 
	 * Input: words = ["aa","ab"] Output: 0
	 * 
	 * 
	 * 3) Do I know how to solve this? Yes
	 * 
	 * 4) Ask for hints, if you do not understand !!
	 * 
	 * 5) Do I know alternate solutions? No
	 * 
	 * 6) If you know more than one, then do this.
	 * 
	 * 7. Start with Psuedo code
	 * 
	 * 1. initialize the counter variable 2. Check the input array length, if length
	 * is 2 then call the reverse method for 2nd String and compare 3. Write a
	 * method for reverse the String and return 4. Iterate the String array in
	 * nesteed for loop and compare i and reverse of i+1 string increament the
	 * couter
	 * 
	 * 8. Implement the code int counter=0; for(int i=0;i<words.length;i++){ for(int
	 * j=i+1;j<words.length;j++){ if(words[i]==reverseString(words[i+1])) counter++;
	 * } }
	 * 
	 * public String reverseString(String str){ String rev=""; for(int
	 * i=str.lenght;i>=0;i--){ rev+=str.charAt[i]; } return rev; }
	 * 
	 * return counter;
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */
	@Test
	public void testData1() {
		Assert.assertEquals(2, findFindMaximumNumberOfStringPairs(new String[] { "cd", "ac", "dc", "ca", "zz" }));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(1, findFindMaximumNumberOfStringPairs(new String[] { "ab", "ba", "cc" }));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(0, findFindMaximumNumberOfStringPairs(new String[] { "aa", "ab" }));
	}

	public int findFindMaximumNumberOfStringPairs(String[] words) {
		int counter = 0;
		if (words.length == 2) {
			if (words[0].equals(reverseString(words[1]))) {
				return 1;
			} else {
				return 0;
			}
		}

		for (int i = 0; i < words.length; i++) {
			for (int j = i + 1; j < words.length; j++) {
				if (words[i].equals(reverseString(words[j]))) {
					counter++;
				}
			}
		}

		return counter;

	}

	public String reverseString(String str) {
		String rev = "";
		for (int i = str.length() - 1; i >= 0; i--) {
			rev += str.charAt(i);
		}
		return rev;
	}

}
