package november;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import org.junit.Test;
import org.testng.Assert;

public class RingsRods_2103 {
	/*
	 * 1. Create HashMap key as Integer and values as Set<String> , declare count
	 * int varibale 2. Iterate the given String and inside the loop 3. Check the
	 * ring color and add in respective rod number 4. End of the iteration all the
	 * rings placed in rods 5. Iterate the HashMap, inside the loop 6. get the value
	 * (rings) based on key (rod), and verify all the color rings available then
	 * increament count 7. finally return
	 */

	@Test
	public void testData1() {
		Assert.assertEquals(1, findCompleteRod("B0R0G0R9R0B0G0"));
	}

	@Test
	public void testData2() {
		Assert.assertEquals(1, findCompleteRod("B0B6G0R6R0R6G9"));
	}

	@Test
	public void testData3() {
		Assert.assertEquals(0, findCompleteRod("G4"));
	}

	@Test
	public void testData4() {
		Assert.assertEquals(2, findCompleteRod("B9R9G9R9R8B8G8"));
	}

	public int findCompleteRod(String rings) {
		int count = 0;
		HashMap<Integer, String> ringRodMap = new HashMap<>();
		String str = "";
		for (int i = 0; i < rings.length() - 1; i += 2) {
			str = ringRodMap.get(Integer.parseInt(String.valueOf(rings.charAt(i + 1))));
			ringRodMap.put(Integer.parseInt(String.valueOf(rings.charAt(i + 1))),
					str + String.valueOf(rings.charAt(i)));
		}
		List<Integer> rods = new ArrayList<>(ringRodMap.keySet());
		for (int j = 0; j < rods.size(); j++) {
			if (ringRodMap.get(rods.get(j)).contains("R") && ringRodMap.get(rods.get(j)).contains("B")
					&& ringRodMap.get(rods.get(j)).contains("G")) {
				count++;
			}
		}
		return count;
	}

}
