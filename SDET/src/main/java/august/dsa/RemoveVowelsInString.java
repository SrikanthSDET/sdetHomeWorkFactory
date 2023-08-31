package august.dsa;

import org.junit.Test;

import junit.framework.Assert;

public class RemoveVowelsInString {
	
	@Test
	public void Test1() {		
		Assert.assertEquals("H tstlf stdnts", removeVowels("Hi testleaf students"));
	}
	
	public String removeVowels(String str) {
		//String output="";
		StringBuilder output = new StringBuilder();
		for(int i=0;i<str.length();i++) {
			if(str.charAt(i)==('A') || str.charAt(i)==('E')|| str.charAt(i)==('I')|| str.charAt(i)==('O')|| str.charAt(i)==('U')||str.charAt(i)==('a') || str.charAt(i)==('e')|| str.charAt(i)==('i')|| str.charAt(i)==('o')|| str.charAt(i)==('u')) {
				
			}else {
				//output += str.charAt(i);
				output.append(str.charAt(i));
			}
		}
		System.out.println(output);
		return output.toString();
	}

}
