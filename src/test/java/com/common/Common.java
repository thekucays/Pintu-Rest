package com.common;

import org.testng.Assert;

import static io.restassured.RestAssured.*;
import static org.hamcrest.Matchers.*;
import static io.restassured.module.jsv.JsonSchemaValidator.matchesJsonSchemaInClasspath;
import io.restassured.response.Response;

public class Common {
	public static void getGenderResponse(String name, String expected) {
		final String genderURL = "https://api.genderize.io/?name=" + name;
		Response apiResponse = get(genderURL);
		
		// assert things 
		Assert.assertEquals(apiResponse.getStatusCode(), 200);
		given().get(genderURL)
			.then().statusCode(200)
			.and().body("gender", equalTo(expected))
			.and().assertThat().body(matchesJsonSchemaInClasspath("genderSchema.json"));
	}
	
	
	public static void getPost() {
		final String getPostURL = "https://jsonplaceholder.typicode.com/posts";
		// get new post and assert result
		given().get(getPostURL)
			.then().statusCode(200)
			.and().assertThat().body(matchesJsonSchemaInClasspath("getPostSchema.json"));
		
	}
	
	public static void createPost(String title, String body, int userId) {
        final String createPostURL = "https://jsonplaceholder.typicode.com/posts";
        
        // Define the post body
        String postBody = String.format("{ \"title\": \"%s\", \"body\": \"%s\", \"userId\": %d }", title, body, userId);
        
        // Send POST request and assert result
        given()
            .header("Content-Type", "application/json")
            .body(postBody)
            .when()
            .post(createPostURL)
            .then()
            .statusCode(201)  // 201 Created is the expected status code for successful POST requests
            .and()
            .assertThat().body(matchesJsonSchemaInClasspath("createPostSchema.json"))
            .and()
            .assertThat().body("title", equalTo(title))
            .and()
            .assertThat().body("body", equalTo(body))
            .and()
            .assertThat().body("userId", equalTo(userId));
    }
}
