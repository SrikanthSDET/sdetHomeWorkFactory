package september;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class DecodeTheMessage {
	@Test
	public void testPositiveData1() {
		Assert.assertEquals("this is a secret",
				findTheDecodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}
	
	@Test
	public void testPositiveData2() {
		Assert.assertEquals("the five boxing wizards jump quickly",
				findTheDecodeMessage("eljuxhpwnyrdgtqkviszcfmabo", "zwx hnfx lqantp mnoeius ycgk vcnjrdb"));
	}

	public String findTheDecodeMessage(String key, String message) {
		String output = "";
		char[] valuesChars = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r',
				's', 't', 'u', 'v', 'w', 'x', 'y', 'z' };
		key = key.replaceAll(" ", "");

		List<Character> keyList = new ArrayList<Character>();
		for (int i = 0; i < key.length(); i++) {
			if(keyList.indexOf(key.charAt(i))==-1)
			keyList.add(key.charAt(i));
		}		

		for (int i = 0; i < message.length(); i++) {
			for (int j = 0; j < keyList.size(); j++) {
				if (message.charAt(i) == ' ') {
					output += " ";
					break;
				} else if (message.charAt(i) == keyList.get(j)) {
					output += String.valueOf(valuesChars[j]);
					break;
				}

			}
		}

		return output;
	}

}
