package september;

import org.junit.Test;

import junit.framework.Assert;

public class DigitCount {
	/*
	 * 1) Did I understand the problem? Yes
	 * 
	 * 
	 * 2) Derive your test data Input: num = "1210" Output: true
	 * 
	 * Input: num = "030" Output: false
	 * 
	 * 
	 * 3) Do I know how to solve this? Yes
	 * 
	 * 4) Ask for hints, if you do not understand !!
	 * 
	 * 5) Do I know alternate solutions? No
	 * 
	 * 6) If you know more than one, then do this.
	 * 
	 * 7. Start with Psuedo code
	 * 
	 * 1. Initialize the counterIndex,counterValue,counter var 2. Iterate the given
	 * string in nested for loop and get the index count on outer loop 3. Inner loop
	 * iterate the each value and compare the index value and counterValue if it's
	 * matching increment the counter else return false 4. Finally return the true
	 * 
	 * 8. Implement the code //1210 int counterIndex=0,counter=0; char
	 * counterValue=''; for(int i=0;i<num.length;i++){ counterIndex = i;
	 * counterValue = num.charAt(i); for(int j=0;j<num.length;j++){
	 * if(num.charAt(j)==counterValue){ counter++; } } if(counter!=counterIndex)
	 * return false; counter=0; } return true;
	 * 
	 * 9. Test against different test data set
	 * 
	 * 10. Debug them to solve it !
	 * 
	 * 
	 */
	@Test
	public void testData1() {
		Assert.assertEquals(true, findDigitCount("1210"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(false, findDigitCount("030"));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(false, findDigitCount("01"));
	}

	public boolean findDigitCount(String num) {
		int counterValue = 0, counter = 0;
		char idxValue = ' ';
		for (int i = 0; i < num.length(); i++) {
			counterValue = Character.getNumericValue(num.charAt(i));
			idxValue = (char) (i + '0');
			for (int j = 0; j < num.length(); j++) {
				char temp = num.charAt(j);
				if (num.charAt(j) == idxValue) {
					counter++;
				}
			}
			if (counter != counterValue)
				return false;
			counter = 0;
		}
		return true;
	}

}
