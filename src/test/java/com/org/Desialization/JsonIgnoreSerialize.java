package com.org.Desialization;

import java.util.Date;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonIgnoreSerialize {

	public static void main(String[] args) throws JsonProcessingException {
		
		JsonIgnorePojo pojo =new JsonIgnorePojo();
		pojo.setId(2);
		pojo.setName(null);
		Date date = new Date();
		pojo.setDate(date);
		
		ObjectMapper mapper = new ObjectMapper();
		
		String writeValue = mapper.writerWithDefaultPrettyPrinter().writeValueAsString(pojo);
System.out.println(writeValue);
	}

}
