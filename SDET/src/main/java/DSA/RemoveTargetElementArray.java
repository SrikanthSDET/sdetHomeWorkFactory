package DSA;

import org.junit.Assert;
import org.junit.Test;

public class RemoveTargetElementArray {
	
	/*
	 * #Initialize integer[] input, target, count=0, index=0 variables
	#using for loop for iteration, compare the input[i] and target is not equal, then increment the count value
	#initialize the new integer array using count.
	#again using for loop for iteration, compare the input[i] and target is not equal, then stored to the new array
	#increment the index variable
	#return value is integer[]
	 */
	
	@Test
	public void Test1() {
		int[] removeTargetElement = removeTargetElement(new int[] {2, 3, 3, 4, 5},3);
		Assert.assertArrayEquals(new int[] {2,4,5}, removeTargetElement);
	}
	
	@Test
	public void Test2() {
		int[] removeTargetElement = removeTargetElement(new int[] {2, 2},2);
		Assert.assertArrayEquals(new int[] {}, removeTargetElement);
	}
	
	@Test
	public void Test3() {
		int[] removeTargetElement = removeTargetElement(new int[] {2, 3, 3, 4, 5},5);
		Assert.assertArrayEquals(new int[] {2,3,3,4}, removeTargetElement);
	}
	
	public int[] removeTargetElement(int[] num,int tar) {
		int tarCount=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]==tar) {
				tarCount++;
			}
		}
		int[] out = new int[num.length-tarCount];
		int j=0;
		for(int i=0;i<num.length;i++) {
			if(num[i]!=tar) {
				out[j]=num[i];
				j++;
			}
		}
		return out;
	}

}
