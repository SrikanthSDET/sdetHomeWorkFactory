package DSA;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class CountOfPrimeNumbers {
	/*
	 * Given an integer n, return the number of prime numbers that are strictly less than n.
	 * Input: int
	 * Output: int
	 * find the prime number with condition with for loop
	 * count the number of prime number with while loop
	 * return the count 
	 * 
	 */
	@Test
	public void Test1() {
		int countPrimeNumbers = countPrimeNumbers(10);
		Assert.assertEquals(4, countPrimeNumbers);		
	}
	
	@Test
	public void Test2() {
		int countPrimeNumbers = countPrimeNumbers(0);
		Assert.assertEquals(0, countPrimeNumbers);		
	}
	
	@Test
	public void Test3() {
		int countPrimeNumbers = countPrimeNumbers(1);
		Assert.assertEquals(0, countPrimeNumbers);		
	}
	
	public int countPrimeNumbers(int n) {
		int count=0;
		for(int i=2; i<n; i++) {
			boolean prime = true;
			for(int j=2; j < i; j++) {
				if(i%j==0) {
					prime=false;
					break;
				}
			}
			if(prime) {			
				count++;
				
			}
			
		}
		return count;
	}
	
	public void countPrimeNumberWhile(int n) {
		int count=0;
		int i=2;
		List<Integer> li = new ArrayList<Integer>();
		while(i<n) {
			boolean prime = true;
			int j=2;
			while(j < i) {
				if(i%j==0) {
					prime=false;
					break;
				}
				j++;
			}
			if(prime) {	
				li.add(i);
				count++;
				
			}
			i++;
		}
		System.out.println(li);
		System.out.println(count);
	}

}
