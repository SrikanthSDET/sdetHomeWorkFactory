package utils;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadDataFromJsonFile {
	
	@Test
	public void readDataFromJsonFile() throws IOException, ParseException {
		JSONParser jsonParser = new JSONParser();
		FileReader fileReader = new FileReader("./data/MySampleJsonData.json");
		Object parsedObject = jsonParser.parse(fileReader);
		JSONObject jsonObject = (JSONObject) parsedObject;
		String name =(String)jsonObject.get("name");
		String title = (String) jsonObject.get("title");
		System.out.println(name);
		System.out.println(title);
		JSONArray jsonArray = (JSONArray) jsonObject.get("skills");
		Iterator iterator = jsonArray.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
	}

}
