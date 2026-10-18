package com.api.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import static org.hamcrest.Matchers.*;

import com.api.functionalities.Products;
import com.api.models.request.ProductAddRequest;
import com.api.models.response.ProductAddResponse;

import io.restassured.response.Response;

public class ProductApiTest {
	@Test(priority = 1)
	public void verifyAddProducts() {
		ProductAddRequest productadd = new ProductAddRequest.builder()
		.setId(10001)
		.setTitle("Iphone 18")
		.setPrice("240000")
		.setEmiOptionAvailable("No")
		.build();
		
		Products products = new Products();
		Response response = products.addProducts(productadd);
		ProductAddResponse productAddResponse = response.as(ProductAddResponse.class);
		
		Assert.assertEquals(response.getStatusCode(), 201);
		System.out.println(productAddResponse.getId());
		System.out.println(productAddResponse.getCategory());
		System.out.println(productAddResponse.getTitle());
		System.out.println(productAddResponse.getPrice());
		System.out.println(productAddResponse.getEmiOptionAvailable());
	}
	
	@Test(priority = 2)
	public void verifyGetProducts() {
		Products products = new Products();
		Response response = products.getProducts("1");
		ProductAddResponse productAddResponse = response.as(ProductAddResponse.class);
		
		Assert.assertEquals(response.getStatusCode(), 200);
		System.out.println(productAddResponse.getId());
		System.out.println(productAddResponse.getCategory());
		System.out.println(productAddResponse.getTitle());
		System.out.println(productAddResponse.getPrice());
		System.out.println(productAddResponse.getEmiOptionAvailable());
	}
}
