package com.org.interview_ques;

import io.restassured.RestAssured;
import io.restassured.http.Method;
import io.restassured.response.Response;
import io.restassured.specification.QueryableRequestSpecification;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.SpecificationQuerier;

public class GetHeaders {

	public static void main(String[] args) {
		RestAssured.baseURI="http://localhost:3000/";
		RequestSpecification request = RestAssured.given()
				.header("Content-Type","application/json")
				.body("{\r\n"
						+ "    \"first_name\": \"Nayan\",\r\n"
						+ "    \"last_name\": \"v\",\r\n"
						+ "    \"email\": \"nayan@trail.com\"\r\n"
						+ "  }");
		Response res = request.
				request(Method.POST,"employees");
		
	QueryableRequestSpecification query = 
			SpecificationQuerier.query(request);
	
	System.out.println(query.getContentType());
	System.out.println(query.getBaseUri());

	}

}
