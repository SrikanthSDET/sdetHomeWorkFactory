package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class FindtheDifference_389 {
	
	@Test
	public void Test1() {
		char findtheDifference = FindtheDifference("abcd","acbde");
		Assert.assertEquals('e', findtheDifference);
	}
	
	@Test
	public void Test2() {
		char findtheDifference = FindtheDifference("","y");
		Assert.assertEquals('y', findtheDifference);
	}
	
	public char FindtheDifference(String str1,String str2) {	

		int maxLength = (str1.length()>str2.length()) ? str1.length() : str2.length();
		char[] arr1 = new char[maxLength];
		char[] arr2 = new char[maxLength];		
		for(int i=0;i<str1.length();i++) {
			arr1[i]=str1.charAt(i);			
		}
		for(int i=0;i<str2.length();i++) {			
			arr2[i]=str2.charAt(i);
		}
		for(int i=0;i<arr1.length;i++) {
			
				if(arr1[i]!=arr2[i]) {
					return arr2[i];
				
			}
		}
		
		return ' ';
	}

}
