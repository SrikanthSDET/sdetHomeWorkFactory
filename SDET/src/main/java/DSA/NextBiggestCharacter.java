package DSA;

import java.util.Arrays;
import java.util.Iterator;

import org.junit.Test;

import junit.framework.Assert;

public class NextBiggestCharacter {
	/*
	 * Given a sorted character array and a target character, 
		find the next biggest character in the array. 
	 * Input: char[] and char
	 * Output: char
	 * Traverse the char[] elements with given target char according to the values
	 * Find the next bigger with value
	 *
	 */
	@Test
	public void Test1() {
		Assert.assertEquals('h', findNextBigChar(new char[] {'b', 'd' , 'h'},'e'));		
	}
	
	@Test
	public void Test2() {
		Assert.assertEquals('d', findNextBigChar(new char[] {'b', 'd' , 'h'},'b'));		
	}
	
	@Test
	public void Test3() {
		Assert.assertEquals('d', findNextBigChar(new char[] {'a', 'b' , 'c'},'d'));		
	}
	
	public char findNextBigChar(char[] chrs, char ch) {		
		for (char c : chrs) {
			if(c>ch) {
				return c;
			}
		}			
		return ch;
	}
}
