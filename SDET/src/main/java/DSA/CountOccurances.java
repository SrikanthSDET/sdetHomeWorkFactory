package DSA;

import org.junit.Test;

import junit.framework.Assert;

public class CountOccurances {
	
	/*
	 * Initialize int type count var as 0.
	   iterate through outer loop (i)/Iterate through array elements 
	   increase the count+1 every time array values is equal to X 
       Return count 
	 */
	@Test
	public void Test1() {
		int Count = findCountOccurances(new int[] {1, 1, 2, 2, 2, 2, 3},2);
		Assert.assertEquals(4, Count);
	}
	
	@Test
	public void Test2() {
		int Count = findCountOccurances(new int[] {1, 1, 2, 2, 2, 2, 3},3);
		Assert.assertEquals(1, Count);
	}
	
	@Test
	public void Test3() {
		int Count = findCountOccurances(new int[] {1, 1, 2, 2, 2, 2, 1},1);
		Assert.assertEquals(3, Count);
	}
	public int findCountOccurances(int[] num, int Occ) {
		int Cnt=0;
		for(int i =0; i<num.length; i++) {
			if(num[i]==Occ) {
				Cnt++;
			}
		}
		return Cnt;
	}

}
