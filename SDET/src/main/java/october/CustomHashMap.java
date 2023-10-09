package october;

import java.util.Arrays;

public class CustomHashMap {
	public int[] map ;
	public CustomHashMap(){
		map = new int[1000000];
		Arrays.fill(map,-1);
	}
	
	public void put(int key,int value) {
		map[key] =value;
	}
	
	public int get(int key) {
		return get(key);
	}
	
	public void remove(int key) {
		map[key]=-1;
	}

}
