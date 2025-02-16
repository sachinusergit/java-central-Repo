package org.testing.utilities;

import io.restassured.response.Response;


public class validateclass {

			public static Boolean statusCodeValidate(int expectedStatusCode, Response res, String classname) {
				int actual = res.getStatusCode();
				Boolean results=Assertion.assert1(expectedStatusCode, actual, classname);
				return results;
				
				
			}
		// TODO Auto-generated constructor stub
	}


