package august.dsa;

import java.util.Arrays;


import org.junit.Test;

public class ArrayMemoryCheck {
	@Test
	public void arrayMemory() {
		
		  int[] primaryArray = {1,2,3}; int[] secondaryArray = primaryArray;
		  secondaryArray[2] = 5; System.out.println(Arrays.toString(primaryArray));
		  System.out.println(Arrays.toString(secondaryArray));
		  System.out.println(primaryArray); System.out.println(secondaryArray);
		 
	       
	
	}
	   

}
