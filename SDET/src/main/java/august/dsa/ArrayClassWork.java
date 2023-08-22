package august.dsa;

import org.junit.Assert;
import org.junit.Test;

public class ArrayClassWork {
	
	/*
    Given two array, arr1, and arr2
    Subtract the sum of arr2 with arr1 respective index value, and also the sum should exclude the respective index in arr2
     
     arr1 = {1,2,3,4} , arr2 = {2,3,4,5}
     
     output = {
     3+4+5-1,
     2+4+5-2,
     2+3+5-3,
     2+3+4-4     
     */
	@Test
	public void Test1() {
		
		
		Assert.assertArrayEquals(new int[] {11,9,7,5}, findArrayMath(new int[] {1,2,3,4},new int[] {2,3,4,5}));
	}
	
	public int[] findArrayMath(int[] arr1,int[] arr2) {
		int sum=0;
		int[] output = new int[arr1.length];
		for(int i=0;i<arr1.length;i++) {
			for (int j=0;j<arr2.length;j++) {
				if(i==j) continue;	
				
				sum += arr2[j];
			}
			output[i]=sum-arr1[i];
			sum=0;
		}
		return output;
	}

}
