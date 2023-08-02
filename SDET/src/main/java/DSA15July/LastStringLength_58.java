package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class LastStringLength_58 {
	
	/*
	 * Input: String S
Output: Int
trim the String
substring(s.lastIndexOf(" ")+1, s.length()).length()
	 */

	@Test
	public void Test1() {
		int length = findLengthOfLastString("Hello World");
		Assert.assertEquals(5, length);
	}
	
	@Test
	public void Test2() {
		int length = findLengthOfLastString("   fly me   to   the moon  ");
		Assert.assertEquals(4, length);
	}
	
	@Test
	public void Test3() {
		int length = findLengthOfLastString("luffy is still joyboy");
		Assert.assertEquals(6, length);
	}
	
	public int findLengthOfLastString(String str) {		
		str=str.trim();
		return str.substring(str.lastIndexOf(" ")+1,str.length()).length();		 
	}


}
