package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class MergeStringsAlternately_1768 {
	
	/*
	 * Input: String word1="abc", word2="pqr"
	 * Output: String apbqcr
	 * Find the maxlength after getting the lenth of the both strings
	 * Create empty String out and 2 Char[] with maxlength 
	 * Iterate through the for loop with word1 add the concat values into out string
	 * Iterate the word2 through do while loop ensure condition always failing 
	 * Add the concat values into out string
	 */
	
	@Test
	public void Test1() {
		String mergeString = mergeString("abc","pqr");
		Assert.assertEquals("apbqcr", mergeString);
	}
	
	@Test
	public void Test2() {
		String mergeString = mergeString("ab","pqrs");
		Assert.assertEquals("apbqrs", mergeString);
	}
	
	public String mergeString(String str1,String str2) {
		int maxLength=0;	
		String out="";
		int str1Length = str1.length();
		int str2Length = str2.length();
		maxLength = (str1Length>str2Length) ? str1Length : str2Length;
			
		char[] arr1 = new char[maxLength];
		char[] arr2 = new char[maxLength];		
		for(int i=0;i<str1.length();i++) {
			arr1[i]=str1.charAt(i);			
		}
		for(int i=0;i<str2.length();i++) {			
			arr2[i]=str2.charAt(i);
		}
		for(int i=0;i<maxLength;i++) {
			out=out+arr1[i];			
			do {
				out=out+arr2[i];
			}
			while(i<0);
		}
		
		return out.replaceAll("[^a-zA-Z0-9]", "");
	}

}
