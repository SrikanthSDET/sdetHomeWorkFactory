package DSA22July;

import org.junit.Test;

import junit.framework.Assert;

public class ExcelSheetColumnNumber_171 {
	
	/*
	 * 
	 */
	
	@Test
	public void Test1(){
		int findExcelColNumber = findExcelColNumber("A");
		Assert.assertEquals(1, findExcelColNumber);
	}
	
	@Test
	public void Test2(){
		int findExcelColNumber = findExcelColNumber("AB");
		Assert.assertEquals(28, findExcelColNumber);
	}
	
	@Test
	public void Test3(){
		int findExcelColNumber = findExcelColNumber("ZY");
		Assert.assertEquals(701, findExcelColNumber);
	}
	
	public int findExcelColNumber(String columnTitle) {
		int out = 0;
	    for (int i = 0; i < columnTitle.length(); i++)
	    {
	    	out = out * 26;
	    	out = out + columnTitle.charAt(i) - 'A' + 1;
	    }
	    return out;
	}
	
	


}
