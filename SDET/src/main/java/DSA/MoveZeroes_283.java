package DSA;

import org.junit.Assert;
import org.junit.Test;

public class MoveZeroes_283 {
	/*
	 * Input: Int[]
		Output: Int[]
		Create another array with same size
		loop through the array and check the value
		insert the non-zero values into new array
		remaining element position filled with zero by default
	 */
	@Test
	public void Test() {
		int[] moveZeroAtEnd = moveZeroAtEnd(new int[] {0,1,0,3,12});
		Assert.assertArrayEquals(new int[] {1,3,12,0,0}, moveZeroAtEnd);
	}
	
	@Test
	public void Test1() {
		int[] moveZeroAtEnd = moveZeroAtEnd(new int[] {0,1,-1,3,12});
		Assert.assertArrayEquals(new int[] {1,-1,3,12,0}, moveZeroAtEnd);
	}
	
	@Test
	public void Test2() {
		int[] moveZeroAtEnd = moveZeroAtEnd(new int[] {0});
		Assert.assertArrayEquals(new int[] {0}, moveZeroAtEnd);
	}

	public int[] moveZeroAtEnd(int[] num) {
		int[] num1 = new int[num.length];
		int j=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=0) {
				num1[j]=num[i];
				j++;
			}
		}
		
		return num1;
	}
}
