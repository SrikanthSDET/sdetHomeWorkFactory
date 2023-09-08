package september;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;

import junit.framework.Assert;

public class DecodeTheMessageApproch2 {
	@Test
	public void testPositiveData() {
		Assert.assertEquals("this is a secret",
				findTheDecodeMessage("the quick brown fox jumps over the lazy dog", "vkbs bs t suepuv"));
	}

	public String findTheDecodeMessage(String key, String message) {
		String output = "";
		key = key.replaceAll(" ", "");
		List<Character> valuesChars = new ArrayList<Character>(26);
		for (char c = 'a'; c <= 'z'; c++)
			valuesChars.add(c);

		List<Character> keyList = new ArrayList<Character>();
		for (int i = 0; i < key.length(); i++) {
			if (keyList.indexOf(key.charAt(i)) == -1)
				keyList.add(key.charAt(i));
		}

		for (int i = 0; i < message.length(); i++) {
			if(message.charAt(i)!=' ')			
			output+= valuesChars.get(keyList.indexOf(message.charAt(i)));
			else 
				output+=" ";
		}

		return output;
	}

}
