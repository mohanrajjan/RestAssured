package com.org.lao.auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class BearerToken {
@Test

	public void bearerToken() {
		RestAssured
		.given()
		.header("Authorization","Bearer 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")
		.when()
		   .get("https://api.github.com/user/repos")
		.prettyPrint();
	}
}
