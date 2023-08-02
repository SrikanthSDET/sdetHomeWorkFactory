package DSA15July;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class UniqueNumberOfOccurrences_1207 {
	
	@Test
	public void Test1() {
		boolean uniqueOccStatus = findUniqueNumberOfOccurrences(new int[] {1,2,2,1,1,3});
		Assert.assertTrue(uniqueOccStatus);
	}
	
	@Test
	public void Test2() {
		boolean uniqueOccStatus = findUniqueNumberOfOccurrences(new int[] {1,2});
		Assert.assertTrue(!uniqueOccStatus);
	}
	
	@Test
	public void Test3() {
		boolean uniqueOccStatus = findUniqueNumberOfOccurrences(new int[] {-3,0,1,-3,1,1,1,-3,10,0});
		Assert.assertTrue(uniqueOccStatus);
	}
	
	public boolean findUniqueNumberOfOccurrences(int[] arr) {
		int count=1;
		String numOccur="";
		Arrays.sort(arr);
		for(int i=0;i<arr.length;i++) {
			
			if(arr.length==2)
				return false;
			
			if(i==arr.length-1) {				
				numOccur=numOccur+Integer.toString(count);
				break;
			}
			
			if(arr[i]==arr[i+1]) {
				count++;
			}else {				
				numOccur=numOccur+Integer.toString(count);
				count=1;
			}		
		}
		
		
		for(int j=0;j<numOccur.length()-1;j++) {			
				if(numOccur.charAt(j)==numOccur.charAt(j+1)){
					return false;
				}				
		}
		
		
		return true;
	}

}
