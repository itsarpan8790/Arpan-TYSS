package SelfPractise_ApiTestscripts;

import static io.restassured.RestAssured.*;

import org.json.simple.JSONObject;

import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ShopperstackLoginAndGet {

	@Test(enabled = false)
	public void login() {
		baseURI = "https://www.shoppersstack.com/shopping";

		// pre requisite
		JSONObject job = new JSONObject();
		job.put("email", "itskhiladi007@gmail.com");
		job.put("password", "Ec@101017");
		job.put("role", "SHOPPER");

		// pre condition
		given().body(job).contentType(ContentType.JSON)
				// Crud
				.when().post("/users/login")

				// Validation
				.then().log().all().assertThat().statusCode(200);

	}
	String token1;
	@Test
	public void chainingAndGet() {
		baseURI = "https://www.shoppersstack.com/shopping";

		// pre requisite
		JSONObject job = new JSONObject();
		job.put("email", "itskhiladi007@gmail.com");
		job.put("password", "Ec@101017");
		job.put("role", "SHOPPER");

		// pre condition
		Response resp = given().body(job).contentType(ContentType.JSON)
				// Crud
				.when().post("/users/login");

		// Validation
		resp.then().assertThat().statusCode(200);

		// capture jwt
		token1 = resp.jsonPath().get("data.jwtToken");
		System.out.println(token1);
		System.out.println("****************************"); 
		
		//precondition
			given().auth().oauth2(token1)
			//action or crud
			.when().get("/products/alpha")
			//validation
			.then().assertThat().statusCode(200);
	}
	
	int pid;
	@Test(dependsOnMethods = "chainingAndGet")
	public void getAllProducts() { //QueryParam is zoneId=ALPHA
		Response resp = given().auth().oauth2(token1).queryParam("zoneId", "Alpha")
		.when().get("/products");
		resp.then().assertThat().statusCode(200);
		
		pid=resp.jsonPath().get("data[0].productId");
		 
	}
		
		
		
	
	
	@Test(dependsOnMethods = "chainingAndGet")
	public void getdefaultProducts() {
		given().auth().oauth2(token1)
		.when().get("/products/alpha")
		.then().log().all();
	}

}
