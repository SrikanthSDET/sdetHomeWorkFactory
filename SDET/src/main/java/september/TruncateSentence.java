package september;

import org.junit.Test;

import junit.framework.Assert;

public class TruncateSentence {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 2) Derive your test data
	 * 
	 * Input: s = "Hello how are you Contestant", k = 4 Output: "Hello how are you"
	 * 
	 * Input: s = "Hello", k = 1 Output: "Hello"
	 * 
	 * Input: s = "chopper is not a tanuki", k = 5 Output: "chopper is not a tanuki"
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
	 * 1. Using regular expression find the space inbetween in the String and store
	 * the values into String array 2. when String array length and k values equal
	 * return the original String 3. Iterate the String array with for loop till
	 * length of value k 4. store index values output String with concatenating
	 * single space except zero th index value and finally return the output String
	 * 
	 * 8. Implement the code
	 * 
	 * public String findTruncateSentence(String s, int k){ String output="";
	 * String[] str = s.split(" "); if(str.length== k) return s; for(int
	 * i=0;i<k;i++){ if(i==0) output = output+str[i]; else output =
	 * output+" "+str[i]; }
	 * 
	 * return output; }
	 * 
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */

	@Test
	public void testData1() {
		Assert.assertEquals("Hello how are you", findTruncateSentence("Hello how are you Contestant", 4));
	}

	@Test
	public void testData2() {
		Assert.assertEquals("Hello", findTruncateSentence("Hello", 1));
	}

	public String findTruncateSentence(String s, int k) {
		String output = "";
		String[] str = s.split(" ");
		if (str.length == k)
			return s;
		for (int i = 0; i < k; i++) {
			if (i == 0)
				output = output + str[i];
			else
				output = output + " " + str[i];
		}

		return output;
	}

}
