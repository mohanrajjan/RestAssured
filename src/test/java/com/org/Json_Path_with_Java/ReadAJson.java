package com.org.Json_Path_with_Java;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import org.apache.velocity.runtime.directive.Foreach;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.DocumentContext;
import com.jayway.jsonpath.JsonPath;

public class ReadAJson {
public static void reading() throws IOException {
	File JsonFile = new File("src/test/resources/bookshop.json");
	String read = JsonPath.read(JsonFile,"$.phoneNumbers[1].number");
	//for (Object type : read) {
		System.out.println(read);
	//}
	
}

public static void parseOneTime() throws IOException {
	InputStream JsonFile = new FileInputStream("src/test/resources/bookshop.json");
	Object parseJson = Configuration
			.defaultConfiguration()
			.jsonProvider()
			.parse(JsonFile.readAllBytes());
	List<Object> read = JsonPath.read(parseJson,"$..type");
	for (Object object : read) {
		System.out.println(object);
	}
	
}
public static void fuentAPI() throws IOException {
	File JsonFile = new File("src/test/resources/bookshop.json");
	DocumentContext context = JsonPath.parse(JsonFile);
	List<String> read = context.read("$..category");
	for (String string : read) {
		System.out.println(string);
		
	}
	Configuration defat = Configuration.defaultConfiguration();
	List<String> read2 = JsonPath
	.using(defat)
	.parse(JsonFile)
	.read("$..category");
	for (String string : read2) {
		System.out.println(string);
		
	}
	
	}
	public static void main(String[] args) throws IOException {
		//reading();
		//parseOneTime();
		fuentAPI();

	}

}
