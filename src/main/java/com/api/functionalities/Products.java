package com.api.functionalities;

import com.api.base.BaseServiceConfig;
import com.api.models.request.ProductAddRequest;

import io.restassured.response.Response;

public class Products extends BaseServiceConfig{
	public static final String BASE_PATH = "/products/";
	
	public Response addProducts(ProductAddRequest payload) {
		return postrequest(payload, BASE_PATH + "add");
	}
	
	public Response getProducts(String resource) {
		return getrequest(BASE_PATH + resource);
	}
}
