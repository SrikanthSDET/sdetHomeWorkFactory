package DSA15July;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MissingNumber_268 {
	
	/*
	 * Input: int[]
Output: int
Sorting the given Array 
Iterate through the loop 
Checking with Array value and Array iteration value
return the missing Array iteration value
	 */
	
	@Test
	public void Test1() {
		int findMissingNumber = findMissingNumber(new int[] {3,0,1});
		Assert.assertEquals(2, findMissingNumber);
	}
	
	@Test
	public void Test2() {
		int findMissingNumber = findMissingNumber(new int[] {0,1});
		Assert.assertEquals(2, findMissingNumber);
	}
	
	@Test
	public void Test3() {
		int findMissingNumber = findMissingNumber(new int[] {8,6,4,2,3,5,7,0,1});
		Assert.assertEquals(9, findMissingNumber);
	}
	
	public int findMissingNumber(int[] num) {
		Arrays.sort(num);
		for(int i=0;i<num.length;i++) {
			if(i!=num[i]) {
				return i;
			}
		}
		
		return num.length;
	}

}
