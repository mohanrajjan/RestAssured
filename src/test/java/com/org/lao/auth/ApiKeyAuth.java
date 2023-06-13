package com.org.lao.auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class ApiKeyAuth {
	@Test(enabled=false)
public void apiKeyAuth() {
	RestAssured
	.given()
	.when()
	   .get("https://api.openweathermap.org/data/2.5/weather?q=exton&appid=946078c93ff33a9268711fea36202763")
	.prettyPrint();
}
	@Test(enabled=false)
	public void apiUsingParams() {
		RestAssured
		.given()
		.queryParam("q", "Trichy")
		.queryParam("appid", "946078c93ff33a9268711fea36202763")
		.when()
		   .get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body();
	}
	
	@Test
	public void apiUsingHeader() {
		RestAssured
		.given()
		.header("q", "Trichy")
		.header("appid", "946078c93ff33a9268711fea36202763")
		.when()
		   .get("https://api.openweathermap.org/data/2.5/weather")
		.then()
		.log().body();
	}
}
