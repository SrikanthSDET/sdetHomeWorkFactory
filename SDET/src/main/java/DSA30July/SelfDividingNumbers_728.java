package DSA30July;

import java.util.ArrayList;
import java.util.List;

import org.junit.Assert;
import org.junit.Test;

public class SelfDividingNumbers_728 {
	
	/*
	 * 
	 */
	
	@Test
	public void Test1() {
		//int[] findSelfDividingNumbers = findSelfDividingNumbers1(1,22);
		//List<Integer> expectedList = new ArrayList<Integer>{1,2,3,4,5,6,7,8,9,11,12,15,22};
		//Assert.assertEquals(new Integer[] {1,2,3,4,5,6,7,8,9,11,12,15,22}, findSelfDividingNumbers.toString());
		//Assert.assertEquals(expectedList, findSelfDividingNumbers1(1,22));
	}
	
	@Test
	public void Test2() {
		//List<Integer> findSelfDividingNumbers = findSelfDividingNumbers1(47,85);
		//List<Integer> expectedList = new ArrayList<Integer>{1,2,3,4,5,6,7,8,9,11,12,15,22};
		//Assert.assertEquals(new Integer[] {48,55,66,77}, findSelfDividingNumbers.toString());
		
	}
	
	
	public List<Integer> findSelfDividingNumbers1(int left,int right) {
		int[] out=new int[(right-left)+1];
		int counter=0;
		for(int i=left;i<=right;i++) {
			if(i<10 && i>0) {
				out[counter]=i;	
				counter++;
			}else if(i>9) {		
				
			int rem=0;
			boolean selfDivide=false;
			int temp=i;
			while(temp>1) {
				rem = temp%10;
				if(rem==0)
				{
					selfDivide=false;
					break;
				}else if(i%rem==0){
					
					selfDivide=true;
					temp=temp/10;
				}else {
					selfDivide=false;
					break;
				}
			}
			
			if(selfDivide) {
				out[counter]=i;
				counter++;
			}
				
			
		}
		}
		  
		  List<Integer> output = new ArrayList<Integer>();
		  for(int i=0;i<out.length-1;i++) { 
			  if(out[i]!=0) {
				  output.add(out[i]); 				  
				  } 
			  }	 
		
		return output;
	}
	
}
