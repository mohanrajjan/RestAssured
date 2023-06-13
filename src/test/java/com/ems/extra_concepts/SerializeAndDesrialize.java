package com.ems.extra_concepts;

import java.lang.reflect.Array;
import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.pojo.Empolyees;

public class SerializeAndDesrialize {
	ObjectMapper mapper = new ObjectMapper();
	String writeValue;
	public void serialize() throws JsonProcessingException {
		
		Empolyees emply1= new Empolyees();
		emply1.setFirstName("kush");
		emply1.setLastName("poo");
		emply1.setEmail("kush@poo.com");
		emply1.setSkills(Arrays.asList("java","selenium"));
		 writeValue = mapper.writerWithDefaultPrettyPrinter()
				.writeValueAsString(emply1);
		System.out.println(writeValue);
	}
	public void deserialize() throws JsonMappingException, JsonProcessingException {
		String emply="{\r\n"
				+ "  \"skills\" : [ \"java\", \"selenium\" ],\r\n"
				+ "  \"email\" : \"kush@poo.com\",\r\n"
				+ "  \"lastName\" : \"poo\",\r\n"
				+ "  \"firstName\" : \"kush\"\r\n"
				+ "}";
		
		Empolyees rd = mapper.readValue(emply, Empolyees.class);
		System.out.println(rd.getFirstName());
		System.out.println(rd.getLastName());
		System.out.println(rd.getEmail());
		System.out.println(rd.getSkills());
	}
public static void main(String[] args) throws JsonProcessingException {
	
	SerializeAndDesrialize dd= new SerializeAndDesrialize();
	dd.serialize();
	dd.deserialize();
	
}
}
