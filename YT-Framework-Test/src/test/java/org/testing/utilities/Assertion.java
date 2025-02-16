package org.testing.utilities;

import io.restassured.response.Response;

public class Assertion {

		
			public static Boolean assert1(int expectedstatus, int actual, String classname) {
				if(actual==expectedstatus) {
					LogsCapture.takelog(classname, "logs for status code is matching");
					return true;
					
				} else {
					System.out.println("status code is not matching");
					
				}
				return false;
				
			}
			
			
			
			

			public static Boolean assert2(String Expectedurl, String actualurl, String classname) {
				if(Expectedurl.equals(actualurl)) {
					LogsCapture.takelog(classname, "logs for status code is matching");
					return true;
					
				} else {
					System.out.println("status code is not matching");
					
				}
				return false;
				
			}
		// TODO Auto-generated constructor stub
	}


