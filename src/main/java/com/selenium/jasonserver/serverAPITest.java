package com.selenium.jasonserver;

import org.testng.annotations.Test;

import com.jayway.restassured.http.ContentType;
import com.jayway.restassured.response.Response;
import static com.jayway.restassured.RestAssured.*;

public class serverAPITest {

	@Test(enabled = false)
	public void simpleGet() { // how to do get 
		Response resp = given().
				        when().
				        get("http://localhost:3000/posts");
		System.out.println(resp.asString());
		
	}//end of SimpleGet
	
	@Test (enabled = false)
	public void simplePost() {
		Response resp = given().
				        body("{\"id\":\"2\","
				        		+"\"title\":\"superman\"."
				        		+"\"author\":\"sandy\"}").
				        when().
				        contentType(ContentType.JSON).
				        post(" http://localhost:3000/posts");
		System.out.println(resp.asString());
				        
	
	
	}//end of simple post
	
	@Test
	public void simplePut() {
		
	}
	
}
