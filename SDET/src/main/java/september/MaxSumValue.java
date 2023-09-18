package september;

import org.junit.Test;

import junit.framework.Assert;

public class MaxSumValue {
	@Test
	public void testData() {
		Assert.assertEquals(12, slidingWindow(new int[] {1,5,2,3,7,1},3));
	}
	
	public int findMaxSumvalue(int[] nums,int k) {
		int startIdx=0,endIndx=k,maxValue=0,sum=0;
		while(nums.length-1>=endIndx){
			for(int i=startIdx;i<k;i++){
				sum+=nums[startIdx+i];
				startIdx++;
			}
			endIndx++;
			if(sum>maxValue) maxValue=sum;
		}
		return sum;		
	}
	
	 private int slidingWindow(int[] nums, int k){
		 int a= Integer.MAX_VALUE;
		 int b= Integer.MAX_VALUE;
		 int c =a+b;
	        //1. one pointer should work
	        int max = Integer.MIN_VALUE, pointer = 0, currentSum = 0;
	        // not needed second pointer as this is balanced traversal ,right = k-1;
	        //2. Do the required operation till k index
	        while(pointer < k)
	            currentSum += nums[pointer++];
	        //3. continue the operation for rest of the array
	        while( pointer < nums.length){
	            max = Math.max(currentSum, max);
	            currentSum += nums[pointer] - nums[pointer-k];
	            pointer++;
	        }
	        return Math.max(currentSum, max);
	    }

}
