package jsonbasic;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

public class JsonRead {

	public static void main(String[] args) throws IOException, ParseException {
		// TODO Auto-generated method stub
JSONParser parser = new JSONParser();
FileReader read = new FileReader("mohan.json");
Object parse = parser.parse(read);
JSONObject jsonobj = (JSONObject) parse;  //type cast
String name = (String) jsonobj.get("firstName");
Long age=(Long) jsonobj.get("Age");
//Long age=jsonobj.get("Age"); type cast
JSONArray array =(JSONArray) jsonobj.get("skills");
Iterator iterator=array.iterator();
System.out.println("NAME is " +name);
System.out.println("AGE is " +age);
while(iterator.hasNext()) {
System.out.println("Skills:" +iterator.next());
}
	}

}
