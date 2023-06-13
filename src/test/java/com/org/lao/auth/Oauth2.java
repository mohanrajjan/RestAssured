package com.org.lao.auth;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class Oauth2 {
	@Test
public void oauthexample(){
	String Token="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";
	RestAssured
	.given()
	.auth()
	.oauth2(Token)
	.when()
	   .get("https://api.github.com/user/repos")
	.prettyPrint();
}
}
