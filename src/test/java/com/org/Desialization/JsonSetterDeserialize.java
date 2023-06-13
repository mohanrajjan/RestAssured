package com.org.Desialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonSetterDeserialize {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String Json= "{\r\n"
				+ "  \"name\" : \"mohan\",\r\n"
				+ "  \"email\" : \"mohan@r.com\",\r\n"
				+ "  \"EmployeeID\" : 1\r\n"
				+ "}";
		ObjectMapper mapper = new ObjectMapper();
		
		JsonSetterPojo readValue = mapper
				.readValue(Json, JsonSetterPojo.class);
		
		System.out.println(readValue.getId());
		System.out.println(readValue.getName());
	}

}
