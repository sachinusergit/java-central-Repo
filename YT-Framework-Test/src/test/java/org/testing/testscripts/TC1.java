package org.testing.testscripts;

import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import static org.testng.Assert.assertEquals;

import java.io.IOException;
import java.time.Duration;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.base.Base;
import org.testing.pages.Homepage;
import org.testing.pages.LoginPage;
import org.testing.pages.Logoutpage;

import org.testing.testStep.HTTPMethod;
import org.testing.utilities.Assertion;
import org.testing.utilities.MyITestListener;
import org.testing.utilities.MyRetryAnalyzer;
import org.testing.utilities.ReportHandling;
import org.testing.utilities.ScreenCapture;
import org.testing.utilities.propertieshandle;
import org.testing.utilities.validateclass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import junit.framework.Assert;


@Listeners(MyITestListener.class)
public class TC1 extends Base {
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	public  void testcase1() throws InterruptedException, IOException {
		
		ExtentReports ex = ReportHandling.handlereport();
		ExtentTest tc1 = ex.startTest("TC1");	
		LoginPage login = new LoginPage(driver,pr);
    	login.signin("sachink.5qu@gmail.com", "Test@211");
		

//		String loginurl = driver.getCurrentUrl();
//		System.out.println(loginurl);
		
		Homepage home = new Homepage(driver,pr);
		home.clickTrending();
		
		String ExpectedURL="https://www.youtube.com/feed/trending?bp=6gQJRkVleHBsb3Jl";
		String ActualURL=driver.getCurrentUrl();
		
		Boolean result1 = Assertion.assert2(ExpectedURL.trim(), driver.getCurrentUrl().trim(), "TC1");
		//System.out.println(result1);
		
		
//		Properties pr = propertieshandle.loadPropertiesFile("../YT-Framework-Test/URI.properties");
//		HTTPMethod http = new HTTPMethod(pr);
//		Response res=http.getAllMethod("Trending");
//		
//		Boolean result = validateclass.statusCodeValidate(200, res,"TC1" );
		
		
		
			if(result1.equals(true)) {
				tc1.log(LogStatus.PASS, "Test case1 is getting pass");
				ScreenCapture.takeScreenshot(driver, "passtestcase1");
				ex.endTest(tc1);
				ex.flush();
	
			} else {
				tc1.log(LogStatus.FAIL, "Test case1 is not getting pass");
				ScreenCapture.takeScreenshot(driver, "failtestcase1");
				ex.endTest(tc1);
				ex.flush();

			}

			
			Logoutpage logout=new Logoutpage(driver,pr);
			logout.SignOut();
			
			
			
		}
	
	
	

	
		
		
		
		
		
	}

		
		
		
	
	
		
		
		
	


	

	  
	 
	
	
	
	


