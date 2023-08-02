package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class PowerOfTwo_231 {
	/*
	 * input integer n
if n==1,  its a 2 power 0,
using while loop keep diving by ==0;
else the output is false
return boolean true/false
	 */
	@Test
	public void Test1() {
		boolean findPowerTwo = findPowerTwo(20);
		Assert.assertTrue(!findPowerTwo);
	}
	
	public boolean findPowerTwo(int n) {
		
		
		while(n%2==0)
		{
			n=n/2;						
		}
		
		return (n==1) ? true : false; 
	}

}
