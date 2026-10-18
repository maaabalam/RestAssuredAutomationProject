package com.api.tests;

import org.testng.annotations.Test;

import com.api.functionalities.Products;
import com.api.models.request.ProductAddRequest;
import com.api.models.response.ProductAddResponse;

import io.restassured.response.Response;

public class ProductApiTest {
	@Test
	public void verifyAddProducts() {
		ProductAddRequest productadd = new ProductAddRequest.builder()
		.setId(1)
		.setTitle("Iphone 18")
		.setPrice("240000")
		.setEmiOptionAvailable("No")
		.build();
		
		Products products = new Products();
		Response response = products.addProducts(productadd);
		ProductAddResponse productAddResponse = response.as(ProductAddResponse.class);
		
		System.out.println(productAddResponse.getId());
		System.out.println(productAddResponse.getCategory());
		System.out.println(productAddResponse.getTitle());
		System.out.println(productAddResponse.getPrice());
		System.out.println(productAddResponse.getEmiOptionAvailable());
	}
}
