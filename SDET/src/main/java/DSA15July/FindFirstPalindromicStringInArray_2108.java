package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class FindFirstPalindromicStringInArray_2108 {
	/*
	 * Input: String[]
	 * Output: String
	 * Iterate String[] through for loop in sequential order 
	 * Verify given String is Palindrome when got 1st match return the result
	 * 
	 */
	
	@Test
	public void Test1() {
		String findFirstPalindrome = findFirstPalindrome(new String[] {"abc","car","ada","racecar","cool"});
		Assert.assertEquals("ada", findFirstPalindrome);
	}
	
	@Test
	public void Test2() {
		String findFirstPalindrome = findFirstPalindrome(new String[] {"abc","car","adaa","racecar","cool"});
		Assert.assertEquals("racecar", findFirstPalindrome);
	}
	
	public String findFirstPalindrome(String[] str) {
		String org="";
		String rev="";
		for(int i=0;i<str.length;i++) {	
			org = str[i];
		String str1 = org.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
		rev = checkPalindrome(str1);
		if(org.equals(rev))
			return rev;	
		}		
		
		return rev;
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
