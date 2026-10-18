package com.api.functionalities;

import com.api.base.BaseServiceConfig;
import com.api.models.request.LoginRequest;

import io.restassured.response.Response;

public class AuthServices extends BaseServiceConfig{
	
	private static final String BASE_PATH = "/auth/";
	
	public Response login(LoginRequest payload) {
		return postrequest(payload, BASE_PATH + "login");
	}
	
	public Response getUserDetails(String token) {
		setTokenInHeader(token);
		return getrequest(BASE_PATH + "me");
	}
}
