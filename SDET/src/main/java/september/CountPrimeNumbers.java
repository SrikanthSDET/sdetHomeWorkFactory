package september;

import org.junit.Test;

import junit.framework.Assert;

public class CountPrimeNumbers {
	@Test
	public void Test1() {
		Assert.assertEquals(4, countPrime(10));
	}

	@Test
	public void Test2() {
		Assert.assertEquals(5, countPrime(12));
	}

	@Test
	public void Test3() {
		Assert.assertEquals(25, countPrime(100));
	}

	int countPrime;

	public int countPrime(int n) {
		if (n == 0 || n == 1)
			return 0;

		for (int i = 2; i < n; i++) {
			if (primeStatus(i))
				countPrime++;
		}

		return countPrime;
	}

	public boolean primeStatus(int n) {
		for (int i = 2; i < n; i++) {
			if (n % i == 0) {
				return false;
			}
		}
		return true;
	}

}
