package tests;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.junit.Assert.assertTrue;
import static io.restassured.RestAssured.*;
import org.testng.annotations.Test;
import io.restassured.response.Response;

@Test
public class TestsExamples {

	@Test
	public void test_1() {
		Response response = get("https://reqres.in/api/users?page=2");
		System.out.println(response.getStatusCode());
		System.out.println(response.getTime());
		System.out.println(response.getBody().asString());
		System.out.println(response.getHeader("content-type"));
		assertTrue("Status Code errato", response.getStatusCode() == 200);
	}

	@Test
	public void test_2() {
		baseURI = "https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data.email[0]", equalTo("michael.lawson@reqres.in"));
	}
}
