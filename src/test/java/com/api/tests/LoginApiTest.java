package com.api.tests;

import org.testng.annotations.Test;

import com.api.functionalities.AuthServices;
import com.api.models.request.LoginRequest;
import com.api.models.response.LoginResponse;
import com.api.models.response.UserProfileResponse;

import io.restassured.response.Response;

public class LoginApiTest {

	@Test(priority = 1)
	public void verifyLoginWithValidParameters() {
		LoginRequest loginrequest= new LoginRequest("emilys", "emilyspass");
		AuthServices authservices = new AuthServices();
		Response response = authservices.login(loginrequest);
		System.out.println(response.asPrettyString());
		
		LoginResponse loginresponse = response.as(LoginResponse.class);
		System.out.println(loginresponse.getRefreshToken());
		System.out.println(loginresponse.getEmail());
		System.out.println(loginresponse.getFirstName());
		System.out.println(loginresponse.getGender());
		System.out.println(loginresponse.getLastName());
	}
	
	@Test(alwaysRun=false,priority = 2)
	public void verifyLoginDetailsWithToken() {
		LoginRequest loginrequest= new LoginRequest("emilys", "emilyspass");
		AuthServices authservices = new AuthServices();
		Response response = authservices.login(loginrequest);
		LoginResponse loginresponse = response.as(LoginResponse.class);
		
		response = authservices.getUserDetails(loginresponse.getRefreshToken());
		System.out.println("-------------------------------------------------------------");
		System.out.println(response.asPrettyString());
		UserProfileResponse loginresponse2 = response.as(UserProfileResponse.class);
		
		System.out.println(loginresponse2.getEmail());
		System.out.println(loginresponse2.getFirstName());
		System.out.println(loginresponse2.getGender());
		System.out.println(loginresponse2.getLastName());
	}
	
}
