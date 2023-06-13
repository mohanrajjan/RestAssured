package com.org.lao.auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;
@Test
public class BasicAuth {
	
public void basicAuth() {
	RestAssured
	.given()
	  .auth()
	    .basic("postman", "password")
	  .baseUri("https://postman-echo.com")
	.when()
	   .get("/digest-auth")
	.prettyPrint();
}
}
