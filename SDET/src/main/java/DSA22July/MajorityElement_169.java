package DSA22July;

import java.util.Arrays;

import org.junit.Test;

import junit.framework.Assert;

public class MajorityElement_169 {
	
	@Test
	public void Test1() {
		int findMEInArray = findMajorityElementsInArray(new int[] {3,2,3});
		Assert.assertEquals(3, findMEInArray);
	}
	
	@Test
	public void Test2() {
		int findMEInArray = findMajorityElementsInArray(new int[] {2,2,1,1,1,2,2});
		Assert.assertEquals(2, findMEInArray);
	}
	
	public int findMajorityElementsInArray(int[] nums) {
		int counter=1,maxElement=0,temp=0;
		String elements="", count="";
		Arrays.sort(nums);
		
		for(int i=0;i<nums.length-1;i++) {
			if(nums[i]==nums[i+1]) {
				counter++;
				elements=elements+nums[i];
				count= count + counter;
				counter=1;
			}else {
				elements=elements+nums[i];
				count=count + counter;
				counter=1;
			}
		}		
			
			for(int i=0;i<count.length();i++) {				
				if(i==count.length()-1) {
					if(count.charAt(i-1)>count.charAt(i)) {
						temp = elements.charAt(i-1)-48;
						break;
					}else {
						temp = elements.charAt(count.length()-1)-48;
						break;
					}
					
				}
				if(count.charAt(i)>count.charAt(i+1)) {
					temp = elements.charAt(i)-48;
				}
			}
		
		return maxElement=temp;
	}

}
