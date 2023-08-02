package DSA;

import java.util.Arrays;

import org.junit.Test;

public class FizzBuzzStringArray_412 {
	
	/*
	 * Given an integer n, return a string array answer (1-indexed) where:

answer[i] == "FizzBuzz" if i is divisible by 3 and 5.
answer[i] == "Fizz" if i is divisible by 3.
answer[i] == "Buzz" if i is divisible by 5.
answer[i] == i (as a string) if none of the above conditions are true.
	 */
	@Test
	public void test1() {
		String[] output = fizzBuzz(15);
		String stringArr = Arrays.toString(output);
		System.out.println(stringArr);
	}
	
	public String[] fizzBuzz(int n) {
		
		String[] fizz = new String[n];
		for(int i=1;i<=n;i++) {
			if(i%3==0 && i%5==0) {
				fizz[i-1]="FizzBuzz";	
				
			}
			else if(i%3==0) {
				fizz[i-1]="Fizz";
				
			}
			else if(i%5==0) {
				fizz[i-1]="Buzz";
				
			}
			else {
				fizz[i-1]=Integer.toString(i);
				
			}
		}
		
		return fizz;
	}
	

}
