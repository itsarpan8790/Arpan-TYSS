package selfPractise_APIPojos;

import static io.restassured.RestAssured.*;

import java.util.concurrent.TimeUnit;

import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class ReqChaining {

	@Test
	public void createPost() {
		baseURI = "https://reqres.in/";

		Response resp = when().get("/api/users?page=2");
		int sid = resp.jsonPath().get("data[0].id");
		resp.then().assertThat().statusCode(200).contentType(ContentType.JSON).log().all();
		System.out.println("***************");

		given().pathParam("id", sid).when().get("/api/users/{id}").then().assertThat()
				.time(Matchers.lessThan(5000l), TimeUnit.MILLISECONDS).log().all();

	}

}
