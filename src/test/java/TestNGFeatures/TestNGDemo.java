package TestNGFeatures;

import java.io.File;
import java.io.FileInputStream;
import java.time.Duration;

import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;
import junit.framework.Assert;

public class TestNGDemo {
       WebDriver driver;
       @BeforeTest
	public void setUp()
	{
		ChromeOptions chromeOptions = new ChromeOptions();
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver(chromeOptions);

		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(5));
	}
		@Test
		public void GoogleSearch()
		{
			driver.get("https://www.google.com/");
			driver.findElement(By.id("APjFqb")).sendKeys("TestNG");
			driver.findElement(By.className("gNO89b")).click();
			
			//assert is the class where identify either it is pass or fail.
			Assert.assertTrue(true);
		}
		@AfterTest
		public void teardown()
		{
			driver.quit();
		}
		//Report generated bt TestNG index.html 
	}


