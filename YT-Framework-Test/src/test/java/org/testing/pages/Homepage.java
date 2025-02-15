package org.testing.pages;

import java.time.Duration;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Homepage {
	public ChromeDriver driver;
	Properties pr;
	public Homepage(ChromeDriver driver, Properties pr) {
		this.driver=driver;
		this.pr=pr;
		
	}

		public void clickTrending() throws InterruptedException {	
			  
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			  Actions actions = new Actions(driver);
			  WebElement Trendingmenu =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("Trending"))));
			  actions.moveToElement(Trendingmenu).click().perform();	  
			  Thread.sleep(5000);
				
		  }
		
		public void Newsbutton() throws InterruptedException {
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			Actions actions = new Actions(driver);
			WebElement News =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(pr.getProperty("News"))));
			actions.moveToElement(News).click().perform();
			Thread.sleep(5000);
			wait.until(ExpectedConditions.elementToBeClickable(News));
			
		}
		
		public void History() throws InterruptedException {
			Actions actions = new Actions(driver);
			WebElement clickhistory = driver.findElement(By.xpath("//a[@title='History']//yt-formatted-string[text()='History']"));
			actions.moveToElement(clickhistory).click().perform();
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(clickhistory));
			
		}
		
		public void subscriptions() throws InterruptedException {
			Actions actions = new Actions(driver);
			WebElement clicksubscriptions = driver.findElement(By.xpath("//a[@title='Subscriptions']//yt-formatted-string[text()='Subscriptions']"));
			actions.moveToElement(clicksubscriptions).click().perform();
			Thread.sleep(5000);
			WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			wait.until(ExpectedConditions.elementToBeClickable(clicksubscriptions));
			
		}
		
		  public void logo() throws InterruptedException {
			  Actions actions = new Actions(driver);
				  WebElement clicklogo =driver.findElement(By.xpath("//div[@id='container']/div[@id='start']//a[@id='logo']"));
				  actions.moveToElement(clicklogo).click().perform();	  
				  Thread.sleep(5000);
					WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(5));
			  }
			
			public void clicksearch() throws InterruptedException {
				Actions actions = new Actions(driver);
				WebElement searchQuery = driver.findElement(By.xpath("//div[@id='container']/div[@id='search-input']/input[@name='search_query']"));

				actions.getActivePointer();
				searchQuery.sendKeys("Live: IND Vs SL, 2nd ODI | Live Scores & Commentary | India vs Sri Lanka | 2024 Series");
				WebElement searchicon = driver.findElement(By.xpath("//div[@id='center']/descendant::button[@id='search-icon-legacy']"));
				searchicon.click();
				Thread.sleep(5000);
			}
		
		
	}
	
	


