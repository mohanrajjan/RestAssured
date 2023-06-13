package com.org.nonbdd;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class GetAllEmployees {

	@Test(enabled=false)
	public void getAllEmployees() {
		RestAssured.baseURI="http://localhost:3000/";
	 RequestSpecification requestSpecification = RestAssured.given();
		Response response = requestSpecification.request(Method.GET, "employees");
		System.out.println(response.asPrettyString());
		System.out.println(response.getStatusLine());
	}
	
	@Test(enabled=true)
	public void createAnEmployee() {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\": \"Nayan\",\r\n"
						+ "    \"last_name\": \"v\",\r\n"
						+ "    \"email\": \"nayan@trail.com\"\r\n"
						+ "  }");
		Response res = request.request(Method.POST,"employees");
		System.out.println(res.getStatusLine());
	System.out.println(res.asPrettyString());
	}
	@Test(enabled=false)
	public void updatingEmployee()
	{
		RestAssured.baseURI="http://localhost:3000";
		RequestSpecification request = RestAssured.given()
		.header("Content-Type","application/json")
		.body("{\r\n"
				+ "   \"first_name\":\"Andrea\",\r\n"
				+ "   \"last_name\":\"A\",\r\n"
				+ "   \"email\":\"andrea@danush.com\"\r\n"
				+ "\r\n"
				+ "}");
		Response request2 = request.request(Method.PUT,"/employees/24");
		System.out.println(request2.getStatusLine());
		System.out.println(request2.asPrettyString());
	}
	@Test(enabled=false)
	public void deleteAnEmployee()
	{RestAssured.baseURI="http://localhost:3000/";
	RequestSpecification requestSpecification = RestAssured.given();
	Response response = requestSpecification.request(Method.DELETE, "employees/14");
	System.out.println(response.asPrettyString());
		
	}
}
