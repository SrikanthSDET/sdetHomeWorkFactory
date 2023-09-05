package september;

import java.util.Arrays;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class CheckIfAStringIsAnAcronymOfWords {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 2) Derive your test data words = ["alice","bob","charlie"] s="abc"
	 * words=["i","n","d","i","a"] s="india" 3) Do I know how to solve this? Yes
	 * 
	 * 4) Ask for hints, if you do not understand !!
	 * 
	 * 5) Do I know alternate solutions? No
	 * 
	 * 6) If you know more than one, then do this.
	 * 
	 * 7. Start with Psuedo code
	 * 
	 * 1. Compare given List size and target String length if it's not equal return
	 * false 2. get the 1st char of i th String and compare with i th char of String
	 * S 3. iterate the loop if condition matching finally return true 4. condition
	 * not matching any of the return false and it will automatically break the loop
	 * as well
	 * 
	 * 
	 * 8. Implement the code
	 * 
	 * if(words.size()!=s.length()) return false; for(int i=0;i<words.size();i++){
	 * if(words.get(i).charAt(0)!= s.charAt(i)) return false; } return true;
	 * 
	 * 
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 */
	@Test
	public void TestData1() {
		String[] words = { "alice", "bob", "charlie" };
		Assert.assertTrue(checkIfAStringIsAnAcronymOfWords(Arrays.asList(words), "abc"));
	}

	@Test
	public void TestData2() {
		String[] words = { "afqcpzsx", "icenu" };
		Assert.assertFalse(checkIfAStringIsAnAcronymOfWords(Arrays.asList(words), "yi"));
	}

	@Test
	public void TestData3() {
		String[] words = { "i", "n", "d", "i", "a" };
		Assert.assertTrue(checkIfAStringIsAnAcronymOfWords(Arrays.asList(words), "india"));
	}

	public boolean checkIfAStringIsAnAcronymOfWords(List<String> words, String s) {
		if (words.size() != s.length())
			return false;
		for (int i = 0; i < words.size(); i++) {
			if (words.get(i).charAt(0) != s.charAt(i))
				return false;
		}
		return true;
	}

}
