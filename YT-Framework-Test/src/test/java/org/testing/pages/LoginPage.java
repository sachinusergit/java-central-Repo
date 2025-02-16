package org.testing.pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

public class LoginPage {
	public ChromeDriver driver;
	Properties pr;
	
	public LoginPage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	

	
	public void signin(String email, String password) throws InterruptedException {
		
		Actions actions = new Actions(driver);
		WebElement w = driver.findElement(By.xpath(pr.getProperty("Signin")));
		actions.moveToElement(w).getActivePointer();
	    actions.doubleClick(w);
     	actions.perform();
     	WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(6));
  
		WebElement emaillabel=driver.findElement(By.xpath(pr.getProperty("emailtextbox")));
		emaillabel.clear();
		emaillabel.sendKeys(email);
		
     	WebElement nextbutton1 =driver.findElement(By.xpath(pr.getProperty("NextButton1")));
     	nextbutton1.click();
     	
     	Thread.sleep(5000);
     	
		WebDriverWait wait1 = new WebDriverWait(driver, Duration.ofSeconds(5));
     	WebElement passwordlabel = driver.findElement(By.xpath(pr.getProperty("passwordtextbox")));
     	passwordlabel.clear();
     	passwordlabel.sendKeys(password);
     	
     	WebElement nextbutton2 = driver.findElement(By.xpath(pr.getProperty("Nextbutton2")));
     	nextbutton2.click();
     	Thread.sleep(12000);
     	
	
	}
	
	
	
	

}





