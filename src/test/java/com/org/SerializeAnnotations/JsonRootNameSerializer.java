package com.org.SerializeAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;

public class JsonRootNameSerializer {
public static void main(String[] args) throws JsonProcessingException {
	JsonRootNamePojo jrn = new JsonRootNamePojo();
	jrn.setFirstname("divya");
	jrn.setLastname("bharathi");
	jrn.setEmail("divya@bharathi.com");
	jrn.setSkills(Arrays.asList("java"));
	
	ObjectMapper mapper = new ObjectMapper();
	
	mapper.enable(SerializationFeature.WRAP_ROOT_VALUE);
	
	String json = mapper
			.writerWithDefaultPrettyPrinter()
			.writeValueAsString(jrn);
	System.out.println(json);
}
}
