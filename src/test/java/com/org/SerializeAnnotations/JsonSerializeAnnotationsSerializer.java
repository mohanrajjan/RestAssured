package com.org.SerializeAnnotations;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.module.SimpleModule;

public class JsonSerializeAnnotationsSerializer {
public void serialize() throws JsonProcessingException {
	JsonSerializeAnnotations ann = new JsonSerializeAnnotations();
	ann.setFirstname("annagha");
	ann.setLastname("a");
	ann.setEmail("annagha@a.com");
	ann.setSkills(Arrays.asList("java","selenium"));
	
	Devices dev = new Devices();
	dev.setLaptop("Dell");
	dev.setMobile("Samsung");
	
	ann.setDevices(dev);
	ObjectMapper mapper = new ObjectMapper();
	
	/*
	 * SimpleModule simpleModule = new SimpleModule();
	 * simpleModule.addSerializer(JsonSerializeAnnotations.class, new
	 * CustomizeSerializer()); mapper.registerModule(simpleModule);
	 */
	
	String writeValue = mapper.
			writerWithDefaultPrettyPrinter()
			.writeValueAsString(ann);
	System.out.println(writeValue);
}
public static void main(String[] args) throws JsonProcessingException {
	JsonSerializeAnnotationsSerializer jas = new JsonSerializeAnnotationsSerializer();
	jas.serialize();
}
}
