package DSA;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class FindDuplicateCharacter {

	public static void main(String[] args) {
		FindDuplicateCharacter dup = new FindDuplicateCharacter();
		String str = "Amazon Development Centre";
		dup.findDuplicateBruteForce(str);
		dup.findDuplicateUsingSet(str);
		dup.findDuplicateUsingMap(str);
	}
	
	/**
	 * @param str
	 */
	public void findDuplicateBruteForce(String str) {
		char[] chars = str.toCharArray();
		List<Character> lst = new ArrayList<Character>();
		for(int i=0; i<chars.length; i++) {
			for(int j=i+1; j<chars.length; j++) {
				if(chars[i]==chars[j]) {
					if(!lst.contains(chars[i])) {					
					System.out.print(chars[i]);	
					lst.add(chars[i]);		
					}
					break;
				}				
			}
			
		}
		System.out.println();
	}
	
	public void findDuplicateUsingSet(String str) {
		char[] chars = str.toCharArray();
		Set<Character> set = new HashSet<Character>();
		Set<Character> unique = new HashSet<Character>();
		for(int i=0;i<chars.length;i++) {
			if(!set.add(chars[i])) {				
				if(unique.add(chars[i]))				
					System.out.print(chars[i]);					
			}
		}
		System.out.println();
	}
	
	public void findDuplicateUsingMap(String str) {
		char[] chars = str.toCharArray();
		Map<Character,Integer> map = new HashMap<Character,Integer>();
		for(Character ch : chars) {
			if(!map.containsKey(ch)) {
				map.put(ch, 1);
			}else {
				map.put(ch, map.get(ch)+1);
			}
		}
		for(Character ch : map.keySet()) {
			if(map.get(ch)>1) {
				System.out.print(ch);
			}
		}
	}

}
