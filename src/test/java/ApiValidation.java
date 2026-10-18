
import org.testng.Assert;
import org.testng.annotations.Test;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class ApiValidation {
	@Test
	public void verifyTheLoginApi() {
		RestAssured.baseURI = "https://dummyjson.com/";
		RequestSpecification rs = RestAssured.given().contentType("application/json")
				.body("{\r\n"
						+ "  \"username\": \"emilys\",\r\n"
						+ "  \"password\": \"emilyspass\",\r\n"
						+ "  \"expiresInMins\": 30\r\n"
						+ "}");
		Response res = rs.post("/auth/login");
		System.out.println(res.asPrettyString());
		System.out.println(res.statusCode());
		Assert.assertEquals(res.statusCode(), 200);
	}
}
