package september;

import org.junit.Test;

import junit.framework.Assert;

public class ReverseString {
	@Test
	public void testData() {
		Assert.assertEquals("0lleh", TwoPointerReverseString("hello"));
	}
	public String findReverseString(String str) {
		String output="";
		for(int i=str.length()-1;i>=0;i--) {
			output+=str.charAt(i);
		}		
		return output;
		
	}
	
	public String TwoPointerReverseString(String str) {
		
		str="hello";
		char[] charArray = str.toCharArray();
		int startIndx=0;
		int endIndx=str.length()-1;
		while(startIndx<endIndx) {
			char temp=charArray[startIndx];
			charArray[startIndx]=charArray[endIndx];
			charArray[endIndx]=temp;
			startIndx++;
			endIndx--;
		}
			
		return charArray.toString();
	}

}
