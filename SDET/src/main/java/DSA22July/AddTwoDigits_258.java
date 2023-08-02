package DSA22July;

import org.junit.Test;

import junit.framework.Assert;

public class AddTwoDigits_258 {

	/*
	 * //Input: num //Output: sum of num //Logic: Initialize sum & rem=0 //1. In a
	 * while loop, till the num >0, extract the last digit by num%10 and store in
	 * rem //2. add the rem to sum //3. To extrat the next digit divide it by 10 and
	 * store in num //4. If the sum>9, call the same method again by passing the sum
	 * in param and return it //5. if not, return sum
	 */
	@Test
	public void Test1() {
		int findSumOfTwoNums = findSumOfTwoNums(38);
		Assert.assertEquals(2, findSumOfTwoNums);
	}

	@Test
	public void Test2() {
		int findSumOfTwoNums = findSumOfTwoNums(0);
		Assert.assertEquals(0, findSumOfTwoNums);
	}

	public int findSumOfTwoNums(int num) {

		
		  int sum=num;
		  
		  while(sum>9) { 
			  sum = findSum(sum); 
		  }		 

		return sum;
	}

	public int findSum(int num1) {
		int sum = 0, rem = 0;
		while (num1 > 0) {
			rem = num1 % 10;
			sum = sum + rem;
			num1 = num1 / 10;
		}
		return sum;
	}

}
