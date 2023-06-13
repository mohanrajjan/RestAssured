package com.org.Desialization;

import java.io.IOException;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.InjectableValues;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.ObjectReader;

public class JacksonInjectDeserialize {
public static void main(String[] args) throws IOException {
	String Json="{\r\n"
			+ "  \"email\" : \"mohan@r.com\",\r\n"
			+ "  \"id\" : 1\r\n"
			+ "}";
	
	InjectableValues value = new InjectableValues.Std()
			.addValue(String.class, "mohanraj");
	
	ObjectMapper mapper = new ObjectMapper();
	
	ObjectReader reader = mapper.reader(value);
	
	JacksonInjectPojo readValue = reader
			.readValue(Json, JacksonInjectPojo.class);
	
	System.out.println(readValue.getName());
	System.out.println(readValue.getEmail());
	
}

}
