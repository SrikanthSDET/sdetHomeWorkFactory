package september;

import org.junit.Test;

import junit.framework.Assert;

public class FaultyKeyboard {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 
	 * 2) Derive your test data
	 * 
	 * Input: s = "string" Output: "rtsng"
	 * 
	 * Input: s = "poiinter" Output: "ponter"
	 * 
	 * Input: india Output: dna
	 * 
	 * input: hundaiii output: adnuh
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
	 * 1. Initialize String varible of output 2. Iterate the given String through
	 * for loop 3. Check the fault char in the condition with each char of string 4.
	 * store the non-faulty char in the output string 5. when condition is matching
	 * reverse the output varible using String builder 6. end of the loop return the
	 * output varible
	 * 
	 * 8. Implement the code
	 * 
	 * String output=""; for(int i=0;i<s.length();i++){ if(s.charAt(i)!='i'){
	 * output+=s.charAt(i); }else{ StringBuilder sb = new StringBuilder(output);
	 * output = sb.reverse(); } } return output;
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */
	@Test
	public void positiveData1() {
		Assert.assertEquals("rtsng", finalString("string"));
	}

	@Test
	public void positiveData2() {
		Assert.assertEquals("ponter", finalString("poiinter"));
	}

	@Test
	public void positiveData3() {
		Assert.assertEquals("dna", finalString("india"));
	}

	@Test
	public void positiveData4() {
		Assert.assertEquals("adnuh", finalString("hundaiii"));
	}

	public String finalString(String s) {
		String output = "";
		for (int i = 0; i < s.length(); i++) {
			if (s.charAt(i) != 'i') {
				output += s.charAt(i);
			} else {
				//StringBuilder sb = new StringBuilder(output);
				//output = sb.reverse().toString();	
				output = reverseString(output);
			}
		}
		return output;
	}
	
	public String reverseString(String str) {
		String out="";
		for(int i=str.length()-1;i>=0;i--) {
			out+=str.charAt(i);
		}
		
		return out;
	}

}
