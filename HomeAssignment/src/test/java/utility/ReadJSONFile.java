package utility;

import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.testng.annotations.Test;

public class ReadJSONFile {
	
	@Test
	public void readJSONFile() throws IOException, ParseException {
		JSONParser parser = new JSONParser();
		FileReader reader = new FileReader("D:\\SDET\\workspace\\HomeAssignment\\src\\test\\java\\data\\TeamRCB.json");
		Object parse = parser.parse(reader);
		JSONObject jsonObject = (JSONObject)parse;
		String teamName = (String)jsonObject.get("name");
		String location = (String)jsonObject.get("location");
		JSONArray players =  (JSONArray) jsonObject.get("player");		
		
	}

}
