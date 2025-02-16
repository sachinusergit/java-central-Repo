package org.testing.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Videoplay {
	 public ChromeDriver driver;
	 Properties pr;
	public Videoplay(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
		
	}
	


	
	public void ClickVideo()  {
		
		Actions actions = new Actions(driver);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			 //WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='dismissible']//child::a[starts-with(@title,'Live: IND Vs SL, 2nd ODI, Colombo')]")));
			 WebElement video = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='title-wrapper']/h3/a[starts-with(@title,'Live: IND Vs SL, 2nd ODI, Colombo')]")));
			actions.getActivePointer();
              if (video.isDisplayed() && video.isEnabled()) {
				    video.click();
		}
	}
	
	public void clicklikebutton()  {
        
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
        WebElement like = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='actions']//button[@title='I like this']")));
       // WebElement unlike = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='actions']//button[@title='Unlike']")));
        like.click(); 

	}
	
	public void clicksubscribe() throws InterruptedException {
		Actions actions = new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
		 WebElement subscribebutton = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='owner']//div[@id='subscribe-button']//button[@aria-label='Subscribe to CricTalks.']")));
		 
		 actions.getActivePointer();
         if (subscribebutton.isDisplayed() && subscribebutton.isEnabled()) {
        	 subscribebutton.click();
        	 Thread.sleep(5000);
		
	}
	}
         
         public void library() throws InterruptedException {
 			Actions actions = new Actions(driver);
 			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));

 			WebElement clickchannelbutton2 = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='upload-info']//ytd-channel-name[@class='style-scope ytd-video-owner-renderer']")));
 		     clickchannelbutton2.click();
         		 

         	 }
         
         public void clickwatchlater() throws InterruptedException {    
     		
     		Actions actions = new Actions(driver);
     		actions.sendKeys(Keys.PAGE_DOWN).perform();
     		Thread.sleep(5000);
      
           	WebElement actionmenu = driver.findElement(By.xpath("//a[@title='Live: IND Vs SL, 2nd ODI, Colombo | Live Scores & Commentary | India vs Sri Lanka | Last 6 Over']//ancestor::div[@id='details']//button[@aria-label='Action menu']//div[@style='width: 100%; height: 100%; display: block; fill: currentcolor;']"));
           
           	actionmenu.click();
	
               WebElement  watchlater = driver.findElement(By.xpath("//div[@id='contentWrapper']//yt-formatted-string[contains(text(),'Save to Watch later')]"));
               watchlater.click();
     	}
         
         public void LogoAgain() throws InterruptedException {
       	  Actions actions = new Actions(driver);
     		  WebElement clicklogo =driver.findElement(By.xpath("//div[@id='container']/div[@id='start']//a[@id='logo']"));
     		  actions.moveToElement(clicklogo).click().perform();	  
     		  Thread.sleep(5000);
     			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
     	  }

	
	

}
