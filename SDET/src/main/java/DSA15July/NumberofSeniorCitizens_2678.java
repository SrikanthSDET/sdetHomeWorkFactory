package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class NumberofSeniorCitizens_2678 {
	
	/*
	 * Input: String Array
Output: Int
Declare int count 
iterate through the for loop with given array
condition Using Substring(11,13) and convert to int check the value > 60 
return count
	 */
	
	@Test
	public void test1() {
		int findSeniorCitizens = findSeniorCitizens(new String[] {"7868190130M7522","5303914400F9211","9273338290F4010"});
		Assert.assertEquals(2, findSeniorCitizens);
	}
	
	@Test
	public void test2() {
		int findSeniorCitizens = findSeniorCitizens(new String[] {"1313579440F2036","2921522980M5644"});
		Assert.assertEquals(0, findSeniorCitizens);
	}
	int count=0;
	public int findSeniorCitizens(String[] str) {
		for(int i=0;i<str.length;i++) {			
			if(Integer.parseInt(str[i].substring(11, 13))>60) {
				count++;
			}
		}
		return count;
	}
	

}
