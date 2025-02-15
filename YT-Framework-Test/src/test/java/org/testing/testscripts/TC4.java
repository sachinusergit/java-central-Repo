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
import org.testing.utilities.MyITestListener;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
@Listeners(MyITestListener.class)
public class TC4 extends Base{
	@Test
	public void testcase4() throws InterruptedException {
		LoginPage login=new LoginPage(driver,pr);
		login.signin("sachink.5qu@gmail.com", "Test@211");
		Homepage home=new Homepage(driver,pr);
		home.logo();
		home.clicksearch();
		Videoplay video=new Videoplay(driver,pr);
		video.ClickVideo();
		video.clicklikebutton();
		Logoutpage logout=new Logoutpage(driver,pr);
		logout.SignOut();
		
		
		
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@Test(priority=1)
//public void signin() throws InterruptedException {
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
//	@Test(dependsOnMethods="signin")
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
//     	Thread.sleep(10000);
//	
//	}
//	
//	@Test(priority=3)
//	  public void logo() throws InterruptedException {
//  	  Actions actions = new Actions(driver);
//		  WebElement clicklogo =driver.findElement(By.xpath("//div[@id='container']/div[@id='start']//a[@id='logo']"));
//		  actions.moveToElement(clicklogo).click().perform();	  
//		  Thread.sleep(5000);
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	  }
//	@Test(dependsOnMethods="logo")
//	public void clicksearch() throws InterruptedException {
//		Actions actions = new Actions(driver);
//		WebElement searchQuery = driver.findElement(By.xpath("//div[@id='container']/div[@id='search-input']/input[@name='search_query']"));
//
//		actions.getActivePointer();
//		searchQuery.sendKeys("Live: IND Vs SL, 2nd ODI | Live Scores & Commentary | India vs Sri Lanka | 2024 Series");
//		WebElement searchicon = driver.findElement(By.xpath("//div[@id='center']/descendant::button[@id='search-icon-legacy']"));
//		searchicon.click();
//		Thread.sleep(5000);
//	}
//        
//		@Test(dependsOnMethods="clicksearch")
//		public void ClickVideo()  {
////			Actions actions = new Actions(driver);
////	WebElement video = driver.findElement(By.xpath("//div[@id='dismissible']//child::a[starts-with(@title,'Live: IND Vs SL, 2nd ODI, Colombo')]"));
////    actions.getActivePointer();
////			if (video.isDisplayed() && video.isEnabled()) {
////			    video.click();
//			
//			
//			Actions actions = new Actions(driver);
//				WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//				 //WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dismissible']//child::a[starts-with(@title,'Live: IND Vs SL, 2nd ODI, Colombo')]")));
//				 WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='title-wrapper']/h3/a[starts-with(@title,'Live: IND Vs SL, 2nd ODI, Colombo')]")));
//				actions.getActivePointer();
//                  if (video.isDisplayed() && video.isEnabled()) {
//					    video.click();
//			}
//		}
//			
//			
//		
//
//		@Test(dependsOnMethods="ClickVideo")
//		public void clicklikebutton()  {
//            
//			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
//	        WebElement like = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='actions']//button[@title='I like this']")));
//	       // WebElement unlike = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='actions']//button[@title='Unlike']")));
//	        like.click(); 
//    
//		}
//    
//
//	    	@Test(dependsOnMethods="clicklikebutton")
//	    	public void SignOut() throws InterruptedException {
//	    		Actions actions=new Actions(driver);
//	    		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
//	            WebElement accountmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='end']//child::button[@id='avatar-btn']")));
//	    		
//	    		actions.moveToElement(accountmenu).getActivePointer();
//	    		actions.click(accountmenu);
//	         	actions.perform();
//	    		
//	    		Thread.sleep(5000);
//	    		WebElement logout=driver.findElement(By.xpath("//div[@id='items']//child::a[@href='/logout']"));
//	    		logout.click();
//	    		
//	    	}
//	    	
//	   
//    
}
            
            
            
            


		



	 
	
	
	


