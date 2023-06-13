package com.ems.extra_concepts;

import java.util.Map;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import com.jayway.jsonpath.Configuration;
import com.jayway.jsonpath.JsonPath;
import com.jayway.jsonpath.spi.mapper.JacksonMappingProvider;
import com.org.pojo.Employees1;
import com.org.pojo.Empolyees;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;

public class Deserialization {
	String json="{\r\n"
			+ "  \"email\" : \"anirudh@music.com\",\r\n"
			+ "  \"firstName\" : \"Anirudh\",\r\n"
			+ "  \"skills\" : [ \"jazz\", \"pop\" ],\r\n"
			+ "  \"lastName\" : \"Ravi\"\r\n"
			+ "}";
	public void usingObjectMapper() throws JsonMappingException, JsonProcessingException {
		ObjectMapper mapper = new ObjectMapper();
		Empolyees read = mapper.readValue(json,Empolyees.class);
		System.out.println(read.getFirstName());
		System.out.println(read.getLastName());
		System.out.println(read.getEmail());
		System.out.println(read.getSkills());
	}
public void usingJaywayJson() {
	JacksonMappingProvider mappingprovider =
			new JacksonMappingProvider();
	Configuration build = Configuration.builder()
	.mappingProvider(mappingprovider)
	.build();
	
	Empolyees read = JsonPath.using(build).parse(json)
	.read("$",Empolyees.class);
	
	System.out.println(read.getFirstName());
	System.out.println(read.getLastName());
	System.out.println(read.getEmail());
	System.out.println(read.getSkills());
}
public void usingRestassured() {
	io.restassured.path.json.JsonPath jsonpath = 
			io.restassured.path.json.JsonPath.from(json);
	Empolyees read = jsonpath
			.getObject("", Empolyees.class);
	
	System.out.println(read.getFirstName());
	System.out.println(read.getLastName());
	System.out.println(read.getEmail());
	System.out.println(read.getSkills());
}
public void usingAsFunction() {
	Map<String, Object> resp = RestAssured.given()
	.baseUri("http://localhost:3000/")
	.when()
	.get("employees/5")
	.then()
	.extract()
	.body()
	.as(new TypeRef <Map<String,Object>>() {
	});
	System.out.println(resp);
	System.out.println(resp.get("first_name"));
	System.out.println(resp.get("email"));
}
	public static void main(String[] args) throws JsonMappingException, JsonProcessingException {
		// TODO Auto-generated method stub
    Deserialization des = new Deserialization();
    des.usingAsFunction();
	}
}
