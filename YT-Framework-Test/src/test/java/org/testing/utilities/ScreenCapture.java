package org.testing.utilities;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class ScreenCapture {

	
		public static void takeScreenshot(ChromeDriver driver, String path) throws IOException {
			File f = (driver).getScreenshotAs(OutputType.FILE);
			//FileUtils.copyFile(f, new File("../YT-Framework-Test/src/Screenshot"+path+".jpg"));
			FileUtils.copyFile(f, new File("../YT-Framework-Test/src/test/resources/screenshots"+path+".jpg"));
			
		}
		
		
		
	}


