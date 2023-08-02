package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class ReplaceAllDigitsWithCharacters_1844 {
	/*
	 * Input: String s
	 * Output: String
	 * Iterate the for loop check the even position and replace char with digits
	 */
	
	@Test
	public void Test1() {
		String replaceDigits = replaceDigits("a1c1e1");
		Assert.assertEquals("abcdef", replaceDigits);
	}
	
	@Test
	public void Test2() {
		String replaceDigits = replaceDigits("a1b2c3d4e");
		Assert.assertEquals("abbdcfdhe", replaceDigits);
	}
	
	public String replaceDigits(String s) {	
		String out="";
		for(int i=0;i<s.length();i++) {
			if(i%2==0) {
				out = out + s.charAt(i);
			}else {
				out = out + (char)(i+97);
			}
		}
		return out;
	}

}
