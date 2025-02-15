package org.testing.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Logoutpage {
	public ChromeDriver driver;
	Properties pr;
	public Logoutpage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}
	
	public void SignOut() throws InterruptedException {
		Actions actions=new Actions(driver);
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(3));
        WebElement accountmenu = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//div[@id='end']//child::button[@id='avatar-btn']")));
		
		actions.moveToElement(accountmenu).getActivePointer();
		actions.click(accountmenu);
     	actions.perform();
		
		Thread.sleep(6000);
		WebElement logout=driver.findElement(By.xpath("//div[@id='items']//child::a[@href='/logout']"));
		logout.click();
		
	}
	
	

}
