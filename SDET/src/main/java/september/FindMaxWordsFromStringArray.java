package september;

import org.junit.Test;

import junit.framework.Assert;

public class FindMaxWordsFromStringArray {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 2) Derive your test data
	 * 
	 * Input: sentences = ["alice and bob love leetcode", "i think so too",
	 * "this is great thanks very much"] Output: 6
	 * 
	 * Input: sentences=["hello sdet ","hello sdet batch"] Output: 3
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
	 * 1. Declare integer variable for maxWordCount with initial value of zero 2.
	 * write a method to get the words count from string using for loop and
	 * condition of chatAt() method equal with ' ' and return no. of Space in the
	 * String + 1 3. Get the count of String array sentences when count is 1, call
	 * the method which will return words count and assign the values to
	 * maxWordCount 4. iterate the the sentences array in the for loop till the
	 * length 5. Get the word count of the each array element and compare with
	 * maxWordCount 6. when word count greater than maxWordCount assign the value 7.
	 * return the maxWordCount end of the loop
	 * 
	 * 8. Implement the code
	 * 
	 * public int findMaxWordCount(String[] sentences){ int
	 * wordCount=0,maxWordCount=0; if(sentences.length==1) return
	 * findWordCount(sentences[0]); for(int i=0;i<sentences.length;i++){
	 * if(findWordCount(sentences[i])>maxWordCount)
	 * maxWordCount=findWordCount(sentences[i]); } return maxWordCount; }
	 * 
	 * public int findWordCount(String str){ for(int i=0;i<str.length();i++){
	 * if(str.charAt(i)==' ') wordCount++; } return wordCount+1; }
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */

	@Test
	public void testData1() {
		Assert.assertEquals(6, findMaxWordCount(
				new String[] { "alice and bob love leetcode", "i think so too", "this is great thanks very much" }));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(3, findMaxWordCount(new String[] { "hello sdet ", "hello sdet batch" }));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(3, findMaxWordCount(new String[] { "hello sdet batch" }));
	}

	public int findMaxWordCount(String[] sentences) {
		int maxWordCount = 0;
		if (sentences.length == 1)
			return findWordCount(sentences[0]);
		for (int i = 0; i < sentences.length; i++) {
			if (findWordCount(sentences[i]) > maxWordCount)
				maxWordCount = findWordCount(sentences[i]);
		}
		return maxWordCount;
	}

	public int findWordCount(String str) {
		int wordCount = 0;
		for (int i = 0; i < str.length(); i++) {
			if (str.charAt(i) == ' ')
				wordCount++;
		}
		return wordCount + 1;
	}

}
