package com.org.Json_Path_with_Java;

import java.util.List;

import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.Configuration.ConfigurationBuilder;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.Option;

public class ConfigurationExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
String json="[\r\n"
		+ "{\r\n"
		+ "   \"name\":\"Scobby\",\r\n"
		+ "   \"gender\":\"male\",\r\n"
		+ " },\r\n"
	    + "  {\r\n"
	    + "   \"name\":\"charlie\",\r\n"
		+ "}\r\n"
	    + "]";
/*
 * Configuration options1 = Configuration.builder()
 * .options(Option.DEFAULT_PATH_LEAF_TO_NULL) .build();
 */
	
Configuration config = Configuration.defaultConfiguration(); 
/*/ * ConfigurationaddOptions = config.addOptions(Option.DEFAULT_PATH_LEAF_TO_NULL);
 */
Configuration addOptions = config.addOptions(Option.ALWAYS_RETURN_LIST);
	List<String> read = JsonPath.using(addOptions)
	.parse(json)
	.read("$.[1].name");
	System.out.println(read);
}
}
