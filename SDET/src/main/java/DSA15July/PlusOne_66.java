package DSA15July;

import org.junit.Assert;
import org.junit.Test;

public class PlusOne_66 {
	
	/*
	 * InPut: Int Array
	 * Output: Int Array
	 * Check input array last element <9 then +1 and return array
	 * else create empty string, add the int[] values into that string
	 * Convert that string to int and +1 and convert back to String
	 * Create the int[] with String length 
	 * Add the values with ASCII to int 
	 * finally return the int Array
	 */
	
	@Test
	public void Test1() {
		int[] findPlusOneValue = findPlusOneValue(new int[] {1,2,3});
		Assert.assertArrayEquals(new int[] {1,2,4}, findPlusOneValue);
	}
	
	@Test
	public void Test2() {
		int[] findPlusOneValue = findPlusOneValue(new int[] {4,3,2,1});
		Assert.assertArrayEquals(new int[] {4,3,2,2}, findPlusOneValue);
	}
	
	@Test
	public void Test3() {
		int[] findPlusOneValue = findPlusOneValue(new int[] {9});
		Assert.assertArrayEquals(new int[] {1,0}, findPlusOneValue);
	}
	
	public int[] findPlusOneValue(int[] num) {
		if(num[num.length-1]<9) {
			num[num.length-1]=num[num.length-1]+1;
			return num;
		}
		
		String newValue="";
		for(int i=0;i<num.length;i++) {
			newValue=newValue+num[i];
		}
		
		int parseInt = Integer.parseInt(newValue);
		parseInt=parseInt+1;
		
		newValue = Integer.toString(parseInt);
		
		char[] charArray = newValue.toCharArray();
		int[] num1 = new int[charArray.length];
		int i=0;
		for (char each : charArray) {
			num1[i++]=Integer.valueOf(each-48);
		}
		
		
		return num1;
	}

}
