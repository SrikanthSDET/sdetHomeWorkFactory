package september;

import org.junit.Test;

import junit.framework.Assert;

public class MakeValidString {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: word =
	 * "b" Output: 2 Input: word = "aaa" Output: 6 Input: word = "abc" Output: 0
	 * Input: ac Output: 1 Input:bbb Output:6 Input:ccc Output:6 3) Do I know how to
	 * solve this? Yes
	 * 
	 * 4) Ask for hints, if you do not understand !!
	 * 
	 * 5) Do I know alternate solutions? No
	 * 
	 * 6) If you know more than one, then do this.
	 * 
	 * 7. Start with Psuedo code
	 * 
	 * 1. Check the String length if it is 1 return with 2, initialize the counter=0
	 * 2. Iterate the String till length-1, check the concecutive elements
	 * if(s.charAt(i)=='a' && s.charAt(i+1)=='c') counter++; 3. if(s.charAt(i)=='a'
	 * && s.charAt(i+1)=='a') counter+=2; 4. end of the loop return counter
	 * 
	 * 8. Implement the code
	 * 
	 * if(word.length()==1) return 2; int counter=0; if(word.charAt(0)=='b')
	 * counter=1; if(word.charAt(0)=='c') counter=2; for(int
	 * i=0;i<word.length()-1;i++){ if(word.charAt(i)=='a' && word.charAt(i+1)=='c')
	 * counter++; else if(word.charAt(i)=='a' && word.charAt(i+1)=='a') counter+=2;
	 * else if(word.charAt(i)=='b' && word.charAt(i+1)=='c') counter++; else
	 * if(word.charAt(i)=='c' && word.charAt(i+1)=='b') counter++; else
	 * if(word.charAt(i)=='b' && word.charAt(i+1)=='b') counter+=2; else
	 * if(word.charAt(i)=='c' && word.charAt(i+1)=='c') counter+=2; }
	 * if(word.charAt(word.length()-1)=='a') counter+=2;
	 * 
	 * if(word.charAt(word.length()-1)=='b') counter++;
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
	public void validData1() {
		Assert.assertEquals(2, findValidString("b"));
	}

	@Test
	public void validData2() {
		Assert.assertEquals(6, findValidString("aaa"));
	}

	@Test
	public void validData3() {
		Assert.assertEquals(0, findValidString("abc"));
	}

	@Test
	public void validData4() {
		Assert.assertEquals(6, findValidString("bbb"));
	}

	@Test
	public void validData5() {
		Assert.assertEquals(6, findValidString("ccc"));
	}

	public int findValidString(String word) {
		if (word.length() == 1)
			return 2;
		int counter = 0;
		if (word.charAt(0) == 'b')
			counter = 1;
		if (word.charAt(0) == 'c')
			counter = 2;
		for (int i = 0; i < word.length() - 1; i++) {
			if (word.charAt(i) == 'a' && word.charAt(i + 1) == 'c')
				counter++;
			else if (word.charAt(i) == 'a' && word.charAt(i + 1) == 'a')
				counter += 2;
			else if (word.charAt(i) == 'c' && word.charAt(i + 1) == 'b')
				counter++;
			else if (word.charAt(i) == 'b' && word.charAt(i + 1) == 'a')
				counter++;
			else if (word.charAt(i) == 'b' && word.charAt(i + 1) == 'b')
				counter += 2;
			else if (word.charAt(i) == 'c' && word.charAt(i + 1) == 'c')
				counter += 2;
		}
		if (word.charAt(word.length() - 1) == 'a')
			counter += 2;

		if (word.charAt(word.length() - 1) == 'b')
			counter++;

		return counter;
	}

}
