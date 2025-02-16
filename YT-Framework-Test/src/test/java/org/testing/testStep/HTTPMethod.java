package org.testing.testStep;

import static io.restassured.RestAssured.given;

import java.util.Properties;

import io.restassured.http.ContentType;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;

public class HTTPMethod {
Properties pr;
		
	
	
	public HTTPMethod(Properties pr) {
		this.pr=pr;
		// TODO Auto-generated constructor stub
	}

	public Response getAllMethod(String UriKeyName) {
		
		String value = pr.getProperty(UriKeyName); 
		Response res = 
				given()
				.contentType(ContentType.JSON)
				.when()
				.get(value);
		System.out.println("Status Code is" +res.statusCode());
		
		return res;
		
	}

}


	
	



