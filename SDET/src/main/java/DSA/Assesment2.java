package DSA;

import java.util.Arrays;

import org.junit.Test;

public class Assesment2 {

	/*
	 * Input : Int Array
	 * Output : int
	 * get the length of the given array
	 * Sorting the Array
	 * Traverse through loop
	 * Check the Condition
	 * 
	 */
	@Test
	public void Test1() {
		System.out.println(findMissingNumber(new int[] {3,0,1}));
	}
	
	@Test
	public void Test2() {
		System.out.println(findMissingNumber(new int[] {0,1}));
	}
	
	@Test
	public void Test3() {
		System.out.println(findMissingNumber(new int[] {9,6,4,2,3,5,7,0,1}));
	}
	//0,2,3
	public int findMissingNumber(int[] n) {
		
	    Arrays.sort(n);
	    
	    for(int i=0;i<n.length;i++) {
	    	if(n[i] != i)
	    	{
	    		return i;
	    	}			
	    }
		
		return n.length;
	}
}
