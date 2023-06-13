package com.org.SerializeAnnotations;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonRawValueSerializer {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
JsonRawValuePojo emp= new JsonRawValuePojo();
emp.setFirstname("mani");
emp.setLastname("r");
emp.setEmail("mani@r.com");

ObjectMapper mapper = new ObjectMapper();

String json = mapper.writerWithDefaultPrettyPrinter()
.writeValueAsString(emp);

System.out.println(json);
	}

}
