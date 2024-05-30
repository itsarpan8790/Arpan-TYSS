package SelfPractise_ApiTestscripts;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.builder.RequestSpecBuilder;
import io.restassured.builder.ResponseSpecBuilder;
import io.restassured.http.ContentType;
import io.restassured.specification.RequestSpecification;
import io.restassured.specification.ResponseSpecification;

public class Req_Resp_SpecBuilders {
//It is used to set common pre conditions for request and response;
	//-setBaseuri,setContentType,,setAuth,
	
	
	
	@Test()
	public void login() {
		// pre requisite
				JSONObject job = new JSONObject();
				job.put("email", "itskhiladi007@gmail.com");
				job.put("password", "Ec@101017");
				job.put("role", "SHOPPER");
		
		RequestSpecBuilder RQsb = new RequestSpecBuilder();
		RequestSpecification request = RQsb.setBaseUri("https://www.shoppersstack.com/shopping")
		.setContentType(ContentType.JSON)
		.setBody(job).build();
		
		
		ResponseSpecBuilder RSsb = new ResponseSpecBuilder();
		ResponseSpecification response = RSsb.expectContentType(ContentType.JSON)
        .expectStatusCode(200)
        .expectStatusLine("HTTP/1.1 200 ")
        .expectContentType(ContentType.JSON)
        .build();
		
		

		// pre condition
		given().spec(request)
				// Crud
				.when().post("/users/login")

				// Validation
				.then().log().all().spec(response);

	}

}