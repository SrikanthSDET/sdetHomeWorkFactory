package DSA30July;

import org.junit.Test;

import junit.framework.Assert;

public class AlternatingDigitSum {
	
	@Test
	public void Test1() {
		int findAlternatingDigitSum = findAlternatingDigitSum(521);
		Assert.assertEquals(4, findAlternatingDigitSum);
	}
	
	@Test
	public void Test2() {
		int findAlternatingDigitSum = findAlternatingDigitSum(111);
		Assert.assertEquals(1, findAlternatingDigitSum);
	}
	
	@Test
	public void Test3() {
		int findAlternatingDigitSum = findAlternatingDigitSum(886996);
		Assert.assertEquals(0, findAlternatingDigitSum);
	}
	
	public int findAlternatingDigitSum(int n) {
		int sum=0;
		String str = Integer.toString(n);
		for(int i=0;i<str.length();i++) {
			if(i%2==0) {
				sum=sum+ str.charAt(i)-48;
			}else {
				sum=sum+-(str.charAt(i)-48);
			}
		}
		return sum;
	}

}
