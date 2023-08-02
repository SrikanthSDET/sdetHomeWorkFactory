package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class Maximum69Number_1323 {
	
	@Test
	public void Test1() {
		int findMaximumNumber = findMaximumNumber(9669);
		Assert.assertEquals(9969, findMaximumNumber);
	}
	
	@Test
	public void Test2() {
		int findMaximumNumber = findMaximumNumber(9996);
		Assert.assertEquals(9999, findMaximumNumber);
	}
	
	@Test
	public void Test3() {
		int findMaximumNumber = findMaximumNumber(9999);
		Assert.assertEquals(9999, findMaximumNumber);
	}
	
	public int findMaximumNumber(int num) {		
		String stringNum = Integer.toString(num);
		stringNum = stringNum.replaceFirst("6", "9");
		
		if(Integer.parseInt(stringNum)>num) {
			return Integer.parseInt(stringNum);
		}
		
		return num;
	}

}
