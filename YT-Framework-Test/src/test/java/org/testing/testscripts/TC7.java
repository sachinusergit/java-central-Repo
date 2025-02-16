package org.testing.testscripts;

import static org.testng.Assert.assertEquals;

import java.sql.Time;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testing.base.Base;
import org.testing.pages.Homepage;
import org.testing.pages.LoginPage;
import org.testing.pages.Logoutpage;
import org.testing.pages.Videoplay;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Test
public class TC7 extends Base {
	
	public void testcase7() throws InterruptedException {
		LoginPage login=new LoginPage(driver,pr);
		login.signin("sachink.5qu@gmail.com", "Test@211");
		Homepage home=new Homepage(driver,pr);
		home.logo();
		home.clicksearch();
		Videoplay video=new Videoplay(driver,pr);
		video.ClickVideo();
		video.library();
		video.clickwatchlater();
		Logoutpage logout=new Logoutpage(driver,pr);
		logout.SignOut();
		
		
		
	}
	

    
}
    
 
    
    