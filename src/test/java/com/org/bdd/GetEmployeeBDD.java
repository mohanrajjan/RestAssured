package com.org.bdd;

import java.io.File;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GetEmployeeBDD {

	public void getAllEmployee()
	{
		RestAssured
		.given()
		.baseUri("http://localhost:3000/")
		.when()
		.get("employees")
		.prettyPrint();
	}
	public void createEmployeeBDD()
	{
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "   \"first_name\":\"Agni\",\r\n"
				+ "   \"last_name\":\"A\",\r\n"
				+ "   \"email\":\"agni@prasanth.com\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.post("/employees")
		.prettyPrint();
	}
	public void updateEmployeeBDD()
	{
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "   \"first_name\":\"Agni\",\r\n"
				+ "   \"last_name\":\"A\",\r\n"
				+ "   \"email\":\"agni@prasanth.com\"\r\n"
				+ "\r\n"
				+ "}")
		.when()
		.put("/employees/132")
		.prettyPrint();
	}
	public void deleteEmployee()
	{
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.when()
		.put("/employees/102")
		.prettyPrint();
	}
	
	@Test
	public void externalFileModel()
	{
		File Jsonfile = new File("CreateData.json");
		RestAssured
		.given()
		.baseUri("http://localhost:3000")
		.header("Content-Type","application/json")
		.body(Jsonfile)
		.when()
		.post("/employees")
		.prettyPrint();
	}
}
