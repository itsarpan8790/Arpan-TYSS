package sonuuuuuuuulREST;

import static io.restassured.RestAssured.baseURI;
import static io.restassured.RestAssured.given;

import java.util.List;

import org.hamcrest.Matchers;
import org.json.simple.JSONObject;
import org.testng.annotations.Test;

import io.restassured.http.ContentType;
import io.restassured.response.Response;

public class LearnParameters {
	String token;
	int uId;

	@Test
	public void loginAndCapture() {
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

		// Capture jwt
		token = resp.jsonPath().get("data.jwtToken");
		System.out.println(token);

		// Capture shopperId
		uId = resp.jsonPath().get("data.userId");
		System.out.println(uId);
	}

	@Test(dependsOnMethods = "loginAndCapture")
	public void addNewAddress() {
		JSONObject job = new JSONObject();

		job.put("addressId", "0");
		job.put("city", "Bangla");
		job.put("country", "canada");
		job.put("landmark", "44/44");
		job.put("name", "SamSung");
		job.put("phone", "987654321");
		job.put("pincode", "560073");
		job.put("state", "Odiya");
		job.put("streetInfo", "Chapri");
		job.put("type", "Straight");

		given().auth().oauth2(token).body(job).contentType(ContentType.JSON).pathParam("userId", uId)

				.when().post("shoppers/{userId}/address").then().log().all().assertThat().statusCode(201);

	}

	int adress1;

	@Test(dependsOnMethods = "loginAndCapture")
	public void getAllTheAddresses() {

		Response resp = given().auth().oauth2(token).pathParam("userId", uId)

				.when().get("shoppers/{userId}/address");
		resp.then().log().all().assertThat().statusCode(200);

		// capture Adress
		adress1 = resp.jsonPath().get("data[0].addressId");
		System.out.println(adress1);
	}

	@Test(dependsOnMethods = "getAllTheAddresses")
	public void getAparticularAddressByAddressId() {

		given().auth().oauth2(token).pathParam("userId", uId).pathParam("adId", adress1)

				.when().get("shoppers/{userId}/address/{adId}").then().log().all().assertThat().statusCode(200)
				.contentType(ContentType.JSON).time(Matchers.lessThan(500l));

	}

	@Test(dependsOnMethods = "loginAndCapture")
	public void DynamicResponseValidation() {

		int expAID = 38095;

		// All Aid
		Response resp = given().auth().oauth2(token).pathParam("userId", uId)

				.when().get("shoppers/{userId}/address");
		resp.then().log().all().assertThat().statusCode(200);

		// capturing all AID
		List<Object> allAid = resp.jsonPath().get("data.addressId");

		System.out.println("Printing Expected Details");
		// iteratre till Expected Aid

		for (Object l : allAid) {
			System.out.println(l);
			if (l.equals(expAID)) {
				// getParticular Address
				given().auth().oauth2(token).pathParam("userId", uId).pathParam("adId", l)

						.when().get("shoppers/{userId}/address/{adId}").then().log().all();
			}

		}

	}

	@Test(dependsOnMethods = "loginAndCapture")
	public void updateAdress() {
		JSONObject job = new JSONObject();

		job.put("addressId", "");
		job.put("city", "CSK");
		job.put("country", "");
		job.put("landmark", "");
		job.put("name", "");
		job.put("phone", "");
		job.put("pincode", "");
		job.put("state", "");
		job.put("streetInfo", "");
		job.put("type", "");

		given().auth().oauth2(token).body(job).contentType(ContentType.JSON).pathParam("userId", uId)
				.pathParam("addressId", "38113")

				.when().put("shoppers/{userId}/address/{addressId}").then().log().all().assertThat().statusCode(200);

	}

	@Test(dependsOnMethods = "loginAndCapture")
	public void deleteAnAddress() {
		given().auth().oauth2(token).pathParam("shopperId", uId).pathParam("addressId", 38095)

				.when().delete("/shoppers/{shopperId}/address/{addressId}").then().statusCode(204)
				.contentType(ContentType.JSON).time(Matchers.lessThan(2000l));

	}

	int pid;

	@Test(dependsOnMethods = "loginAndCapture")
	public void getAllProducts() {
		Response resp = given().auth().oauth2(token).queryParam("zoneId", "Alpha").when().get("/products");
		resp.then().assertThat().statusCode(200);

		pid = resp.jsonPath().get("data[0].productId");
		System.out.println("this is pid  " + pid);
	}

	@Test(dependsOnMethods = "getAllProducts")
	public void addWishlist() {
		JSONObject job = new JSONObject();
		job.put("productId", pid);
		job.put("quantity", 0);
		given().auth().oauth2(token).body(job).contentType(ContentType.JSON).pathParam("shopperId", uId).when()
				.post("/shoppers/{shopperId}/wishlist").then().log().all().statusCode(201);

	}

	@Test(dependsOnMethods = "loginAndCapture")
	public void getAllProWishlist() {

		given().auth().oauth2(token).pathParam("shopperId", uId).when().get("/shoppers/{shopperId}/wishlist").then()
				.log().all();

	}

	@Test(dependsOnMethods = "getAllProducts")
	public void deletefromWishlist() {

		given().auth().oauth2(token).pathParams("shopperId", uId, "productId", pid).when()
				.get("/shoppers/{shopperId}/wishlist/{productId}").then().log().all();

	}
	
	
}
