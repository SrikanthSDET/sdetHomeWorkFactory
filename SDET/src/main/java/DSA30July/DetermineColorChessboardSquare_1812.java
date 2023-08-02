package DSA30July;

import org.junit.Test;

import junit.framework.Assert;

public class DetermineColorChessboardSquare_1812 {
	
	//@Test
	public void Test1() {
		boolean findChessboardSquareColor = findChessboardSquareColor("a1");
		Assert.assertEquals(false, findChessboardSquareColor);
	}
	
	//@Test
	public void Test2() {
		boolean findChessboardSquareColor = findChessboardSquareColor("h3");
		Assert.assertEquals(true, findChessboardSquareColor);
	}
	
	@Test
	public void Test3() {
		boolean findChessboardSquareColor = findChessboardSquareColor("c7");
		Assert.assertEquals(false, findChessboardSquareColor);
	}
	
	public boolean findChessboardSquareColor(String coordinates) {
		char[] XCord = {'a','b','c','d','e','f','g','h'};
		int[] YCord = {1,2,3,4,5,6,7,8};

		int cord1 = XCord[coordinates.charAt(0)-97]-97+1;
		int cord2 = YCord[coordinates.charAt(1)-49];		
		
		if(cord1==cord2) {
			return false;
		}else if(cord1%2!=0 && cord2%2!=0) {
			return false;
		}else if(cord1%2==0 && cord2%2==0) {
			return false;
		}else {
			return true;
		}		
	}
}
