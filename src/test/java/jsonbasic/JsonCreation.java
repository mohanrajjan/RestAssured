package jsonbasic;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class JsonCreation {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
JSONObject json = new JSONObject();
json.put("firstName", "kush");
json.put("lastName", "poo");
json.put("Age", 50);
//[ "java", "selenium" ]
JSONArray array = new JSONArray();
array.add("java");
array.add("selenium");
json.put("skills", array);
FileWriter filewrite = new FileWriter("mohan.json");
filewrite.write(json.toJSONString());
filewrite.close();
	}

}
