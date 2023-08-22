package august.dsa;

import org.junit.Assert;
import org.junit.Test;

public class CanPlaceFlowers_605 {
	@Test
	public void Test1() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 1, 0, 0, 0, 0, 1 }, 1));

	}

	@Test
	public void Test2() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0, 0, 0, 0 }, 3));

	}

	@Test
	public void Test3() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0, 0, 0, 0, 0 }, 4));

	}

	@Test
	public void Test4() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 1, 0, 0, 0 }, 2));

	}

	@Test
	public void Test5() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 1, 0, 1, 0, 0, 0 }, 1));

	}

	@Test
	public void Test6() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 1, 0, 1, 0, 1, 0 }, 0));

	}

	@Test
	public void Test7() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 1, 0, 0, 0, 1, 0, 0, 0, 0, 1, 0, 0 }, 3));

	}

	@Test
	public void Test8() {
		Assert.assertTrue(!findCanPlotFlower(new int[] { 1 }, 1));
	}

	@Test
	public void Test9() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0 }, 1));
	}

	@Test
	public void Test10() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0 }, 0));
	}

	@Test
	public void Test11() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 1 }, 0));
	}

	@Test
	public void Test12() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 1, 0, 0 }, 1));
	}

	@Test
	public void Test13() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0, 1 }, 1));
	}

	@Test
	public void Test14() {
		Assert.assertTrue(!findCanPlotFlower(new int[] { 0, 0, 1, 0 }, 2));
	}

	@Test
	public void Test15() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0, 0, 1 }, 2));
	}

	@Test
	public void Test16() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0 }, 2));
	}

	@Test
	public void Test17() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0 }, 1));
	}

	@Test
	public void Test18() {
		Assert.assertTrue(findCanPlotFlower(new int[] { 0, 0, 0, 0 }, 1));
	}

	public boolean findCanPlotFlower(int[] flowerbed, int n) {
		int flowerPlots = 0, emptyPlots = 0, fullEmptyCheck = 0, nonEmptyPlots = 0;

		if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 1) {
			return false;
		} else if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 1) {
			return true;
		} else if (flowerbed.length == 1 && flowerbed[0] == 0 && n == 0) {
			return true;
		} else if (flowerbed.length == 1 && flowerbed[0] == 1 && n == 0) {
			return true;
		}

		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				emptyPlots++;
			} else {
				nonEmptyPlots++;
			}
		}

		if (emptyPlots == flowerbed.length) {
			if (emptyPlots == 3)
				return 2 >= n;

			if (emptyPlots % 2 == 0)
				return (emptyPlots / 2) >= n;
			else
				return (emptyPlots / 2) + 1 >= n;
		}

		if (nonEmptyPlots == flowerbed.length)
			return false;

		if (flowerbed[0] == 0 && flowerbed[1] == 0) {
			fullEmptyCheck++;
		}

		emptyPlots = 0;
		for (int i = 0; i < flowerbed.length; i++) {
			if (flowerbed[i] == 0) {
				emptyPlots++;
			} else {
				if (emptyPlots == 1) {
					emptyPlots = 0;
					continue;
				}

				if (emptyPlots % 2 == 0) {
					flowerPlots += (emptyPlots - 1) / 2;
				} else {
					flowerPlots += (emptyPlots) / 2;
				}
				emptyPlots = 0;
			}

		}

		if (fullEmptyCheck == 1) {
			emptyPlots += 2;
		}

		if (emptyPlots == flowerbed.length) {
			if (emptyPlots % 2 == 0)
				return (emptyPlots / 2) == n;
			else
				return (emptyPlots / 2) + 1 == n;
		} else {

			if (emptyPlots % 2 == 0) {
				flowerPlots += (emptyPlots / 2);
			} else
				flowerPlots += (emptyPlots / 2);
		}

		return flowerPlots >= n;
	}

}
