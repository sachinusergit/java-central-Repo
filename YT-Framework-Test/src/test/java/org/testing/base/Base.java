package org.testing.base;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base {
	
	public ChromeDriver driver;
	public Properties pr;
	@BeforeMethod
	public void init() throws InterruptedException, IOException  {
		
		File f = new File("../YT-Framework-Test/Object.properties");
		FileReader fr = new FileReader(f);
		pr=new Properties();
		pr.load(fr);
		
		    
			WebDriverManager.chromedriver().setup();
			  driver = new ChromeDriver();
			driver.get("https://www.youtube.com");
			driver.manage().window().maximize();
			Thread.sleep(5000);
		}

		@AfterMethod
		public void tearDown() {
		    if (driver != null) {
		        driver.quit();
		    }
		
	}

}
