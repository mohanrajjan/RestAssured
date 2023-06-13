package com.org.json_schema_validation;

import java.io.File;
import java.io.FileNotFoundException;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.module.jsv.JsonSchemaValidator;

public class RestassuredSchemaValidation {
	@Test(enabled=false)
	public void validationJsonInClassPath()throws FileNotFoundException {
		File injson = new File("src/test/resources/input.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body(injson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchemaInClasspath("schema.json"));
	}	
	@Test
	public void validationJsonMatches()throws FileNotFoundException {
		File injson = new File("src/test/resources/input.json");
		File refjson = new File("src/test/resources/schema.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type", "application/json")
		.body(injson)
		.when()
		.post("/employees")
		.then()
		.body(JsonSchemaValidator.matchesJsonSchema(refjson));
	}
}
