package SelfPractise_ApiTestscripts;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.io.File;
import java.util.HashMap;

import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import PojoLibrarySonuul.Pojo_DifferentWaysToPstRequest;
import io.restassured.http.ContentType;

public class DifferentWaysToPstRequest {
	
	@Test(enabled = false)
	public void loginUsingJsonObject() {
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
	
	@Test
	public void loginUsingHashmap() {
		baseURI = "https://www.shoppersstack.com/shopping";

		// pre requisite
		HashMap<String, String> job = new HashMap<String, String>();
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
	
	@Test
	public void loginUsingPojo() {
		baseURI = "https://www.shoppersstack.com/shopping";
		Pojo_DifferentWaysToPstRequest job = new Pojo_DifferentWaysToPstRequest("itskhiladi007@gmail.com", "Ec@101017", "SHOPPER");
		
		// pre condition
				given().body(job).contentType(ContentType.JSON)
						// Crud
						.when().post("/users/login")

						// Validation
						.then().log().all().assertThat().statusCode(200);
				
				
	}
	
	@Test
	public void loginUsingFile() {
		baseURI = "https://www.shoppersstack.com/shopping";
		File f=new File("./src/test/resources/file.json");
		// pre condition
		given().body(f).contentType(ContentType.JSON)
				// Crud
				.when().post("/users/login")

				// Validation
				.then().log().all().assertThat().statusCode(200);
		
	}

}
