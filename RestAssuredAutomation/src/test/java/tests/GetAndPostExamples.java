package tests;

import static org.hamcrest.CoreMatchers.*;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;
import static io.restassured.RestAssured.*;


public class GetAndPostExamples {

	@Test
	public void testGet() {
		baseURI = "https://reqres.in/api";
		given().
		get("/users?page=2").
		then().
		statusCode(200).
		body("data[0].first_name", equalTo("Michael")).
		body("data.first_name", hasItems("George","Rachel"));
	}



	@SuppressWarnings("unchecked")
	@Test
	public void testPost() {
		//Map<String, Object> map = new HashedMap<String, Object>();
		//		map.put("name", "Francesco");
		//		map.put("job", "Software Tester");
		//		System.out.println(map);

		//Simple JSON
		JSONObject request = new JSONObject();
		request.put("name", "Francesco");
		request.put("job", "Software Tester");
		System.out.println(request.toJSONString());
		baseURI = "https://reqres.in/api";
		given().
		header("Content-Type", "application/json").
		body(request.toJSONString())
		.when().
		post("/users").
		then().
		statusCode(201).log().all();
	}

}
