package DSA;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeSet;

import org.junit.Test;

public class HomeWork2 {
	
	/*
	 * Get the count of each character count in the given String
	 * Input: String
	 * Output: Map<Character,Integer>
	 */
	@Test
	public void Test1() {
		System.out.println(findCharacterCount("Hello Welcome to SDET"));
	}
	
	public Map<Character,Integer> findCharacterCount(String str) {
		char[] input = str.toCharArray();
		Map<Character,Integer> output = new HashMap<Character,Integer>();
		for (Character c : input) {
			if(!output.containsKey(c)) {
				output.put(c, 1);
			}else {
				output.put(c, output.get(c)+1);
			}
		}
		return output;
	}
	

}
