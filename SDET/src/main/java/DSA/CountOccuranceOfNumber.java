package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

import org.junit.Test;

public class CountOccuranceOfNumber {
	@Test
	public void Test1() {
		
	}
	
	public void findMajorityElement(int[] n) {
		int mid = n.length/2;
		Map<Integer,Integer> output = new HashMap<Integer,Integer>();
		for (int i : n) {
			if(!output.containsKey(i)) {
				output.put(i, 1);
			}else {
				output.put(i, output.get(i)+1);
			}		
			
		}

	}
	
}
