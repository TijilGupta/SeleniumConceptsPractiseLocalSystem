package Tehbo.SeleniumConcepts;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ScreenShot {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));

		//In Previous Version of selenium Screenshot jars is added,but in new of selenium is not added so we have to download it.
		//download Screeshot jars from apache commons io
		//all jar stored in our local system .m2/repositery
		//Jars which help selenium to perform task.

		driver.get("https://www.amazon.in");
        //Step 1) convert webdriver object to TakeScreenShot 
		TakesScreenshot scrshot= ((TakesScreenshot)driver);
		
		//step 2) getScreenShot method  to create image file
		File SrcFile=scrshot.getScreenshotAs(OutputType.FILE);
		
		//copy file to the desired location
		FileUtils.copyFile(SrcFile,new File("C:\\Users\\home\\Desktop\\SeleniumConcepts\\ScreenShot\\TestScreenShot.jpeg"));

        

	}

}
