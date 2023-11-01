package november;

import java.util.HashMap;
import java.util.Stack;

import org.junit.Assert;
import org.junit.Test;

public class LongPressedName_925 {
	
	@Test
	public void testData1() {
		Assert.assertTrue(isValidLongPressedName("alex","aaleex"));
	}
	
	@Test
	public void testData2() {
		Assert.assertFalse(isValidLongPressedName("alex","aaleexa"));
	}
	
	public boolean isValidLongPressedName(String name,String typed) {
		if(name.length()==typed.length()) {
			return name.equals(typed);
		}
		if(!(name.startsWith(String.valueOf(typed.charAt(0))) &&
				name.endsWith(String.valueOf(typed.charAt(typed.length()-1))))) {
			return false;
		}
		HashMap<Character,Integer> nameMap = new HashMap<>();
		HashMap<Character,Integer> typedMap = new HashMap<>();
		for(int i=0;i<name.length();i++){
			nameMap.put(name.charAt(i),nameMap.getOrDefault(name.charAt(i),0)+1);
		}
		for(int i=0;i<typed.length();i++){
			typedMap.put(typed.charAt(i),typedMap.getOrDefault(typed.charAt(i),0)+1);
		}		
		for(int i=0;i<name.length();i++){
			if(!(nameMap.containsKey(name.charAt(i)) && typedMap.containsKey(name.charAt(i)))) {
				return false;
			}
			if(nameMap.get(name.charAt(i))>typedMap.get(name.charAt(i))){
				return false;
			}
		}
		return true;		
	}
	
	public boolean isValidLongPressedName1(String name,String typed) {
		if(name.length()==typed.length()) {
			return name.equals(typed);
		}
		if(!(name.startsWith(String.valueOf(typed.charAt(0))) || 
				name.endsWith(String.valueOf(typed.charAt(typed.length()-1))))) {
			return false;
		}
		Stack<Character> nameStack = new Stack<>();
		Stack<Character> typedStack = new Stack<>();
		for(int i=0;i<name.length();i++) {			
			if(nameStack.isEmpty()) {
				nameStack.push(name.charAt(i));
			}			
			else if(nameStack.peek()==name.charAt(i)) {
				nameStack.pop();
				nameStack.push(name.charAt(i));
			}else {
				nameStack.push(name.charAt(i));
			}
		}
		for(int i=0;i<typed.length();i++) {
			if(typedStack.isEmpty()) {
				typedStack.push(typed.charAt(i));
			}else if(typedStack.peek()==typed.charAt(i)) {
				typedStack.pop();
				typedStack.push(typed.charAt(i));
			}else {
				typedStack.push(typed.charAt(i));
			}
		}
		
		if(nameStack.size()==typedStack.size()) return false;
		
		return nameStack.equals(typedStack);		
	}

}
