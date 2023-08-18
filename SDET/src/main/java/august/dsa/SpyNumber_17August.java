package august.dsa;

import org.junit.Assert;
import org.junit.Test;

public class SpyNumber_17August {
	@Test
	public void Test1() {
		boolean findSpyNumber = findSpyNumber(132);
		Assert.assertTrue(findSpyNumber);
	}
	
	@Test
	public void Test2() {
		boolean findSpyNumber = findSpyNumber(130);
		Assert.assertTrue(!findSpyNumber);
	}
	
	@Test
	public void Test3() {
		boolean findSpyNumber = findSpyNumber(0);
		Assert.assertTrue(findSpyNumber);
	}
	public boolean findSpyNumber(int num) {
		String str = Integer.toString(num);
		if(str.length()==1) {
			return true;
		}
		int sumVal = 0;
		int prodVal = 1;
		
		for(int i=0;i<str.length();i++) {
			sumVal=sumVal+(str.charAt(i)-48);
			prodVal=prodVal*(str.charAt(i)-48);
		}
		if(sumVal==prodVal)
			return true;
		
		return false;
	}

}
