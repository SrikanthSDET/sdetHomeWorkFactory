package DSA15July;

import org.junit.Test;

import junit.framework.Assert;

public class CheckAllAAppearsBeforeAllB_2124 {
	/*
	 *  Input: String str
		Output: boolean 
		Condition
		1st index of b < 0 return false
		last index of a and 1st index of b ? true : false
	 */
	
	@Test
	public void Test1() {
		boolean findCheckAllAAppearsBeforeAllB = findCheckAllAAppearsBeforeAllB("aaabbb");
		Assert.assertEquals(true, findCheckAllAAppearsBeforeAllB);
	}
	
	@Test
	public void Test2() {
		boolean findCheckAllAAppearsBeforeAllB = findCheckAllAAppearsBeforeAllB("abab");
		Assert.assertEquals(false, findCheckAllAAppearsBeforeAllB);
	}
	
	@Test
	public void Test3() {
		boolean findCheckAllAAppearsBeforeAllB = findCheckAllAAppearsBeforeAllB("bbb");
		Assert.assertEquals(true, findCheckAllAAppearsBeforeAllB);
	}
	
	public boolean findCheckAllAAppearsBeforeAllB(String str) {
		if(str.indexOf('b')<0)
			return false;
					
		return (str.lastIndexOf('a') < str.indexOf('b') )? true : false;
		
	}

}
