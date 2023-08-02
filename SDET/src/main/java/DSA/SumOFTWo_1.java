package DSA;

import org.junit.Assert;
import org.junit.Test;

public class SumOFTWo_1 {
	
	/*
	 * 
	 * Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.
	 *
	 *Input: int[], int
	 *Outout: int[]
	 * Iterate the array with nested for loop
	 * outloop + innerloop = target
	 *  return [outloop,inner loop]
	 *  
	 *  return [-1,-1]
	 */
	
	@Test
	public void Test1() {
		int[] result = findSumElement(new int[] {2,7,11,15},9);
		Assert.assertArrayEquals(new int[] {0, 1},result);
	}
	
	@Test
	public void Test2() {
		int[] result = findSumElement(new int[] {3,2,4},6);
		Assert.assertArrayEquals(new int[] {1, 2},result);
	}
	
	@Test
	public void Test3() {
		int[] result = findSumElement(new int[] {3,3},6);
		Assert.assertArrayEquals(new int[] {0, 1},result);
	}
	
	public int[] findSumElement(int[] n, int t) {
		
		for(int i=0;i<n.length;i++) {		
			for(int j=i+1;j<n.length;j++) {
				if(n[i]+n[j]==t) {
					return new int[] {i,j};
					
				}
			}
			
		}
		return new int[] {-1,-1};
	}

}
