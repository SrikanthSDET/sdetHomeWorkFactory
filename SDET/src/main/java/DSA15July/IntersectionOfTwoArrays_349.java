package DSA15July;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class IntersectionOfTwoArrays_349 {
	
	@Test
	public void Test1() {
		int[] findInterscetionOfTwoArrays = findInterscetionOfTwoArrays(new int[] {1,2,2,1},new int[] {2,2});
		Assert.assertArrayEquals(new int[] {2}, findInterscetionOfTwoArrays);
	}
	
	@Test
	public void Test2() {
		int[] findInterscetionOfTwoArrays = findInterscetionOfTwoArrays(new int[] {4,9,5},new int[] {9,4,9,8,4});
		Assert.assertArrayEquals(new int[] {4,9}, findInterscetionOfTwoArrays);
	}
	
	public int[] findInterscetionOfTwoArrays(int[] nums1,int[] nums2) {
		String out="";
		
		Arrays.sort(nums1);
		Arrays.sort(nums2);
		String interStr1=removeDuplicate(nums1);
		String interStr2=removeDuplicate(nums2);
		
		for(int i=0;i<interStr1.length();i++) {
			for(int j=0;j<interStr2.length();j++) {
				if(interStr1.charAt(i)==interStr2.charAt(j)) {
					out=out+interStr1.charAt(i);
				}
			}
		}
		
		int[] finalOut = new int[out.length()];
		for(int k=0;k<out.length();k++) {
			finalOut[k]=out.charAt(k)-48;
		}
		
		return finalOut;	
	}
	
	public String removeDuplicate(int[] num) {
		String temp="";//4,9,5 //9,4,9,8,4
		for(int i=0;i<num.length-1;i++) {
			if(num[i]!=num[i+1]) {
				temp=temp+num[i];
			}
		}
		temp=temp+num[num.length-1];
		
		return temp;
	}

}
