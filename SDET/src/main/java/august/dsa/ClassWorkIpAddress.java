package august.dsa;

import org.junit.Test;

import junit.framework.Assert;

public class ClassWorkIpAddress {
	//Input: address = "1.1.1.1"
	//Output: "1[.]1[.]1[.]1"
	
	//1.Get the input String 
    //2.Create a String to store the Changing string element
    //3.for loop to iterate the String value 
    //4.Initialize character and get the character from String
    //5.if the string equal to . then Append it to [.]
    //6.else append the character and store back 
    //7.return the stored array string 
	
	@Test
	public void Test1(){		
		Assert.assertEquals("1[.]1[.]1[.]1", replaceStringValue("1.1.1.1"));
	}
	
	public String replaceStringValue(String address) {
		String Output="";
		for(int i=0;i<address.length();i++) {
			if(address.charAt(i)=='.') {
				Output += "[.]";
			}else {
				Output += address.charAt(i);
			}
		}
		System.out.println(Output);
		return Output;
	}

}
