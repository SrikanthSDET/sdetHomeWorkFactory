package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class Palindrome_9 {
	
	/*
	 * Input: Int num
Output: Boolean
Check the given number > 0
intialize num, sum with 0
Modulus with 10 for the given number to get the remainder value
To get the number reversed we do the multiplication with 10 and add the remainder
To iterate the while loop with remaining value we do the divide operation with 10
Iterate the loop till we reach the num 0 
 compare the given value and sum value 
	 * 
	 * 
	 */
	
	//@Test
	public void Test1() {
		boolean findPalindorm = findPalindrom(121);
		Assert.assertEquals(true, findPalindorm);
	}
	
	//@Test
	public void Test2() {
		boolean findPalindorm = findPalindrom(-121);
		Assert.assertEquals(false, findPalindorm);
	}
	
	//@Test
	public void Test3() {
		boolean findPalindorm = findPalindrom(10);
		Assert.assertEquals(false, findPalindorm);
	}
	
	@Test
	public void Test4() {
		boolean findPalindorm = findPalindrom1(121);
		Assert.assertEquals(true, findPalindorm);
	}
	public boolean findPalindrom(int num) {
		int temp;
		int rem=0;
		int sum=0;
		temp=num; 
		while(num>0) {
			rem = num%10;
			sum=sum*10+rem;
			num=num/10;
		}
		return sum==temp;
	}
	
	public boolean findPalindrom1(int num) {
		char[] chars = ("" + num).toCharArray();
		String str="";
		
			for(int i=chars.length-1;i>=0;i--) {
				str = str+chars[i];
			}
			
		
		return Integer.parseInt(str)==num;
	}

}
