package com.org.SerializeAnnotations;

import java.util.Arrays;
import java.util.List;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.org.pojo.Empolyees;

public class EmployeeSerializer {
	
	public static void main(String[] args) throws JsonProcessingException {
	Employee empl= new Employee();
	empl.setFirstName("Anirudh");
	empl.setLastName("Ravi");
	empl.setEmail("anirudh@music.com");
	empl.setSkills(Arrays.asList("jazz","pop"));
	
	ObjectMapper mapper = new  ObjectMapper();
	
	String empljson = mapper
			.writerWithDefaultPrettyPrinter()
			.writeValueAsString(empl);
	System.out.println(empljson);
	}
	
	
	
}
