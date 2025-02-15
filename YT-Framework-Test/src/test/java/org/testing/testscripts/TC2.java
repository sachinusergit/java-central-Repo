package org.testing.testscripts;

import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.base.Base;
import org.testing.pages.Homepage;
import org.testing.pages.LoginPage;
import org.testing.pages.Logoutpage;
import org.testing.utilities.Assertion;
import org.testing.utilities.MyITestListener;
import org.testing.utilities.MyRetryAnalyzer;
import org.testing.utilities.ReportHandling;
import org.testing.utilities.ScreenCapture;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import com.relevantcodes.extentreports.ExtentReports;
import com.relevantcodes.extentreports.ExtentTest;
import com.relevantcodes.extentreports.LogStatus;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(MyITestListener.class)
public class TC2 extends Base {
	
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	public void testcase2() throws InterruptedException, IOException {
		ExtentReports ex = ReportHandling.handlereport();
		ExtentTest tc2 = ex.startTest("TC2");
		LoginPage login=new LoginPage(driver,pr);
		login.signin("sachink.5qu@gmail.com", "Test@211");
		
		Homepage home = new Homepage(driver,pr);
		home.History();
		
		String ExpectedURL="https://www.youtube.com/feed/history";
		String ActualURL=driver.getCurrentUrl();
		Boolean result2 = Assertion.assert2(ExpectedURL.trim(), driver.getCurrentUrl().trim(), "TC2");
		
			if(result2.equals(true)) {
				tc2.log(LogStatus.PASS, "Test case2 is getting pass");
				ScreenCapture.takeScreenshot(driver, "passtestcase2");
				ex.endTest(tc2);
				ex.flush();
	
			} else {
				tc2.log(LogStatus.FAIL, "Test case2 is not getting pass");
				ScreenCapture.takeScreenshot(driver, "failtestcase2");
				ex.endTest(tc2);
				ex.flush();

			}
			
		Logoutpage logout=new Logoutpage(driver,pr);
		logout.SignOut();
		
		
	}

	 
}
