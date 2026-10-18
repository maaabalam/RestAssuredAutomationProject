package com.api.base;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class BaseServiceConfig {
	
	private static final String BASE_URL = "https://dummyjson.com/";
	private RequestSpecification requestSpecification;
	
	public BaseServiceConfig() {
		requestSpecification = RestAssured.given().baseUri(BASE_URL);
	}
	
	public Response postrequest(Object payload, String resource) {
		return requestSpecification.contentType(ContentType.JSON).body(payload).post(resource);
	}
	
	public void setTokenInHeader(String token) {
		requestSpecification.header("Authorization", "Bearer " +token);
	}
	
	public Response getrequest(String resource) {
		return requestSpecification.get(resource);
	}
}
