package org.testing.utilities;

import org.testng.IRetryAnalyzer;
import org.testng.ITestResult;

public class MyRetryAnalyzer implements IRetryAnalyzer{
	
	int counter=0;
	int retyLimit=1;

	public boolean retry(ITestResult result) {
		if(counter < retyLimit) {
			counter++;
			System.out.println("Retrying the test " + result.getName() + " Attempt No = " + counter);

			return true;
			
		}
		return false;
		// TODO Auto-generated constructor stub
	}

}
