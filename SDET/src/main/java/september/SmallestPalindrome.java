package september;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class SmallestPalindrome {
	/*
	 * 1) Did I understand the problem? Yes 2) Derive your test data Input: s =
	 * "egcfe" 0 1 2 3 4 Output: "efcfe" e g c f e left=0 right=length-1
	 * 
	 * 3) Do I know how to solve this? Yes 4) Ask for hints, if you do not
	 * understand !! 5) Do I know alternate solutions? No 6) If you know more than
	 * one, then do this. 7) Start with Psuedo code 1. convert the given string into
	 * char array 2. Assign leftpointer=0 and rightPointer=array.length-1 3. while
	 * loop with condition of left<right 4. Compare left & right char are equal then
	 * increament left and decrement right 5. when not equal check the small char
	 * and assign to bigger one finally convert the char array to string and return
	 * 8) Implement the code if(s.length()==1) return s; char[] charArray =
	 * s.toCharArray(); int left=0,right=charArray.length-1; while(left<right){
	 * if(charArray[left]!=charArray[right]){ if(charArray[left]>charArray[right])
	 * charArray[left]=charArray[right]; else charArray[right]=charArray[left];
	 * 
	 * left++; right--; }else { left++; right--; } } return
	 * String.valueOf(charArray);
	 * 
	 * 9) Test against different test data set
	 * 
	 * 10) Debug them to solve it !
	 * 
	 */
	@Test
	public void testData1() {
		Assert.assertEquals("efcfe", makeSmallestPalindrome("egcfe"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals("abba", makeSmallestPalindrome("abcd"));
	}

	@Test
	public void testData3() {
		Assert.assertEquals("cc", makeSmallestPalindrome("gc"));
	}

	public String makeSmallestPalindrome(String s) {
		if (s.length() == 1)
			return s;
		char[] charArray = s.toCharArray();
		int left = 0, right = charArray.length - 1;
		while (left < right) {
			if (charArray[left] != charArray[right]) {
				if (charArray[left] > charArray[right])
					charArray[left] = charArray[right];
				else
					charArray[right] = charArray[left];

				left++;
				right--;
			} else {
				left++;
				right--;
			}
		}
		return String.valueOf(charArray);
	}
}
