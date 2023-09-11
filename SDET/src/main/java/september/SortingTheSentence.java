package september;

import org.junit.Test;

public class SortingTheSentence {
	@Test
	public void positiveData() {
		findSortingTheSentence("is2 sentence4 This1 a3");
	}
	
	public String findSortingTheSentence(String s) {
		String[] words = s.split(" ");
		String temp="";
		for(int i=0;i<words.length-1;i++){
			int a = words[i].charAt(words[i].length()-1);
			int b = words[i+1].charAt(words[i+1].length()-1);
			if(words[i].charAt(words[i].length()-1)>words[i+1].charAt(words[i+1].length()-1)){
				temp=words[i];
				words[i]=words[i+1];
				words[i+1]=temp;
			}
		}
		return "";
	}

}
