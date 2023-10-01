package DSA;

import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElement_Map_169 {
	
	/*
	 * Find the Majority Element from given Integer Array
	 * Input: Integer Array 
	 * Output: Integer 
	 * Find the mid value of array length 
	 * Traverse the array with map
	 * Apply the condition
	 */
	@Test
	public void Test1() {
		
		Assert.assertEquals(2, findMajorityElement(new int[] {2,2,1,1,1,2,2}));
	}
	
	public int findMajorityElement(int[] n) {
		int mid = n.length/2;
		Map<Integer,Integer> output = new HashMap<Integer,Integer>();
		for (int i : n) {
			if(!output.containsKey(i)) {
				output.put(i, 1);
			}else {
				output.put(i, output.get(i)+1);
			}		
			
		}
		for (int j : output.keySet()) {
			if(output.get(j)>mid) {
				return j;
			}
		}
		return 0;
	}

}
