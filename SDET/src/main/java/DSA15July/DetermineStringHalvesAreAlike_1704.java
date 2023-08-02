package DSA15July;

import org.junit.Assert;
import org.junit.Test;

public class DetermineStringHalvesAreAlike_1704 {
	
	/*
	 * Input: String S="book"                 
	 * Output: boolean
	 * Using a = Substring(0,S.length/2) b = Substring(S.length/2)
	 * Initialize two int aCount=0,bCount=0 
	 * Iterate through the for loop find the aCount
	 * Condition if(a.chatAt(i)=('a' || 'A')) increase the count of aCount
	 * Condition if(b.chatAt(i)=('a' || 'A')) increase the count of bCount
	 * Compare aCount & bCount and return
	 */
	
	@Test
	public void Test1() {
		boolean findVowelsCount = findVowelsCount("bOooOk");
		Assert.assertTrue(findVowelsCount);
	}
	
	@Test
	public void Test2() {
		boolean findVowelsCount = findVowelsCount("textbook");
		Assert.assertFalse(findVowelsCount);
	}
	
	public boolean findVowelsCount(String str) {
		String a = str.substring(0,str.length()/2);
		String b = str.substring(str.length()/2);
		String aStr = a.replaceAll("[aeiouAEIOU]", "");
		String bStr = b.replaceAll("[aeiouAEIOU]", "");
		
		return aStr.length()==bStr.length();
	}

}
