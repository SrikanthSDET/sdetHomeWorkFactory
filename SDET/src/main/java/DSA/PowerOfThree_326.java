package DSA;

import org.junit.Assert;
import org.junit.Test;

public class PowerOfThree_326 {
	/*
	 * Input: integer 
	 * Output: boolean
	 * Given input is less than 3 return false
	 * Given input is % with 2 remainder is Zero return false
	 * Get through while until number%3 remainder is 3 then return true 
	 */
	
	@Test
	public void Test() {
		boolean findPowerOfThree = findPowerOfThree(244);
		Assert.assertTrue(findPowerOfThree);
	}
	
	public boolean findPowerOfThree(int num) {
		
		
			while(num>=3) {						
				num=num/3;
				
				if(num==1)
					return true;
			}
			return false;
			
	}
}
