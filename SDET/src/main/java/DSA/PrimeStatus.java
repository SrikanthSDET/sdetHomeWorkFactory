package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class PrimeStatus {
	/*
	 * Check the given number is prime or not
	 * Input: Number
	 * Output: Boolean
	 * Traverse 0 to n (given Number)
	 * Check modulus if only given number give modulus 0 then it's Prime
	 */
	@Test
	public void Test1() {
		boolean primeStatus = findPrimeNumber1(97);
		Assert.assertEquals(true, primeStatus);
	}
	
	@Test
	public void Test2() {
		boolean primeStatus = findPrimeNumber1(98);
		Assert.assertEquals(false, primeStatus);
	}
	
	public Boolean findPrimeNumber(int Num) {
		int Cnt=0;
		for(int i=2; i <= Num; i++) {
			if(Num%i == 0) {
				Cnt++;
			}
		}
		if(Cnt>1)
		return false;	
		
		return true;
	}
	
	public Boolean findPrimeNumber1(int Num) {
		
		for(int i=2; i < Num; i++) {
			if(Num%i == 0) {
				return false;
			}
		}				
		return true;
	}

}
