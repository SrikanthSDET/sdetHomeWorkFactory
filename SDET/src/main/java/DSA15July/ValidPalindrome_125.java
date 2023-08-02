package DSA15July;

import org.junit.Test;
import junit.framework.Assert;

public class ValidPalindrome_125 {
	
	/*
	 * Input: String
	 * Output: Boolean
	 * Convert Uppercase to Lowercase
	 * Remove all spaces and non-alphanumeric characters
	 * Iterate string using for loop and create another String in reverse format
	 * Compare two strings with equal
	 */
	
	@Test
	public void Test1() {
		String checkPalindrome = checkPalindrome("A man, a plan, a canal: Panama");
		Assert.assertEquals("amanaplanacanalpanama", checkPalindrome);
	}
	
	@Test
	public void Test2() {
		String checkPalindrome = checkPalindrome("A ;m ~ma");
		Assert.assertEquals("amma", checkPalindrome);
	}
	
	public String checkPalindrome(String str) {
		String rev="";
		String str1 = str.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		for(int i=str1.length()-1;i>=0;i--) {
			rev=rev+str1.charAt(i);
		}
		return rev;
	}

}
