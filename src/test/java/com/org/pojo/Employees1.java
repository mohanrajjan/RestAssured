package com.org.pojo;

import java.util.Arrays;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

public class Employees1 {

	public static void main(String[] args) throws JsonProcessingException {
		// TODO Auto-generated method stub
Empolyees empl1 = new Empolyees();
empl1.setFirstName("Anirudh");
empl1.setLastName("Ravi");
empl1.setEmail("anirudh@music.com");
empl1.setSkills(Arrays.asList("jazz","pop"));


  System.out.println(empl1.getFirstName());
  System.out.println(empl1.getLastName());
  System.out.println(empl1.getEmail()); System.out.println(empl1.getSkills());
 

ObjectMapper mapper = new  ObjectMapper();
String empljson = mapper
.writerWithDefaultPrettyPrinter()
.writeValueAsString(empl1);

System.out.println(empljson);
	}

}
