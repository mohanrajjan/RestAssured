package com.org.interview_ques;

import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;

public class RequestSpecificationExample {
	
	RequestSpecification spec;
	
	@BeforeSuite
	public void setRequestSpecification() {
	 spec = RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.basePath("employees");
		RestAssured.requestSpecification= spec;
		//above used to set tis as default spec
	}
	//given() and with() are same
	
	@Test
	
	public void getAllEmployee()
	{
		RestAssured
		.given()
		.spec(spec)
		.when()
		.get()
		.prettyPrint();
	}
	
	@Test
	public void getAEmployee()
	{
		RestAssured
		.given()
		.when()
		.get("/12")
		.prettyPrint();
	}
	//multiple specification is possible
	@Test
	
	public void createEmployeeBDD()
	{RequestSpecification basePath = RestAssured
	    .given()
	    .contentType(ContentType.JSON)
		.baseUri("http://localhost:3000")
		.basePath("/employees");
		
		RestAssured
		.given()
		.spec(basePath)
		.body("{\r\n"
				+ "   \"first_name\":\"Arul\",\r\n"
				+ "   \"last_name\":\"A\",\r\n"
				+ "   \"email\":\"arul@mozhi.com\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.post()
		.prettyPrint();
	}
}
