package com.org.Desialization;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonAnySetterDeserializer {

	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		String Json="{\r\n"
				+ "    \"first_name\": \"Nayan\",\r\n"
				+ "    \"last_name\": \"v\",\r\n"
				+ "    \"email\": \"nayan@trail.com\"\r\n"
				+ "  }";
		
		ObjectMapper mapper = new ObjectMapper();
		
		JsonAnySetterPojo readValue = mapper
				.readValue(Json, JsonAnySetterPojo.class);
		
		

		System.out.println(readValue.getEmployee());
	}
}
