package com.org.Desialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonCreatorDeserialize {
public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
	String Json="{\r\n"
			+ "  \"name\" : \"mohan\",\r\n"
			+ "  \"email\" : \"mohan@r.com\",\r\n"
			+ "  \"EmployeeID\" : 1\r\n"
			+ "}";
	ObjectMapper mapper = new ObjectMapper();
	
	JsonCreatorPojo readValue = mapper
			.readValue(Json, JsonCreatorPojo.class);
	
	System.out.println(readValue.getId());
	System.out.println(readValue.getEmail());
	System.out.println(readValue.getName());
}
}
