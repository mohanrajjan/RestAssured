package com.ems.extra_concepts;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.apache.commons.collections.map.HashedMap;
import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Serialization {
@Test
	public void serialization() {
		Map<String,Object> jsonbody=new HashMap<String,Object>();
		List<String> skill= new ArrayList<String>();
		skill.add("MP");
		skill.add("Minister");
		
		jsonbody.put("first_name", "anbu");
		jsonbody.put("last_name", "ramadoss");
		jsonbody.put("email", "anbu@ramadoss.com");
		jsonbody.put("skill", skill);
		System.out.println(jsonbody);
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body(jsonbody)
		.log()
		.all()
		.when()
		.post("/employees")
		.then()
		.log()
		.all();
	}
}
