package org.testing.testscripts;

import java.io.IOException;
import java.time.Duration;

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
public class TC3 extends Base {
	@Test(retryAnalyzer = MyRetryAnalyzer.class)
	public void testcase3() throws InterruptedException, IOException {
		ExtentReports ex = ReportHandling.handlereport();
		ExtentTest tc3 = ex.startTest("TC3");
		LoginPage login=new LoginPage(driver,pr);
		login.signin("sachink.5qu@gmail.com", "Test@211");

		Homepage home = new Homepage(driver,pr);
		home.subscriptions();
		String ExpectedURL="https://www.youtube.com/feed/subscriptions";
		String ActualURL=driver.getCurrentUrl();
		Boolean result2 = Assertion.assert2(ExpectedURL.trim(), driver.getCurrentUrl().trim(), "TC3");
		System.out.println(result2);
			if(result2.equals(true)) {
				tc3.log(LogStatus.PASS, "Test case3 is getting pass");
				ScreenCapture.takeScreenshot(driver, "passtestcase3");
				ex.endTest(tc3);
				ex.flush();
	
			} else {
				tc3.log(LogStatus.FAIL, "Test case3 is not getting pass");
				ScreenCapture.takeScreenshot(driver, "failtestcase3");
				ex.endTest(tc3);
				ex.flush();

			}
		Logoutpage logout=new Logoutpage(driver,pr);
		logout.SignOut();
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	


//	@Test(priority=1)
//	public void signin() throws InterruptedException {
//		
//		Actions actions = new Actions(driver);
//		WebElement w = driver.findElement(By.xpath("//div[@id='end']//child::ytd-button-renderer[@class='style-scope ytd-masthead']"));
//		actions.moveToElement(w).getActivePointer();
//	    actions.doubleClick(w);
//     	actions.perform();
//     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
//     	
//    
//	}
//	@Test(priority=2)
//	public void verifylogin() throws InterruptedException {
//		WebElement email=driver.findElement(By.xpath("//div[@class='Xb9hP']/child::input[@type='email']"));
//     	email.sendKeys("sachink.5qu@gmail.com");
//     	WebElement nextbutton1 =driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and contains(text(),'Next')]"));
//     	nextbutton1.click();
//     	Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//     	WebElement password = driver.findElement(By.xpath("//div[@class='Xb9hP']/child::input[@type='password']"));
//     	password.sendKeys("Test@211");
//     	WebElement nextbutton2 = driver.findElement(By.xpath("//span[@class='VfPpkd-vQzf8d' and contains(text(),'Next')]"));
//     	nextbutton2.click();
//     	Thread.sleep(12000);
//     	
//	
//	}
//	
//	@Test(priority=3)
//    public void subscriptions() throws InterruptedException {
//		Actions actions = new Actions(driver);
//		WebElement clicksubscriptions = driver.findElement(By.xpath("//a[@title='Subscriptions']//yt-formatted-string[text()='Subscriptions']"));
//		actions.moveToElement(clicksubscriptions).click().perform();
//		Thread.sleep(5000);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//		wait.until(ExpectedConditions.elementToBeClickable(clicksubscriptions));
//		
//	}
//	
//	@Test(priority=4)
//	public void SignOut() throws InterruptedException {
//		Actions actions=new Actions(driver);
//		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//        WebElement accountmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='end']//child::button[@id='avatar-btn']")));
//		
//		actions.moveToElement(accountmenu).getActivePointer();
//		actions.click(accountmenu);
//     	actions.perform();
//		
//		Thread.sleep(5000);
//		WebElement logout=driver.findElement(By.xpath("//div[@id='items']//child::a[@href='/logout']"));
//		logout.click();
//		
//	}

	
	
	
	
	
}

	
	
	
	
	