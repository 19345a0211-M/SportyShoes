package in.rest.RestAssuredDemo;

import org.testng.annotations.Test;

import io.restassured.RestAssured;

public class GET_AllRegisteredUsers {
	@Test
	public void getServerResponce() {
		RestAssured
		 .when()
		      .get("http://localhost:9010/get-users")
		 .then()
		      .assertThat()
		      .statusCode(200)
		      .log().all();
		}

}
