package com.org.Desialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAliasDesrialize {
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String Json = "{\r\n"
				+ "  \"name\" : \"mohan\",\r\n"
				+ "  \"email\" : \"mohan@r.com\",\r\n"
				+ "  \"EmployeeID\" : 1\r\n"
				+ "}";
		ObjectMapper mapper = new ObjectMapper();

		JsonAliasPojo value = mapper
				.readValue(Json, JsonAliasPojo.class);
		
		System.out.println(value.getName());
		System.out.println(value.getId());
	}

}
