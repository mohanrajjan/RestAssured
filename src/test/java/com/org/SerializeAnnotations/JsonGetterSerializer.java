package com.org.SerializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonGetterSerializer {
public static void main(String[] args) throws JsonProcessingException {
	JsonGetterPojo pojo = new JsonGetterPojo();
	pojo.setId(1);
	pojo.setName("mohan");
	pojo.setEmail("mohan@r.com");
	
	ObjectMapper mapper = new ObjectMapper();
	 String json = mapper.writerWithDefaultPrettyPrinter()
	 .writeValueAsString(pojo);
	 System.out.println(json);
}
}
