package DSA;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.junit.Test;

public class CountTheOneValue {
	
	/*
	 * int[] nums = { 0, 0, 0, 1, 1, 1 };
Find the number of 1's present in the array

Input: Array
Output: int
Traverse the Array with loop
using if condition verify "1" is present and increment the value

	 */
	@Test
	public void Test1() {
		System.out.println(findthecountofOne(new int[] { 0, 0, 0, 1, 1, 1 ,1}));
		
		
	}
	
	public int findthecountofOne(int[] n) {
		
		Map<Integer,Integer> output = new HashMap<Integer,Integer>();
		for (int i : n) {
			if(!output.containsKey(i)) {
				output.put(i, 1);
			}else {
				output.put(i, output.get(i)+1);
			}		
			
		}
		return output.get(1);
		}		
	

}
