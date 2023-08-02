package DSA15July;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

import org.junit.Test;

import junit.framework.Assert;

public class SecondLargestDigitInAString_1796 {
	
	/*
	 * Input: String s
Output: int
Initialize int variable secondLargest
Remove the alphabets from the string using replaceAll
If only single numeric value contains return -1
Iterate through the for loop 
Checking the condition using charAt and compare ASCII value 
Compare the ASCII values and find 2nd largest 
	 */

	@Test
	public void Test1() {
		int findSecondLargestDigitInAString = findSecondLargestDigitInAString("dfa12321afd");
		Assert.assertEquals(2, findSecondLargestDigitInAString);
	}
	
	@Test
	public void Test2() {
		int findSecondLargestDigitInAString = findSecondLargestDigitInAString("abc1111");
		Assert.assertEquals(-1, findSecondLargestDigitInAString);
	}
	
	public int findSecondLargestDigitInAString(String s) {
		s = s.replaceAll("[a-z]", "");
		char[] charArray = s.toCharArray();
		Arrays.sort(charArray);
		
		if(s.length()<2)
		return -1;
		
		for(int i=charArray.length-1;i>0;i--) {
			if(charArray[i]>charArray[i-1]) {
				return charArray[i-1]-48;
			}
		}
		
		return -1;
	}

}
