package DSA;


import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

import org.junit.Test;

import junit.framework.Assert;

public class FindSingleNumber_136 {
	/*
	 * Given a non-empty array of integers nums, 
	 * every element appears twice except for one. Find that single one
	 * InPut: int[]
	 * Output: int
	 * create empty map 
	 * Traverse array through loop and find the element count and add in Map
	 * Find the single element based value count
	 */
	@Test
	public void Test1() {
		int singleVal = findSingleNumber1(new int[] {2,2,1});
		Assert.assertEquals(1, singleVal);
	}
	@Test
	public void Test2() {
		int singleVal = findSingleNumber1(new int[] {4,1,2,1,2});
		Assert.assertEquals(4, singleVal);
	}
	@Test
	public void Test3() {
		int singleVal = findSingleNumber1(new int[] {1});
		Assert.assertEquals(1, singleVal);
	}
	
	public int findSingleNumber(int[] n) {
		Map<Integer,Integer> map = new HashMap<Integer,Integer>();
		for (int i : n) {
			if(map.containsKey(i)) {
				map.put(i, map.get(i)+1);
			}else {
				map.put(i, 1);
			}
		}
		for (Entry<Integer, Integer> entry : map.entrySet()) {
            if (entry.getValue().equals(1)) {
                return entry.getKey();
            }
        }		
		return 0;
	}
	
	public int findSingleNumber1(int[] n) {
		Arrays.sort(n);
		for(int i=0;i<n.length-1;i++) {
			if(n[i]!=n[i+1])
				return n[i];
		}
		return n[0];
	}
	
}
